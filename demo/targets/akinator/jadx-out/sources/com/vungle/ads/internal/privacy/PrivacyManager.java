package com.vungle.ads.internal.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.Y1;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import tu.a0;
import tu.t;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PrivacyManager {
    private static PrivacyConsent ccpaConsent;
    private static FilePreferences filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    private static SharedPreferences sharedPreferences;
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum DeviceIdAllowed {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceIdAllowed.values().length];
            iArr[DeviceIdAllowed.DISABLE_ID.ordinal()] = 1;
            iArr[DeviceIdAllowed.FALLBACK.ordinal()] = 2;
            iArr[DeviceIdAllowed.ALLOW_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfigPayload.IABSettings.TcfStatus.values().length];
            iArr2[ConfigPayload.IABSettings.TcfStatus.DISABLE_ID.ordinal()] = 1;
            iArr2[ConfigPayload.IABSettings.TcfStatus.ALLOW_ID.ordinal()] = 2;
            iArr2[ConfigPayload.IABSettings.TcfStatus.LEGACY.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private PrivacyManager() {
    }

    private final void saveCcpaConsent(PrivacyConsent privacyConsent) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.CCPA_CONSENT_STATUS, privacyConsent.getValue())) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    private final void saveCoppaConsent(boolean z10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put("is_coppa", z10)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferencesPut2;
        FilePreferences filePreferencesPut3;
        FilePreferences filePreferencesPut4;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.GDPR_CONSENT_STATUS, str)) == null || (filePreferencesPut2 = filePreferencesPut.put(Cookie.GDPR_CONSENT_SOURCE, str2)) == null || (filePreferencesPut3 = filePreferencesPut2.put(Cookie.GDPR_CONSENT_MESSAGE_VERSION, str3)) == null || (filePreferencesPut4 = filePreferencesPut3.put(Cookie.GDPR_CONSENT_TIMESTAMP, j10)) == null) {
            return;
        }
        filePreferencesPut4.apply();
    }

    public final DeviceIdAllowed allowDeviceIDFromTCF() {
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (!e0.areEqual(gdprAppliesFromPreferences, Boolean.TRUE)) {
            return gdprAppliesFromPreferences == null ? DeviceIdAllowed.FALLBACK : DeviceIdAllowed.ALLOW_ID;
        }
        ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return DeviceIdAllowed.DISABLE_ID;
            }
            if (i10 == 2) {
                return DeviceIdAllowed.ALLOW_ID;
            }
            if (i10 != 3) {
                throw new t();
            }
        }
        return DeviceIdAllowed.FALLBACK;
    }

    public final String getCcpaStatus() {
        String value;
        PrivacyConsent privacyConsent = ccpaConsent;
        return (privacyConsent == null || (value = privacyConsent.getValue()) == null) ? PrivacyConsent.UNKNOWN.getValue() : value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final long getConsentTimestamp() {
        Long l9 = gdprConsentTimestamp;
        if (l9 != null) {
            return l9.longValue();
        }
        return 0L;
    }

    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        return atomicReference.get() == null ? COPPA.COPPA_NOTSET : e0.areEqual(atomicReference.get(), Boolean.TRUE) ? COPPA.COPPA_ENABLED : e0.areEqual(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    public final Boolean getDisableAdId$vungle_ads_release() {
        return disableAdId.get();
    }

    public final Boolean getGdprAppliesFromPreferences() {
        Object objM7131constructorimpl;
        Object objM7131constructorimpl2;
        Integer numValueOf;
        String string;
        try {
            int i10 = z.f87419c;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            objM7131constructorimpl = z.m7131constructorimpl(sharedPreferences2 != null ? Integer.valueOf(sharedPreferences2.getInt("IABTCF_gdprApplies", -1)) : null);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7134exceptionOrNullimpl(objM7131constructorimpl) != null) {
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 == null || (string = sharedPreferences3.getString("IABTCF_gdprApplies", Y1.f35726f)) == null) {
                    numValueOf = null;
                } else {
                    e0.checkNotNullExpressionValue(string, "getString(IABTCF_GDPR_APPLIES, \"-1\")");
                    numValueOf = Integer.valueOf(Integer.parseInt(string));
                }
                objM7131constructorimpl2 = z.m7131constructorimpl(numValueOf);
            } catch (Throwable th3) {
                int i12 = z.f87419c;
                objM7131constructorimpl2 = z.m7131constructorimpl(a0.createFailure(th3));
            }
            objM7131constructorimpl = objM7131constructorimpl2;
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        Integer num = (Integer) objM7131constructorimpl;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String getIABTCFString() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String string = sharedPreferences2 != null ? sharedPreferences2.getString("IABTCF_TCString", "") : null;
        return string == null ? "" : string;
    }

    public final String getPreviousTcfToken() {
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null) {
            return filePreferences2.getString("previous_tcf_token", "");
        }
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public final synchronized void init(Context context) {
        Throwable th2;
        AtomicBoolean atomicBoolean;
        try {
            try {
                e0.checkNotNullParameter(context, "context");
                atomicBoolean = initialized;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            th2 = th;
            throw th2;
        }
        try {
            if (atomicBoolean.get()) {
                Logger.Companion.w("PrivacyManager", "PrivacyManager already initialized");
                return;
            }
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            FilePreferences filePreferences2 = (FilePreferences) ServiceLocator.Companion.getInstance(context).getService(FilePreferences.class);
            filePreferences = filePreferences2;
            AtomicReference<Boolean> atomicReference = disableAdId;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                saveDisableAdId(bool.booleanValue());
            } else {
                Boolean bool2 = filePreferences2.getBoolean(Cookie.COPPA_DISABLE_AD_ID);
                if (bool2 != null) {
                    atomicReference.set(bool2);
                }
            }
            String str = gdprConsent;
            if (str != null) {
                String str2 = gdprConsentSource;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = gdprConsentMessageVersion;
                if (str3 == null) {
                    str3 = "";
                }
                Long l9 = gdprConsentTimestamp;
                saveGdprConsent(str, str2, str3, l9 != null ? l9.longValue() : 0L);
            } else {
                String string = filePreferences2.getString(Cookie.GDPR_CONSENT_STATUS);
                PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
                if (e0.areEqual(string, privacyConsent.getValue())) {
                    string = privacyConsent.getValue();
                } else {
                    PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                    if (e0.areEqual(string, privacyConsent2.getValue())) {
                        string = privacyConsent2.getValue();
                    }
                }
                gdprConsent = string;
                gdprConsentSource = filePreferences2.getString(Cookie.GDPR_CONSENT_SOURCE);
                gdprConsentMessageVersion = filePreferences2.getString(Cookie.GDPR_CONSENT_MESSAGE_VERSION);
                gdprConsentTimestamp = Long.valueOf(filePreferences2.getLong(Cookie.GDPR_CONSENT_TIMESTAMP, 0L));
            }
            PrivacyConsent privacyConsent3 = ccpaConsent;
            if (privacyConsent3 != null) {
                saveCcpaConsent(privacyConsent3);
            } else {
                String string2 = filePreferences2.getString(Cookie.CCPA_CONSENT_STATUS);
                PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
                if (!e0.areEqual(privacyConsent4.getValue(), string2)) {
                    privacyConsent4 = PrivacyConsent.OPT_IN;
                }
                ccpaConsent = privacyConsent4;
            }
            AtomicReference<Boolean> atomicReference2 = coppaStatus;
            Boolean bool3 = atomicReference2.get();
            if (bool3 != null) {
                saveCoppaConsent(bool3.booleanValue());
            } else {
                Boolean bool4 = filePreferences2.getBoolean("is_coppa");
                if (bool4 != null) {
                    atomicReference2.set(bool4);
                }
            }
            atomicBoolean.set(true);
        } catch (Throwable th5) {
            th2 = th5;
            throw th2;
        }
    }

    public final void saveDisableAdId(boolean z10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.COPPA_DISABLE_AD_ID, z10)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void setPreviousTcfToken(String str) {
        FilePreferences filePreferences2;
        FilePreferences filePreferencesPut;
        if (str == null || str.length() == 0 || (filePreferences2 = filePreferences) == null || (filePreferencesPut = filePreferences2.put("previous_tcf_token", str)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (e0.areEqual(getPreviousTcfToken(), iABTCFString)) {
            return false;
        }
        setPreviousTcfToken(iABTCFString);
        return true;
    }

    public final boolean shouldSendAdIds() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new t();
            }
            Boolean disableAdId$vungle_ads_release = getDisableAdId$vungle_ads_release();
            if (disableAdId$vungle_ads_release != null && !disableAdId$vungle_ads_release.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldSendTCFString() {
        if (!e0.areEqual(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            return false;
        }
        ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1 || i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new t();
            }
        }
        return shouldReturnTrueForLegacy$vungle_ads_release();
    }

    public final void updateCcpaConsent(PrivacyConsent consent) {
        e0.checkNotNullParameter(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final void updateCoppaConsent(boolean z10) {
        coppaStatus.set(Boolean.valueOf(z10));
        saveCoppaConsent(z10);
    }

    public final void updateDisableAdId(boolean z10) {
        disableAdId.set(Boolean.valueOf(z10));
        saveDisableAdId(z10);
    }

    public final void updateGdprConsent(String consent, String source, String str) {
        e0.checkNotNullParameter(consent, "consent");
        e0.checkNotNullParameter(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = str;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        gdprConsentTimestamp = Long.valueOf(jCurrentTimeMillis);
        String str2 = gdprConsentMessageVersion;
        if (str2 == null) {
            str2 = "";
        }
        saveGdprConsent(consent, source, str2, jCurrentTimeMillis);
    }
}
