package com.google.android.exoplayer2.ui;

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
/* loaded from: classes5.dex */
public final class p0 {
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
    public final float f28298a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28299b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28300c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28301d;

    /* renamed from: e, reason: collision with root package name */
    public final float f28302e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f28303f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f28304g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f28305h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f28306i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f28307j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f28308k;

    /* renamed from: l, reason: collision with root package name */
    public float f28309l;

    /* renamed from: m, reason: collision with root package name */
    public int f28310m;

    /* renamed from: n, reason: collision with root package name */
    public int f28311n;

    /* renamed from: o, reason: collision with root package name */
    public float f28312o;

    /* renamed from: p, reason: collision with root package name */
    public int f28313p;

    /* renamed from: q, reason: collision with root package name */
    public float f28314q;

    /* renamed from: r, reason: collision with root package name */
    public float f28315r;

    /* renamed from: s, reason: collision with root package name */
    public int f28316s;

    /* renamed from: t, reason: collision with root package name */
    public int f28317t;

    /* renamed from: u, reason: collision with root package name */
    public int f28318u;

    /* renamed from: v, reason: collision with root package name */
    public int f28319v;

    /* renamed from: w, reason: collision with root package name */
    public int f28320w;

    /* renamed from: x, reason: collision with root package name */
    public float f28321x;

    /* renamed from: y, reason: collision with root package name */
    public float f28322y;

    /* renamed from: z, reason: collision with root package name */
    public float f28323z;

    public p0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f28302e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f28301d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f28298a = fRound;
        this.f28299b = fRound;
        this.f28300c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f28303f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f28304g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f28305h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        Canvas canvas2;
        if (!z10) {
            com.google.android.exoplayer2.util.a.checkNotNull(this.J);
            com.google.android.exoplayer2.util.a.checkNotNull(this.f28308k);
            canvas.drawBitmap(this.f28308k, (Rect) null, this.J, this.f28305h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f28318u) > 0) {
            int i10 = this.f28318u;
            Paint paint = this.f28304g;
            paint.setColor(i10);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f28320w;
        TextPaint textPaint = this.f28303f;
        if (i11 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f28298a);
            textPaint.setColor(this.f28319v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f10 = this.f28299b;
            if (i11 == 2) {
                float f11 = this.f28300c;
                textPaint.setShadowLayer(f10, f11, f11, this.f28319v);
            } else if (i11 == 3 || i11 == 4) {
                boolean z11 = i11 == 3;
                int i12 = z11 ? -1 : this.f28319v;
                int i13 = z11 ? this.f28319v : -1;
                float f12 = f10 / 2.0f;
                textPaint.setColor(this.f28316s);
                textPaint.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                textPaint.setShadowLayer(f10, f13, f13, i12);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f10, f12, f12, i13);
            }
        }
        textPaint.setColor(this.f28316s);
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
    public void draw(ef.b r29, com.google.android.exoplayer2.ui.f r30, float r31, float r32, float r33, android.graphics.Canvas r34, int r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.p0.draw(ef.b, com.google.android.exoplayer2.ui.f, float, float, float, android.graphics.Canvas, int, int, int, int):void");
    }
}
