package com.facebook.ads.redexgen.core;

import android.os.Handler;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.hM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2179hM implements InterfaceC1381Me {
    public static byte[] A07;
    public static String[] A08 = {"HqViDmZKE9gqowyTLi9oGTmraxBLxdfb", "ZDhLRf5Uu21mhR1h1Q7a0O5z7jEhSu9k", "2GbaqYyT8OuzZpNttfxCN9qv1cIIYzBc", "fbbf2hOViPWoQMO0MuifN9tE3LO9hSeI", "DwEg34XuIOHddfNq0Duo86gfWbmgRcX4", "GcZc2s8wIoPvhyGTdTaWZVIVIYLPtEuL", "AIVK7lVsrhvQj", "0MZsasdmKrVN6CPRKwrl3lR9QzLAtIP"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ C10006w A04;
    public final /* synthetic */ TC A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, -112, -112, -115, -112, -59, -53, -65};
    }

    static {
        A01();
    }

    public C2179hM(C10006w c10006w, Runnable runnable, long j10, TC tc2) {
        this.A04 = c10006w;
        this.A06 = runnable;
        this.A03 = j10;
        this.A05 = tc2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1381Me
    public final void AEG(C2233iN c2233iN) {
        if (!this.A00) {
            this.A00 = true;
            String[] strArr = A08;
            if (strArr[1].charAt(12) != strArr[5].charAt(12)) {
                throw new RuntimeException();
            }
            A08[0] = "A302cEzPVYQXumyZNbB7zeSxM9mEDz6J";
            this.A04.A05(this.A05.A03(TG.A02), null);
        }
        if (this.A04.A07 != null) {
            this.A04.A07.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1381Me
    public final void AEH(C2233iN c2233iN) {
        if (c2233iN != this.A04.A00) {
            return;
        }
        Handler handlerA0H = this.A04.A0H();
        Runnable runnable = this.A06;
        if (A08[7].length() != 31) {
            throw new RuntimeException();
        }
        A08[0] = "XfIEhebH8X778eyni9LsSDQR6QKL4f9o";
        handlerA0H.removeCallbacks(runnable);
        this.A04.A01 = c2233iN;
        this.A04.A07.A0F(c2233iN);
        if (!this.A02) {
            this.A02 = true;
            Map mapA01 = this.A04.A01(this.A03);
            if (A08[3].charAt(7) == 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "6CdPuG9VNNO8hZ7pQWbBuknU9qSrspmw";
            strArr[5] = "JYrF77GwPBrAhOPn8MtwFVV4pu279MHz";
            this.A04.A05(this.A05.A03(TG.A04), mapA01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1381Me
    public final void AEI(C2233iN c2233iN) {
        if (!this.A01) {
            this.A01 = true;
            this.A04.A05(this.A05.A03(TG.A03), null);
        }
        this.A04.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1381Me
    public final void AEK(C2233iN c2233iN, V1 v12) {
        if (c2233iN != this.A04.A00) {
            return;
        }
        this.A04.A0H().removeCallbacks(this.A06);
        this.A04.A0Q(c2233iN);
        if (!this.A02) {
            this.A02 = true;
            Map mapA01 = this.A04.A01(this.A03);
            mapA01.put(A00(0, 5, 14), String.valueOf(v12.A03().getErrorCode()));
            mapA01.put(A00(5, 3, 72), String.valueOf(v12.A04()));
            this.A04.A05(this.A05.A03(TG.A04), mapA01);
        }
        this.A04.ADB(v12);
    }
}
