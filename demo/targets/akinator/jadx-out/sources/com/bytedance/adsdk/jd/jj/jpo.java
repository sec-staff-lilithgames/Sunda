package com.bytedance.adsdk.jd.jj;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> jpo = new CopyOnWriteArraySet();

    /* renamed from: jd, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f17270jd = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> wqx = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f17270jd.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.wqx.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.jpo.add(animatorUpdateListener);
    }

    public void cm() {
        Iterator<Animator.AnimatorPauseListener> it = this.wqx.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void jd(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f17270jd) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void jpo(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f17270jd) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    public void my() {
        Iterator<Animator.AnimatorPauseListener> it = this.wqx.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f17270jd.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.jpo.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f17270jd.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.wqx.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.jpo.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public void wqx() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.jpo.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void jd() {
        Iterator<Animator.AnimatorListener> it = this.f17270jd.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    public void jpo() {
        Iterator<Animator.AnimatorListener> it = this.f17270jd.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }
}
