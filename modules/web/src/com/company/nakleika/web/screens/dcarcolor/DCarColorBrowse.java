package com.company.nakleika.web.screens.dcarcolor;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.dict.DCarColor;

@UiController("nakleika_DCarColor.browse")
@UiDescriptor("d-car-color-browse.xml")
@LookupComponent("dCarColorsTable")
@LoadDataBeforeShow
public class DCarColorBrowse extends StandardLookup<DCarColor> {
}