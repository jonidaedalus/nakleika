package com.company.nakleika.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.nakleika.entity.client.Client;

@UiController("nakleika_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}