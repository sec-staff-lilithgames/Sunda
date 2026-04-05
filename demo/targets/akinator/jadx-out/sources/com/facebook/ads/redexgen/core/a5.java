package com.facebook.ads.redexgen.core;

import android.content.ActivityNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class a5 {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public MF A00;
    public MH A01;
    public AbstractC2212hy A02;
    public C1636Wh A03;
    public InterfaceC1650Wv A04;
    public InterfaceC1737a4 A05;
    public boolean A06;
    public boolean A07;
    public final N3 A08;
    public final C1937dL A09;
    public final US A0A;
    public final XH A0B;
    public final InterfaceC1668Xn A0C;
    public final C2010eX A0D;
    public final String A0E;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public a5(C1937dL c1937dL, String str, C2010eX c2010eX, XH xh2, US us, N3 n32) {
        this(c1937dL, str, c2010eX, xh2, us, n32, new KF());
    }

    public a5(C1937dL c1937dL, String str, C2010eX c2010eX, XH xh2, US us, N3 n32, InterfaceC1668Xn interfaceC1668Xn) {
        this.A06 = true;
        this.A09 = c1937dL;
        this.A0E = str;
        this.A0D = c2010eX;
        this.A0B = xh2;
        this.A0A = us;
        this.A08 = n32;
        this.A0C = interfaceC1668Xn;
    }

    public a5(C1937dL c1937dL, String str, C2010eX c2010eX, XH xh2, US us, N3 n32, InterfaceC1668Xn interfaceC1668Xn, InterfaceC1650Wv interfaceC1650Wv) {
        this.A06 = true;
        this.A09 = c1937dL;
        this.A0E = str;
        this.A0D = c2010eX;
        this.A0B = xh2;
        this.A0A = us;
        this.A08 = n32;
        this.A0C = interfaceC1668Xn;
        this.A04 = interfaceC1650Wv;
    }

    private ME A00(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 33);
        ME actionOutcome = ME.A09;
        try {
            XP.A0Y(map, this.A02);
            Uri uriA00 = WQ.A00(str2);
            if (this.A01 == null) {
                this.A01 = MI.A01(this.A09, this.A0A, str, uriA00, new C1722Zp(map).A03(this.A0D).A02(this.A0B).A05(), this.A06, this.A07, this.A08);
                A02();
            }
            if (this.A01 instanceof C7Q) {
                ((C7Q) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A07 && (this.A01 instanceof C7P)) {
                    actionOutcome = ME.A08;
                }
            }
            if (!(((this.A01 instanceof C7O) || (this.A01 instanceof C7Q)) && XP.A0e(this.A09, actionOutcome, map)) && actionOutcome != ME.A06) {
                if (this.A05 != null) {
                    this.A05.ACu();
                }
                this.A0C.A4b(this.A0E);
            }
        } catch (ActivityNotFoundException e10) {
            Log.e(strA01, A01(44, 20, 68) + str2, e10);
        } catch (Exception e11) {
            Log.e(strA01, A01(22, 22, 27), e11);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(C1937dL c1937dL) {
        boolean zA2o = U7.A2o(c1937dL);
        int iA07 = U7.A07(c1937dL);
        long jCurrentTimeMillis = System.currentTimeMillis() - A0F;
        if (zA2o && A0F > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final ME A05(String str, String str2, Map<String, String> extraData) throws PackageManager.NameNotFoundException, RemoteException {
        ME meA00 = ME.A09;
        new C1580Ua(str, this.A0A).A04(UZ.A0J, extraData);
        if (this.A0B.A09(this.A09)) {
            this.A0A.AAs(str, extraData);
        } else {
            meA00 = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A20().A0L() != null && this.A04 != null) {
                WX.A07(this.A09.A02(), this.A02.A20().A0L(), this.A04);
            }
        }
        return meA00;
    }

    public final MF A06() {
        if (this.A01 != null) {
            MF mfA0E = this.A01.A0E();
            String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return mfA0E;
        }
        return null;
    }

    public final void A07(MF mf2) {
        this.A00 = mf2;
        A02();
    }

    public final void A08(AbstractC2212hy abstractC2212hy) {
        this.A02 = abstractC2212hy;
    }

    public final void A09(C1636Wh c1636Wh) {
        this.A03 = c1636Wh;
    }

    public final void A0A(InterfaceC1650Wv interfaceC1650Wv) {
        this.A04 = interfaceC1650Wv;
    }

    public final void A0B(InterfaceC1737a4 interfaceC1737a4) {
        this.A05 = interfaceC1737a4;
    }

    public final void A0C(boolean z10) {
        this.A07 = z10;
    }
}
