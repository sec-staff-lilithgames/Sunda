package com.unity3d.ads.metadata;

import android.content.Context;
import ao.kwoC.zAQQWzBxnS;
import com.amazon.device.ads.DTBMetricReport;
import com.unity3d.services.core.device.StorageManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MediationMetaData extends MetaData {
    public static final String KEY_MISSED_IMPRESSION_ORDINAL = "missedImpressionOrdinal";
    public static final String KEY_NAME = "name";
    public static final String KEY_ORDINAL = "ordinal";
    public static final String KEY_VERSION = "version";

    public MediationMetaData(Context context) {
        super(context);
        setCategory(DTBMetricReport.ADSERVER);
    }

    @Override // com.unity3d.ads.metadata.MetaData
    public StorageManager.StorageType getStorageType() {
        return StorageManager.StorageType.MEMORY;
    }

    public void setMissedImpressionOrdinal(int i10) {
        set(KEY_MISSED_IMPRESSION_ORDINAL, Integer.valueOf(i10));
    }

    public void setName(String str) {
        set("name", str);
    }

    public void setOrdinal(int i10) {
        set(KEY_ORDINAL, Integer.valueOf(i10));
    }

    public void setVersion(String str) {
        set(zAQQWzBxnS.jliuJnvlhiYSRxP, str);
    }
}
