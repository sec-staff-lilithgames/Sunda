package ko;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f71810c = new z0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f71811a;

    /* renamed from: b, reason: collision with root package name */
    public final long f71812b;

    public z0(long j10, long j11) {
        this.f71811a = j10;
        this.f71812b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f71811a == z0Var.f71811a && this.f71812b == z0Var.f71812b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f71811a) * 31) + ((int) this.f71812b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f71811a);
        sb2.append(", position=");
        return a.b.g(this.f71812b, C3191e4.i.f36531e, sb2);
    }
}
