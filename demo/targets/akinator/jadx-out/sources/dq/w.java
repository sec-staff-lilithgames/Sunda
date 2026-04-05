package dq;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w extends Drawable {

    /* renamed from: n, reason: collision with root package name */
    public static final y f52540n;

    /* renamed from: a, reason: collision with root package name */
    public b f52541a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f52542b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f52543c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f52544d;

    /* renamed from: e, reason: collision with root package name */
    public Rect f52545e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f52546f;

    /* renamed from: g, reason: collision with root package name */
    public ColorFilter f52547g;

    /* renamed from: h, reason: collision with root package name */
    public BlendModeColorFilter f52548h;

    /* renamed from: i, reason: collision with root package name */
    public int f52549i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f52550j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f52551k;

    /* renamed from: l, reason: collision with root package name */
    public Path f52552l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f52553m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends Drawable.ConstantState {
        public ColorStateList A;
        public BlendMode B;

        /* renamed from: a, reason: collision with root package name */
        public int f52554a;

        /* renamed from: b, reason: collision with root package name */
        public int f52555b;

        /* renamed from: c, reason: collision with root package name */
        public final y f52556c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f52557d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f52558e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList[] f52559f;

        /* renamed from: g, reason: collision with root package name */
        public final float[] f52560g;

        /* renamed from: h, reason: collision with root package name */
        public int f52561h;

        /* renamed from: i, reason: collision with root package name */
        public float f52562i;

        /* renamed from: j, reason: collision with root package name */
        public float f52563j;

        /* renamed from: k, reason: collision with root package name */
        public float f52564k;

        /* renamed from: l, reason: collision with root package name */
        public float[] f52565l;

        /* renamed from: m, reason: collision with root package name */
        public final Rect f52566m;

        /* renamed from: n, reason: collision with root package name */
        public final int f52567n;

        /* renamed from: o, reason: collision with root package name */
        public final int f52568o;

        /* renamed from: p, reason: collision with root package name */
        public final float f52569p;

        /* renamed from: q, reason: collision with root package name */
        public final float f52570q;

        /* renamed from: r, reason: collision with root package name */
        public final int f52571r;

        /* renamed from: s, reason: collision with root package name */
        public final int f52572s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f52573t;

        /* renamed from: u, reason: collision with root package name */
        public final float f52574u;

        /* renamed from: v, reason: collision with root package name */
        public final float f52575v;

        /* renamed from: w, reason: collision with root package name */
        public float f52576w;

        /* renamed from: x, reason: collision with root package name */
        public int f52577x;

        /* renamed from: y, reason: collision with root package name */
        public boolean f52578y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f52579z;

        public b(y orientation, int[] iArr) {
            kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
            this.f52561h = -1;
            this.f52567n = -1;
            this.f52568o = -1;
            this.f52569p = 3.0f;
            this.f52570q = 9.0f;
            this.f52571r = -1;
            this.f52572s = -1;
            this.f52574u = 0.5f;
            this.f52575v = 0.5f;
            this.f52576w = 0.5f;
            this.B = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f52556c = orientation;
            a(iArr);
        }

        public final int A() {
            return this.f52561h;
        }

        public final int B() {
            return this.f52572s;
        }

        public final float C() {
            return this.f52570q;
        }

        public final ColorStateList D() {
            return this.A;
        }

        public final int E() {
            return this.f52567n;
        }

        public final void a(int i10) {
            this.f52554a = i10;
        }

        public final void b(ColorStateList colorStateList) {
            this.A = colorStateList;
        }

        public final float c() {
            return this.f52574u;
        }

        public final float d() {
            return this.f52575v;
        }

        public final int e() {
            return this.f52554a;
        }

        public final int[] f() {
            ColorStateList[] colorStateListArr = this.f52559f;
            if (colorStateListArr != null) {
                return z.a(colorStateListArr, x.f52580e);
            }
            return null;
        }

        public final boolean g() {
            return this.f52573t;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i10 = this.f52554a;
            ColorStateList colorStateList = this.f52558e;
            int changingConfigurations = i10 | (colorStateList != null ? colorStateList.getChangingConfigurations() : 0);
            ColorStateList colorStateList2 = this.f52557d;
            int changingConfigurations2 = changingConfigurations | (colorStateList2 != null ? colorStateList2.getChangingConfigurations() : 0);
            ColorStateList colorStateList3 = this.A;
            return changingConfigurations2 | (colorStateList3 != null ? colorStateList3.getChangingConfigurations() : 0);
        }

        public final ColorStateList[] h() {
            return this.f52559f;
        }

        public final float i() {
            return this.f52576w;
        }

        public final int j() {
            return this.f52577x;
        }

        public final int k() {
            return this.f52555b;
        }

        public final int l() {
            return this.f52568o;
        }

        public final int m() {
            return this.f52571r;
        }

        public final float n() {
            return this.f52569p;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new w(this, (kotlin.jvm.internal.u) null);
        }

        public final boolean o() {
            return this.f52578y;
        }

        public final boolean p() {
            return this.f52579z;
        }

        public final y q() {
            return this.f52556c;
        }

        public final Rect r() {
            return this.f52566m;
        }

        public final float[] s() {
            return this.f52560g;
        }

        public final float t() {
            return this.f52564k;
        }

        public final float[] u() {
            return this.f52565l;
        }

        public final int v() {
            return 0;
        }

        public final ColorStateList w() {
            return this.f52557d;
        }

        public final ColorStateList x() {
            return this.f52558e;
        }

        public final float y() {
            return this.f52563j;
        }

        public final float z() {
            return this.f52562i;
        }

        public final void a(boolean z10) {
            this.f52573t = z10;
        }

        public final BlendMode b() {
            return this.B;
        }

        public final void a(BlendMode blendMode) {
            this.B = blendMode;
        }

        public final void b(int i10) {
            this.f52555b = i10;
        }

        public final void a(int[] iArr) {
            ColorStateList[] colorStateListArr;
            if (iArr != null) {
                colorStateListArr = this.f52559f;
                if (colorStateListArr == null || colorStateListArr.length != iArr.length) {
                    colorStateListArr = new ColorStateList[iArr.length];
                }
                int length = iArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(iArr[i10]);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(it)");
                    colorStateListArr[i10] = colorStateListValueOf;
                }
            } else {
                colorStateListArr = null;
            }
            this.f52559f = colorStateListArr;
            this.f52557d = null;
            a();
        }

        public final void a(ColorStateList colorStateList) {
            this.f52559f = null;
            this.f52557d = colorStateList;
            a();
        }

        public b(b originalGradientState) {
            kotlin.jvm.internal.e0.checkNotNullParameter(originalGradientState, "originalGradientState");
            this.f52561h = -1;
            this.f52567n = -1;
            this.f52568o = -1;
            this.f52569p = 3.0f;
            this.f52570q = 9.0f;
            this.f52571r = -1;
            this.f52572s = -1;
            this.f52574u = 0.5f;
            this.f52575v = 0.5f;
            this.f52576w = 0.5f;
            this.B = Build.VERSION.SDK_INT >= 29 ? BlendMode.SRC_IN : null;
            this.f52554a = originalGradientState.f52554a;
            this.f52555b = originalGradientState.f52555b;
            this.f52556c = originalGradientState.f52556c;
            this.f52557d = originalGradientState.f52557d;
            this.f52558e = originalGradientState.f52558e;
            ColorStateList[] colorStateListArr = originalGradientState.f52559f;
            if (colorStateListArr != null) {
                this.f52559f = (ColorStateList[]) colorStateListArr.clone();
            }
            float[] fArr = originalGradientState.f52560g;
            if (fArr != null) {
                this.f52560g = (float[]) fArr.clone();
            }
            this.f52561h = originalGradientState.f52561h;
            this.f52562i = originalGradientState.f52562i;
            this.f52563j = originalGradientState.f52563j;
            this.f52564k = originalGradientState.f52564k;
            float[] fArr2 = originalGradientState.f52565l;
            if (fArr2 != null) {
                this.f52565l = (float[]) fArr2.clone();
            }
            Rect rect = originalGradientState.f52566m;
            if (rect != null) {
                this.f52566m = new Rect(rect);
            }
            this.f52567n = originalGradientState.f52567n;
            this.f52568o = originalGradientState.f52568o;
            this.f52569p = originalGradientState.f52569p;
            this.f52570q = originalGradientState.f52570q;
            this.f52571r = originalGradientState.f52571r;
            this.f52572s = originalGradientState.f52572s;
            this.f52573t = originalGradientState.f52573t;
            this.f52574u = originalGradientState.f52574u;
            this.f52575v = originalGradientState.f52575v;
            this.f52576w = originalGradientState.f52576w;
            this.f52577x = originalGradientState.f52577x;
            this.f52578y = originalGradientState.f52578y;
            this.f52579z = originalGradientState.f52579z;
            this.A = originalGradientState.A;
            this.B = originalGradientState.B;
        }

        public final void a(int i10, ColorStateList colorStateList, float f10, float f11) {
            this.f52561h = i10;
            this.f52558e = colorStateList;
            this.f52562i = f10;
            this.f52563j = f11;
            a();
        }

        public final void a(float f10) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            this.f52564k = f10;
            this.f52565l = null;
            a();
        }

        public final void a(float f10, int i10) {
            this.f52576w = f10;
            this.f52577x = i10;
        }

        public final void a() {
            Boolean boolValueOf;
            boolean z10;
            boolean z11 = false;
            this.f52578y = false;
            this.f52579z = false;
            ColorStateList[] colorStateListArr = this.f52559f;
            if (colorStateListArr == null && this.f52557d == null) {
                return;
            }
            if (colorStateListArr != null) {
                int length = colorStateListArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        ColorStateList colorStateList = colorStateListArr[i10];
                        if (colorStateList != null && !z.a(colorStateList.getDefaultColor())) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                boolValueOf = Boolean.valueOf(z10);
            } else {
                boolValueOf = null;
            }
            if (kotlin.jvm.internal.e0.areEqual(boolValueOf, Boolean.TRUE)) {
                return;
            }
            this.f52579z = true;
            if (this.f52564k <= 0.0f && this.f52565l == null) {
                z11 = true;
            }
            this.f52578y = z11;
        }
    }

    static {
        new a(null);
        f52540n = y.f52581b;
    }

    public /* synthetic */ w(b bVar, kotlin.jvm.internal.u uVar) {
        this(bVar);
    }

    public final void a(float f10) {
        this.f52541a.a(f10);
        this.f52553m = true;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f52541a.a(ColorStateList.valueOf(i10));
        this.f52544d.setColor(i10);
        invalidateSelf();
    }

    public final void c(int i10) {
        this.f52541a.b(i10);
        this.f52551k = true;
        invalidateSelf();
    }

    public final void d() {
        b bVar = this.f52541a;
        ColorStateList colorStateListW = bVar.w();
        Paint paint = this.f52544d;
        if (colorStateListW != null) {
            paint.setColor(colorStateListW.getColorForState(getState(), 0));
        } else if (bVar.h() == null) {
            paint.setColor(0);
        } else {
            paint.setColor(-16777216);
        }
        this.f52545e = bVar.r();
        int iA = bVar.A();
        if (iA >= 0) {
            Paint paint2 = this.f52546f;
            if (paint2 == null) {
                paint2 = new Paint(1);
                this.f52546f = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(iA);
            }
            ColorStateList colorStateListX = bVar.x();
            if (colorStateListX != null) {
                paint2.setColor(colorStateListX.getColorForState(getState(), 0));
            }
            float fZ = bVar.z();
            if (fZ != 0.0f) {
                paint2.setPathEffect(new DashPathEffect(new float[]{fZ, bVar.y()}, 0.0f));
            }
        }
        this.f52548h = a(this.f52548h, bVar.D(), bVar.b());
        this.f52551k = true;
        bVar.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF;
        int i10;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        if (c()) {
            Paint paint9 = this.f52544d;
            int alpha = paint9.getAlpha();
            Paint paint10 = this.f52546f;
            int alpha2 = paint10 != null ? paint10.getAlpha() : 0;
            int i11 = this.f52549i;
            int i12 = (((i11 >> 7) + i11) * alpha) >> 8;
            int i13 = ((i11 + (i11 >> 7)) * alpha2) >> 8;
            Paint paint11 = this.f52546f;
            float strokeWidth = paint11 != null ? paint11.getStrokeWidth() : 0.0f;
            boolean z10 = i13 > 0 && strokeWidth > 0.0f;
            boolean z11 = i12 > 0;
            b bVar = this.f52541a;
            ColorFilter colorFilter = this.f52547g;
            if (colorFilter == null) {
                colorFilter = this.f52548h;
            }
            ColorFilter colorFilter2 = colorFilter;
            boolean z12 = z10 && z11 && bVar.v() != 2 && i13 < 255 && (this.f52549i < 255 || colorFilter2 != null);
            RectF rectF2 = this.f52543c;
            if (z12) {
                Paint paint12 = this.f52550j;
                if (paint12 == null) {
                    paint12 = new Paint();
                    this.f52550j = paint12;
                }
                Paint paint13 = paint12;
                paint13.setDither(bVar.g());
                paint13.setAlpha(this.f52549i);
                paint13.setColorFilter(colorFilter2);
                rectF = rectF2;
                i10 = 2;
                canvas.saveLayer(rectF2.left - strokeWidth, rectF2.top - strokeWidth, rectF2.right + strokeWidth, rectF2.bottom + strokeWidth, paint13);
                paint9.setColorFilter(null);
                Paint paint14 = this.f52546f;
                if (paint14 != null) {
                    paint14.setColorFilter(null);
                }
            } else {
                rectF = rectF2;
                i10 = 2;
                paint9.setAlpha(i12);
                paint9.setDither(bVar.g());
                paint9.setColorFilter(colorFilter2);
                if (colorFilter2 != null && bVar.w() == null) {
                    paint9.setColor(this.f52549i << 24);
                }
                if (z10 && (paint = this.f52546f) != null) {
                    paint.setAlpha(i13);
                    paint.setDither(bVar.g());
                    paint.setColorFilter(colorFilter2);
                }
            }
            int iV = bVar.v();
            if (iV != 0) {
                if (iV == 1) {
                    canvas.drawOval(rectF, paint9);
                    if (z10 && (paint6 = this.f52546f) != null) {
                        canvas.drawOval(rectF, paint6);
                    }
                } else if (iV == i10) {
                    float fCenterY = rectF.centerY();
                    if (z10 && (paint7 = this.f52546f) != null) {
                        canvas.drawLine(rectF.left, fCenterY, rectF.right, fCenterY, paint7);
                    }
                } else if (iV == 3) {
                    Path path = this.f52552l;
                    if (path == null || this.f52553m) {
                        this.f52553m = false;
                        float level = (getLevel() * 360.0f) / 10000.0f;
                        RectF rectF3 = new RectF(rectF);
                        float fWidth = rectF3.width() / 2.0f;
                        float fHeight = rectF3.height() / 2.0f;
                        float fB = bVar.B() != -1 ? bVar.B() : rectF3.width() / bVar.C();
                        float fM = bVar.m() != -1 ? bVar.m() : rectF3.width() / bVar.n();
                        RectF rectF4 = new RectF(rectF3);
                        rectF4.inset(fWidth - fM, fHeight - fM);
                        RectF rectF5 = new RectF(rectF4);
                        float f10 = -fB;
                        rectF5.inset(f10, f10);
                        Path path2 = this.f52552l;
                        if (path2 != null) {
                            path2.reset();
                        } else {
                            path2 = new Path();
                            this.f52552l = path2;
                        }
                        if (level >= 360.0f || level <= -360.0f) {
                            path2.addOval(rectF5, Path.Direction.CW);
                            path2.addOval(rectF4, Path.Direction.CCW);
                        } else {
                            path2.setFillType(Path.FillType.EVEN_ODD);
                            float f11 = fWidth + fM;
                            path2.moveTo(f11, fHeight);
                            path2.lineTo(f11 + fB, fHeight);
                            path2.arcTo(rectF5, 0.0f, level, false);
                            path2.arcTo(rectF4, level, -level, false);
                            path2.close();
                        }
                        path2.addOval(rectF5, Path.Direction.CW);
                        path2.addOval(rectF4, Path.Direction.CCW);
                        path = path2;
                    }
                    canvas.drawPath(path, paint9);
                    if (z10 && (paint8 = this.f52546f) != null) {
                        canvas.drawPath(path, paint8);
                    }
                }
            } else if (bVar.u() != null) {
                b();
                Path path3 = this.f52542b;
                canvas.drawPath(path3, paint9);
                if (z10 && (paint4 = this.f52546f) != null) {
                    canvas.drawPath(path3, paint4);
                }
            } else if (bVar.t() > 0.0f) {
                float fMin = (float) Math.min(bVar.t(), Math.min(rectF.width(), rectF.height()) * 0.5f);
                canvas.drawRoundRect(rectF, fMin, fMin, paint9);
                if (z10 && (paint3 = this.f52546f) != null) {
                    canvas.drawRoundRect(rectF, fMin, fMin, paint3);
                }
            } else {
                if (paint9.getColor() != 0 || colorFilter2 != null || paint9.getShader() != null) {
                    canvas.drawRect(rectF, paint9);
                }
                if (z10 && (paint2 = this.f52546f) != null) {
                    canvas.drawRect(rectF, paint2);
                }
            }
            if (z12) {
                canvas.restore();
                return;
            }
            paint9.setAlpha(alpha);
            if (!z10 || (paint5 = this.f52546f) == null) {
                return;
            }
            paint5.setAlpha(alpha2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f52549i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f52541a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f52547g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        b bVar = this.f52541a;
        bVar.a(getChangingConfigurations());
        return bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f52541a.l();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f52541a.E();
    }

    @Override // android.graphics.drawable.Drawable
    @tu.f
    public int getOpacity() {
        if (this.f52549i != 255 || !this.f52541a.o()) {
            return -3;
        }
        Paint paint = this.f52546f;
        if (this.f52541a.A() < 0 || paint == null || z.a(paint.getColor())) {
            return (this.f52541a.h() != null || z.a(this.f52544d.getColor())) ? -1 : -3;
        }
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getOutline(android.graphics.Outline r9) {
        /*
            r8 = this;
            java.lang.String r0 = "outline"
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r0)
            dq.w$b r0 = r8.f52541a
            android.graphics.Paint r1 = r8.f52546f
            android.graphics.Rect r2 = r8.getBounds()
            java.lang.String r3 = "getBounds()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r3)
            boolean r3 = r0.p()
            r4 = 0
            if (r3 == 0) goto L40
            dq.w$b r3 = r8.f52541a
            int r3 = r3.A()
            android.graphics.Paint r5 = r8.f52544d
            if (r3 <= 0) goto L2f
            if (r1 == 0) goto L2f
            int r3 = r1.getAlpha()
            int r6 = r5.getAlpha()
            if (r3 != r6) goto L40
        L2f:
            int r3 = r5.getAlpha()
            int r5 = r8.f52549i
            int r6 = r5 >> 7
            int r5 = r5 + r6
            int r5 = r5 * r3
            int r3 = r5 >> 8
            float r3 = (float) r3
            r5 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r5
            goto L41
        L40:
            r3 = r4
        L41:
            r9.setAlpha(r3)
            int r3 = r0.v()
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r3 == 0) goto L7e
            r0 = 1
            if (r3 == r0) goto L7a
            r0 = 2
            if (r3 == r0) goto L53
            return
        L53:
            if (r1 == 0) goto L5b
            float r0 = r1.getStrokeWidth()
            float r0 = r0 * r5
            goto L5e
        L5b:
            r0 = 953267991(0x38d1b717, float:1.0E-4)
        L5e:
            int r1 = r2.centerY()
            float r1 = (float) r1
            float r3 = r1 - r0
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            int r3 = (int) r3
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r1 = r2.left
            int r2 = r2.right
            r9.setRect(r1, r3, r2, r0)
            return
        L7a:
            r9.setOval(r2)
            return
        L7e:
            float[] r1 = r0.u()
            if (r1 == 0) goto L9b
            r8.b()
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L93
            android.graphics.Path r0 = r8.f52542b
            r9.setPath(r0)
            return
        L93:
            float r0 = uu.k0.sum(r1)
            r9.setRoundRect(r2, r0)
            return
        L9b:
            float r1 = r0.t()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lbd
            float r0 = r0.t()
            double r0 = (double) r0
            int r3 = r2.width()
            double r3 = (double) r3
            int r6 = r2.height()
            double r6 = (double) r6
            double r3 = java.lang.Math.min(r3, r6)
            double r5 = (double) r5
            double r3 = r3 * r5
            double r0 = java.lang.Math.min(r0, r3)
            float r4 = (float) r0
        Lbd:
            r9.setRoundRect(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.w.getOutline(android.graphics.Outline):void");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        kotlin.jvm.internal.e0.checkNotNullParameter(padding, "padding");
        Rect rect = this.f52545e;
        if (rect == null) {
            return super.getPadding(padding);
        }
        padding.set(rect);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateListW;
        ColorStateList colorStateListX;
        ColorStateList colorStateListD;
        b bVar = this.f52541a;
        return super.isStateful() || ((colorStateListW = bVar.w()) != null && colorStateListW.isStateful()) || (((colorStateListX = bVar.x()) != null && colorStateListX.isStateful()) || ((colorStateListD = bVar.D()) != null && colorStateListD.isStateful()));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (super.mutate() == this) {
            this.f52541a = new b(this.f52541a);
            d();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        super.onBoundsChange(rect);
        this.f52552l = null;
        this.f52553m = true;
        this.f52551k = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        super.onLevelChange(i10);
        this.f52551k = true;
        this.f52553m = true;
        invalidateSelf();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r7) {
        /*
            r6 = this;
            java.lang.String r0 = "stateSet"
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r0)
            dq.w$b r0 = r6.f52541a
            android.content.res.ColorStateList r1 = r0.w()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L20
            int r1 = r1.getColorForState(r7, r3)
            android.graphics.Paint r4 = r6.f52544d
            int r5 = r4.getColor()
            if (r5 == r1) goto L20
            r4.setColor(r1)
            r1 = r2
            goto L21
        L20:
            r1 = r3
        L21:
            android.graphics.Paint r4 = r6.f52546f
            if (r4 == 0) goto L39
            android.content.res.ColorStateList r5 = r0.x()
            if (r5 == 0) goto L39
            int r7 = r5.getColorForState(r7, r3)
            int r5 = r4.getColor()
            if (r5 == r7) goto L39
            r4.setColor(r7)
            r1 = r2
        L39:
            android.content.res.ColorStateList r7 = r0.D()
            if (r7 == 0) goto L56
            android.graphics.BlendMode r7 = r0.b()
            if (r7 == 0) goto L56
            android.graphics.BlendModeColorFilter r7 = r6.f52548h
            android.content.res.ColorStateList r1 = r0.D()
            android.graphics.BlendMode r0 = r0.b()
            android.graphics.BlendModeColorFilter r7 = r6.a(r7, r1, r0)
            r6.f52548h = r7
            r1 = r2
        L56:
            if (r1 == 0) goto L5c
            r6.invalidateSelf()
            return r2
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.w.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f52549i != i10) {
            this.f52549i = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f52547g != colorFilter) {
            this.f52547g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    @tu.f
    public void setDither(boolean z10) {
        if (this.f52541a.g() != z10) {
            this.f52541a.a(z10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.f52541a.a(blendMode);
        this.f52548h = a(this.f52548h, this.f52541a.D(), blendMode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f52541a.b(colorStateList);
        this.f52548h = a(this.f52548h, colorStateList, this.f52541a.b());
        invalidateSelf();
    }

    public w() {
        this(new b(f52540n, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(y orientation, int[] iArr) {
        this(new b(orientation, iArr));
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
    }

    public w(b bVar) {
        this.f52542b = new Path();
        this.f52543c = new RectF();
        this.f52544d = new Paint(1);
        this.f52549i = 255;
        this.f52553m = true;
        this.f52541a = bVar;
        d();
    }

    public static /* synthetic */ void a(w wVar, int i10, int i11, float f10, float f11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f11 = 0.0f;
        }
        wVar.a(i10, i11, f10, f11);
    }

    public final void b() {
        b bVar = this.f52541a;
        if (this.f52553m) {
            c();
            Path path = this.f52542b;
            path.reset();
            float[] fArrU = bVar.u();
            if (fArrU != null) {
                path.addRoundRect(this.f52543c, fArrU, Path.Direction.CW);
            }
            this.f52553m = false;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.w.c():boolean");
    }

    public final void a(int i10, int i11, float f10, float f11) {
        this.f52541a.a(i10, ColorStateList.valueOf(i11), f10, f11);
        Paint paint = this.f52546f;
        if (paint == null) {
            paint = new Paint(1);
            this.f52546f = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
        paint.setPathEffect(f10 > 0.0f ? new DashPathEffect(new float[]{f10, f11}, 0.0f) : null);
        this.f52551k = true;
        invalidateSelf();
    }

    public static /* synthetic */ void a(w wVar, float f10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = 0.5f;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        wVar.a(f10, i10);
    }

    public final void a(float f10, int i10) {
        this.f52541a.a(f10, i10);
        this.f52551k = true;
        invalidateSelf();
    }

    public final BlendModeColorFilter a(BlendModeColorFilter blendModeColorFilter, ColorStateList colorStateList, BlendMode blendMode) {
        if (colorStateList == null || blendMode == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return blendModeColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        return (blendModeColorFilter != null && blendModeColorFilter.getColor() == colorForState && blendModeColorFilter.getMode() == blendMode) ? blendModeColorFilter : new BlendModeColorFilter(colorForState, blendMode);
    }
}
