package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.cm.au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends wqx {

    /* renamed from: au, reason: collision with root package name */
    private boolean f17689au;

    /* renamed from: if, reason: not valid java name */
    private float f31if;

    /* renamed from: ju, reason: collision with root package name */
    private float f17690ju;
    private com.bytedance.adsdk.ugeno.core.jd.jpo oya;
    private au prr;

    public zz(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar = this.f17681jd;
        if (wqxVar != null && wqxVar.dn() && this.oya == null) {
            this.oya = new com.bytedance.adsdk.ugeno.core.jd.jpo();
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        au auVar = this.prr;
        return auVar != null ? auVar.jpo(this.f17681jd, motionEvent, this.jpo, this) : jpo(this.f17681jd, motionEvent);
    }

    public boolean jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.core.jd.jpo jpoVar = this.oya;
        if (jpoVar != null) {
            if (jpoVar.jpo(motionEvent)) {
                Log.d("GesThrough_UGTapEvent", "mockEvent，skip");
                return false;
            }
            this.oya.jpo(wqxVar, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f17690ju = motionEvent.getRawX();
            this.f31if = motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(rawX - this.f17690ju) >= 15.0f || Math.abs(rawY - this.f31if) >= 15.0f) {
                    this.f17689au = true;
                }
            } else if (action == 3) {
                this.f17689au = false;
            }
        } else {
            if (this.f17689au) {
                this.f17689au = false;
                this.f17690ju = 0.0f;
                this.f31if = 0.0f;
                if (this.oya != null) {
                    Log.d("GesThrough_UGTapEvent", "Non-tap event, need gesture through");
                    this.oya.jpo(wqxVar);
                }
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.f17690ju) < 15.0f && Math.abs(rawY2 - this.f31if) < 15.0f) {
                Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
                com.bytedance.adsdk.ugeno.cm.ju juVar = this.jpo;
                if (juVar != null) {
                    juVar.jpo(wqxVar, this.f17682jj, this.wqx.jd());
                    this.f17690ju = 0.0f;
                    this.f31if = 0.0f;
                    return true;
                }
            } else {
                this.f17689au = false;
                if (this.oya != null) {
                    Log.d("GesThrough_UGTapEvent", "Non-tap event, need gesture through");
                    this.oya.jpo(wqxVar);
                }
            }
        }
        return true;
    }

    public void jpo(au auVar) {
        this.prr = auVar;
    }
}
