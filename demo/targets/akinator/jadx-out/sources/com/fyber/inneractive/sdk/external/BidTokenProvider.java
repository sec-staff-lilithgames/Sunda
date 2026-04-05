package com.fyber.inneractive.sdk.external;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class BidTokenProvider {
    public static String getBidderToken() throws JSONException {
        if (!InneractiveAdManager.wasInitialized()) {
            IAlog.b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new Object[0]);
            return null;
        }
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.f23083h;
        bVar.getClass();
        if (IAConfigManager.d()) {
            IAlog.a("%sTCF purpose 1 disabled, returning null", IAlog.a(bVar));
            return null;
        }
        if (bVar.f23088e.get() == null) {
            IAConfigManager.b();
            synchronized (bVar.f23090g) {
                bVar.b();
            }
        } else {
            bVar.d();
        }
        String str = (String) bVar.f23088e.get();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        String str2 = iAConfigManager.f23217l;
        o oVar = iAConfigManager.f23226u.f23394b;
        int iA = oVar.a(TextUtils.isEmpty(str2) ? "token_size_limit" : a.b.k("token_size_limit_", str2.toLowerCase(Locale.US)), oVar.a("token_size_limit", 4000, 1), 1);
        if (str == null || str.getBytes().length <= iA) {
            IAlog.c("token = %s", str);
            return str;
        }
        w wVar = new w(t.TOKEN_EXCEEDS_LIMIT);
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        try {
            jSONObject.put("mediator", str2);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "mediator", str2);
        }
        Integer numValueOf = Integer.valueOf(str.getBytes().length);
        try {
            jSONObject.put("token_size", numValueOf);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "token_size", numValueOf);
        }
        Integer numValueOf2 = Integer.valueOf(iA);
        try {
            jSONObject.put("token_limit", numValueOf2);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "token_limit", numValueOf2);
        }
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
        IAlog.c("token exceeds the limit, returning null", new Object[0]);
        return null;
    }
}
