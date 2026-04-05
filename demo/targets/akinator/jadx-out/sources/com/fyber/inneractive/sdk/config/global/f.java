package com.fyber.inneractive.sdk.config.global;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f23286a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23287b;

    public f(boolean z10, String str) {
        this.f23286a = str;
        this.f23287b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        String str = this.f23286a;
        if (str != null) {
            return str.equalsIgnoreCase("android") ? !this.f23287b : this.f23287b;
        }
        return false;
    }

    public final String toString() {
        return "os - " + this.f23286a + " include: " + this.f23287b;
    }
}
