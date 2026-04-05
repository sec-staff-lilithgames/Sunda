package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f26751a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26753c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26752b = false;

    /* renamed from: d, reason: collision with root package name */
    public long f26754d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f26755e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f26756f = 0;

    public final void a(boolean z10) {
        this.f26753c = z10;
        if (this.f26752b) {
            IAlog.a("%s%s timer could not start. Timer is in action!", "AdExperienceLatency: ", z10 ? "skip" : "close");
            return;
        }
        IAlog.a("%s%s timer started", "AdExperienceLatency: ", z10 ? "skip" : "close");
        this.f26754d = System.currentTimeMillis();
        this.f26752b = true;
    }

    public final void a(String str) throws JSONException {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (this.f26752b) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.f26754d) - this.f26756f;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            long millis = timeUnit.toMillis(jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
            Locale locale = Locale.US;
            String str2 = seconds + "." + millis;
            InneractiveAdSpot inneractiveAdSpot = this.f26751a;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = this.f26753c ? com.fyber.inneractive.sdk.network.u.USER_SKIP_ACTION_LATENCY : com.fyber.inneractive.sdk.network.u.USER_CLOSE_ACTION_LATENCY;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f23944a : null;
            com.fyber.inneractive.sdk.response.e eVarB = adContent != null ? adContent.b() : null;
            JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f23946c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f24326c = uVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArrayB;
            JSONObject jSONObject = new JSONObject();
            String str3 = this.f26753c ? "skip_action_latency" : "close_action_latency";
            try {
                jSONObject.put(str3, str2);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", str3, str2);
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject.put("origin", str);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "origin", str);
                }
            }
            wVar.f24329f.put(jSONObject);
            wVar.a((String) null);
            this.f26754d = 0L;
            this.f26755e = 0L;
            this.f26756f = 0L;
            this.f26752b = false;
        }
    }
}
