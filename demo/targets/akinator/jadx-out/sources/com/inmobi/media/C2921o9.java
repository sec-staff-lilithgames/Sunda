package com.inmobi.media;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2921o9 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final String f33192a;

    /* renamed from: b, reason: collision with root package name */
    public C2853k9 f33193b;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerC2904n9 f33194c;

    /* renamed from: d, reason: collision with root package name */
    public C3039v9 f33195d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33196e;

    /* renamed from: f, reason: collision with root package name */
    public final A3 f33197f;

    /* renamed from: g, reason: collision with root package name */
    public final A3 f33198g;

    /* renamed from: h, reason: collision with root package name */
    public final ProgressBar f33199h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f33200i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33201j;

    /* renamed from: k, reason: collision with root package name */
    public final float f33202k;

    /* renamed from: l, reason: collision with root package name */
    public final View.OnClickListener f33203l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2921o9(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f33192a = "o9";
        this.f33202k = AbstractC2679a4.d().f32676c;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f33200i = relativeLayout;
        this.f33197f = new A3(context, (byte) 9, null);
        this.f33198g = new A3(context, (byte) 10, null);
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleHorizontal);
        this.f33199h = progressBar;
        progressBar.setScaleY(0.8f);
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setPadding(0, 0, 0, 0);
        a();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        float f10 = AbstractC2679a4.d().f32676c;
        layoutParams.setMargins(0, (int) ((-6) * f10), 0, (int) ((-8) * f10));
        Drawable progressDrawable = progressBar.getProgressDrawable();
        LayerDrawable layerDrawable = progressDrawable instanceof LayerDrawable ? (LayerDrawable) progressDrawable : null;
        if (layerDrawable != null) {
            Drawable drawable = layerDrawable.getDrawable(0);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
            layerDrawable.getDrawable(2).setColorFilter(new PorterDuffColorFilter(-327674, mode));
        }
        relativeLayout.addView(progressBar, layoutParams);
        this.f33194c = new HandlerC2904n9(this);
        this.f33203l = new o9.j0(this, 18);
    }

    public final void a() {
        int i10 = (int) (30 * this.f33202k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f33200i.addView(this.f33197f, layoutParams);
        this.f33197f.setOnClickListener(this.f33203l);
    }

    public final void b() {
        int i10 = (int) (30 * this.f33202k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f33200i.addView(this.f33198g, layoutParams);
        this.f33198g.setOnClickListener(this.f33203l);
    }

    public final void c() {
        if (this.f33196e) {
            try {
                HandlerC2904n9 handlerC2904n9 = this.f33194c;
                if (handlerC2904n9 != null) {
                    handlerC2904n9.removeMessages(2);
                }
                setVisibility(8);
            } catch (IllegalArgumentException e10) {
                String TAG = this.f33192a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                Y5 y52 = Y5.f32563a;
                C2796h2 event = new C2796h2(e10);
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                Y5.f32566d.a(event);
            }
            this.f33196e = false;
        }
    }

    public final void d() {
        if (!this.f33196e) {
            C3039v9 c3039v9 = this.f33195d;
            if (c3039v9 != null) {
                int currentPosition = c3039v9.getCurrentPosition();
                int duration = c3039v9.getDuration();
                if (duration != 0) {
                    this.f33199h.setProgress((currentPosition * 100) / duration);
                }
            }
            this.f33196e = true;
            C3039v9 c3039v92 = this.f33195d;
            Object tag = c3039v92 != null ? c3039v92.getTag() : null;
            C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
            if (c2887m9 != null) {
                this.f33197f.setVisibility(c2887m9.A ? 0 : 4);
                this.f33199h.setVisibility(c2887m9.C ? 0 : 4);
            }
            setVisibility(0);
        }
        HandlerC2904n9 handlerC2904n9 = this.f33194c;
        if (handlerC2904n9 != null) {
            handlerC2904n9.sendEmptyMessage(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        C3039v9 c3039v9;
        C3039v9 c3039v92;
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        int keyCode = event.getKeyCode();
        boolean z10 = event.getRepeatCount() == 0 && event.getAction() == 0;
        if (keyCode != 24 && keyCode != 25 && keyCode != 27) {
            if (keyCode != 62 && keyCode != 79) {
                if (keyCode != 164) {
                    if (keyCode != 85) {
                        if (keyCode != 86) {
                            if (keyCode == 126) {
                                if (z10 && (c3039v92 = this.f33195d) != null && !c3039v92.isPlaying()) {
                                    C3039v9 c3039v93 = this.f33195d;
                                    if (c3039v93 != null) {
                                        c3039v93.start();
                                    }
                                    d();
                                }
                                return true;
                            }
                            if (keyCode != 127) {
                                d();
                                return super.dispatchKeyEvent(event);
                            }
                        }
                        if (z10 && (c3039v9 = this.f33195d) != null && c3039v9.isPlaying()) {
                            C3039v9 c3039v94 = this.f33195d;
                            if (c3039v94 != null) {
                                c3039v94.pause();
                            }
                            d();
                        }
                        return true;
                    }
                }
            }
            if (z10) {
                C3039v9 c3039v95 = this.f33195d;
                if (c3039v95 != null) {
                    if (c3039v95.isPlaying()) {
                        c3039v95.pause();
                    } else {
                        c3039v95.start();
                    }
                }
                d();
            }
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public final Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        ProgressBar progressBar = this.f33199h;
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        return uu.p1.hashMapOf(tu.e0.to(progressBar, friendlyObstructionPurpose), tu.e0.to(this.f33197f, friendlyObstructionPurpose), tu.e0.to(this.f33198g, friendlyObstructionPurpose));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(C2921o9.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(C2921o9.class.getName());
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent ev2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ev2, "ev");
        C3039v9 c3039v9 = this.f33195d;
        if (c3039v9 == null || !c3039v9.a()) {
            return false;
        }
        if (this.f33196e) {
            c();
            return false;
        }
        d();
        return false;
    }

    public final void setMediaPlayer(C3039v9 videoView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(videoView, "videoView");
        this.f33195d = videoView;
        Object tag = videoView != null ? videoView.getTag() : null;
        C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
        if (c2887m9 == null || !c2887m9.A || c2887m9.c()) {
            return;
        }
        this.f33201j = true;
        this.f33200i.removeView(this.f33198g);
        this.f33200i.removeView(this.f33197f);
        b();
    }

    public final void setVideoAd(C2853k9 c2853k9) {
        this.f33193b = c2853k9;
    }

    public static final void a(C2921o9 this$0, View view) {
        C2853k9 c2853k9;
        C2853k9 c2853k92;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        C3039v9 c3039v9 = this$0.f33195d;
        if (c3039v9 != null) {
            Object tag = c3039v9.getTag();
            C2887m9 c2887m9 = tag instanceof C2887m9 ? (C2887m9) tag : null;
            if (this$0.f33201j) {
                C3039v9 c3039v92 = this$0.f33195d;
                if (c3039v92 != null) {
                    c3039v92.k();
                }
                this$0.f33201j = false;
                this$0.f33200i.removeView(this$0.f33198g);
                this$0.f33200i.removeView(this$0.f33197f);
                this$0.a();
                if (c2887m9 == null || (c2853k92 = this$0.f33193b) == null) {
                    return;
                }
                try {
                    c2853k92.i(c2887m9);
                    c2887m9.f33093z = true;
                    return;
                } catch (Exception e10) {
                    String TAG = this$0.f33192a;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    Y5 y52 = Y5.f32563a;
                    Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
                    return;
                }
            }
            C3039v9 c3039v93 = this$0.f33195d;
            if (c3039v93 != null) {
                c3039v93.c();
            }
            this$0.f33201j = true;
            this$0.f33200i.removeView(this$0.f33197f);
            this$0.f33200i.removeView(this$0.f33198g);
            this$0.b();
            if (c2887m9 == null || (c2853k9 = this$0.f33193b) == null) {
                return;
            }
            try {
                c2853k9.e(c2887m9);
                c2887m9.f33093z = false;
            } catch (Exception e11) {
                String TAG2 = this$0.f33192a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                Y5 y53 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e11, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }
}
