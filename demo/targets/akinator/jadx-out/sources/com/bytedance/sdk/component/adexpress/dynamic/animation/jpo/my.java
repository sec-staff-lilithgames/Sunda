package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends cm {
    public my(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
    }

    private void cm(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f18113jd.nmd())).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(jpo(duration));
    }

    private void jd(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f18113jd.nmd())).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.my.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                my.this.wqx.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(jpo(duration));
    }

    private void wqx(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f18113jd.nmd())).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.my.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                my.this.wqx.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(jpo(duration));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        ArrayList arrayList = new ArrayList();
        String strRq = this.f18113jd.rq();
        switch (strRq.hashCode()) {
            case 3029889:
                if (strRq.equals("both")) {
                    jpo(arrayList);
                    return arrayList;
                }
                break;
            case 3387192:
                strRq.equals("none");
                break;
            case 483313230:
                if (strRq.equals("forwards")) {
                    cm(arrayList);
                    return arrayList;
                }
                break;
            case 1356771568:
                if (strRq.equals("backwards")) {
                    jd(arrayList);
                    return arrayList;
                }
                break;
        }
        wqx(arrayList);
        return arrayList;
    }

    private void jpo(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), this.f18113jd.nmd())).setDuration(((int) (this.f18113jd.yd() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar = this.f18113jd;
        jpoVar.jj(jpoVar.prr() * 2);
        list.add(jpo(duration));
    }
}
