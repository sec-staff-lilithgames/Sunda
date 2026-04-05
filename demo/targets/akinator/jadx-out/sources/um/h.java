package um;

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f88574b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f88575c;

    /* renamed from: h, reason: collision with root package name */
    public int[] f88580h;

    /* renamed from: i, reason: collision with root package name */
    public int f88581i;

    /* renamed from: j, reason: collision with root package name */
    public float f88582j;

    /* renamed from: k, reason: collision with root package name */
    public float f88583k;

    /* renamed from: l, reason: collision with root package name */
    public float f88584l;

    /* renamed from: m, reason: collision with root package name */
    public float f88585m;

    /* renamed from: o, reason: collision with root package name */
    public int f88587o;

    /* renamed from: d, reason: collision with root package name */
    public float f88576d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f88577e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f88578f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f88579g = 5.0f;

    /* renamed from: n, reason: collision with root package name */
    public int f88586n = 255;

    /* renamed from: a, reason: collision with root package name */
    public final RectF f88573a = new RectF();

    public h() {
        Paint paint = new Paint();
        this.f88574b = paint;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f88575c = paint3;
        paint3.setColor(0);
        new Paint().setColor(0);
    }

    public final void a(int i10) {
        this.f88581i = i10;
        this.f88587o = this.f88580h[i10];
    }
}
