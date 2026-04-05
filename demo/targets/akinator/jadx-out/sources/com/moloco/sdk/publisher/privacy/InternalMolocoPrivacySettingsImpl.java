package com.moloco.sdk.publisher.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InternalMolocoPrivacySettingsImpl implements InternalMolocoPrivacySettings {
    public static final int $stable = 8;
    private final Context context;

    public InternalMolocoPrivacySettingsImpl(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final Boolean gdprApplies(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (!defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
            return null;
        }
        try {
            int i10 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            if (i10 == 0) {
                return Boolean.FALSE;
            }
            if (i10 != 1) {
                return null;
            }
            return Boolean.TRUE;
        } catch (ClassCastException unused) {
            return Boolean.valueOf(defaultSharedPreferences.getBoolean("IABTCF_gdprApplies", false));
        }
    }

    private final String getTCFConsent(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABTCF_TCString", null);
        if (string == null || n0.isBlank(string)) {
            return null;
        }
        return string;
    }

    private final String getUSPrivacyConsentString(Context context, String str) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABUSPrivacy_String", null);
        return (string == null || n0.isBlank(string)) ? str : string;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings
    public MolocoPrivacy.PrivacySettings getUpdatedPrivacySettings(MolocoPrivacy.PrivacySettings privacySettings) {
        e0.checkNotNullParameter(privacySettings, "privacySettings");
        Boolean boolGdprApplies = gdprApplies(this.context);
        if (boolGdprApplies == null) {
            boolGdprApplies = privacySettings.isUserConsent();
        }
        return new MolocoPrivacy.PrivacySettings(boolGdprApplies, privacySettings.isAgeRestrictedUser(), privacySettings.isDoNotSell(), getTCFConsent(this.context), getUSPrivacyConsentString(this.context, privacySettings.getUsPrivacy()));
    }
}
