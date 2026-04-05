package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBSplashClickView extends MBRelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: f, reason: collision with root package name */
    private final String f39878f;

    /* renamed from: g, reason: collision with root package name */
    private final String f39879g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39880h;

    /* renamed from: i, reason: collision with root package name */
    private final String f39881i;

    /* renamed from: j, reason: collision with root package name */
    private final String f39882j;

    /* renamed from: k, reason: collision with root package name */
    private final String f39883k;

    /* renamed from: l, reason: collision with root package name */
    private final String f39884l;

    /* renamed from: m, reason: collision with root package name */
    private final String f39885m;

    /* renamed from: n, reason: collision with root package name */
    private final String f39886n;

    /* renamed from: o, reason: collision with root package name */
    private final String f39887o;

    /* renamed from: p, reason: collision with root package name */
    private final String f39888p;

    /* renamed from: q, reason: collision with root package name */
    private final String f39889q;

    /* renamed from: r, reason: collision with root package name */
    private String f39890r;

    /* renamed from: s, reason: collision with root package name */
    private int f39891s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f39892t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f39893u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f39894v;

    /* renamed from: w, reason: collision with root package name */
    private final Paint f39895w;

    /* renamed from: x, reason: collision with root package name */
    private final Paint f39896x;

    public MBSplashClickView(Context context) {
        super(context);
        this.f39878f = "浏览第三方应用";
        this.f39879g = "View";
        this.f39880h = "打开第三方应用";
        this.f39881i = "Open";
        this.f39882j = "下载第三方应用";
        this.f39883k = "Install";
        this.f39884l = "mbridge_splash_btn_arrow_right";
        this.f39885m = "mbridge_splash_btn_circle";
        this.f39886n = "mbridge_splash_btn_finger";
        this.f39887o = "mbridge_splash_btn_go";
        this.f39888p = "mbridge_splash_btn_light";
        this.f39889q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f39894v = new RectF();
        this.f39895w = new Paint();
        this.f39896x = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        final ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(400L);
        scaleAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBSplashClickView.this.f39893u.setVisibility(4);
                MBSplashClickView.this.f39893u.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MBSplashClickView.this.f39893u.startAnimation(scaleAnimation2);
                    }
                }, 1600L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBSplashClickView.this.f39893u.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.f39893u.setVisibility(4);
        this.f39892t.startAnimation(scaleAnimation);
        this.f39893u.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.2
            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f39893u.startAnimation(scaleAnimation2);
            }
        }, 800L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f39892t.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(final Animation animation) {
                MBSplashClickView.this.f39892t.setVisibility(4);
                MBSplashClickView.this.f39892t.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MBSplashClickView.this.f39892t.startAnimation(animation);
                    }
                }, 2000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBSplashClickView.this.f39892t.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.f39892t.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i10) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f39894v, this.f39896x, 31);
        canvas.drawRoundRect(this.f39894v, 200.0f, 200.0f, this.f39896x);
        canvas.saveLayer(this.f39894v, this.f39895w, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f39890r = str;
        b();
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f39891s;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f39894v.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f39895w.setAntiAlias(true);
        this.f39895w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f39896x.setAntiAlias(true);
        this.f39896x.setColor(-1);
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        View viewA;
        if (!a(this.f39890r)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f39890r)) {
                this.f39890r = zContains ? "浏览第三方应用" : "View";
            }
            this.f39891s = 2;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        String string = (viewGroup == null || (viewA = a(viewGroup, "mbridge_expand_data")) == null || !(viewA instanceof TextView)) ? "" : ((TextView) viewA).getText().toString();
        setBgDrawable(this.f39891s);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f39890r);
        this.f39892t = new ImageView(getContext());
        int i10 = this.f39891s;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", c.m().h());
            layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 35.0f), u0.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = u0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", c.m().h());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = u0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", c.m().h()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", c.m().h());
            layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 25.0f), u0.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = u0.a(getContext(), 50.0f);
            layoutParams.topMargin = u0.a(getContext(), 18.0f);
            this.f39893u = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(u0.a(getContext(), 30.0f), u0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = u0.a(getContext(), 50.0f);
            layoutParams4.topMargin = u0.a(getContext(), 5.0f);
            this.f39893u.setLayoutParams(layoutParams4);
            this.f39893u.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", c.m().h()));
            addView(this.f39893u);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f39892t.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(string)) {
            this.f39892t.setImageResource(identifier);
        } else {
            a(this.f39892t, string, identifier);
        }
        addView(textView);
        addView(this.f39892t);
        invalidate();
    }

    private boolean a(String str) {
        str.getClass();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f39891s = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f39891s = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f39891s = 2;
                return true;
            default:
                return false;
        }
    }

    private void a(final ImageView imageView, String str, final int i10) {
        if (imageView == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                imageView.setBackgroundResource(i10);
            }
            b.a(c.m().d()).a(str, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.4
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str2, String str3) {
                    ImageView imageView2 = imageView;
                    if (imageView2 != null) {
                        imageView2.setBackgroundResource(i10);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (imageView != null) {
                        if (bitmap == null || bitmap.isRecycled()) {
                            imageView.setBackgroundResource(i10);
                            return;
                        }
                        if (MBSplashClickView.this.f39893u != null) {
                            MBSplashClickView mBSplashClickView = MBSplashClickView.this;
                            mBSplashClickView.removeView(mBSplashClickView.f39893u);
                        }
                        imageView.setImageBitmap(bitmap);
                    }
                }
            });
        } catch (Exception e10) {
            p0.a("MBSplashClickView", e10.getMessage());
            imageView.setBackgroundResource(i10);
        }
    }

    private View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (viewGroup.getId() == str.hashCode()) {
                        return viewGroup;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getId() == str.hashCode()) {
                            return childAt;
                        }
                        if (childAt instanceof ViewGroup) {
                            a((ViewGroup) childAt, str);
                        }
                    }
                    return null;
                }
            } catch (Exception e10) {
                p0.b("MBSplashClickView", e10.getMessage());
            }
        }
        return null;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39878f = "浏览第三方应用";
        this.f39879g = "View";
        this.f39880h = "打开第三方应用";
        this.f39881i = "Open";
        this.f39882j = "下载第三方应用";
        this.f39883k = "Install";
        this.f39884l = "mbridge_splash_btn_arrow_right";
        this.f39885m = "mbridge_splash_btn_circle";
        this.f39886n = "mbridge_splash_btn_finger";
        this.f39887o = "mbridge_splash_btn_go";
        this.f39888p = "mbridge_splash_btn_light";
        this.f39889q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f39894v = new RectF();
        this.f39895w = new Paint();
        this.f39896x = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39878f = "浏览第三方应用";
        this.f39879g = "View";
        this.f39880h = "打开第三方应用";
        this.f39881i = "Open";
        this.f39882j = "下载第三方应用";
        this.f39883k = "Install";
        this.f39884l = "mbridge_splash_btn_arrow_right";
        this.f39885m = "mbridge_splash_btn_circle";
        this.f39886n = "mbridge_splash_btn_finger";
        this.f39887o = "mbridge_splash_btn_go";
        this.f39888p = "mbridge_splash_btn_light";
        this.f39889q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f39894v = new RectF();
        this.f39895w = new Paint();
        this.f39896x = new Paint();
        a();
    }
}
