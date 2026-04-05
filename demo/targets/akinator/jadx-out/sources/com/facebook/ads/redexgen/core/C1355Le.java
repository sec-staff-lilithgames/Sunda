package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1355Le implements InterfaceC1633Wc {
    public static byte[] A01;
    public static String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ C1353Lc A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public C1355Le(C1353Lc c1353Lc) {
        this.A00 = c1353Lc;
    }

    public /* synthetic */ C1355Le(C1353Lc c1353Lc, C1371Lu c1371Lu) {
        this(c1353Lc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void ACp() {
        this.A00.A0a.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        if (this.A00.A0X) {
            boolean zA0V = this.A00.A0V();
            String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (zA0V) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0a.setToolbarActionMode(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1633Wc
    public final void AEn(float f10) {
        float fA04;
        this.A00.A0O((int) f10);
        if (this.A00.A0Y) {
            if (this.A00.A0E) {
                AbstractC2212hy abstractC2212hy = this.A00.A0I;
                if (A02[6].charAt(27) != 'a') {
                    throw new RuntimeException();
                }
                A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
                fA04 = 1.0f - (f10 / abstractC2212hy.A20().A0H().A03());
                if (this.A00.A0H || fA04 < 1.0f) {
                    this.A00.A0H = false;
                    this.A00.A0a.setToolbarActionMessage(this.A00.A0I.A24().A02().replace(A00(0, 6, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), String.valueOf((int) f10)));
                } else {
                    this.A00.A0H = true;
                    AbstractC1667Xm abstractC1667Xm = this.A00.A0a;
                    String strA00 = A00(0, 0, 19);
                    if (A02[3].length() != 16) {
                        abstractC1667Xm.setToolbarActionMessage(strA00);
                    } else {
                        String[] strArr = A02;
                        strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                        strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                        abstractC1667Xm.setToolbarActionMessage(strA00);
                    }
                }
            } else {
                fA04 = 1.0f - (f10 / this.A00.A0I.A20().A0H().A04());
            }
            this.A00.A0a.setProgress(100.0f * fA04);
            float fA03 = this.A00.A0I.A20().A0H().A03() - f10;
            float percentageOfReward = this.A00.A0I.A20().A0H().A04();
            boolean z10 = fA03 >= percentageOfReward;
            if (!this.A00.A0H && z10) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
            return;
        }
        this.A00.A0a.setProgress(100.0f * (1.0f - (f10 / this.A00.A0J.A07())));
    }
}
