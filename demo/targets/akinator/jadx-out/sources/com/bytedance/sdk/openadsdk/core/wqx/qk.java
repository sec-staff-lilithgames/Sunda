package com.bytedance.sdk.openadsdk.core.wqx;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.utils.hna;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class qk extends wqx {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.p000if.jpo f21003jd;
    private final String jpo;
    private wqx wqx;

    public qk(String str, com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVar) {
        this(str, jpoVar, null);
    }

    public void jpo(wqx wqxVar) {
        this.wqx = wqxVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.wqx, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public qk(String str, com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVar, wqx wqxVar) {
        this.jpo = str;
        this.f21003jd = jpoVar;
        this.wqx = wqxVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.wqx
    public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVar = this.f21003jd;
        if (jpoVar != null) {
            jpoVar.my(this.jpo);
        }
        if (view != null) {
            if (view.getId() == hna.wqx) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == hna.f21544qk) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.jpo);
            }
        }
        wqx wqxVar = this.wqx;
        if (wqxVar != null) {
            wqxVar.hmu = this.hmu;
            wqxVar.f21010nq = this.f21010nq;
            wqxVar.f21013se = this.f21013se;
            int i10 = this.f21013se;
            wqxVar.f21008hx = i10;
            wqxVar.pdm = i10;
            wqxVar.jpo(view, f10, f11, f12, f13, sparseArray, z10);
        }
    }
}
