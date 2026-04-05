package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveInfrastructureError f23550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f23551b;

    public e(f fVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f23551b = fVar;
        this.f23550a = inneractiveInfrastructureError;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String str;
        String string;
        com.fyber.inneractive.sdk.response.e eVar = this.f23551b.f23638b;
        if (eVar == null || (str = eVar.f26636h) == null) {
            return;
        }
        Map map = eVar.f26646r;
        if (map == null && eVar.f26647s == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.O.f23226u.f23394b;
        String strA = oVar.a("max_failed_creatives_interval_hours", f.f23636e);
        String strA2 = oVar.a("max_failed_creatives_per_interval", f.f23637f);
        int iA = com.fyber.inneractive.sdk.util.v.a(strA, 24);
        int iA2 = com.fyber.inneractive.sdk.util.v.a(strA2, 1);
        Application application = com.fyber.inneractive.sdk.util.o.f26796a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString("lt", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (oVar.a(false, this.f23551b.f24034a) && !com.fyber.inneractive.sdk.metrics.a.a(iA, iA2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                if (map != null) {
                    try {
                        string = new JSONObject(map).toString();
                    } catch (Throwable unused2) {
                        string = "";
                    }
                } else {
                    string = this.f23551b.f23638b.f26647s;
                }
                f fVar = this.f23551b;
                InneractiveAdRequest inneractiveAdRequest = fVar.f23639c;
                com.fyber.inneractive.sdk.response.e eVar2 = fVar.f23638b;
                InneractiveInfrastructureError inneractiveInfrastructureError = this.f23550a;
                JSONArray jSONArray2 = fVar.f23640d;
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_FAILURE_DATA;
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar2);
                wVar.f24325b = tVar;
                wVar.f24324a = inneractiveAdRequest;
                wVar.f24327d = jSONArray2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw_response", str);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "raw_response", str);
                }
                try {
                    jSONObject.put("headers", string);
                } catch (Exception unused4) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "headers", string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("error_code", strDescription);
                } catch (Exception unused5) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "error_code", strDescription);
                }
                wVar.f24329f.put(jSONObject);
                wVar.a((String) null);
            }
            sharedPreferences.edit().putString("lt", new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
