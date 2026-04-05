package v4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f89028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89029b;

    /* renamed from: c, reason: collision with root package name */
    public final long f89030c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f89031d;

    public d(int i10, int i11, byte[] bArr) {
        this(-1L, bArr, i10, i11);
    }

    public static d createByte(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(c.f88993f0);
        return new d(1, bytes.length, bytes);
    }

    public static d createDouble(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c.W[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d10 : dArr) {
            byteBufferWrap.putDouble(d10);
        }
        return new d(12, dArr.length, byteBufferWrap.array());
    }

    public static d createSLong(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c.W[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putInt(i10);
        }
        return new d(9, iArr.length, byteBufferWrap.array());
    }

    public static d createSRational(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c.W[10] * fVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (f fVar : fVarArr) {
            byteBufferWrap.putInt((int) fVar.f89036a);
            byteBufferWrap.putInt((int) fVar.f89037b);
        }
        return new d(10, fVarArr.length, byteBufferWrap.array());
    }

    public static d createString(String str) {
        byte[] bytes = (str + (char) 0).getBytes(c.f88993f0);
        return new d(2, bytes.length, bytes);
    }

    public static d createULong(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c.W[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new d(4, jArr.length, byteBufferWrap.array());
    }

    public static d createURational(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c.W[5] * fVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (f fVar : fVarArr) {
            byteBufferWrap.putInt((int) fVar.f89036a);
            byteBufferWrap.putInt((int) fVar.f89037b);
        }
        return new d(5, fVarArr.length, byteBufferWrap.array());
    }

    public static d createUShort(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c.W[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putShort((short) i10);
        }
        return new d(3, iArr.length, byteBufferWrap.array());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x002e: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:47), block:B:17:0x002e */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r12v25, types: [v4.f[]] */
    /* JADX WARN: Type inference failed for: r12v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v28, types: [v4.f[]] */
    /* JADX WARN: Type inference failed for: r12v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.nio.ByteOrder r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.a(java.nio.ByteOrder):java.io.Serializable");
    }

    public double getDoubleValue(ByteOrder byteOrder) throws Throwable {
        Object objA = a(byteOrder);
        if (objA == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objA instanceof String) {
            return Double.parseDouble((String) objA);
        }
        if (objA instanceof long[]) {
            if (((long[]) objA).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objA instanceof int[]) {
            if (((int[]) objA).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objA instanceof double[]) {
            double[] dArr = (double[]) objA;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objA instanceof f[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        f[] fVarArr = (f[]) objA;
        if (fVarArr.length == 1) {
            return fVarArr[0].calculate();
        }
        throw new NumberFormatException("There are more than one component");
    }

    public int getIntValue(ByteOrder byteOrder) throws Throwable {
        Object objA = a(byteOrder);
        if (objA == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objA instanceof String) {
            return Integer.parseInt((String) objA);
        }
        if (objA instanceof long[]) {
            long[] jArr = (long[]) objA;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objA instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objA;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public String getStringValue(ByteOrder byteOrder) throws Throwable {
        Object objA = a(byteOrder);
        if (objA == null) {
            return null;
        }
        if (objA instanceof String) {
            return (String) objA;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (objA instanceof long[]) {
            long[] jArr = (long[]) objA;
            while (i10 < jArr.length) {
                sb2.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objA instanceof int[]) {
            int[] iArr = (int[]) objA;
            while (i10 < iArr.length) {
                sb2.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objA instanceof double[]) {
            double[] dArr = (double[]) objA;
            while (i10 < dArr.length) {
                sb2.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(objA instanceof f[])) {
            return null;
        }
        f[] fVarArr = (f[]) objA;
        while (i10 < fVarArr.length) {
            sb2.append(fVarArr[i10].f89036a);
            sb2.append('/');
            sb2.append(fVarArr[i10].f89037b);
            i10++;
            if (i10 != fVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    public int size() {
        return c.W[this.f89028a] * this.f89029b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(c.V[this.f89028a]);
        sb2.append(", data length:");
        return a.b.f(this.f89031d.length, ")", sb2);
    }

    public d(long j10, byte[] bArr, int i10, int i11) {
        this.f89028a = i10;
        this.f89029b = i11;
        this.f89030c = j10;
        this.f89031d = bArr;
    }

    public static d createDouble(double d10, ByteOrder byteOrder) {
        return createDouble(new double[]{d10}, byteOrder);
    }

    public static d createSLong(int i10, ByteOrder byteOrder) {
        return createSLong(new int[]{i10}, byteOrder);
    }

    public static d createULong(long j10, ByteOrder byteOrder) {
        return createULong(new long[]{j10}, byteOrder);
    }

    public static d createUShort(int i10, ByteOrder byteOrder) {
        return createUShort(new int[]{i10}, byteOrder);
    }

    public static d createSRational(f fVar, ByteOrder byteOrder) {
        return createSRational(new f[]{fVar}, byteOrder);
    }

    public static d createURational(f fVar, ByteOrder byteOrder) {
        return createURational(new f[]{fVar}, byteOrder);
    }
}
