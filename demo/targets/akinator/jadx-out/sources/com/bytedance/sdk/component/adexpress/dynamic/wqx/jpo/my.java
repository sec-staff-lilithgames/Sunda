package com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my implements View.OnTouchListener {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk f18321cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18322jd;
    private float jpo;
    private int my;
    private boolean wqx;

    public my(com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar, int i10) {
        this.f18321cm = xykVar;
        this.my = i10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.jpo = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f18322jd = y10;
                if (Math.abs(y10 - this.jpo) > 10.0f) {
                    this.wqx = true;
                }
            }
        } else {
            if (!this.wqx) {
                return false;
            }
            int iJd = com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), Math.abs(this.f18322jd - this.jpo));
            if (this.f18322jd - this.jpo < 0.0f && iJd > this.my && (xykVar = this.f18321cm) != null) {
                xykVar.jpo();
                this.jpo = 0.0f;
                this.f18322jd = 0.0f;
                this.wqx = false;
            }
        }
        return true;
    }
}
