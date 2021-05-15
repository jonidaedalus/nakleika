package com.company.nakleika.entity.advertiser;

import com.company.nakleika.entity.client.Client;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "NAKLEIKA_ADVERTISER")
@Entity(name = "nakleika_Advertiser")
public class Advertiser extends Client {
    private static final long serialVersionUID = 2695293118179390206L;
}