package com.ironsource.sdk.controller;

import com.ironsource.C3158c7;
import com.ironsource.C3191e4;
import com.ironsource.C3422r4;
import com.ironsource.InterfaceC3426r8;
import com.ironsource.Mb;
import com.ironsource.R3;
import com.ironsource.S3;
import com.ironsource.Ue;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class FeaturesManager {

    /* renamed from: d, reason: collision with root package name */
    private static volatile FeaturesManager f38407d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final String f38408e = "debugMode";

    /* renamed from: a, reason: collision with root package name */
    private Map<String, ?> f38409a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f38410b = new a();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3426r8 f38411c = Mb.U().t();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends ArrayList<String> {
        public a() {
            add(C3191e4.d.f36420f);
            add(C3191e4.d.f36419e);
            add(C3191e4.d.f36421g);
            add(C3191e4.d.f36422h);
            add(C3191e4.d.f36423i);
            add(C3191e4.d.f36424j);
            add(C3191e4.d.f36425k);
            add(C3191e4.d.f36426l);
            add(C3191e4.d.f36427m);
        }
    }

    private FeaturesManager() {
        if (f38407d != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f38409a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f38407d == null) {
            synchronized (FeaturesManager.class) {
                try {
                    if (f38407d == null) {
                        f38407d = new FeaturesManager();
                    }
                } finally {
                }
            }
        }
        return f38407d;
    }

    public ArrayList<String> a() {
        return new ArrayList<>(this.f38410b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(C3191e4.a.f36366d) ? networkConfiguration.optJSONObject(C3191e4.a.f36366d) : new JSONObject();
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f38409a.containsKey("debugMode")) {
                num = (Integer) this.f38409a.get("debugMode");
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public R3 getFeatureFlagCatchUrlError() {
        return new R3(SDKUtils.getNetworkConfiguration().optJSONObject(R3.a.f35382c));
    }

    public S3 getFeatureFlagClickCheck() {
        return new S3(SDKUtils.getNetworkConfiguration());
    }

    public C3158c7 getFeatureFlagHealthCheck() {
        JSONObject jSONObjectA = this.f38411c.a(C3191e4.a.f36380r);
        return jSONObjectA != null ? new C3158c7(jSONObjectA) : new C3158c7(null);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(C3191e4.a.f36368f);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optInt(C3191e4.a.f36367e, 0);
        }
        return 0;
    }

    public Ue getSessionHistoryConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return new Ue(networkConfiguration.has(C3191e4.a.f36381s) ? networkConfiguration.optJSONObject(C3191e4.a.f36381s) : new JSONObject());
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.f38411c.c(C3191e4.a.f36383u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f38409a = map;
    }
}
