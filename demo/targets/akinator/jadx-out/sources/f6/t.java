package f6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f55412p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f55413a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f55414b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f55415c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f55416d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f55417e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f55418f;

    /* renamed from: g, reason: collision with root package name */
    public final q f55419g;

    /* renamed from: h, reason: collision with root package name */
    public float f55420h;

    /* renamed from: i, reason: collision with root package name */
    public float f55421i;

    /* renamed from: j, reason: collision with root package name */
    public float f55422j;

    /* renamed from: k, reason: collision with root package name */
    public float f55423k;

    /* renamed from: l, reason: collision with root package name */
    public int f55424l;

    /* renamed from: m, reason: collision with root package name */
    public String f55425m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f55426n;

    /* renamed from: o, reason: collision with root package name */
    public final z.f f55427o;

    public t() {
        this.f55415c = new Matrix();
        this.f55420h = 0.0f;
        this.f55421i = 0.0f;
        this.f55422j = 0.0f;
        this.f55423k = 0.0f;
        this.f55424l = 255;
        this.f55425m = null;
        this.f55426n = null;
        this.f55427o = new z.f();
        this.f55419g = new q();
        this.f55413a = new Path();
        this.f55414b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(q qVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
        int i12;
        Matrix matrix2;
        float f10;
        float f11;
        int i13;
        Matrix matrix3 = qVar.f55398a;
        ArrayList arrayList = qVar.f55399b;
        matrix3.set(matrix);
        Matrix matrix4 = qVar.f55398a;
        matrix4.preConcat(qVar.f55407j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            r rVar = (r) arrayList.get(i14);
            if (rVar instanceof q) {
                a((q) rVar, matrix4, canvas, i10, i11, colorFilter);
            } else if (rVar instanceof s) {
                s sVar = (s) rVar;
                float f12 = i10 / this.f55422j;
                float f13 = i11 / this.f55423k;
                float fMin = Math.min(f12, f13);
                Matrix matrix5 = this.f55415c;
                matrix5.set(matrix4);
                matrix5.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix4.mapVectors(fArr);
                boolean z10 = c10;
                i12 = i14;
                float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                if (fAbs == 0.0f) {
                    matrix2 = matrix4;
                } else {
                    Path path = this.f55413a;
                    sVar.toPath(path);
                    Path path2 = this.f55414b;
                    path2.reset();
                    if (sVar.isClipPath()) {
                        path2.setFillType(sVar.f55411c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix5);
                        canvas.clipPath(path2);
                        matrix2 = matrix4;
                    } else {
                        p pVar = (p) sVar;
                        float f15 = pVar.f55392i;
                        if (f15 == 0.0f && pVar.f55393j == 1.0f) {
                            matrix2 = matrix4;
                        } else {
                            float f16 = pVar.f55394k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (pVar.f55393j + f16) % 1.0f;
                            if (this.f55418f == null) {
                                this.f55418f = new PathMeasure();
                            }
                            this.f55418f.setPath(path, z10);
                            float length = this.f55418f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                matrix2 = matrix4;
                                this.f55418f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f55418f.getSegment(0.0f, f20, path, true);
                            } else {
                                matrix2 = matrix4;
                                f10 = 0.0f;
                                this.f55418f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix5);
                        if (pVar.f55389f.willDraw()) {
                            n3.d dVar = pVar.f55389f;
                            if (this.f55417e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f55417e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f55417e;
                            if (dVar.isGradient()) {
                                Shader shader = dVar.getShader();
                                shader.setLocalMatrix(matrix5);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(pVar.f55391h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int color = dVar.getColor();
                                float f21 = pVar.f55391h;
                                PorterDuff.Mode mode = w.f55441l;
                                f11 = 255.0f;
                                paint2.setColor((color & i13) | (((int) (Color.alpha(color) * f21)) << 24));
                            }
                            paint2.setColorFilter(colorFilter);
                            path2.setFillType(pVar.f55411c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f11 = 255.0f;
                            i13 = 16777215;
                        }
                        if (pVar.f55387d.willDraw()) {
                            n3.d dVar2 = pVar.f55387d;
                            if (this.f55416d == null) {
                                Paint paint3 = new Paint(1);
                                this.f55416d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f55416d;
                            Paint.Join join = pVar.f55396m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = pVar.f55395l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(pVar.f55397n);
                            if (dVar2.isGradient()) {
                                Shader shader2 = dVar2.getShader();
                                shader2.setLocalMatrix(matrix5);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(pVar.f55390g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int color2 = dVar2.getColor();
                                float f22 = pVar.f55390g;
                                PorterDuff.Mode mode2 = w.f55441l;
                                paint4.setColor((color2 & i13) | (((int) (Color.alpha(color2) * f22)) << 24));
                            }
                            paint4.setColorFilter(colorFilter);
                            paint4.setStrokeWidth(pVar.f55388e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i14 = i12 + 1;
                matrix4 = matrix2;
                c10 = 0;
            }
            matrix2 = matrix4;
            i12 = i14;
            i14 = i12 + 1;
            matrix4 = matrix2;
            c10 = 0;
        }
        canvas.restore();
    }

    public void draw(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
        a(this.f55419g, f55412p, canvas, i10, i11, colorFilter);
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f55424l;
    }

    public boolean isStateful() {
        if (this.f55426n == null) {
            this.f55426n = Boolean.valueOf(this.f55419g.isStateful());
        }
        return this.f55426n.booleanValue();
    }

    public boolean onStateChanged(int[] iArr) {
        return this.f55419g.onStateChanged(iArr);
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f55424l = i10;
    }

    public t(t tVar) {
        this.f55415c = new Matrix();
        this.f55420h = 0.0f;
        this.f55421i = 0.0f;
        this.f55422j = 0.0f;
        this.f55423k = 0.0f;
        this.f55424l = 255;
        this.f55425m = null;
        this.f55426n = null;
        z.f fVar = new z.f();
        this.f55427o = fVar;
        this.f55419g = new q(tVar.f55419g, fVar);
        this.f55413a = new Path(tVar.f55413a);
        this.f55414b = new Path(tVar.f55414b);
        this.f55420h = tVar.f55420h;
        this.f55421i = tVar.f55421i;
        this.f55422j = tVar.f55422j;
        this.f55423k = tVar.f55423k;
        this.f55424l = tVar.f55424l;
        this.f55425m = tVar.f55425m;
        String str = tVar.f55425m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.f55426n = tVar.f55426n;
    }
}
