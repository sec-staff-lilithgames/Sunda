package com.bytedance.adsdk.ugeno.zz.jj;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.cm;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.jpo.qk;
import com.bytedance.adsdk.ugeno.jpo.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends TextView implements IAnimation, qk {

    /* renamed from: cm, reason: collision with root package name */
    private float f18095cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18096jd;

    /* renamed from: jj, reason: collision with root package name */
    private float f18097jj;
    private cm jpo;
    private float my;

    /* renamed from: qk, reason: collision with root package name */
    private float f18098qk;
    private xyk wqx;

    public jpo(Context context) {
        super(context);
        this.f18095cm = -1.0f;
        this.f18097jj = 1.0f;
        this.f18098qk = 0.0f;
        this.wqx = new xyk(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.jd(canvas);
        }
    }

    public float getBorderRadius() {
        return this.wqx.jpo();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.jpo.qk
    public float getRipple() {
        return this.f18096jd;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getRubIn() {
        return this.wqx.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getShine() {
        return this.wqx.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getStretch() {
        return this.wqx.getStretch();
    }

    public void jpo(cm cmVar) {
        this.jpo = cmVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.jpo(canvas, this);
            this.jpo.jpo(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.jpo(i10, i11, i12, i13);
        }
        if (z10 && this.f18095cm > 0.0f) {
            jpo(((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        cm cmVar = this.jpo;
        if (cmVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrJpo = cmVar.jpo(i10, i11);
            super.onMeasure(iArrJpo[0], iArrJpo[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.jd(i10, i11, i12, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.wqx.jpo(i10);
    }

    public void setBorderRadius(float f10) {
        xyk xykVar = this.wqx;
        if (xykVar != null) {
            xykVar.jpo(f10);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f18097jj = f11;
        this.f18098qk = f10;
    }

    public void setMinTextSize(float f10) {
        this.f18095cm = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.f18096jd = f10;
        xyk xykVar = this.wqx;
        if (xykVar != null) {
            xykVar.jd(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        xyk xykVar = this.wqx;
        if (xykVar != null) {
            xykVar.my(f10);
        }
    }

    public void setShine(float f10) {
        xyk xykVar = this.wqx;
        if (xykVar != null) {
            xykVar.wqx(f10);
        }
    }

    public void setStretch(float f10) {
        xyk xykVar = this.wqx;
        if (xykVar != null) {
            xykVar.cm(f10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        this.my = getTextSize();
    }

    private void jpo(int i10, int i11) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i11 <= 0 || i10 <= 0 || this.my == 0.0f) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.my;
        int iJpo = jpo(text, paint, i10, fMax);
        while (iJpo > i11 && fMax > this.f18095cm) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.f18095cm);
            fMax = Math.max(fMax - 1.0f, this.f18095cm);
            iJpo = jpo(text, paint, i10, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.f18098qk, this.f18097jj);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.my = getTextSize();
    }

    private int jpo(CharSequence charSequence, TextPaint textPaint, int i10, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.f18097jj, this.f18098qk, true).getHeight();
    }
}
