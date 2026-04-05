package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends View {

    /* renamed from: au, reason: collision with root package name */
    private float f18418au;

    /* renamed from: cm, reason: collision with root package name */
    private int f18419cm;

    /* renamed from: if, reason: not valid java name */
    private float f58if;

    /* renamed from: jd, reason: collision with root package name */
    private int f18420jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18421jj;
    private int jpo;

    /* renamed from: ju, reason: collision with root package name */
    private Paint f18422ju;
    private float my;
    private int oya;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f18423qk;
    private float wqx;
    private List<Integer> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private Paint f18424yd;
    private List<Integer> zz;

    public cm(Context context) {
        this(context, null);
    }

    private void wqx() {
        Paint paint = new Paint();
        this.f18424yd = paint;
        paint.setAntiAlias(true);
        this.f18424yd.setStrokeWidth(this.oya);
        this.xyk.add(255);
        this.zz.add(0);
        Paint paint2 = new Paint();
        this.f18422ju = paint2;
        paint2.setAntiAlias(true);
        this.f18422ju.setColor(Color.parseColor("#0FFFFFFF"));
        this.f18422ju.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void jd() {
        this.f18423qk = false;
        this.zz.clear();
        this.xyk.clear();
        this.xyk.add(255);
        this.zz.add(0);
        invalidate();
    }

    public void jpo() {
        this.f18423qk = true;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f18424yd.setShader(new LinearGradient(this.f58if, 0.0f, this.f18418au, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            if (i10 >= this.xyk.size()) {
                break;
            }
            Integer num = this.xyk.get(i10);
            this.f18424yd.setAlpha(num.intValue());
            Integer num2 = this.zz.get(i10);
            if (this.wqx + num2.intValue() < this.my) {
                canvas.drawCircle(this.f58if, this.f18418au, this.wqx + num2.intValue(), this.f18424yd);
            }
            if (num.intValue() > 0 && num2.intValue() < this.my) {
                this.xyk.set(i10, Integer.valueOf(num.intValue() - this.f18421jj > 0 ? num.intValue() - (this.f18421jj * 3) : 1));
                this.zz.set(i10, Integer.valueOf(num2.intValue() + this.f18421jj));
            }
            i10++;
        }
        if (((Integer) o2.g(1, this.zz)).intValue() >= this.my / this.f18419cm) {
            this.xyk.add(255);
            this.zz.add(0);
        }
        if (this.zz.size() >= 3) {
            this.zz.remove(0);
            this.xyk.remove(0);
        }
        this.f18424yd.setAlpha(255);
        this.f18424yd.setColor(this.f18420jd);
        canvas.drawCircle(this.f58if, this.f18418au, this.wqx, this.f18422ju);
        if (this.f18423qk) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        this.f58if = f10;
        this.f18418au = i11 / 2.0f;
        float f11 = f10 - (this.oya / 2.0f);
        this.my = f11;
        this.wqx = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }

    public void setColor(int i10) {
        this.jpo = i10;
    }

    public void setCoreColor(int i10) {
        this.f18420jd = i10;
    }

    public void setCoreRadius(int i10) {
        this.wqx = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.f18421jj = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.f18419cm = i10;
    }

    public void setMaxWidth(int i10) {
        this.my = i10;
    }

    public cm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public cm(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.jpo = -1;
        this.f18420jd = -65536;
        this.wqx = 18.0f;
        this.f18419cm = 3;
        this.my = 50.0f;
        this.f18421jj = 2;
        this.f18423qk = false;
        this.xyk = new ArrayList();
        this.zz = new ArrayList();
        this.oya = 24;
        wqx();
    }
}
