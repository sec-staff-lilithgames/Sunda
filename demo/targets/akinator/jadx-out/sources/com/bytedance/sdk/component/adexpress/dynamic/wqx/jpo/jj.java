package com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj implements View.OnTouchListener {
    private static int wqx = 10;

    /* renamed from: cm, reason: collision with root package name */
    private boolean f18313cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18314jd;
    private float jpo;
    private com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk my;

    public jj(com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar) {
        this.my = xykVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.jpo = motionEvent.getX();
            this.f18314jd = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.jpo) >= wqx || Math.abs(y10 - this.f18314jd) >= wqx) {
                    this.f18313cm = true;
                }
            } else if (action == 3) {
                this.f18313cm = false;
            }
        } else {
            if (this.f18313cm) {
                this.f18313cm = false;
                return false;
            }
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (Math.abs(x11 - this.jpo) >= wqx || Math.abs(y11 - this.f18314jd) >= wqx) {
                this.f18313cm = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar = this.my;
                if (xykVar != null) {
                    xykVar.jpo();
                }
            }
        }
        return true;
    }
}
