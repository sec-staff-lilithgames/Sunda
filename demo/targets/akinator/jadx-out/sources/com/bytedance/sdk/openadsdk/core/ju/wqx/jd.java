package com.bytedance.sdk.openadsdk.core.ju.wqx;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.sq;
import com.bytedance.sdk.openadsdk.core.zz.prr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ju.wqx.jpo f20564cm;

    /* renamed from: jd, reason: collision with root package name */
    private Context f20565jd;
    private wqx jpo;
    private final boolean my;
    private dt wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        public static wqx jpo(Context context, dt dtVar, boolean z10) {
            if (sq.jpo(dtVar, z10)) {
                return new cm(context, dtVar, z10);
            }
            return null;
        }
    }

    public jd(Context context, dt dtVar) {
        this(context, dtVar, false);
    }

    public void cm() {
        wqx wqxVar = this.jpo;
        if (wqxVar != null) {
            wqxVar.wqx();
        }
    }

    public void jd() {
        wqx wqxVar = this.jpo;
        if (wqxVar != null) {
            wqxVar.jd();
        }
    }

    public void jpo(prr prrVar) {
        wqx wqxVarJpo = jpo.jpo(this.f20565jd, this.wqx, this.my);
        this.jpo = wqxVarJpo;
        if (wqxVarJpo != null) {
            wqxVarJpo.jpo();
            this.jpo.jpo(prrVar);
        }
    }

    public View wqx() {
        wqx wqxVar = this.jpo;
        if (wqxVar != null) {
            return wqxVar.cm();
        }
        return null;
    }

    public jd(Context context, dt dtVar, boolean z10) {
        this.f20565jd = context;
        this.wqx = dtVar;
        this.my = z10;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.ju.wqx.jpo jpoVar) {
        this.f20564cm = jpoVar;
        wqx wqxVar = this.jpo;
        if (wqxVar != null) {
            wqxVar.jpo(jpoVar);
        }
    }

    public void jpo(int i10) {
        ef efVarMy;
        wqx wqxVar = this.jpo;
        if (!(wqxVar instanceof cm) || (efVarMy = ((cm) wqxVar).my()) == null || efVarMy.jpo() == null) {
            return;
        }
        efVarMy.jpo().jpo(i10);
    }

    public wqx jpo() {
        return this.jpo;
    }
}
