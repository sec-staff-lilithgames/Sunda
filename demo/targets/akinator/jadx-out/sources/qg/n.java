package qg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f83200a;

    /* renamed from: b, reason: collision with root package name */
    public final View f83201b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f83202c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f83203d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f83204e;

    /* renamed from: f, reason: collision with root package name */
    public long f83205f;

    /* renamed from: g, reason: collision with root package name */
    public int f83206g;

    /* renamed from: h, reason: collision with root package name */
    public int f83207h;

    public n(View view, View view2) {
        this.f83200a = view;
        this.f83201b = view2;
    }

    public final AnimatorSet a(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        int i10 = this.f83206g;
        Rect rectCalculateRectFromBounds = t0.calculateRectFromBounds(this.f83200a, i10);
        int i11 = this.f83207h;
        View view = this.f83201b;
        Rect rectCalculateRectFromBounds2 = t0.calculateRectFromBounds(view, i11);
        Rect rect = new Rect(rectCalculateRectFromBounds);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new a0(rect), rectCalculateRectFromBounds, rectCalculateRectFromBounds2);
        valueAnimatorOfObject.addUpdateListener(new k(0, this, rect));
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f83204e;
        if (animatorUpdateListener != null) {
            valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        }
        valueAnimatorOfObject.setDuration(this.f83205f);
        y4.b bVar = vf.a.f89241b;
        valueAnimatorOfObject.setInterpolator(b0.of(z10, bVar));
        List<View> children = t0.getChildren(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(x.alphaListener(children));
        valueAnimatorOfFloat.setDuration(this.f83205f);
        valueAnimatorOfFloat.setInterpolator(b0.of(z10, vf.a.f89240a));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((r2.getRight() - view.getRight()) + (view.getLeft() - r2.getLeft()), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(x.translationXListener(this.f83203d));
        valueAnimatorOfFloat2.setDuration(this.f83205f);
        valueAnimatorOfFloat2.setInterpolator(b0.of(z10, bVar));
        animatorSet.playTogether(valueAnimatorOfObject, valueAnimatorOfFloat, valueAnimatorOfFloat2);
        return animatorSet;
    }

    public n addEndAnchoredViews(View... viewArr) {
        Collections.addAll(this.f83203d, viewArr);
        return this;
    }

    public n addListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f83202c.add(animatorListenerAdapter);
        return this;
    }

    public Animator getCollapseAnimator() {
        AnimatorSet animatorSetA = a(false);
        animatorSetA.addListener(new m(this));
        Iterator it = this.f83202c.iterator();
        while (it.hasNext()) {
            animatorSetA.addListener((AnimatorListenerAdapter) it.next());
        }
        return animatorSetA;
    }

    public Animator getExpandAnimator() {
        AnimatorSet animatorSetA = a(true);
        animatorSetA.addListener(new l(this));
        Iterator it = this.f83202c.iterator();
        while (it.hasNext()) {
            animatorSetA.addListener((AnimatorListenerAdapter) it.next());
        }
        return animatorSetA;
    }

    public n setAdditionalUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f83204e = animatorUpdateListener;
        return this;
    }

    public n setCollapsedViewOffsetY(int i10) {
        this.f83206g = i10;
        return this;
    }

    public n setDuration(long j10) {
        this.f83205f = j10;
        return this;
    }

    public n setExpandedViewOffsetY(int i10) {
        this.f83207h = i10;
        return this;
    }

    public n addEndAnchoredViews(Collection<View> collection) {
        this.f83203d.addAll(collection);
        return this;
    }
}
