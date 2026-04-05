package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2747e4 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f32800a;

    /* renamed from: b, reason: collision with root package name */
    public int f32801b;

    /* renamed from: c, reason: collision with root package name */
    public C2899n4 f32802c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2798h4 f32803d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2758ef f32804e;

    /* renamed from: f, reason: collision with root package name */
    public F5 f32805f;

    /* renamed from: g, reason: collision with root package name */
    public cg f32806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2747e4(Activity activity) {
        super(activity);
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        this.f32800a = activity;
        this.f32801b = -1;
    }

    public final void a(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
        A3 a32 = new A3(context, (byte) 4, this.f32805f);
        a32.setId(65503);
        a32.setOnTouchListener(new zk.l0(this, 2));
        linearLayout.addView(a32, layoutParams);
    }

    public final void b(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
        A3 a32 = new A3(context, (byte) 2, this.f32805f);
        a32.setId(65516);
        a32.setOnTouchListener(new zk.l0(this, 0));
        linearLayout.addView(a32, layoutParams);
    }

    public final void c(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
        A3 a32 = new A3(context, (byte) 6, this.f32805f);
        a32.setId(1048283);
        a32.setOnTouchListener(new zk.l0(this, 1));
        linearLayout.addView(a32, layoutParams);
    }

    public final void d(LinearLayout linearLayout, LinearLayout.LayoutParams layoutParams) {
        Context context = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
        A3 a32 = new A3(context, (byte) 3, this.f32805f);
        a32.setId(65502);
        a32.setOnTouchListener(new zk.l0(this, 3));
        linearLayout.addView(a32, layoutParams);
    }

    public final InterfaceC2758ef getUserLeftApplicationListener() {
        return this.f32804e;
    }

    public final void setEmbeddedBrowserUpdateListener(InterfaceC2798h4 browserUpdateListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(browserUpdateListener, "browserUpdateListener");
        this.f32803d = browserUpdateListener;
    }

    public final void setLogger(F5 logger) {
        kotlin.jvm.internal.e0.checkNotNullParameter(logger, "logger");
        this.f32805f = logger;
    }

    public final void setUserLeftApplicationListener(InterfaceC2758ef interfaceC2758ef) {
        this.f32804e = interfaceC2758ef;
    }

    public static final boolean a(C2747e4 this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        C2899n4 c2899n4 = this$0.f32802c;
        if (c2899n4 == null) {
            InterfaceC2798h4 interfaceC2798h4 = this$0.f32803d;
            if (interfaceC2798h4 != null) {
                C2934p5.a(((C2917o5) interfaceC2798h4).f33179a);
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c2899n4.canGoBack()) {
                c2899n4.goBack();
            } else {
                InterfaceC2798h4 interfaceC2798h42 = this$0.f32803d;
                if (interfaceC2798h42 != null) {
                    C2934p5.a(((C2917o5) interfaceC2798h42).f33179a);
                }
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean b(C2747e4 this$0, View view, MotionEvent motionEvent) {
        C2815i4 c2815i4;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C2899n4 c2899n4 = this$0.f32802c;
            if (c2899n4 != null && (c2815i4 = c2899n4.f33126h) != null) {
                C2815i4.a(c2815i4, 5, true, null, 12);
            }
            InterfaceC2798h4 interfaceC2798h4 = this$0.f32803d;
            if (interfaceC2798h4 != null) {
                C2934p5.a(((C2917o5) interfaceC2798h4).f33179a);
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(C2747e4 this$0, View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        C2899n4 c2899n4 = this$0.f32802c;
        if (c2899n4 == null) {
            return true;
        }
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (c2899n4.canGoForward()) {
                c2899n4.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(C2747e4 this$0, View view, MotionEvent motionEvent) {
        C2815i4 c2815i4;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C2899n4 c2899n4 = this$0.f32802c;
            if (c2899n4 != null && (c2815i4 = c2899n4.f33126h) != null) {
                C2815i4.a(c2815i4, 6, true, null, 12);
            }
            C2899n4 c2899n42 = this$0.f32802c;
            if (c2899n42 != null) {
                c2899n42.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
