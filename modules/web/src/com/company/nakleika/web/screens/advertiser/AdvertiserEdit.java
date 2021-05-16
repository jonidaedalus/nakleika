package com.company.nakleika.web.screens.advertiser;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.advertiser.Advertiser;

@UiController("nakleika_Advertiser.edit")
@UiDescriptor("advertiser-edit.xml")
@EditedEntityContainer("advertiserDc")
@LoadDataBeforeShow
public class AdvertiserEdit extends StandardEditor<Advertiser> {
}