package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.reader.pii.NonBehavioralFlag;
import com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DeviceInfoReaderWithBehavioralFlag implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final NonBehavioralFlagReader _nonBehavioralFlagReader;

    public DeviceInfoReaderWithBehavioralFlag(IDeviceInfoReader iDeviceInfoReader, NonBehavioralFlagReader nonBehavioralFlagReader) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._nonBehavioralFlagReader = nonBehavioralFlagReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        if (this._nonBehavioralFlagReader.getUserNonBehavioralFlag() != NonBehavioralFlag.UNKNOWN) {
            deviceInfoData.put(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, Boolean.valueOf(this._nonBehavioralFlagReader.getUserNonBehavioralFlag() == NonBehavioralFlag.TRUE));
        }
        return deviceInfoData;
    }
}
