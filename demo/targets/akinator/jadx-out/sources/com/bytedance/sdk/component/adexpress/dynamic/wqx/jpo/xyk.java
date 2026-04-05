package com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk implements View.OnTouchListener {

    /* renamed from: cm, reason: collision with root package name */
    private float f18333cm;

    /* renamed from: jd, reason: collision with root package name */
    private final boolean f18334jd;

    /* renamed from: jj, reason: collision with root package name */
    private float f18335jj;
    private final com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk jpo;
    private float my;

    /* renamed from: qk, reason: collision with root package name */
    private float f18336qk;
    private final int wqx = 10;

    public xyk(com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar, boolean z10) {
        this.jpo = xykVar;
        this.f18334jd = z10;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar;
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18333cm = motionEvent.getX();
            this.my = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.my);
        } else if (action == 1) {
            this.f18335jj = motionEvent.getX();
            this.f18336qk = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.f18336qk);
            if (this.f18334jd || (xykVar2 = this.jpo) == null) {
                float f10 = this.f18335jj - this.f18333cm;
                float f11 = this.f18336qk - this.my;
                if (com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), Math.abs((float) Math.sqrt((f11 * f11) + (f10 * f10)))) > 10.0f && (xykVar = this.jpo) != null) {
                    xykVar.jpo();
                }
            } else {
                xykVar2.jpo();
            }
        }
        return true;
    }
}
