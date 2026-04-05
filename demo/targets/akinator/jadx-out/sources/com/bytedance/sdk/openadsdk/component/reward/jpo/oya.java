package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya {

    /* renamed from: cm, reason: collision with root package name */
    private final int f19943cm;

    /* renamed from: jd, reason: collision with root package name */
    private final dt f19944jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.qk f19945jj;
    com.bytedance.sdk.openadsdk.core.widget.xyk jpo;
    private final jpo my;

    /* renamed from: qk, reason: collision with root package name */
    private AnimatorSet f19946qk;
    private final Context wqx;

    public oya(jpo jpoVar) {
        this.wqx = jpoVar.f19920pe;
        this.f19944jd = jpoVar.f19914jd;
        this.f19943cm = jpoVar.sbx;
        this.my = jpoVar;
    }

    public View cm() {
        return this.f19945jj;
    }

    public void jd() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.oya.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.xyk xykVar = oya.this.jpo;
                if (xykVar != null) {
                    xykVar.setProgress(iIntValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(3000L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.oya.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.xyk xykVar = oya.this.jpo;
                if (xykVar != null) {
                    xykVar.setProgress(iIntValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f19946qk = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.f19946qk.start();
    }

    public void jpo() {
        try {
            if (rv.wqx(this.f19944jd)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.qk qkVar = new com.bytedance.sdk.openadsdk.core.widget.qk(this.wqx);
            this.f19945jj = qkVar;
            this.jpo = qkVar.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.jj.xyk downloadButton = this.f19945jj.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.my.f19923rv.my());
            }
            this.f19945jj.jpo(this.f19944jd, this.f19943cm);
        } catch (Throwable unused) {
        }
    }

    public void wqx() {
        AnimatorSet animatorSet = this.f19946qk;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
