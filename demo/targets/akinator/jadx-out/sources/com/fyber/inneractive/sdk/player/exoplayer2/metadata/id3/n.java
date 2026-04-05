package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final int f25687b = z.a("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.l f25688a;

    public n() {
        this.f25688a = null;
    }

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static h b(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, boolean z10, int i12, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws Throwable {
        int i13 = nVar.f26043b;
        int iB = b(i13, nVar.f26042a);
        String str = new String(nVar.f26042a, i13, iB - i13, "ISO-8859-1");
        nVar.e(iB + 1);
        int iJ = nVar.j();
        boolean z11 = (iJ & 2) != 0;
        boolean z12 = (iJ & 1) != 0;
        int iJ2 = nVar.j();
        String[] strArr = new String[iJ2];
        for (int i14 = 0; i14 < iJ2; i14++) {
            int i15 = nVar.f26043b;
            int iB2 = b(i15, nVar.f26042a);
            strArr[i14] = new String(nVar.f26042a, i15, iB2 - i15, "ISO-8859-1");
            nVar.e(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (nVar.f26043b < i16) {
            o oVarA = a(i11, nVar, z10, i12, lVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new h(str, z11, z12, strArr, oVarArr);
    }

    public static s d(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iA = a(bArr, 0, iJ);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new s("TXXX", str, iA2 < i11 ? new String(bArr, iA2, a(bArr, iA2, iJ) - iA2, strB) : "");
    }

    public static u e(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iA = a(bArr, 0, iJ);
        String str = new String(bArr, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        return new u("WXXX", str, iA2 < i11 ? new String(bArr, iA2, b(iA2, bArr) - iA2, "ISO-8859-1") : "");
    }

    public static int f(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = nVar.f26042a;
        int i11 = nVar.f26043b;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                return i10;
            }
            if ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i10 - i11) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    public static q c(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        byte[] bArr = new byte[i10];
        nVar.a(bArr, 0, i10);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, yFkbx.cZGZXZeQklbzADH);
        int i11 = iB + 1;
        return new q(str, i11 < i10 ? Arrays.copyOfRange(bArr, i11, i10) : new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b a(int r14, byte[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.a(int, byte[]):com.fyber.inneractive.sdk.player.exoplayer2.metadata.b");
    }

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) {
        this.f25688a = lVar;
    }

    public static u b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        byte[] bArr = new byte[i10];
        nVar.a(bArr, 0, i10);
        return new u(str, null, new String(bArr, 0, b(0, bArr), "ISO-8859-1"));
    }

    public static l b(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        int iB = b(0, bArr);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i12 = iB + 1;
        int iA = a(bArr, i12, iJ);
        String str2 = new String(bArr, i12, iA - i12, strB);
        int iA2 = a(iJ) + iA;
        int iA3 = a(bArr, iA2, iJ);
        return new l(str, str2, new String(bArr, iA2, iA3 - iA2, strB), Arrays.copyOfRange(bArr, a(iJ) + iA3, i11));
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return C.UTF16_NAME;
        }
        if (i10 == 2) {
            return "UTF-16BE";
        }
        if (i10 != 3) {
            return "ISO-8859-1";
        }
        return C.UTF8_NAME;
    }

    public static int b(int i10, byte[] bArr) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static f a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11, boolean z10, int i12, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l lVar) throws Throwable {
        int i13 = nVar.f26043b;
        int iB = b(i13, nVar.f26042a);
        String str = new String(nVar.f26042a, i13, iB - i13, "ISO-8859-1");
        nVar.e(iB + 1);
        int iB2 = nVar.b();
        int iB3 = nVar.b();
        long jK = nVar.k();
        if (jK == 4294967295L) {
            jK = -1;
        }
        long jK2 = nVar.k();
        long j10 = jK2 == 4294967295L ? -1L : jK2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (nVar.f26043b < i14) {
            o oVarA = a(i11, nVar, z10, i12, lVar);
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        o[] oVarArr = new o[arrayList.size()];
        arrayList.toArray(oVarArr);
        return new f(str, iB2, iB3, jK, j10, oVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[PHI: r3
      0x0089: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:41:0x0086, B:33:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6 A[Catch: all -> 0x012a, UnsupportedEncodingException -> 0x021b, TryCatch #2 {UnsupportedEncodingException -> 0x021b, blocks: (B:93:0x0125, B:165:0x01fc, B:97:0x012f, B:105:0x0147, B:107:0x014e, B:115:0x0167, B:124:0x017c, B:135:0x0194, B:142:0x01a5, B:162:0x01e1, B:163:0x01e6), top: B:176:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fc A[Catch: all -> 0x012a, UnsupportedEncodingException -> 0x021b, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x021b, blocks: (B:93:0x0125, B:165:0x01fc, B:97:0x012f, B:105:0x0147, B:107:0x014e, B:115:0x0167, B:124:0x017c, B:135:0x0194, B:142:0x01a5, B:162:0x01e1, B:163:0x01e6), top: B:176:0x011b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o a(int r22, com.fyber.inneractive.sdk.player.exoplayer2.util.n r23, boolean r24, int r25, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.n, boolean, int, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o");
    }

    public static s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, String str) {
        if (i10 < 1) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        nVar.a(bArr, 0, i11);
        return new s(str, null, new String(bArr, 0, a(bArr, 0, iJ), strB));
    }

    public static b a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, int i11) {
        int iB;
        String lowerCase;
        int iJ = nVar.j();
        String strB = b(iJ);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        nVar.a(bArr, 0, i12);
        if (i11 == 2) {
            lowerCase = "image/" + new String(bArr, 0, 3, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.equals("image/jpg")) {
                lowerCase = "image/jpeg";
            }
            iB = 2;
        } else {
            iB = b(0, bArr);
            lowerCase = new String(bArr, 0, iB, "ISO-8859-1").toLowerCase(Locale.US);
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i13 = bArr[iB + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i14 = iB + 2;
        int iA = a(bArr, i14, iJ);
        return new b(lowerCase, new String(bArr, i14, iA - i14, strB), i13, Arrays.copyOfRange(bArr, a(iJ) + iA, i12));
    }

    public static j a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        if (i10 < 4) {
            return null;
        }
        int iJ = nVar.j();
        String strB = b(iJ);
        byte[] bArr = new byte[3];
        nVar.a(bArr, 0, 3);
        String str2 = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        nVar.a(bArr2, 0, i11);
        int iA = a(bArr2, 0, iJ);
        String str3 = new String(bArr2, 0, iA, strB);
        int iA2 = a(iJ) + iA;
        if (iA2 < i11) {
            str = new String(bArr2, iA2, a(bArr2, iA2, iJ) - iA2, strB);
        } else {
            str = "";
        }
        return new j(str2, str3, str);
    }

    public static String a(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int a(byte[] bArr, int i10, int i11) {
        int iB = b(i10, bArr);
        if (i11 == 0 || i11 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if (iB % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(iB + 1, bArr);
        }
        return bArr.length;
    }
}
