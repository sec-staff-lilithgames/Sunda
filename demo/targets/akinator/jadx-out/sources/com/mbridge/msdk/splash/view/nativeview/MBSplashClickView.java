package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* renamed from: a, reason: collision with root package name */
    private final String f43106a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43107b;

    /* renamed from: c, reason: collision with root package name */
    private final String f43108c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43109d;

    /* renamed from: e, reason: collision with root package name */
    private final String f43110e;

    /* renamed from: f, reason: collision with root package name */
    private final String f43111f;

    /* renamed from: g, reason: collision with root package name */
    private final String f43112g;

    /* renamed from: h, reason: collision with root package name */
    private final String f43113h;

    /* renamed from: i, reason: collision with root package name */
    private final String f43114i;

    /* renamed from: j, reason: collision with root package name */
    private final String f43115j;

    /* renamed from: k, reason: collision with root package name */
    private final String f43116k;

    /* renamed from: l, reason: collision with root package name */
    private String f43117l;

    /* renamed from: m, reason: collision with root package name */
    private int f43118m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f43119n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f43120o;

    /* renamed from: p, reason: collision with root package name */
    private final RectF f43121p;

    /* renamed from: q, reason: collision with root package name */
    private final Paint f43122q;

    /* renamed from: r, reason: collision with root package name */
    private final Paint f43123r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f43127a;

        public b(ScaleAnimation scaleAnimation) {
            this.f43127a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.f43120o.startAnimation(this.f43127a);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f43106a = "浏览第三方应用";
        this.f43107b = "View";
        this.f43108c = "打开第三方应用";
        this.f43109d = "Open";
        this.f43110e = "下载第三方应用";
        this.f43111f = "Install";
        this.f43112g = "mbridge_splash_btn_arrow_right";
        this.f43113h = "mbridge_splash_btn_circle";
        this.f43114i = "mbridge_splash_btn_finger";
        this.f43115j = "mbridge_splash_btn_go";
        this.f43116k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f43121p = new RectF();
        this.f43122q = new Paint();
        this.f43123r = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new a(scaleAnimation2));
        this.f43120o.setVisibility(4);
        this.f43119n.startAnimation(scaleAnimation);
        this.f43120o.postDelayed(new b(scaleAnimation2), 500L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f43119n.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new c());
        this.f43119n.startAnimation(translateAnimation);
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
        canvas.saveLayer(this.f43121p, this.f43123r, 31);
        canvas.drawRoundRect(this.f43121p, 200.0f, 200.0f, this.f43123r);
        canvas.saveLayer(this.f43121p, this.f43122q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f43117l = str;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f43118m;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f43121p.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f43122q.setAntiAlias(true);
        this.f43122q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f43123r.setAntiAlias(true);
        this.f43123r.setColor(-1);
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        if (!a(this.f43117l)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f43117l)) {
                this.f43117l = zContains ? "浏览第三方应用" : "View";
            }
            this.f43118m = 2;
        }
        setBgDrawable(this.f43118m);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f43117l);
        this.f43119n = new ImageView(getContext());
        int i10 = this.f43118m;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", com.mbridge.msdk.foundation.controller.c.m().h());
            layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 35.0f), u0.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = u0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", com.mbridge.msdk.foundation.controller.c.m().h());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = u0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", com.mbridge.msdk.foundation.controller.c.m().h());
            layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 25.0f), u0.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = u0.a(getContext(), 50.0f);
            layoutParams.topMargin = u0.a(getContext(), 18.0f);
            this.f43120o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(u0.a(getContext(), 30.0f), u0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = u0.a(getContext(), 50.0f);
            layoutParams4.topMargin = u0.a(getContext(), 5.0f);
            this.f43120o.setLayoutParams(layoutParams4);
            this.f43120o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
            addView(this.f43120o);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f43119n.setLayoutParams(layoutParams);
        this.f43119n.setImageResource(identifier);
        addView(textView);
        addView(this.f43119n);
        invalidate();
    }

    private boolean a(String str) {
        str.getClass();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f43118m = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f43118m = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f43118m = 2;
                return true;
            default:
                return false;
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43106a = "浏览第三方应用";
        this.f43107b = "View";
        this.f43108c = "打开第三方应用";
        this.f43109d = "Open";
        this.f43110e = "下载第三方应用";
        this.f43111f = "Install";
        this.f43112g = "mbridge_splash_btn_arrow_right";
        this.f43113h = "mbridge_splash_btn_circle";
        this.f43114i = "mbridge_splash_btn_finger";
        this.f43115j = "mbridge_splash_btn_go";
        this.f43116k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f43121p = new RectF();
        this.f43122q = new Paint();
        this.f43123r = new Paint();
        a();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f43124a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a$a, reason: collision with other inner class name */
        public class RunnableC0330a implements Runnable {
            public RunnableC0330a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f43120o.startAnimation(a.this.f43124a);
            }
        }

        public a(ScaleAnimation scaleAnimation) {
            this.f43124a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f43120o.setVisibility(4);
            MBSplashClickView.this.f43120o.postDelayed(new RunnableC0330a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f43120o.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Animation.AnimationListener {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Animation f43130a;

            public a(Animation animation) {
                this.f43130a = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f43119n.startAnimation(this.f43130a);
            }
        }

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f43119n.setVisibility(4);
            MBSplashClickView.this.f43119n.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f43119n.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43106a = "浏览第三方应用";
        this.f43107b = "View";
        this.f43108c = "打开第三方应用";
        this.f43109d = "Open";
        this.f43110e = "下载第三方应用";
        this.f43111f = "Install";
        this.f43112g = "mbridge_splash_btn_arrow_right";
        this.f43113h = "mbridge_splash_btn_circle";
        this.f43114i = "mbridge_splash_btn_finger";
        this.f43115j = "mbridge_splash_btn_go";
        this.f43116k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f43121p = new RectF();
        this.f43122q = new Paint();
        this.f43123r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43106a = "浏览第三方应用";
        this.f43107b = "View";
        this.f43108c = "打开第三方应用";
        this.f43109d = "Open";
        this.f43110e = "下载第三方应用";
        this.f43111f = "Install";
        this.f43112g = "mbridge_splash_btn_arrow_right";
        this.f43113h = "mbridge_splash_btn_circle";
        this.f43114i = "mbridge_splash_btn_finger";
        this.f43115j = "mbridge_splash_btn_go";
        this.f43116k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f43121p = new RectF();
        this.f43122q = new Paint();
        this.f43123r = new Paint();
    }
}
