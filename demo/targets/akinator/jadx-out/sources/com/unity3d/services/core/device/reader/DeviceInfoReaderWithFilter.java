package com.unity3d.services.core.device.reader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DeviceInfoReaderWithFilter implements IDeviceInfoReader {
    IDeviceInfoReader _deviceInfoReader;
    List<String> _keysToExclude;

    public DeviceInfoReaderWithFilter(IDeviceInfoReader iDeviceInfoReader, List<String> list) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._keysToExclude = list;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        List<String> list = this._keysToExclude;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                deviceInfoData.remove(it.next());
            }
        }
        return deviceInfoData;
    }
}
