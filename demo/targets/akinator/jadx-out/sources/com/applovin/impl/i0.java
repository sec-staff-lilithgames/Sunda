package com.applovin.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i0 extends View {

    /* renamed from: w, reason: collision with root package name */
    private static final int f14101w = Color.rgb(66, 145, 241);

    /* renamed from: x, reason: collision with root package name */
    private static final int f14102x = Color.rgb(66, 145, 241);

    /* renamed from: y, reason: collision with root package name */
    private static final int f14103y = Color.rgb(66, 145, 241);

    /* renamed from: a, reason: collision with root package name */
    private Paint f14104a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f14105b;

    /* renamed from: c, reason: collision with root package name */
    protected Paint f14106c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f14107d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f14108e;

    /* renamed from: f, reason: collision with root package name */
    private float f14109f;

    /* renamed from: g, reason: collision with root package name */
    private int f14110g;

    /* renamed from: h, reason: collision with root package name */
    private int f14111h;

    /* renamed from: i, reason: collision with root package name */
    private int f14112i;

    /* renamed from: j, reason: collision with root package name */
    private int f14113j;

    /* renamed from: k, reason: collision with root package name */
    private int f14114k;

    /* renamed from: l, reason: collision with root package name */
    private float f14115l;

    /* renamed from: m, reason: collision with root package name */
    private int f14116m;

    /* renamed from: n, reason: collision with root package name */
    private String f14117n;

    /* renamed from: o, reason: collision with root package name */
    private String f14118o;

    /* renamed from: p, reason: collision with root package name */
    private float f14119p;

    /* renamed from: q, reason: collision with root package name */
    private String f14120q;

    /* renamed from: r, reason: collision with root package name */
    private float f14121r;

    /* renamed from: s, reason: collision with root package name */
    private final float f14122s;

    /* renamed from: t, reason: collision with root package name */
    private final float f14123t;

    /* renamed from: u, reason: collision with root package name */
    private final float f14124u;

    /* renamed from: v, reason: collision with root package name */
    private final int f14125v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static float c(Resources resources, float f10) {
            return (f10 * resources.getDisplayMetrics().density) + 0.5f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float d(Resources resources, float f10) {
            return f10 * resources.getDisplayMetrics().scaledDensity;
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    private float getProgressAngle() {
        return (getProgress() / this.f14113j) * 360.0f;
    }

    public void a() {
        this.f14114k = f14101w;
        this.f14110g = f14102x;
        this.f14109f = this.f14123t;
        setMax(100);
        setProgress(0);
        this.f14115l = this.f14122s;
        this.f14116m = 0;
        this.f14119p = this.f14124u;
        this.f14111h = f14103y;
    }

    public void b() {
        TextPaint textPaint = new TextPaint();
        this.f14106c = textPaint;
        textPaint.setColor(this.f14110g);
        this.f14106c.setTextSize(this.f14109f);
        this.f14106c.setAntiAlias(true);
        TextPaint textPaint2 = new TextPaint();
        this.f14107d = textPaint2;
        textPaint2.setColor(this.f14111h);
        this.f14107d.setTextSize(this.f14119p);
        this.f14107d.setAntiAlias(true);
        Paint paint = new Paint();
        this.f14104a = paint;
        paint.setColor(this.f14114k);
        this.f14104a.setStyle(Paint.Style.STROKE);
        this.f14104a.setAntiAlias(true);
        this.f14104a.setStrokeWidth(this.f14115l);
        Paint paint2 = new Paint();
        this.f14105b = paint2;
        paint2.setColor(this.f14116m);
        this.f14105b.setAntiAlias(true);
    }

    public int getFinishedStrokeColor() {
        return this.f14114k;
    }

    public float getFinishedStrokeWidth() {
        return this.f14115l;
    }

    public int getInnerBackgroundColor() {
        return this.f14116m;
    }

    public String getInnerBottomText() {
        return this.f14120q;
    }

    public int getInnerBottomTextColor() {
        return this.f14111h;
    }

    public float getInnerBottomTextSize() {
        return this.f14119p;
    }

    public int getMax() {
        return this.f14113j;
    }

    public String getPrefixText() {
        return this.f14117n;
    }

    public int getProgress() {
        return this.f14112i;
    }

    public String getSuffixText() {
        return this.f14118o;
    }

    public int getTextColor() {
        return this.f14110g;
    }

    public float getTextSize() {
        return this.f14109f;
    }

    @Override // android.view.View
    public void invalidate() {
        b();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f14115l;
        this.f14108e.set(f10, f10, getWidth() - f10, getHeight() - f10);
        float width = getWidth();
        float f11 = this.f14115l;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, ((width - f11) + f11) / 2.0f, this.f14105b);
        canvas.drawArc(this.f14108e, 270.0f, -getProgressAngle(), false, this.f14104a);
        String str = this.f14117n + this.f14112i + this.f14118o;
        if (!TextUtils.isEmpty(str)) {
            canvas.drawText(str, (getWidth() - this.f14106c.measureText(str)) / 2.0f, (getWidth() - (this.f14106c.ascent() + this.f14106c.descent())) / 2.0f, this.f14106c);
        }
        if (TextUtils.isEmpty(getInnerBottomText())) {
            return;
        }
        this.f14107d.setTextSize(this.f14119p);
        canvas.drawText(getInnerBottomText(), (getWidth() - this.f14107d.measureText(getInnerBottomText())) / 2.0f, (getHeight() - this.f14121r) - ((this.f14106c.ascent() + this.f14106c.descent()) / 2.0f), this.f14107d);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(a(i10), a(i11));
        this.f14121r = getHeight() - ((getHeight() * 3) / 4);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f14110g = bundle.getInt("text_color");
        this.f14109f = bundle.getFloat("text_size");
        this.f14119p = bundle.getFloat("inner_bottom_text_size");
        this.f14120q = bundle.getString("inner_bottom_text");
        this.f14111h = bundle.getInt("inner_bottom_text_color");
        this.f14114k = bundle.getInt("finished_stroke_color");
        this.f14115l = bundle.getFloat("finished_stroke_width");
        this.f14116m = bundle.getInt("inner_background_color");
        b();
        setMax(bundle.getInt("max"));
        setProgress(bundle.getInt(NotificationCompat.CATEGORY_PROGRESS));
        this.f14117n = bundle.getString("prefix");
        this.f14118o = bundle.getString("suffix");
        super.onRestoreInstanceState(bundle.getParcelable("saved_instance"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_instance", super.onSaveInstanceState());
        bundle.putInt("text_color", getTextColor());
        bundle.putFloat("text_size", getTextSize());
        bundle.putFloat("inner_bottom_text_size", getInnerBottomTextSize());
        bundle.putFloat("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putString("inner_bottom_text", getInnerBottomText());
        bundle.putInt("inner_bottom_text_color", getInnerBottomTextColor());
        bundle.putInt("finished_stroke_color", getFinishedStrokeColor());
        bundle.putInt("max", getMax());
        bundle.putInt(NotificationCompat.CATEGORY_PROGRESS, getProgress());
        bundle.putString("suffix", getSuffixText());
        bundle.putString("prefix", getPrefixText());
        bundle.putFloat("finished_stroke_width", getFinishedStrokeWidth());
        bundle.putInt("inner_background_color", getInnerBackgroundColor());
        return bundle;
    }

    public void setFinishedStrokeColor(int i10) {
        this.f14114k = i10;
        invalidate();
    }

    public void setFinishedStrokeWidth(float f10) {
        this.f14115l = f10;
        invalidate();
    }

    public void setInnerBackgroundColor(int i10) {
        this.f14116m = i10;
        invalidate();
    }

    public void setInnerBottomText(String str) {
        this.f14120q = str;
        invalidate();
    }

    public void setInnerBottomTextColor(int i10) {
        this.f14111h = i10;
        invalidate();
    }

    public void setInnerBottomTextSize(float f10) {
        this.f14119p = f10;
        invalidate();
    }

    public void setMax(int i10) {
        if (i10 > 0) {
            this.f14113j = i10;
            invalidate();
        }
    }

    public void setPrefixText(String str) {
        this.f14117n = str;
        invalidate();
    }

    public void setProgress(int i10) {
        this.f14112i = i10;
        if (i10 > getMax()) {
            this.f14112i %= getMax();
        }
        invalidate();
    }

    public void setSuffixText(String str) {
        this.f14118o = str;
        invalidate();
    }

    public void setTextColor(int i10) {
        this.f14110g = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f14109f = f10;
        invalidate();
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14108e = new RectF();
        this.f14112i = 0;
        this.f14117n = "";
        this.f14118o = "";
        this.f14120q = "";
        this.f14123t = a.d(getResources(), 14.0f);
        this.f14125v = (int) a.c(getResources(), 100.0f);
        this.f14122s = a.c(getResources(), 4.0f);
        this.f14124u = a.d(getResources(), 18.0f);
        a();
        b();
    }

    private int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int i11 = this.f14125v;
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }
}
