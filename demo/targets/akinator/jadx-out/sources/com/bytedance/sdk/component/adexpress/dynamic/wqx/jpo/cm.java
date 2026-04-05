package com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements View.OnTouchListener {

    /* renamed from: cm, reason: collision with root package name */
    private float f18304cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18305jd;

    /* renamed from: jj, reason: collision with root package name */
    private float f18306jj;
    private float jpo;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f18307ju;
    private boolean my = true;

    /* renamed from: qk, reason: collision with root package name */
    private float f18308qk;
    private float wqx;
    private boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f18309yd;
    private com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk zz;

    public cm(com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar, int i10, boolean z10) {
        this.zz = xykVar;
        this.f18309yd = i10;
        this.f18307ju = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar;
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar2;
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.jpo = motionEvent.getX();
            this.f18305jd = motionEvent.getY();
            this.f18306jj = motionEvent.getY();
            this.my = true;
        } else if (action != 1) {
            if (action == 2) {
                float y10 = motionEvent.getY();
                this.f18308qk = y10;
                if (Math.abs(y10 - this.f18306jj) > 10.0f) {
                    this.xyk = true;
                }
                this.f18304cm = motionEvent.getX();
                this.wqx = motionEvent.getY();
                if (Math.abs(this.f18304cm - this.jpo) > 8.0f || Math.abs(this.wqx - this.f18305jd) > 8.0f) {
                    this.my = false;
                }
            }
        } else {
            if (!this.xyk && !this.my) {
                return false;
            }
            if (this.f18307ju || (xykVar3 = this.zz) == null) {
                int iJd = com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), Math.abs(this.f18308qk - this.f18306jj));
                if (this.f18308qk - this.f18306jj < 0.0f && iJd > this.f18309yd && (xykVar2 = this.zz) != null) {
                    xykVar2.jpo();
                } else if (this.my && (xykVar = this.zz) != null) {
                    xykVar.jpo();
                }
            } else {
                xykVar3.jpo();
            }
        }
        return true;
    }
}
