package com.company.nakleika.web.screens.dcarmodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.dict.DCarModel;

@UiController("nakleika_DCarModel.browse")
@UiDescriptor("d-car-model-browse.xml")
@LookupComponent("dCarModelsTable")
@LoadDataBeforeShow
public class DCarModelBrowse extends StandardLookup<DCarModel> {
}