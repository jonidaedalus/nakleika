package com.company.nakleika.entity.advertiser;

import com.company.nakleika.entity.advertisement.Advertisement;
import com.company.nakleika.entity.client.Client;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "NAKLEIKA_ADVERTISER")
@Entity(name = "nakleika_Advertiser")
@NamePattern("%s|fullName")
public class Advertiser extends Client {
    private static final long serialVersionUID = 2695293118179390206L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IMAGE_ID")
    private FileDescriptor image;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "advertiser")
    private List<Advertisement> advertisements;

    public void setAdvertisements(List<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

    public List<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public FileDescriptor getImage() {
        return image;
    }

    public void setImage(FileDescriptor image) {
        this.image = image;
    }
}