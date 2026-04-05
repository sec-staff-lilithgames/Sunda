package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.properties.Session;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DeviceInfoReaderWithSessionId implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final Session _session;

    public DeviceInfoReaderWithSessionId(IDeviceInfoReader iDeviceInfoReader, Session session) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._session = session;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put(JsonStorageKeyNames.SESSION_ID_KEY, this._session.getId());
        return deviceInfoData;
    }
}
