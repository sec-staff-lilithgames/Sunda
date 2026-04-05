package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.kr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2382kr implements I9 {
    public static byte[] A07;
    public static String[] A08 = {"eVwUBMvHO9uBMhknAGNfZP2yr814WJyE", "k5ILRUABeDXqCwWpN", "hJjZHs3Q8zIp76bYyURn3XwI", "BeESTKEHKjvJbhVudlSNXwxkHuAjvLDZ", "rbeMFWTNNauR3FTC2xnHN2ozIe2oUtV0", "bbPaxRhv7ZvGWrZH", "Yl9CHZRrzKaSrdtxcFsBA9EFbwcoGK5g", "dqSnihCeyqEvBM16"};
    public int A00;
    public int A01;
    public long A02;
    public I8 A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<I6> A05 = new ArrayDeque<>();
    public final IE A04 = new IE();

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{98, -121, -113, 122, -123, -126, 125, 57, 126, -123, 126, -122, 126, -121, -115, 57, -115, -110, -119, 126, 57, 91, -128, -120, 115, 126, 123, 118, 50, 120, 126, -127, 115, -122, 50, -123, 123, -116, 119, 76, 50, -78, -41, -33, -54, -43, -46, -51, -119, -46, -41, -35, -50, -48, -50, -37, -119, -36, -46, -29, -50, -93, -119, -61, -28, -30, -39, -34, -41, -112, -43, -36, -43, -35, -43, -34, -28, -112, -29, -39, -22, -43, -86, -112};
        if (A08[6].charAt(2) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "OJtOaz7eyeuGy8JHYC7MsYj9KI0teM8x";
        strArr[4] = "Pthq8qREsbuOKTWUYG3bxj4Nb5ptFAt8";
    }

    static {
        A05();
    }

    private double A00(InterfaceC2403lN interfaceC2403lN, int i10) throws IOException {
        long jA02 = A02(interfaceC2403lN, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) jA02);
        }
        return Double.longBitsToDouble(jA02);
    }

    @RequiresNonNull({"processor"})
    private long A01(InterfaceC2403lN interfaceC2403lN) throws IOException {
        interfaceC2403lN.AI1();
        while (true) {
            interfaceC2403lN.AG9(this.A06, 0, 4);
            int iA00 = IE.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) IE.A01(this.A06, iA00, false);
                if (this.A03.AAN(iA01)) {
                    interfaceC2403lN.AJJ(iA00);
                    return iA01;
                }
            }
            interfaceC2403lN.AJJ(1);
        }
    }

    private long A02(InterfaceC2403lN interfaceC2403lN, int i10) throws IOException {
        interfaceC2403lN.readFully(this.A06, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            long value = this.A06[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            j10 = (j10 << 8) | value;
        }
        return j10;
    }

    public static String A04(InterfaceC2403lN interfaceC2403lN, int i10) throws IOException {
        if (i10 == 0) {
            return A03(0, 0, 32);
        }
        byte[] bArr = new byte[i10];
        interfaceC2403lN.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.facebook.ads.redexgen.core.I9
    public final void AA5(I8 i82) {
        this.A03 = i82;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
    
        if (r0 <= 2147483647L) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
    
        r12.A03.AJZ(r12.A00, A04(r13, (int) r12.A02));
        r12.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        if (r0 <= 2147483647L) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        throw com.facebook.ads.redexgen.core.C08822i.A01(A03(63, 21, 97) + r12.A02, null);
     */
    @Override // com.facebook.ads.redexgen.core.I9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AGe(com.facebook.ads.redexgen.core.InterfaceC2403lN r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2382kr.AGe(com.facebook.ads.redexgen.X.lN):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.I9
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
