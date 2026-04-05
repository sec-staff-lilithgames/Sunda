package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.hK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2177hK implements VT {
    public static byte[] A0E;
    public static String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public NX A00;
    public TE A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final MU A07;
    public final C1937dL A08;
    public final US A09;
    public final V6 A0A;
    public final VU A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        XR.A02();
    }

    public C2177hK(C1937dL c1937dL, String str, V6 v62, AdSize adSize, int i10) {
        this.A08 = c1937dL;
        this.A0D = str;
        this.A0A = v62;
        this.A06 = adSize;
        this.A04 = i10;
        this.A0B = new VU(this.A08);
        this.A0B.A0R(this);
        this.A07 = new MU();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new AbstractC1443Or<C2177hK>(this) { // from class: com.facebook.ads.redexgen.X.6s
            {
                super(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
            public final void A07() {
                C2177hK c2177hKA08 = A08();
                if (c2177hKA08 == null) {
                    return;
                }
                if (C1661Xg.A02(c2177hKA08.A08)) {
                    c2177hKA08.A07();
                } else {
                    c2177hKA08.A05.postDelayed(c2177hKA08.A0C, 5000L);
                }
            }
        };
        this.A09 = c1937dL.A0A();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C2233iN> A04() {
        TE te2 = this.A01;
        final ArrayList arrayList = new ArrayList(te2.A02());
        for (TC tcA04 = te2.A04(); tcA04 != null; tcA04 = te2.A04()) {
            MP mpA00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (mpA00 != null && mpA00.A8c() == AdPlacementType.NATIVE) {
                final C2233iN nativeAdapter = (C2233iN) mpA00;
                nativeAdapter.A0L(this.A08, new AbstractC2178hL() { // from class: com.facebook.ads.redexgen.X.6v
                    @Override // com.facebook.ads.redexgen.core.InterfaceC1381Me
                    public final void AEH(C2233iN c2233iN) {
                        arrayList.add(nativeAdapter);
                    }
                }, this.A09, new NU(tcA04.A04(), te2.A05(), this.A0D, te2.A05().A0C()), C1480Qc.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0Q(new VR(this.A08, this.A0D, this.A06 != null ? new X1(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new VB(this.A08, null, null, null), X7.A01(U7.A0N(this.A08)), this.A02, null, new C2169hB()));
        } catch (V2 e10) {
            ADB(V1.A02(e10));
        }
    }

    public final void A08(NX nx) {
        this.A00 = nx;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.VT
    public final void ADB(V1 v12) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ADB(v12);
        }
    }

    @Override // com.facebook.ads.redexgen.core.VT
    public final void AFO(PW pw2) {
        TE teA00 = pw2.A00();
        if (teA00 != null) {
            if (this.A03) {
                long jA0A = teA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = teA00;
            List<C2233iN> listA04 = A04();
            if (this.A00 != null) {
                boolean zIsEmpty = listA04.isEmpty();
                String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (zIsEmpty) {
                    this.A00.ADB(V1.A01(AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.AEJ(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 18));
    }
}
