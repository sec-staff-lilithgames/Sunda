package qg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class x implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final w f83237a;

    /* renamed from: b, reason: collision with root package name */
    public final View[] f83238b;

    public x(w wVar, View... viewArr) {
        this.f83237a = wVar;
        this.f83238b = viewArr;
    }

    public static x alphaListener(View... viewArr) {
        return new x(new pe.a(21), viewArr);
    }

    public static x scaleListener(View... viewArr) {
        return new x(new pe.a(19), viewArr);
    }

    public static x translationXListener(View... viewArr) {
        return new x(new pe.a(18), viewArr);
    }

    public static x translationYListener(View... viewArr) {
        return new x(new pe.a(20), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f83238b) {
            this.f83237a.onAnimationUpdate(valueAnimator, view);
        }
    }

    public static x alphaListener(Collection<View> collection) {
        return new x(new pe.a(21), collection);
    }

    public static x scaleListener(Collection<View> collection) {
        return new x(new pe.a(19), collection);
    }

    public static x translationXListener(Collection<View> collection) {
        return new x(new pe.a(18), collection);
    }

    public static x translationYListener(Collection<View> collection) {
        return new x(new pe.a(20), collection);
    }

    public x(w wVar, Collection<View> collection) {
        this.f83237a = wVar;
        this.f83238b = (View[]) collection.toArray(new View[0]);
    }
}
