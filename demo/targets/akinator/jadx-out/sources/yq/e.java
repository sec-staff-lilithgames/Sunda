package yq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import br.p0;
import cr.q;
import dq.v;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e extends View implements dq.j {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f94795b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f94796c;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f94797e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f94798f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f94799g;

    /* renamed from: h, reason: collision with root package name */
    public final c f94800h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f94801i;

    /* renamed from: j, reason: collision with root package name */
    public d f94802j;

    /* renamed from: k, reason: collision with root package name */
    public b f94803k;

    /* renamed from: l, reason: collision with root package name */
    public float f94804l;

    /* renamed from: m, reason: collision with root package name */
    public float f94805m;

    /* renamed from: n, reason: collision with root package name */
    public float f94806n;

    /* renamed from: o, reason: collision with root package name */
    public float f94807o;

    /* renamed from: p, reason: collision with root package name */
    public int f94808p;

    /* renamed from: q, reason: collision with root package name */
    public byte f94809q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f94810r;

    public e(Context context) {
        super(context);
        this.f94798f = new RectF();
        this.f94799g = new RectF();
        c cVar = new c();
        cVar.f94791a = false;
        cVar.f94792b = 0L;
        cVar.f94793c = 0L;
        cVar.f94794d = 0L;
        this.f94800h = cVar;
        this.f94801i = new AtomicBoolean(false);
        this.f94807o = 100.0f;
        this.f94809q = (byte) -1;
        this.f94810r = false;
        Paint paint = new Paint(1);
        this.f94795b = paint;
        paint.setColor(v.f52538d);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f94796c = paint2;
        int i10 = v.f52537c;
        paint2.setColor(i10);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.f94797e = paint3;
        paint3.setColor(i10);
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        setLayerType(1, null);
        this.f94804l = q.dpToPx(context, 54.0f);
        this.f94805m = q.dpToPx(context, 54.0f);
        float fDpToPx = q.dpToPx(context, 3.0f);
        this.f94806n = fDpToPx;
        paint2.setStrokeWidth(fDpToPx);
        a();
    }

    @Override // dq.j
    public void a(br.o oVar) {
        p0 fontStyleType = oVar.getFontStyleType();
        if (fontStyleType != null) {
            this.f94797e.setTypeface(Typeface.create(Typeface.DEFAULT, fontStyleType.getTypeface()));
        }
        Integer fillColor = oVar.getFillColor();
        if (fillColor != null) {
            this.f94795b.setColor(fillColor.intValue());
        }
        Integer strokeWidthPx = oVar.getStrokeWidthPx(getContext());
        Paint paint = this.f94796c;
        if (strokeWidthPx != null) {
            float fIntValue = strokeWidthPx.intValue();
            this.f94806n = fIntValue;
            paint.setStrokeWidth(fIntValue);
        }
        Integer strokeColor = oVar.getStrokeColor();
        if (strokeColor != null) {
            paint.setColor(strokeColor.intValue());
        }
        a();
    }

    public void b() {
        g();
        this.f94802j = null;
    }

    public boolean c() {
        return this.f94810r;
    }

    public void e() {
        g();
        if (this.f94801i.get()) {
            return;
        }
        this.f94800h.h();
        b bVar = new b(this);
        this.f94803k = bVar;
        q.onUiThread(bVar, 16L);
    }

    public void f() {
        this.f94801i.set(false);
        this.f94800h.g();
        e();
    }

    public void g() {
        this.f94800h.f();
        b bVar = this.f94803k;
        if (bVar == null) {
            return;
        }
        q.cancelOnUiThread(bVar);
        this.f94803k = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || this.f94808p == 0) {
            return;
        }
        float f10 = (360.0f - ((this.f94807o * 360.0f) * 0.01f)) * this.f94809q;
        canvas.drawArc(this.f94798f, 0.0f, 360.0f, false, this.f94795b);
        canvas.drawArc(this.f94799g, 270.0f, f10, false, this.f94796c);
        String strValueOf = String.valueOf(this.f94808p);
        float f11 = this.f94804l;
        float f12 = this.f94805m;
        Paint paint = this.f94797e;
        canvas.drawText(strValueOf, f11, f12 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setClockwise(boolean z10) {
        if (z10) {
            this.f94809q = (byte) -1;
        } else {
            this.f94809q = (byte) 1;
        }
    }

    public void setDuration(long j10) {
        this.f94800h.a(j10);
    }

    public void setListener(d dVar) {
        this.f94802j = dVar;
    }

    public void setOnlyVisibleWork(boolean z10) {
        this.f94810r = z10;
    }

    public void a(float f10, int i10) {
        if (f10 >= 0.0f || f10 <= 100.0f) {
            this.f94807o = f10;
        }
        this.f94808p = i10;
        postInvalidate();
    }

    public final void a() {
        float width = (getWidth() - r0) / 2.0f;
        float height = (getHeight() - r0) / 2.0f;
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        RectF rectF = this.f94798f;
        rectF.set(width, height, width + fMin, fMin + height);
        this.f94804l = rectF.centerX();
        this.f94805m = rectF.centerY();
        float f10 = this.f94806n / 2.0f;
        this.f94799g.set(rectF.left + f10, rectF.top + f10, rectF.right - f10, rectF.bottom - f10);
        this.f94797e.setTextSize((rectF.width() - (this.f94806n * 2.0f)) * 0.70710677f * 0.9f);
    }
}
