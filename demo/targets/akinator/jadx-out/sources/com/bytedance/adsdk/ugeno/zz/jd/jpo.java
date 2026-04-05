package com.bytedance.adsdk.ugeno.zz.jd;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.cm;
import com.bytedance.adsdk.ugeno.core.au;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends FrameLayout {

    /* renamed from: jd, reason: collision with root package name */
    private Map<Integer, au> f18086jd;
    private cm jpo;

    public jpo(Context context) {
        super(context);
    }

    public void jpo(cm cmVar) {
        this.jpo = cmVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, au> map = this.f18086jd;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.jj();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        cm cmVar2 = this.jpo;
        if (cmVar2 != null) {
            cmVar2.jpo(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        cm cmVar = this.jpo;
        if (cmVar != null) {
            int[] iArrJpo = cmVar.jpo(i10, i11);
            super.onMeasure(iArrJpo[0], iArrJpo[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        cm cmVar2 = this.jpo;
        if (cmVar2 != null) {
            cmVar2.my();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.jd(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setEventMap(Map<Integer, au> map) {
        this.f18086jd = map;
    }
}
