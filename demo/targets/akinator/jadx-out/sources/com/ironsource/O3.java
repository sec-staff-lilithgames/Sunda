package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class O3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35090a;

    /* renamed from: b, reason: collision with root package name */
    private final Q3 f35091b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35092a;

        static {
            int[] iArr = new int[Q3.values().length];
            try {
                iArr[Q3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35092a = iArr;
        }
    }

    public O3(boolean z10, Q3 q32) {
        this.f35090a = z10;
        this.f35091b = q32;
    }

    public final boolean a() {
        return this.f35090a;
    }

    public final Q3 b() {
        return this.f35091b;
    }

    public final Q3 c() {
        return this.f35091b;
    }

    public final boolean d() {
        return this.f35090a;
    }

    public final String e() {
        Q3 q32 = this.f35091b;
        int i10 = q32 == null ? -1 : a.f35092a[q32.ordinal()];
        if (i10 == 1) {
            return "Placement delivery is false";
        }
        if (i10 == 2) {
            return "In pacing mode";
        }
        if (i10 != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O3)) {
            return false;
        }
        O3 o32 = (O3) obj;
        return this.f35090a == o32.f35090a && this.f35091b == o32.f35091b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f35090a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        Q3 q32 = this.f35091b;
        return i10 + (q32 == null ? 0 : q32.hashCode());
    }

    public String toString() {
        return "CappingStatus(isCapped=" + this.f35090a + " reason=" + this.f35091b + ")";
    }

    public /* synthetic */ O3(boolean z10, Q3 q32, int i10, kotlin.jvm.internal.u uVar) {
        this(z10, (i10 & 2) != 0 ? null : q32);
    }

    public final O3 a(boolean z10, Q3 q32) {
        return new O3(z10, q32);
    }

    public static /* synthetic */ O3 a(O3 o32, boolean z10, Q3 q32, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = o32.f35090a;
        }
        if ((i10 & 2) != 0) {
            q32 = o32.f35091b;
        }
        return o32.a(z10, q32);
    }
}
