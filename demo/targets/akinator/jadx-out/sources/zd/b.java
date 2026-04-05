package zd;

import bf.d0;
import com.google.android.exoplayer2.m3;
import mh.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f97797a;

    /* renamed from: b, reason: collision with root package name */
    public final m3 f97798b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97799c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f97800d;

    /* renamed from: e, reason: collision with root package name */
    public final long f97801e;

    /* renamed from: f, reason: collision with root package name */
    public final m3 f97802f;

    /* renamed from: g, reason: collision with root package name */
    public final int f97803g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f97804h;

    /* renamed from: i, reason: collision with root package name */
    public final long f97805i;

    /* renamed from: j, reason: collision with root package name */
    public final long f97806j;

    public b(long j10, m3 m3Var, int i10, d0 d0Var, long j11, m3 m3Var2, int i11, d0 d0Var2, long j12, long j13) {
        this.f97797a = j10;
        this.f97798b = m3Var;
        this.f97799c = i10;
        this.f97800d = d0Var;
        this.f97801e = j11;
        this.f97802f = m3Var2;
        this.f97803g = i11;
        this.f97804h = d0Var2;
        this.f97805i = j12;
        this.f97806j = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f97797a == bVar.f97797a && this.f97799c == bVar.f97799c && this.f97801e == bVar.f97801e && this.f97803g == bVar.f97803g && this.f97805i == bVar.f97805i && this.f97806j == bVar.f97806j && h1.equal(this.f97798b, bVar.f97798b) && h1.equal(this.f97800d, bVar.f97800d) && h1.equal(this.f97802f, bVar.f97802f) && h1.equal(this.f97804h, bVar.f97804h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return h1.hashCode(Long.valueOf(this.f97797a), this.f97798b, Integer.valueOf(this.f97799c), this.f97800d, Long.valueOf(this.f97801e), this.f97802f, Integer.valueOf(this.f97803g), this.f97804h, Long.valueOf(this.f97805i), Long.valueOf(this.f97806j));
    }
}
