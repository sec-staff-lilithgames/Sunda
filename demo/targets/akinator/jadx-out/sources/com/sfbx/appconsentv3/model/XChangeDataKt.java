package com.sfbx.appconsentv3.model;

import com.sfbx.appconsent.core.model.api.XChangeUserData;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class XChangeDataKt {
    public static final XChangeUserData convertTo(XChangeData xChangeData) {
        e0.checkNotNullParameter(xChangeData, "<this>");
        XChangeUserData.Builder builder = new XChangeUserData.Builder(null, null, null, null, xChangeData.getTimestampCollect(), null, 47, null);
        String email = xChangeData.getEmail();
        if (email != null) {
            builder.email(email);
        }
        String phone = xChangeData.getPhone();
        if (phone != null) {
            builder.phoneNumber(phone);
        }
        String externalId = xChangeData.getExternalId();
        if (externalId != null) {
            builder.externalId(externalId);
        }
        XChangeDataAddress address = xChangeData.getAddress();
        if (address != null) {
            builder.xChangeInfoAddress(XChangeDataAddressKt.convertTo(address));
        }
        String unstructuredData = xChangeData.getUnstructuredData();
        if (unstructuredData != null) {
            builder.unstructuredData(unstructuredData);
        }
        return builder.build();
    }
}
