package com.facebook.ads.redexgen.core;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public abstract class KL extends AbstractC1728Zv {
    public static byte[] A0Z;
    public static String[] A0a = {"I67ZQjFrFoBoFyBDINMYweXdnGzWjrBB", "nht6bFtAgobmTyNcdDIU67iWeCPwsD4y", "CC", "mo2tEtHX5GxhbuvPRsbEGuKVkHRikNiM", "YFxZu97gZB0Y7sylrDsM9wWdV0Ra2Zhp", "a3e3iReWJRZsiYjOcmpSjngSmAGNHpnR", "bZqctpWVYtHdWFrvu7462EupjL9eUXJL", "SeUJXsHc50YCHkmPfJM6qpgcGH0p3S"};
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public AnimatorSet A00;
    public int A01;
    public int A02;
    public int A03;
    public TextView A04;
    public CU A05;
    public final int A06;
    public final AbstractC2212hy A07;
    public final N9 A08;
    public final O2 A09;
    public final C1580Ua A0A;
    public final InterfaceC1668Xn A0B;
    public final Runnable A0C;
    public final Runnable A0D;
    public final String A0E;
    public final Handler A0F;
    public final ImageView A0G;
    public final ImageView A0H;
    public final ImageView A0I;
    public final ImageView A0J;
    public final LinearLayout A0K;
    public final LinearLayout A0L;
    public final RelativeLayout A0M;
    public final RelativeLayout A0N;
    public final RelativeLayout A0O;
    public final TextView A0P;
    public final TextView A0Q;
    public final C1398Mw A0R;
    public final C1400My A0S;
    public final C1937dL A0T;
    public final C1140Cw A0U;
    public final Runnable A0V;
    public final AtomicBoolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public static String A0R(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0Y() {
        A0Z = new byte[]{58, 18, 4, 2, 18, 60, 108, 103, 106, 121, 125, 96, 97, 80, 122, AbstractJsonLexerKt.TC_INVALID, 29, 28, 10, 26, 11, 16, 9, 13, 16, 22, 23, 126, 116, 120, 121, 30, 2, 15, 13, 11, 49, 6, 1, 2, 10, 11, 28, 49, 26, 11, 22, 26, 96, 98, AbstractJsonLexerKt.TC_INVALID, 119, 98, 117, 99, 99, 79, 114, 113, 98, 99, 116, 102, 112, 99, 117, 116, 117, 78, 103, 120, 117, 116, 126, 98, AbstractJsonLexerKt.TC_INVALID, 98, 122, 115, 107, 109, 126, 113, 108, 115, 126, 107, 118, 112, 113, 70};
    }

    public abstract void A0q(int i10);

    public abstract void A0s(ViewGroup viewGroup, RelativeLayout relativeLayout, int i10);

    static {
        A0Y();
        A0i = (int) (AbstractC1640Wl.A02 * 44.0f);
        A0b = (int) (AbstractC1640Wl.A02 * 52.0f);
        A0s = (int) (AbstractC1640Wl.A02 * 4.0f);
        A0u = (int) (AbstractC1640Wl.A02 * 8.0f);
        A0j = (int) (AbstractC1640Wl.A02 * 12.0f);
        A0k = (int) (AbstractC1640Wl.A02 * 14.0f);
        A0l = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0m = (int) (AbstractC1640Wl.A02 * 18.0f);
        A0n = (int) (AbstractC1640Wl.A02 * 20.0f);
        A0o = (int) (AbstractC1640Wl.A02 * 24.0f);
        A0p = (int) (AbstractC1640Wl.A02 * 26.0f);
        A0q = (int) (AbstractC1640Wl.A02 * 28.0f);
        A0r = (int) (AbstractC1640Wl.A02 * 32.0f);
        A0t = (int) (AbstractC1640Wl.A02 * 40.0f);
        A0f = (int) (AbstractC1640Wl.A02 * 48.0f);
        A0g = (int) (AbstractC1640Wl.A02 * 100.0f);
        A0h = (int) (AbstractC1640Wl.A02 * 112.0f);
        A0c = (int) (AbstractC1640Wl.A02 * 16.0f);
        A0e = OP.A02(-1, 128);
        A0d = OP.A02(-1, 17);
        A0v = (int) (AbstractC1640Wl.A02 * 12.0f);
    }

    public KL(C1937dL c1937dL, KE ke2, int i10, boolean z10, C1400My c1400My, boolean z11, String str, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, AbstractC2212hy abstractC2212hy, C1140Cw c1140Cw, C1580Ua c1580Ua, boolean z12) {
        super(c1937dL, ke2, i10, c1400My, z11, str, us, interfaceC1668Xn, c2010eX, xh2, abstractC2212hy.A21(), abstractC2212hy.A1c(), abstractC2212hy.A0x());
        this.A0W = new AtomicBoolean(true);
        this.A0V = new RunnableC1729Zw(this);
        this.A0D = new RunnableC1730Zx(this);
        this.A0C = new RunnableC1731Zy(this);
        this.A0A = c1580Ua;
        this.A07 = abstractC2212hy;
        this.A09 = O3.A00(c1937dL.A02());
        this.A0B = interfaceC1668Xn;
        this.A0E = abstractC2212hy.A25();
        this.A08 = abstractC2212hy.A23();
        this.A0S = c1400My;
        this.A0R = abstractC2212hy.A20().A0I();
        this.A0T = c1937dL;
        this.A0X = z10;
        this.A0Y = z12;
        this.A0F = new Handler(Looper.getMainLooper());
        this.A0G = new ImageView(this.A0T);
        this.A0H = new ImageView(this.A0T);
        this.A0J = Z9.A01(this.A0T, this.A0A, this.A07, Z5.A03, this.A0B, this.A0F);
        XP.A0I(this.A0J);
        this.A01 = -1;
        this.A03 = -16777216;
        this.A0O = A0M();
        this.A0M = A0K();
        this.A0N = A0L();
        A0T();
        A0S();
        this.A0L = new LinearLayout(this.A0T);
        this.A0L.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        XP.A0I(this.A0L);
        this.A0I = A0I();
        XP.A0I(this.A0I);
        if (!this.A0Y) {
            this.A0I.setVisibility(8);
        } else {
            this.A0I.setVisibility(0);
            this.A0I.setOnClickListener(AbstractC1762aV.A03(super.A08, A0R(6, 10, 11)));
        }
        if (super.A08.getParent() != null) {
            ((ViewGroup) super.A08.getParent()).removeView(super.A08);
        }
        this.A0Q = A0P();
        XP.A0I(this.A0Q);
        this.A0P = A0N();
        XP.A0I(this.A0P);
        this.A0U = A0Q(c1140Cw);
        XP.A0I(this.A0U);
        if (this.A07.A1a()) {
            this.A0U.setVisibility(8);
        }
        this.A0K = A0J();
        XP.A0I(this.A0K);
        this.A0K.setOnClickListener(new ViewOnClickListenerC1732Zz(this));
        A0p(8);
        if (abstractC2212hy.A2H()) {
            this.A0G.setVisibility(8);
            this.A0H.setVisibility(8);
        } else {
            this.A0J.setVisibility(8);
        }
        this.A06 = this.A07.A20().A0H().A03();
        if (this.A07.A0v().equals(A0R(60, 14, 21)) && !abstractC2212hy.A1Z() && this.A06 > 0) {
            this.A04 = A0O();
            XP.A0I(this.A04);
        }
        this.A0F.postDelayed(this.A0D, 2000L);
    }

    public static int A0G(int i10) {
        if (OP.A01(i10, -1) >= 4.5d) {
            return -1;
        }
        return -16777216;
    }

    private ImageView A0I() {
        ImageView imageView = new ImageView(this.A0T);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0c, A0c);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, 0, 0, A0u);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(XY.A01(XX.CHEVRON_UP));
        return imageView;
    }

    private LinearLayout A0J() {
        LinearLayout linearLayout = new LinearLayout(this.A0T);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.A0G.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.A0G.setImageBitmap(XY.A01(XX.AD_CHOICE_V2_COLLAPSE));
        linearLayout.addView(this.A0G);
        this.A0H.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.A0H.setImageBitmap(XY.A01(XX.AD_CHOICE_V2_EXPAND));
        linearLayout.addView(this.A0H);
        return linearLayout;
    }

    private RelativeLayout A0K() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0T);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        relativeLayout.setClipChildren(false);
        relativeLayout.setClipToPadding(false);
        XP.A0I(relativeLayout);
        return relativeLayout;
    }

    private RelativeLayout A0L() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0T);
        RelativeLayout.LayoutParams childLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        childLayoutParams.addRule(16);
        XP.A0I(relativeLayout);
        return relativeLayout;
    }

    private RelativeLayout A0M() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0T);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    private TextView A0N() {
        String strA0E;
        TextView textView = new TextView(this.A0T);
        if (this.A0Y) {
            strA0E = this.A0R.A0F();
        } else {
            strA0E = this.A0R.A0E();
        }
        textView.setText(strA0E);
        textView.setTextColor(-1);
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        return textView;
    }

    private TextView A0O() {
        TextView textView = new TextView(this.A0T);
        textView.setTextColor(-855638017);
        textView.setMaxLines(1);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setTextSize(14.0f);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        XP.A0I(textView);
        return textView;
    }

    private TextView A0P() {
        String strA0F;
        TextView textView = new TextView(this.A0T);
        if (this.A0Y) {
            strA0F = this.A0R.A0E();
        } else {
            strA0F = this.A0R.A0F();
        }
        textView.setText(strA0F);
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(30.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        return textView;
    }

    private C1140Cw A0Q(C1140Cw c1140Cw) {
        if (c1140Cw == null) {
            c1140Cw = new C1140Cw(this.A0T, -1);
            c1140Cw.setVisibility(8);
        }
        c1140Cw.A08(A0e, A0d, true);
        c1140Cw.setPadding(0, 0, 0, 0);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, A0v);
        c1140Cw.setLayoutParams(progressBarLayoutParams);
        return c1140Cw;
    }

    private void A0S() {
        this.A02 = 30;
        super.A08.setIncludeFontPadding(false);
        super.A08.setTextSize(18.0f);
        super.A08.setTextColor(this.A03);
        super.A08.setOutlineProvider(null);
        XP.A0Q(super.A08, XP.A06(this.A01, this.A02));
        super.A08.setLayoutParams(new RelativeLayout.LayoutParams(-2, A0b));
        XP.A0I(super.A08);
    }

    private void A0T() {
        if (this.A0X) {
            super.A09.setFullCircleCorners(true);
        } else {
            super.A09.setRadius(15);
        }
        XP.A0K(super.A09, 0);
        super.A09.setLayoutParams(new RelativeLayout.LayoutParams(A0f, A0f));
        XP.A0I(super.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0U() {
        if (this.A0A != null) {
            this.A0A.A04(UZ.A0A, null);
        }
        if (this.A09.A0O(this.A0T.A02(), true)) {
            this.A0B.AAf(this.A0E, this.A08);
        } else {
            if (TextUtils.isEmpty(this.A08.A00())) {
                return;
            }
            WN.A0O(new WN(), this.A0T, WQ.A00(this.A08.A00()), this.A0E);
        }
    }

    private void A0V() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(A0l, 0, 0, 0);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        this.A0K.setLayoutParams(layoutParams);
    }

    private void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(A0j, 0, 0, 0);
        layoutParams.addRule(8, this.A0U.getId());
        layoutParams.addRule(1, this.A0U.getId());
        this.A0J.setPadding(0, 0, 0, 0);
        this.A0J.setLayoutParams(layoutParams);
    }

    private void A0X() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0v);
        layoutParams.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.42f);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        layoutParams.setMargins(0, 0, 0, A0u);
        this.A0U.setLayoutParams(layoutParams);
    }

    private void A0Z(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, A0l, 0);
        if (i11 == 1) {
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(0, i10);
        }
        layoutParams.addRule(12);
        if (A0a[7].length() == 1) {
            throw new RuntimeException();
        }
        A0a[2] = "Y5";
        this.A0K.setLayoutParams(layoutParams);
    }

    private void A0a(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.removeRule(7);
        layoutParams.removeRule(2);
        layoutParams.removeRule(12);
        layoutParams.removeRule(0);
        if (i11 != 1) {
            layoutParams.setMargins(0, 0, A0l, A0u);
            layoutParams.addRule(0, i10);
            layoutParams.addRule(12);
        } else if (this.A0U.getVisibility() == 8) {
            layoutParams.setMargins(0, 0, A0l, A0u);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else {
            layoutParams.setMargins(0, 0, 0, A0u);
            layoutParams.addRule(2, this.A0U.getId());
            layoutParams.addRule(7, this.A0U.getId());
        }
        this.A0J.setPadding(0, 0, 0, 0);
        this.A0J.setLayoutParams(layoutParams);
    }

    private void A0b(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0v);
        if (i11 == 1) {
            layoutParams.addRule(12);
            if (this.A0J.getVisibility() == 8) {
                int i12 = A0l;
                if (A0a[7].length() == 1) {
                    throw new RuntimeException();
                }
                String[] strArr = A0a;
                strArr[5] = "Roeg9wJdjUPJmYqaO6ggHMpnVgOHkrNC";
                strArr[6] = "RHWeIYqanT4cUr8DVRS9N1g89bvSPiPo";
                layoutParams.setMargins(i12, 0, A0u, A0u);
                layoutParams.addRule(0, this.A0K.getId());
            } else {
                layoutParams.setMargins(A0l, 0, A0l, A0u);
            }
        } else {
            if (this.A0J.getVisibility() == 8) {
                layoutParams.setMargins(A0l, 0, A0l, A0u);
                layoutParams.addRule(2, this.A0K.getId());
            } else {
                layoutParams.setMargins(A0l, 0, A0l, A0s);
                layoutParams.addRule(2, this.A0J.getId());
            }
            layoutParams.addRule(0, i10);
        }
        String[] strArr2 = A0a;
        if (strArr2[0].charAt(21) != strArr2[1].charAt(21)) {
            A0a[7] = "xA2Hf";
            layoutParams.addRule(14);
            this.A0U.setLayoutParams(layoutParams);
        } else {
            A0a[2] = "yZ";
            layoutParams.addRule(14);
            this.A0U.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public final void A0f() {
        this.A0F.removeCallbacksAndMessages(null);
        XP.A0Z(this.A0O, this.A0N, super.A09, this.A0Q, super.A08, this.A0U, this.A04, this.A0P, this.A0K, this.A0J, this.A0I, this.A0M);
        removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public final void A0g() {
        super.A09.setOnClickListener(AbstractC1762aV.A03(super.A08, A0R(27, 4, 19)));
        this.A0Q.setOnClickListener(AbstractC1762aV.A03(super.A08, A0R(74, 5, 18)));
        this.A0P.setOnClickListener(AbstractC1762aV.A03(super.A08, A0R(16, 11, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)));
        this.A0U.setOnClickListener(AbstractC1762aV.A03(super.A08, A0R(48, 12, 20)));
        if (this.A04 != null) {
            this.A04.setOnClickListener(AbstractC1762aV.A03(super.A08, A0R(31, 17, 106)));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public void A0h(int i10) {
        A0j();
    }

    public final void A0i() {
        if (this.A04 != null) {
            this.A04.setVisibility(8);
        }
    }

    public final void A0j() {
        if (this.A00 != null) {
            this.A00.cancel();
            Handler handler = this.A0F;
            if (A0a[7].length() == 1) {
                throw new RuntimeException();
            }
            A0a[2] = "jq";
            handler.removeCallbacks(this.A0C);
        }
    }

    public final void A0k() {
        super.A08.setIncludeFontPadding(false);
        super.A08.setTextSize(18.0f);
        super.A08.setTextColor(this.A03);
        XP.A0Q(super.A08, XP.A06(this.A01, this.A02));
        super.A08.A0D();
    }

    public final void A0l() {
        super.A08.A0D();
    }

    public final void A0m() {
        int height = super.A08.getHeight();
        float f10 = height * 0.1f;
        this.A00 = new AnimatorSet();
        String strA0R = A0R(79, 12, 27);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(super.A08, strA0R, -f10, 0.0f);
        float bounceHeight = -f10;
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(this.A0I, strA0R, bounceHeight, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        animator1.setInterpolator(new LinearInterpolator());
        this.A00.playTogether(objectAnimatorOfFloat, animator1);
        this.A00.setDuration(600L);
        this.A00.start();
    }

    public final void A0n() {
        this.A0F.postDelayed(this.A0C, 1000L);
    }

    public final void A0o(int i10) {
        if (this.A04 != null) {
            int iMax = Math.max(0, this.A06 - i10);
            if (iMax > 0) {
                String rewardMessage = this.A07.A24().A02().replace(A0R(0, 6, 101), String.valueOf(iMax));
                this.A04.setText(rewardMessage);
                return;
            }
            this.A04.setVisibility(8);
        }
    }

    public final void A0p(int i10) {
        if (i10 == 0) {
            this.A0H.setVisibility(i10);
            this.A0G.setVisibility(8);
        } else {
            this.A0H.setVisibility(i10);
            this.A0G.setVisibility(0);
        }
    }

    public final void A0r(View view, int i10, float[] fArr) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(i10);
        view.setBackground(shapeDrawable);
    }

    public final void A0t(ViewGroup viewGroup, boolean z10, boolean z11, int i10) {
        XP.A0Z(this.A0K, this.A0J, this.A0U, super.A09, this.A0Q, this.A0P, this.A04);
        XP.A0H(this);
        int i11 = getResources().getConfiguration().orientation;
        if (z10) {
            if (i11 == 2 && z11) {
                A0V();
                viewGroup.addView(this.A0K);
                A0X();
                viewGroup.addView(this.A0U);
                A0W();
                viewGroup.addView(this.A0J);
            } else {
                A0Z(i10, i11);
                viewGroup.addView(this.A0K);
                String[] strArr = A0a;
                String str = strArr[0];
                String str2 = strArr[1];
                int iCharAt = str.charAt(21);
                int orientation = str2.charAt(21);
                if (iCharAt == orientation) {
                    throw new RuntimeException();
                }
                A0a[3] = "nUr6kFdTvmItrv0H0Gc17HbHzXx4pqcd";
                A0b(i10, i11);
                viewGroup.addView(this.A0U);
                A0a(i10, i11);
                viewGroup.addView(this.A0J);
            }
            if (this.A04 != null) {
                RelativeLayout.LayoutParams placeHolderTextParam = new RelativeLayout.LayoutParams(-2, -2);
                int orientation2 = this.A0U.getId();
                placeHolderTextParam.addRule(2, orientation2);
                int orientation3 = this.A0U.getId();
                placeHolderTextParam.addRule(5, orientation3);
                int orientation4 = A0u;
                placeHolderTextParam.setMargins(0, 0, 0, orientation4);
                this.A04.setLayoutParams(placeHolderTextParam);
                viewGroup.addView(this.A04);
                return;
            }
            return;
        }
        int orientation5 = A0v;
        this.A0U.setLayoutParams(new RelativeLayout.LayoutParams(-1, orientation5));
        if (this.A04 == null) {
            return;
        }
        this.A04.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
    }

    public final void A0u(RelativeLayout relativeLayout) {
        if (this.A04 != null && this.A04.getVisibility() == 0) {
            relativeLayout.addView(this.A04);
        }
    }

    public C1140Cw getProgressBarAnimation() {
        return this.A0U;
    }

    public void setCTAClickListener(View.OnClickListener onClickListener) {
        super.A09.setOnClickListener(onClickListener);
        this.A0Q.setOnClickListener(onClickListener);
        this.A0P.setOnClickListener(onClickListener);
        this.A0U.setOnClickListener(onClickListener);
        if (this.A04 != null) {
            TextView textView = this.A04;
            String[] strArr = A0a;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            A0a[2] = "ZI";
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setChainedAdInfo(String str) {
        this.A04 = A0O();
        XP.A0I(this.A04);
        this.A04.setText(str);
    }

    public void setPlaceHolderTextForRewardsConversion(String str) {
        if (this.A04 != null) {
            this.A04.setText(str);
            TextView textView = this.A04;
            if (A0a[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[0] = "Pip5eIC199znlU0DxQZmRsWriqsU4m1j";
            strArr[1] = "8HZRpzu4lhTkjbLOeu664VtfGmtiQHTJ";
            textView.setOnClickListener(AbstractC1762aV.A03(super.A08, A0R(31, 17, 106)));
        }
    }
}
