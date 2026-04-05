package com.fyber.inneractive.sdk.mraid;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z extends y {

    /* renamed from: a, reason: collision with root package name */
    public final int f24179a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24180b;

    /* renamed from: d, reason: collision with root package name */
    public final int f24182d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f24181c = 0;

    public z(int i10, int i11) {
        this.f24179a = i10;
        this.f24180b = i11;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        StringBuilder sb2 = new StringBuilder("currentPosition: { x: ");
        sb2.append(this.f24181c);
        sb2.append(", y: ");
        sb2.append(this.f24182d);
        sb2.append(", width: ");
        sb2.append(this.f24179a);
        sb2.append(", height: ");
        return a.b.f(this.f24180b, " }", sb2);
    }
}
