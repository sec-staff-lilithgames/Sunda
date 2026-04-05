package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Uc {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35564a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35565b;

    /* JADX WARN: Multi-variable type inference failed */
    public Uc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.f35564a;
    }

    public final int b() {
        return this.f35565b;
    }

    public final int c() {
        return this.f35565b;
    }

    public final boolean d() {
        return this.f35564a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uc)) {
            return false;
        }
        Uc uc2 = (Uc) obj;
        return this.f35564a == uc2.f35564a && this.f35565b == uc2.f35565b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z10 = this.f35564a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return Integer.hashCode(this.f35565b) + (r02 * 31);
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f35564a + ", flags=" + this.f35565b + ")";
    }

    public Uc(boolean z10, int i10) {
        this.f35564a = z10;
        this.f35565b = i10;
    }

    public final Uc a(boolean z10, int i10) {
        return new Uc(z10, i10);
    }

    public static /* synthetic */ Uc a(Uc uc2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = uc2.f35564a;
        }
        if ((i11 & 2) != 0) {
            i10 = uc2.f35565b;
        }
        return uc2.a(z10, i10);
    }

    public /* synthetic */ Uc(boolean z10, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 805306368 : i10);
    }
}
