package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C3377o9;
import com.ironsource.C3497vb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.r;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.List;
import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlay {
    public static final LevelPlay INSTANCE = new LevelPlay();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* renamed from: a, reason: collision with root package name */
        private final String f50638a;

        AdFormat(String str) {
            this.f50638a = str;
        }

        public final String getValue() {
            return this.f50638a;
        }
    }

    private LevelPlay() {
    }

    public static final void addImpressionDataListener(LevelPlayImpressionDataListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        IronLog.API.info("adding listener: ".concat(listener.getClass().getSimpleName()));
        C3497vb.f39119a.a(listener);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.0.0";
    }

    public static final void init(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener listener) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(initRequest, "initRequest");
        e0.checkNotNullParameter(listener, "listener");
        C3497vb.f39119a.a(context, initRequest, listener);
    }

    public static final void launchTestSuite(Context context) {
        e0.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        r.m().c(context);
    }

    public static final void removeImpressionDataListener(LevelPlayImpressionDataListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        IronLog.API.info("removing listener: ".concat(listener.getClass().getSimpleName()));
        C3497vb.f39119a.b(listener);
    }

    public static final void setAdaptersDebug(boolean z10) {
        IronLog.API.info("enabled: " + z10);
        r.m().a(z10);
    }

    public static final void setConsent(boolean z10) {
        IronLog.API.info("consent: " + z10);
        r.m().b(z10);
    }

    public static final boolean setDynamicUserId(String dynamicUserId) {
        e0.checkNotNullParameter(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: " + dynamicUserId);
        return r.m().b(dynamicUserId);
    }

    public static final void setMetaData(String key, String value) throws JSONException {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        C3497vb.f39119a.a(key, value);
    }

    public static final void setNetworkData(String networkKey, JSONObject networkData) throws JSONException {
        e0.checkNotNullParameter(networkKey, "networkKey");
        e0.checkNotNullParameter(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        r.m().b(networkKey, networkData);
    }

    public static final void setSegment(LevelPlaySegment segment) {
        e0.checkNotNullParameter(segment, "segment");
        IronLog.API.info("");
        C3497vb.f39119a.b(segment);
    }

    public static final void validateIntegration(Context context) {
        e0.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        C3377o9.f38041a.a(context);
    }

    public static final void setMetaData(String key, List<String> values) throws JSONException {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        r.m().a(key, values);
    }
}
