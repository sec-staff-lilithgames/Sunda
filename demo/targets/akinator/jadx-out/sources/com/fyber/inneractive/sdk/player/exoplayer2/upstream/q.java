package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements g {

    /* renamed from: b, reason: collision with root package name */
    public final String f25986b;

    /* renamed from: c, reason: collision with root package name */
    public final m f25987c;

    /* renamed from: a, reason: collision with root package name */
    public final w f25985a = new w();

    /* renamed from: d, reason: collision with root package name */
    public final int f25988d = 2000;

    /* renamed from: e, reason: collision with root package name */
    public final int f25989e = 2000;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25990f = true;

    public q(String str, m mVar) {
        this.f25986b = str;
        this.f25987c = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new p(this.f25986b, this.f25987c, this.f25988d, this.f25989e, this.f25990f, this.f25985a);
    }
}
