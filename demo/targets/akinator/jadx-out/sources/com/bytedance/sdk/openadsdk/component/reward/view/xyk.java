package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.jpo.prr;
import com.bytedance.sdk.openadsdk.component.reward.jpo.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: cm, reason: collision with root package name */
    private sq f20051cm;

    /* renamed from: jd, reason: collision with root package name */
    private RFEndCardBackUpLayout f20052jd;
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpo;
    private boolean my;
    private boolean wqx;

    public xyk(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.jpo = jpoVar;
    }

    public void cm() {
        sq sqVar = this.f20051cm;
        if (sqVar != null) {
            sqVar.jd();
        }
    }

    public void jd() {
        this.my = true;
        va.jpo((View) this.f20052jd, 0);
    }

    public void jpo() {
        if (this.wqx) {
            return;
        }
        this.wqx = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.jpo.f19930va.findViewById(hna.gmx);
        this.f20052jd = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.jpo);
        }
        if (this.jpo.f19914jd.ig()) {
            this.f20051cm = new sq(this.jpo);
        }
    }

    public boolean my() {
        return this.my;
    }

    public void wqx() {
        sq sqVar = this.f20051cm;
        if (sqVar != null) {
            sqVar.jpo();
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.my myVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.f20052jd;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        va.jpo(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.xyk.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        sq sqVar = this.f20051cm;
        if (sqVar != null) {
            sqVar.jpo(myVar);
        }
    }

    public boolean jpo(prr prrVar) {
        this.my = true;
        sq sqVar = this.f20051cm;
        if (sqVar == null || !sqVar.jpo(prrVar)) {
            return false;
        }
        va.jpo((View) this.f20052jd, 0);
        return true;
    }

    public void jpo(int i10) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.f20052jd;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i10);
    }
}
