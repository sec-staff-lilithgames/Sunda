package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.jj.cm;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class NiceImageView extends cm {

    /* renamed from: au, reason: collision with root package name */
    private int f19431au;

    /* renamed from: cm, reason: collision with root package name */
    private int f19432cm;

    /* renamed from: dt, reason: collision with root package name */
    private final Path f19433dt;
    private Path hmu;
    private int hna;

    /* renamed from: if, reason: not valid java name */
    private int f96if;

    /* renamed from: jd, reason: collision with root package name */
    private boolean f19434jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f19435jj;
    private final Context jpo;

    /* renamed from: jr, reason: collision with root package name */
    private final float[] f19436jr;

    /* renamed from: ju, reason: collision with root package name */
    private int f19437ju;
    private int my;
    private RectF nmd;
    private final float[] opi;
    private final Xfermode oya;
    private int prr;

    /* renamed from: qk, reason: collision with root package name */
    private int f19438qk;

    /* renamed from: rq, reason: collision with root package name */
    private final RectF f19439rq;

    /* renamed from: sq, reason: collision with root package name */
    private float f19440sq;

    /* renamed from: tu, reason: collision with root package name */
    private final Paint f19441tu;
    private boolean wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f19442yd;
    private int zz;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void cm() {
        if (this.f19434jd) {
            return;
        }
        this.f19435jj = 0;
    }

    private void jd() {
        if (!this.f19434jd) {
            this.nmd.set(0.0f, 0.0f, this.prr, this.hna);
            if (this.wqx) {
                this.nmd = this.f19439rq;
                return;
            }
            return;
        }
        float fMin = Math.min(this.prr, this.hna) / 2.0f;
        this.f19440sq = fMin;
        RectF rectF = this.nmd;
        int i10 = this.prr;
        int i11 = this.hna;
        rectF.set((i10 / 2.0f) - fMin, (i11 / 2.0f) - fMin, (i10 / 2.0f) + fMin, (i11 / 2.0f) + fMin);
    }

    private void jpo(Canvas canvas) {
        if (!this.f19434jd) {
            int i10 = this.f19432cm;
            if (i10 > 0) {
                jpo(canvas, i10, this.my, this.f19439rq, this.opi);
                return;
            }
            return;
        }
        int i11 = this.f19432cm;
        if (i11 > 0) {
            jpo(canvas, i11, this.my, this.f19440sq - (i11 / 2.0f));
        }
        int i12 = this.f19435jj;
        if (i12 > 0) {
            jpo(canvas, i12, this.f19438qk, (this.f19440sq - this.f19432cm) - (i12 / 2.0f));
        }
    }

    private void wqx() {
        if (this.f19434jd) {
            return;
        }
        int i10 = 0;
        if (this.xyk <= 0) {
            float[] fArr = this.opi;
            int i11 = this.zz;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.f19442yd;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.f96if;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.f19437ju;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.f19436jr;
            int i15 = this.f19432cm;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.opi;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.xyk;
            fArr3[i10] = i16;
            this.f19436jr[i10] = i16 - (this.f19432cm / 2.0f);
            i10++;
        }
    }

    public void isCircle(boolean z10) {
        this.f19434jd = z10;
        cm();
        jd();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.wqx = z10;
        jd();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.nmd, null, 31);
        if (!this.wqx) {
            int i10 = this.prr;
            int i11 = this.f19432cm;
            int i12 = this.f19435jj;
            int i13 = this.hna;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.f19441tu.reset();
        this.f19433dt.reset();
        if (this.f19434jd) {
            this.f19433dt.addCircle(this.prr / 2.0f, this.hna / 2.0f, this.f19440sq, Path.Direction.CCW);
        } else {
            this.f19433dt.addRoundRect(this.nmd, this.f19436jr, Path.Direction.CCW);
        }
        this.f19441tu.setAntiAlias(true);
        this.f19441tu.setStyle(Paint.Style.FILL);
        this.f19441tu.setXfermode(this.oya);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.f19433dt, this.f19441tu);
        } else {
            this.hmu.addRect(this.nmd, Path.Direction.CCW);
            this.hmu.op(this.f19433dt, Path.Op.DIFFERENCE);
            canvas.drawPath(this.hmu, this.f19441tu);
        }
        this.f19441tu.setXfermode(null);
        int i14 = this.f19431au;
        if (i14 != 0) {
            this.f19441tu.setColor(i14);
            canvas.drawPath(this.f19433dt, this.f19441tu);
        }
        canvas.restore();
        jpo(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.prr = i10;
        this.hna = i11;
        jpo();
        jd();
    }

    public void setBorderColor(int i10) {
        this.my = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.f19432cm = va.jd(this.jpo, i10);
        jpo(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.f19437ju = va.jd(this.jpo, i10);
        jpo(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.f96if = va.jd(this.jpo, i10);
        jpo(true);
    }

    public void setCornerRadius(int i10) {
        this.xyk = va.jd(this.jpo, i10);
        jpo(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.zz = va.jd(this.jpo, i10);
        jpo(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.f19442yd = va.jd(this.jpo, i10);
        jpo(true);
    }

    public void setInnerBorderColor(int i10) {
        this.f19438qk = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.f19435jj = va.jd(this.jpo, i10);
        cm();
        invalidate();
    }

    public void setMaskColor(int i10) {
        this.f19431au = i10;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.my = -1;
        this.f19438qk = -1;
        this.jpo = context;
        this.xyk = va.jd(context, 10.0f);
        this.opi = new float[8];
        this.f19436jr = new float[8];
        this.f19439rq = new RectF();
        this.nmd = new RectF();
        this.f19441tu = new Paint();
        this.f19433dt = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.oya = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.oya = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.hmu = new Path();
        }
        wqx();
        cm();
    }

    private void jpo(Canvas canvas, int i10, int i11, float f10) {
        jpo(i10, i11);
        this.f19433dt.addCircle(this.prr / 2.0f, this.hna / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.f19433dt, this.f19441tu);
    }

    private void jpo(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        jpo(i10, i11);
        this.f19433dt.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.f19433dt, this.f19441tu);
    }

    private void jpo(int i10, int i11) {
        this.f19433dt.reset();
        this.f19441tu.setStrokeWidth(i10);
        this.f19441tu.setColor(i11);
        this.f19441tu.setStyle(Paint.Style.STROKE);
    }

    private void jpo() {
        if (this.f19434jd) {
            return;
        }
        RectF rectF = this.f19439rq;
        int i10 = this.f19432cm;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.prr - (i10 / 2.0f), this.hna - (i10 / 2.0f));
    }

    private void jpo(boolean z10) {
        if (z10) {
            this.xyk = 0;
        }
        wqx();
        jpo();
        invalidate();
    }
}
