package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f23897a;

    public v(w wVar) {
        this.f23897a = wVar;
    }

    public final void a(com.fyber.inneractive.sdk.network.u uVar, com.fyber.inneractive.sdk.ignite.m mVar) throws JSONException {
        w wVar = this.f23897a;
        InneractiveAdRequest inneractiveAdRequest = wVar.f23944a;
        com.fyber.inneractive.sdk.response.e eVar = wVar.f23945b;
        com.fyber.inneractive.sdk.config.global.r rVar = wVar.f23946c;
        JSONArray jSONArrayB = rVar != null ? rVar.b() : null;
        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar2.f24326c = uVar;
        wVar2.f24324a = inneractiveAdRequest;
        wVar2.f24327d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        String str = TJzY.QNXIOfihtWmIbb;
        String strA = mVar.a();
        try {
            jSONObject.put(str, strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", str, strA);
        }
        wVar2.f24329f.put(jSONObject);
        wVar2.a((String) null);
    }

    public final void a(com.fyber.inneractive.sdk.network.t tVar, String str, String str2, com.fyber.inneractive.sdk.ignite.m mVar) {
        w wVar = this.f23897a;
        InneractiveAdRequest inneractiveAdRequest = wVar.f23944a;
        com.fyber.inneractive.sdk.response.e eVar = wVar.f23945b;
        com.fyber.inneractive.sdk.config.global.r rVar = wVar.f23946c;
        JSONArray jSONArrayB = rVar != null ? rVar.b() : null;
        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar2.f24325b = tVar;
        wVar2.f24324a = inneractiveAdRequest;
        wVar2.f24327d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        if (mVar != null) {
            String strA = mVar.a();
            try {
                jSONObject.put("ignitem", strA);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "ignitem", strA);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", PglCryptUtils.KEY_MESSAGE, str);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("error_code", str2);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "error_code", str2);
            }
        }
        wVar2.f24329f.put(jSONObject);
        wVar2.a((String) null);
    }
}
