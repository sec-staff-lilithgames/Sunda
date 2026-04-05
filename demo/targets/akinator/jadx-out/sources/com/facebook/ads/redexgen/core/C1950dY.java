package com.facebook.ads.redexgen.core;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.dY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1950dY extends RelativeLayout {
    public static String[] A04 = {"Ym3c0mHmt8I3OfABPCOx9UJ2Q16UuduY", "K4DkQJV", "KARr27mhou56jkSxhuic5Eo8", "doL6IsbVcBXoE3lEPdAb4lspmNlkYQBg", "ZiamaIcezCYLNnFM0CzM2w39hefukKsr", "QAAEQWAERntefxGdirzkY0W9ygCVb18Z", "ecvamyNjiJSZyZ2FY2suHBqgS12IICXX", "BDk4Rb0w5P1ojifCZQT7pVNvZTakDsaU"};
    public static final int A05 = (int) (AbstractC1640Wl.A02 * 4.0f);
    public int A00;
    public C08892p A01;
    public WeakReference<InterfaceC1949dX> A02;
    public final InterfaceC2005eS A03;

    public C1950dY(C1937dL c1937dL, InterfaceC2005eS interfaceC2005eS) {
        super(c1937dL);
        this.A00 = 0;
        this.A03 = interfaceC2005eS;
        XP.A0H((View) this.A03);
        addView(this.A03.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A00(AnimatorSet animatorSet, final int i10, final boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.ads.redexgen.X.dU
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.A01.A04(z10, i10, valueAnimator);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    public final void A01(AnimatorSet animatorSet, boolean z10) {
        if (z10) {
            this.A03.getView().setClipToOutline(true);
            C1947dV c1947dV = new C1947dV(this);
            this.A03.getView().setOutlineProvider(c1947dV);
            if (this.A01 != null) {
                this.A01.setClipToOutline(true);
                this.A01.setOutlineProvider(c1947dV);
            }
            A00(animatorSet, A05, true);
            return;
        }
        this.A03.getView().setClipToOutline(false);
        this.A03.getView().setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        if (this.A01 != null) {
            this.A01.setClipToOutline(false);
            this.A01.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
        A00(animatorSet, this.A00, false);
    }

    public final void A02(AbstractC1144Da abstractC1144Da) {
        addView(abstractC1144Da, new RelativeLayout.LayoutParams(-1, -1));
        this.A01 = (C08892p) abstractC1144Da;
    }

    public final void A03(AbstractC1144Da abstractC1144Da) {
        XP.A0H(abstractC1144Da);
        this.A01 = null;
    }

    public final /* synthetic */ void A04(boolean z10, int i10, ValueAnimator valueAnimator) {
        float curInterpolatedTime = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!z10) {
            curInterpolatedTime = 1.0f - curInterpolatedTime;
        }
        float interpolatedTime = i10;
        this.A00 = (int) (interpolatedTime * curInterpolatedTime);
        requestLayout();
    }

    public final boolean A05() {
        return this.A03.A9j();
    }

    public int getCurrentPosition() {
        return this.A03.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((View) this.A03).layout(this.A00, this.A00, getWidth() - this.A00, getHeight() - this.A00);
        if (this.A01 != null) {
            this.A01.layout(this.A00, this.A00, getWidth() - this.A00, getHeight() - this.A00);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        int heightSpecSize = this.A03.getVideoWidth() + (this.A00 * 2);
        int widthSpecMode = this.A03.getVideoHeight() + (this.A00 * 2);
        int width = getDefaultSize(heightSpecSize, i10);
        int height = getDefaultSize(widthSpecMode, i11);
        if (heightSpecSize > 0 && widthSpecMode > 0) {
            z10 = true;
            int mode = View.MeasureSpec.getMode(i10);
            int heightSpecMode = View.MeasureSpec.getSize(i10);
            int widthSpecSize = View.MeasureSpec.getMode(i11);
            int mVideoHeight = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824 || widthSpecSize != 1073741824) {
                if (mode == 1073741824) {
                    width = heightSpecMode;
                    height = (width * widthSpecMode) / heightSpecSize;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                    }
                } else if (widthSpecSize == 1073741824) {
                    height = mVideoHeight;
                    width = (height * heightSpecSize) / widthSpecMode;
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                    }
                } else {
                    width = heightSpecSize;
                    height = widthSpecMode;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                        width = (height * heightSpecSize) / widthSpecMode;
                    }
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            } else {
                width = heightSpecMode;
                height = mVideoHeight;
                int mVideoWidth = heightSpecSize * height;
                if (mVideoWidth < width * widthSpecMode) {
                    int width2 = height * heightSpecSize;
                    String[] strArr = A04;
                    String str = strArr[2];
                    String str2 = strArr[1];
                    int mVideoWidth2 = str.length();
                    if (mVideoWidth2 == str2.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[5] = "U4zbj2Wm0uAraatZAyMG0dkAaN2sbGyV";
                    strArr2[7] = "NaQeXa1xIolrwrGsNa3PifVvRhjqFXGF";
                    width = width2 / widthSpecMode;
                } else {
                    int mVideoWidth3 = heightSpecSize * height;
                    if (mVideoWidth3 > width * widthSpecMode) {
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            }
        }
        setMeasuredDimension(width, height);
        if (!z10 || this.A02 == null) {
            return;
        }
        WeakReference<InterfaceC1949dX> weakReference = this.A02;
        int mVideoWidth4 = A04[6].charAt(8);
        if (mVideoWidth4 != 105) {
            throw new RuntimeException();
        }
        A04[3] = "u6I59svdNPk3v5MrivI4HijRJO25VXOb";
        if (weakReference.get() != null) {
            this.A02.get().AFj();
        }
    }

    public void setRoundedCornersVideoStyle(float f10) {
        this.A03.getView().setClipToOutline(true);
        this.A03.getView().setOutlineProvider(new C1948dW(this, f10));
    }

    public void setViewImplInflationListener(InterfaceC1949dX interfaceC1949dX) {
        this.A02 = new WeakReference<>(interfaceC1949dX);
    }
}
