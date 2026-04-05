package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.sdk.openadsdk.core.jj.wqx {

    /* renamed from: cm, reason: collision with root package name */
    private float f20032cm;

    /* renamed from: jd, reason: collision with root package name */
    private final boolean f20033jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.activity.xyk f20034jj;
    private final boolean jpo;
    private float my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f20035qk;
    private com.bytedance.sdk.openadsdk.core.jj.wqx wqx;

    public jd(Context context, boolean z10, boolean z11, final int i10) {
        super(context);
        this.jpo = z10;
        this.f20033jd = z11;
        if (z10) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.jd.2
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
                }
            });
            setClipToOutline(true);
            return;
        }
        this.wqx = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.wqx, layoutParams);
        this.wqx.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.jd.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
            }
        });
        this.wqx.setClipToOutline(true);
    }

    public void jpo(zz zzVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = this.wqx;
        if (wqxVar != null) {
            wqxVar.addView(zzVar, layoutParams);
        } else {
            addView(zzVar, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVarSe;
        super.onAttachedToWindow();
        if (this.f20035qk || (xykVar = this.f20034jj) == null || (jpoVarSe = xykVar.se()) == null) {
            return;
        }
        jpoVarSe.f19923rv.jd(true);
        this.f20035qk = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVarSe;
        super.onDetachedFromWindow();
        if (!this.f20035qk || (xykVar = this.f20034jj) == null || (jpoVarSe = xykVar.se()) == null) {
            return;
        }
        jpoVarSe.f19923rv.jd(false);
        this.f20035qk = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj.wqx, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (this.f20033jd) {
            float f10 = this.f20032cm;
            if (f10 > 0.0f) {
                int iMax = Math.max(0, (size - ((int) (size2 * f10))) / 2);
                setPadding(iMax, 0, iMax, 0);
            } else {
                float f11 = this.my;
                if (f11 > 0.0f) {
                    int iMax2 = Math.max(0, (size - ((int) (size * f11))) / 2);
                    setPadding(iMax2, 0, iMax2, 0);
                }
            }
        } else if (this.jpo) {
            float f12 = this.f20032cm;
            if (f12 > 0.0f) {
                i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f12), 1073741824);
            } else {
                float f13 = this.my;
                if (f13 > 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f13), 1073741824);
                }
            }
        } else {
            float f14 = this.f20032cm;
            if (f14 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f14))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f15 = this.my;
                if (f15 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f15))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVarSe;
        super.onWindowFocusChanged(z10);
        if (this.f20035qk == z10 || (xykVar = this.f20034jj) == null || (jpoVarSe = xykVar.se()) == null) {
            return;
        }
        jpoVarSe.f19923rv.jd(z10);
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.xyk xykVar) {
        this.f20034jj = xykVar;
    }

    public void setWidthAndHeightRatio(float f10) {
        this.f20032cm = f10;
    }

    public void setWidthOrHeightInParentRatio(float f10) {
        this.my = f10;
    }

    public void jpo() {
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = this.wqx;
        if (wqxVar != null) {
            wqxVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
