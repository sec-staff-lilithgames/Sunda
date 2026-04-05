package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.prr;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi {

    /* renamed from: if, reason: not valid java name */
    private boolean f102if;

    /* renamed from: jd, reason: collision with root package name */
    TTAdDislikeToast f19739jd;

    /* renamed from: jj, reason: collision with root package name */
    private final dt f19740jj;
    prr jpo;
    private final RelativeLayout my;

    /* renamed from: qk, reason: collision with root package name */
    private final Context f19742qk;
    private ImageView xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.jj f19743yd;
    private TextView zz;
    final AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: cm, reason: collision with root package name */
    final AtomicBoolean f19738cm = new AtomicBoolean(false);

    /* renamed from: ju, reason: collision with root package name */
    private final int f19741ju = va.jd(com.bytedance.sdk.openadsdk.core.sq.jpo(), 44.0f);

    public opi(Context context, RelativeLayout relativeLayout, dt dtVar) {
        this.f19742qk = context;
        this.my = relativeLayout;
        this.f19740jj = dtVar;
        my();
    }

    private void jj() {
        try {
            if (this.jpo == null) {
                prr prrVar = new prr(this.f19742qk, this.f19740jj);
                this.jpo = prrVar;
                prrVar.setDislikeSource("landing_page");
                this.jpo.setCallback(new prr.jpo() { // from class: com.bytedance.sdk.openadsdk.common.opi.6
                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jd(View view) {
                        opi.this.wqx.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jpo(View view) {
                        opi.this.wqx.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jpo(FilterWord filterWord) {
                        if (opi.this.f19738cm.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        opi.this.f19738cm.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.my.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.jpo);
            if (this.f19739jd == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.f19742qk);
                this.f19739jd = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th2);
        }
    }

    private void my() {
        this.xyk = (ImageView) this.my.findViewById(com.bytedance.sdk.openadsdk.utils.hna.ota);
        this.zz = (TextView) this.my.findViewById(com.bytedance.sdk.openadsdk.utils.hna.wad);
        ImageView imageView = (ImageView) this.my.findViewById(com.bytedance.sdk.openadsdk.utils.hna.ree);
        this.f19743yd = (com.bytedance.sdk.openadsdk.core.jj.jj) this.my.findViewById(com.bytedance.sdk.openadsdk.utils.hna.voc);
        dt dtVar = this.f19740jj;
        if (dtVar != null) {
            this.zz.setText(TextUtils.isEmpty(dtVar.ozw()) ? com.bytedance.sdk.component.utils.dt.jpo(this.f19742qk, "tt_web_title_default") : this.f19740jj.ozw());
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.opi.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                opi.this.cm();
            }
        });
    }

    private void qk() {
        this.f19739jd.show(TTAdDislikeToast.getDislikeTip());
    }

    public void cm() {
        if (this.f19738cm.get()) {
            qk();
            return;
        }
        if (this.jpo == null) {
            jj();
        }
        prr prrVar = this.jpo;
        if (prrVar != null) {
            prrVar.jpo();
        }
    }

    public void jd() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.my.getLayoutParams();
            if (this.f102if || marginLayoutParams.topMargin != 0) {
                return;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -this.f19741ju);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.opi.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    opi.this.my.setLayoutParams(marginLayoutParams);
                }
            });
            valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.opi.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    opi.this.f102if = false;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    opi.this.f102if = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }
            });
            valueAnimatorOfInt.start();
        } catch (Throwable unused) {
        }
    }

    public ImageView wqx() {
        return this.xyk;
    }

    public void jpo(int i10) {
        if (i10 == 100) {
            this.f19743yd.setVisibility(8);
        } else {
            this.f19743yd.setVisibility(0);
            this.f19743yd.setProgress(i10);
        }
    }

    public void jpo() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.my.getLayoutParams();
            if (this.f102if) {
                return;
            }
            int i10 = marginLayoutParams.topMargin;
            int i11 = this.f19741ju;
            if (i10 == (-i11)) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-i11, 0);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.opi.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        opi.this.my.setLayoutParams(marginLayoutParams);
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.opi.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        opi.this.f102if = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        opi.this.f102if = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }
}
