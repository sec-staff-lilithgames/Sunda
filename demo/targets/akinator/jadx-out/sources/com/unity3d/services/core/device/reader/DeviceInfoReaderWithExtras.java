package com.unity3d.services.core.device.reader;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DeviceInfoReaderWithExtras implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final Map<String, String> _extras;

    public DeviceInfoReaderWithExtras(IDeviceInfoReader iDeviceInfoReader, Map<String, String> map) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._extras = map;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, String> map;
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        if (deviceInfoData != null && (map = this._extras) != null) {
            deviceInfoData.putAll(map);
        }
        return deviceInfoData;
    }
}
