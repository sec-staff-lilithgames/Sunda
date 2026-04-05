package com.bytedance.sdk.openadsdk.wqx;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.sdk.openadsdk.core.jj.xyk {

    /* renamed from: cm, reason: collision with root package name */
    private int f21636cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f21637jd;
    private Paint jpo;
    private boolean wqx;

    public jpo(Context context) {
        super(context);
        jpo();
    }

    private void jpo() {
        this.f21637jd = va.jpo(getContext(), 8.0f);
        this.jpo = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        jpo(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj.xyk, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f21636cm = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.f21636cm);
        } else {
            layoutParams.height = this.f21636cm;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jj.xyk, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.f21636cm;
        if (i10 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i10;
    }

    public void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.f21637jd = f10;
    }

    private void jpo(String str, int i10) {
        if (!this.wqx && i10 > 0) {
            float textSize = getTextSize();
            this.jpo.set(getPaint());
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            float fJpo = jpo(textSize, str);
            while (fJpo > paddingLeft) {
                textSize -= 1.0f;
                this.jpo.setTextSize(textSize);
                if (textSize <= this.f21637jd) {
                    break;
                } else {
                    fJpo = jpo(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.wqx = true;
        }
    }

    private float jpo(float f10, String str) {
        this.jpo.setTextSize(f10);
        return this.jpo.measureText(str);
    }
}
