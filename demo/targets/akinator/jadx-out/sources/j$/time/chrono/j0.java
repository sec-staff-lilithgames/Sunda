package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class j0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: a, reason: collision with root package name */
    public final transient j$.time.h f68489a;

    @Override // j$.time.chrono.b
    public final e A(j$.time.k kVar) {
        return new g(this, kVar);
    }

    public j0(j$.time.h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f68489a = hVar;
    }

    @Override // j$.time.chrono.b
    public final m getChronology() {
        return h0.f68486c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        h0.f68486c.getClass();
        return this.f68489a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.b
    public final n B() {
        return J() >= 1 ? k0.BE : k0.BEFORE_BE;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.t(this);
        }
        if (!e(pVar)) {
            throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i10 = i0.f68488a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f68489a.i(pVar);
        }
        if (i10 != 4) {
            return h0.f68486c.t(aVar);
        }
        j$.time.temporal.t tVar = j$.time.temporal.a.YEAR.f68639b;
        return j$.time.temporal.t.e(1L, J() <= 0 ? (-(tVar.f68663a + 543)) + 1 : 543 + tVar.f68666d);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = i0.f68488a[((j$.time.temporal.a) pVar).ordinal()];
            if (i10 == 4) {
                int iJ = J();
                if (iJ < 1) {
                    iJ = 1 - iJ;
                }
                return iJ;
            }
            if (i10 == 5) {
                return ((J() * 12) + this.f68489a.f68602b) - 1;
            }
            if (i10 == 6) {
                return J();
            }
            if (i10 != 7) {
                return this.f68489a.f(pVar);
            }
            return J() < 1 ? 0 : 1;
        }
        return pVar.D(this);
    }

    public final int J() {
        return this.f68489a.f68601a + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.j0 g(long r8, j$.time.temporal.p r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9f
            r0 = r10
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r7.f(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.i0.f68488a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L49
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L49
            if (r2 == r3) goto L49
            goto L5f
        L25:
            j$.time.chrono.h0 r10 = j$.time.chrono.h0.f68486c
            j$.time.temporal.t r10 = r10.t(r0)
            r10.b(r8, r0)
            int r10 = r7.J()
            long r0 = (long) r10
            r2 = 12
            long r0 = r0 * r2
            j$.time.h r10 = r7.f68489a
            short r2 = r10.f68602b
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 1
            long r0 = r0 - r2
            long r8 = r8 - r0
            j$.time.h r8 = r10.Q(r8)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L49:
            j$.time.chrono.h0 r2 = j$.time.chrono.h0.f68486c
            j$.time.temporal.t r2 = r2.t(r0)
            int r2 = r2.a(r8, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L88
            if (r0 == r4) goto L7b
            if (r0 == r3) goto L6a
        L5f:
            j$.time.h r0 = r7.f68489a
            j$.time.h r8 = r0.g(r8, r10)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L6a:
            j$.time.h r8 = r7.f68489a
            int r9 = r7.J()
            int r9 = (-542) - r9
            j$.time.h r8 = r8.W(r9)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L7b:
            j$.time.h r8 = r7.f68489a
            int r2 = r2 + (-543)
            j$.time.h r8 = r8.W(r2)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L88:
            j$.time.h r8 = r7.f68489a
            int r9 = r7.J()
            r10 = 1
            if (r9 < r10) goto L92
            goto L94
        L92:
            int r2 = 1 - r2
        L94:
            int r2 = r2 + (-543)
            j$.time.h r8 = r8.W(r2)
            j$.time.chrono.j0 r8 = r7.L(r8)
            return r8
        L9f:
            j$.time.chrono.b r8 = super.g(r8, r10)
            j$.time.chrono.j0 r8 = (j$.time.chrono.j0) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.j0.g(long, j$.time.temporal.p):j$.time.chrono.j0");
    }

    @Override // j$.time.chrono.d
    /* renamed from: I */
    public final b w(j$.time.temporal.n nVar) {
        return (j0) super.w(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(j$.time.h hVar) {
        return (j0) super.w(hVar);
    }

    @Override // j$.time.chrono.d
    public final b G(long j10) {
        return L(this.f68489a.R(j10));
    }

    @Override // j$.time.chrono.d
    public final b D(long j10) {
        return L(this.f68489a.Q(j10));
    }

    @Override // j$.time.chrono.d
    public final b t(long j10) {
        return L(this.f68489a.P(j10));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b j(long j10, j$.time.temporal.r rVar) {
        return (j0) super.j(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l j(long j10, j$.time.temporal.r rVar) {
        return (j0) super.j(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final b a(long j10, j$.time.temporal.r rVar) {
        return (j0) super.a(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return (j0) super.a(j10, rVar);
    }

    public final j0 L(j$.time.h hVar) {
        return hVar.equals(this.f68489a) ? this : new j0(hVar);
    }

    @Override // j$.time.chrono.b
    public final long z() {
        return this.f68489a.z();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f68489a.equals(((j0) obj).f68489a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 8, this);
    }
}
