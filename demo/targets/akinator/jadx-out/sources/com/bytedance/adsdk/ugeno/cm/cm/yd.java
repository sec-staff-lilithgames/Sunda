package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.adsdk.ugeno.qk.zz;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends wqx implements zz.jpo {

    /* renamed from: au, reason: collision with root package name */
    private Handler f17687au;

    /* renamed from: if, reason: not valid java name */
    private int f30if;

    /* renamed from: ju, reason: collision with root package name */
    private int f17688ju;
    private int oya;

    public yd(Context context) {
        super(context);
        this.f30if = 0;
        this.f17687au = new com.bytedance.adsdk.ugeno.qk.zz(Looper.getMainLooper(), this);
        this.oya = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        Map<String, String> map = this.my;
        if (map != null) {
            int iJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(map.get("loop"), 0);
            this.f17688ju = iJpo;
            if (iJpo <= 0) {
                this.oya = -1;
            } else {
                this.oya = iJpo;
            }
            this.f30if = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get(IronSourceConstants.EVENTS_DURATION), 0);
        }
        this.f17687au.sendEmptyMessageDelayed(1001, this.f30if);
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.qk.zz.jpo
    public void jpo(Message message) {
        int i10;
        int i11;
        if (message.what != 1001) {
            return;
        }
        Log.d("UGBaseEventMonitor", "handleMsg: execute timer event" + this.oya);
        this.jpo.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
        int i12 = this.oya + (-1);
        this.oya = i12;
        if (i12 < 0 && (i11 = this.f30if) != 0) {
            this.f17687au.sendEmptyMessageDelayed(1001, i11);
        } else if (i12 > 0 && (i10 = this.f30if) != 0) {
            this.f17687au.sendEmptyMessageDelayed(1001, i10);
        } else {
            this.f17687au.removeMessages(1001);
        }
    }
}
