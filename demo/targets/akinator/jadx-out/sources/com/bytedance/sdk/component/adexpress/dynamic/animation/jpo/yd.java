package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends cm {

    /* renamed from: cm, reason: collision with root package name */
    private jpo f18117cm;

    /* renamed from: jj, reason: collision with root package name */
    private float f18118jj;
    private float my;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo {

        /* renamed from: jd, reason: collision with root package name */
        private View f18120jd;

        public jpo(View view) {
            this.f18120jd = view;
        }

        public void jpo(int i10) {
            if (!"top".equals(yd.this.f18113jd.jpo())) {
                ViewGroup.LayoutParams layoutParams = this.f18120jd.getLayoutParams();
                layoutParams.height = i10;
                this.f18120jd.setLayoutParams(layoutParams);
                this.f18120jd.requestLayout();
                return;
            }
            if (yd.this.wqx instanceof ViewGroup) {
                for (int i11 = 0; i11 < ((ViewGroup) yd.this.wqx).getChildCount(); i11++) {
                    ((ViewGroup) yd.this.wqx).getChildAt(i11).setTranslationY(i10 - yd.this.my);
                }
            }
            yd ydVar = yd.this;
            ydVar.wqx.setTranslationY(ydVar.my - i10);
        }
    }

    public yd(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        super(view, jpoVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.cm
    public List<ObjectAnimator> jpo() {
        int i10;
        String str;
        View view = this.wqx;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my)) {
            this.wqx = (View) this.wqx.getParent();
        }
        this.wqx.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.wqx, "alpha", 0.0f, 1.0f).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        this.f18117cm = new jpo(this.wqx);
        final int i11 = this.wqx.getLayoutParams().height;
        this.my = i11;
        this.f18118jj = this.wqx.getLayoutParams().width;
        if (TtmlNode.LEFT.equals(this.f18113jd.jpo()) || TtmlNode.RIGHT.equals(this.f18113jd.jpo())) {
            i10 = (int) this.f18118jj;
            str = "width";
        } else {
            str = "height";
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.f18117cm, str, 0, i10).setDuration((int) (this.f18113jd.yd() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(jpo(duration));
        arrayList.add(jpo(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.yd.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                yd.this.f18117cm.jpo(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        return arrayList;
    }
}
