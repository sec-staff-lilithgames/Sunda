package com.fyber.inneractive.sdk.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f26780a;

    /* renamed from: b, reason: collision with root package name */
    public int f26781b;

    public h1(int i10, int i11) {
        this.f26780a = i10;
        this.f26781b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (this.f26780a == h1Var.f26780a && this.f26781b == h1Var.f26781b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26780a * 31) + this.f26781b;
    }
}
