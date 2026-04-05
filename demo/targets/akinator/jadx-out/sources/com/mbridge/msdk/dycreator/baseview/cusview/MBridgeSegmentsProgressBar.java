package com.mbridge.msdk.dycreator.baseview.cusview;

import a.b;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f40004a;

    /* renamed from: b, reason: collision with root package name */
    private int f40005b;

    /* renamed from: c, reason: collision with root package name */
    private int f40006c;

    /* renamed from: d, reason: collision with root package name */
    private int f40007d;

    /* renamed from: e, reason: collision with root package name */
    private int f40008e;

    /* renamed from: f, reason: collision with root package name */
    private int f40009f;

    /* renamed from: g, reason: collision with root package name */
    private int f40010g;

    /* renamed from: h, reason: collision with root package name */
    private int f40011h;

    /* renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f40012i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f40013j;

    /* renamed from: k, reason: collision with root package name */
    private String f40014k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f40015l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f40004a = "MBridgeSegmentsProgressBar";
        this.f40006c = 1;
        this.f40007d = 20;
        this.f40008e = 10;
        this.f40009f = 1;
        this.f40010g = -1711276033;
        this.f40011h = -1;
        this.f40012i = new ArrayList();
        this.f40015l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f40015l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            p0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        try {
            if (this.f40006c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f40014k)) {
                    this.f40014k = this.f40015l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f40006c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f40014k)) {
                    this.f40014k = this.f40015l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f40012i.clear();
            removeAllViews();
            setBackground(getBackgroundDrawable());
            TextView textView = new TextView(getContext());
            this.f40013j = textView;
            textView.setTextColor(-1);
            this.f40013j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f40013j.setLayoutParams(layoutParams);
            if (this.f40006c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f40013j;
                int i10 = this.f40007d;
                textView2.setPadding(i10 / 2, 15, i10 / 2, 5);
            }
            if (this.f40006c == 2) {
                this.f40013j.setGravity(16);
                TextView textView3 = this.f40013j;
                int i11 = this.f40007d;
                textView3.setPadding(i11 / 2, 0, i11 / 2, 0);
            }
            try {
                int iA = h0.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (h0.a(iA) && (drawable = getContext().getResources().getDrawable(iA)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f40013j.setCompoundDrawables(drawable, null, null, null);
                    this.f40013j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th3) {
                p0.b("MBridgeSegmentsProgressBar", th3.getMessage());
            }
            this.f40013j.setText(a(this.f40009f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i12 = 0; i12 < this.f40005b; i12++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(getSegmentLayerDrawable());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i13 = this.f40007d;
                layoutParams3.leftMargin = i13 / 2;
                layoutParams3.rightMargin = i13 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f40012i.add(progressBar);
            }
            int i14 = this.f40006c;
            if (i14 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f40013j);
                addView(linearLayout);
            } else {
                if (i14 != 2) {
                    addView(linearLayout);
                    return;
                }
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f40013j);
            }
        } catch (Throwable th4) {
            p0.b("MBridgeSegmentsProgressBar", th4.getMessage());
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f40008e);
        gradientDrawable.setColor(this.f40010g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f40008e);
        gradientDrawable2.setColor(this.f40011h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i10, int i11) {
        this.f40005b = i10;
        this.f40006c = i11;
        a();
    }

    public void setIndicatorText(String str) {
        this.f40014k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f40012i.size() == 0) {
                return;
            }
            if (i11 < this.f40012i.size()) {
                this.f40012i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f40009f) {
                this.f40009f = i12;
                TextView textView = this.f40013j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th2) {
            p0.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f40005b = i10;
        this.f40006c = i11;
        this.f40011h = i12;
        this.f40010g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f40005b = i10;
        this.f40006c = i11;
        this.f40011h = i12;
        this.f40010g = i13;
        this.f40007d = i14;
        this.f40008e = i15;
        a();
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40004a = "MBridgeSegmentsProgressBar";
        this.f40006c = 1;
        this.f40007d = 20;
        this.f40008e = 10;
        this.f40009f = 1;
        this.f40010g = -1711276033;
        this.f40011h = -1;
        this.f40012i = new ArrayList();
        this.f40015l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40004a = "MBridgeSegmentsProgressBar";
        this.f40006c = 1;
        this.f40007d = 20;
        this.f40008e = 10;
        this.f40009f = 1;
        this.f40010g = -1711276033;
        this.f40011h = -1;
        this.f40012i = new ArrayList();
        this.f40015l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f40004a = "MBridgeSegmentsProgressBar";
        this.f40006c = 1;
        this.f40007d = 20;
        this.f40008e = 10;
        this.f40009f = 1;
        this.f40010g = -1711276033;
        this.f40011h = -1;
        this.f40012i = new ArrayList();
        this.f40015l = false;
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f40014k, Integer.valueOf(i10), Integer.valueOf(this.f40005b)));
            return sb2;
        } catch (Throwable th2) {
            b.x(this.f40005b, i10, "videos, the", " is playing.", sb2);
            p0.b("MBridgeSegmentsProgressBar", th2.getMessage());
            return sb2;
        }
    }
}
