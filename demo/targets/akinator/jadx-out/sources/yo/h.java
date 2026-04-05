package yo;

import com.inmobi.commons.core.configs.AdConfig;
import gn.u0;
import gn.x0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.l0;
import io.bidmachine.media3.common.util.m0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends to.c {

    /* renamed from: b, reason: collision with root package name */
    public static final y3.f f94731b = new y3.f(1);

    /* renamed from: a, reason: collision with root package name */
    public final g f94732a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f94733a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f94734b;

        /* renamed from: c, reason: collision with root package name */
        public final int f94735c;

        public a(int i10, boolean z10, int i11) {
            this.f94733a = i10;
            this.f94734b = z10;
            this.f94735c = i11;
        }
    }

    public h() {
        this(null);
    }

    public static yo.a b(m0 m0Var, int i10, int i11) {
        int iT;
        String strConcat;
        int unsignedByte = m0Var.readUnsignedByte();
        Charset charsetQ = q(unsignedByte);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        m0Var.readBytes(bArr, 0, i12);
        if (i11 == 2) {
            strConcat = "image/" + mh.c.toLowerCase(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iT = 2;
        } else {
            iT = t(bArr, 0);
            String lowerCase = mh.c.toLowerCase(new String(bArr, 0, iT, StandardCharsets.ISO_8859_1));
            strConcat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i13 = bArr[iT + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i14 = iT + 2;
        int iS = s(i14, unsignedByte, bArr);
        String str = new String(bArr, i14, iS - i14, charsetQ);
        int iP = p(unsignedByte) + iS;
        return new yo.a(strConcat, str, i13, i12 <= iP ? a1.f60681c : Arrays.copyOfRange(bArr, iP, i12));
    }

    public static c c(m0 m0Var, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int position = m0Var.getPosition();
        int iT = t(m0Var.getData(), position);
        String str = new String(m0Var.getData(), position, iT - position, StandardCharsets.ISO_8859_1);
        m0Var.setPosition(iT + 1);
        int i13 = m0Var.readInt();
        int i14 = m0Var.readInt();
        long unsignedInt = m0Var.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = m0Var.readUnsignedInt();
        long j10 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i15 = position + i10;
        while (m0Var.getPosition() < i15) {
            i iVarF = f(i11, m0Var, z10, i12, gVar);
            if (iVarF != null) {
                arrayList.add(iVarF);
            }
        }
        return new c(str, i13, i14, unsignedInt, j10, (i[]) arrayList.toArray(new i[0]));
    }

    public static d d(m0 m0Var, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int position = m0Var.getPosition();
        int iT = t(m0Var.getData(), position);
        String str = new String(m0Var.getData(), position, iT - position, StandardCharsets.ISO_8859_1);
        m0Var.setPosition(iT + 1);
        int unsignedByte = m0Var.readUnsignedByte();
        boolean z11 = (unsignedByte & 2) != 0;
        boolean z12 = (unsignedByte & 1) != 0;
        int unsignedByte2 = m0Var.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i13 = 0; i13 < unsignedByte2; i13++) {
            int position2 = m0Var.getPosition();
            int iT2 = t(m0Var.getData(), position2);
            strArr[i13] = new String(m0Var.getData(), position2, iT2 - position2, StandardCharsets.ISO_8859_1);
            m0Var.setPosition(iT2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = position + i10;
        while (m0Var.getPosition() < i14) {
            i iVarF = f(i11, m0Var, z10, i12, gVar);
            if (iVarF != null) {
                arrayList.add(iVarF);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e e(int i10, m0 m0Var) {
        if (i10 < 4) {
            return null;
        }
        int unsignedByte = m0Var.readUnsignedByte();
        Charset charsetQ = q(unsignedByte);
        byte[] bArr = new byte[3];
        m0Var.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        m0Var.readBytes(bArr2, 0, i11);
        int iS = s(0, unsignedByte, bArr2);
        String str2 = new String(bArr2, 0, iS, charsetQ);
        int iP = p(unsignedByte) + iS;
        return new e(str, str2, j(bArr2, iP, s(iP, unsignedByte, bArr2), charsetQ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0237 A[Catch: all -> 0x021e, Exception -> 0x0220, OutOfMemoryError -> 0x0222, TRY_LEAVE, TryCatch #6 {Exception -> 0x0220, OutOfMemoryError -> 0x0222, all -> 0x021e, blocks: (B:171:0x0219, B:184:0x0232, B:185:0x0237), top: B:203:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0259  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [yo.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [io.bidmachine.media3.common.util.m0] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yo.i f(int r19, io.bidmachine.media3.common.util.m0 r20, boolean r21, int r22, yo.g r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.h.f(int, io.bidmachine.media3.common.util.m0, boolean, int, yo.g):yo.i");
    }

    public static f g(int i10, m0 m0Var) {
        int unsignedByte = m0Var.readUnsignedByte();
        Charset charsetQ = q(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        m0Var.readBytes(bArr, 0, i11);
        int iT = t(bArr, 0);
        String strNormalizeMimeType = x0.normalizeMimeType(new String(bArr, 0, iT, StandardCharsets.ISO_8859_1));
        int i12 = iT + 1;
        int iS = s(i12, unsignedByte, bArr);
        String strJ = j(bArr, i12, iS, charsetQ);
        int iP = p(unsignedByte) + iS;
        int iS2 = s(iP, unsignedByte, bArr);
        String strJ2 = j(bArr, iP, iS2, charsetQ);
        int iP2 = p(unsignedByte) + iS2;
        return new f(strNormalizeMimeType, strJ, strJ2, i11 <= iP2 ? a1.f60681c : Arrays.copyOfRange(bArr, iP2, i11));
    }

    public static l h(int i10, m0 m0Var) {
        int unsignedShort = m0Var.readUnsignedShort();
        int unsignedInt24 = m0Var.readUnsignedInt24();
        int unsignedInt242 = m0Var.readUnsignedInt24();
        int unsignedByte = m0Var.readUnsignedByte();
        int unsignedByte2 = m0Var.readUnsignedByte();
        l0 l0Var = new l0();
        l0Var.reset(m0Var);
        int i11 = ((i10 - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int bits = l0Var.readBits(unsignedByte);
            int bits2 = l0Var.readBits(unsignedByte2);
            iArr[i12] = bits;
            iArr2[i12] = bits2;
        }
        return new l(unsignedShort, unsignedInt24, unsignedInt242, iArr, iArr2);
    }

    public static m i(int i10, m0 m0Var) {
        byte[] bArr = new byte[i10];
        m0Var.readBytes(bArr, 0, i10);
        int iT = t(bArr, 0);
        String str = new String(bArr, 0, iT, StandardCharsets.ISO_8859_1);
        int i11 = iT + 1;
        return new m(str, i10 <= i11 ? a1.f60681c : Arrays.copyOfRange(bArr, i11, i10));
    }

    public static String j(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static n k(m0 m0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = m0Var.readUnsignedByte();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        m0Var.readBytes(bArr, 0, i11);
        return new n(str, (String) null, l(unsignedByte, 0, bArr));
    }

    public static b5 l(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return b5.of("");
        }
        x4 x4VarBuilder = b5.builder();
        int iS = s(i11, i10, bArr);
        while (i11 < iS) {
            x4VarBuilder.add((Object) new String(bArr, i11, iS - i11, q(i10)));
            i11 = p(i10) + iS;
            iS = s(i11, i10, bArr);
        }
        b5 b5VarBuild = x4VarBuilder.build();
        return b5VarBuild.isEmpty() ? b5.of("") : b5VarBuild;
    }

    public static n m(int i10, m0 m0Var) {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = m0Var.readUnsignedByte();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        m0Var.readBytes(bArr, 0, i11);
        int iS = s(0, unsignedByte, bArr);
        return new n("TXXX", new String(bArr, 0, iS, q(unsignedByte)), l(unsignedByte, p(unsignedByte) + iS, bArr));
    }

    public static o n(m0 m0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        m0Var.readBytes(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, t(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static o o(int i10, m0 m0Var) {
        if (i10 < 1) {
            return null;
        }
        int unsignedByte = m0Var.readUnsignedByte();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        m0Var.readBytes(bArr, 0, i11);
        int iS = s(0, unsignedByte, bArr);
        String str = new String(bArr, 0, iS, q(unsignedByte));
        int iP = p(unsignedByte) + iS;
        return new o("WXXX", str, j(bArr, iP, t(bArr, iP), StandardCharsets.ISO_8859_1));
    }

    public static int p(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset q(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String r(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int s(int i10, int i11, byte[] bArr) {
        int iT = t(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iT;
        }
        while (iT < bArr.length - 1) {
            if ((iT - i10) % 2 == 0 && bArr[iT + 1] == 0) {
                return iT;
            }
            iT = t(bArr, iT + 1);
        }
        return bArr.length;
    }

    public static int t(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int u(int i10, m0 m0Var) {
        byte[] data = m0Var.getData();
        int position = m0Var.getPosition();
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean v(io.bidmachine.media3.common.util.m0 r18, int r19, int r20, boolean r21) {
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
            if (r0 != r7) goto L7e
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r6
        L77:
            r7 = r10 & 1
            if (r7 == 0) goto L7c
            goto L8e
        L7c:
            r4 = r6
            goto L8e
        L7e:
            if (r0 != r3) goto L8c
            r3 = r10 & 32
            if (r3 == 0) goto L86
            r3 = r4
            goto L87
        L86:
            r3 = r6
        L87:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7c
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
        throw new UnsupportedOperationException("Method not decompiled: yo.h.v(io.bidmachine.media3.common.util.m0, int, int, boolean):boolean");
    }

    @Override // to.c
    public final u0 a(to.b bVar, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gn.u0 decode(byte[] r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.h.decode(byte[], int):gn.u0");
    }

    public h(g gVar) {
        this.f94732a = gVar;
    }
}
