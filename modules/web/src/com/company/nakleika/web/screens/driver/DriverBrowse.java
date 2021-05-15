package com.company.nakleika.web.screens.driver;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.driver.Driver;

@UiController("nakleika_Driver.browse")
@UiDescriptor("driver-browse.xml")
@LookupComponent("driversTable")
@LoadDataBeforeShow
public class DriverBrowse extends StandardLookup<Driver> {
}