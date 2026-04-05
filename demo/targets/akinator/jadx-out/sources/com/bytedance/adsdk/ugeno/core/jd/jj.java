package com.bytedance.adsdk.ugeno.core.jd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.adsdk.ugeno.core.prr;
import com.bytedance.adsdk.ugeno.qk.zz;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj implements zz.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private Context f17718cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f17719jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.jd.wqx f17720jj;
    private boolean jpo;
    private au my;

    /* renamed from: qk, reason: collision with root package name */
    private Handler f17721qk = new zz(Looper.getMainLooper(), this);
    private prr wqx;

    public jj(Context context, au auVar, com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        this.f17718cm = context;
        this.my = auVar;
        this.f17720jj = wqxVar;
    }

    public void jpo(prr prrVar) {
        this.wqx = prrVar;
    }

    public void jpo() {
        au auVar = this.my;
        if (auVar == null) {
            return;
        }
        JSONObject jSONObjectWqx = auVar.wqx();
        try {
            this.f17719jd = Integer.parseInt(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectWqx.optString("interval", "8000"), this.f17720jj.m389if()));
            this.jpo = jSONObjectWqx.optBoolean("repeat");
            this.f17721qk.sendEmptyMessageDelayed(1001, this.f17719jd);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qk.zz.jpo
    public void jpo(Message message) {
        if (message.what != 1001) {
            return;
        }
        prr prrVar = this.wqx;
        if (prrVar != null) {
            au auVar = this.my;
            com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.f17720jj;
            prrVar.jpo(auVar, wqxVar, wqxVar);
        }
        if (this.jpo) {
            this.f17721qk.sendEmptyMessageDelayed(1001, this.f17719jd);
        } else {
            this.f17721qk.removeMessages(1001);
        }
    }
}
