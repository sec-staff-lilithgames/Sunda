package com.bumptech.glide;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n implements j9.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f16659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f16660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9.a f16661d;

    public n(c cVar, List list, d9.a aVar) {
        this.f16659b = cVar;
        this.f16660c = list;
        this.f16661d = aVar;
    }

    @Override // j9.j
    public m get() {
        if (this.f16658a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        d6.a.beginSection("Glide registry");
        this.f16658a = true;
        try {
            return o.a(this.f16659b, this.f16660c, this.f16661d);
        } finally {
            this.f16658a = false;
            d6.a.endSection();
        }
    }
}
