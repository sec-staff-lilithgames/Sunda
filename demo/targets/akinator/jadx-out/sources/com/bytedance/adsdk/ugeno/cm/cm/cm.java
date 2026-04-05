package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends wqx implements com.bytedance.adsdk.ugeno.cm.jpo.cm {

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cm.jpo.wqx f17671ju;

    public cm(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        com.bytedance.adsdk.ugeno.cm.jpo.jpo jpoVarVrc = this.f17681jd.vrc();
        if (jpoVarVrc == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.cm.jpo.wqx wqxVarJpo = jpoVarVrc.jpo(this.f17682jj);
        this.f17671ju = wqxVarJpo;
        if (wqxVarJpo != null) {
            wqxVarJpo.jpo(this);
            return false;
        }
        jpoVarVrc.jpo(this.f17682jj, new com.bytedance.adsdk.ugeno.cm.jpo.jd());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jpo.cm
    public void jpo(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.jpo.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
    }
}
