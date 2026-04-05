package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.dA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1927dA {
    public static byte[] A0i;
    public static String[] A0j = {"rlKCEchcqf0ciqqi5AvJfjd9N52fSCy8", "PNo7HsDb73vpBHqbFnDgLDKmrYNJyDDd", "113OeC", "Cx3CvN9GF4y9AfAfmcXjlQVU3pQMYVJa", "l70rAAhZwLIPPR5uDe0F7aYKOgrudYX3", "BVxdVuILB7huRlQ", "M763HrTZfS2tZdU8T7Ka7fPhorhGOaFK", "qRF7Z25uKAZ9gvWIqbx"};
    public ImageView A0M;
    public ImageView A0N;
    public LinearLayout A0O;
    public RelativeLayout A0P;
    public TextView A0Q;
    public C09846g A0R;
    public C1751aK A0S;
    public final Handler A0W;
    public final FrameLayout A0X;
    public final AbstractC2212hy A0Y;
    public final C1388Ml A0Z;
    public final C1398Mw A0a;
    public final N0 A0b;
    public final N9 A0c;
    public final C1937dL A0d;
    public final C1580Ua A0e;
    public final InterfaceC1668Xn A0f;
    public final KE A0g;
    public int A06 = 160;
    public int A07 = 130;
    public int A03 = 56;
    public int A04 = 430;
    public int A0K = 110;
    public int A0L = 70;
    public int A0A = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
    public int A0G = 48;
    public int A0F = 44;
    public int A0D = 24;
    public int A0C = 20;
    public int A0B = 16;
    public int A09 = 12;
    public int A08 = 10;
    public int A0H = 8;
    public int A0E = 4;
    public int A0J = IronSourceError.ERROR_AD_UNIT_CAPPED;
    public int A0I = 300;
    public int A05 = Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
    public boolean A0T = false;
    public final AtomicBoolean A0h = new AtomicBoolean(false);
    public int A00 = 0;
    public int A02 = 0;
    public int A01 = this.A06;
    public boolean A0U = true;
    public final int A0V = (int) AbstractC1640Wl.A02;

    public static String A0H(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0i, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] ^ i12) ^ 50;
            String[] strArr = A0j;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0j[2] = "GQ96jzl1cN6JO8qYFngU1";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0i = new byte[]{13, 31, 111, 31, 111, 31, 111, 44, 55, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 89, 85, 87, 20, 92, 91, 89, 95, 88, 85, 85, 81, 20, 91, 94, 73, 20, 83, 84, 78, 95, 72, 73, 78, 83, 78, 83, 91, 86, 20, 92, 83, 84, 83, 73, 82, 101, 91, 89, 78, 83, 76, 83, 78, 67, 101, 125, AbstractJsonLexerKt.TC_INVALID, 102};
    }

    static {
        A0M();
    }

    public C1927dA(final C1937dL c1937dL, AbstractC2212hy abstractC2212hy, InterfaceC1668Xn interfaceC1668Xn, KE ke2, Handler handler, C1580Ua c1580Ua) {
        this.A0d = c1937dL;
        this.A0Y = abstractC2212hy;
        this.A0e = c1580Ua;
        this.A0c = abstractC2212hy.A23();
        this.A0b = abstractC2212hy.A20().A0K();
        this.A0f = interfaceC1668Xn;
        this.A0W = handler;
        this.A0a = abstractC2212hy.A20().A0I();
        this.A0Z = abstractC2212hy.A1z();
        this.A0g = ke2;
        this.A0R = new C09846g(c1937dL) { // from class: com.facebook.ads.redexgen.X.0c
            @Override // com.facebook.ads.redexgen.core.C09846g, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.facebook.ads.redexgen.core.C09846g, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        this.A0P = new RelativeLayout(c1937dL);
        this.A0S = new C1751aK(c1937dL);
        this.A0Q = new TextView(c1937dL);
        this.A0M = new ImageView(c1937dL);
        this.A0X = new FrameLayout(this.A0d);
        A0K();
    }

    public static int A00(int i10) {
        if (OP.A01(i10, -1) >= 4.5d) {
            return -1;
        }
        return -16777216;
    }

    private FrameLayout.LayoutParams A01() {
        if (this.A0d.getResources().getConfiguration().orientation == 2) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i10 = this.A0L;
            int orientation = this.A0C;
            layoutParams.setMargins(0, i10, 0, orientation);
            return layoutParams;
        }
        int orientation2 = this.A0T ? this.A0I : this.A0J;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, orientation2);
        int orientation3 = this.A0K;
        layoutParams2.setMargins(0, orientation3, 0, 0);
        return layoutParams2;
    }

    private FrameLayout.LayoutParams A02() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, this.A0G, this.A09, 0);
        return layoutParams;
    }

    private ImageView A03() {
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(XY.A01(XX.OTHER_SKIP), this.A0C, this.A0C, true);
        ImageView imageView = new ImageView(this.A0d);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A0H(7, 9, 61)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A08, this.A08, this.A08, this.A08);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.d6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0X(view);
            }
        });
        if (this.A0g != null && this.A0g.getCtaActionHelper().A06() == null) {
            this.A0g.getCtaActionHelper().A07(new MF() { // from class: com.facebook.ads.redexgen.X.Em
                @Override // com.facebook.ads.redexgen.core.MF
                public final void ACB() {
                    this.A00.A0V();
                }
            });
        }
        imageView.setLayoutParams(A02());
        imageView.setVisibility(0);
        return imageView;
    }

    private LinearLayout.LayoutParams A04() {
        int width = this.A0d.getResources().getConfiguration().orientation;
        int i10 = -1;
        int i11 = -2;
        int i12 = 0;
        if (width == 2) {
            i10 = this.A04;
            i11 = -2;
            String[] strArr = A0j;
            String str = strArr[6];
            String str2 = strArr[0];
            int width2 = str.charAt(0);
            int orientation = str2.charAt(0);
            if (width2 == orientation) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0j;
            strArr2[4] = "2Ia5vAscFxMcZ1ZcpDs6xoNSTk8YU4BA";
            strArr2[3] = "l5LN0cSfS0eMNqZA7sTWe2HczOJrVC6l";
            i12 = this.A0B;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i11);
        layoutParams.gravity = 81;
        int height = this.A0B;
        int width3 = this.A0B;
        layoutParams.setMargins(height, i12, width3, 0);
        return layoutParams;
    }

    private LinearLayout A05() {
        LinearLayout linearLayout = new LinearLayout(this.A0d);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setGravity(80);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private LinearLayout A06() {
        String strA08;
        LinearLayout linearLayout = new LinearLayout(this.A0d);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (this.A0a.A0B().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1930dD(this.A0d).A02(new C1740a9(this.A0d, -1, -1, XX.RATINGS)).A04(this.A0a.A0B()).A03(this.A0a.A0A()));
        if (!this.A0a.A08().isEmpty()) {
            try {
                strA08 = AbstractC1649Wu.A01(Integer.parseInt(this.A0a.A08()));
            } catch (NumberFormatException unused) {
                strA08 = this.A0a.A08();
            }
            arrayList.add(new C1930dD(this.A0d).A02(new C1740a9(this.A0d, -1, -1, XX.NUCLEUS_GROUP)).A04(strA08).A03(this.A0a.A09()));
        }
        if (!this.A0a.A05().isEmpty()) {
            arrayList.add(new C1930dD(this.A0d).A02(new C1740a9(this.A0d, -1, -1, XX.DOWNLOAD)).A04(this.A0a.A05()).A03(this.A0a.A06()));
        }
        C1398Mw c1398Mw = this.A0a;
        if (A0j[2].length() == 29) {
            throw new RuntimeException();
        }
        A0j[2] = "3vpsIj";
        if (!c1398Mw.A01().isEmpty()) {
            arrayList.add(new C1930dD(this.A0d).A02(new C1740a9(this.A0d, -1, -1, XX.NUCLEUS_DURATION)).A04(this.A0a.A01()).A03(this.A0a.A0C()));
        }
        if (!this.A0a.A02().isEmpty()) {
            arrayList.add(new C1930dD(this.A0d).A02(new C1740a9(this.A0d, -1, -1, XX.GRID_4)).A04(this.A0a.A02()).A03(this.A0a.A03()));
        }
        for (int i10 = 0; i10 < Math.min(3, arrayList.size()); i10++) {
            linearLayout.addView((View) arrayList.get(i10));
        }
        linearLayout.setId(View.generateViewId());
        return linearLayout;
    }

    private LinearLayout A07(RelativeLayout relativeLayout, KE ke2) {
        LinearLayout linearLayout = new LinearLayout(this.A0d);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, ke2.getId());
        layoutParams.addRule(14);
        layoutParams.setMargins(0, this.A0H, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(this.A0d);
        textView.setText(this.A0a.A07());
        textView.setTextSize(10.0f);
        linearLayout.setId(View.generateViewId());
        C1740a9 iconView = new C1740a9(this.A0d, -1, -1, XX.GOOGLE_PLAY_STORE);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.A09, this.A09);
        layoutParams2.rightMargin = this.A0E;
        iconView.setLayoutParams(layoutParams2);
        iconView.setAlpha(0.5f);
        linearLayout.addView(iconView);
        linearLayout.addView(textView);
        relativeLayout.addView(linearLayout);
        return linearLayout;
    }

    private RelativeLayout.LayoutParams A08(LinearLayout linearLayout) {
        int i10;
        int i11 = this.A0d.getResources().getConfiguration().orientation;
        if (linearLayout == null || this.A0T || i11 == 2) {
            int orientation = this.A01;
            i10 = (-orientation) / 4;
        } else {
            int orientation2 = this.A01;
            i10 = (-orientation2) / 2;
        }
        int i12 = this.A01;
        int orientation3 = this.A01;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i12, orientation3);
        layoutParams.setMargins(0, i10, 0, 0);
        layoutParams.addRule(14);
        return layoutParams;
    }

    private RelativeLayout.LayoutParams A09(LinearLayout linearLayout, TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        if (this.A0g != null) {
            this.A0g.setTextColor(A00(this.A0Z.A01().A04()));
            XP.A0Q(this.A0g, XP.A06(this.A0Z.A01().A04(), 40));
        }
        if (linearLayout != null) {
            layoutParams.addRule(3, linearLayout.getId());
            layoutParams.setMargins(this.A0B, this.A0D + this.A00 + this.A02, this.A0B, 0);
        } else {
            layoutParams.addRule(3, textView.getId());
            layoutParams.setMargins(this.A0B, this.A0A + this.A00 + this.A02, this.A0B, 0);
        }
        return layoutParams;
    }

    private RelativeLayout.LayoutParams A0A(TextView textView) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, this.A0D + this.A02, 1, 0);
        layoutParams.addRule(3, textView.getId());
        return layoutParams;
    }

    private RelativeLayout.LayoutParams A0B(C1751aK c1751aK) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(3, c1751aK.getId());
        layoutParams.setMargins(this.A0B, this.A0D + this.A02, this.A0B, 0);
        return layoutParams;
    }

    private RelativeLayout A0C() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0d);
        LinearLayout.LayoutParams layoutParams = A04();
        relativeLayout.setClipChildren(false);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setId(View.generateViewId());
        return relativeLayout;
    }

    private TextView A0D(RelativeLayout relativeLayout, C1751aK c1751aK) {
        TextView textView = new TextView(this.A0d);
        textView.setText(this.A0a.A0F());
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(30.0f);
        textView.setTextAlignment(4);
        textView.setLayoutParams(A0B(c1751aK));
        relativeLayout.addView(textView);
        textView.setId(View.generateViewId());
        return textView;
    }

    private C09846g A0E(KE ke2) {
        this.A0R.setLayoutManager(new C2117gI(this.A0d, 0, false));
        FrameLayout.LayoutParams screenshotsRecyclerViewParams = A01();
        this.A0R.setLayoutParams(screenshotsRecyclerViewParams);
        int i10 = 4;
        if (this.A0d.getResources().getConfiguration().orientation == 2) {
            i10 = 2;
        }
        this.A0R.setAdapter(new C1175Ef(this.A0d, this.A0b.A02(), this.A0H, this.A0R, ke2, i10));
        return this.A0R;
    }

    private C1751aK A0G(LinearLayout linearLayout) {
        C1751aK c1751aK = new C1751aK(this.A0d);
        c1751aK.setRadius(30);
        XP.A0K(c1751aK, 0);
        KZ downloadImageTask = new KZ(c1751aK, this.A0d).A04();
        downloadImageTask.A07(this.A0c.A01());
        c1751aK.setLayoutParams(A08(linearLayout));
        c1751aK.setId(View.generateViewId());
        return c1751aK;
    }

    private void A0I() {
        Bitmap scaledBitmap;
        final boolean zA05 = this.A0b.A05();
        if (zA05) {
            scaledBitmap = XY.A01(XX.SKIP_ARROW_APP_INSTALL);
        } else {
            scaledBitmap = XY.A01(XX.NAV_CROSS);
        }
        Bitmap scaledBitmap2 = Bitmap.createScaledBitmap(scaledBitmap, this.A0C, this.A0C, true);
        this.A0M = new ImageView(this.A0d);
        this.A0M.setImageBitmap(scaledBitmap2);
        this.A0M.setColorFilter(-1);
        GradientDrawable circleBackground = new GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(Color.parseColor(A0H(7, 9, 61)));
        this.A0M.setBackground(circleBackground);
        this.A0M.setPadding(this.A08, this.A08, this.A08, this.A08);
        this.A0M.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.d5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0b(zA05, view);
            }
        });
        this.A0M.setLayoutParams(A02());
        this.A0X.addView(this.A0M);
        boolean shouldShowThirdEndCard = this.A0U;
        if (!shouldShowThirdEndCard) {
            this.A0M.setVisibility(8);
        }
        this.A0N = null;
        boolean shouldShowThirdEndCard2 = this.A0U;
        if (shouldShowThirdEndCard2 && this.A0b.A00() > 0) {
            boolean shouldShowThirdEndCard3 = this.A0Y.A2G();
            if (shouldShowThirdEndCard3) {
                this.A0N = A03();
                this.A0X.addView(this.A0N);
            }
            AbstractC1929dC.A01(this.A0d, this.A0M, this.A0b.A00(), this.A0N);
        }
    }

    private void A0J() {
        if (this.A0g != null) {
            RelativeLayout relativeLayout = this.A0P;
            KE ke2 = this.A0g;
            if (A0j[1].charAt(29) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0j;
            strArr[7] = "pz6iX8Db8cBXV1NkZFv";
            strArr[5] = "hJGHZsoHw75TG0u";
            A0R(relativeLayout, ke2, this.A0O, this.A0Q);
            LinearLayout linearLayoutA07 = A07(this.A0P, this.A0g);
            if (this.A0Y.A2H()) {
                A0Q(this.A0P, linearLayoutA07, this.A0g);
            }
        }
    }

    private void A0K() {
        this.A0J *= this.A0V;
        this.A0I *= this.A0V;
        this.A05 *= this.A0V;
        this.A0K *= this.A0V;
        this.A0L *= this.A0V;
        this.A06 *= this.A0V;
        this.A01 *= this.A0V;
        this.A07 *= this.A0V;
        this.A03 *= this.A0V;
        this.A04 *= this.A0V;
        this.A0A *= this.A0V;
        this.A0G *= this.A0V;
        this.A0F *= this.A0V;
        this.A0D *= this.A0V;
        this.A0C *= this.A0V;
        this.A0B *= this.A0V;
        this.A09 *= this.A0V;
        this.A08 *= this.A0V;
        this.A0H *= this.A0V;
        this.A0E *= this.A0V;
    }

    private void A0L() {
        ViewParent parent = this.A0X.getParent();
        boolean z10 = parent instanceof ViewGroup;
        String strA0H = A0H(16, 45, 8);
        if (!z10) {
            this.A0f.A4b(strA0H);
            return;
        }
        ((ViewGroup) parent).removeView(this.A0X);
        String[] strArr = A0j;
        if (strArr[4].charAt(2) == strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A0j[2] = "R58z0cOD";
        ViewParent parent2 = parent.getParent();
        if (parent2 instanceof ViewGroup) {
            this.A0h.set(true);
            ((ViewGroup) parent.getParent()).addView(new C1787au(this.A0d, this.A0Y, this.A0e, this.A0W, this.A0f).A0A(this.A0g, this.A0S));
            return;
        }
        this.A0f.A4b(strA0H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void A0V() {
        XP.A0H(this.A0N);
        this.A0Y.A2B(false);
        this.A0Y.A20().A0M(-1);
    }

    private void A0O(View view, int i10, float[] fArr) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(i10);
        view.setBackground(shapeDrawable);
    }

    private void A0P(RelativeLayout relativeLayout) {
        A0O(relativeLayout, Color.argb(230, 13, 13, 13), new float[]{100.0f, 100.0f, 100.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    private void A0Q(RelativeLayout relativeLayout, LinearLayout linearLayout, KE ke2) {
        ImageView imageViewA00 = Z9.A00(this.A0d, this.A0e, this.A0Y, this.A0f, Z5.A02, this.A0W, Z6.A02);
        XP.A0I(imageViewA00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A0H, 0, 0);
        imageViewA00.setPadding(0, 0, 0, this.A0B);
        layoutParams.addRule(7, ke2.getId());
        layoutParams.addRule(3, linearLayout.getId());
        imageViewA00.setLayoutParams(layoutParams);
        relativeLayout.addView(imageViewA00);
    }

    private void A0R(RelativeLayout relativeLayout, KE ke2, LinearLayout linearLayout, TextView textView) {
        RelativeLayout.LayoutParams layoutParamsA09 = A09(linearLayout, textView);
        ke2.setIncludeFontPadding(false);
        ke2.setLayoutParams(layoutParamsA09);
        ke2.A0D();
        ke2.setHeight(this.A03);
        ke2.setTextSize(18.0f);
        ke2.setCornerRadiusPx(40);
        ke2.setTextColor(A00(this.A0Z.A01().A04()));
        XP.A0Q(ke2, XP.A06(this.A0Z.A01().A04(), 40));
        ke2.setId(View.generateViewId());
        if (ke2.getParent() != null) {
            ((ViewGroup) ke2.getParent()).removeView(ke2);
        }
        relativeLayout.addView(ke2);
        String[] strArr = A0j;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0j;
        strArr2[6] = "8zkkPZUpUKfzaqOn5D7DKafOgXWnQm3O";
        strArr2[0] = "dX4UD2PNpDYdvYGpKlyYeFfcBh95RD7k";
    }

    private void A0S(final InterfaceC1926d9 interfaceC1926d9) {
        final ImageView imageView = new ImageView(this.A0d);
        imageView.setAdjustViewBounds(true);
        KZ kz = new KZ(imageView, this.A0d);
        if (!this.A0b.A02().isEmpty()) {
            kz.A06(new InterfaceC1721Zo() { // from class: com.facebook.ads.redexgen.X.Eo
                @Override // com.facebook.ads.redexgen.core.InterfaceC1721Zo
                public final void ADT(C1720Zn c1720Zn) {
                    this.A02.A0Y(imageView, interfaceC1926d9, c1720Zn);
                }
            });
            kz.A07(this.A0b.A02().get(0));
        } else {
            interfaceC1926d9.ADV();
        }
    }

    public final FrameLayout A0T() {
        this.A0X.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (this.A0d.getResources().getConfiguration().orientation == 2) {
            int orientation = this.A07;
            this.A01 = orientation;
        }
        View view = new View(this.A0d);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int orientation2 = Color.parseColor(A0H(0, 7, 28));
        view.setBackgroundColor(orientation2);
        this.A0X.addView(view);
        final LinearLayout linearLayout = A05();
        this.A0P = A0C();
        if (U7.A1C(this.A0d)) {
            this.A0P.setOnClickListener(new ViewOnClickListenerC1924d7(this));
        }
        A0P(this.A0P);
        this.A0O = A06();
        this.A0S = A0G(this.A0O);
        this.A0P.addView(this.A0S);
        this.A0Q = A0D(this.A0P, this.A0S);
        if (this.A0O != null) {
            this.A0O.setLayoutParams(A0A(this.A0Q));
            this.A0P.addView(this.A0O);
        }
        A0S(new InterfaceC1926d9() { // from class: com.facebook.ads.redexgen.X.Ep
            @Override // com.facebook.ads.redexgen.core.InterfaceC1926d9
            public final void ADV() {
                this.A01.A0Z(linearLayout);
            }
        });
        return this.A0X;
    }

    public final FrameLayout A0U() {
        return this.A0X;
    }

    public final void A0W(int i10) {
        if (!this.A0h.get()) {
            C1175Ef c1175Ef = (C1175Ef) this.A0R.getAdapter();
            if (this.A0g != null) {
                A09(this.A0O, this.A0Q);
            }
            if (i10 == 2) {
                this.A01 = this.A07;
                this.A00 = 0;
                c1175Ef.A0O(2);
                if (this.A0Y.A2H()) {
                    this.A02 = -this.A08;
                }
            } else {
                this.A02 = 0;
                this.A01 = this.A06;
                if (this.A0T) {
                    this.A00 = this.A05;
                    if (this.A0Y.A2H()) {
                        this.A00 = this.A05 - this.A0F;
                    }
                }
                c1175Ef.A0O(4);
            }
            this.A0R.setLayoutParams(A01());
            this.A0P.setLayoutParams(A04());
            this.A0S.setLayoutParams(A08(this.A0O));
            this.A0Q.setLayoutParams(A0B(this.A0S));
            if (this.A0O != null) {
                this.A0O.setLayoutParams(A0A(this.A0Q));
            }
            if (this.A0g != null) {
                this.A0g.setLayoutParams(A09(this.A0O, this.A0Q));
            }
            this.A0M.setLayoutParams(A02());
        }
    }

    public final /* synthetic */ void A0X(View view) {
        if (this.A0g != null) {
            ME meA0E = this.A0g.A0E(A0H(61, 4, 36));
            if (this.A0Y.A2D()) {
                return;
            }
            ME actionOutcome = ME.A09;
            if (meA0E != actionOutcome) {
                ME actionOutcome2 = ME.A06;
                if (meA0E != actionOutcome2) {
                    A0V();
                }
            }
        }
    }

    public final /* synthetic */ void A0Y(ImageView imageView, InterfaceC1926d9 interfaceC1926d9, C1720Zn c1720Zn) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int imageWidth = drawable.getIntrinsicWidth();
            if (imageWidth > drawable.getIntrinsicHeight()) {
                this.A0T = true;
                int imageWidth2 = this.A0d.getResources().getConfiguration().orientation;
                if (imageWidth2 == 2) {
                    this.A00 = 0;
                } else {
                    this.A00 = this.A05;
                    AbstractC2212hy abstractC2212hy = this.A0Y;
                    if (A0j[1].charAt(29) == 'N') {
                        throw new RuntimeException();
                    }
                    A0j[1] = "S95acxw01Fp1FcMeAJU8kfpwrSO3Cs6T";
                    if (abstractC2212hy.A2H()) {
                        this.A00 = this.A05 - this.A0F;
                    }
                }
            }
        }
        interfaceC1926d9.ADV();
    }

    public final /* synthetic */ void A0Z(LinearLayout linearLayout) {
        this.A0R = A0E(this.A0g);
        this.A0X.addView(this.A0R);
        A0J();
        linearLayout.addView(this.A0P);
        if (this.A0Y.A2K()) {
            View view = new View(this.A0d);
            view.setOnClickListener(new ViewOnClickListenerC1925d8(this));
            if (this.A0d.getResources().getConfiguration().orientation == 2) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, this.A0L, 48));
            } else {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, this.A0K, 48));
            }
            this.A0X.addView(view);
        }
        A0I();
        this.A0X.addView(linearLayout);
    }

    public final void A0a(boolean z10) {
        this.A0U = z10;
    }

    public final /* synthetic */ void A0b(boolean z10, View view) {
        if (z10) {
            A0L();
        } else {
            this.A0f.A4b(A0H(16, 45, 8));
        }
    }
}
