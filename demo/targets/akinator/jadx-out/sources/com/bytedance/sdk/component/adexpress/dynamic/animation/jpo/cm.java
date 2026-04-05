package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nzb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class cm implements nzb {

    /* renamed from: jd, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.cm.jpo f18113jd;
    public View wqx;

    /* renamed from: cm, reason: collision with root package name */
    private Set<ScheduledFuture<?>> f18112cm = new HashSet();
    public List<ObjectAnimator> jpo = jpo();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo implements Runnable {

        /* renamed from: jd, reason: collision with root package name */
        ScheduledFuture<?> f18116jd;
        ObjectAnimator jpo;

        public jpo(ObjectAnimator objectAnimator) {
            this.jpo = objectAnimator;
        }

        public void jpo(ScheduledFuture<?> scheduledFuture) {
            this.f18116jd = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx() != null) {
                com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().wqx().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm.jpo.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jpo.this.jpo.resume();
                    }
                });
                if (this.f18116jd != null) {
                    cm.this.f18112cm.remove(this.f18116jd);
                }
            }
        }
    }

    public cm(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        this.wqx = view;
        this.f18113jd = jpoVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nzb
    public void jd() {
        List<ObjectAnimator> list = this.jpo;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.f18112cm.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public abstract List<ObjectAnimator> jpo();

    public void wqx() {
        List<ObjectAnimator> list = this.jpo;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.f18113jd.sq() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        jpo jpoVar = cm.this.new jpo(objectAnimator);
                        ScheduledFuture<?> scheduledFutureJpo = com.bytedance.sdk.component.adexpress.cm.cm.jpo(jpoVar, (long) (cm.this.f18113jd.sq() * 1000.0d), TimeUnit.MILLISECONDS);
                        jpoVar.jpo(scheduledFutureJpo);
                        cm.this.f18112cm.add(scheduledFutureJpo);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    public ObjectAnimator jpo(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f18113jd.oya() * 1000.0d));
        if (this.f18113jd.prr() > 0) {
            objectAnimator.setRepeatCount(this.f18113jd.prr() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.f18113jd.hna())) {
            if ("alternate".equals(this.f18113jd.hna()) || "alternate-reverse".equals(this.f18113jd.hna())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f18113jd.au())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f18113jd.hna())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f18113jd.hna())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    cm.this.wqx.setVisibility(0);
                    if (cm.this.wqx.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj) {
                        ((View) cm.this.wqx.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
