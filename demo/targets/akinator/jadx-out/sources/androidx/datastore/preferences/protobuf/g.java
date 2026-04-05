package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f5882a = 100;

    public static int a(byte[] bArr, int i10, f fVar) throws u1 {
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a;
        if (i11 < 0) {
            throw u1.f();
        }
        if (i11 > bArr.length - iR) {
            throw u1.h();
        }
        if (i11 == 0) {
            fVar.f5870c = x.f6099c;
            return iR;
        }
        fVar.f5870c = x.copyFrom(bArr, iR, i11);
        return iR + i11;
    }

    public static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static long c(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int d(m3 m3Var, byte[] bArr, int i10, int i11, int i12, f fVar) throws u1 {
        Object objNewInstance = m3Var.newInstance();
        int iU = u(objNewInstance, m3Var, bArr, i10, i11, i12, fVar);
        m3Var.makeImmutable(objNewInstance);
        fVar.f5870c = objNewInstance;
        return iU;
    }

    public static int e(m3 m3Var, byte[] bArr, int i10, int i11, f fVar) throws IOException {
        Object objNewInstance = m3Var.newInstance();
        int iV = v(objNewInstance, m3Var, bArr, i10, i11, fVar);
        m3Var.makeImmutable(objNewInstance);
        fVar.f5870c = objNewInstance;
        return iV;
    }

    public static int f(m3 m3Var, int i10, byte[] bArr, int i11, int i12, s1 s1Var, f fVar) throws IOException {
        int iE = e(m3Var, bArr, i11, i12, fVar);
        s1Var.add(fVar.f5870c);
        while (iE < i12) {
            int iR = r(bArr, iE, fVar);
            if (i10 != fVar.f5868a) {
                break;
            }
            iE = e(m3Var, bArr, iR, i12, fVar);
            s1Var.add(fVar.f5870c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i10, s1 s1Var, f fVar) throws u1 {
        h hVar = (h) s1Var;
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a + iR;
        while (iR < i11) {
            iR = t(bArr, iR, fVar);
            hVar.addBoolean(fVar.f5869b != 0);
        }
        if (iR == i11) {
            return iR;
        }
        throw u1.h();
    }

    public static int h(byte[] bArr, int i10, s1 s1Var, f fVar) throws u1 {
        n0 n0Var = (n0) s1Var;
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a + iR;
        while (iR < i11) {
            n0Var.addDouble(Double.longBitsToDouble(c(bArr, iR)));
            iR += 8;
        }
        if (iR == i11) {
            return iR;
        }
        throw u1.h();
    }

    public static int i(byte[] bArr, int i10, s1 s1Var, f fVar) throws u1 {
        j1 j1Var = (j1) s1Var;
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a + iR;
        while (iR < i11) {
            j1Var.addInt(b(bArr, iR));
            iR += 4;
        }
        if (iR == i11) {
            return iR;
        }
        throw u1.h();
    }

    public static int j(byte[] bArr, int i10, s1 s1Var, f fVar) throws u1 {
        e2 e2Var = (e2) s1Var;
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a + iR;
        while (iR < i11) {
            e2Var.addLong(c(bArr, iR));
            iR += 8;
        }
        if (iR == i11) {
            return iR;
        }
        throw u1.h();
    }

    public static int k(byte[] bArr, int i10, s1 s1Var, f fVar) throws u1 {
        c1 c1Var = (c1) s1Var;
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a + iR;
        while (iR < i11) {
            c1Var.addFloat(Float.intBitsToFloat(b(bArr, iR)));
            iR += 4;
        }
        if (iR == i11) {
            return iR;
        }
        throw u1.h();
    }

    public static int l(byte[] bArr, int i10, s1 s1Var, f fVar) throws u1 {
        j1 j1Var = (j1) s1Var;
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a + iR;
        while (iR < i11) {
            iR = r(bArr, iR, fVar);
            j1Var.addInt(c0.decodeZigZag32(fVar.f5868a));
        }
        if (iR == i11) {
            return iR;
        }
        throw u1.h();
    }

    public static int m(byte[] bArr, int i10, s1 s1Var, f fVar) throws u1 {
        e2 e2Var = (e2) s1Var;
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a + iR;
        while (iR < i11) {
            iR = t(bArr, iR, fVar);
            e2Var.addLong(c0.decodeZigZag64(fVar.f5869b));
        }
        if (iR == i11) {
            return iR;
        }
        throw u1.h();
    }

    public static int n(byte[] bArr, int i10, s1 s1Var, f fVar) throws u1 {
        j1 j1Var = (j1) s1Var;
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a + iR;
        while (iR < i11) {
            iR = r(bArr, iR, fVar);
            j1Var.addInt(fVar.f5868a);
        }
        if (iR == i11) {
            return iR;
        }
        throw u1.h();
    }

    public static int o(byte[] bArr, int i10, f fVar) throws u1 {
        int iR = r(bArr, i10, fVar);
        int i11 = fVar.f5868a;
        if (i11 < 0) {
            throw u1.f();
        }
        if (i11 == 0) {
            fVar.f5870c = "";
            return iR;
        }
        fVar.f5870c = new String(bArr, iR, i11, t1.f6006a);
        return iR + i11;
    }

    public static int p(int i10, byte[] bArr, int i11, int i12, c4 c4Var, f fVar) throws u1 {
        if (t4.getTagFieldNumber(i10) == 0) {
            throw u1.b();
        }
        int tagWireType = t4.getTagWireType(i10);
        if (tagWireType == 0) {
            int iT = t(bArr, i11, fVar);
            c4Var.c(i10, Long.valueOf(fVar.f5869b));
            return iT;
        }
        if (tagWireType == 1) {
            c4Var.c(i10, Long.valueOf(c(bArr, i11)));
            return i11 + 8;
        }
        if (tagWireType == 2) {
            int iR = r(bArr, i11, fVar);
            int i13 = fVar.f5868a;
            if (i13 < 0) {
                throw u1.f();
            }
            if (i13 > bArr.length - iR) {
                throw u1.h();
            }
            if (i13 == 0) {
                c4Var.c(i10, x.f6099c);
            } else {
                c4Var.c(i10, x.copyFrom(bArr, iR, i13));
            }
            return iR + i13;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw u1.b();
            }
            c4Var.c(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        c4 c4VarB = c4.b();
        int i14 = (i10 & (-8)) | 4;
        int i15 = fVar.f5872e + 1;
        fVar.f5872e = i15;
        if (i15 >= f5882a) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iR2 = r(bArr, i11, fVar);
            i16 = fVar.f5868a;
            if (i16 == i14) {
                i11 = iR2;
                break;
            }
            i11 = p(i16, bArr, iR2, i12, c4VarB, fVar);
        }
        fVar.f5872e--;
        if (i11 > i12 || i16 != i14) {
            throw u1.g();
        }
        c4Var.c(i10, c4VarB);
        return i11;
    }

    public static int q(int i10, byte[] bArr, int i11, f fVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            fVar.f5868a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            fVar.f5868a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & AbstractJsonLexerKt.TC_INVALID) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            fVar.f5868a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & AbstractJsonLexerKt.TC_INVALID) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            fVar.f5868a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & AbstractJsonLexerKt.TC_INVALID) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                fVar.f5868a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int r(byte[] bArr, int i10, f fVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return q(b10, bArr, i11, fVar);
        }
        fVar.f5868a = b10;
        return i11;
    }

    public static int s(int i10, byte[] bArr, int i11, int i12, s1 s1Var, f fVar) {
        j1 j1Var = (j1) s1Var;
        int iR = r(bArr, i11, fVar);
        j1Var.addInt(fVar.f5868a);
        while (iR < i12) {
            int iR2 = r(bArr, iR, fVar);
            if (i10 != fVar.f5868a) {
                break;
            }
            iR = r(bArr, iR2, fVar);
            j1Var.addInt(fVar.f5868a);
        }
        return iR;
    }

    public static void setRecursionLimit(int i10) {
        f5882a = i10;
    }

    public static int t(byte[] bArr, int i10, f fVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            fVar.f5869b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & AbstractJsonLexerKt.TC_INVALID) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        fVar.f5869b = j11;
        return i12;
    }

    public static int u(Object obj, m3 m3Var, byte[] bArr, int i10, int i11, int i12, f fVar) throws u1 {
        u2 u2Var = (u2) m3Var;
        int i13 = fVar.f5872e + 1;
        fVar.f5872e = i13;
        if (i13 >= f5882a) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iW = u2Var.w(obj, bArr, i10, i11, i12, fVar);
        fVar.f5872e--;
        fVar.f5870c = obj;
        return iW;
    }

    public static int v(Object obj, m3 m3Var, byte[] bArr, int i10, int i11, f fVar) throws IOException {
        int iQ = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iQ = q(i12, bArr, iQ, fVar);
            i12 = fVar.f5868a;
        }
        int i13 = iQ;
        if (i12 < 0 || i12 > i11 - i13) {
            throw u1.h();
        }
        int i14 = fVar.f5872e + 1;
        fVar.f5872e = i14;
        if (i14 >= f5882a) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        m3Var.mergeFrom(obj, bArr, i13, i15, fVar);
        fVar.f5872e--;
        fVar.f5870c = obj;
        return i15;
    }

    public static int w(int i10, byte[] bArr, int i11, int i12, f fVar) throws u1 {
        if (t4.getTagFieldNumber(i10) == 0) {
            throw u1.b();
        }
        int tagWireType = t4.getTagWireType(i10);
        if (tagWireType == 0) {
            return t(bArr, i11, fVar);
        }
        if (tagWireType == 1) {
            return i11 + 8;
        }
        if (tagWireType == 2) {
            return r(bArr, i11, fVar) + fVar.f5868a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i11 + 4;
            }
            throw u1.b();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = r(bArr, i11, fVar);
            i14 = fVar.f5868a;
            if (i14 == i13) {
                break;
            }
            i11 = w(i14, bArr, i11, i12, fVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw u1.g();
        }
        return i11;
    }
}
