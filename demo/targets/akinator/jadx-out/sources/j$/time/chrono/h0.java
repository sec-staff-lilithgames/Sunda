package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class h0 extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f68486c = new h0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n u(int i10) {
        if (i10 == 0) {
            return k0.BEFORE_BE;
        }
        if (i10 == 1) {
            return k0.BE;
        }
        throw new j$.time.c("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String k() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final b q(int i10) {
        return new j0(j$.time.h.M(i10 - 543, 1, 1));
    }

    @Override // j$.time.chrono.m
    public final b x(j$.time.temporal.m mVar) {
        if (mVar instanceof j0) {
            return (j0) mVar;
        }
        return new j0(j$.time.h.D(mVar));
    }

    @Override // j$.time.chrono.m
    public final boolean H(long j10) {
        return t.f68512c.H(j10 - 543);
    }

    private h0() {
    }

    public final j$.time.temporal.t t(j$.time.temporal.a aVar) {
        int i10 = g0.f68480a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.t tVar = j$.time.temporal.a.PROLEPTIC_MONTH.f68639b;
            return j$.time.temporal.t.e(tVar.f68663a + 6516, tVar.f68666d + 6516);
        }
        if (i10 == 2) {
            j$.time.temporal.t tVar2 = j$.time.temporal.a.YEAR.f68639b;
            return j$.time.temporal.t.f(1L, (-(tVar2.f68663a + 543)) + 1, tVar2.f68666d + 543);
        }
        if (i10 != 3) {
            return aVar.f68639b;
        }
        j$.time.temporal.t tVar3 = j$.time.temporal.a.YEAR.f68639b;
        return j$.time.temporal.t.e(tVar3.f68663a + 543, tVar3.f68666d + 543);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
