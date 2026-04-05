package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.component.adexpress.jj.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends View {

    /* renamed from: au, reason: collision with root package name */
    private PorterDuff.Mode f18435au;

    /* renamed from: cm, reason: collision with root package name */
    private int f18436cm;

    /* renamed from: if, reason: not valid java name */
    private Xfermode f59if;

    /* renamed from: jd, reason: collision with root package name */
    Rect f18437jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18438jj;
    Rect jpo;

    /* renamed from: ju, reason: collision with root package name */
    private Paint f18439ju;
    private int my;
    private LinearGradient oya;
    private final List<jpo> prr;

    /* renamed from: qk, reason: collision with root package name */
    private int f18440qk;
    private int wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private Bitmap f18441yd;
    private int[] zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.adexpress.jj.if$jpo */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        private int f18442jd = 0;
        private final int jpo;

        public jpo(int i10) {
            this.jpo = i10;
        }

        public void jpo() {
            this.f18442jd += this.jpo;
        }
    }

    public Cif(Context context) {
        super(context);
        this.f18435au = PorterDuff.Mode.DST_IN;
        this.prr = new ArrayList();
        jpo();
    }

    private void jpo() {
        this.wqx = com.bytedance.sdk.component.utils.dt.cm(getContext(), "tt_splash_unlock_image_arrow");
        this.f18436cm = Color.parseColor("#00ffffff");
        this.my = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.f18438jj = color;
        this.f18440qk = 10;
        this.xyk = 40;
        this.zz = new int[]{this.f18436cm, this.my, color};
        setLayerType(1, null);
        this.f18439ju = new Paint(1);
        this.f18441yd = BitmapFactory.decodeResource(getResources(), this.wqx);
        this.f59if = new PorterDuffXfermode(this.f18435au);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f18441yd, this.jpo, this.f18437jd, this.f18439ju);
        canvas.save();
        Iterator<jpo> it = this.prr.iterator();
        while (it.hasNext()) {
            jpo next = it.next();
            this.oya = new LinearGradient(next.f18442jd, 0.0f, next.f18442jd + this.xyk, this.f18440qk, this.zz, (float[]) null, Shader.TileMode.CLAMP);
            this.f18439ju.setColor(-1);
            this.f18439ju.setShader(this.oya);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f18439ju);
            this.f18439ju.setShader(null);
            next.jpo();
            if (next.f18442jd > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.f18439ju.setXfermode(this.f59if);
        canvas3.drawBitmap(this.f18441yd, this.jpo, this.f18437jd, this.f18439ju);
        this.f18439ju.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f18441yd == null) {
            return;
        }
        this.jpo = new Rect(0, 0, this.f18441yd.getWidth(), this.f18441yd.getHeight());
        this.f18437jd = new Rect(0, 0, getWidth(), getHeight());
    }

    public void jpo(int i10) {
        this.prr.add(new jpo(i10));
        postInvalidate();
    }
}
