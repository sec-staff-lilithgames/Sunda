package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v1 {

    /* renamed from: c, reason: collision with root package name */
    public static final v1 f61576c = new v1(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f61577a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61578b;

    public v1(boolean z10) {
        this.f61577a = 0;
        this.f61578b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f61577a == v1Var.f61577a && this.f61578b == v1Var.f61578b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f61577a << 1) + (this.f61578b ? 1 : 0);
    }

    public v1(int i10, boolean z10) {
        this.f61577a = i10;
        this.f61578b = z10;
    }
}
