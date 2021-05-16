package com.company.nakleika.web.screens.advertisement;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.advertisement.Advertisement;

@UiController("nakleika_Advertisement.browse")
@UiDescriptor("advertisement-browse.xml")
@LookupComponent("advertisementsTable")
@LoadDataBeforeShow
public class AdvertisementBrowse extends StandardLookup<Advertisement> {
}