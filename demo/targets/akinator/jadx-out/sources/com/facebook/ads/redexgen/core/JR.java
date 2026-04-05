package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class JR extends AbstractC1771ae {
    public static byte[] A0V;
    public static String[] A0W = {"UQ7TFs74lcUdZuEisIQQex1S2hJkyBQJ", "myvpLMPCiy1Db21mRiA", "GFipZK8NVLufipAPgP", "AfraUSEhnPTRS4j1c1sVruXnc5XHPJ9d", "a5o2PCnXzYQrRDOC9DPzRLQmHH", "zC9Q5dVrf3DuizGN", "cBKGhAcqgckkizLMVTE8MrLSp3snJrYL", "vsEAc6f0BLlcSapFKHSSbJlGpIzpiVSU"};
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public int A00;
    public int A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public LinearLayout A05;
    public O2 A06;
    public InterfaceC1895ce A07;
    public EG A08;
    public C09083i A09;
    public final Handler A0A;
    public final ImageView A0B;
    public final RelativeLayout A0C;
    public final RelativeLayout A0D;
    public final RelativeLayout A0E;
    public final RelativeLayout A0F;
    public final RelativeLayout A0G;
    public final TextView A0H;
    public final TextView A0I;
    public final TextView A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final C1937dL A0M;
    public final C1580Ua A0N;
    public final C1751aK A0O;
    public final C1753aM A0P;
    public final C1775ai A0Q;
    public final E1 A0R;
    public final DX A0S;
    public final DP A0T;
    public final Runnable A0U;

    public static String A0J(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0Q() {
        A0V = new byte[]{-24, 26, 41, 60, 49, 54, 47, -77, -68, -65, -12};
    }

    static {
        A0Q();
        A0X = (int) (AbstractC1640Wl.A02 * 32.0f);
        A0Y = (int) (AbstractC1640Wl.A02 * 38.0f);
        A0Z = (int) (AbstractC1640Wl.A02 * 40.0f);
        A0a = (int) (AbstractC1640Wl.A02 * 44.0f);
        A0b = (int) (AbstractC1640Wl.A02 * 48.0f);
        A0c = (int) (AbstractC1640Wl.A02 * 16.0f);
    }

    public JR(C1775ai c1775ai) {
        super(c1775ai, false);
        this.A0A = new Handler(Looper.getMainLooper());
        this.A0T = new DP() { // from class: com.facebook.ads.redexgen.X.5a
            public static String[] A01 = {"1XAudPm5bNoLpQjIPSZWPFOeb", "KPQovwGp6PfJEyzo2xgnSN1gmGV3wBfO", "MSOuoVglH1pxZtUt86IkEaCPI", "Ahn71CuWf", "XCR0a8v2bJ8TOqmTegoErV6kR", "kQ55lQ8tRAtObxY9GvDk6DQ4l", "65Z7gaQiVm7Q6XjyGmw2uvR6b", "4ArQv5JqOif9H4kcX07xj56lI8DuBc1Y"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                if (this.A00.A07 != null) {
                    JR jr2 = this.A00;
                    if (A01[3].length() != 9) {
                        throw new RuntimeException();
                    }
                    A01[3] = "L2P2qOlVB";
                    jr2.A07.AJT();
                }
            }
        };
        this.A0S = new DX() { // from class: com.facebook.ads.redexgen.X.5Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                this.A00.A0R.A0h(EnumC1953db.A02, 20);
            }
        };
        this.A0U = new RunnableC1806bD(this);
        this.A0M = c1775ai.A06();
        this.A0Q = c1775ai;
        this.A0N = new C1580Ua(this.A0Q.A05().A25(), getAdEventManager());
        this.A0N.A04(UZ.A0f, null);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A00 = displayMetrics.heightPixels;
        this.A01 = displayMetrics.widthPixels;
        this.A0R = A0G();
        XP.A0I(this.A0R);
        this.A0R.setVideoURI(this.A0Q.A05().A20().A0H().A09());
        this.A0R.A0h(EnumC1953db.A02, 20);
        this.A0R.getEventBus().A03(this.A0T, this.A0S);
        this.A0F = A06();
        XP.A0I(this.A0F);
        A0L();
        this.A0O = A0D();
        XP.A0I(this.A0O);
        this.A0K = A0B();
        XP.A0I(this.A0K);
        this.A0P = A0E();
        XP.A0I(this.A0P);
        this.A0I = A09();
        XP.A0I(this.A0I);
        this.A0B = A01();
        XP.A0I(this.A0B);
        this.A0H = A08();
        XP.A0I(this.A0H);
        this.A0D = A05();
        XP.A0I(this.A0D);
        this.A0C = A04();
        XP.A0I(this.A0C);
        this.A0J = A0A();
        XP.A0I(this.A0J);
        this.A0L = A0C();
        XP.A0I(this.A0L);
        this.A0G = A07(getWatchAdCtaText(), 654311423);
        XP.A0I(this.A0G);
        this.A0E = A07(this.A0Q.A05().A14(), -16226561);
        XP.A0I(this.A0E);
        AbstractC1758aR.A00(this.A0Q.A06(), this, this.A0Q.A05().A20().A0H().A08());
        int i10 = getResources().getConfiguration().orientation;
        A0f(i10);
        addView(this.A0R);
        A0R(i10);
        A0K();
    }

    private ImageView A01() {
        ImageView imageView = new ImageView(this.A0M);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        imageView.setImageBitmap(XY.A01(XX.DOWNLOAD_ICON));
        return imageView;
    }

    private LinearLayout A03() {
        this.A02 = new ImageView(this.A0M);
        this.A03 = new ImageView(this.A0M);
        LinearLayout linearLayout = new LinearLayout(this.A0M);
        this.A02.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.A02.setImageBitmap(XY.A01(XX.AD_CHOICE_V2_COLLAPSE));
        linearLayout.addView(this.A02);
        this.A03.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.A03.setImageBitmap(XY.A01(XX.AD_CHOICE_V2_EXPAND));
        linearLayout.addView(this.A03);
        RelativeLayout.LayoutParams adReportingLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        adReportingLayoutParams.addRule(12);
        adReportingLayoutParams.addRule(11);
        linearLayout.setLayoutParams(adReportingLayoutParams);
        return linearLayout;
    }

    private RelativeLayout A04() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0M);
        relativeLayout.addView(this.A0K);
        if (this.A0Q.A05().A1g()) {
            relativeLayout.addView(this.A0P);
            relativeLayout.addView(this.A0I);
        } else {
            RelativeLayout relativeLayout2 = this.A0D;
            String[] strArr = A0W;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[2] = "DGMgcqNKmRBhEzUZj1";
            strArr2[4] = "QbI2wW46F5loixSEU5hnRqKbb5";
            relativeLayout.addView(relativeLayout2);
        }
        return relativeLayout;
    }

    private RelativeLayout A05() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0M.A02());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        relativeLayout.addView(this.A0B);
        relativeLayout.addView(this.A0H);
        return relativeLayout;
    }

    private RelativeLayout A06() {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0M.A02());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        return relativeLayout;
    }

    private RelativeLayout A07(String str, int i10) {
        RelativeLayout relativeLayout = new RelativeLayout(this.A0M);
        relativeLayout.setPadding(AbstractC1771ae.A0A, AbstractC1771ae.A0A, AbstractC1771ae.A0A, AbstractC1771ae.A0A);
        XP.A0Q(relativeLayout, XP.A06(i10, 30));
        relativeLayout.setGravity(16);
        TextView textView = new TextView(this.A0M);
        RelativeLayout.LayoutParams contentTextViewParams = new RelativeLayout.LayoutParams(-2, -2);
        contentTextViewParams.addRule(14);
        textView.setText(str);
        textView.setTextColor(-1);
        XP.A0W(textView, true, 14);
        textView.setLayoutParams(contentTextViewParams);
        relativeLayout.addView(textView);
        return relativeLayout;
    }

    private TextView A08() {
        TextView textView = new TextView(this.A0M);
        textView.setText(this.A0Q.A05().A20().A0I().A01());
        textView.setTextColor(-2130706433);
        textView.setMaxLines(1);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setTextSize(12.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    private TextView A09() {
        TextView textView = new TextView(this.A0M);
        textView.setText(getRatingText());
        textView.setTextColor(-2130706433);
        textView.setMaxLines(1);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setTextSize(12.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        return textView;
    }

    private TextView A0A() {
        TextView textView = new TextView(this.A0M);
        textView.setText(String.format(Locale.US, this.A0Q.A05().A15(), this.A0Q.A05().A20().A0I().A0F()));
        textView.setTextColor(-1);
        textView.setMaxLines(3);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(24.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        return textView;
    }

    private TextView A0B() {
        TextView textView = new TextView(this.A0M);
        textView.setText(this.A0Q.A05().A20().A0I().A0F());
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    private TextView A0C() {
        TextView textView = new TextView(this.A0M);
        textView.setText(getWatchAdCtaText());
        textView.setTextColor(-1);
        textView.setMaxLines(1);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(14.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        return textView;
    }

    private C1751aK A0D() {
        C1751aK c1751aK = new C1751aK(this.A0M);
        XP.A0K(c1751aK, 0);
        int i10 = (int) (this.A00 * 0.13f);
        new KZ(c1751aK, this.A0M).A05(i10, i10).A07(this.A0Q.A05().A23().A01());
        return c1751aK;
    }

    private C1753aM A0E() {
        C1753aM c1753aM = new C1753aM(this.A0M, A0c, 5, 0, -1);
        c1753aM.setRating(getRating());
        return c1753aM;
    }

    private E1 A0G() {
        E1 e12 = new E1(this.A0Q.A06());
        this.A09 = new C09083i(this.A0M, getAdEventManager(), e12, this.A0Q.A05().A25(), 0, 0, true, null, null);
        if (U7.A1v(this.A0M)) {
            this.A08 = new EG(this.A0M, getAdEventManager(), e12, this.A0Q.A05().A25(), false, this.A09, null);
        } else {
            String[] strArr = A0W;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[2] = "hx8qxgvoIW6xceGAWf";
            strArr2[4] = "wYZsMrXjcXuhFUuKsEl8E0dQOo";
            this.A08 = null;
        }
        e12.setRoundedCornerVideoView(44.0f);
        return e12;
    }

    private void A0K() {
        this.A0E.setOnClickListener(new ViewOnClickListenerC1808bF(this));
        if (this.A0Q.A05().A1g()) {
            this.A0L.setOnClickListener(new ViewOnClickListenerC1809bG(this));
        } else {
            this.A0G.setOnClickListener(new ViewOnClickListenerC1810bH(this));
        }
    }

    private void A0L() {
        if (this.A0Q.A05().A2H()) {
            this.A04 = A00(this.A0M, this.A0Q.A05(), this.A0N, Z5.A04, this.A0Q.A0D(), this.A0A);
            XP.A0I(this.A04);
        } else {
            if (!this.A0Q.A05().A1g()) {
                return;
            }
            this.A06 = O3.A00(this.A0M.A02());
            this.A05 = A03();
            XP.A0I(this.A05);
            A0N();
        }
    }

    private void A0M() {
        if (this.A0Q.A05().A1g() && getRating() == 0.0f) {
            this.A0C.setVisibility(8);
            this.A0I.setVisibility(8);
            this.A0P.setVisibility(8);
        }
        if (this.A0Q.A05().A1h() && TextUtils.isEmpty(this.A0Q.A05().A20().A0I().A01())) {
            this.A0C.setVisibility(8);
            this.A0D.setVisibility(8);
        }
        this.A0C.setVisibility(0);
    }

    private void A0N() {
        if (this.A05 != null) {
            this.A05.setOnClickListener(new ViewOnClickListenerC1807bE(this));
        }
        A0S(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        this.A0N.A04(UZ.A0A, null);
        N9 n9A23 = this.A0Q.A05().A23();
        if (this.A06 != null && this.A06.A0O(this.A0M.A02(), true)) {
            this.A0Q.A0D().AAf(this.A0Q.A05().A25(), n9A23);
        } else {
            if (TextUtils.isEmpty(n9A23.A00())) {
                return;
            }
            WN.A0O(new WN(), this.A0M, WQ.A00(n9A23.A00()), this.A0Q.A05().A25());
        }
    }

    private void A0P() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(1, this.A0B.getId());
        layoutParams.setMargins(AbstractC1771ae.A0B, 0, 0, 0);
        layoutParams.addRule(15);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0R(int i10) {
        if (i10 == 1) {
            addView(this.A0O);
            addView(this.A0C);
            addView(this.A0J);
            addView(this.A0E);
            if (this.A0Q.A05().A1g()) {
                addView(this.A0L);
                if (this.A05 != null) {
                    addView(this.A05);
                }
            } else {
                addView(this.A0G);
            }
        } else {
            this.A0F.addView(this.A0O);
            this.A0F.addView(this.A0C);
            this.A0F.addView(this.A0J);
            this.A0F.addView(this.A0E);
            if (this.A0Q.A05().A1g()) {
                this.A0F.addView(this.A0L);
                if (this.A05 != null) {
                    addView(this.A05);
                }
            } else {
                this.A0F.addView(this.A0G);
            }
            addView(this.A0F);
        }
        if (this.A04 != null && this.A0Q.A05().A2H()) {
            addView(this.A04);
            String[] strArr = A0W;
            if (strArr[6].charAt(9) != strArr[0].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[6] = "keLlcznYvctfEvjur1LzpEy2BPaBqrBv";
            strArr2[0] = "SZjrRhAKecjSc6vp3MPbWHckPYKJoG5j";
            if (this.A05 != null) {
                this.A05.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(int i10) {
        if (this.A03 == null || this.A02 == null) {
            return;
        }
        if (i10 == 0) {
            this.A03.setVisibility(i10);
            this.A02.setVisibility(8);
        } else {
            this.A03.setVisibility(i10);
            this.A02.setVisibility(0);
        }
    }

    private void A0T(int i10) {
        int rightMargin;
        if (this.A05 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A05.getLayoutParams();
        if (i10 == 1) {
            rightMargin = A0Y;
        } else {
            rightMargin = (int) (this.A01 * 0.1f);
        }
        layoutParams.setMargins(0, 0, rightMargin, 0);
        this.A05.setLayoutParams(layoutParams);
    }

    private void A0U(int i10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i10 == 1) {
            if (this.A0Q.A05().A1g()) {
                layoutParams.addRule(3, this.A0O.getId());
            } else {
                layoutParams.addRule(3, this.A0R.getId());
            }
            layoutParams.setMargins(0, AbstractC1771ae.A0A, 0, 0);
            layoutParams.addRule(14);
        } else {
            layoutParams.addRule(1, this.A0O.getId());
            layoutParams.setMargins(AbstractC1771ae.A0A, 0, 0, 0);
        }
        this.A0C.setLayoutParams(layoutParams);
        A0M();
    }

    private void A0V(int i10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A0K.getId());
        layoutParams.setMargins(0, AbstractC1771ae.A0E, 0, 0);
        if (i10 == 1) {
            layoutParams.addRule(14);
        }
        this.A0D.setLayoutParams(layoutParams);
    }

    private void A0W(int i10) {
        if (this.A04 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        int i11 = AbstractC1771ae.A0A;
        if (i10 == 1) {
            i11 = A0Y;
        }
        int leftMargin = AbstractC1771ae.A0A;
        layoutParams.setMargins(i11, 0, 0, leftMargin);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        this.A04.setLayoutParams(layoutParams);
    }

    private void A0X(int i10) {
        int i11;
        if (i10 == 1) {
            i11 = (int) (this.A00 * 0.13f);
            if (this.A0Q.A05().A1h()) {
                C1751aK c1751aK = this.A0O;
                String[] strArr = A0W;
                if (strArr[5].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0W;
                strArr2[6] = "T7WF8ct6Ecp3fFl6k8FlzT3xp8EZwOPe";
                strArr2[0] = "49nlYj8CnceEqKl67yYD9azFmPqqLBPu";
                c1751aK.setVisibility(8);
            } else {
                this.A0O.setRadius(30);
            }
        } else {
            i11 = (int) (this.A01 * 0.08f);
            this.A0O.setRadius(18);
            this.A0O.setVisibility(0);
        }
        int i12 = 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        if (i10 == 1) {
            i12 = (-i11) / 2;
            layoutParams.addRule(14);
            layoutParams.addRule(3, this.A0R.getId());
        }
        layoutParams.setMargins(0, i12, 0, 0);
        this.A0O.setLayoutParams(layoutParams);
    }

    private void A0Y(int i10) {
        int topMargin;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A0K.getId());
        if (i10 == 1) {
            topMargin = AbstractC1771ae.A0I;
            layoutParams.addRule(14);
        } else {
            topMargin = AbstractC1771ae.A0E;
        }
        layoutParams.setMargins(0, topMargin, 0, 0);
        this.A0P.setLayoutParams(layoutParams);
        this.A0P.setItemSpacing(AbstractC1771ae.A0I);
    }

    private void A0Z(int i10) {
        int i11;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A0P.getId());
        if (i10 == 1) {
            i11 = AbstractC1771ae.A0I;
        } else {
            i11 = AbstractC1771ae.A0E;
        }
        layoutParams.setMargins(0, i11, 0, 0);
        if (i10 == 1) {
            layoutParams.addRule(14);
        }
        this.A0I.setLayoutParams(layoutParams);
    }

    private void A0a(int i10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        if (i10 == 1) {
            layoutParams.addRule(3, this.A0C.getId());
            layoutParams.setMargins(A0a, AbstractC1771ae.A0A, A0a, 0);
        } else {
            layoutParams.addRule(3, this.A0O.getId());
            layoutParams.setMargins(0, AbstractC1771ae.A0C, 0, 0);
        }
        this.A0J.setLayoutParams(layoutParams);
    }

    private void A0b(int i10) {
        if (i10 == 2) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.addRule(15);
            if (!E1.A0V((float) this.A0Q.A05().A0h())) {
                layoutParams.addRule(6, this.A0R.getId());
            } else {
                this.A0F.setGravity(17);
            }
            layoutParams.setMargins(0, 0, (int) (this.A01 * 0.1f), 0);
            layoutParams.addRule(13);
            layoutParams.addRule(1, this.A0R.getId());
            this.A0F.setLayoutParams(layoutParams);
        }
    }

    private void A0c(int i10) {
        View view;
        int i11;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (i10 == 1) {
            if (this.A0Q.A05().A1g()) {
                view = this.A0L;
                i11 = AbstractC1771ae.A0C;
            } else {
                view = this.A0G;
                i11 = AbstractC1771ae.A0I;
            }
            layoutParams.setMargins(A0Y, 0, A0Y, i11);
            layoutParams.addRule(2, view.getId());
        } else {
            int topMargin = A0X;
            if (this.A0Q.A05().A2H()) {
                topMargin = AbstractC1771ae.A0D;
            }
            layoutParams.setMargins(0, topMargin, 0, 0);
            int topMargin2 = this.A0J.getId();
            layoutParams.addRule(3, topMargin2);
        }
        this.A0E.setLayoutParams(layoutParams);
    }

    private void A0d(int i10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i10 == 1) {
            this.A0K.setTextAlignment(4);
            layoutParams.setMargins(A0Z, 0, A0Z, 0);
        } else {
            this.A0K.setTextAlignment(5);
        }
        this.A0K.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0e(int r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.JR.A0e(int):void");
    }

    private void A0f(int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A00 = displayMetrics.heightPixels;
        this.A01 = displayMetrics.widthPixels;
        A0b(i10);
        A0e(i10);
        A0X(i10);
        A0d(i10);
        A0Z(i10);
        A0P();
        A0V(i10);
        A0Y(i10);
        A0U(i10);
        A0a(i10);
        if (this.A0Q.A05().A1g()) {
            A0h(i10);
            String[] strArr = A0W;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[7] = "aYm4mmhUzY2q09M7FsCiyOSpkxFbKaZW";
            strArr2[3] = "02gWjTBSQrtOfJ7daRHeBoWCiPeJp89r";
            A0T(i10);
        } else {
            A0g(i10);
        }
        A0W(i10);
        String[] strArr3 = A0W;
        if (strArr3[5].length() != strArr3[1].length()) {
            String[] strArr4 = A0W;
            strArr4[2] = "tL7wIN5OEPzS4IRzlt";
            strArr4[4] = "pnOaA9DlQTYkC3KVcwnBrIvrHl";
            A0c(i10);
            return;
        }
        String[] strArr5 = A0W;
        strArr5[6] = "MDf5St22kcgabUjosByBKwB24Lkknw12";
        strArr5[0] = "UByTvfFM4cGo3K13JgxsnaHo1RTqGnlv";
        A0c(i10);
    }

    private void A0g(int i10) {
        int i11;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (i10 == 1) {
            if (this.A0Q.A05().A2H() && this.A04 != null) {
                layoutParams.addRule(2, this.A04.getId());
                i11 = AbstractC1771ae.A0A;
            } else {
                layoutParams.addRule(12);
                i11 = A0a;
            }
            int bottomMargin = A0Y;
            layoutParams.setMargins(bottomMargin, 0, A0Y, i11);
        } else {
            layoutParams.addRule(3, this.A0E.getId());
            int i12 = AbstractC1771ae.A0I;
            String[] strArr = A0W;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[2] = "xJXeUykDDwk7QxqpMI";
            strArr2[4] = "KNHMaHGzFmfIejDiEBJDCMbgtc";
            layoutParams.setMargins(0, i12, 0, 0);
        }
        this.A0G.setLayoutParams(layoutParams);
    }

    private void A0h(int i10) {
        int i11;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i10 == 1) {
            if (this.A0Q.A05().A2H() && this.A04 != null) {
                layoutParams.addRule(2, this.A04.getId());
                i11 = AbstractC1771ae.A0D;
            } else {
                layoutParams.addRule(12);
                i11 = A0a;
            }
            layoutParams.setMargins(0, 0, 0, i11);
            layoutParams.addRule(14);
        } else {
            layoutParams.setMargins(0, AbstractC1771ae.A0A, 0, 0);
            layoutParams.addRule(3, this.A0E.getId());
            layoutParams.addRule(14);
        }
        this.A0L.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final ME A1A(String str) {
        return ME.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final void A1B() {
        super.A1B();
        if (this.A08 != null) {
            this.A08.A07();
        }
        C09083i c09083i = this.A09;
        String[] strArr = A0W;
        if (strArr[2].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[6] = "tdEFFGfq1cVEZpxqy9rgZPT1BZ8plSyJ";
        strArr2[0] = "YynlqIxuvciXAw4AWnNfF7pWFOOJrehC";
        if (c09083i != null) {
            this.A09.A0p();
        }
        this.A0A.removeCallbacksAndMessages(null);
        this.A0R.getEventBus().A04(this.A0T, this.A0S);
        this.A07 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae
    public final boolean A1M() {
        return true;
    }

    public final void A1O(C09083i c09083i) {
        if (this.A09 != null) {
            this.A09.A0o(c09083i);
        }
    }

    private float getRating() throws NumberFormatException {
        try {
            float rating = Float.parseFloat(this.A0Q.A05().A20().A0I().A0B());
            return rating;
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    private String getRatingText() {
        StringBuilder sbAppend = new StringBuilder().append(String.format(Locale.US, A0J(7, 4, 37), Float.valueOf(getRating())));
        String ratingText = A0J(0, 7, 95);
        return sbAppend.append(ratingText).toString();
    }

    private String getWatchAdCtaText() {
        return String.format(Locale.US, this.A0Q.A05().A16(), Integer.valueOf(this.A0Q.A05().A20().A0H().A03()));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1771ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        XP.A0Z(this.A0O, this.A0C, this.A0J, this.A0E, this.A0G, this.A0L, this.A05, this.A04, this.A0F);
        A0f(configuration.orientation);
        A0R(configuration.orientation);
    }

    public void setVideoAdViewListener(InterfaceC1895ce interfaceC1895ce) {
        this.A07 = interfaceC1895ce;
    }
}
