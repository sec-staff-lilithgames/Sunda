package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class z implements n, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final z f68521d;

    /* renamed from: e, reason: collision with root package name */
    public static final z[] f68522e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f68523a;

    /* renamed from: b, reason: collision with root package name */
    public final transient j$.time.h f68524b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f68525c;

    static {
        z zVar = new z(-1, j$.time.h.M(1868, 1, 1), "Meiji");
        f68521d = zVar;
        f68522e = new z[]{zVar, new z(0, j$.time.h.M(1912, 7, 30), "Taisho"), new z(1, j$.time.h.M(1926, 12, 25), "Showa"), new z(2, j$.time.h.M(1989, 1, 8), "Heisei"), new z(3, j$.time.h.M(2019, 5, 1), "Reiwa")};
    }

    public final z l() {
        if (this == f68522e[r0.length - 1]) {
            return null;
        }
        return o(this.f68523a + 1);
    }

    public z(int i10, j$.time.h hVar, String str) {
        this.f68523a = i10;
        this.f68524b = hVar;
        this.f68525c = str;
    }

    public static z o(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            z[] zVarArr = f68522e;
            if (i11 < zVarArr.length) {
                return zVarArr[i11];
            }
        }
        throw new j$.time.c("Invalid era: " + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.chrono.z k(j$.time.h r6) {
        /*
            j$.time.h r0 = j$.time.chrono.y.f68517d
            r1 = 1
            if (r0 == 0) goto Lf
            r6.getClass()
            int r0 = r6.r(r0)
            if (r0 >= 0) goto L1d
            goto L1b
        Lf:
            long r2 = r6.z()
            long r4 = r0.z()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L1d
        L1b:
            r0 = r1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 != 0) goto L38
            j$.time.chrono.z[] r0 = j$.time.chrono.z.f68522e
            int r0 = r0.length
            int r0 = r0 - r1
        L24:
            if (r0 < 0) goto L36
            j$.time.chrono.z[] r1 = j$.time.chrono.z.f68522e
            r1 = r1[r0]
            j$.time.h r2 = r1.f68524b
            int r2 = r6.compareTo(r2)
            if (r2 < 0) goto L33
            return r1
        L33:
            int r0 = r0 + (-1)
            goto L24
        L36:
            r6 = 0
            return r6
        L38:
            j$.time.c r6 = new j$.time.c
            java.lang.String r0 = "JapaneseDate before Meiji 6 are not supported"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.z.k(j$.time.h):j$.time.chrono.z");
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f68523a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.t i(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (pVar == aVar) {
            return w.f68515c.t(aVar);
        }
        return super.i(pVar);
    }

    public final String toString() {
        return this.f68525c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 5, this);
    }
}
