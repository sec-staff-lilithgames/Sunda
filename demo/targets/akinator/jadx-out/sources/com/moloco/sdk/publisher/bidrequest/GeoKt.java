package com.moloco.sdk.publisher.bidrequest;

import com.moloco.sdk.Init$SDKInitResponse;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GeoKt {
    public static final Geo toGeo(Init$SDKInitResponse.Geo geo) {
        e0.checkNotNullParameter(geo, "<this>");
        return new Geo(geo.getCity(), geo.getCountryIso3Code(), geo.getCountryIso2Code(), geo.getZipCode(), Float.valueOf(geo.getLatitude()), Float.valueOf(geo.getLongitude()));
    }
}
