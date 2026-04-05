package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    List<String> getLocaleList();

    String getOrientation();

    int getRingerMode();

    Flow<VolumeSettingsChange> getVolumeSettingsChange();

    boolean hasInternet();
}
