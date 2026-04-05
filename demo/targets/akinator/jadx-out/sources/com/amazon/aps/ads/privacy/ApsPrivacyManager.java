package com.amazon.aps.ads.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.amazon.aps.ads.privacy.ApsPrivacyManager;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DtbSharedPreferences;
import j1.o2;
import java.io.File;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONArray;
import uu.c2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsPrivacyManager {
    public static final Companion Companion = new Companion(null);
    public static final ApsPrivacyManager INSTANCE = new ApsPrivacyManager();
    private Boolean isGdprToBeAppliedFromConfig;
    private boolean isInitialized;
    private final Set<String> keysInterested = c2.setOf((Object[]) new String[]{"IABTCF_TCString", "IABTCF_gdprApplies"});
    private final ApsGdprHandler gdprHandler = new ApsGdprHandler();
    private final SharedPreferences.OnSharedPreferenceChangeListener prefChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: h8.a
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            ApsPrivacyManager.prefChangeListener$lambda$0(this.f58701a, sharedPreferences, str);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    private ApsPrivacyManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prefChangeListener$lambda$0(ApsPrivacyManager apsPrivacyManager, SharedPreferences sharedPreferences, String str) {
        ApsAdExtensionsKt.d(apsPrivacyManager, "Received the shared preference changed event");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 83641339) {
                if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    ApsGdprHandler apsGdprHandler = apsPrivacyManager.gdprHandler;
                    e0.checkNotNull(sharedPreferences);
                    apsGdprHandler.setGdprConsent(apsPrivacyManager.getStringValue(sharedPreferences, "IABTCF_TCString"));
                }
            } else if (str.equals("IABTCF_gdprApplies")) {
                ApsGdprHandler apsGdprHandler2 = apsPrivacyManager.gdprHandler;
                e0.checkNotNull(sharedPreferences);
                apsGdprHandler2.setGdprApplies(apsPrivacyManager.getBooleanValue(sharedPreferences, "IABTCF_gdprApplies"));
            }
        }
        if (y0.contains(apsPrivacyManager.keysInterested, str)) {
            apsPrivacyManager.removeStoragesByApsIfNoConsent();
        }
    }

    public final Boolean getBooleanValue(SharedPreferences prefs, String key) {
        e0.checkNotNullParameter(prefs, "prefs");
        e0.checkNotNullParameter(key, "key");
        if (prefs.contains(key)) {
            Object obj = prefs.getAll().get(key);
            if (obj instanceof Boolean) {
                return Boolean.valueOf(e0.areEqual(Boolean.TRUE, obj));
            }
            if (obj instanceof Integer) {
                return Boolean.valueOf(1 == ((Number) obj).intValue());
            }
            if (obj instanceof String) {
                String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
                e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return Boolean.valueOf(lowerCase.equals(Boolean.TRUE));
            }
        }
        return null;
    }

    public final Integer getIntValue(SharedPreferences prefs, String key) {
        e0.checkNotNullParameter(prefs, "prefs");
        e0.checkNotNullParameter(key, "key");
        try {
            if (prefs.contains(key)) {
                return Integer.valueOf(prefs.getInt(key, 0));
            }
            return null;
        } catch (Exception e10) {
            ApsAdExtensionsKt.remoteLog(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error reading the shared pref value", e10);
            return null;
        }
    }

    public final String getStringValue(SharedPreferences prefs, String key) {
        e0.checkNotNullParameter(prefs, "prefs");
        e0.checkNotNullParameter(key, "key");
        try {
            return prefs.getString(key, null);
        } catch (Exception e10) {
            ApsAdExtensionsKt.remoteLog(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error reading the shared pref value", e10);
            return null;
        }
    }

    public final void init(Context context) {
        if (this.isInitialized || context == null) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences != null) {
            setGdprConsent(defaultSharedPreferences);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.prefChangeListener);
        }
        this.isInitialized = true;
    }

    public final boolean isGdprConsentRequired() {
        Boolean bool = this.isGdprToBeAppliedFromConfig;
        if (bool == null || !bool.booleanValue()) {
            return (this.gdprHandler.isGdprApplies() != null && e0.areEqual(this.gdprHandler.isGdprApplies(), Boolean.TRUE)) || this.gdprHandler.isTcfStringFound();
        }
        return true;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final boolean isSystemResourceAccessAllowed() {
        if (!isGdprConsentRequired()) {
            return true;
        }
        ApsGdprHandler apsGdprHandler = this.gdprHandler;
        return apsGdprHandler != null && apsGdprHandler.isPurpose1Consented();
    }

    public final void removeConfigFileIfExists() {
        File filesDir;
        Context context = AdRegistration.getContext();
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return;
        }
        File file = new File(o2.l(filesDir.getAbsolutePath(), "/config/aps_mobile_client_config.json"));
        if (file.exists()) {
            file.delete();
        }
    }

    public final void removeStoragesByApsIfNoConsent() {
        if (isSystemResourceAccessAllowed()) {
            return;
        }
        DtbSharedPreferences.clearStorage();
        removeConfigFileIfExists();
    }

    public final void setGdprConfiguration(JSONArray jSONArray) {
        if (jSONArray == null) {
            this.isGdprToBeAppliedFromConfig = Boolean.FALSE;
            return;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (e0.areEqual("gdprtcfv2", jSONArray.get(i10))) {
                this.isGdprToBeAppliedFromConfig = Boolean.TRUE;
                return;
            }
        }
    }

    public final void setGdprConsent(SharedPreferences prefs) {
        e0.checkNotNullParameter(prefs, "prefs");
        this.gdprHandler.setGdprConsent(getStringValue(prefs, "IABTCF_TCString"));
        this.gdprHandler.setGdprApplies(getIntValue(prefs, "IABTCF_gdprApplies"));
        removeStoragesByApsIfNoConsent();
    }
}
