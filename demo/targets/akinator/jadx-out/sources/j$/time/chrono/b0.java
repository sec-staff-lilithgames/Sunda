package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class b0 extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f68470c = new b0();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String k() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n u(int i10) {
        if (i10 == 0) {
            return e0.BEFORE_ROC;
        }
        if (i10 == 1) {
            return e0.ROC;
        }
        throw new j$.time.c("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final b q(int i10) {
        return new d0(j$.time.h.M(i10 + 1911, 1, 1));
    }

    @Override // j$.time.chrono.m
    public final b x(j$.time.temporal.m mVar) {
        if (mVar instanceof d0) {
            return (d0) mVar;
        }
        return new d0(j$.time.h.D(mVar));
    }

    @Override // j$.time.chrono.m
    public final boolean H(long j10) {
        return t.f68512c.H(j10 + 1911);
    }

    public final j$.time.temporal.t t(j$.time.temporal.a aVar) {
        int i10 = a0.f68469a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.f68639b;
            return j$.time.temporal.t.e(tVar.f68663a - 22932, tVar.f68666d - 22932);
        }
        if (i10 == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.f68639b;
            return j$.time.temporal.t.f(1L, tVar2.f68666d - 1911, (-tVar2.f68663a) + 1912);
        }
        if (i10 != 3) {
            return aVar.f68639b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.f68639b;
        return j$.time.temporal.t.e(tVar3.f68663a - 1911, tVar3.f68666d - 1911);
    }

    private b0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
