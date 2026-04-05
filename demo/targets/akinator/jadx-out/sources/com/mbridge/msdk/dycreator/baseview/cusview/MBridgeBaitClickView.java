package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f39962a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f39963b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f39964c;

    /* renamed from: d, reason: collision with root package name */
    private String f39965d;

    /* renamed from: e, reason: collision with root package name */
    private String f39966e;

    /* renamed from: f, reason: collision with root package name */
    private String f39967f;

    /* renamed from: g, reason: collision with root package name */
    private int f39968g;

    /* renamed from: h, reason: collision with root package name */
    private int f39969h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f39970i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f39971j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f39972k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f39973l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.f39965d = "";
        this.f39966e = "";
        this.f39967f = "Click now for details";
        this.f39968g = 1;
        this.f39969h = 1342177280;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f39970i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f39970i.setRepeatCount(-1);
        this.f39970i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f39962a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f39970i);
        }
    }

    private void e() {
        MBridgeDyImageView mBridgeDyImageView = this.f39963b;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f39970i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f39970i.setRepeatCount(1);
        this.f39970i.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f39971j = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f39971j.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f39972k = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f39972k.setRepeatCount(0);
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f39971j);
        animationSet.addAnimation(this.f39972k);
        this.f39971j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (MBridgeBaitClickView.this.f39963b != null) {
                    MBridgeBaitClickView.this.f39963b.setVisibility(4);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (MBridgeBaitClickView.this.f39963b != null) {
                    MBridgeBaitClickView.this.f39963b.setVisibility(0);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.f39970i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f39962a != null) {
                            MBridgeBaitClickView.this.f39962a.startAnimation(MBridgeBaitClickView.this.f39970i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f39963b != null) {
                            MBridgeBaitClickView.this.f39963b.startAnimation(animationSet);
                        }
                    }
                }, 550L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView2 = this.f39962a;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(this.f39970i);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f39967f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th2) {
            p0.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public void init(int i10) {
        this.f39968g = i10;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f39970i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f39971j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f39972k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f39973l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i10 = this.f39968g;
        if (i10 == 2) {
            this.f39963b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f39963b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f39970i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f39970i.setRepeatCount(1);
        this.f39970i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f39962a != null) {
                            MBridgeBaitClickView.this.f39962a.startAnimation(MBridgeBaitClickView.this.f39970i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView = this.f39962a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f39970i);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f39970i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f39970i.setRepeatCount(-1);
        this.f39970i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f39962a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f39970i);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f39971j = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f39971j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f39972k = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f39972k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f39971j);
        animationSet.addAnimation(this.f39972k);
        MBridgeDyImageView mBridgeDyImageView2 = this.f39963b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f39973l = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f39973l.setRepeatMode(2);
        this.f39973l.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f39971j = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f39971j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f39972k = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f39972k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f39971j);
        animationSet.addAnimation(this.f39972k);
        MBridgeDyImageView mBridgeDyImageView = this.f39962a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f39973l);
        }
        MBridgeDyImageView mBridgeDyImageView2 = this.f39963b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    public void init(int i10, int i11) {
        this.f39969h = i10;
        this.f39968g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f39969h = i10;
        this.f39968g = i11;
        this.f39965d = str;
        this.f39966e = str2;
        this.f39967f = str3;
        init();
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39965d = "";
        this.f39966e = "";
        this.f39967f = "Click now for details";
        this.f39968g = 1;
        this.f39969h = 1342177280;
    }

    public void init() {
        String str = duhsDlGWdBkekB.ddkprLQgdemL;
        try {
            setBackgroundColor(this.f39969h);
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = u0.a(getContext(), 55.0f);
            int iA2 = u0.a(getContext(), 33.0f);
            this.f39963b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f39963b.setLayoutParams(layoutParams);
            final int iA3 = h0.a(getContext(), "mbridge_icon_click_circle", str);
            if (TextUtils.isEmpty(this.f39966e)) {
                this.f39963b.setImageResource(iA3);
            } else {
                b.a(c.m().d()).a(this.f39965d, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str2, String str3) {
                        MBridgeBaitClickView.this.f39963b.setImageResource(iA3);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str2) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f39963b.setImageBitmap(bitmap);
                    }
                });
            }
            int iA4 = u0.a(getContext(), 108.0f);
            int iA5 = u0.a(getContext(), 35.0f);
            int iA6 = u0.a(getContext(), 43.0f);
            this.f39962a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f39962a.setLayoutParams(layoutParams2);
            final int iA7 = h0.a(getContext(), "mbridge_icon_click_hand", str);
            if (TextUtils.isEmpty(this.f39965d)) {
                this.f39962a.setImageResource(iA7);
            } else {
                b.a(c.m().d()).a(this.f39965d, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str2, String str3) {
                        MBridgeBaitClickView.this.f39962a.setImageResource(iA7);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str2) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f39962a.setImageBitmap(bitmap);
                    }
                });
            }
            relativeLayout.addView(this.f39963b);
            relativeLayout.addView(this.f39962a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f39964c = new TextView(getContext());
            this.f39964c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f39964c.setText(this.f39967f);
            this.f39964c.setTextColor(-1);
            this.f39964c.setGravity(14);
            linearLayout.addView(this.f39964c);
            addView(linearLayout);
        } catch (Throwable th2) {
            p0.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39965d = "";
        this.f39966e = "";
        this.f39967f = "Click now for details";
        this.f39968g = 1;
        this.f39969h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f39965d = "";
        this.f39966e = "";
        this.f39967f = "Click now for details";
        this.f39968g = 1;
        this.f39969h = 1342177280;
    }
}
