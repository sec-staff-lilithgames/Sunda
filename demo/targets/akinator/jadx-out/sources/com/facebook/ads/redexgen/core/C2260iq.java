package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* renamed from: com.facebook.ads.redexgen.X.iq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2260iq extends C1374Lx {
    public static byte[] A00;
    public static String[] A01 = {"OfRtwvXctRBBw9gKY8TWbFYEyrfTWUJ5", "O6KpU7VzQb47vbeRDg05X09dlcjSdrsx", "cGvb3Ixjw9glBryIXlKjYbTfS5Fhfs8X", "N3q9w52q7yAs4MQ92KFgaGGqaH957eGg", "tjYOyBogfVGQWArOceKhNo0cgBZwypsu", "xmSgRcjNSrQyzCd8Uu5cYZa5hRrGr9a8", "10tums6VyruOnAjrgpE7eJ8", "dQkd96lx4iAtJg2k9NqdAtWwc5SxpqrB"};
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[PHI: r8
      0x00aa: PHI (r8v2 long) = (r8v0 long), (r8v3 long) binds: [B:30:0x00d7, B:25:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C2260iq A01(java.io.File r14, long r15, long r17, com.facebook.ads.redexgen.core.M6 r19) throws java.lang.NumberFormatException {
        /*
            r12 = r17
            r10 = r15
            java.lang.String r3 = r14.getName()
            r2 = 1
            r1 = 7
            r0 = 86
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r3.endsWith(r0)
            r6 = 0
            r1 = r19
            if (r0 != 0) goto L23
            java.io.File r14 = A06(r14, r1)
            if (r14 != 0) goto L1f
            return r6
        L1f:
            java.lang.String r3 = r14.getName()
        L23:
            java.util.regex.Pattern r0 = com.facebook.ads.redexgen.core.C2260iq.A04
            java.util.regex.Matcher r3 = r0.matcher(r3)
            boolean r0 = r3.matches()
            if (r0 != 0) goto L30
            return r6
        L30:
            r0 = 1
            java.lang.String r0 = r3.group(r0)
            java.lang.Object r0 = com.facebook.ads.redexgen.core.C3M.A01(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r7 = r1.A0F(r0)
            if (r7 != 0) goto L46
            return r6
        L46:
            r1 = -1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L50
            long r10 = r14.length()
        L50:
            r4 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2260iq.A01
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 16
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lda
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2260iq.A01
            java.lang.String r1 = "3kLuDF7WddxsAuj74YBqy147zLEiHTF0"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "yBKAMqN1ItuNGOhP7OCxzG9BVSMF66iW"
            r0 = 2
            r2[r0] = r1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 != 0) goto L77
            return r6
        L77:
            r0 = 2
            java.lang.String r4 = r3.group(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2260iq.A01
            r0 = 7
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 78
            if (r1 == r0) goto Lbf
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2260iq.A01
            java.lang.String r1 = "3kqdJGKw3CP8mm7UdAcKh0LFQ5WJAflS"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "ycjOreuQW9uSgeP7cymbjNDk2aBjdnIT"
            r0 = 3
            r2[r0] = r1
            java.lang.Object r0 = com.facebook.ads.redexgen.core.C3M.A01(r4)
            java.lang.String r0 = (java.lang.String) r0
            long r8 = java.lang.Long.parseLong(r0)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb9
        Laa:
            r0 = 3
            java.lang.String r0 = r3.group(r0)
            java.lang.Object r0 = com.facebook.ads.redexgen.core.C3M.A01(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r12 = java.lang.Long.parseLong(r0)
        Lb9:
            com.facebook.ads.redexgen.X.iq r6 = new com.facebook.ads.redexgen.X.iq
            r6.<init>(r7, r8, r10, r12, r14)
            return r6
        Lbf:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2260iq.A01
            java.lang.String r1 = "aSANG9oSWduq5GFK5NdZXfdN35yUyqYg"
            r0 = 7
            r2[r0] = r1
            java.lang.Object r0 = com.facebook.ads.redexgen.core.C3M.A01(r4)
            java.lang.String r0 = (java.lang.String) r0
            long r8 = java.lang.Long.parseLong(r0)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb9
            goto Laa
        Lda:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2260iq.A01(java.io.File, long, long, com.facebook.ads.redexgen.X.M6):com.facebook.ads.redexgen.X.iq");
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{93, -93, -21, -88, -93, -38, -19, -28, -28, -82, -76, -79, -81, -30, -76, -82, -30, -22, -79, -81, -30, -76, -82, -30, -22, -79, -81, -30, -76, -4, -73, -30, -76, -21, -2, -11, -86, -13, -67, -61, -64, -66, -15, -61, -67, -15, -7, -64, -66, -15, -61, -67, -15, -7, -64, -66, -15, -61, 11, -57, -15, -61, -6, 13, 4, -71, -40, -94, -42, -34, -91, -93, -42, -88, -94, -42, -34, -91, -93, -42, -88, -94, -42, -34, -91, -93, -42, -88, -16, -83, -42, -88, -33, -14, -23, -98};
    }

    static {
        A08();
        A02 = Pattern.compile(A07(8, 29, 103), 32);
        A03 = Pattern.compile(A07(37, 29, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), 32);
        A04 = Pattern.compile(A07(66, 30, 91), 32);
    }

    public C2260iq(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static C2260iq A02(File file, long j10, M6 m62) {
        return A01(file, j10, C.TIME_UNSET, m62);
    }

    public static C2260iq A03(String str, long j10) {
        return new C2260iq(str, j10, -1L, C.TIME_UNSET, null);
    }

    public static C2260iq A04(String str, long j10, long j11) {
        return new C2260iq(str, j10, j11, C.TIME_UNSET, null);
    }

    public static File A05(File file, int i10, long j10, long j11) {
        StringBuilder sbAppend = new StringBuilder().append(i10);
        String strA07 = A07(0, 1, 16);
        return new File(file, sbAppend.append(strA07).append(j10).append(strA07).append(j11).append(A07(1, 7, 86)).toString());
    }

    public static File A06(File file, M6 m62) throws NumberFormatException {
        String strA0l = null;
        String name = file.getName();
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            String key = matcher.group(1);
            strA0l = AbstractC09264a.A0l((String) C3M.A01(key));
        } else {
            matcher = A02.matcher(name);
            if (matcher.matches()) {
                String key2 = matcher.group(1);
                Object objA01 = C3M.A01(key2);
                String[] strArr = A01;
                String filename = strArr[0];
                if (filename.charAt(16) == strArr[2].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "SH9gvm8hJK4XlSeUgFI9DN0CGl9RiOAn";
                strArr2[2] = "6Y4JW5a7TLCjGmr1nVotQhjybpiv9cHJ";
                strA0l = (String) objA01;
            }
        }
        if (strA0l == null) {
            return null;
        }
        File file2 = (File) C3M.A02(file.getParentFile());
        int iA0B = m62.A0B(strA0l);
        String key3 = matcher.group(2);
        long j10 = Long.parseLong((String) C3M.A01(key3));
        String key4 = matcher.group(3);
        File fileA05 = A05(file2, iA0B, j10, Long.parseLong((String) C3M.A01(key4)));
        if (!file.renameTo(fileA05)) {
            return null;
        }
        return fileA05;
    }

    public final C2260iq A09(File file, long j10) {
        C3M.A08(this.A05);
        return new C2260iq(this.A04, this.A02, this.A01, j10, file);
    }
}
