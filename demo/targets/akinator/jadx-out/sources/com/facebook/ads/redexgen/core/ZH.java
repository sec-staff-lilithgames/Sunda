package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZH extends LinearLayout {
    public static byte[] A0D;
    public static String[] A0E = {"gmSbsJUTV6ssYU6sPFdQApLIq3Ne91IM", "MfGeHL5PmkPbpLjQYYWOTSdzt", "", "SJThwTW85f7z2tdQDzwWLTm6w", "rQXooJE", "LhKJvtc1UCCcm5M0SWMNGP7YHUEfZfxE", "", "2Oh5HyK"};
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final Uri A0I;
    public static final View.OnTouchListener A0J;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public ZG A04;
    public ZU A05;
    public String A06;
    public final float A07;
    public final WebView A08;
    public final C1937dL A09;
    public final ZZ A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        byte[] bArr = {-43, -12, -10, -2, -68, -27, -24, -20, -34, 0, 41, 44, 49, 27, 44, 30, 23, 56, 45, 54, -24, 54, 41, 60, 49, 62, 45, -24, 42, 58, 55, Utf8.REPLACEMENT_BYTE, 59, 45, 58, 41, 42, 55, 61, 60, 2, 42, 52, 41, 54, 51, 55, 68, 58, 72, 69, Utf8.REPLACEMENT_BYTE, 58, 4, Utf8.REPLACEMENT_BYTE, 68, 74, 59, 68, 74, 4, 55, 57, 74, Utf8.REPLACEMENT_BYTE, 69, 68, 4, 44, 31, 27, 45, -29, -17, -19, -82, -31, -18, -28, -14, -17, -23, -28, -82, -29, -24, -14, -17, -19, -27, 59, 71, 71, 67, 13, 2, 2, 74, 74, 74, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 54, 66, 64};
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[7] = "Ujyw6mT";
        strArr2[4] = "Vqhraj8";
        A0D = bArr;
    }

    static {
        A0A();
        A0G = Color.rgb(224, 224, 224);
        A0H = Color.argb(34, 0, 0, 0);
        A0F = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0I = WQ.A00(A06(90, 23, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        A0J = new ZB();
    }

    public ZH(C1937dL c1937dL, WebView webView, boolean z10) {
        super(c1937dL);
        this.A07 = getResources().getDisplayMetrics().density;
        this.A0A = new LR(this);
        this.A08 = webView;
        this.A09 = c1937dL;
        this.A0B = U8.A06(c1937dL);
        this.A0C = z10;
        A08();
        A0C(false);
    }

    private void A08() {
        int buttonSizePx;
        int i10 = (int) (A0F * this.A07);
        XP.A0K(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A09);
        this.A01.setContentDescription(A06(4, 5, 28));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(XY.A01(XX.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0J);
        this.A01.setOnClickListener(new ZC(this));
        addView(this.A01, layoutParams);
        if (this.A0B && !U7.A2o(this.A09)) {
            this.A00 = new ImageView(this.A09);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 54));
            ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i10, i10);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(XY.A01(XX.BACK_ARROW_V2));
            this.A00.setOnTouchListener(A0J);
            this.A00.setOnClickListener(new ZD(this));
            addView(this.A00, layoutParams2);
        }
        this.A05 = new ZU(this.A09);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0B || U7.A2o(this.A09)) {
            buttonSizePx = 1056964608;
        } else {
            buttonSizePx = 1065353216;
        }
        layoutParams3.weight = buttonSizePx;
        this.A05.setGravity(17);
        if (U7.A2o(this.A09) && !this.A0C) {
            LinearLayout linearLayout = new LinearLayout(this.A09);
            linearLayout.setOrientation(1);
            addView(linearLayout, layoutParams3);
            XP.A0I(linearLayout);
            ImageView imageView = new ImageView(this.A09);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(XY.A01(XX.HANDLER));
            linearLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView(this.A05, titleParams);
        } else {
            addView(this.A05, layoutParams3);
        }
        if (this.A0B && !U7.A2o(this.A09)) {
            this.A02 = new ImageView(this.A09);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 93));
            ViewGroup.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(i10, i10);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(XY.A02(XX.BACK_ARROW_V2));
            this.A02.setOnTouchListener(A0J);
            this.A02.setOnClickListener(new ZE(this));
            addView(this.A02, titleViewsParams);
        }
        this.A03 = new ImageView(this.A09);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i10, i10);
        this.A03.setContentDescription(A06(16, 19, 107));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0J);
        this.A03.setOnClickListener(new ZF(this));
        addView(this.A03, layoutParams4);
        A09();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            r7 = this;
            r5 = 0
            com.facebook.ads.redexgen.X.dL r0 = r7.A09
            boolean r6 = com.facebook.ads.redexgen.core.U7.A0k(r0)
            r3 = 0
            if (r6 != 0) goto L36
            com.facebook.ads.redexgen.X.dL r0 = r7.A09
            android.content.pm.PackageManager r4 = r0.getPackageManager()
            if (r4 == 0) goto L36
            r2 = 46
            r1 = 26
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r2 = A06(r2, r1, r0)
            android.net.Uri r0 = com.facebook.ads.redexgen.core.ZH.A0I
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            r0 = 65536(0x10000, float:9.1835E-41)
            java.util.List r4 = r4.queryIntentActivities(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L5a
            android.widget.ImageView r1 = r7.A03
            r0 = 8
            r1.setVisibility(r0)
        L36:
            com.facebook.ads.redexgen.X.dL r0 = r7.A09
            boolean r0 = com.facebook.ads.redexgen.core.U7.A2o(r0)
            if (r0 != 0) goto L40
            if (r6 == 0) goto Lbc
        L40:
            android.widget.ImageView r4 = r7.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ZH.A0E
            r0 = 2
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lae
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L5a:
            int r5 = r4.size()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ZH.A0E
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L9e
            r0 = 1
            if (r5 != r0) goto La9
        L73:
            java.lang.Object r0 = r4.get(r3)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 == 0) goto La9
            java.lang.Object r0 = r4.get(r3)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r4 = r0.packageName
            r2 = 72
            r1 = 18
            r0 = 35
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto La9
            com.facebook.ads.redexgen.X.XX r0 = com.facebook.ads.redexgen.core.XX.BROWSER_LAUNCH_CHROME
            android.graphics.Bitmap r5 = com.facebook.ads.redexgen.core.XY.A01(r0)
            goto L36
        L9e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ZH.A0E
            java.lang.String r1 = "OiPmrAn3GllLAwonlzrco6n6FhbN6530"
            r0 = 0
            r2[r0] = r1
            r0 = 1
            if (r5 != r0) goto La9
            goto L73
        La9:
            android.graphics.Bitmap r5 = getExternalBrowserBitmap()
            goto L36
        Lae:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ZH.A0E
            java.lang.String r1 = "H3zrzdIXpl7cuf9737Dh0UcXPx3q90pI"
            r0 = 0
            r2[r0] = r1
            r4.setVisibility(r3)
            android.graphics.Bitmap r5 = getExternalBrowserBitmap()
        Lbc:
            android.widget.ImageView r0 = r7.A03
            r0.setImageBitmap(r5)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ZH.A0E
            r0 = 2
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Ld9
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Ld9:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.ZH.A0E
            java.lang.String r1 = "C5b1pkMeIVGGxpo7XcAe9IGkuMZh8kn1"
            r0 = 5
            r2[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.ZH.A09():void");
    }

    private void A0C(boolean z10) {
        int i10 = z10 ? 0 : 8;
        if (this.A00 != null) {
            this.A00.setVisibility(i10);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        if (z10) {
            A0C(true);
        }
    }

    public ZZ getBrowserNavigationListener() {
        return this.A0A;
    }

    public static Bitmap getExternalBrowserBitmap() {
        XX xx = XX.BROWSER_LAUNCH_NATIVE_V2;
        if (A0E[0].charAt(23) == 'K') {
            throw new RuntimeException();
        }
        A0E[0] = "lUY1mRDCMXM3WZHcFiHRXNaY27JpPEEp";
        return XY.A01(xx);
    }

    public void setCloseButtonVisibility(int i10) {
        this.A01.setVisibility(i10);
    }

    public void setListener(ZG zg2) {
        this.A04 = zg2;
    }

    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    public void setUrl(String str) throws SecurityException {
        this.A06 = str;
        if (!TextUtils.isEmpty(this.A06)) {
            String strA06 = A06(35, 11, 107);
            if (A0E[0].charAt(23) == 'K') {
                throw new RuntimeException();
            }
            A0E[0] = "qQ1cUQL6zuFcmcs6RwakvLgHhcCBx0UL";
            if (!strA06.equals(this.A06)) {
                this.A05.setSubtitle(this.A06);
                this.A03.setEnabled(true);
                this.A03.setColorFilter((ColorFilter) null);
                return;
            }
        }
        this.A05.setSubtitle(null);
        this.A03.setEnabled(false);
        this.A03.setColorFilter(new PorterDuffColorFilter(A0G, PorterDuff.Mode.SRC_IN));
    }
}
