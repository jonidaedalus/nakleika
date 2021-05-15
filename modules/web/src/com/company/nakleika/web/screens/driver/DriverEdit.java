package com.company.nakleika.web.screens.driver;

import com.company.nakleika.entity.car.Car;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.FileDescriptorResource;
import com.haulmont.cuba.gui.components.FileUploadField;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.data.DataSupplier;
import com.haulmont.cuba.gui.export.ExportDisplay;
import com.haulmont.cuba.gui.export.ExportFormat;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstancePropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.driver.Driver;
import com.haulmont.cuba.gui.upload.FileUploadingAPI;

import javax.inject.Inject;

@UiController("nakleika_Driver.edit")
@UiDescriptor("driver-edit.xml")
@EditedEntityContainer("driverDc")
@LoadDataBeforeShow
public class DriverEdit extends StandardEditor<Driver> {
    @Inject
    private InstanceContainer<Driver> driverDc;

    @Inject
    private Metadata metadata;
    @Inject
    private DataContext dataContext;
    @Inject
    private ExportDisplay exportDisplay;
    @Inject
    private Image image;
    @Inject
    private FileUploadField uploadField;
    @Inject
    private FileUploadingAPI fileUploadingAPI;
    @Inject
    private InstancePropertyContainer<Car> carDc;
    @Inject
    private Button downloadImageBtn;
    @Inject
    private Button clearImageBtn;
    @Inject
    private DataManager dataManager;

    @Subscribe
    public void onInit(InitEvent event) {
        uploadField.addFileUploadSucceedListener(uploadSucceedEvent -> {
            FileDescriptor fd = uploadField.getFileDescriptor();
            try {
                fileUploadingAPI.putFileIntoStorage(uploadField.getFileId(), fd);
            } catch (FileStorageException e) {
                throw new RuntimeException("Error saving file to FileStorage", e);
            }
            getEditedEntity().getCar().setImageFile(dataManager.commit(fd));
            displayImage();
        });

//        uploadField.addFileUploadErrorListener(event ->
//                showNotification("File upload error", NotificationType.HUMANIZED));

        carDc.addItemPropertyChangeListener(carChangeEvent -> {
            if ("imageFile".equals(carChangeEvent.getProperty()))
                updateImageButtons(carChangeEvent.getValue() != null);
        });
    }

    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPostCommit(DataContext.PostCommitEvent event) {
        displayImage();
        updateImageButtons(getEditedEntity().getCar().getImageFile() != null);
    }
    

    private void updateImageButtons(boolean enable) {
        downloadImageBtn.setEnabled(enable);
        clearImageBtn.setEnabled(enable);
    }

    @Subscribe
    protected void onInitEntity(InitEntityEvent<Driver> event) {
        Driver driver = event.getEntity();
        Car driverCar = createCar();
        driver.setCar(driverCar);
    }

    private Car createCar() {
        return dataContext.merge(metadata.create(Car.class));
    }

    public void onDownloadImageBtnClick() {
        if (getEditedEntity().getCar().getImageFile() != null)
            exportDisplay.show(getEditedEntity().getCar().getImageFile(), ExportFormat.OCTET_STREAM);
    }

    public void onClearImageBtnClick() {
        getEditedEntity().getCar().setImageFile(null);
        displayImage();
    }

    private void displayImage() {
        if (getEditedEntity().getCar().getImageFile() != null) {
            image.setSource(FileDescriptorResource.class).setFileDescriptor(getEditedEntity().getCar().getImageFile());
            image.setVisible(true);
        } else {
            image.setVisible(false);
        }
    }
}