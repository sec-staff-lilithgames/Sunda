package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.util.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23122a;

    public c(String str) {
        this.f23122a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader.endcard";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return String.valueOf(("fmp.endcard_" + this.f23122a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        String str = (String) obj;
        if (str != null) {
            o.f26796a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("fmp.endcard.data", str).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f23122a;
    }
}
