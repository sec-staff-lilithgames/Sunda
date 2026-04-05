package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class rg {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38295a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38296b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38297c;

    public rg(boolean z10, boolean z11, boolean z12) {
        this.f38295a = z10;
        this.f38296b = z11;
        this.f38297c = z12;
    }

    public final boolean a() {
        return this.f38295a;
    }

    public final boolean b() {
        return this.f38296b;
    }

    public final boolean c() {
        return this.f38297c;
    }

    public final boolean d() {
        return this.f38297c;
    }

    public final boolean e() {
        return this.f38295a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj;
        return this.f38295a == rgVar.f38295a && this.f38296b == rgVar.f38296b && this.f38297c == rgVar.f38297c;
    }

    public final boolean f() {
        return this.f38296b;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(C3284j8.f37010k, this.f38295a).put(C3284j8.f37011l, this.f38296b).put(C3284j8.f37012m, this.f38297c);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f38295a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.f38296b;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z11 = this.f38297c;
        return i12 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        boolean z10 = this.f38295a;
        boolean z11 = this.f38296b;
        boolean z12 = this.f38297c;
        StringBuilder sb2 = new StringBuilder("ViewVisibilityParams(isVisible=");
        sb2.append(z10);
        sb2.append(", isWindowVisible=");
        sb2.append(z11);
        sb2.append(", isShown=");
        return a.b.q(sb2, z12, ")");
    }

    public final rg a(boolean z10, boolean z11, boolean z12) {
        return new rg(z10, z11, z12);
    }

    public static /* synthetic */ rg a(rg rgVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = rgVar.f38295a;
        }
        if ((i10 & 2) != 0) {
            z11 = rgVar.f38296b;
        }
        if ((i10 & 4) != 0) {
            z12 = rgVar.f38297c;
        }
        return rgVar.a(z10, z11, z12);
    }
}
