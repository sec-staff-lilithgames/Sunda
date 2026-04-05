package com.google.gson.internal.bind;

import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f29985b = new b(Date.class);

    /* renamed from: a, reason: collision with root package name */
    public final Class f29986a;

    public c(Class cls) {
        this.f29986a = cls;
    }

    public abstract Date a(Date date);

    public final com.google.gson.l0 createAdapterFactory(String str) {
        return TypeAdapters.newFactory(this.f29986a, new d(this, str));
    }

    public final com.google.gson.l0 createAdapterFactory(int i10, int i11) {
        return TypeAdapters.newFactory(this.f29986a, new d(this, i10, i11));
    }
}
