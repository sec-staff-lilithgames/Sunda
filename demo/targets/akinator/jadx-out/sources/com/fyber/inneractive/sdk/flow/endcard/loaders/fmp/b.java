package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.o;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f23603a;

    /* renamed from: b, reason: collision with root package name */
    public final o f23604b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f23605c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23606d;

    public b(o oVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar, String str) {
        this.f23604b = oVar;
        this.f23603a = (p) oVar.f();
        this.f23605c = aVar;
        this.f23606d = str;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) throws JSONException {
        String str = (String) obj;
        if (str != null && exc == null) {
            IAlog.c("%s loaded FMP End-Card icon %s", "IconCallback", this.f23606d);
            p pVar = this.f23603a;
            pVar.f23616k = str;
            pVar.b(this.f23605c);
            return;
        }
        if (TextUtils.isEmpty(this.f23603a.f23616k)) {
            o oVar = this.f23604b;
            IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", "IconCallback");
            JSONObject jSONObject = new JSONObject();
            String strA = v.a(exc);
            if (!TextUtils.isEmpty(strA)) {
                try {
                    jSONObject.put("error", strA);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "error", strA);
                }
            }
            String strN = oVar.n();
            if (!TextUtils.isEmpty(strN)) {
                try {
                    jSONObject.put("version", strN);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "version", strN);
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            try {
                jSONObject.put("loaded_from_cache", boolValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
            }
            x0 x0Var = oVar.f23557c;
            t tVar = t.FMP_COMPANION_FAILED_LOADING;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f23952c;
            g gVar = x0Var.f23953d;
            JSONArray jSONArray = x0Var.f23955f;
            w wVar = new w(gVar);
            wVar.f24325b = tVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArray;
            wVar.f24329f.put(jSONObject);
            wVar.a((String) null);
        }
    }
}
