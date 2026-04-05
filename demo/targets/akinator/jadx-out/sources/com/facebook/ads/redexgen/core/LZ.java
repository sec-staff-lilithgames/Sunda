package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LZ implements InterfaceC1669Xo {
    public static byte[] A0D;
    public int A00;
    public EG A01;
    public C09083i A02;
    public String A03;
    public final C1937dL A04;
    public final US A05;
    public final InterfaceC1668Xn A06;
    public final YT A07;
    public final E1 A08;
    public final DP A0C = new DP() { // from class: com.facebook.ads.redexgen.X.5x
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i10, int i11, int i12) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{115, 108, 97, 96, 106, 76, 107, 113, 96, 119, 118, 113, 108, 113, 100, 105, 64, 115, 96, 107, 113};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(DQ dq2) {
            this.A00.A06.A4c(A00(0, 21, 63), dq2);
        }
    };
    public final DR A0B = new DR() { // from class: com.facebook.ads.redexgen.X.5w
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i10, int i11, int i12) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{38, 57, 52, 53, Utf8.REPLACEMENT_BYTE, 25, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, 21, 38, 53, 62, 36};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Y c3y) {
            this.A00.A06.A4c(A00(0, 21, 40), c3y);
        }
    };
    public final DX A09 = new DX() { // from class: com.facebook.ads.redexgen.X.5v
        public static byte[] A01;
        public static String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};

        public static String A00(int i10, int i11, int i12) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                int i14 = bArrCopyOfRange[i13] ^ i12;
                if (A02[2].charAt(8) != '5') {
                    throw new RuntimeException();
                }
                A02[5] = "7KI0j9KfVtSFY3dF";
                bArrCopyOfRange[i13] = (byte) (i14 ^ 70);
            }
            return new String(bArrCopyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{3, 28, 17, 16, 26, 60, 27, 1, 16, 7, 6, 1, 28, 1, 20, 25, 48, 3, 16, 27, 1};
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C09033d c09033d) {
            this.A00.A06.A4c(A00(0, 21, 51), c09033d);
        }
    };
    public final DV A0A = new DV() { // from class: com.facebook.ads.redexgen.X.5t
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(DW dw2) {
            this.A00.A07.ADH();
        }
    };

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, 61, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, 47, 0, 21, 8, 23, 4, 34, 21, 0, 35, 20, 21, 21, 14, 15, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, 64, 64, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, Utf8.REPLACEMENT_BYTE, 32, 45, 44, 38, 28, 27, 5};
    }

    public LZ(C1937dL c1937dL, YT yt2, US us, InterfaceC1668Xn interfaceC1668Xn) {
        this.A04 = c1937dL;
        this.A05 = us;
        this.A07 = yt2;
        this.A08 = new E1(c1937dL);
        this.A08.A0i(new C3D(c1937dL));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = interfaceC1668Xn;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC1668Xn.A3x(this.A08, layoutParams);
        C1676Xv closeButton = new C1676Xv(c1937dL);
        closeButton.setOnClickListener(new YR(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC1668Xn.A3x(closeButton, params);
    }

    public final void A04(int i10) {
        this.A08.setVideoProgressReportIntervalMs(i10);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r02) {
        String ctaText = A02(8, 11, 127);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C1902cl c1902cl = new C1902cl(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i10 = (int) (16.0f * AbstractC1640Wl.A02);
            layoutParams.setMargins(i10, i10, i10, i10);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c1902cl.setOnClickListener(new YS(this));
            this.A06.A3x(c1902cl, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), 0);
        this.A02 = new C09083i(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (U7.A1v(this.A04)) {
            this.A01 = new EG(this.A04, this.A05, this.A08, this.A03, false, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0d(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0h(EnumC1953db.A04, 17);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AEV(boolean z10) {
        this.A06.A4c(A02(37, 21, 39), new DT());
        this.A08.A0a();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AF0(boolean z10) {
        this.A06.A4c(A02(37, 21, 39), new DS());
        if (!this.A08.A0r()) {
            this.A08.A0h(EnumC1953db.A04, 18);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1669Xo
    public final void onDestroy() {
        this.A06.A4c(A02(37, 21, 39), new DL(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0j(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A08();
        }
        this.A08.A0e(1);
        this.A08.A0Z();
    }
}
