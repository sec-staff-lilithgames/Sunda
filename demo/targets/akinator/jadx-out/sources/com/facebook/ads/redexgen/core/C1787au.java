package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1787au {
    public static byte[] A0N;
    public static String[] A0O = {"pFRbUbIPvfwTsTWtR68DyqtfsQzo0Y9e", "Jmt0yS7cxIqywVTLVazlNOZqViG4fijG", "7JVXgwFSulrh0z9RNSntkrow2", "W96LwBzZpPkBapcy7gGTKWs8B4GUDBcq", "br88nFbBZbLJ3vTh4p9wwCNTIA57FmIY", "mzQptMR0Z3d1fPQPbwNf4EthVYWzR3DW", "IPE7BiI9pZn923UUuncSvZhUL3wMHGrT", "br6hrssh6VRKiVV1vNUkmhf3WWjX02F0"};
    public KE A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0C;
    public final int A0D;
    public final Handler A0E;
    public final AbstractC2212hy A0F;
    public final C1388Ml A0G;
    public final C1398Mw A0H;
    public final N0 A0I;
    public final C1937dL A0J;
    public final C1580Ua A0K;
    public final InterfaceC1668Xn A0L;
    public final boolean A0M;
    public int A03 = 16;
    public int A02 = 12;
    public int A01 = 10;
    public int A04 = 20;
    public int A05 = 40;
    public int A06 = 52;
    public int A00 = 10;
    public int A07 = 8;
    public boolean A0B = true;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            if (A0O[2].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "XwNXbwlUcFi7qEktIehGuIyqazGrk614";
            strArr[1] = "hx9Csixc74t4pIrSAOrr1o5nquGlqFF4";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0N = new byte[]{109, 118, 126, 126, 126, 126, 126, 126, 126, 4, 97, 97, 23, 23, 23, 23, 23, 23, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 53, 50, 47, 50, 47, 39, 42, 104, 32, 47, 40, 47, 53, 46, 25, 39, 37, 50, 47, 48, 47, 50, Utf8.REPLACEMENT_BYTE, 42, 50, 48, 41};
    }

    static {
        A03();
    }

    public C1787au(C1937dL c1937dL, AbstractC2212hy abstractC2212hy, C1580Ua c1580Ua, Handler handler, InterfaceC1668Xn interfaceC1668Xn) {
        this.A0J = c1937dL;
        this.A0L = interfaceC1668Xn;
        this.A0H = abstractC2212hy.A20().A0I();
        this.A0I = abstractC2212hy.A20().A0K();
        this.A0G = abstractC2212hy.A1z();
        this.A0E = handler;
        this.A0C = abstractC2212hy.A2K();
        this.A0M = abstractC2212hy.A2H();
        this.A0A = abstractC2212hy.A2G();
        this.A0D = AbstractC1929dC.A00(c1937dL.getResources().getDisplayMetrics());
        this.A0K = c1580Ua;
        this.A0F = abstractC2212hy;
        A02();
    }

    private ImageView A00(final KE ke2) {
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(XY.A01(XX.OTHER_SKIP), this.A04, this.A04, true);
        ImageView imageView = new ImageView(this.A0J);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A01(0, 9, 80)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A01, this.A01, this.A01, this.A01);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ar
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1787au.A08(ke2, view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        return imageView;
    }

    private void A02() {
        this.A03 *= this.A0D;
        this.A02 *= this.A0D;
        this.A01 *= this.A0D;
        this.A04 *= this.A0D;
        this.A05 *= this.A0D;
        this.A06 *= this.A0D;
        this.A00 *= this.A0D;
        this.A07 *= this.A0D;
    }

    private void A04(FrameLayout frameLayout) {
        View view = new View(this.A0J);
        view.setBackgroundColor(Color.parseColor(A01(9, 9, 57)));
        view.setAlpha(0.8f);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A05(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A0J);
        ImageView imageViewA00 = Z9.A00(this.A0J, this.A0K, this.A0F, this.A0L, Z5.A02, this.A0E, Z6.A02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
        layoutParams.setMargins(0, 0, this.A02, this.A03);
        frameLayout2.addView(imageViewA00, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(android.widget.FrameLayout r14, com.facebook.ads.redexgen.core.KE r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1787au.A06(android.widget.FrameLayout, com.facebook.ads.redexgen.X.KE):void");
    }

    private void A07(KE ke2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        ke2.setPadding(this.A04, this.A03, this.A04, this.A03);
        ke2.setTextSize(14.0f);
        ke2.A0D();
        ke2.setIncludeFontPadding(true);
        ke2.setLayoutParams(layoutParams);
        ke2.setTextColor(-16777216);
        XP.A0Q(ke2, XP.A06(-1, this.A00));
        ke2.setId(View.generateViewId());
        if (ke2.getParent() != null) {
            ((ViewGroup) ke2.getParent()).removeView(ke2);
        }
    }

    public static /* synthetic */ void A08(KE ke2, View view) {
        ke2.A0E(A01(63, 4, 71));
        ke2.setVisibility(4);
    }

    public final View A09(KE ke2) {
        return A0A(ke2, null);
    }

    public final View A0A(KE ke2, ImageView imageView) {
        this.A08 = ke2;
        this.A09 = imageView != null;
        FrameLayout frameLayout = new FrameLayout(this.A0J);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C1757aQ c1757aQ = new C1757aQ(this.A0J, this.A0G.A01(), true, false, false);
        c1757aQ.A04(this.A0H.A0F(), this.A0H.A0D().toLowerCase(Locale.getDefault()), null, false, false);
        c1757aQ.setAlignment(17);
        c1757aQ.setTitleTextSize(28);
        c1757aQ.setDescriptionTextSize(13);
        c1757aQ.A02();
        c1757aQ.setPadding(this.A05, 0, this.A05, 0);
        LinearLayout linearLayout = new LinearLayout(this.A0J);
        linearLayout.setClickable(true);
        if (U7.A1C(this.A0J)) {
            linearLayout.setOnClickListener(new ViewOnClickListenerC1785as(this, ke2));
        }
        linearLayout.setPadding(0, -this.A04, 0, 0);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        if (imageView != null) {
            if (imageView.getParent() != null) {
                ((ViewGroup) imageView.getParent()).removeView(imageView);
            }
            linearLayout.addView(imageView);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A07, 0, this.A07);
        linearLayout.addView(c1757aQ, layoutParams);
        if (ke2 != null) {
            A07(ke2);
            linearLayout.addView(ke2, layoutParams);
            if (TextUtils.isEmpty(ke2.getText())) {
                XP.A0F(ke2);
            }
        }
        linearLayout.setAlpha(1.0f);
        A04(frameLayout);
        frameLayout.addView(linearLayout);
        A06(frameLayout, ke2);
        if (this.A0M) {
            A05(frameLayout);
        }
        return frameLayout;
    }

    public final KE A0B() {
        return this.A08;
    }

    public final /* synthetic */ void A0C(View view) {
        this.A0L.A4b(A01(18, 45, 88));
    }

    public final void A0D(boolean z10) {
        this.A0B = z10;
    }
}
