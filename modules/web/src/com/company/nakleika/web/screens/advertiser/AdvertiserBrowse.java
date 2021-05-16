package com.company.nakleika.web.screens.advertiser;

import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.FileDescriptorResource;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.advertiser.Advertiser;

import javax.inject.Inject;

@UiController("nakleika_Advertiser.browse")
@UiDescriptor("advertiser-browse.xml")
@LookupComponent("advertisersTable")
@LoadDataBeforeShow
public class AdvertiserBrowse extends StandardLookup<Advertiser> {
    @Inject
    protected GroupTable<Advertiser> advertisersTable;

    @Inject
    protected UiComponents uiComponents;

    @Subscribe
    protected void onInit(InitEvent event) {
        advertisersTable.addGeneratedColumn(
                "image",
                this::renderAvatarImageComponent
        );
    }

    private Component renderAvatarImageComponent(Advertiser advertiser) {
        FileDescriptor imageFile = advertiser.getImage();
        if (imageFile == null) {
            return null;
        }
        Image image = smallAvatarImage();
        image.setSource(FileDescriptorResource.class)
                .setFileDescriptor(imageFile);

        return image;
    }

    private Image smallAvatarImage() {
        Image image = uiComponents.create(Image.class);
        image.setScaleMode(Image.ScaleMode.CONTAIN);
        image.setHeight("40");
        image.setWidth("40");
        image.setStyleName("avatar-icon-small");
        return image;
    }
}