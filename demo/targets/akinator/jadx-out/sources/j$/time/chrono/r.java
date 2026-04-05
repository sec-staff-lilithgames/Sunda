package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class r extends d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a, reason: collision with root package name */
    public final transient p f68507a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f68508b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f68509c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f68510d;

    @Override // j$.time.chrono.b
    public final e A(j$.time.k kVar) {
        return new g(this, kVar);
    }

    public r(p pVar, int i10, int i11, int i12) {
        pVar.I(i10, i11, i12);
        this.f68507a = pVar;
        this.f68508b = i10;
        this.f68509c = i11;
        this.f68510d = i12;
    }

    public r(p pVar, long j10) {
        int i10 = (int) j10;
        pVar.t();
        if (i10 < pVar.f68499e || i10 >= pVar.f68500f) {
            throw new j$.time.c("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(pVar.f68498d, i10);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {pVar.G(iBinarySearch), ((pVar.f68501g + iBinarySearch) % 12) + 1, (i10 - pVar.f68498d[iBinarySearch]) + 1};
        this.f68507a = pVar;
        this.f68508b = iArr[0];
        this.f68509c = iArr[1];
        this.f68510d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final m getChronology() {
        return this.f68507a;
    }

    @Override // j$.time.chrono.b
    public final n B() {
        return s.AH;
    }

    @Override // j$.time.chrono.b
    public final int E() {
        return this.f68507a.M(this.f68508b, 12);
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
        int i10 = q.f68506a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f68507a.L(aVar) : j$.time.temporal.t.e(1L, 5L) : j$.time.temporal.t.e(1L, E()) : j$.time.temporal.t.e(1L, this.f68507a.J(this.f68508b, this.f68509c));
    }

    @Override // j$.time.temporal.m
    public final long f(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.D(this);
        }
        switch (q.f68506a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f68510d;
            case 2:
                return J();
            case 3:
                return ((this.f68510d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(z() + 3, 7)) + 1;
            case 5:
                return ((this.f68510d - 1) % 7) + 1;
            case 6:
                return ((J() - 1) % 7) + 1;
            case 7:
                return z();
            case 8:
                return ((J() - 1) / 7) + 1;
            case 9:
                return this.f68509c;
            case 10:
                return ((this.f68508b * 12) + this.f68509c) - 1;
            case 11:
                return this.f68508b;
            case 12:
                return this.f68508b;
            case 13:
                return this.f68508b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final r g(long j10, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (r) super.g(j10, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        this.f68507a.L(aVar).b(j10, aVar);
        int i10 = (int) j10;
        switch (q.f68506a[aVar.ordinal()]) {
            case 1:
                return M(this.f68508b, this.f68509c, i10);
            case 2:
                return t(Math.min(i10, E()) - J());
            case 3:
                return t((j10 - f(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return t(j10 - (((int) Math.floorMod(z() + 3, 7)) + 1));
            case 5:
                return t(j10 - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return t(j10 - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(this.f68507a, j10);
            case 8:
                return t((j10 - f(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return M(this.f68508b, i10, this.f68510d);
            case 10:
                return D(j10 - (((this.f68508b * 12) + this.f68509c) - 1));
            case 11:
                if (this.f68508b < 1) {
                    i10 = 1 - i10;
                }
                return M(i10, this.f68509c, this.f68510d);
            case 12:
                return M(i10, this.f68509c, this.f68510d);
            case 13:
                return M(1 - this.f68508b, this.f68509c, this.f68510d);
            default:
                throw new j$.time.temporal.s(j$.time.d.a("Unsupported field: ", pVar));
        }
    }

    public final r M(int i10, int i11, int i12) {
        int iJ = this.f68507a.J(i10, i11);
        if (i12 > iJ) {
            i12 = iJ;
        }
        return new r(this.f68507a, i10, i11, i12);
    }

    @Override // j$.time.chrono.d
    /* renamed from: I */
    public final b w(j$.time.temporal.n nVar) {
        return (r) super.w(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    /* renamed from: h */
    public final j$.time.temporal.l w(j$.time.h hVar) {
        return (r) super.w(hVar);
    }

    @Override // j$.time.chrono.b
    public final long z() {
        return this.f68507a.I(this.f68508b, this.f68509c, this.f68510d);
    }

    public final int J() {
        return this.f68507a.M(this.f68508b, this.f68509c - 1) + this.f68510d;
    }

    @Override // j$.time.chrono.b
    public final boolean s() {
        return this.f68507a.H(this.f68508b);
    }

    @Override // j$.time.chrono.d
    public final b G(long j10) {
        return j10 == 0 ? this : M(Math.addExact(this.f68508b, (int) j10), this.f68509c, this.f68510d);
    }

    @Override // j$.time.chrono.d
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final r D(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f68508b * 12) + (this.f68509c - 1) + j10;
        p pVar = this.f68507a;
        long jFloorDiv = Math.floorDiv(j11, 12L);
        if (jFloorDiv >= pVar.G(0) && jFloorDiv <= pVar.G(pVar.f68498d.length - 1) - 1) {
            return M((int) jFloorDiv, ((int) Math.floorMod(j11, 12L)) + 1, this.f68510d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final r t(long j10) {
        return new r(this.f68507a, z() + j10);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.l
    public final b j(long j10, j$.time.temporal.r rVar) {
        return (r) super.j(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l j(long j10, j$.time.temporal.r rVar) {
        return (r) super.j(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final b a(long j10, j$.time.temporal.r rVar) {
        return (r) super.a(j10, rVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.l a(long j10, j$.time.temporal.r rVar) {
        return (r) super.a(j10, rVar);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f68508b == rVar.f68508b && this.f68509c == rVar.f68509c && this.f68510d == rVar.f68510d && this.f68507a.equals(rVar.f68507a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i10 = this.f68508b;
        int i11 = this.f68509c;
        int i12 = this.f68510d;
        this.f68507a.getClass();
        return (((i10 << 11) + (i11 << 6)) + i12) ^ ((i10 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 6, this);
    }
}
