package com.inmobi.media;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.RelativeLayout;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f32142a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC3108za f32143b;

    /* renamed from: c, reason: collision with root package name */
    public float f32144c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32145d;

    public Q(RelativeLayout adBackgroundView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.f32142a = adBackgroundView;
        this.f32143b = Aa.a(AbstractC2679a4.g());
        this.f32144c = 1.0f;
    }

    public abstract void a();

    public void a(EnumC3108za orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        this.f32143b = orientation;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public final void e() {
        Z3 z32;
        Z3 z33;
        RelativeLayout.LayoutParams layoutParams;
        if (this.f32144c == 1.0f) {
            this.f32142a.setLayoutParams(b0.e2.e(-1, -1, 10));
            return;
        }
        if (this.f32145d) {
            C2696b4 c2696b4 = AbstractC2679a4.f32633a;
            Context context = this.f32142a.getContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            Display displayA = AbstractC2679a4.a(context);
            if (displayA == null) {
                z33 = AbstractC2679a4.f32634b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayA.getRealMetrics(displayMetrics);
                z32 = new Z3(displayMetrics.widthPixels, displayMetrics.heightPixels);
                z33 = z32;
            }
        } else {
            C2696b4 c2696b42 = AbstractC2679a4.f32633a;
            Context context2 = this.f32142a.getContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context2, "getContext(...)");
            kotlin.jvm.internal.e0.checkNotNullParameter(context2, "context");
            Display displayA2 = AbstractC2679a4.a(context2);
            if (displayA2 == null) {
                z33 = AbstractC2679a4.f32634b;
            } else {
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                displayA2.getMetrics(displayMetrics2);
                z32 = new Z3(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
                z33 = z32;
            }
        }
        Objects.toString(this.f32143b);
        if (Aa.b(this.f32143b)) {
            layoutParams = new RelativeLayout.LayoutParams(mv.d.roundToInt(z33.f32591a * this.f32144c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, mv.d.roundToInt(z33.f32592b * this.f32144c));
            layoutParams2.addRule(10);
            layoutParams = layoutParams2;
        }
        this.f32142a.setLayoutParams(layoutParams);
    }

    public abstract void f();

    public abstract void g();
}
