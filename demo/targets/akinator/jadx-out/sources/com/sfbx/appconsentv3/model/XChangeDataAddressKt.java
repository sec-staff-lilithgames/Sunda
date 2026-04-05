package com.sfbx.appconsentv3.model;

import com.sfbx.appconsent.core.model.api.XChangeDataAddress;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class XChangeDataAddressKt {
    public static final com.sfbx.appconsent.core.model.api.XChangeDataAddress convertTo(XChangeDataAddress xChangeDataAddress) {
        e0.checkNotNullParameter(xChangeDataAddress, "<this>");
        return new XChangeDataAddress.Builder(xChangeDataAddress.getCountry(), xChangeDataAddress.getFloor(), xChangeDataAddress.getPostCode(), xChangeDataAddress.getRegion(), xChangeDataAddress.getStreetName(), xChangeDataAddress.getStreetNo(), xChangeDataAddress.getStreetType(), xChangeDataAddress.getTown()).build();
    }
}
