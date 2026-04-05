package com.fyber.inneractive.sdk.network;

import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c1 extends t0 {

    /* renamed from: p, reason: collision with root package name */
    public final String f24200p;

    public c1(f0 f0Var, String str, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(f0Var, g0.f24226c.a(), rVar);
        this.f24200p = str;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public o0 a(l lVar, Map map, int i10) {
        o0 o0Var = new o0();
        try {
            InputStream inputStream = lVar.f24239c;
            List list = map != null ? (List) map.get("Content-Type") : null;
            String str = list != null ? (String) list.get(0) : null;
            String strEncodeToString = Base64.encodeToString(com.fyber.inneractive.sdk.util.v.a(inputStream), 0);
            if (str == null) {
                str = "image/png";
            }
            o0Var.f24261a = "data:" + str + ";base64, " + strEncodeToString;
            return o0Var;
        } catch (Exception unused) {
            IAlog.a("failed to fetch and encode the image.", new Object[0]);
            return o0Var;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        return this.f24200p;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }
}
