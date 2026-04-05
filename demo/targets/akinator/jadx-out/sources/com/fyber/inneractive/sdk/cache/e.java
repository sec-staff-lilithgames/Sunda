package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements a {
    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader.global";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return "ia-global.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) throws JSONException {
        try {
            return o.a(new JSONObject(str));
        } catch (JSONException e10) {
            IAlog.b("internal error while parsing global config file", new Object[0]);
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        int i10 = com.fyber.inneractive.sdk.config.k.f23321a;
        if (System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl") == null) {
            return "https://cdn2.inner-active.mobi/ia-sdk-config/config_android.json";
        }
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }
}
