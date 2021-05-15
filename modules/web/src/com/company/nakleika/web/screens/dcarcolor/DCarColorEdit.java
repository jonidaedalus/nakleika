package com.company.nakleika.web.screens.dcarcolor;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.dict.DCarColor;

@UiController("nakleika_DCarColor.edit")
@UiDescriptor("d-car-color-edit.xml")
@EditedEntityContainer("dCarColorDc")
@LoadDataBeforeShow
public class DCarColorEdit extends StandardEditor<DCarColor> {
}