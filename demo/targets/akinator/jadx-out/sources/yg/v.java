package yg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public float f94517a;

    /* renamed from: b, reason: collision with root package name */
    public float f94518b;

    /* renamed from: c, reason: collision with root package name */
    public float f94519c;

    /* renamed from: d, reason: collision with root package name */
    public float f94520d;

    /* renamed from: e, reason: collision with root package name */
    public float f94521e;

    /* renamed from: f, reason: collision with root package name */
    public float f94522f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f94523g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f94524h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f94525i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends w {

        /* renamed from: c, reason: collision with root package name */
        public final d f94526c;

        public a(d dVar) {
            this.f94526c = dVar;
        }

        @Override // yg.w
        public void draw(Matrix matrix, xg.a aVar, int i10, Canvas canvas) {
            d dVar = this.f94526c;
            aVar.drawCornerShadow(canvas, matrix, new RectF(dVar.f94535b, dVar.f94536c, dVar.f94537d, dVar.f94538e), i10, dVar.f94539f, dVar.f94540g);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends w {

        /* renamed from: c, reason: collision with root package name */
        public final f f94527c;

        /* renamed from: d, reason: collision with root package name */
        public final f f94528d;

        /* renamed from: e, reason: collision with root package name */
        public final float f94529e;

        /* renamed from: f, reason: collision with root package name */
        public final float f94530f;

        public b(f fVar, f fVar2, float f10, float f11) {
            this.f94527c = fVar;
            this.f94528d = fVar2;
            this.f94529e = f10;
            this.f94530f = f11;
        }

        public final float a() {
            float f10 = this.f94528d.f94548c;
            f fVar = this.f94527c;
            return (float) Math.toDegrees(Math.atan((f10 - fVar.f94548c) / (r0.f94547b - fVar.f94547b)));
        }

        public final float b() {
            f fVar = this.f94527c;
            return (float) Math.toDegrees(Math.atan((fVar.f94548c - this.f94530f) / (fVar.f94547b - this.f94529e)));
        }

        @Override // yg.w
        public void draw(Matrix matrix, xg.a aVar, int i10, Canvas canvas) {
            float f10;
            float fA = ((a() - b()) + 360.0f) % 360.0f;
            if (fA > 180.0f) {
                fA -= 360.0f;
            }
            float f11 = fA;
            if (f11 > 0.0f) {
                return;
            }
            f fVar = this.f94527c;
            float f12 = fVar.f94547b;
            float f13 = this.f94529e;
            double d10 = f12 - f13;
            float f14 = fVar.f94548c;
            float f15 = this.f94530f;
            double dHypot = Math.hypot(d10, f14 - f15);
            f fVar2 = this.f94528d;
            double dHypot2 = Math.hypot(fVar2.f94547b - fVar.f94547b, fVar2.f94548c - fVar.f94548c);
            float fMin = (float) Math.min(i10, Math.min(dHypot, dHypot2));
            double d11 = fMin;
            double dTan = Math.tan(Math.toRadians((-f11) / 2.0f)) * d11;
            Matrix matrix2 = this.f94555a;
            if (dHypot > dTan) {
                f10 = 0.0f;
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                matrix2.set(matrix);
                matrix2.preTranslate(f13, f15);
                matrix2.preRotate(b());
                aVar.drawEdgeShadow(canvas, matrix2, rectF, i10);
            } else {
                f10 = 0.0f;
            }
            float f16 = fMin * 2.0f;
            RectF rectF2 = new RectF(f10, f10, f16, f16);
            matrix2.set(matrix);
            matrix2.preTranslate(fVar.f94547b, fVar.f94548c);
            matrix2.preRotate(b());
            matrix2.preTranslate((float) ((-dTan) - d11), (-2.0f) * fMin);
            aVar.drawInnerCornerShadow(canvas, matrix2, rectF2, (int) fMin, 450.0f, f11, new float[]{(float) (d11 + dTan), f16});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                matrix2.set(matrix);
                matrix2.preTranslate(fVar.f94547b, fVar.f94548c);
                matrix2.preRotate(a());
                matrix2.preTranslate((float) dTan, 0.0f);
                aVar.drawEdgeShadow(canvas, matrix2, rectF3, i10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends w {

        /* renamed from: c, reason: collision with root package name */
        public final f f94531c;

        /* renamed from: d, reason: collision with root package name */
        public final float f94532d;

        /* renamed from: e, reason: collision with root package name */
        public final float f94533e;

        public c(f fVar, float f10, float f11) {
            this.f94531c = fVar;
            this.f94532d = f10;
            this.f94533e = f11;
        }

        public final float a() {
            f fVar = this.f94531c;
            return (float) Math.toDegrees(Math.atan((fVar.f94548c - this.f94533e) / (fVar.f94547b - this.f94532d)));
        }

        @Override // yg.w
        public void draw(Matrix matrix, xg.a aVar, int i10, Canvas canvas) {
            f fVar = this.f94531c;
            float f10 = fVar.f94548c;
            float f11 = this.f94533e;
            float f12 = fVar.f94547b;
            float f13 = this.f94532d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
            Matrix matrix2 = this.f94555a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(a());
            aVar.drawEdgeShadow(canvas, matrix2, rectF, i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends g {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f94534h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public final float f94535b;

        /* renamed from: c, reason: collision with root package name */
        public final float f94536c;

        /* renamed from: d, reason: collision with root package name */
        public final float f94537d;

        /* renamed from: e, reason: collision with root package name */
        public final float f94538e;

        /* renamed from: f, reason: collision with root package name */
        public float f94539f;

        /* renamed from: g, reason: collision with root package name */
        public float f94540g;

        public d(float f10, float f11, float f12, float f13) {
            this.f94535b = f10;
            this.f94536c = f11;
            this.f94537d = f12;
            this.f94538e = f13;
        }

        @Override // yg.v.g
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.f94549a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f10 = this.f94537d;
            float f11 = this.f94538e;
            RectF rectF = f94534h;
            rectF.set(this.f94535b, this.f94536c, f10, f11);
            path.arcTo(rectF, this.f94539f, this.f94540g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends g {

        /* renamed from: b, reason: collision with root package name */
        public final float f94541b;

        /* renamed from: c, reason: collision with root package name */
        public final float f94542c;

        /* renamed from: d, reason: collision with root package name */
        public final float f94543d;

        /* renamed from: e, reason: collision with root package name */
        public final float f94544e;

        /* renamed from: f, reason: collision with root package name */
        public final float f94545f;

        /* renamed from: g, reason: collision with root package name */
        public final float f94546g;

        public e(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f94541b = f10;
            this.f94542c = f11;
            this.f94543d = f12;
            this.f94544e = f13;
            this.f94545f = f14;
            this.f94546g = f15;
        }

        @Override // yg.v.g
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.f94549a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f94541b, this.f94542c, this.f94543d, this.f94544e, this.f94545f, this.f94546g);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f extends g {

        /* renamed from: b, reason: collision with root package name */
        public float f94547b;

        /* renamed from: c, reason: collision with root package name */
        public float f94548c;

        @Override // yg.v.g
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.f94549a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f94547b, this.f94548c);
            path.transform(matrix);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f94549a = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h extends g {

        /* renamed from: b, reason: collision with root package name */
        public float f94550b;

        /* renamed from: c, reason: collision with root package name */
        public float f94551c;

        /* renamed from: d, reason: collision with root package name */
        public float f94552d;

        /* renamed from: e, reason: collision with root package name */
        public float f94553e;

        @Override // yg.v.g
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.f94549a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(this.f94550b, this.f94551c, this.f94552d, this.f94553e);
            path.transform(matrix);
        }
    }

    public v() {
        reset(0.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f94521e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f94519c;
        float f14 = this.f94520d;
        d dVar = new d(f13, f14, f13, f14);
        dVar.f94539f = this.f94521e;
        dVar.f94540g = f12;
        this.f94524h.add(new a(dVar));
        this.f94521e = f10;
    }

    public void addArc(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.f94539f = f14;
        dVar.f94540g = f15;
        this.f94523g.add(dVar);
        a aVar = new a(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z10 ? (180.0f + f16) % 360.0f : f16;
        a(f14);
        this.f94524h.add(aVar);
        this.f94521e = f17;
        double d10 = f16;
        this.f94519c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f94520d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public void applyToPath(Matrix matrix, Path path) {
        ArrayList arrayList = this.f94523g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) arrayList.get(i10)).applyToPath(matrix, path);
        }
    }

    public void cubicToPoint(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f94523g.add(new e(f10, f11, f12, f13, f14, f15));
        this.f94525i = true;
        this.f94519c = f14;
        this.f94520d = f15;
    }

    public void lineTo(float f10, float f11) {
        f fVar = new f();
        fVar.f94547b = f10;
        fVar.f94548c = f11;
        this.f94523g.add(fVar);
        c cVar = new c(fVar, this.f94519c, this.f94520d);
        float fA = cVar.a() + 270.0f;
        float fA2 = cVar.a() + 270.0f;
        a(fA);
        this.f94524h.add(cVar);
        this.f94521e = fA2;
        this.f94519c = f10;
        this.f94520d = f11;
    }

    public void quadToPoint(float f10, float f11, float f12, float f13) {
        h hVar = new h();
        hVar.f94550b = f10;
        hVar.f94551c = f11;
        hVar.f94552d = f12;
        hVar.f94553e = f13;
        this.f94523g.add(hVar);
        this.f94525i = true;
        this.f94519c = f12;
        this.f94520d = f13;
    }

    public void reset(float f10, float f11) {
        reset(f10, f11, 270.0f, 0.0f);
    }

    public void reset(float f10, float f11, float f12, float f13) {
        this.f94517a = f10;
        this.f94518b = f11;
        this.f94519c = f10;
        this.f94520d = f11;
        this.f94521e = f12;
        this.f94522f = (f12 + f13) % 360.0f;
        this.f94523g.clear();
        this.f94524h.clear();
        this.f94525i = false;
    }

    public v(float f10, float f11) {
        reset(f10, f11);
    }

    public void lineTo(float f10, float f11, float f12, float f13) {
        if ((Math.abs(f10 - this.f94519c) < 0.001f && Math.abs(f11 - this.f94520d) < 0.001f) || (Math.abs(f10 - f12) < 0.001f && Math.abs(f11 - f13) < 0.001f)) {
            lineTo(f12, f13);
            return;
        }
        f fVar = new f();
        fVar.f94547b = f10;
        fVar.f94548c = f11;
        ArrayList arrayList = this.f94523g;
        arrayList.add(fVar);
        f fVar2 = new f();
        fVar2.f94547b = f12;
        fVar2.f94548c = f13;
        arrayList.add(fVar2);
        b bVar = new b(fVar, fVar2, this.f94519c, this.f94520d);
        float fA = ((bVar.a() - bVar.b()) + 360.0f) % 360.0f;
        if (fA > 180.0f) {
            fA -= 360.0f;
        }
        if (fA > 0.0f) {
            lineTo(f10, f11);
            lineTo(f12, f13);
            return;
        }
        float fB = bVar.b() + 270.0f;
        float fA2 = bVar.a() + 270.0f;
        a(fB);
        this.f94524h.add(bVar);
        this.f94521e = fA2;
        this.f94519c = f12;
        this.f94520d = f13;
    }
}
