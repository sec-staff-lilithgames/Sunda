package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.u;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.mediationsdk.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C3346b {

    /* renamed from: a, reason: collision with root package name */
    private final u.d f37292a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37293b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37294c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37295d;

    public C3346b(u.d sdkState, boolean z10, boolean z11, boolean z12) {
        e0.checkNotNullParameter(sdkState, "sdkState");
        this.f37292a = sdkState;
        this.f37293b = z10;
        this.f37294c = z11;
        this.f37295d = z12;
    }

    public final u.d a() {
        return this.f37292a;
    }

    public final boolean b() {
        return this.f37293b;
    }

    public final boolean c() {
        return this.f37294c;
    }

    public final boolean d() {
        return this.f37295d;
    }

    public final u.d e() {
        return this.f37292a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3346b)) {
            return false;
        }
        C3346b c3346b = (C3346b) obj;
        return this.f37292a == c3346b.f37292a && this.f37293b == c3346b.f37293b && this.f37294c == c3346b.f37294c && this.f37295d == c3346b.f37295d;
    }

    public final boolean f() {
        return this.f37295d;
    }

    public final boolean g() {
        return this.f37294c;
    }

    public final boolean h() {
        return this.f37293b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f37292a.hashCode() * 31;
        boolean z10 = this.f37293b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f37294c;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f37295d;
        return i13 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f37292a + ", isRetryForMoreThan15Secs=" + this.f37293b + ", isDemandOnlyInitRequested=" + this.f37294c + ", isAdUnitInitRequested=" + this.f37295d + ")";
    }

    public final C3346b a(u.d sdkState, boolean z10, boolean z11, boolean z12) {
        e0.checkNotNullParameter(sdkState, "sdkState");
        return new C3346b(sdkState, z10, z11, z12);
    }

    public static /* synthetic */ C3346b a(C3346b c3346b, u.d dVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = c3346b.f37292a;
        }
        if ((i10 & 2) != 0) {
            z10 = c3346b.f37293b;
        }
        if ((i10 & 4) != 0) {
            z11 = c3346b.f37294c;
        }
        if ((i10 & 8) != 0) {
            z12 = c3346b.f37295d;
        }
        return c3346b.a(dVar, z10, z11, z12);
    }
}
