package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.qk.zz;
import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.ugeno.cm.cm.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends wqx implements zz.jpo {

    /* renamed from: if, reason: not valid java name */
    private Handler f26if;

    /* renamed from: ju, reason: collision with root package name */
    private int f17672ju;

    public Cif(Context context) {
        super(context);
        this.f17672ju = 500;
        this.f26if = new com.bytedance.adsdk.ugeno.qk.zz(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.f17672ju = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("delay"), 500);
        return jpo(this.f17681jd, motionEvent);
    }

    private boolean jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f26if.sendEmptyMessageDelayed(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE, this.f17672ju);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.f26if.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.qk.zz.jpo
    public void jpo(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.cm.ju juVar = this.jpo;
        if (juVar != null) {
            juVar.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
        }
        Handler handler = this.f26if;
        if (handler != null) {
            handler.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        }
    }
}
