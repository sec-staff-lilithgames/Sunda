package io.odeeo.internal.x;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e6.h0;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.w;
import io.odeeo.internal.q0.x;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends io.odeeo.internal.s.g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f67506b = new h0(23);

    /* renamed from: a, reason: collision with root package name */
    public final a f67507a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f67508a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f67509b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67510c;

        public b(int i10, boolean z10, int i11) {
            this.f67508a = i10;
            this.f67509b = z10;
            this.f67510c = i11;
        }
    }

    public g() {
        this(null);
    }

    public static int a(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static /* synthetic */ boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public static m c(x xVar, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        xVar.readBytes(bArr, 0, i10);
        return new m(str, null, new String(bArr, 0, a(bArr, 0), "ISO-8859-1"));
    }

    public static k d(x xVar, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        xVar.readBytes(bArr, 0, i10);
        int iA = a(bArr, 0);
        return new k(new String(bArr, 0, iA, "ISO-8859-1"), a(bArr, iA + 1, i10));
    }

    public static l e(x xVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = xVar.readUnsignedByte();
        String strB = b(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.readBytes(bArr, 0, i11);
        int iB = b(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iB, strB);
        int iA = a(unsignedByte) + iB;
        return new l("TXXX", str, a(bArr, iA, b(bArr, iA, unsignedByte), strB));
    }

    public static m f(x xVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = xVar.readUnsignedByte();
        String strB = b(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.readBytes(bArr, 0, i11);
        int iB = b(bArr, 0, unsignedByte);
        String str = new String(bArr, 0, iB, strB);
        int iA = a(unsignedByte) + iB;
        return new m("WXXX", str, a(bArr, iA, a(bArr, iA), "ISO-8859-1"));
    }

    public static int g(x xVar, int i10) {
        byte[] data = xVar.getData();
        int position = xVar.getPosition();
        int i11 = position;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= position + i10) {
                return i10;
            }
            if ((data[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && data[i12] == 0) {
                System.arraycopy(data, i11 + 2, data, i12, (i10 - (i11 - position)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    public io.odeeo.internal.s.a decode(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        x xVar = new x(bArr, i10);
        b bVarA = a(xVar);
        if (bVarA == null) {
            return null;
        }
        int position = xVar.getPosition();
        int i11 = bVarA.f67508a == 2 ? 6 : 10;
        int iG = bVarA.f67510c;
        if (bVarA.f67509b) {
            iG = g(xVar, bVarA.f67510c);
        }
        xVar.setLimit(position + iG);
        boolean z10 = false;
        if (!a(xVar, bVarA.f67508a, i11, false)) {
            if (bVarA.f67508a != 4 || !a(xVar, 4, i11, true)) {
                p.w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarA.f67508a);
                return null;
            }
            z10 = true;
        }
        while (xVar.bytesLeft() >= i11) {
            h hVarA = a(bVarA.f67508a, xVar, z10, i11, this.f67507a);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new io.odeeo.internal.s.a(arrayList);
    }

    public g(a aVar) {
        this.f67507a = aVar;
    }

    public static l b(x xVar, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = xVar.readUnsignedByte();
        String strB = b(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.readBytes(bArr, 0, i11);
        return new l(str, null, new String(bArr, 0, b(bArr, 0, unsignedByte), strB));
    }

    @Override // io.odeeo.internal.s.g
    public io.odeeo.internal.s.a a(io.odeeo.internal.s.d dVar, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public static b a(x xVar) {
        if (xVar.bytesLeft() < 10) {
            p.w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = xVar.readUnsignedInt24();
        if (unsignedInt24 != 4801587) {
            p.w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(unsignedInt24))));
            return null;
        }
        int unsignedByte = xVar.readUnsignedByte();
        xVar.skipBytes(1);
        int unsignedByte2 = xVar.readUnsignedByte();
        int synchSafeInt = xVar.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                p.w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i10 = xVar.readInt();
                xVar.skipBytes(i10);
                synchSafeInt -= i10 + 4;
            }
        } else {
            if (unsignedByte != 4) {
                e3.g.z(unsignedByte, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = xVar.readSynchSafeInt();
                xVar.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        return new b(unsignedByte, unsignedByte < 4 && (unsignedByte2 & 128) != 0, synchSafeInt);
    }

    public static j c(x xVar, int i10) {
        int unsignedShort = xVar.readUnsignedShort();
        int unsignedInt24 = xVar.readUnsignedInt24();
        int unsignedInt242 = xVar.readUnsignedInt24();
        int unsignedByte = xVar.readUnsignedByte();
        int unsignedByte2 = xVar.readUnsignedByte();
        w wVar = new w();
        wVar.reset(xVar);
        int i11 = ((i10 - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int bits = wVar.readBits(unsignedByte);
            int bits2 = wVar.readBits(unsignedByte2);
            iArr[i12] = bits;
            iArr2[i12] = bits2;
        }
        return new j(unsignedShort, unsignedInt24, unsignedInt242, iArr, iArr2);
    }

    public static f b(x xVar, int i10) throws UnsupportedEncodingException {
        int unsignedByte = xVar.readUnsignedByte();
        String strB = b(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        xVar.readBytes(bArr, 0, i11);
        int iA = a(bArr, 0);
        String str = new String(bArr, 0, iA, "ISO-8859-1");
        int i12 = iA + 1;
        int iB = b(bArr, i12, unsignedByte);
        String strA = a(bArr, i12, iB, strB);
        int iA2 = a(unsignedByte) + iB;
        int iB2 = b(bArr, iA2, unsignedByte);
        return new f(str, strA, a(bArr, iA2, iB2, strB), a(bArr, a(unsignedByte) + iB2, i11));
    }

    public static d b(x xVar, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int position = xVar.getPosition();
        int iA = a(xVar.getData(), position);
        String str = new String(xVar.getData(), position, iA - position, "ISO-8859-1");
        xVar.setPosition(iA + 1);
        int unsignedByte = xVar.readUnsignedByte();
        boolean z11 = (unsignedByte & 2) != 0;
        boolean z12 = (unsignedByte & 1) != 0;
        int unsignedByte2 = xVar.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i13 = 0; i13 < unsignedByte2; i13++) {
            int position2 = xVar.getPosition();
            int iA2 = a(xVar.getData(), position2);
            strArr[i13] = new String(xVar.getData(), position2, iA2 - position2, "ISO-8859-1");
            xVar.setPosition(iA2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = position + i10;
        while (xVar.getPosition() < i14) {
            h hVarA = a(i11, xVar, z10, i12, aVar);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new d(str, z11, z12, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a A[PHI: r3
      0x008a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:41:0x0087, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(io.odeeo.internal.q0.x r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.getPosition()
        L8:
            int r3 = r1.bytesLeft()     // Catch: java.lang.Throwable -> L22
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L25
            int r7 = r1.readInt()     // Catch: java.lang.Throwable -> L22
            long r8 = r1.readUnsignedInt()     // Catch: java.lang.Throwable -> L22
            int r10 = r1.readUnsignedShort()     // Catch: java.lang.Throwable -> L22
            goto L2f
        L22:
            r0 = move-exception
            goto Lb2
        L25:
            int r7 = r1.readUnsignedInt24()     // Catch: java.lang.Throwable -> L22
            int r8 = r1.readUnsignedInt24()     // Catch: java.lang.Throwable -> L22
            long r8 = (long) r8
            r10 = r6
        L2f:
            r11 = 0
            if (r7 != 0) goto L3d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3d
            if (r10 != 0) goto L3d
            r1.setPosition(r2)
            return r4
        L3d:
            r7 = 4
            if (r0 != r7) goto L6e
            if (r21 != 0) goto L6e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4e
            r1.setPosition(r2)
            return r6
        L4e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6e:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L8a
            goto L8e
        L7c:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L8a
            goto L8e
        L8a:
            r4 = r6
            goto L8e
        L8c:
            r3 = r6
            r4 = r3
        L8e:
            if (r4 == 0) goto L92
            int r3 = r3 + 4
        L92:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9b
            r1.setPosition(r2)
            return r6
        L9b:
            int r3 = r1.bytesLeft()     // Catch: java.lang.Throwable -> L22
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La8
            r1.setPosition(r2)
            return r6
        La8:
            int r3 = (int) r8
            r1.skipBytes(r3)     // Catch: java.lang.Throwable -> L22
            goto L8
        Lae:
            r1.setPosition(r2)
            return r4
        Lb2:
            r1.setPosition(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.x.g.a(io.odeeo.internal.q0.x, int, int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0218 A[Catch: all -> 0x0201, UnsupportedEncodingException -> 0x0241, TryCatch #0 {all -> 0x0201, blocks: (B:177:0x0222, B:180:0x0241, B:164:0x01fc, B:174:0x0213, B:175:0x0218), top: B:188:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0222 A[Catch: all -> 0x0201, UnsupportedEncodingException -> 0x0241, TRY_LEAVE, TryCatch #0 {all -> 0x0201, blocks: (B:177:0x0222, B:180:0x0241, B:164:0x01fc, B:174:0x0213, B:175:0x0218), top: B:188:0x0115 }] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9, types: [io.odeeo.internal.x.h] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [io.odeeo.internal.q0.x] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22, types: [io.odeeo.internal.q0.x] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.x.h a(int r19, io.odeeo.internal.q0.x r20, boolean r21, int r22, io.odeeo.internal.x.g.a r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.x.g.a(int, io.odeeo.internal.q0.x, boolean, int, io.odeeo.internal.x.g$a):io.odeeo.internal.x.h");
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

    public static int b(byte[] bArr, int i10, int i11) {
        int iA = a(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iA;
        }
        while (iA < bArr.length - 1) {
            if ((iA - i10) % 2 == 0 && bArr[iA + 1] == 0) {
                return iA;
            }
            iA = a(bArr, iA + 1);
        }
        return bArr.length;
    }

    public static io.odeeo.internal.x.a a(x xVar, int i10, int i11) throws UnsupportedEncodingException {
        int iA;
        String lowerCase;
        int unsignedByte = xVar.readUnsignedByte();
        String strB = b(unsignedByte);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        xVar.readBytes(bArr, 0, i12);
        if (i11 == 2) {
            lowerCase = "image/" + io.odeeo.internal.t0.c.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(lowerCase)) {
                lowerCase = "image/jpeg";
            }
            iA = 2;
        } else {
            iA = a(bArr, 0);
            lowerCase = io.odeeo.internal.t0.c.toLowerCase(new String(bArr, 0, iA, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                lowerCase = "image/".concat(lowerCase);
            }
        }
        int i13 = bArr[iA + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i14 = iA + 2;
        int iB = b(bArr, i14, unsignedByte);
        return new io.odeeo.internal.x.a(lowerCase, new String(bArr, i14, iB - i14, strB), i13, a(bArr, a(unsignedByte) + iB, i12));
    }

    public static e a(x xVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int unsignedByte = xVar.readUnsignedByte();
        String strB = b(unsignedByte);
        byte[] bArr = new byte[3];
        xVar.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        xVar.readBytes(bArr2, 0, i11);
        int iB = b(bArr2, 0, unsignedByte);
        String str2 = new String(bArr2, 0, iB, strB);
        int iA = a(unsignedByte) + iB;
        return new e(str, str2, a(bArr2, iA, b(bArr2, iA, unsignedByte), strB));
    }

    public static c a(x xVar, int i10, int i11, boolean z10, int i12, a aVar) throws Throwable {
        int position = xVar.getPosition();
        int iA = a(xVar.getData(), position);
        String str = new String(xVar.getData(), position, iA - position, "ISO-8859-1");
        xVar.setPosition(iA + 1);
        int i13 = xVar.readInt();
        int i14 = xVar.readInt();
        long unsignedInt = xVar.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = xVar.readUnsignedInt();
        long j10 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i15 = position + i10;
        while (xVar.getPosition() < i15) {
            h hVarA = a(i11, xVar, z10, i12, aVar);
            if (hVarA != null) {
                arrayList.add(hVarA);
            }
        }
        return new c(str, i13, i14, unsignedInt, j10, (h[]) arrayList.toArray(new h[0]));
    }

    public static io.odeeo.internal.x.b a(x xVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        xVar.readBytes(bArr, 0, i10);
        return new io.odeeo.internal.x.b(str, bArr);
    }

    public static String a(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int a(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static byte[] a(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return g0.f65866f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public static String a(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, str);
        }
        return "";
    }
}
