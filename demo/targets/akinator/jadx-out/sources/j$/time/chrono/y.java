package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class y extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final j$.time.h f68517d = j$.time.h.M(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a, reason: collision with root package name */
    public final transient j$.time.h f68518a;

    /* renamed from: b, reason: collision with root package name */
    public final transient z f68519b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f68520c;

    @Override // j$.time.chrono.b
    public final e A(j$.time.k kVar) {
        return new g(this, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(j$.time.h r7) {
        /*
            r6 = this;
            r6.<init>()
            j$.time.h r0 = j$.time.chrono.y.f68517d
            r1 = 1
            if (r0 == 0) goto L12
            r7.getClass()
            int r0 = r7.r(r0)
            if (r0 >= 0) goto L20
            goto L1e
        L12:
            long r2 = r7.z()
            long r4 = r0.z()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L20
        L1e:
            r0 = r1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L36
            j$.time.chrono.z r0 = j$.time.chrono.z.k(r7)
            r6.f68519b = r0
            int r2 = r7.f68601a
            j$.time.h r0 = r0.f68524b
            int r0 = r0.f68601a
            int r2 = r2 - r0
            int r2 = r2 + r1
            r6.f68520c = r2
            r6.f68518a = r7
            return
        L36:
            j$.time.c r7 = new j$.time.c
            java.lang.String r0 = "JapaneseDate before Meiji 6 is not supported"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.<init>(j$.time.h):void");
    }

    @Override // j$.time.chrono.b
    public final m getChronology() {
        return w.f68515c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        w.f68515c.getClass();
        return this.f68518a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.b
    public final n B() {
        return this.f68519b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // j$.time.chrono.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E() {
        /*
            r4 = this;
            j$.time.chrono.z r0 = r4.f68519b
            j$.time.chrono.z r0 = r0.l()
            r1 = 1
            if (r0 == 0) goto L19
            j$.time.h r0 = r0.f68524b
            int r2 = r0.f68601a
            j$.time.h r3 = r4.f68518a
            int r3 = r3.f68601a
            if (r2 != r3) goto L19
            int r0 = r0.J()
            int r0 = r0 - r1
            goto L1f
        L19:
            j$.time.h r0 = r4.f68518a
            int r0 = r0.E()
        L1f:
            int r2 = r4.f68520c
            if (r2 != r1) goto L2d
            j$.time.chrono.z r2 = r4.f68519b
            j$.time.h r2 = r2.f68524b
            int r2 = r2.J()
            int r2 = r2 - r1
            int r0 = r0 - r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.E():int");
    }

    @Override // j$.time.chrono.b, j$.time.temporal.m
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.r(this);
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
        int i10 = x.f68516a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.t.e(1L, this.f68518a.K());
        }
        if (i10 == 2) {
            return j$.time.temporal.t.e(1L, E());
        }
        if (i10 != 3) {
            return w.f68515c.t(aVar);
        }
        z zVar = this.f68519b;
        int i11 = zVar.f68524b.f68601a;
        return zVar.l() != null ? j$.time.temporal.t.e(1L, (r6.f68524b.f68601a - i11) + 1) : j$.time.temporal.t.e(1L, 999999999 - i11);
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.D(this);
        }
        switch (x.f68516a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 2:
                return this.f68520c == 1 ? (this.f68518a.J() - this.f68519b.f68524b.J()) + 1 : this.f68518a.J();
            case 3:
                return this.f68520c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", pVar));
            case 8:
                return this.f68519b.f68523a;
            default:
                return this.f68518a.f(pVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final y g(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (f(aVar) == j10) {
                return this;
            }
            int[] iArr = x.f68516a;
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                int iA = w.f68515c.t(aVar).a(j10, aVar);
                int i11 = iArr[aVar.ordinal()];
                if (i11 == 3) {
                    return L(this.f68519b, iA);
                }
                if (i11 == 8) {
                    return L(z.o(iA), this.f68520c);
                }
                if (i11 == 9) {
                    return K(this.f68518a.W(iA));
                }
            }
            return K(this.f68518a.g(j10, pVar));
        }
        return (y) super.g(j10, pVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: I */
    public final b w(j$.time.temporal.n nVar) {
        return (y) super.w(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(j$.time.h hVar) {
        return (y) super.w(hVar);
    }

    public final y L(z zVar, int i10) {
        w.f68515c.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i11 = zVar.f68524b.f68601a;
        int i12 = (i11 + i10) - 1;
        if (i10 != 1 && (i12 < -999999999 || i12 > 999999999 || i12 < i11 || zVar != z.k(j$.time.h.M(i12, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return K(this.f68518a.W(i12));
    }

    @Override // j$.time.chrono.d
    public final b G(long j10) {
        return K(this.f68518a.R(j10));
    }

    @Override // j$.time.chrono.d
    public final b D(long j10) {
        return K(this.f68518a.Q(j10));
    }

    @Override // j$.time.chrono.d
    public final b t(long j10) {
        return K(this.f68518a.P(j10));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b j(long j10, j$.time.temporal.r rVar) {
        return (y) super.j(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l j(long j10, j$.time.temporal.r rVar) {
        return (y) super.j(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final b a(long j10, j$.time.temporal.r rVar) {
        return (y) super.a(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return (y) super.a(j10, rVar);
    }

    public final y K(j$.time.h hVar) {
        return hVar.equals(this.f68518a) ? this : new y(hVar);
    }

    @Override // j$.time.chrono.b
    public final long z() {
        return this.f68518a.z();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f68518a.equals(((y) obj).f68518a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 4, this);
    }
}
