package on;

import ao.k0;
import gn.u1;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f79576a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f79577b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79578c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f79579d;

    /* renamed from: e, reason: collision with root package name */
    public final long f79580e;

    /* renamed from: f, reason: collision with root package name */
    public final u1 f79581f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79582g;

    /* renamed from: h, reason: collision with root package name */
    public final k0 f79583h;

    /* renamed from: i, reason: collision with root package name */
    public final long f79584i;

    /* renamed from: j, reason: collision with root package name */
    public final long f79585j;

    public b(long j10, u1 u1Var, int i10, k0 k0Var, long j11, u1 u1Var2, int i11, k0 k0Var2, long j12, long j13) {
        this.f79576a = j10;
        this.f79577b = u1Var;
        this.f79578c = i10;
        this.f79579d = k0Var;
        this.f79580e = j11;
        this.f79581f = u1Var2;
        this.f79582g = i11;
        this.f79583h = k0Var2;
        this.f79584i = j12;
        this.f79585j = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f79576a == bVar.f79576a && this.f79578c == bVar.f79578c && this.f79580e == bVar.f79580e && this.f79582g == bVar.f79582g && this.f79584i == bVar.f79584i && this.f79585j == bVar.f79585j && Objects.equals(this.f79577b, bVar.f79577b) && Objects.equals(this.f79579d, bVar.f79579d) && Objects.equals(this.f79581f, bVar.f79581f) && Objects.equals(this.f79583h, bVar.f79583h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f79576a), this.f79577b, Integer.valueOf(this.f79578c), this.f79579d, Long.valueOf(this.f79580e), this.f79581f, Integer.valueOf(this.f79582g), this.f79583h, Long.valueOf(this.f79584i), Long.valueOf(this.f79585j));
    }
}
