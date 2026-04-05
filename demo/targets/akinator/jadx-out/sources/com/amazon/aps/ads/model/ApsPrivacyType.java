package com.amazon.aps.ads.model;

import com.amazon.device.ads.DtbConstants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum ApsPrivacyType {
    IAB_CCPA_US_PRIVACY(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY),
    IAB_CCPA_APS_PRIVACY(DtbConstants.APS_ADMOB_CONST_CCPA_APS_PRIVACY),
    DSA_PRIVACY(DtbConstants.DSA_PARAM_KEY);

    private String strApsPrivacyType;

    ApsPrivacyType(String str) {
        this.strApsPrivacyType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.strApsPrivacyType;
    }
}
