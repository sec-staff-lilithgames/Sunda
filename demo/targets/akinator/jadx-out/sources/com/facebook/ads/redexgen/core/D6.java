package com.facebook.ads.redexgen.core;

import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: assets/audience_network.dex */
public final class D6 extends TextView implements InterfaceC1954dc {
    public static byte[] A02;
    public static String[] A03 = {"KyDK4ozsSQOI8CeBEp6vN7GPAMaKi3Lj", "3K3dE7OkNcMTAukVEMEsyydi1KZJfoYe", "AKsSDy", "td2HYxymrySRBlk8LVzv2Nj", "9YKsZJjoWB8K3TGCGylWNfB", "C67xSy", "ZVZacBuH1Jrb8cRz3UZ99yjmQBL5sCV1", "zO36dBYDIleQnJstGNGNdS3bkLsuKmlY"};
    public static final int A04;
    public E1 A00;
    public final AbstractC1560Tf<C3Q> A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "iGxWfyiSQAQNOwaGoqCiMbtpxtO5GMjZ";
            strArr2[1] = "gQ1pvXOTKlX7L3B8LOaiCsG8OhRO9Yk5";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 61);
            i13++;
        }
    }

    public static void A04() {
        A02 = new byte[]{15, 26, 24, 78, 16, 15, 26, 24, 78, 18, 18, 24, 18, 18};
    }

    static {
        A04();
        A04 = (int) (AbstractC1640Wl.A02 * 6.0f);
    }

    public D6(C1937dL c1937dL) {
        super(c1937dL);
        this.A01 = new D7(this);
        XP.A0Q(this, XP.A06(855638016, A04));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A02(long j10) {
        if (j10 <= 0) {
            return A01(9, 5, 31);
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j10);
        long minutes2 = TimeUnit.MILLISECONDS.toSeconds(j10 % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        return String.format(Locale.US, A01(0, 9, 23), Long.valueOf(minutes), Long.valueOf(minutes2));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1954dc
    public final void AAm(E1 e12) {
        this.A00 = e12;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1954dc
    public final void AJk(E1 e12) {
        this.A00 = e12;
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A01);
        }
    }
}
