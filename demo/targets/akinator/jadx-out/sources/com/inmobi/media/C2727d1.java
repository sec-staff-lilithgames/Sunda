package com.inmobi.media;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2727d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32728a = "d1";

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32729b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f32730c;

    public static C2710c1 a(ValueAnimator valueAnimator, C2903n8 c2903n8) {
        valueAnimator.setDuration(0L);
        valueAnimator.setStartDelay(0L);
        Z8 z82 = c2903n8.f33139d.f33191k;
        if (z82 != null) {
            Y8 y82 = z82.f32597a;
            Y8 y83 = z82.f32598b;
            if (y83 != null) {
                valueAnimator.setDuration(y83.a() * 1000);
            }
            if (y82 != null) {
                valueAnimator.setStartDelay(y82.a() * 1000);
            }
        }
        return new C2710c1(valueAnimator);
    }

    public static ValueAnimator b(View view, float f10, float f11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        valueAnimatorOfFloat.addUpdateListener(new zk.i0(layoutParams instanceof C2987s8 ? (C2987s8) layoutParams : null, view, 0));
        kotlin.jvm.internal.e0.checkNotNull(valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    public static final void b(C2987s8 c2987s8, View view, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "$view");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (c2987s8 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.jvm.internal.e0.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c2987s8.f33367b = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c2987s8);
        view.requestLayout();
    }

    public static ValueAnimator a(View view, float f10, float f11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        valueAnimatorOfFloat.addUpdateListener(new zk.i0(layoutParams instanceof C2987s8 ? (C2987s8) layoutParams : null, view, 1));
        kotlin.jvm.internal.e0.checkNotNull(valueAnimatorOfFloat);
        return valueAnimatorOfFloat;
    }

    public static final void a(C2987s8 c2987s8, View view, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "$view");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueAnimator, "valueAnimator");
        if (c2987s8 != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            kotlin.jvm.internal.e0.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c2987s8.f33366a = (int) ((Float) animatedValue).floatValue();
        }
        view.setLayoutParams(c2987s8);
        view.requestLayout();
    }

    public final void a(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2710c1 c2710c1 = (C2710c1) it.next();
            if (!c2710c1.f32699c) {
                ValueAnimator valueAnimator = c2710c1.f32697a;
                kotlin.jvm.internal.e0.checkNotNull(valueAnimator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                valueAnimator.setCurrentPlayTime(c2710c1.f32698b);
                valueAnimator.start();
            }
            if (!this.f32729b.contains(c2710c1)) {
                this.f32729b.add(c2710c1);
            }
        }
    }

    public final void a() {
        if (this.f32730c) {
            this.f32730c = false;
            Iterator it = this.f32729b.iterator();
            while (it.hasNext()) {
                C2710c1 c2710c1 = (C2710c1) it.next();
                ValueAnimator valueAnimator = c2710c1.f32697a;
                kotlin.jvm.internal.e0.checkNotNull(valueAnimator, "null cannot be cast to non-null type android.animation.ValueAnimator");
                c2710c1.f32698b = valueAnimator.getCurrentPlayTime();
                if (valueAnimator.getAnimatedFraction() == 1.0d) {
                    c2710c1.f32699c = true;
                }
                valueAnimator.cancel();
            }
        }
    }
}
