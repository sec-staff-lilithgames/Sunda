package we;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import mh.h0;
import nh.b5;
import nh.x4;
import sn.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends re.g {

    /* renamed from: b, reason: collision with root package name */
    public static final t f90541b = new t(13);

    /* renamed from: a, reason: collision with root package name */
    public final g f90542a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f90543a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f90544b;

        /* renamed from: c, reason: collision with root package name */
        public final int f90545c;

        public a(int i10, boolean z10, int i11) {
            this.f90543a = i10;
            this.f90544b = z10;
            this.f90545c = i11;
        }
    }

    public h() {
        this(null);
    }

    public static ApicFrame b(v0 v0Var, int i10, int i11) {
        int iO;
        String strConcat;
        int unsignedByte = v0Var.readUnsignedByte();
        Charset charsetL = l(unsignedByte);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        v0Var.readBytes(bArr, 0, i12);
        if (i11 == 2) {
            strConcat = "image/" + mh.c.toLowerCase(new String(bArr, 0, 3, h0.f74627b));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iO = 2;
        } else {
            iO = o(bArr, 0);
            String lowerCase = mh.c.toLowerCase(new String(bArr, 0, iO, h0.f74627b));
            strConcat = lowerCase.indexOf(47) == -1 ? "image/".concat(lowerCase) : lowerCase;
        }
        int i13 = bArr[iO + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i14 = iO + 2;
        int iN = n(i14, unsignedByte, bArr);
        String str = new String(bArr, i14, iN - i14, charsetL);
        int iK = k(unsignedByte) + iN;
        return new ApicFrame(strConcat, str, i13, i12 <= iK ? n1.f28511f : Arrays.copyOfRange(bArr, iK, i12));
    }

    public static ChapterFrame c(v0 v0Var, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int position = v0Var.getPosition();
        int iO = o(v0Var.getData(), position);
        String str = new String(v0Var.getData(), position, iO - position, h0.f74627b);
        v0Var.setPosition(iO + 1);
        int i13 = v0Var.readInt();
        int i14 = v0Var.readInt();
        long unsignedInt = v0Var.readUnsignedInt();
        if (unsignedInt == 4294967295L) {
            unsignedInt = -1;
        }
        long unsignedInt2 = v0Var.readUnsignedInt();
        long j10 = unsignedInt2 == 4294967295L ? -1L : unsignedInt2;
        ArrayList arrayList = new ArrayList();
        int i15 = position + i10;
        while (v0Var.getPosition() < i15) {
            Id3Frame id3FrameF = f(i11, v0Var, z10, i12, gVar);
            if (id3FrameF != null) {
                arrayList.add(id3FrameF);
            }
        }
        return new ChapterFrame(str, i13, i14, unsignedInt, j10, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static ChapterTocFrame d(v0 v0Var, int i10, int i11, boolean z10, int i12, g gVar) throws Throwable {
        int position = v0Var.getPosition();
        int iO = o(v0Var.getData(), position);
        String str = new String(v0Var.getData(), position, iO - position, h0.f74627b);
        v0Var.setPosition(iO + 1);
        int unsignedByte = v0Var.readUnsignedByte();
        boolean z11 = (unsignedByte & 2) != 0;
        boolean z12 = (unsignedByte & 1) != 0;
        int unsignedByte2 = v0Var.readUnsignedByte();
        String[] strArr = new String[unsignedByte2];
        for (int i13 = 0; i13 < unsignedByte2; i13++) {
            int position2 = v0Var.getPosition();
            int iO2 = o(v0Var.getData(), position2);
            strArr[i13] = new String(v0Var.getData(), position2, iO2 - position2, h0.f74627b);
            v0Var.setPosition(iO2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = position + i10;
        while (v0Var.getPosition() < i14) {
            Id3Frame id3FrameF = f(i11, v0Var, z10, i12, gVar);
            if (id3FrameF != null) {
                arrayList.add(id3FrameF);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    public static CommentFrame e(int i10, v0 v0Var) {
        if (i10 < 4) {
            return null;
        }
        int unsignedByte = v0Var.readUnsignedByte();
        Charset charsetL = l(unsignedByte);
        byte[] bArr = new byte[3];
        v0Var.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        v0Var.readBytes(bArr2, 0, i11);
        int iN = n(0, unsignedByte, bArr2);
        String str2 = new String(bArr2, 0, iN, charsetL);
        int iK = k(unsignedByte) + iN;
        return new CommentFrame(str, str2, i(bArr2, iK, n(iK, unsignedByte, bArr2), charsetL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a5 A[Catch: all -> 0x028e, TryCatch #2 {all -> 0x028e, blocks: (B:183:0x02b6, B:170:0x0289, B:180:0x02a0, B:181:0x02a5), top: B:190:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b6 A[Catch: all -> 0x028e, TRY_LEAVE, TryCatch #2 {all -> 0x028e, blocks: (B:183:0x02b6, B:170:0x0289, B:180:0x02a0, B:181:0x02a5), top: B:190:0x0119 }] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.google.android.exoplayer2.util.v0] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame f(int r20, com.google.android.exoplayer2.util.v0 r21, boolean r22, int r23, we.g r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: we.h.f(int, com.google.android.exoplayer2.util.v0, boolean, int, we.g):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame g(int i10, v0 v0Var) {
        int unsignedByte = v0Var.readUnsignedByte();
        Charset charsetL = l(unsignedByte);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        v0Var.readBytes(bArr, 0, i11);
        int iO = o(bArr, 0);
        String str = new String(bArr, 0, iO, h0.f74627b);
        int i12 = iO + 1;
        int iN = n(i12, unsignedByte, bArr);
        String strI = i(bArr, i12, iN, charsetL);
        int iK = k(unsignedByte) + iN;
        int iN2 = n(iK, unsignedByte, bArr);
        String strI2 = i(bArr, iK, iN2, charsetL);
        int iK2 = k(unsignedByte) + iN2;
        return new GeobFrame(str, strI, strI2, i11 <= iK2 ? n1.f28511f : Arrays.copyOfRange(bArr, iK2, i11));
    }

    public static MlltFrame h(int i10, v0 v0Var) {
        int unsignedShort = v0Var.readUnsignedShort();
        int unsignedInt24 = v0Var.readUnsignedInt24();
        int unsignedInt242 = v0Var.readUnsignedInt24();
        int unsignedByte = v0Var.readUnsignedByte();
        int unsignedByte2 = v0Var.readUnsignedByte();
        u0 u0Var = new u0();
        u0Var.reset(v0Var);
        int i11 = ((i10 - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int bits = u0Var.readBits(unsignedByte);
            int bits2 = u0Var.readBits(unsignedByte2);
            iArr[i12] = bits;
            iArr2[i12] = bits2;
        }
        return new MlltFrame(unsignedShort, unsignedInt24, unsignedInt242, iArr, iArr2);
    }

    public static String i(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static b5 j(int i10, int i11, byte[] bArr) {
        if (i11 >= bArr.length) {
            return b5.of("");
        }
        x4 x4VarBuilder = b5.builder();
        int iN = n(i11, i10, bArr);
        while (i11 < iN) {
            x4VarBuilder.add((Object) new String(bArr, i11, iN - i11, l(i10)));
            i11 = k(i10) + iN;
            iN = n(i11, i10, bArr);
        }
        b5 b5VarBuild = x4VarBuilder.build();
        return b5VarBuild.isEmpty() ? b5.of("") : b5VarBuild;
    }

    public static int k(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset l(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? h0.f74627b : h0.f74628c : h0.f74629d : h0.f74631f;
    }

    public static String m(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int n(int i10, int i11, byte[] bArr) {
        int iO = o(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iO;
        }
        while (iO < bArr.length - 1) {
            if ((iO - i10) % 2 == 0 && bArr[iO + 1] == 0) {
                return iO;
            }
            iO = o(bArr, iO + 1);
        }
        return bArr.length;
    }

    public static int o(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int p(int i10, v0 v0Var) {
        byte[] data = v0Var.getData();
        int position = v0Var.getPosition();
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
    public static boolean q(com.google.android.exoplayer2.util.v0 r18, int r19, int r20, boolean r21) {
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
        throw new UnsupportedOperationException("Method not decompiled: we.h.q(com.google.android.exoplayer2.util.v0, int, int, boolean):boolean");
    }

    @Override // re.g
    public final Metadata a(re.e eVar, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer2.metadata.Metadata decode(byte[] r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: we.h.decode(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }

    public h(g gVar) {
        this.f90542a = gVar;
    }
}
