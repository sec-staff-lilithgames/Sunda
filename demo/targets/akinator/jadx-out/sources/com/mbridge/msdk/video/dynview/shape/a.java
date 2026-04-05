package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f44456a;

    /* renamed from: b, reason: collision with root package name */
    private float f44457b;

    /* renamed from: c, reason: collision with root package name */
    private float f44458c;

    /* renamed from: d, reason: collision with root package name */
    private int f44459d;

    /* renamed from: e, reason: collision with root package name */
    private int f44460e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f44461f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f44462g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44463h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f44464i;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f44465j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f44466a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f44467b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f44468c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f44469d;

        /* renamed from: e, reason: collision with root package name */
        private int f44470e;

        /* renamed from: f, reason: collision with root package name */
        private int f44471f;

        /* renamed from: g, reason: collision with root package name */
        private int f44472g;

        /* renamed from: h, reason: collision with root package name */
        private float f44473h;

        /* renamed from: i, reason: collision with root package name */
        private float f44474i;

        private b() {
            this.f44471f = 100;
            this.f44472g = 10;
            this.f44466a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(Bitmap bitmap) {
            this.f44468c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c b(Bitmap bitmap) {
            this.f44467b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(boolean z10) {
            this.f44469d = z10;
            return this;
        }

        public c b(float f10) {
            this.f44473h = f10;
            return this;
        }

        public c a(int i10) {
            this.f44470e = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(float f10) {
            this.f44474i = f10;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        c a(float f10);

        c a(Bitmap bitmap);

        c a(boolean z10);

        c b(Bitmap bitmap);
    }

    private void a(Canvas canvas) {
        float f10 = this.f44457b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f44458c);
        path.lineTo((f10 - this.f44459d) - this.f44460e, this.f44458c);
        path.lineTo((this.f44459d + f10) - this.f44460e, 0.0f);
        if (this.f44463h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f44461f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f44461f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f44459d + f10 + this.f44460e, 0.0f);
        path2.lineTo(this.f44457b, 0.0f);
        path2.lineTo(this.f44457b, this.f44458c);
        path2.lineTo((f10 - this.f44459d) + this.f44460e, this.f44458c);
        if (this.f44463h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f44462g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f44462g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f10 = this.f44458c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f44459d + f10) - this.f44460e);
        path.lineTo(this.f44457b, (f10 - this.f44459d) - this.f44460e);
        path.lineTo(this.f44457b, 0.0f);
        if (this.f44463h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f44461f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f44461f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f44459d + f10 + this.f44460e);
        path2.lineTo(0.0f, this.f44458c);
        path2.lineTo(this.f44457b, this.f44458c);
        path2.lineTo(this.f44457b, (f10 - this.f44459d) + this.f44460e);
        if (this.f44463h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f44462g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f44462g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f44456a == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private a(b bVar) {
        super(bVar.f44466a);
        this.f44463h = false;
        this.f44461f = bVar.f44467b;
        this.f44462g = bVar.f44468c;
        this.f44463h = bVar.f44469d;
        this.f44456a = bVar.f44470e;
        this.f44459d = bVar.f44471f;
        this.f44460e = bVar.f44472g;
        this.f44457b = bVar.f44473h;
        this.f44458c = bVar.f44474i;
        Paint paint = new Paint();
        this.f44464i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f44464i.setAntiAlias(true);
        this.f44465j = new Matrix();
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float fMax = Math.max(this.f44457b / bitmap.getWidth(), this.f44458c / bitmap.getHeight());
            if (this.f44465j == null) {
                this.f44465j = new Matrix();
            }
            this.f44465j.reset();
            this.f44465j.preScale(fMax, fMax);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f44465j);
        this.f44464i.setShader(bitmapShader);
        canvas.drawPath(path, this.f44464i);
    }

    private void a(Canvas canvas, Path path) {
        this.f44464i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f44464i);
    }

    public static b a() {
        return new b();
    }
}
