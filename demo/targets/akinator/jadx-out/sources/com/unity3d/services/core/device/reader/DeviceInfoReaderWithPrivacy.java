package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.pii.PiiDataProvider;
import com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DeviceInfoReaderWithPrivacy implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final PiiDataProvider _piiDataProvider;
    private final PiiTrackingStatusReader _piiTrackingStatusReader;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public DeviceInfoReaderWithPrivacy(IDeviceInfoReader iDeviceInfoReader, PrivacyConfigStorage privacyConfigStorage, PiiDataProvider piiDataProvider, PiiTrackingStatusReader piiTrackingStatusReader) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._privacyConfigStorage = privacyConfigStorage;
        this._piiDataProvider = piiDataProvider;
        this._piiTrackingStatusReader = piiTrackingStatusReader;
    }

    private Map<String, Object> getPiiAttributesFromDevice() {
        HashMap map = new HashMap();
        String advertisingTrackingId = this._piiDataProvider.getAdvertisingTrackingId();
        if (advertisingTrackingId != null) {
            map.put(JsonStorageKeyNames.ADVERTISING_TRACKING_ID_NORMALIZED_KEY, advertisingTrackingId);
        }
        return map;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        PrivacyConfigStorage privacyConfigStorage = this._privacyConfigStorage;
        if (privacyConfigStorage != null && privacyConfigStorage.getPrivacyConfig() != null) {
            if (this._privacyConfigStorage.getPrivacyConfig().allowedToSendPii()) {
                deviceInfoData.putAll(getPiiAttributesFromDevice());
            }
            if (this._privacyConfigStorage.getPrivacyConfig().shouldSendNonBehavioral()) {
                deviceInfoData.put(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, Boolean.valueOf(this._piiTrackingStatusReader.getUserNonBehavioralFlag()));
            }
        }
        return deviceInfoData;
    }
}
