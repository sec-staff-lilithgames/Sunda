package com.bytedance.sdk.openadsdk.component.reward.jd;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.Cif;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.zz;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.oya;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jd {
    public cm(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        super(jpoVar);
    }

    private static LinearLayout jd(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setId(hna.f21546rq);
        myVar.setOrientation(1);
        myVar.setVisibility(8);
        myVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return myVar;
    }

    public static boolean jpo(dt dtVar) {
        return nmd.jd(dtVar) || nmd.cm(dtVar) || nmd.qk(dtVar);
    }

    private static ImageView wqx(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setScaleType(ImageView.ScaleType.FIT_XY);
        cmVar.setImageResource(com.bytedance.sdk.component.utils.dt.cm(context, "tt_up_slide"));
        cmVar.setId(hna.f21553tu);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(va.jd(context, 18.0f), va.jd(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = va.jd(context, 45.0f);
        cmVar.setLayoutParams(layoutParams);
        return cmVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void au() {
        Cif cif;
        nmd nmdVar;
        if (nmd.jd(this.jpo.f19914jd) && (cif = this.jpo.tic) != null && (nmdVar = cif.prr) != null) {
            if (nmdVar.cm()) {
                this.jpo.tic.jd(0);
                this.jpo.hna.set(true);
            } else {
                this.jpo.f19926sq.set(true);
                jpo(true, false, true, 80);
            }
        }
        if (nmd.cm(this.jpo.f19914jd) || nmd.qk(this.jpo.f19914jd)) {
            jpo(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public boolean jj() {
        if (nmd.jd(this.jpo.f19914jd)) {
            return true;
        }
        return (nmd.cm(this.jpo.f19914jd) || nmd.qk(this.jpo.f19914jd)) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public boolean my() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public RFEndCardBackUpLayout xyk() {
        return null;
    }

    public static void jpo(dt dtVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        if (nmd.jd(dtVar)) {
            jpo(frameLayout, dtVar);
        } else if (nmd.cm(dtVar) || nmd.qk(dtVar)) {
            jd(frameLayout, dtVar);
        } else {
            jd.jpo(frameLayout, jpoVar);
        }
    }

    public static void jd(FrameLayout frameLayout, dt dtVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar.setId(hna.f21532jr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = va.jd(sq.jpo(), 58.0f);
        frameLayout.addView(wqxVar, layoutParams);
        wqxVar.addView(jpo(context, dtVar));
        LinearLayout linearLayoutJd = jd(context);
        linearLayoutJd.setBackgroundColor(Color.parseColor("#99161823"));
        wqxVar.addView(linearLayoutJd);
        linearLayoutJd.addView(wqx(context));
        com.bytedance.sdk.openadsdk.component.reward.view.jj.jpo(wqxVar, dtVar);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar2.setId(hna.kln);
        frameLayout.addView(wqxVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar3 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar3.setId(hna.f21562yd);
        wqxVar2.addView(wqxVar3, new FrameLayout.LayoutParams(-1, -1));
        wqxVar3.addView(jd.jpo(context));
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar4 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar4.setId(hna.f21551sq);
        wqxVar4.setVisibility(8);
        wqxVar4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        wqxVar3.addView(wqxVar4, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setId(hna.opi);
        cmVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wqxVar4.addView(cmVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.jj.jpo(wqxVar2);
    }

    public static void jpo(FrameLayout frameLayout, dt dtVar) {
        Context context = frameLayout.getContext();
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setOrientation(1);
        frameLayout.addView(myVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar.setId(hna.kln);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        myVar.addView(wqxVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar2.setId(hna.f21562yd);
        wqxVar.addView(wqxVar2, new FrameLayout.LayoutParams(-1, -1));
        wqxVar2.addView(jd.jpo(context));
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar3 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar3.setId(hna.f21551sq);
        wqxVar3.setVisibility(8);
        wqxVar3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        wqxVar2.addView(wqxVar3, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setId(hna.opi);
        cmVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        wqxVar3.addView(cmVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.jj.jpo(wqxVar);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar4 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        wqxVar4.setId(hna.f21532jr);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        myVar.addView(wqxVar4, layoutParams3);
        wqxVar4.addView(jpo(context, dtVar));
        LinearLayout linearLayoutJd = jd(context);
        linearLayoutJd.setBackgroundColor(Color.parseColor("#70161823"));
        wqxVar4.addView(linearLayoutJd);
        linearLayoutJd.addView(wqx(context));
        com.bytedance.sdk.openadsdk.component.reward.view.jj.jpo(wqxVar4, dtVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void qk() {
    }

    public static com.bytedance.sdk.component.zz.jj jpo(Context context, dt dtVar) {
        com.bytedance.sdk.component.zz.jj jjVarJd = com.bytedance.sdk.openadsdk.au.jpo.jpo().jd(dtVar);
        if (jjVarJd != null) {
            jjVarJd.setLpPreRender(true);
            ViewGroup viewGroup = (ViewGroup) jjVarJd.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(jjVarJd);
            }
        } else {
            jjVarJd = new com.bytedance.sdk.component.zz.jj(context, true);
            jjVarJd.setLayerType(2, null);
        }
        va.jpo((View) jjVarJd, 0);
        jjVarJd.setId(hna.nmd);
        jjVarJd.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return jjVarJd;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void jpo(zz zzVar) {
        jpo(this.f19843jd, zzVar, this.jpo);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void jpo(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar;
        oya oyaVar;
        if (!nmd.cm(this.jpo.f19914jd) || this.jpo.f19914jd.va() || (oyaVar = (jpoVar = this.jpo).aix) == null) {
            return;
        }
        oyaVar.jpo(jpoVar.f19914jd.nmd().jd() * 1000);
    }
}
