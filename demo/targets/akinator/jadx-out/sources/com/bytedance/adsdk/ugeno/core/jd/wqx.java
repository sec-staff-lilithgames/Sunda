package com.bytedance.adsdk.ugeno.core.jd;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.adsdk.ugeno.core.prr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private Context f17731cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f17732jd;

    /* renamed from: jj, reason: collision with root package name */
    private final int f17733jj;
    private float jpo;
    private boolean my;
    private au wqx;

    public wqx(Context context, au auVar) {
        this.f17731cm = context;
        this.wqx = auVar;
        this.f17733jj = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean jpo(prr prrVar, com.bytedance.adsdk.ugeno.jd.wqx wqxVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.jpo = motionEvent.getX();
            this.f17732jd = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.jpo) >= this.f17733jj || Math.abs(y10 - this.f17732jd) >= this.f17733jj) {
                    this.my = true;
                }
            } else if (action == 3) {
                this.my = false;
            }
        } else {
            if (this.my) {
                this.my = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.jpo) >= this.f17733jj || Math.abs(y11 - this.f17732jd) >= this.f17733jj) {
                this.my = false;
            } else if (prrVar != null) {
                prrVar.jpo(this.wqx, wqxVar, wqxVar);
                return true;
            }
        }
        return true;
    }
}
