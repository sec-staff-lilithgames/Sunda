package com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk implements View.OnTouchListener {
    private static int wqx = 10;

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk f18323cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18324jd;
    private float jpo;
    private int my;

    /* renamed from: jj, reason: collision with root package name */
    private RectF f18325jj = new RectF();

    /* renamed from: qk, reason: collision with root package name */
    private long f18326qk = 0;
    private final int xyk = 200;
    private final int zz = 3;

    /* renamed from: yd, reason: collision with root package name */
    private SoftReference<View> f18327yd = new SoftReference<>(null);

    public qk(com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar, int i10, final ViewGroup viewGroup) {
        this.my = wqx;
        this.f18323cm = xykVar;
        if (i10 > 0) {
            this.my = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.wqx.jpo.qk.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    qk.this.f18327yd = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar;
        com.bytedance.sdk.component.adexpress.dynamic.wqx.xyk xykVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18325jj = jpo(this.f18327yd.get());
            this.jpo = motionEvent.getRawX();
            this.f18324jd = motionEvent.getRawY();
            this.f18326qk = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.f18325jj;
            if (rectF != null && !rectF.contains(this.jpo, this.f18324jd)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.jpo);
            float fAbs2 = Math.abs(rawY - this.f18324jd);
            int iJd = com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), Math.abs(rawX - this.jpo));
            int i10 = wqx;
            if (fAbs < i10 || fAbs2 < i10) {
                if ((System.currentTimeMillis() - this.f18326qk < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (xykVar = this.f18323cm) != null) {
                    xykVar.jpo();
                }
            } else if (rawX > this.jpo && iJd > this.my && (xykVar2 = this.f18323cm) != null) {
                xykVar2.jpo();
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
