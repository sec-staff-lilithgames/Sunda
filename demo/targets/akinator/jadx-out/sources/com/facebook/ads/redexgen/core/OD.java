package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OD extends RelativeLayout implements InterfaceC1669Xo {
    public static byte[] A0F;
    public static final String A0G;
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public String A04;
    public boolean A05;
    public final R6 A06;
    public final R0 A07;
    public final C1937dL A08;
    public final US A09;
    public final InterfaceC1668Xn A0A;
    public final ZO A0B;
    public final ZP A0C;
    public final ZY A0D;
    public final LJ A0E;

    public static String A0C(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0F = new byte[]{90, 112, 112, 125, 112, 20, Utf8.REPLACEMENT_BYTE, 61, 112, 19, Utf8.REPLACEMENT_BYTE, 62, 36, 53, 62, 36, 112, 28, Utf8.REPLACEMENT_BYTE, 49, 52, 53, 52, 112, 4, 57, 61, 53, 106, 112, 48, 26, 26, 23, 26, 118, 85, 91, 94, 26, 124, 83, 84, 83, 73, 82, 26, 110, 83, 87, 95, 0, 26, 95, 117, 117, 120, 117, 25, 58, 52, 49, 117, 6, 33, 52, 39, 33, 117, 1, 60, 56, 48, 111, 117, 117, 95, 95, 82, 95, 45, 26, 12, 15, 16, 17, 12, 26, 95, 58, 17, 27, 95, 43, 22, 18, 26, 69, 95, 109, 71, 71, 74, 71, 52, 4, 21, 8, 11, 11, 71, 53, 2, 6, 3, 30, 71, 51, 14, 10, 2, 93, 71, 87, 125, 125, 112, 125, 14, 56, 46, 46, 52, 50, 51, 125, 27, 52, 51, 52, 46, 53, 125, 9, 52, 48, 56, 103, 125, 42, 26, 48, 48, 61, 48, 88, 113, 126, 116, 124, 117, 98, 48, 68, 121, 125, 117, 42, 48, 97, 81, 76, 84, 80, 70, 81, 3, 80, 70, 80, 80, 74, 76, 77, 3, 71, 66, 87, 66, 3, 79, 76, 68, 68, 70, 71, 3, 99, 3, 126, 125, 112, 106, 107, 37, 125, 115, 126, 113, 116, 67, 83, 78, 86, 82, 68, 83, 116, 115, 109, 85, 90, 95, 83, 88, 66, 98, 89, 93, 83, 88, 37, 44, 35, 41, 33, 40, Utf8.REPLACEMENT_BYTE, 25, 36, 32, 40};
    }

    static {
        A0D();
        A0G = OD.class.getSimpleName();
    }

    public OD(R0 r02, C1937dL c1937dL, US us, InterfaceC1668Xn interfaceC1668Xn) {
        LJ lj2;
        super(c1937dL);
        this.A06 = new C1434Oi(this);
        this.A05 = true;
        this.A01 = -1L;
        this.A03 = true;
        this.A07 = r02;
        this.A09 = us;
        this.A0A = interfaceC1668Xn;
        this.A08 = c1937dL;
        if (c1937dL.A0E() == null) {
            c1937dL.A0F().A9n();
        }
        this.A0D = A0E();
        if (U8.A02(c1937dL) || c1937dL.A0E() == null) {
            lj2 = new LJ(c1937dL, this.A0D);
        } else {
            lj2 = new LJ(c1937dL, c1937dL.A0E(), this.A0D);
        }
        this.A0E = lj2;
        this.A0B = new ZO(c1937dL, this.A0E);
        this.A0B.setId(View.generateViewId());
        this.A0B.setListener(new C1431Of(this));
        this.A0E.setBrowserNavigationListener(this.A0B.getBrowserNavigationListener());
        this.A0C = new ZP(c1937dL, null, R.attr.progressBarStyleHorizontal);
        A0F();
        r02.A0A(this.A06);
    }

    public ZY A0E() {
        return new OI(this);
    }

    public void A0F() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A0A.A3x(this.A0B, layoutParams);
        RelativeLayout.LayoutParams webViewParams = new RelativeLayout.LayoutParams(-1, -2);
        webViewParams.addRule(3, this.A0B.getId());
        webViewParams.addRule(12);
        this.A0A.A3x(this.A0E, webViewParams);
        RelativeLayout.LayoutParams webViewParams2 = new RelativeLayout.LayoutParams(-1, (int) (AbstractC1640Wl.A02 * 2.0f));
        webViewParams2.addRule(3, this.A0B.getId());
        this.A0C.setProgress(0);
        this.A0A.A3x(this.A0C, webViewParams2);
    }

    public void A0G() {
        this.A07.finish(1);
    }

    public void A0H(String str) {
    }

    public void AAl(Intent intent, Bundle bundle, R0 r02) throws SecurityException {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String strA0C = A0C(231, 11, 97);
        String strA0C2 = A0C(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 11, 26);
        String url = A0C(210, 10, 13);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(url);
            this.A04 = intent.getStringExtra(strA0C2);
            this.A00 = intent.getLongExtra(strA0C, -1L);
        } else {
            this.A02 = bundle.getString(url);
            this.A04 = bundle.getString(strA0C2);
            this.A00 = bundle.getLong(strA0C, -1L);
        }
        String strA0C3 = this.A02 != null ? this.A02 : A0C(199, 11, 51);
        this.A0B.setUrl(strA0C3);
        this.A0E.loadUrl(strA0C3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AEV(boolean z10) {
        this.A0E.onPause();
        if (this.A03) {
            this.A03 = false;
            ZS zsA07 = new ZR(this.A0E.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0E.getResponseEndMs()).A00(this.A0E.getDomContentLoadedMs()).A05(this.A0E.getScrollReadyMs()).A02(this.A0E.getLoadFinishMs()).A06(System.currentTimeMillis()).A07();
            this.A09.AAr(this.A04, zsA07.A02());
            if (BuildConfigApi.isDebug()) {
                String str = A0C(169, 30, 15) + System.currentTimeMillis() + A0C(149, 20, 60) + zsA07.A01 + A0C(53, 22, Sdk.SDKError.Reason.TPAT_ERROR_VALUE) + zsA07.A03 + A0C(75, 24, 83) + zsA07.A04 + A0C(0, 30, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + zsA07.A00 + A0C(99, 24, 75) + zsA07.A05 + A0C(30, 23, 22) + zsA07.A02 + A0C(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 26, 113) + zsA07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AF0(boolean z10) {
        this.A0E.onResume();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AIB(Bundle bundle) {
        bundle.putString(A0C(210, 10, 13), this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public String getCurrentClientToken() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A07.A0B(this.A06);
        AbstractC1717Zk.A03(this.A0E);
        this.A0E.destroy();
    }

    public void setListener(InterfaceC1668Xn interfaceC1668Xn) {
    }
}
