package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class xyk extends View {
    private static final int[] jpo = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};

    /* renamed from: cm, reason: collision with root package name */
    private final ArrayList<jpo> f20969cm;

    /* renamed from: jd, reason: collision with root package name */
    private final RectF f20970jd;

    /* renamed from: jj, reason: collision with root package name */
    private final Paint f20971jj;
    private final Paint my;

    /* renamed from: qk, reason: collision with root package name */
    private int f20972qk;
    private final RectF wqx;
    private int xyk;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class jpo {

        /* renamed from: cm, reason: collision with root package name */
        float f20973cm;

        /* renamed from: jd, reason: collision with root package name */
        public float f20974jd;
        public Paint jpo;
        float wqx;

        public jpo(Paint paint, float f10, float f11, float f12) {
            this.jpo = paint;
            this.f20974jd = f10;
            this.wqx = f11;
            this.f20973cm = f12;
        }
    }

    public xyk(Context context) {
        super(context);
        this.f20970jd = new RectF();
        this.wqx = new RectF();
        this.f20969cm = new ArrayList<>();
        this.f20971jj = new Paint();
        Paint paint = new Paint();
        this.my = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void jpo() {
        if (this.f20972qk <= 0) {
            return;
        }
        int width = (int) (((this.xyk * 1.0f) / 100.0f) * getWidth());
        this.wqx.right = Math.max(this.zz, width);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f20970jd;
        int i10 = this.f20972qk;
        canvas.drawRoundRect(rectF, i10, i10, this.my);
        RectF rectF2 = this.wqx;
        int i11 = this.f20972qk;
        canvas.drawRoundRect(rectF2, i11, i11, this.f20971jj);
        int iSave = canvas.save();
        canvas.translate(this.wqx.right - this.zz, 0.0f);
        Iterator<jpo> it = this.f20969cm.iterator();
        while (it.hasNext()) {
            jpo next = it.next();
            canvas.drawCircle(next.wqx, next.f20973cm, next.f20974jd, next.jpo);
        }
        canvas.restoreToCount(iSave);
    }

    public void setProgress(int i10) {
        int i11 = this.xyk;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.xyk = i10;
        jpo();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.f20972qk = i14;
        this.zz = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.f20970jd.set(0.0f, 0.0f, f10, f11);
        this.wqx.set(0.0f, 0.0f, 0.0f, f11);
        this.f20971jj.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor(wHkgq.eKDaSQbEe), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.f20969cm.clear();
        float f12 = this.f20972qk / 4.0f;
        for (int i15 : jpo) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.f20969cm.add(new jpo(paint, this.f20972qk / 2.0f, f12, f11 / 2.0f));
            f12 += (this.f20972qk / 2.0f) * 3.0f;
        }
        jpo();
    }
}
