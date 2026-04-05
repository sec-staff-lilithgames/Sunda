package com.fyber.inneractive.sdk.mraid;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends y {

    /* renamed from: a, reason: collision with root package name */
    public final int f24177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24178b;

    public x(int i10, int i11) {
        this.f24177a = i10;
        this.f24178b = i11;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        StringBuilder sb2 = new StringBuilder("adSize: { width: ");
        sb2.append(this.f24177a);
        sb2.append(", height: ");
        return a.b.f(this.f24178b, " }", sb2);
    }
}
