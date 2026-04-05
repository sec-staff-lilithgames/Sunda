package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.component.reward.jpo.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {

    /* renamed from: cm, reason: collision with root package name */
    private final jpo f19900cm;

    /* renamed from: jd, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.cm f19901jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f19902jj;
    com.bytedance.sdk.openadsdk.component.reward.top.wqx jpo;
    private boolean my = false;
    private final Activity wqx;

    public Cif(jpo jpoVar) {
        this.wqx = jpoVar.vrc;
        this.f19900cm = jpoVar;
    }

    public void cm(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.setShowSkip(z10);
    }

    public void jd(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.jpo;
        if (wqxVar != null) {
            wqxVar.setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.dynamic.cm cmVar = this.f19901jd;
        if (cmVar != null) {
            cmVar.setSoundMute(z10);
        }
    }

    public void jpo() {
        if (this.my) {
            return;
        }
        this.my = true;
        jpo jpoVar = this.f19900cm;
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = jpoVar.f19918kb;
        if (wqxVar != null) {
            this.jpo = wqxVar;
            this.f19902jj = true;
        } else {
            this.jpo = (com.bytedance.sdk.openadsdk.component.reward.top.wqx) jpoVar.f19930va.findViewById(com.bytedance.sdk.openadsdk.utils.hna.bhu);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar2 = this.jpo;
        if (wqxVar2 != null) {
            wqxVar2.jpo(this.f19900cm.f19914jd);
            if (this.f19900cm.f19914jd.ig()) {
                jpo(false);
            } else {
                jpo(this.f19900cm.f19914jd.bl());
            }
        }
    }

    public void my(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.setSkipEnable(z10);
    }

    public void wqx(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.setShowSound(z10);
    }

    public void cm() {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.jpo;
        if (wqxVar != null) {
            wqxVar.clickSkip();
        }
    }

    public void my() {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.setSkipInvisiable();
    }

    public void wqx() {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.showSkipButton();
    }

    public void jd() {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.showCountDownText();
    }

    public void jpo(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.setShowDislike(z10);
    }

    public void jpo(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.setTime(String.valueOf(str), charSequence);
    }

    public void jpo(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar;
        if (this.f19902jj || (wqxVar = this.jpo) == null) {
            return;
        }
        wqxVar.setSkipText(charSequence);
    }

    public void jpo(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.jpo;
        if (wqxVar != null) {
            wqxVar.clickSound(str);
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.component.reward.top.jd jdVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.jpo;
        if (wqxVar != null) {
            wqxVar.setListener(jdVar);
        }
    }

    public void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm cmVar) {
        this.f19901jd = cmVar;
    }

    public void jpo(int i10) {
        View viewFindViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.wqx wqxVar = this.jpo;
        if (wqxVar == null || wqxVar.getITopLayout() == null || i10 == 0 || (viewFindViewById = this.jpo.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int width = i10 - (viewFindViewById.getWidth() + iArr[0]);
        if (width < va.jd(this.wqx, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin = (va.jd(this.wqx, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin;
            viewFindViewById.requestLayout();
        }
    }
}
