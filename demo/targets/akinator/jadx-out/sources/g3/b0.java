package g3;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f56897a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f56898b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f56899c;

    /* renamed from: d, reason: collision with root package name */
    public Path f56900d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f56901e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f56902f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f56903g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f56904h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f56905i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f56906j;

    /* renamed from: k, reason: collision with root package name */
    public int f56907k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f56908l = new Rect();

    /* renamed from: m, reason: collision with root package name */
    public final int f56909m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0 f56910n;

    public b0(i0 i0Var) {
        this.f56910n = i0Var;
        Paint paint = new Paint();
        this.f56901e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-21965);
        paint.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f56902f = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(-2067046);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f56903g = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-13391360);
        paint3.setStrokeWidth(2.0f);
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f56904h = paint4;
        paint4.setAntiAlias(true);
        paint4.setColor(-13391360);
        paint4.setTextSize(i0Var.getContext().getResources().getDisplayMetrics().density * 12.0f);
        this.f56906j = new float[8];
        Paint paint5 = new Paint();
        this.f56905i = paint5;
        paint5.setAntiAlias(true);
        paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        this.f56899c = new float[100];
        this.f56898b = new int[50];
    }

    public final void a(Canvas canvas) {
        float[] fArr = this.f56897a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[fArr.length - 2];
        float f13 = fArr[fArr.length - 1];
        float fMin = Math.min(f10, f12);
        float fMax = Math.max(f11, f13);
        float fMax2 = Math.max(f10, f12);
        float fMax3 = Math.max(f11, f13);
        Paint paint = this.f56903g;
        canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
        canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), paint);
    }

    public final void b(Canvas canvas, float f10, float f11) {
        float[] fArr = this.f56897a;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[fArr.length - 2];
        float f15 = fArr[fArr.length - 1];
        float fMin = Math.min(f12, f14);
        float fMax = Math.max(f13, f15);
        float fMin2 = f10 - Math.min(f12, f14);
        float fMax2 = Math.max(f13, f15) - f11;
        String str = "" + (((int) (((fMin2 * 100.0f) / Math.abs(f14 - f12)) + 0.5d)) / 100.0f);
        int length = str.length();
        Paint paint = this.f56904h;
        Rect rect = this.f56908l;
        paint.getTextBounds(str, 0, length, rect);
        canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f11 - 20.0f, paint);
        float fMin3 = Math.min(f12, f14);
        Paint paint2 = this.f56903g;
        canvas.drawLine(f10, f11, fMin3, f11, paint2);
        String str2 = "" + (((int) (((fMax2 * 100.0f) / Math.abs(f15 - f13)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str2, 0, str2.length(), rect);
        canvas.drawText(str2, f10 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f10, f11, f10, Math.max(f13, f15), paint2);
    }

    public final void c(Canvas canvas, float f10, float f11) {
        float[] fArr = this.f56897a;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[fArr.length - 2];
        float f15 = fArr[fArr.length - 1];
        float fHypot = (float) Math.hypot(f12 - f14, f13 - f15);
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float f18 = (((f11 - f13) * f17) + ((f10 - f12) * f16)) / (fHypot * fHypot);
        float f19 = (f16 * f18) + f12;
        float f20 = (f18 * f17) + f13;
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f19, f20);
        float fHypot2 = (float) Math.hypot(f19 - f10, f20 - f11);
        String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
        int length = str.length();
        Paint paint = this.f56904h;
        paint.getTextBounds(str, 0, length, this.f56908l);
        canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (r6.width() / 2), -20.0f, paint);
        canvas.drawLine(f10, f11, f19, f20, this.f56903g);
    }

    public final void d(Canvas canvas, float f10, float f11, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder("");
        i0 i0Var = this.f56910n;
        sb2.append(((int) ((((f10 - (i10 / 2)) * 100.0f) / (i0Var.getWidth() - i10)) + 0.5d)) / 100.0f);
        String string = sb2.toString();
        int length = string.length();
        Paint paint = this.f56904h;
        Rect rect = this.f56908l;
        paint.getTextBounds(string, 0, length, rect);
        canvas.drawText(string, ((f10 / 2.0f) - (rect.width() / 2)) + 0.0f, f11 - 20.0f, paint);
        float fMin = Math.min(0.0f, 1.0f);
        Paint paint2 = this.f56903g;
        canvas.drawLine(f10, f11, fMin, f11, paint2);
        String str = "" + (((int) ((((f11 - (i11 / 2)) * 100.0f) / (i0Var.getHeight() - i11)) + 0.5d)) / 100.0f);
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - (rect.height() / 2)), paint);
        canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), paint2);
    }

    public void draw(Canvas canvas, HashMap<View, s> map, int i10, int i11) {
        if (map == null || map.size() == 0) {
            return;
        }
        canvas.save();
        i0 i0Var = this.f56910n;
        boolean zIsInEditMode = i0Var.isInEditMode();
        Paint paint = this.f56901e;
        if (!zIsInEditMode && (i11 & 1) == 2) {
            String str = i0Var.getContext().getResources().getResourceName(i0Var.f56995i) + ":" + i0Var.getProgress();
            canvas.drawText(str, 10.0f, i0Var.getHeight() - 30, this.f56904h);
            canvas.drawText(str, 11.0f, i0Var.getHeight() - 29, paint);
        }
        for (s sVar : map.values()) {
            int drawPath = sVar.getDrawPath();
            if (i11 > 0 && drawPath == 0) {
                drawPath = 1;
            }
            if (drawPath != 0) {
                this.f56907k = sVar.a(this.f56899c, this.f56898b);
                if (drawPath >= 1) {
                    int i12 = i10 / 16;
                    float[] fArr = this.f56897a;
                    if (fArr == null || fArr.length != i12 * 2) {
                        this.f56897a = new float[i12 * 2];
                        this.f56900d = new Path();
                    }
                    int i13 = this.f56909m;
                    float f10 = i13;
                    canvas.translate(f10, f10);
                    paint.setColor(1996488704);
                    Paint paint2 = this.f56905i;
                    paint2.setColor(1996488704);
                    Paint paint3 = this.f56902f;
                    paint3.setColor(1996488704);
                    Paint paint4 = this.f56903g;
                    paint4.setColor(1996488704);
                    sVar.b(this.f56897a, i12);
                    drawAll(canvas, drawPath, this.f56907k, sVar);
                    paint.setColor(-21965);
                    paint3.setColor(-2067046);
                    paint2.setColor(-2067046);
                    paint4.setColor(-13391360);
                    float f11 = -i13;
                    canvas.translate(f11, f11);
                    drawAll(canvas, drawPath, this.f56907k, sVar);
                    if (drawPath == 5) {
                        this.f56900d.reset();
                        for (int i14 = 0; i14 <= 50; i14++) {
                            sVar.f57229j[0].getPos(sVar.c(i14 / 50, null), sVar.f57235p);
                            j0 j0Var = sVar.f57225f;
                            int[] iArr = sVar.f57234o;
                            double[] dArr = sVar.f57235p;
                            float[] fArr2 = this.f56906j;
                            j0Var.c(iArr, dArr, fArr2, 0);
                            this.f56900d.moveTo(fArr2[0], fArr2[1]);
                            this.f56900d.lineTo(fArr2[2], fArr2[3]);
                            this.f56900d.lineTo(fArr2[4], fArr2[5]);
                            this.f56900d.lineTo(fArr2[6], fArr2[7]);
                            this.f56900d.close();
                        }
                        paint.setColor(1140850688);
                        canvas.translate(2.0f, 2.0f);
                        canvas.drawPath(this.f56900d, paint);
                        canvas.translate(-2.0f, -2.0f);
                        paint.setColor(-65536);
                        canvas.drawPath(this.f56900d, paint);
                    }
                }
            }
        }
        canvas.restore();
    }

    public void drawAll(Canvas canvas, int i10, int i11, s sVar) {
        Canvas canvas2;
        int width;
        int height;
        boolean z10;
        float f10;
        Paint paint = this.f56903g;
        int[] iArr = this.f56898b;
        boolean z11 = false;
        int i12 = 4;
        if (i10 == 4) {
            int i13 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i13 < this.f56907k) {
                int i14 = iArr[i13];
                boolean z14 = z12;
                if (i14 == 1) {
                    z14 = true;
                }
                if (i14 == 0) {
                    z13 = true;
                }
                i13++;
                z12 = z14;
                z13 = z13;
            }
            if (z12) {
                float[] fArr = this.f56897a;
                canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
            }
            if (z13) {
                a(canvas);
            }
        }
        if (i10 == 2) {
            float[] fArr2 = this.f56897a;
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            float f13 = fArr2[fArr2.length - 2];
            float f14 = fArr2[fArr2.length - 1];
            canvas2 = canvas;
            canvas2.drawLine(f11, f12, f13, f14, paint);
        } else {
            canvas2 = canvas;
        }
        if (i10 == 3) {
            a(canvas);
        }
        canvas2.drawLines(this.f56897a, this.f56901e);
        View view = sVar.f57221b;
        if (view != null) {
            width = view.getWidth();
            height = sVar.f57221b.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int i15 = 1;
        while (i15 < i11 - 1) {
            if (i10 == i12 && iArr[i15 - 1] == 0) {
                z10 = z11;
            } else {
                int i16 = i15 * 2;
                float[] fArr3 = this.f56899c;
                float f15 = fArr3[i16];
                float f16 = fArr3[i16 + 1];
                this.f56900d.reset();
                z10 = z11;
                this.f56900d.moveTo(f15, f16 + 10.0f);
                this.f56900d.lineTo(f15 + 10.0f, f16);
                this.f56900d.lineTo(f15, f16 - 10.0f);
                this.f56900d.lineTo(f15 - 10.0f, f16);
                this.f56900d.close();
                int i17 = i15 - 1;
                Paint paint2 = this.f56905i;
                if (i10 == i12) {
                    int i18 = iArr[i17];
                    if (i18 == 1) {
                        c(canvas2, f15 - 0.0f, f16 - 0.0f);
                    } else if (i18 == 0) {
                        b(canvas2, f15 - 0.0f, f16 - 0.0f);
                    } else {
                        if (i18 == 2) {
                            f10 = f16;
                            d(canvas2, f15 - 0.0f, f10 - 0.0f, width, height);
                        }
                        canvas2.drawPath(this.f56900d, paint2);
                    }
                    f10 = f16;
                    canvas2.drawPath(this.f56900d, paint2);
                } else {
                    f10 = f16;
                }
                if (i10 == 2) {
                    c(canvas2, f15 - 0.0f, f10 - 0.0f);
                }
                if (i10 == 3) {
                    b(canvas2, f15 - 0.0f, f10 - 0.0f);
                }
                if (i10 == 6) {
                    d(canvas2, f15 - 0.0f, f10 - 0.0f, width, height);
                }
                canvas2.drawPath(this.f56900d, paint2);
            }
            i15++;
            z11 = z10;
            i12 = 4;
        }
        boolean z15 = z11;
        float[] fArr4 = this.f56897a;
        if (fArr4.length > 1) {
            float f17 = fArr4[z15 ? 1 : 0];
            float f18 = fArr4[1];
            Paint paint3 = this.f56902f;
            canvas2.drawCircle(f17, f18, 8.0f, paint3);
            float[] fArr5 = this.f56897a;
            canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
        }
    }
}
