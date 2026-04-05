package wr;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f91090a = Charset.forName(C.ASCII_NAME);

    /* renamed from: b, reason: collision with root package name */
    public static final ph.o f91091b = e4.f90906e;

    public static int headerCount(e4 e4Var) {
        return e4Var.f90908b;
    }

    public static <T> z3 keyOf(String str, o2 o2Var) {
        boolean z10 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        BitSet bitSet = z3.f91222e;
        return new c4(str, z10, o2Var);
    }

    public static e4 newMetadata(byte[]... bArr) {
        return new e4(bArr.length / 2, bArr);
    }

    public static e4 newMetadataWithParsedValues(int i10, Object[] objArr) {
        return new e4(i10, objArr);
    }

    public static <T> Object parsedValue(w3 w3Var, T t10) {
        return new b4(t10);
    }

    public static byte[][] serialize(e4 e4Var) {
        int i10 = e4Var.f90908b * 2;
        byte[][] bArr = new byte[i10][];
        Object[] objArr = e4Var.f90907a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i10);
            return bArr;
        }
        for (int i11 = 0; i11 < e4Var.f90908b; i11++) {
            int i12 = i11 * 2;
            bArr[i12] = e4Var.d(i11);
            int i13 = i12 + 1;
            Object objE = e4Var.e(i11);
            if (!(objE instanceof byte[])) {
                synchronized (((b4) objE)) {
                    throw null;
                }
            }
            bArr[i13] = (byte[]) objE;
        }
        return bArr;
    }

    public static Object[] serializePartial(e4 e4Var) {
        Object[] objArr = new Object[e4Var.f90908b * 2];
        for (int i10 = 0; i10 < e4Var.f90908b; i10++) {
            int i11 = i10 * 2;
            objArr[i11] = e4Var.d(i10);
            int i12 = i11 + 1;
            Object objE = e4Var.e(i10);
            if (!(objE instanceof byte[])) {
                ((b4) objE).getClass();
                throw null;
            }
            objArr[i12] = objE;
        }
        return objArr;
    }

    public static <T> z3 keyOf(String str, t3 t3Var) {
        boolean z10 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        BitSet bitSet = z3.f91222e;
        return new s3(str, z10, t3Var);
    }

    public static e4 newMetadata(int i10, byte[]... bArr) {
        return new e4(i10, bArr);
    }
}
