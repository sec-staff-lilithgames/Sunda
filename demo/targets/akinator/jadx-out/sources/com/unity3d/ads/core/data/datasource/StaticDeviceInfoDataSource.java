package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, d<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> dVar);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(d<? super String> dVar);

    Object getIdfi(d<? super String> dVar);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();

    Object getUnityBuildGuid(d<? super String> dVar);
}
