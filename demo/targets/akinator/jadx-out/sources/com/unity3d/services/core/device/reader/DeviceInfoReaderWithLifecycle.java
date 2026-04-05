package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.lifecycle.LifecycleCache;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DeviceInfoReaderWithLifecycle implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final LifecycleCache _lifecycleCache;

    public DeviceInfoReaderWithLifecycle(IDeviceInfoReader iDeviceInfoReader, LifecycleCache lifecycleCache) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._lifecycleCache = lifecycleCache;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put("appActive", Boolean.valueOf(this._lifecycleCache.isAppActive()));
        return deviceInfoData;
    }
}
