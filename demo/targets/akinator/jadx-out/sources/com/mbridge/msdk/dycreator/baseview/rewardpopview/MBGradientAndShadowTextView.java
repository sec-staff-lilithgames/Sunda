package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f40088a;

    /* renamed from: b, reason: collision with root package name */
    private int f40089b;

    /* renamed from: c, reason: collision with root package name */
    private int f40090c;

    /* renamed from: d, reason: collision with root package name */
    private int f40091d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f40092e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f40088a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f40089b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f40090c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f40091d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f40091d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f40092e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f40088a, this.f40089b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f40090c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f40092e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f40088a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f40089b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f40090c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f40091d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f40088a = gradientAndShadowParameters.gradientStartColor;
            this.f40089b = gradientAndShadowParameters.gradientEndColor;
            this.f40090c = gradientAndShadowParameters.shadowColor;
            this.f40091d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40088a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f40089b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f40090c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f40091d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40088a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f40089b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f40090c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f40091d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f40088a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f40089b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f40090c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f40091d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
