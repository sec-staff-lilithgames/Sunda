package io.bidmachine;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Debugger {
    private static final String DIR_NAME = "features";
    private static final String FILE_NAME = "DebugParameters.json";
    private static final String PARAMETER_CONSENT = "consent";
    private static final String PARAMETER_COPPA = "coppa";
    private static final String PARAMETER_ENDPOINT = "endpoint";
    private static final String PARAMETER_GDPR_STRING = "GDPRString";
    private static final String PARAMETER_LOGGING_ENABLED = "loggingEnabled";
    private static final String PARAMETER_SUBJECT_TO_GDPR = "subjectToGDPR";
    private static final String PARAMETER_TEST_MODE = "testMode";
    private static final String PARAMETER_US_PRIVACY_STRING = "usPrivacyString";
    private static final String TAG = "Debugger";
    public static final Debugger INSTANCE = new Debugger();
    private static final AtomicBoolean LOGGING_LOCK = new AtomicBoolean(false);
    private static final AtomicBoolean TEST_MODE_LOCK = new AtomicBoolean(false);

    private Debugger() {
    }

    private final void applyAndLockIfExists(AtomicBoolean atomicBoolean, JSONObject jSONObject, String str, kv.l lVar) {
        if (jSONObject.has(str)) {
            lVar.invoke(Boolean.valueOf(jSONObject.optBoolean(str)));
            atomicBoolean.set(true);
        }
    }

    public static final boolean isLoggingLock() {
        return LOGGING_LOCK.get();
    }

    public static final boolean isTestModeLock() {
        return TEST_MODE_LOCK.get();
    }

    public static final void setup(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        try {
            File externalDirDirty = kr.c.getExternalDirDirty(context);
            if (externalDirDirty == null) {
                return;
            }
            File file = new File(externalDirDirty, "features/DebugParameters.json");
            if (file.exists()) {
                Log.d(TAG, "Debug file found");
                INSTANCE.setupFromJson$bidmachine_android_sdk_bh_3_4_0(kr.c.readSafely(file));
            }
        } catch (Throwable th2) {
            Log.w(TAG, th2);
        }
    }

    public final void setupFromJson$bidmachine_android_sdk_bh_3_4_0(String str) {
        if (str == null || sv.n0.isBlank(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        AtomicBoolean atomicBoolean = LOGGING_LOCK;
        if (jSONObject.has(PARAMETER_LOGGING_ENABLED)) {
            BidMachine.setLoggingEnabled(jSONObject.optBoolean(PARAMETER_LOGGING_ENABLED));
            atomicBoolean.set(true);
        }
        AtomicBoolean atomicBoolean2 = TEST_MODE_LOCK;
        if (jSONObject.has(PARAMETER_TEST_MODE)) {
            BidMachine.setTestMode(jSONObject.optBoolean(PARAMETER_TEST_MODE));
            atomicBoolean2.set(true);
        }
        if (jSONObject.has("endpoint")) {
            String strOptString = jSONObject.optString("endpoint");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "jsonObject.optString(PARAMETER_ENDPOINT)");
            String string = sv.n0.trim(strOptString).toString();
            if (string.length() > 0 && ir.q.isHttpUrl(string)) {
                BidMachine.setEndpoint(string);
            }
        }
        if (jSONObject.has(PARAMETER_COPPA)) {
            BidMachine.setCoppa(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_COPPA)));
        }
        if (jSONObject.has(PARAMETER_US_PRIVACY_STRING)) {
            BidMachine.setUSPrivacyString(jSONObject.optString(PARAMETER_US_PRIVACY_STRING));
        }
        if (jSONObject.has(PARAMETER_SUBJECT_TO_GDPR)) {
            BidMachine.setSubjectToGDPR(Boolean.valueOf(jSONObject.optBoolean(PARAMETER_SUBJECT_TO_GDPR)));
        }
        if (jSONObject.has("consent")) {
            BidMachine.setConsentConfig(jSONObject.optBoolean("consent"), jSONObject.has(PARAMETER_GDPR_STRING) ? jSONObject.optString(PARAMETER_GDPR_STRING) : null);
        }
    }

    public static /* synthetic */ void isLoggingLock$annotations() {
    }

    public static /* synthetic */ void isTestModeLock$annotations() {
    }
}
