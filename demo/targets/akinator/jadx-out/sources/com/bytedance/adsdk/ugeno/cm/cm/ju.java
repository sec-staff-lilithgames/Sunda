package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.qk.zz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends wqx implements zz.jpo {

    /* renamed from: au, reason: collision with root package name */
    private Handler f17674au;

    /* renamed from: if, reason: not valid java name */
    private boolean f27if;

    /* renamed from: ju, reason: collision with root package name */
    private int f17675ju;

    public ju(Context context) {
        super(context);
        this.f17675ju = 500;
        this.f17674au = new com.bytedance.adsdk.ugeno.qk.zz(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.f17675ju = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("delay"), 500);
        return jpo(this.f17681jd, motionEvent);
    }

    private boolean jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.cm.ju juVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17674au.sendEmptyMessageDelayed(1102, this.f17675ju);
        } else {
            if (action == 1) {
                if (this.f27if && (juVar = this.jpo) != null) {
                    juVar.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
                    this.f27if = false;
                    Handler handler = this.f17674au;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.f17674au;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.f27if = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.f17674au;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.f27if = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.qk.zz.jpo
    public void jpo(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.f27if = true;
        Handler handler = this.f17674au;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
