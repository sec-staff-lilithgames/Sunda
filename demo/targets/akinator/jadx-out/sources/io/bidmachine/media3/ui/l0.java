package io.bidmachine.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a, reason: collision with root package name */
    public final float f61838a;

    /* renamed from: b, reason: collision with root package name */
    public final float f61839b;

    /* renamed from: c, reason: collision with root package name */
    public final float f61840c;

    /* renamed from: d, reason: collision with root package name */
    public final float f61841d;

    /* renamed from: e, reason: collision with root package name */
    public final float f61842e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f61843f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f61844g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f61845h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f61846i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f61847j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f61848k;

    /* renamed from: l, reason: collision with root package name */
    public float f61849l;

    /* renamed from: m, reason: collision with root package name */
    public int f61850m;

    /* renamed from: n, reason: collision with root package name */
    public int f61851n;

    /* renamed from: o, reason: collision with root package name */
    public float f61852o;

    /* renamed from: p, reason: collision with root package name */
    public int f61853p;

    /* renamed from: q, reason: collision with root package name */
    public float f61854q;

    /* renamed from: r, reason: collision with root package name */
    public float f61855r;

    /* renamed from: s, reason: collision with root package name */
    public int f61856s;

    /* renamed from: t, reason: collision with root package name */
    public int f61857t;

    /* renamed from: u, reason: collision with root package name */
    public int f61858u;

    /* renamed from: v, reason: collision with root package name */
    public int f61859v;

    /* renamed from: w, reason: collision with root package name */
    public int f61860w;

    /* renamed from: x, reason: collision with root package name */
    public float f61861x;

    /* renamed from: y, reason: collision with root package name */
    public float f61862y;

    /* renamed from: z, reason: collision with root package name */
    public float f61863z;

    public l0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f61842e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f61841d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f61838a = fRound;
        this.f61839b = fRound;
        this.f61840c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f61843f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f61844g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f61845h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        Canvas canvas2;
        if (!z10) {
            io.bidmachine.media3.common.util.a.checkNotNull(this.J);
            io.bidmachine.media3.common.util.a.checkNotNull(this.f61848k);
            canvas.drawBitmap(this.f61848k, (Rect) null, this.J, this.f61845h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f61858u) > 0) {
            int i10 = this.f61858u;
            Paint paint = this.f61844g;
            paint.setColor(i10);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f61860w;
        TextPaint textPaint = this.f61843f;
        if (i11 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f61838a);
            textPaint.setColor(this.f61859v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f10 = this.f61839b;
            if (i11 == 2) {
                float f11 = this.f61840c;
                textPaint.setShadowLayer(f10, f11, f11, this.f61859v);
            } else if (i11 == 3 || i11 == 4) {
                boolean z11 = i11 == 3;
                int i12 = z11 ? -1 : this.f61859v;
                int i13 = z11 ? this.f61859v : -1;
                float f12 = f10 / 2.0f;
                textPaint.setColor(this.f61856s);
                textPaint.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                textPaint.setShadowLayer(f10, f13, f13, i12);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f10, f12, f12, i13);
            }
        }
        textPaint.setColor(this.f61856s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(in.b r29, io.bidmachine.media3.ui.d r30, float r31, float r32, float r33, android.graphics.Canvas r34, int r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.l0.draw(in.b, io.bidmachine.media3.ui.d, float, float, float, android.graphics.Canvas, int, int, int, int):void");
    }
}
