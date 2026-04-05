package com.explorestack.protobuf;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {
    public static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static long b(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static void c(ua uaVar, byte[] bArr, int i10, int i11, int i12) {
        r9 r9Var = (r9) uaVar;
        Object objNewInstance = r9Var.newInstance();
        r9Var.t(bArr, i10, i11, i12, objNewInstance);
        r9Var.makeImmutable(objNewInstance);
        throw null;
    }

    public static void d(ua uaVar, byte[] bArr, int i10, int i11) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            g(i12, bArr);
            throw null;
        }
        if (i13 < 0 || i13 > i11 - i12) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        Object objNewInstance = uaVar.newInstance();
        uaVar.mergeFrom(objNewInstance, bArr, i12, i12 + i13, null);
        uaVar.makeImmutable(objNewInstance);
        throw null;
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, hc hcVar) {
        if (hd.getTagFieldNumber(i10) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = hd.getTagWireType(i10);
        if (tagWireType == 0) {
            h(i11, bArr);
            throw null;
        }
        if (tagWireType == 1) {
            hcVar.b(i10, Long.valueOf(b(bArr, i11)));
            return i11 + 8;
        }
        if (tagWireType == 2) {
            f(i11, bArr);
            throw null;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            hcVar.b(i10, Integer.valueOf(a(bArr, i11)));
            return i11 + 4;
        }
        hc hcVarA = hc.a();
        int i13 = (i10 & (-8)) | 4;
        if (i11 < i12) {
            f(i11, bArr);
            throw null;
        }
        if (i11 > i12 || i13 != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        hcVar.b(i10, hcVarA);
        return i11;
    }

    public static void f(int i10, byte[] bArr) {
        int i11 = i10 + 1;
        if (bArr[i10] >= 0) {
            throw null;
        }
        g(i11, bArr);
        throw null;
    }

    public static void g(int i10, byte[] bArr) {
        int i11 = i10 + 1;
        if (bArr[i10] >= 0) {
            throw null;
        }
        int i12 = i10 + 2;
        if (bArr[i11] >= 0) {
            throw null;
        }
        int i13 = i10 + 3;
        if (bArr[i12] >= 0) {
            throw null;
        }
        int i14 = i10 + 4;
        if (bArr[i13] >= 0) {
            throw null;
        }
        while (true) {
            int i15 = i14 + 1;
            if (bArr[i14] >= 0) {
                throw null;
            }
            i14 = i15;
        }
    }

    public static void h(int i10, byte[] bArr) {
        int i11 = i10 + 1;
        if (bArr[i10] >= 0) {
            throw null;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        while (b10 < 0) {
            b10 = bArr[i12];
            i12++;
        }
        throw null;
    }
}
