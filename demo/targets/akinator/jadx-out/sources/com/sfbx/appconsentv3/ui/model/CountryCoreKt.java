package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.api.proto.CountryProto;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CountryCoreKt {
    public static final CountryCore convertTo(CountryProto countryProto) {
        e0.checkNotNullParameter(countryProto, "<this>");
        return new CountryCore(countryProto.getCode(), countryProto.getGdpr());
    }
}
