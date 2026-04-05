package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    MutableStateFlow<AllowedPiiOuterClass.AllowedPii> getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(d<? super ByteString> dVar);

    Object getAuidString(d<? super String> dVar);

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(d<? super String> dVar);

    List<String> getLocaleList();

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    Object getUnityBuildGuid(d<? super String> dVar);

    Flow<VolumeSettingsChange> getVolumeSettingsChange();

    Object staticDeviceInfo(d<? super StaticDeviceInfoOuterClass.StaticDeviceInfo> dVar);
}
