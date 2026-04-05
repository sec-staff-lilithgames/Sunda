package com.fyber.inneractive.sdk.cache;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23138b;

    public l(String str) {
        this.f23137a = str;
        this.f23138b = String.format("template_%d.html", Integer.valueOf(str.hashCode()));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return this.f23138b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.f23138b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f23137a;
    }
}
