package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a extends com.fyber.inneractive.sdk.network.timeouts.a {

    /* renamed from: h, reason: collision with root package name */
    public int f24305h;

    /* renamed from: i, reason: collision with root package name */
    public int f24306i;

    /* renamed from: j, reason: collision with root package name */
    public int f24307j;

    /* renamed from: k, reason: collision with root package name */
    public int f24308k;

    /* renamed from: l, reason: collision with root package name */
    public final String f24309l;

    public a(String str, j jVar, String str2) {
        this.f24309l = str2;
        d(jVar, str);
    }

    public int a(int i10) {
        return 0;
    }

    public abstract int a(j jVar);

    public abstract int a(j jVar, String str);

    public int b() {
        return 0;
    }

    public abstract int b(j jVar, String str);

    public int c() {
        return 0;
    }

    public abstract int c(j jVar, String str);

    public void d(j jVar, String str) {
        int iB = b(jVar, "read");
        int iB2 = b(jVar, "conn");
        int iA = a(jVar, str);
        this.f24302f = a(jVar);
        this.f24307j = c(jVar, "read");
        int iC = c(jVar, "conn");
        this.f24308k = iC;
        int i10 = (this.f24307j * iA) / 100;
        this.f24305h = i10;
        this.f24306i = (iA * iC) / 100;
        this.f24305h = Math.max(iB, i10);
        this.f24306i = Math.max(iB2, this.f24306i);
    }
}
