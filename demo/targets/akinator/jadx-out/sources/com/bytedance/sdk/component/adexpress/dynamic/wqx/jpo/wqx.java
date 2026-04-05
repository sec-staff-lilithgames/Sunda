package com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements View.OnTouchListener {

    /* renamed from: cm, reason: collision with root package name */
    private float f18329cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18330jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk f18331jj;
    private float jpo;
    private boolean my;

    /* renamed from: qk, reason: collision with root package name */
    private int f18332qk;
    private float wqx;
    private boolean xyk;
    private boolean zz;

    public wqx(com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar) {
        this(xykVar, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar;
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar2;
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar3;
        if (this.zz) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.jpo = motionEvent.getX();
            this.f18330jd = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.f18329cm = motionEvent.getX();
                this.wqx = motionEvent.getY();
                if (Math.abs(this.f18329cm - this.jpo) > 10.0f) {
                    this.my = true;
                }
                if (Math.abs(this.f18329cm - this.jpo) > 8.0f || Math.abs(this.wqx - this.f18330jd) > 8.0f) {
                    this.xyk = false;
                }
                int iJd = com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), Math.abs(this.f18329cm - this.jpo));
                if (this.f18329cm > this.jpo && iJd > this.f18332qk && (xykVar3 = this.f18331jj) != null) {
                    xykVar3.jpo();
                    this.zz = true;
                }
            }
        } else {
            if (!this.my && !this.xyk) {
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int iJd2 = com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), Math.abs(this.f18329cm - this.jpo));
            if (this.f18329cm > this.jpo && iJd2 > this.f18332qk && (xykVar2 = this.f18331jj) != null) {
                xykVar2.jpo();
                this.zz = true;
            }
            float fAbs = Math.abs(x10 - this.jpo);
            float fAbs2 = Math.abs(y10 - this.f18330jd);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (xykVar = this.f18331jj) != null) {
                xykVar.jd();
                this.zz = true;
            }
        }
        return true;
    }

    public wqx(com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar, int i10) {
        this.f18332qk = 5;
        this.xyk = true;
        this.f18331jj = xykVar;
        if (i10 > 0) {
            this.f18332qk = i10;
        }
    }
}
