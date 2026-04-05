package j$.time.format;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public class j implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f68547f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.p f68548a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68549b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68550c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f68551d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68552e;

    public long a(u uVar, long j10) {
        return j10;
    }

    public j(j$.time.temporal.p pVar, int i10, int i11, a0 a0Var) {
        this.f68548a = pVar;
        this.f68549b = i10;
        this.f68550c = i11;
        this.f68551d = a0Var;
        this.f68552e = 0;
    }

    public j(j$.time.temporal.p pVar, int i10, int i11, a0 a0Var, int i12) {
        this.f68548a = pVar;
        this.f68549b = i10;
        this.f68550c = i11;
        this.f68551d = a0Var;
        this.f68552e = i12;
    }

    public j b() {
        if (this.f68552e == -1) {
            return this;
        }
        return new j(this.f68548a, this.f68549b, this.f68550c, this.f68551d, -1);
    }

    public j c(int i10) {
        return new j(this.f68548a, this.f68549b, this.f68550c, this.f68551d, this.f68552e + i10);
    }

    @Override // j$.time.format.f
    public boolean r(u uVar, StringBuilder sb2) {
        j$.time.temporal.p pVar = this.f68548a;
        Long lA = uVar.a(pVar);
        if (lA == null) {
            return false;
        }
        long jA = a(uVar, lA.longValue());
        y yVar = uVar.f68589b.f68533c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i10 = this.f68550c;
        if (length > i10) {
            throw new j$.time.c("Field " + pVar + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i10);
        }
        yVar.getClass();
        int i11 = this.f68549b;
        a0 a0Var = this.f68551d;
        if (jA >= 0) {
            int i12 = c.f68540a[a0Var.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb2.append('+');
                }
            } else if (i11 < 19 && jA >= f68547f[i11]) {
                sb2.append('+');
            }
        } else {
            int i13 = c.f68540a[a0Var.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb2.append('-');
            } else if (i13 == 4) {
                throw new j$.time.c("Field " + pVar + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - string.length(); i14++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public String toString() {
        int i10 = this.f68550c;
        j$.time.temporal.p pVar = this.f68548a;
        a0 a0Var = this.f68551d;
        int i11 = this.f68549b;
        if (i11 == 1 && i10 == 19 && a0Var == a0.NORMAL) {
            return "Value(" + pVar + ")";
        }
        if (i11 == i10 && a0Var == a0.NOT_NEGATIVE) {
            return "Value(" + pVar + "," + i11 + ")";
        }
        return "Value(" + pVar + "," + i11 + "," + i10 + "," + a0Var + ")";
    }
}
