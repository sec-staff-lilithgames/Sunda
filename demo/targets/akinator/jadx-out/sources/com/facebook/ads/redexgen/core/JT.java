package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class JT {
    public static String[] A09 = {"UUlEJ3Jo50NOk35TUHs6UNRK6svNK9bY", "Rfapb4gOuHxAcdI53hJjgoF3fgUzCf8l", "549CgiYhO6ZoxkZsxucd", "d0g0H9nuc7MFYEKhz8GgPJKXV4KY3uwa", "SvGPJzr3mUIjg4zk3UE0lmEsGQStmHiR", "UIGV6MTRsZPNdj8JuGQraJXbpN7YiCpC", "sPKUkdPP6cbZl7mqg699SGb1Qg8cwcjc", "pSvb9vtzFVNohJw9Yc2pgYHm"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C4J A07 = new C4J();
    public final int[] A08 = new int[NotificationCompat.FLAG_LOCAL_ONLY];

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(C4J c4j, int i10) {
        int totalLength;
        if (i10 < 4) {
            return;
        }
        c4j.A0g(3);
        int i11 = i10 - 4;
        if ((c4j.A0I() & 128) != 0) {
            if (i11 < 7 || (totalLength = c4j.A0K()) < 4) {
                return;
            }
            this.A01 = c4j.A0M();
            this.A00 = c4j.A0M();
            this.A07.A0d(totalLength - 4);
            i11 -= 7;
        }
        int limit = this.A07.A09();
        int position = this.A07.A0A();
        if (limit < position && i11 > 0) {
            int iMin = Math.min(i11, position - limit);
            c4j.A0k(this.A07.A0l(), limit, iMin);
            this.A07.A0f(limit + iMin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01(C4J c4j, int i10) {
        if (i10 < 19) {
            return;
        }
        this.A05 = c4j.A0M();
        this.A04 = c4j.A0M();
        c4j.A0g(11);
        this.A02 = c4j.A0M();
        this.A03 = c4j.A0M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(C4J c4j, int i10) {
        if (i10 % 5 != 2) {
            return;
        }
        c4j.A0g(2);
        Arrays.fill(this.A08, 0);
        int i11 = i10 / 5;
        for (int index = 0; index < i11; index++) {
            int iA0I = c4j.A0I();
            int a10 = c4j.A0I();
            int iA0I2 = c4j.A0I();
            int iA0I3 = c4j.A0I();
            int entryCount = iA0I2 - 128;
            int i12 = (int) (a10 + (entryCount * 1.402d));
            int g8 = (int) ((a10 - ((iA0I3 - 128) * 0.34414d)) - ((iA0I2 - 128) * 0.71414d));
            int entryCount2 = c4j.A0I() << 24;
            this.A08[iA0I] = entryCount2 | (AbstractC09264a.A07(i12, 0, 255) << 16) | (AbstractC09264a.A07(g8, 0, 255) << 8) | AbstractC09264a.A07((int) (a10 + ((iA0I3 - 128) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    public final C2565o2 A06() {
        int iA0I;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A0A() == 0 || this.A07.A09() != this.A07.A0A() || !this.A06) {
            return null;
        }
        this.A07.A0f(0);
        int[] iArr = new int[this.A01 * this.A00];
        int runLength = 0;
        while (runLength < iArr.length) {
            int argbBitmapDataIndex = this.A07.A0I();
            if (argbBitmapDataIndex != 0) {
                int[] argbBitmapData = this.A08;
                iArr[runLength] = argbBitmapData[argbBitmapDataIndex];
                runLength++;
            } else {
                int color = this.A07.A0I();
                if (color != 0) {
                    int i10 = color & 64;
                    String[] strArr = A09;
                    if (strArr[6].charAt(29) == strArr[4].charAt(29)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A09;
                    strArr2[0] = "GtJojiNEMobCnjKA96lXJCCL45Dtio0z";
                    strArr2[1] = "Lfhzohsg2V0yWJPoWAL0pRvwojJGYPpJ";
                    if (i10 == 0) {
                        iA0I = color & 63;
                    } else {
                        iA0I = ((color & 63) << 8) | this.A07.A0I();
                    }
                    Arrays.fill(iArr, runLength, runLength + iA0I, (color & 128) == 0 ? 0 : this.A08[this.A07.A0I()]);
                    runLength += iA0I;
                } else {
                    continue;
                }
            }
        }
        return new C3C().A0D(Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888)).A04(this.A02 / this.A05).A0A(0).A07(this.A03 / this.A04, 0).A09(0).A06(this.A01 / this.A05).A03(this.A00 / this.A04).A0H();
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0d(0);
        this.A06 = false;
    }
}
