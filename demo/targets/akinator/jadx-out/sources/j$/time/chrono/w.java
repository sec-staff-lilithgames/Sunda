package j$.time.chrono;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class w extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final w f68515c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String k() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String o() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final b q(int i10) {
        return new y(j$.time.h.M(i10, 1, 1));
    }

    @Override // j$.time.chrono.m
    public final b x(j$.time.temporal.m mVar) {
        if (mVar instanceof y) {
            return (y) mVar;
        }
        return new y(j$.time.h.D(mVar));
    }

    @Override // j$.time.chrono.m
    public final boolean H(long j10) {
        return t.f68512c.H(j10);
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final n u(int i10) {
        return z.o(i10);
    }

    public final j$.time.temporal.t t(j$.time.temporal.a aVar) {
        switch (v.f68514a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.s("Unsupported field: " + aVar);
            case 5:
                z[] zVarArr = z.f68522e;
                int i10 = zVarArr[zVarArr.length - 1].f68524b.f68601a;
                int iMin = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - zVarArr[zVarArr.length - 1].f68524b.f68601a;
                int i11 = zVarArr[0].f68524b.f68601a;
                int i12 = 1;
                while (true) {
                    z[] zVarArr2 = z.f68522e;
                    if (i12 >= zVarArr2.length) {
                        return j$.time.temporal.t.f(1L, iMin, 999999999 - i10);
                    }
                    z zVar = zVarArr2[i12];
                    iMin = Math.min(iMin, (zVar.f68524b.f68601a - i11) + 1);
                    i11 = zVar.f68524b.f68601a;
                    i12++;
                }
            case 6:
                z zVar2 = z.f68521d;
                long j10 = j$.time.temporal.a.DAY_OF_YEAR.f68639b.f68665c;
                long jMin = j10;
                for (z zVar3 : z.f68522e) {
                    long jMin2 = Math.min(jMin, (zVar3.f68524b.E() - zVar3.f68524b.J()) + 1);
                    jMin = zVar3.l() != null ? Math.min(jMin2, zVar3.l().f68524b.J() - 1) : jMin2;
                }
                return j$.time.temporal.t.f(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.f68639b.f68666d);
            case 7:
                return j$.time.temporal.t.e(y.f68517d.f68601a, 999999999L);
            case 8:
                long j11 = z.f68521d.f68523a;
                z[] zVarArr3 = z.f68522e;
                return j$.time.temporal.t.e(j11, zVarArr3[zVarArr3.length - 1].f68523a);
            default:
                return aVar.f68639b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
