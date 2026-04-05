package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class PiiTrackingStatusReader {
    private final IJsonStorageReader _jsonStorageReader;
    private final NonBehavioralFlagReader _nonBehavioralFlagReader;

    public PiiTrackingStatusReader(IJsonStorageReader iJsonStorageReader) {
        this._jsonStorageReader = iJsonStorageReader;
        this._nonBehavioralFlagReader = new NonBehavioralFlagReader(iJsonStorageReader);
    }

    private PiiPrivacyMode getSpmPrivacyMode() {
        return getPrivacyMode(JsonStorageKeyNames.PRIVACY_SPM_KEY);
    }

    private PiiPrivacyMode getUserPrivacyMode() {
        return getPrivacyMode(JsonStorageKeyNames.PRIVACY_MODE_KEY);
    }

    public PiiPrivacyMode getPrivacyMode() {
        PiiPrivacyMode userPrivacyMode = getUserPrivacyMode();
        PiiPrivacyMode piiPrivacyMode = PiiPrivacyMode.NULL;
        if (userPrivacyMode == piiPrivacyMode && getSpmPrivacyMode() == piiPrivacyMode) {
            return piiPrivacyMode;
        }
        PiiPrivacyMode userPrivacyMode2 = getUserPrivacyMode();
        PiiPrivacyMode piiPrivacyMode2 = PiiPrivacyMode.APP;
        if (userPrivacyMode2 != piiPrivacyMode2 && getSpmPrivacyMode() != piiPrivacyMode2) {
            PiiPrivacyMode userPrivacyMode3 = getUserPrivacyMode();
            piiPrivacyMode2 = PiiPrivacyMode.MIXED;
            if (userPrivacyMode3 != piiPrivacyMode2 && getSpmPrivacyMode() != piiPrivacyMode2) {
                PiiPrivacyMode userPrivacyMode4 = getUserPrivacyMode();
                piiPrivacyMode2 = PiiPrivacyMode.NONE;
                if (userPrivacyMode4 != piiPrivacyMode2 && getSpmPrivacyMode() != piiPrivacyMode2) {
                    return PiiPrivacyMode.UNDEFINED;
                }
            }
        }
        return piiPrivacyMode2;
    }

    public boolean getUserNonBehavioralFlag() {
        return this._nonBehavioralFlagReader.getUserNonBehavioralFlag() == NonBehavioralFlag.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.unity3d.services.core.device.reader.pii.PiiPrivacyMode getPrivacyMode(java.lang.String r2) {
        /*
            r1 = this;
            com.unity3d.services.core.misc.IJsonStorageReader r0 = r1._jsonStorageReader
            if (r0 == 0) goto Lf
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r2 = (java.lang.String) r2
            goto L10
        Lf:
            r2 = 0
        L10:
            com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r2 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.getPiiPrivacyMode(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.reader.pii.PiiTrackingStatusReader.getPrivacyMode(java.lang.String):com.unity3d.services.core.device.reader.pii.PiiPrivacyMode");
    }
}
