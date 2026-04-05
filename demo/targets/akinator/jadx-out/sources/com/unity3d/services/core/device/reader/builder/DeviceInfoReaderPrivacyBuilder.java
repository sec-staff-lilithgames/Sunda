package com.unity3d.services.core.device.reader.builder;

import com.amazon.device.ads.DtbDeviceRegistration;
import com.inmobi.sdk.InMobiSdk;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.reader.DeviceInfoReaderFilterProvider;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithBehavioralFlag;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithFilter;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithStorageInfo;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import com.unity3d.services.core.device.reader.pii.NonBehavioralFlagReader;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class DeviceInfoReaderPrivacyBuilder extends DeviceInfoReaderBuilder {
    public DeviceInfoReaderPrivacyBuilder(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage, IGameSessionIdReader iGameSessionIdReader) {
        super(configurationReader, privacyConfigStorage, iGameSessionIdReader);
    }

    private JsonFlattenerRules getPrivacyRequestStorageRules() {
        return new JsonFlattenerRules(Arrays.asList(DtbDeviceRegistration.CONFIG_PRIVACY_KEY, InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "unity", "pipl"), Collections.singletonList("value"), Arrays.asList("ts", "exclude", "mode"));
    }

    @Override // com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder
    public IDeviceInfoReader build() {
        Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
        Storage storage2 = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
        Storage storage3 = StorageManager.getStorage(StorageManager.StorageType.MEMORY);
        return new DeviceInfoReaderWithFilter(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithStorageInfo(new DeviceInfoReaderWithBehavioralFlag(buildWithRequestType(InitRequestType.PRIVACY), new NonBehavioralFlagReader(new JsonStorageAggregator(Arrays.asList(storage2, storage, storage3)))), getMediationInfoRules(), storage3), getPrivacyRequestStorageRules(), storage, storage2), new DeviceInfoReaderFilterProvider(storage).getFilterList());
    }
}
