package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.p1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2623p1 implements C1S {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;
    public final int[] A05;
    public final long[] A06;
    public final Uri[] A07;
    public static String[] A08 = {"OkxecgD0Gv2GK", "dTJXSSjTvXtvCpVWxsqZ6", "wYzs5zgiK5G18", "klAEANkVopL6T8N0G4GCOYVrDlyPlXqI", "4WcRthq3aJhjltodanyM1lxGrZBe12qe", "Nzs6zPyAK9Q7ZYWQPcJbQV1Iqfi6la98", "CqWpbShPfJkKIhE6JIbgz0xValvGrdcB", "ap1AkjUIhWjw5r6nQb"};
    public static final String A0G = AbstractC09264a.A0h(0);
    public static final String A0B = AbstractC09264a.A0h(1);
    public static final String A0H = AbstractC09264a.A0h(2);
    public static final String A0F = AbstractC09264a.A0h(3);
    public static final String A0C = AbstractC09264a.A0h(4);
    public static final String A0A = AbstractC09264a.A0h(5);
    public static final String A0D = AbstractC09264a.A0h(6);
    public static final String A0E = AbstractC09264a.A0h(7);
    public static final C1R<C2623p1> A09 = new C1R() { // from class: com.facebook.ads.redexgen.X.p2
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2623p1.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C2623p1 A00(Bundle bundle) {
        long j10 = bundle.getLong(A0G);
        int i10 = bundle.getInt(A0B);
        int i11 = bundle.getInt(A0E);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0H);
        int[] intArray = bundle.getIntArray(A0F);
        long[] longArray = bundle.getLongArray(A0C);
        long j11 = bundle.getLong(A0A);
        boolean z10 = bundle.getBoolean(A0D);
        if (intArray == null) {
            intArray = new int[0];
        }
        Uri[] uriArr = new Uri[0];
        String[] strArr = A08;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "h5Cz72DlneqkJ";
        strArr2[0] = "HzHttfqxNoxwC";
        if (parcelableArrayList != null) {
            uriArr = (Uri[]) parcelableArrayList.toArray(uriArr);
        }
        if (longArray == null) {
            longArray = new long[0];
        }
        return new C2623p1(j10, i10, i11, intArray, uriArr, longArray, j11, z10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final C2623p1 A06(int i10) {
        int[] iArrA02 = A02(this.A05, i10);
        long[] jArrA03 = A03(this.A06, i10);
        return new C2623p1(this.A03, i10, this.A01, iArrA02, (Uri[]) Arrays.copyOf(this.A07, i10), jArrA03, this.A02, this.A04);
    }

    public C2623p1(long j10) {
        this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public C2623p1(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        C3M.A07(iArr.length == uriArr.length);
        this.A03 = j10;
        this.A00 = i10;
        this.A01 = i11;
        this.A05 = iArr;
        this.A07 = uriArr;
        this.A06 = jArr;
        this.A02 = j11;
        this.A04 = z10;
    }

    public static int[] A02(int[] iArr, int i10) {
        int length = iArr.length;
        int iMax = Math.max(i10, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        return iArrCopyOf;
    }

    public static long[] A03(long[] jArr, int i10) {
        int length = jArr.length;
        int iMax = Math.max(i10, length);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
        Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
        return jArrCopyOf;
    }

    public final int A04() {
        return A05(-1);
    }

    public final int A05(int i10) {
        int i11 = i10 + 1;
        while (true) {
            int[] iArr = this.A05;
            String[] strArr = A08;
            String str = strArr[3];
            String str2 = strArr[4];
            int iCharAt = str.charAt(30);
            int nextAdIndexToPlay = str2.charAt(30);
            if (iCharAt != nextAdIndexToPlay) {
                throw new RuntimeException();
            }
            A08[6] = "Wtq62hhDQ1jo9VyQ6cIhlPoFSuywDvdH";
            int nextAdIndexToPlay2 = iArr.length;
            if (i11 >= nextAdIndexToPlay2 || this.A04) {
                break;
            }
            int nextAdIndexToPlay3 = this.A05[i11];
            if (nextAdIndexToPlay3 == 0 || this.A05[i11] == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A07() {
        /*
            r3 = this;
            int r1 = r3.A00
            r0 = -1
            r2 = 1
            if (r1 != r0) goto L7
            return r2
        L7:
            r1 = 0
        L8:
            int r0 = r3.A00
            if (r1 >= r0) goto L1c
            int[] r0 = r3.A05
            r0 = r0[r1]
            if (r0 == 0) goto L18
            int[] r0 = r3.A05
            r0 = r0[r1]
            if (r0 != r2) goto L19
        L18:
            return r2
        L19:
            int r1 = r1 + 1
            goto L8
        L1c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2623p1.A07():boolean");
    }

    public final boolean A08() {
        return this.A00 == -1 || A04() < this.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2623p1 c2623p1 = (C2623p1) obj;
        if (this.A03 == c2623p1.A03 && this.A00 == c2623p1.A00 && this.A01 == c2623p1.A01 && Arrays.equals(this.A07, c2623p1.A07) && Arrays.equals(this.A05, c2623p1.A05) && Arrays.equals(this.A06, c2623p1.A06)) {
            long j10 = this.A02;
            if (A08[5].charAt(25) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[3] = "oTIVhrwO4wW48XZtZFkmZHaHYFeLbVqJ";
            strArr[4] = "xLWtDigMD9KXXhkKgPNBVDDiVfKu3Nqc";
            if (j10 == c2623p1.A02 && this.A04 == c2623p1.A04) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A00 * 31) + this.A01) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + Arrays.hashCode(this.A07)) * 31) + Arrays.hashCode(this.A05)) * 31) + Arrays.hashCode(this.A06)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A04 ? 1 : 0);
    }
}
