package com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.wqx.zz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements View.OnTouchListener {

    /* renamed from: cm, reason: collision with root package name */
    private boolean f18310cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18311jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk f18312jj;
    private float jpo;
    private zz my;
    private long wqx;

    public jd(zz zzVar, com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar) {
        this.my = zzVar;
        this.f18312jj = xykVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.wqx = System.currentTimeMillis();
            this.jpo = motionEvent.getX();
            this.f18311jd = motionEvent.getY();
            this.my.my();
        } else if (action != 1) {
            if (action == 2) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.jpo) >= com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), 10.0f) || Math.abs(y10 - this.f18311jd) >= com.bytedance.sdk.component.adexpress.cm.qk.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), 10.0f)) {
                    this.f18310cm = true;
                    this.my.jj();
                }
            }
        } else {
            if (this.f18310cm) {
                return false;
            }
            if (System.currentTimeMillis() - this.wqx >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar = this.f18312jj;
                if (xykVar != null) {
                    xykVar.jpo();
                }
            } else {
                this.my.jj();
            }
        }
        return true;
    }
}
