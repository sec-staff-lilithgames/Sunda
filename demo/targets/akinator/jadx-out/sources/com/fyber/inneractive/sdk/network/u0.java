package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 extends v0 {

    /* renamed from: s, reason: collision with root package name */
    public static final String f24311s = IAlog.a(u0.class);

    public u0(com.fyber.inneractive.sdk.flow.nativead.t tVar, Context context, com.fyber.inneractive.sdk.cache.d dVar) {
        super(tVar, context, dVar);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final void a(o0 o0Var, String str, String str2) throws IOException {
        d0 d0Var = this.f24322r;
        if (d0Var == null) {
            IAlog.f("%s: failed to cache file: no cache helper", f24311s);
            return;
        }
        d0Var.b(str2);
        if (o0Var == null || TextUtils.isEmpty(o0Var.f24262b) || TextUtils.isEmpty(str)) {
            IAlog.f("%s: failed to cache file: empty result", f24311s);
            return;
        }
        boolean zA = this.f24322r.a(str, o0Var.f24262b);
        Uri uri = (Uri) this.f24322r.a().f23139a;
        o0Var.f24261a = uri;
        if (zA) {
            this.f24321q.a(uri);
        } else {
            IAlog.b("%s: Failed to cache file", f24311s);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c() {
        this.f24282a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final a i() {
        e0 e0Var = new e0(this.f24320p, this.f24321q, com.fyber.inneractive.sdk.nativead.b.f24184f.f24186b);
        this.f24322r = e0Var;
        com.fyber.inneractive.sdk.cache.m mVarA = e0Var.a();
        String str = mVarA.f23140b;
        Uri uri = (Uri) mVarA.f23139a;
        this.f24321q.c();
        return new a(uri, str);
    }

    @Override // com.fyber.inneractive.sdk.network.v0, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        o0 o0Var = new o0();
        try {
            o0Var.f24262b = new String(Base64.encode(com.fyber.inneractive.sdk.util.v.a(lVar.f24239c), 0));
            return o0Var;
        } catch (Exception e10) {
            IAlog.b("%s : failed parse cacheable network request", f24311s, e10);
            throw new n0(e10);
        }
    }
}
