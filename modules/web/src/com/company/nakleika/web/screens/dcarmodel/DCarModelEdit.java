package com.company.nakleika.web.screens.dcarmodel;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.dict.DCarModel;

@UiController("nakleika_DCarModel.edit")
@UiDescriptor("d-car-model-edit.xml")
@EditedEntityContainer("dCarModelDc")
@LoadDataBeforeShow
public class DCarModelEdit extends StandardEditor<DCarModel> {
}