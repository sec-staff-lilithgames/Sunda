package com.sfbx.appconsentv3.ui.domain.model;

import com.sfbx.appconsent.core.model.DataCategoryCore;
import com.sfbx.appconsent.core.model.Vendor;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorDetailsDomain {
    private final List<DataCategoryCore> dataCategories;
    private final Vendor vendor;

    public VendorDetailsDomain(List<DataCategoryCore> dataCategories, Vendor vendor) {
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        e0.checkNotNullParameter(vendor, "vendor");
        this.dataCategories = dataCategories;
        this.vendor = vendor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VendorDetailsDomain copy$default(VendorDetailsDomain vendorDetailsDomain, List list, Vendor vendor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = vendorDetailsDomain.dataCategories;
        }
        if ((i10 & 2) != 0) {
            vendor = vendorDetailsDomain.vendor;
        }
        return vendorDetailsDomain.copy(list, vendor);
    }

    public final List<DataCategoryCore> component1() {
        return this.dataCategories;
    }

    public final Vendor component2() {
        return this.vendor;
    }

    public final VendorDetailsDomain copy(List<DataCategoryCore> dataCategories, Vendor vendor) {
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        e0.checkNotNullParameter(vendor, "vendor");
        return new VendorDetailsDomain(dataCategories, vendor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VendorDetailsDomain)) {
            return false;
        }
        VendorDetailsDomain vendorDetailsDomain = (VendorDetailsDomain) obj;
        return e0.areEqual(this.dataCategories, vendorDetailsDomain.dataCategories) && e0.areEqual(this.vendor, vendorDetailsDomain.vendor);
    }

    public final List<DataCategoryCore> getDataCategories() {
        return this.dataCategories;
    }

    public final Vendor getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        return this.vendor.hashCode() + (this.dataCategories.hashCode() * 31);
    }

    public String toString() {
        return "VendorDetailsDomain(dataCategories=" + this.dataCategories + ", vendor=" + this.vendor + ')';
    }
}
