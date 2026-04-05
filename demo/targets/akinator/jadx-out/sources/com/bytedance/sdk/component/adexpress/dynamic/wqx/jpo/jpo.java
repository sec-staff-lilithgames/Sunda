package com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements View.OnTouchListener {
    private static int wqx = 10;

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk f18315cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18316jd;
    private float jpo;
    private int my;

    /* renamed from: jj, reason: collision with root package name */
    private RectF f18317jj = new RectF();

    /* renamed from: qk, reason: collision with root package name */
    private long f18318qk = 0;
    private final int xyk = 200;
    private final int zz = 3;

    /* renamed from: yd, reason: collision with root package name */
    private SoftReference<ViewGroup> f18319yd = new SoftReference<>(null);

    public jpo(com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar, int i10, final ViewGroup viewGroup) {
        this.my = wqx;
        this.f18315cm = xykVar;
        if (i10 > 0) {
            this.my = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo.this.f18319yd = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18317jj = jpo(this.f18319yd.get());
            this.jpo = motionEvent.getRawX();
            this.f18316jd = motionEvent.getRawY();
            this.f18318qk = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.f18317jj;
            if (rectF != null && !rectF.contains(this.jpo, this.f18316jd)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.jpo);
            float fAbs2 = Math.abs(rawY - this.f18316jd);
            int i10 = this.my;
            if (fAbs >= i10 && fAbs2 >= i10) {
                com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar2 = this.f18315cm;
                if (xykVar2 != null) {
                    xykVar2.jpo();
                }
            } else if ((System.currentTimeMillis() - this.f18318qk < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (xykVar = this.f18315cm) != null) {
                xykVar.jpo();
            }
        }
        return true;
    }

    private RectF jpo(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r2, view.getHeight() + iArr[1]);
    }
}
