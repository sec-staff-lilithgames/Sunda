package com.vungle.ads;

import com.ironsource.Ib;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VunglePrivacySettings {
    public static final VunglePrivacySettings INSTANCE = new VunglePrivacySettings();

    private VunglePrivacySettings() {
    }

    public static final String getCCPAStatus() {
        return PrivacyManager.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return PrivacyManager.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return PrivacyManager.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return PrivacyManager.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return PrivacyManager.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return PrivacyManager.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z10) {
        PrivacyManager.INSTANCE.updateCcpaConsent(z10 ? PrivacyConsent.OPT_IN : PrivacyConsent.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean z10) {
        PrivacyManager.INSTANCE.updateCoppaConsent(z10);
    }

    public static final void setGDPRStatus(boolean z10, String str) {
        PrivacyManager.INSTANCE.updateGdprConsent(z10 ? PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue(), Ib.f34673b, str);
    }
}
