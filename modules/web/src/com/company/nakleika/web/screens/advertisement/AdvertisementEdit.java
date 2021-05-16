package com.company.nakleika.web.screens.advertisement;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.advertisement.Advertisement;

@UiController("nakleika_Advertisement.edit")
@UiDescriptor("advertisement-edit.xml")
@EditedEntityContainer("advertisementDc")
@LoadDataBeforeShow
public class AdvertisementEdit extends StandardEditor<Advertisement> {
}