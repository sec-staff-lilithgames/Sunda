package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.RelativeLayout;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Qz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1503Qz implements AdViewApi {
    public static byte[] A0D;
    public static String[] A0E = {"8ZsaPqFHBksSubEDxj161z8v83o0PIqL", "1NWTdVv6N7aOqefGpQ3nVAkwh7f4QYaR", "Q4l1tys1ZSMgMj214694goNihNba6PJ2", "j8ts1um9VlgNYzePKTTbdrZm7P7LEYQS", "t56Pwr0qdwmiw03ThNEKvYWwkytCRLDg", "RREINDdqXCKFIVRasebbhTe", "edGRVZA6FwzGspMgtzkdHpprfoIdLjRD", "fNcadsm2hMDvYVzuw1qW3xw"};
    public long A00;
    public View A01;
    public AdListener A02;
    public AnonymousClass72 A03;
    public C1719Zm A04;
    public String A05;
    public String A06;
    public final DisplayMetrics A07;
    public final AdView A08;
    public final AdViewParentApi A09;
    public final C6M A0A;
    public final V4 A0B;
    public final String A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{-114, -108, -112, -64, -61, -66, -110, -66, -104, -102, -58, -104, -110, -60, -58, -107, 111, -114, -101, -101, -110, -97, 77, -114, -111, 77, -111, -110, -96, -95, -97, -100, -90, -110, -111, -83, -52, -39, -39, -48, -35, -117, -52, -49, -117, -41, -38, -52, -49, -117, -35, -48, -36, -32, -48, -34, -33, -48, -49, -34, -4, 9, 9, 10, 15, -69, 1, 4, 9, -1, -69, -4, -69, 15, 0, 8, 11, 7, -4, 15, 0, -69, 15, 3, -4, 15, -69, 7, 10, -4, -1, -69, -3, 4, -1, -69, -62, -64, 14, -62, -5, -2, -19, 3, 20, -1, -80, -79, -65, -64, -66, -69, -59, -70, -116, -124, -115, -121, -121, -70, -62, -59, -73, -70, -105, -70};
    }

    static {
        A02();
    }

    public C1503Qz(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        this.A00 = -1L;
        if (adSize != null && adSize != AdSize.INTERSTITIAL) {
            this.A07 = adView.getContext().getResources().getDisplayMetrics();
            this.A0B = WV.A04(adSize);
            this.A0C = str;
            this.A09 = adViewParentApi;
            this.A08 = adView;
            this.A0A = RB.A08(context);
            this.A0A.A0F().A3L(AdPlacementType.BANNER.toString(), str);
            NT nt2 = new NT(str, WV.A05(this.A0B), AdPlacementType.BANNER, WV.A04(adSize), 1, new C2169hB());
            nt2.A06(this.A05);
            nt2.A07(this.A06);
            this.A03 = new AnonymousClass72(this.A0A, nt2);
            this.A03.A0S(new C2090fq(this));
            return;
        }
        throw new IllegalArgumentException(A01(100, 6, 115));
    }

    public C1503Qz(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws V2 {
        this(context, str, A00(str2), adViewParentApi, adView);
        this.A0A.A0F().A4L();
    }

    public static AdSize A00(String str) throws V2 {
        V6 template = VB.A00(str);
        if (template != null) {
            VB.A03(template);
            return WV.A01(template);
        }
        throw new V2(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A01(59, 41, 116), str));
    }

    private void A03(String str) {
        this.A00 = System.currentTimeMillis();
        if (str == null) {
            this.A0A.A0F().A3I();
        } else {
            C6M c6m = this.A0A;
            if (A0E[1].charAt(22) == 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[5] = "M5Y3D3mNGdfLR2WDul4k9MR";
            strArr[7] = "fol70tWokzFUGtpcuxJkkr6";
            c6m.A0F().A3H();
        }
        AnonymousClass72 anonymousClass72 = this.A03;
        String[] strArr2 = A0E;
        if (strArr2[2].charAt(21) == strArr2[3].charAt(21)) {
            throw new RuntimeException();
        }
        A0E[1] = "pe4oZgDQ3sTDNo8k5JxuPcj1mqE4f2TD";
        if (anonymousClass72 != null) {
            this.A03.A0W(str);
        }
        this.A0A.A0F().A3G();
        if (A0E[1].charAt(22) != 'v') {
            A0E[1] = "D8Oc2vjooMbkdhwRsJFg2j6kNTTlIbDv";
        }
    }

    public final long A04() {
        return this.A00;
    }

    public final DisplayMetrics A05() {
        return this.A07;
    }

    public final AdListener A06() {
        return this.A02;
    }

    public final AdView A07() {
        return this.A08;
    }

    public final AnonymousClass72 A08() {
        return this.A03;
    }

    public final C6M A09() {
        return this.A0A;
    }

    public final V4 A0A() {
        return this.A0B;
    }

    public final void A0B(RelativeLayout relativeLayout, View view) {
        C1913cw c1913cwA01;
        this.A0A.A0F().A4Y(this.A06 != null);
        if (this.A06 != null && (c1913cwA01 = AbstractC1912cv.A01(this.A0A, this.A06)) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            relativeLayout.addView(c1913cwA01, new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        }
    }

    public final void A0C(AdListener adListener) {
        this.A0A.A0F().A3E(adListener != null);
        this.A02 = adListener;
    }

    public final void A0D(C1719Zm c1719Zm) {
        this.A04 = c1719Zm;
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final AdView.AdViewLoadConfigBuilder buildLoadAdConfig() {
        return new C1586Ug(this);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        VF.A05(A01(106, 7, 37), A01(16, 19, 6), A01(0, 8, 54));
        this.A0A.A0F().A3M();
        if (this.A03 != null) {
            this.A03.A0Y(true);
            this.A03.A0K();
            this.A03 = null;
        }
        if (this.A04 != null) {
            AdView adView = this.A08;
            String[] strArr = A0E;
            if (strArr[2].charAt(21) == strArr[3].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "SHsAoZcgZfma8JU5HMv6EkUhgjUJ0aGa";
            strArr2[4] = "YiN0xr4bPRWWNOnd45hBajl5vHs2Fp2h";
            if (U7.A1B(adView.getContext())) {
                this.A04.A07();
                if (this.A01 != null) {
                    ViewOverlay overlay = this.A01.getOverlay();
                    String[] strArr3 = A0E;
                    if (strArr3[0].charAt(29) != strArr3[4].charAt(29)) {
                        String[] strArr4 = A0E;
                        strArr4[2] = "J1HUKKESb8xh9TFSe40ffgC38LRgNVZ2";
                        strArr4[3] = "o5XwXeFkKzkcKZo9S4DQ1FFyX8pzWZSK";
                        overlay.remove(this.A04);
                    } else {
                        String[] strArr5 = A0E;
                        strArr5[0] = "s1kiAbubcu5fNfkZcH7haOM3HmV2C0HH";
                        strArr5[4] = "uWy9U3opZwSsfb0VGZsAFVhup97A7xCm";
                        overlay.remove(this.A04);
                    }
                }
            }
        }
        this.A08.removeAllViews();
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0C;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z10 = this.A03 == null || this.A03.A0Z();
        this.A0A.A0F().A5X(z10);
        return z10;
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        VF.A05(A01(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 6, 47), A01(35, 24, 68), A01(113, 7, 45));
        A03(null);
    }

    @Override // com.facebook.ads.internal.api.AdViewApi
    public final void loadAd(AdView.AdViewLoadConfig adViewLoadConfig) {
        VF.A05(A01(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 6, 47), A01(35, 24, 68), A01(8, 8, 59));
        A03(((C1586Ug) adViewLoadConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        this.A09.onConfigurationChanged(configuration);
        if (this.A01 != null) {
            V8.A01(this.A07, this.A01, this.A0B);
        }
    }

    @Override // com.facebook.ads.internal.api.AdViewApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A05 = extraHints.getHints();
        this.A06 = extraHints.getMediationData();
        if (U7.A0l(this.A0A) && this.A03 != null) {
            this.A03.A08.A06(this.A05);
            this.A03.A08.A07(this.A06);
        }
    }
}
