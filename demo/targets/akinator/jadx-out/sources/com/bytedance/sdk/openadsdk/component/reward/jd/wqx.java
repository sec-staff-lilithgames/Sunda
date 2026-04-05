package com.bytedance.sdk.openadsdk.component.reward.jd;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.zz;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jd {
    public wqx(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        super(jpoVar);
    }

    private void jd(zz zzVar) {
        if (zzVar == null) {
            return;
        }
        Context context = zzVar.getContext();
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setOrientation(1);
        zzVar.addView(myVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar.setId(hna.kln);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        myVar.addView(wqxVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar2.setId(hna.f21562yd);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        wqxVar.addView(wqxVar2, layoutParams2);
        wqxVar2.addView(jd.jpo(context));
        if (this.f19843jd.iqh() != 3 && this.f19843jd.iqh() != 5) {
            com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
            cmVar.setId(hna.jfy);
            cmVar.setVisibility(8);
            cmVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jpo());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(va.jd(context, 28.0f), va.jd(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = va.jd(context, 20.0f);
            layoutParams3.bottomMargin = va.jd(context, 10.0f);
            wqxVar.addView(cmVar, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar3 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar3.setId(hna.f21532jr);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 0.0f;
        myVar.addView(wqxVar3, layoutParams4);
        wqxVar3.addView(cm.jpo(context, this.jpo.f19914jd));
        com.bytedance.sdk.openadsdk.component.reward.view.jj.jpo(wqxVar3, this.f19843jd);
        com.bytedance.sdk.openadsdk.component.reward.view.jj.jpo(wqxVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public boolean jj() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void jpo(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public boolean my() {
        return false;
    }

    public static boolean jpo(dt dtVar) {
        nmd.wqx(dtVar);
        return nmd.wqx(dtVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void jpo(zz zzVar) {
        jd(zzVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void qk() {
    }
}
