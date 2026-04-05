package com.fyber.inneractive.sdk.player.cache;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f24351a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24352b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24353c;

    /* renamed from: d, reason: collision with root package name */
    public d f24354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f24355e;

    public e(g gVar, String str) {
        this.f24355e = gVar;
        this.f24351a = str;
        this.f24352b = new long[gVar.f24364g];
    }

    public final File a(int i10) {
        return new File(this.f24355e.f24358a, this.f24351a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f24355e.f24358a, this.f24351a + "." + i10 + ".tmp");
    }
}
