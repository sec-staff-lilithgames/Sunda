package com.bytedance.adsdk.ugeno.core.jd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.adsdk.ugeno.core.prr;
import com.bytedance.adsdk.ugeno.core.yd;
import com.bytedance.adsdk.ugeno.qk.zz;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements zz.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private au f17715cm;

    /* renamed from: jd, reason: collision with root package name */
    private prr f17716jd;

    /* renamed from: jj, reason: collision with root package name */
    private Handler f17717jj = new zz(Looper.getMainLooper(), this);
    private int jpo;
    private com.bytedance.adsdk.ugeno.jd.wqx my;
    private Context wqx;

    public jd(Context context, au auVar, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        this.wqx = context;
        this.f17715cm = auVar;
        this.my = wqxVar;
    }

    public void jpo(prr prrVar) {
        this.f17716jd = prrVar;
    }

    public void jpo() {
        au auVar = this.f17715cm;
        if (auVar == null) {
            return;
        }
        try {
            int i10 = Integer.parseInt(com.bytedance.adsdk.ugeno.wqx.jd.jpo(auVar.wqx().optString("delay"), this.my.m389if()));
            this.jpo = i10;
            this.f17717jj.sendEmptyMessageDelayed(1001, i10);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qk.zz.jpo
    public void jpo(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectWqx = this.f17715cm.wqx();
        if (TextUtils.equals(jSONObjectWqx.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectWqx.optString("nodeId");
            com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.my;
            com.bytedance.adsdk.ugeno.jd.wqx wqxVarCm = wqxVar.jd(wqxVar).cm(strOptString);
            new yd(wqxVarCm.ju(), com.bytedance.adsdk.ugeno.core.jpo.jpo(jSONObjectWqx.optJSONObject("animatorSet"), wqxVarCm)).jpo();
        } else {
            prr prrVar = this.f17716jd;
            if (prrVar != null) {
                au auVar = this.f17715cm;
                com.bytedance.adsdk.ugeno.jd.wqx wqxVar2 = this.my;
                prrVar.jpo(auVar, wqxVar2, wqxVar2);
            }
        }
        this.f17717jj.removeMessages(1001);
    }
}
