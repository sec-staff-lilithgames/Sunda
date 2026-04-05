package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.P9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import java.util.List;
import kotlin.jvm.internal.e0;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class IronSourceAds {
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* renamed from: a, reason: collision with root package name */
        private final String f50592a;

        AdFormat(String str) {
            this.f50592a = str;
        }

        public final String getValue() {
            return this.f50592a;
        }
    }

    private IronSourceAds() {
    }

    public static final void enableDebugMode(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.0.0";
    }

    public static final void init(Context context, InitRequest initRequest, InitListener initializationListener) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(initRequest, "initRequest");
        e0.checkNotNullParameter(initializationListener, "initializationListener");
        P9.f35180a.a(context, initRequest, initializationListener);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    public static final void setMetaData(String key, String value) throws JSONException {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        P9.f35180a.a(key, value);
    }

    public static final void setMetaData(String key, List<String> values) throws JSONException {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        r.m().a(key, values);
    }
}
