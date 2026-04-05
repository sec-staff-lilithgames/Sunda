package e6;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m extends o1 {
    public m(int i10) {
        setMode(i10);
    }

    public static float w(v0 v0Var, float f10) {
        Float f11;
        return (v0Var == null || (f11 = (Float) v0Var.f53874a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // e6.o1, e6.c0
    public void captureStartValues(v0 v0Var) {
        super.captureStartValues(v0Var);
        View view = v0Var.f53875b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(b1.f53758a.getTransitionAlpha(view)) : Float.valueOf(0.0f);
        }
        v0Var.f53874a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // e6.c0
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // e6.o1
    public Animator onAppear(ViewGroup viewGroup, View view, v0 v0Var, v0 v0Var2) {
        b1.f53758a.saveNonTransitionAlpha(view);
        return v(view, w(v0Var, 0.0f), 1.0f);
    }

    @Override // e6.o1
    public Animator onDisappear(ViewGroup viewGroup, View view, v0 v0Var, v0 v0Var2) {
        j1 j1Var = b1.f53758a;
        j1Var.saveNonTransitionAlpha(view);
        ObjectAnimator objectAnimatorV = v(view, w(v0Var, 1.0f), 0.0f);
        if (objectAnimatorV == null) {
            j1Var.setTransitionAlpha(view, w(v0Var2, 1.0f));
        }
        return objectAnimatorV;
    }

    public final ObjectAnimator v(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        b1.f53758a.setTransitionAlpha(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, b1.f53759b, f11);
        l lVar = new l(view);
        objectAnimatorOfFloat.addListener(lVar);
        getRootTransition().addListener(lVar);
        return objectAnimatorOfFloat;
    }

    public m() {
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.f53890d);
        setMode(n3.q.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
