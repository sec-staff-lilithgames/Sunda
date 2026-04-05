package bd;

import java.io.IOException;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g1 extends y0 implements zc.j {

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f9078f = "0123456789abcdef".toCharArray();

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f9079e;

    public g1() {
        this(null);
    }

    public static final void e(int i10, int i11, byte[] bArr) {
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static void f(int i10, char[] cArr, int i11) {
        char[] cArr2 = f9078f;
        cArr[i11] = cArr2[(i10 >> 12) & 15];
        cArr[i11 + 1] = cArr2[(i10 >> 8) & 15];
        cArr[i11 + 2] = cArr2[(i10 >> 4) & 15];
        cArr[i11 + 3] = cArr2[i10 & 15];
    }

    @Override // bd.y0, bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectStringFormat(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // zc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w createContextual(jc.u0 r2, jc.g r3) throws jc.r {
        /*
            r1 = this;
            java.lang.Class r0 = r1.handledType()
            tb.t r2 = bd.z0.c(r0, r2, r3)
            if (r2 == 0) goto L1c
            tb.s r2 = r2.getShape()
            tb.s r3 = tb.s.f86767b
            if (r2 != r3) goto L15
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L1d
        L15:
            tb.s r3 = tb.s.f86771g
            if (r2 != r3) goto L1c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L1d
        L1c:
            r2 = 0
        L1d:
            java.lang.Boolean r3 = r1.f9079e
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L2b
            bd.g1 r3 = new bd.g1
            r3.<init>(r2)
            return r3
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.g1.createContextual(jc.u0, jc.g):jc.w");
    }

    public g1(Boolean bool) {
        super(UUID.class);
        this.f9079e = bool;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // bd.z0, jc.w
    public void serialize(UUID uuid, ub.o oVar, jc.u0 u0Var) throws IOException {
        Boolean bool = this.f9079e;
        if (bool != null ? bool.booleanValue() : !(oVar instanceof dd.k0) && oVar.canWriteBinaryNatively()) {
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            e((int) (mostSignificantBits >> 32), 0, bArr);
            e((int) mostSignificantBits, 4, bArr);
            e((int) (leastSignificantBits >> 32), 8, bArr);
            e((int) leastSignificantBits, 12, bArr);
            oVar.writeBinary(bArr);
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        int i10 = (int) (mostSignificantBits2 >> 32);
        f(i10 >> 16, cArr, 0);
        f(i10, cArr, 4);
        cArr[8] = '-';
        int i11 = (int) mostSignificantBits2;
        f(i11 >>> 16, cArr, 9);
        cArr[13] = '-';
        f(i11, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        f((int) (leastSignificantBits2 >>> 48), cArr, 19);
        cArr[23] = '-';
        f((int) (leastSignificantBits2 >>> 32), cArr, 24);
        int i12 = (int) leastSignificantBits2;
        f(i12 >> 16, cArr, 28);
        f(i12, cArr, 32);
        oVar.writeString(cArr, 0, 36);
    }
}
