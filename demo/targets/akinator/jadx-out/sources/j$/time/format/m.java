package j$.time.format;

/* loaded from: classes3.dex */
public final class m extends j {

    /* renamed from: h, reason: collision with root package name */
    public static final j$.time.h f68561h = j$.time.h.M(2000, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public final j$.time.chrono.b f68562g;

    public m(j$.time.temporal.p pVar, int i10, int i11, j$.time.chrono.b bVar, int i12) {
        super(pVar, i10, i11, a0.NOT_NEGATIVE, i12);
        this.f68562g = bVar;
    }

    @Override // j$.time.format.j
    public final long a(u uVar, long j10) {
        long jAbs = Math.abs(j10);
        j$.time.chrono.b bVar = this.f68562g;
        long jD = bVar != null ? j$.time.chrono.m.l(uVar.f68588a).x(bVar).d(this.f68548a) : 0;
        long[] jArr = j.f68547f;
        if (j10 >= jD) {
            long j11 = jArr[this.f68549b];
            if (j10 < jD + j11) {
                return jAbs % j11;
            }
        }
        return jAbs % jArr[this.f68550c];
    }

    @Override // j$.time.format.j
    public final j b() {
        if (this.f68552e == -1) {
            return this;
        }
        return new m(this.f68548a, this.f68549b, this.f68550c, this.f68562g, -1);
    }

    @Override // j$.time.format.j
    public final j c(int i10) {
        return new m(this.f68548a, this.f68549b, this.f68550c, this.f68562g, this.f68552e + i10);
    }

    @Override // j$.time.format.j
    public final String toString() {
        Object obj = this.f68562g;
        return "ReducedValue(" + this.f68548a + "," + this.f68549b + "," + this.f68550c + "," + (obj != null ? obj : 0) + ")";
    }
}
