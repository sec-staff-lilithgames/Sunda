package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends AnimationSet implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f6424b;

    /* renamed from: c, reason: collision with root package name */
    public final View f6425c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6426e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6427f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6428g;

    public o0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f6428g = true;
        this.f6424b = viewGroup;
        this.f6425c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j10, Transformation transformation) {
        this.f6428g = true;
        if (this.f6426e) {
            return !this.f6427f;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f6426e = true;
            x3.t0.add(this.f6424b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10 = this.f6426e;
        ViewGroup viewGroup = this.f6424b;
        if (z10 || !this.f6428g) {
            viewGroup.endViewTransition(this.f6425c);
            this.f6427f = true;
        } else {
            this.f6428g = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f6428g = true;
        if (this.f6426e) {
            return !this.f6427f;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f6426e = true;
            x3.t0.add(this.f6424b, this);
        }
        return true;
    }
}
