package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f13689a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f13690b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f13691c;

    /* renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f13693e = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Context f13692d = com.applovin.impl.sdk.k.o();

    public c0(String str, com.applovin.impl.sdk.k kVar) {
        this.f13690b = str;
        this.f13689a = kVar;
        this.f13691c = kVar.O();
    }

    public Context a() {
        return this.f13692d;
    }

    public void a(boolean z10) {
        this.f13693e.set(z10);
    }
}
