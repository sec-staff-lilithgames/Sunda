package com.sfbx.appconsent.core.model.reducer;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorUrlKt {
    public static final com.sfbx.appconsent.core.model.VendorUrl toCore(VendorUrl vendorUrl) {
        e0.checkNotNullParameter(vendorUrl, "<this>");
        return new com.sfbx.appconsent.core.model.VendorUrl(vendorUrl.getPrivacy(), vendorUrl.getLegintClaim());
    }
}
