package xg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f91977i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f91978j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f91979k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f91980l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f91981a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f91982b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f91983c;

    /* renamed from: d, reason: collision with root package name */
    public int f91984d;

    /* renamed from: e, reason: collision with root package name */
    public int f91985e;

    /* renamed from: f, reason: collision with root package name */
    public int f91986f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f91987g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f91988h;

    public a() {
        this(-16777216);
    }

    public void drawCornerShadow(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        int[] iArr = f91979k;
        Path path = this.f91987g;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = this.f91986f;
            iArr[2] = this.f91985e;
            iArr[3] = this.f91984d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = this.f91984d;
            iArr[2] = this.f91985e;
            iArr[3] = this.f91986f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = f91980l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        boolean z11 = z10;
        Paint paint = this.f91982b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z11) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f91988h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }

    public void drawEdgeShadow(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int i11 = this.f91986f;
        int[] iArr = f91977i;
        iArr[0] = i11;
        iArr[1] = this.f91985e;
        iArr[2] = this.f91984d;
        float f10 = rectF.left;
        LinearGradient linearGradient = new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f91978j, Shader.TileMode.CLAMP);
        Paint paint = this.f91983c;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public void drawInnerCornerShadow(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11, float[] fArr) {
        if (f11 > 0.0f) {
            f10 += f11;
            f11 = -f11;
        }
        float f12 = f10;
        float f13 = f11;
        drawCornerShadow(canvas, matrix, rectF, i10, f12, f13);
        Path path = this.f91987g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f12, f13);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f91988h);
        canvas.drawPath(path, this.f91981a);
        canvas.restore();
    }

    public Paint getShadowPaint() {
        return this.f91981a;
    }

    public void setShadowColor(int i10) {
        this.f91984d = o3.b.setAlphaComponent(i10, 68);
        this.f91985e = o3.b.setAlphaComponent(i10, 20);
        this.f91986f = o3.b.setAlphaComponent(i10, 0);
        this.f91981a.setColor(this.f91984d);
    }

    public a(int i10) {
        this.f91987g = new Path();
        Paint paint = new Paint();
        this.f91988h = paint;
        this.f91981a = new Paint();
        setShadowColor(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f91982b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f91983c = new Paint(paint2);
    }
}
