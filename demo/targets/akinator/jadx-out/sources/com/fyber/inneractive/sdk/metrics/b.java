package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f24035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f24036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f24037c;

    public b(c cVar, g gVar, Map map) {
        this.f24037c = cVar;
        this.f24035a = gVar;
        this.f24036b = map;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        UnitDisplayType unitDisplayType;
        int iA;
        int iA2;
        String str;
        IAlog.a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
        c cVar = this.f24037c;
        UnitDisplayType unitDisplayType2 = cVar.f24043c;
        if (unitDisplayType2 == null || !(unitDisplayType2 == (unitDisplayType = UnitDisplayType.BANNER) || unitDisplayType2 == UnitDisplayType.MRECT || unitDisplayType2.isFullscreenUnit())) {
            UnitDisplayType unitDisplayType3 = cVar.f24043c;
            IAlog.a("Unit display type %s is not supported for metric event", unitDisplayType3 != null ? unitDisplayType3.value() : "");
            return;
        }
        IAlog.a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f24035a.toString());
        o oVar = IAConfigManager.O.f23226u.f23394b;
        UnitDisplayType unitDisplayType4 = this.f24037c.f24043c;
        if (unitDisplayType4 == unitDisplayType || unitDisplayType4 == UnitDisplayType.MRECT) {
            String strA = oVar.a("ad_metrics_interval_banner", c.f24038g);
            String strA2 = oVar.a("ad_metrics_limit_banner", c.f24039h);
            iA = v.a(strA, 24);
            iA2 = v.a(strA2, 3);
            str = "LastSentMetricsBanner";
        } else {
            String strA3 = oVar.a("ad_metrics_interval_interstitial", c.f24040i);
            String strA4 = oVar.a("ad_metrics_limit_interstitial", c.f24041j);
            iA = v.a(strA3, 24);
            iA2 = v.a(strA4, 3);
            str = "LastSentMetricsInterstitial";
        }
        Application application = com.fyber.inneractive.sdk.util.o.f26796a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (oVar.a(false, this.f24037c.f24034a) && !a.a(iA, iA2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                c cVar2 = this.f24037c;
                InneractiveAdRequest inneractiveAdRequest = cVar2.f24045e;
                com.fyber.inneractive.sdk.response.e eVar = cVar2.f24044d;
                Map map = this.f24036b;
                try {
                    u uVar = u.METRIC_MEASUREMENTS_EVENT;
                    JSONArray jSONArray2 = cVar2.f24046f;
                    w wVar = new w(eVar);
                    wVar.f24326c = uVar;
                    wVar.f24324a = inneractiveAdRequest;
                    wVar.f24327d = jSONArray2;
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : map.keySet()) {
                        Object obj = map.get(str2);
                        try {
                            jSONObject.put(str2, obj);
                        } catch (Exception unused2) {
                            IAlog.f("Got exception adding param to json object: %s, %s", str2, obj);
                        }
                    }
                    wVar.f24329f.put(jSONObject);
                    wVar.a((String) null);
                } catch (Exception unused3) {
                }
            }
            sharedPreferences.edit().putString(str, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
