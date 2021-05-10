package com.company.nakleika.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.client.Client;

@UiController("nakleika_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}