package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.64, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass64 extends E1 {
    public static byte[] A0F;
    public static String[] A0G = {"Cb7nBOTqt", "Uv90YERdy9SZ9btNePue9j4WSufKww0d", "5tFdsnJl1aHC8QazlewrqKxrXvRcdsO5", "4XUHzfDXngka", "6zmG8GCKaenNI", "iTvfTfiU680tAW5ZUJpNe0fUcB62AaOp", "iIjhxtVkNHrsB", "9VdyyBhNHsky"};
    public static final String A0H;
    public Uri A00;
    public NativeAd A01;
    public US A02;
    public Y1 A03;
    public EG A04;
    public C09083i A05;
    public String A06;
    public String A07;
    public String A08;
    public final C1386Mj A09;
    public final C1937dL A0A;
    public final DX A0B;
    public final DR A0C;
    public final DP A0D;
    public final String A0E;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A0G[0].length() == 17) {
                throw new RuntimeException();
            }
            A0G[2] = "GV7dEmS9dQikFIsLGq03TvmmBp0PGqms";
            bArrCopyOfRange[i13] = (byte) ((b10 ^ i12) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{32, 2, 13, 68, 23, 67, 16, 23, 2, 17, 23, 67, 34, 22, 7, 10, 6, 13, 0, 6, 45, 6, 23, 20, 12, 17, 8, 34, 0, 23, 10, 21, 10, 23, 26, 77, 67, 46, 2, 8, 6, 67, 16, 22, 17, 6, 67, 23, 11, 2, 23, 67, 10, 23, 68, 16, 67, 10, 13, 67, 26, 12, 22, 17, 67, 34, 13, 7, 17, 12, 10, 7, 46, 2, 13, 10, 5, 6, 16, 23, 77, 27, 14, 15, 67, 5, 10, 15, 6, 77, 29, 42, 42, 55, 42, 98, 120, 35, 39, 36, 16, 1, 12, 0, 11, 6, 0, 43, 0, 17, 18, 10, 23, 14, 21, 45, 43, 44, 120, 43, 61, 44, 27, 52, 49, 61, 54, 44, 12, 55, 51, 61, 54, 120, 62, 49, 42, 43, 44, 3, 59, 61, 58, 110, 61, 43, 58, 24, 39, 42, 43, 33, 27, 28, 7, 110, 33, 60, 110, 61, 43, 58, 24, 39, 42, 43, 33, 3, 30, 10, 110, 40, 39, 60, 61, 58, 30, 17, 32, 30, 28, 11, 22, 9, 22, 11, 6, 51, 60, 57, 53, 62, 36, 4, Utf8.REPLACEMENT_BYTE, 59, 53, 62, 62, 47, 60, 61, 39, 32, 41, 23, 21, 2, 3, 2, 1, 14, 9, 2, 3, 40, 21, 14, 2, 9, 19, 6, 19, 14, 8, 9, 44, 2, 30, 86, 77, 74, 82, 86, 70, 106, 71, 42, 44, 58, 17, 62, 43, 54, 41, 58, 28, 43, 62, 29, 42, 43, 43, 48, 49, 117, 106, 103, 102, 108, 79, 108, 100, 100, 102, 113, 85, 74, 71, 70, 76, 110, 115, 103, 66, 93, 80, 81, 91, 103, 81, 81, 95, 96, 93, 89, 81, 99, 124, 113, 112, 122, 64, 71, 89, 17, 14, 3, 2, 8, 56, 19, 14, 10, 2, 56, 23, 8, 11, 11, 14, 9, 0, 56, 14, 9, 19, 2, 21, 17, 6, 11, 19, 12, 0, 18, 49, 28, 21, 0};
    }

    static {
        A03();
        A0H = AnonymousClass64.class.getSimpleName();
    }

    public AnonymousClass64(C1937dL c1937dL) {
        super(c1937dL);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new DP() { // from class: com.facebook.ads.redexgen.X.6E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AEX();
                }
            }
        };
        this.A0C = new DR() { // from class: com.facebook.ads.redexgen.X.6D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new DX() { // from class: com.facebook.ads.redexgen.X.6C
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ACn();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C1386Mj(this, c1937dL);
        this.A0A = c1937dL;
        A02();
    }

    public AnonymousClass64(C1937dL c1937dL, AttributeSet attributeSet) {
        super(c1937dL, attributeSet);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new DP() { // from class: com.facebook.ads.redexgen.X.6E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AEX();
                }
            }
        };
        this.A0C = new DR() { // from class: com.facebook.ads.redexgen.X.6D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new DX() { // from class: com.facebook.ads.redexgen.X.6C
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ACn();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C1386Mj(this, c1937dL);
        this.A0A = c1937dL;
        A02();
    }

    public AnonymousClass64(C1937dL c1937dL, AttributeSet attributeSet, int i10) {
        super(c1937dL, attributeSet, i10);
        this.A0E = UUID.randomUUID().toString();
        this.A0D = new DP() { // from class: com.facebook.ads.redexgen.X.6E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (this.A00.A03 != null) {
                    this.A00.A03.AEX();
                }
            }
        };
        this.A0C = new DR() { // from class: com.facebook.ads.redexgen.X.6D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
                if (this.A00.A03 != null) {
                    this.A00.A03.onPause();
                }
            }
        };
        this.A0B = new DX() { // from class: com.facebook.ads.redexgen.X.6C
            public static String[] A01 = {"NidaN7FoPBbaKg721Bw4T4ZedkUEC8Kp", "T6", "FoXhB5efLBt1Ix1VLvHMf2xPaJTvayS4", "Ki7KmbouuPEeN63k7Tf8VIoYM6z8lFxL", "sQ99pP", "JVozQuP1BqTf", "NfzwiYkR35AXK2rv0hn4uIoCH9D93AVk", "I59WEHRkBvEx"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                if (this.A00.A03 != null) {
                    this.A00.A03.ACn();
                    if (A01[3].charAt(11) == 'F') {
                        throw new RuntimeException();
                    }
                    A01[3] = "dba5oiQ8v4CkqUII5uWz8sPENBYPSf9M";
                }
            }
        };
        this.A09 = new C1386Mj(this, c1937dL);
        this.A0A = c1937dL;
        A02();
    }

    private void A02() {
        getEventBus().A03(this.A0D, this.A0C, this.A0B);
    }

    private void A04(Intent intent) {
        if (this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        if (this.A00 == null && this.A08 == null) {
            A05(A01(139, 37, 74));
            String[] strArr = A0G;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "rwc2";
            return;
        }
        intent.putExtra(A01(237, 18, 91), this.A07);
        intent.putExtra(A01(322, 8, 97), EnumC1607Vb.A09);
        intent.putExtra(A01(MBSupportMuteAdType.INTERSTITIAL_VIDEO, 8, 17), this.A00.toString());
        intent.putExtra(A01(187, 11, 84), this.A06 == null ? A01(0, 0, 6) : this.A06);
        intent.putExtra(A01(266, 8, 39), this.A08);
        intent.putExtra(A01(205, 24, 99), AbstractC1640Wl.A00(this.A0A));
        intent.putExtra(A01(274, 13, 48), getCurrentPositionInMillis());
        String[] strArr2 = A0G;
        if (strArr2[7].length() != strArr2[3].length()) {
            throw new RuntimeException();
        }
        A0G[0] = "bFTSk0Gp6QusC65PcsD";
        intent.putExtra(A01(229, 8, 39), this.A0E);
        intent.putExtra(A01(255, 11, 7), this.A05.A0c());
        intent.putExtra(A01(295, 27, 99), getVideoProgressReportIntervalMs());
        intent.addFlags(268435456);
    }

    private void A05(String str) {
        this.A0A.A08().AAy(A01(198, 7, 74), AbstractC1550Sv.A28, new C1551Sw(AdErrorType.PARSER_FAILURE.getDefaultErrorMessage(), A01(90, 7, 92) + str));
        if (AdInternalSettings.isDebugBuild()) {
            Log.w(A0H, str);
        }
    }

    public final void A0u() {
        if (this.A01 != null) {
            this.A01.onCtaBroadcast();
        }
    }

    public final void A0v() {
        AdActivityIntent adActivityIntentA05 = WB.A05(this.A0A);
        A04(adActivityIntentA05);
        try {
            A0l(false, 6);
            setVisibility(8);
            WB.A0B(this.A0A, adActivityIntentA05);
        } catch (Exception e10) {
            this.A0A.A08().AAy(A01(176, 11, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), AbstractC1550Sv.A0D, new C1551Sw(e10));
            Log.e(A01(97, 17, 97), A01(0, 90, 103), e10);
        }
    }

    public Y1 getListener() {
        return this.A03;
    }

    public String getUniqueId() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.core.E1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.E1, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A09.A03();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(US us) {
        this.A02 = us;
    }

    public void setClientToken(String str) {
        C09083i c09083i;
        if (this.A04 != null) {
            EG eg2 = this.A04;
            String[] strArr = A0G;
            if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[2] = "geldSN57Uojbab2WOS9MzcIW4E8sQ4xA";
            eg2.A07();
        }
        if (this.A05 != null) {
            this.A05.A0p();
        }
        this.A06 = str;
        EG eg3 = null;
        if (str != null) {
            c09083i = new C09083i(this.A0A, this.A02, this, str);
        } else {
            c09083i = null;
        }
        this.A05 = c09083i;
        if (this.A05 != null && U7.A1v(this.A0A)) {
            if (str != null) {
                eg3 = new EG(this.A0A, this.A02, this, str, false, this.A05, null);
            }
            this.A04 = eg3;
            return;
        }
        this.A04 = null;
    }

    public void setEnableBackgroundVideo(boolean z10) {
        super.A0E.setBackgroundPlaybackEnabled(z10);
    }

    public void setListener(Y1 y12) {
        this.A03 = y12;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.A01 = nativeAd;
    }

    public void setVideoCTA(String str) {
        this.A07 = str;
    }

    @Override // com.facebook.ads.redexgen.core.E1
    public void setVideoMPD(String str) {
        if (str != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A08 = str;
        String[] strArr = A0G;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[4] = "ao7Mn74HmNnh4";
        strArr2[6] = "E6rOC8IWnX5Ja";
        super.setVideoMPD(str);
    }

    @Override // com.facebook.ads.redexgen.core.E1
    public void setVideoURI(Uri uri) {
        if (uri != null && this.A05 == null) {
            A05(A01(114, 25, 92));
            return;
        }
        this.A00 = uri;
        super.setVideoURI(uri);
        String[] strArr = A0G;
        if (strArr[5].charAt(7) == strArr[1].charAt(7)) {
            throw new RuntimeException();
        }
        A0G[0] = "z2OQUaNXEwktMvnJ8h1OzGBt0";
    }
}
