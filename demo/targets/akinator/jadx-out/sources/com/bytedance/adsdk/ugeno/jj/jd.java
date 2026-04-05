package com.bytedance.adsdk.ugeno.jj;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo<com.bytedance.adsdk.ugeno.jd.wqx> {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cm f17846cm;

    public jd(Context context) {
        super(context);
    }

    public void jpo(com.bytedance.adsdk.ugeno.cm cmVar) {
        this.f17846cm = cmVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17846cm;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17846cm;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17846cm;
        if (cmVar != null) {
            cmVar.jj();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.cm cmVar2 = this.f17846cm;
        if (cmVar2 != null) {
            cmVar2.jpo(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17846cm;
        if (cmVar != null) {
            int[] iArrJpo = cmVar.jpo(i10, i11);
            super.onMeasure(iArrJpo[0], iArrJpo[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        com.bytedance.adsdk.ugeno.cm cmVar2 = this.f17846cm;
        if (cmVar2 != null) {
            cmVar2.my();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17846cm;
        if (cmVar != null) {
            cmVar.jd(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // com.bytedance.adsdk.ugeno.jj.jpo
    public View yd(int i10) {
        return ((com.bytedance.adsdk.ugeno.jd.wqx) this.jpo.get(i10)).ju();
    }
}
