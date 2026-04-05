package com.sfbx.appconsentv3.ui.domain;

import com.sfbx.appconsent.core.AppConsentCore;
import com.sfbx.appconsent.core.model.Vendor;
import com.sfbx.appconsentv3.ui.domain.model.VendorDetailsDomain;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetVendorDetailsUseCaseImpl implements GetVendorDetailsUseCase {
    private final AppConsentCore appConsentCore;

    public GetVendorDetailsUseCaseImpl(AppConsentCore appConsentCore) {
        e0.checkNotNullParameter(appConsentCore, "appConsentCore");
        this.appConsentCore = appConsentCore;
    }

    @Override // com.sfbx.appconsentv3.ui.domain.ComplexDirectUseCase
    public /* bridge */ /* synthetic */ VendorDetailsDomain get(Integer num) {
        return get(num.intValue());
    }

    public VendorDetailsDomain get(int i10) {
        for (Vendor vendor : this.appConsentCore.getVendors()) {
            if (vendor.getId() == i10) {
                return new VendorDetailsDomain(this.appConsentCore.getDataCategoriesByDataDeclarations(vendor.getDataDeclarations()), vendor);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
