package e8;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class k {
    public static final Matrix B = new Matrix();
    public b A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f53942a;

    /* renamed from: b, reason: collision with root package name */
    public a f53943b;

    /* renamed from: c, reason: collision with root package name */
    public int f53944c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f53945d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f53946e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f53947f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f53948g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f53949h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f53950i;

    /* renamed from: j, reason: collision with root package name */
    public RectF f53951j;

    /* renamed from: k, reason: collision with root package name */
    public s7.a f53952k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f53953l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f53954m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f53955n;

    /* renamed from: o, reason: collision with root package name */
    public s7.a f53956o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f53957p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f53958q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f53959r;

    /* renamed from: s, reason: collision with root package name */
    public Bitmap f53960s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f53961t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f53962u;

    /* renamed from: v, reason: collision with root package name */
    public s7.a f53963v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f53964w;

    /* renamed from: x, reason: collision with root package name */
    public float f53965x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f53966y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f53967z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f53968a;

        /* renamed from: b, reason: collision with root package name */
        public b f53969b;

        public a() {
            reset();
        }

        public boolean hasBlendMode() {
            return false;
        }

        public boolean hasColorFilter() {
            return false;
        }

        public boolean hasShadow() {
            return this.f53969b != null;
        }

        public boolean isNoop() {
            return (isTranslucent() || hasBlendMode() || hasShadow() || hasColorFilter()) ? false : true;
        }

        public boolean isTranslucent() {
            return this.f53968a < 255;
        }

        public void reset() {
            this.f53968a = 255;
            this.f53969b = null;
        }
    }

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean c(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, b bVar) {
        if (this.f53946e == null) {
            this.f53946e = new RectF();
        }
        if (this.f53948g == null) {
            this.f53948g = new RectF();
        }
        this.f53946e.set(rectF);
        this.f53946e.offsetTo(bVar.getDx() + rectF.left, bVar.getDy() + rectF.top);
        this.f53946e.inset(-bVar.getRadius(), -bVar.getRadius());
        this.f53948g.set(rectF);
        this.f53946e.union(this.f53948g);
        return this.f53946e;
    }

    public boolean finishDecrementsCanvasSaveCount() {
        return this.f53944c == 4;
    }

    public Canvas start(Canvas canvas, RectF rectF, a aVar) {
        if (this.f53942a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f53958q == null) {
            this.f53958q = new float[9];
        }
        if (this.f53957p == null) {
            this.f53957p = new Matrix();
        }
        canvas.getMatrix(this.f53957p);
        this.f53957p.getValues(this.f53958q);
        float[] fArr = this.f53958q;
        float f10 = fArr[0];
        int i10 = 4;
        float f11 = fArr[4];
        if (this.f53951j == null) {
            this.f53951j = new RectF();
        }
        this.f53951j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f53942a = canvas;
        this.f53943b = aVar;
        if (aVar.isNoop()) {
            i10 = 1;
        } else if (aVar.hasShadow()) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 29 || !canvas.isHardwareAccelerated() || i11 <= 31) {
                i10 = 3;
            }
        } else {
            i10 = 2;
        }
        this.f53944c = i10;
        if (this.f53945d == null) {
            this.f53945d = new RectF();
        }
        this.f53945d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f53952k == null) {
            this.f53952k = new s7.a();
        }
        this.f53952k.reset();
        int iC = b3.h.c(this.f53944c);
        if (iC == 0) {
            canvas.save();
            return canvas;
        }
        if (iC == 1) {
            this.f53952k.setAlpha(aVar.f53968a);
            this.f53952k.setColorFilter(null);
            if (aVar.hasBlendMode()) {
                o3.d.setBlendMode(this.f53952k, null);
            }
            n.saveLayerCompat(canvas, rectF, this.f53952k);
            return canvas;
        }
        Matrix matrix = B;
        if (iC == 2) {
            if (this.f53956o == null) {
                s7.a aVar2 = new s7.a();
                this.f53956o = aVar2;
                aVar2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (c(this.f53953l, this.f53951j)) {
                Bitmap bitmap = this.f53953l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f53953l = a(this.f53951j, Bitmap.Config.ARGB_8888);
                this.f53954m = new Canvas(this.f53953l);
            } else {
                Canvas canvas2 = this.f53954m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(matrix);
                this.f53954m.drawRect(-1.0f, -1.0f, this.f53951j.width() + 1.0f, this.f53951j.height() + 1.0f, this.f53956o);
            }
            o3.d.setBlendMode(this.f53952k, null);
            this.f53952k.setColorFilter(null);
            this.f53952k.setAlpha(aVar.f53968a);
            Canvas canvas3 = this.f53954m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iC != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f53966y == null) {
            this.f53966y = new RenderNode("OffscreenLayer.main");
        }
        if (aVar.hasShadow() && this.f53967z == null) {
            this.f53967z = new RenderNode("OffscreenLayer.shadow");
            this.A = null;
        }
        if (aVar.hasBlendMode() || aVar.hasColorFilter()) {
            if (this.f53952k == null) {
                this.f53952k = new s7.a();
            }
            this.f53952k.reset();
            o3.d.setBlendMode(this.f53952k, null);
            this.f53952k.setColorFilter(null);
            this.f53966y.setUseCompositingLayer(true, this.f53952k);
            if (aVar.hasShadow()) {
                RenderNode renderNode = this.f53967z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f53952k);
            }
        }
        this.f53966y.setAlpha(aVar.f53968a / 255.0f);
        if (aVar.hasShadow()) {
            RenderNode renderNode2 = this.f53967z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f53968a / 255.0f);
        }
        this.f53966y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f53966y;
        RectF rectF2 = this.f53951j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f53966y.beginRecording((int) this.f53951j.width(), (int) this.f53951j.height());
        recordingCanvasBeginRecording.setMatrix(matrix);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }

    public void finish() {
        float f10;
        s7.a aVar;
        if (this.f53942a == null || this.f53943b == null || this.f53958q == null || this.f53945d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iC = b3.h.c(this.f53944c);
        if (iC == 0 || iC == 1) {
            this.f53942a.restore();
        } else {
            if (iC != 2) {
                if (iC == 3) {
                    if (this.f53966y == null) {
                        throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                    }
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 29) {
                        throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                    }
                    this.f53942a.save();
                    Canvas canvas = this.f53942a;
                    float[] fArr = this.f53958q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f53966y.endRecording();
                    if (this.f53943b.hasShadow()) {
                        Canvas canvas2 = this.f53942a;
                        b bVar = this.f53943b.f53969b;
                        if (this.f53966y == null || this.f53967z == null) {
                            throw new IllegalStateException(SUvoXnn.TiZTihEny);
                        }
                        if (i10 < 31) {
                            throw new RuntimeException("RenderEffect is not supported on API level <31");
                        }
                        float[] fArr2 = this.f53958q;
                        float f11 = fArr2 != null ? fArr2[0] : 1.0f;
                        f10 = fArr2 != null ? fArr2[4] : 1.0f;
                        b bVar2 = this.A;
                        if (bVar2 == null || !bVar.sameAs(bVar2)) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(bVar.getColor(), PorterDuff.Mode.SRC_IN));
                            if (bVar.getRadius() > 0.0f) {
                                float radius = ((f11 + f10) * bVar.getRadius()) / 2.0f;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(radius, radius, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f53967z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = bVar;
                        }
                        RectF rectFB = b(this.f53945d, bVar);
                        RectF rectF = new RectF(rectFB.left * f11, rectFB.top * f10, rectFB.right * f11, rectFB.bottom * f10);
                        this.f53967z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f53967z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((bVar.getDx() * f11) + (-rectF.left), (bVar.getDy() * f10) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f53966y);
                        this.f53967z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f53967z);
                        canvas2.restore();
                    }
                    this.f53942a.drawRenderNode(this.f53966y);
                    this.f53942a.restore();
                }
            } else {
                if (this.f53953l == null) {
                    throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                }
                if (this.f53943b.hasShadow()) {
                    Canvas canvas3 = this.f53942a;
                    b bVar3 = this.f53943b.f53969b;
                    RectF rectF2 = this.f53945d;
                    if (rectF2 == null || this.f53953l == null) {
                        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                    }
                    RectF rectFB2 = b(rectF2, bVar3);
                    if (this.f53947f == null) {
                        this.f53947f = new Rect();
                    }
                    this.f53947f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.f53958q;
                    float f12 = fArr3 != null ? fArr3[0] : 1.0f;
                    f10 = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f53949h == null) {
                        this.f53949h = new RectF();
                    }
                    this.f53949h.set(rectFB2.left * f12, rectFB2.top * f10, rectFB2.right * f12, rectFB2.bottom * f10);
                    if (this.f53950i == null) {
                        this.f53950i = new Rect();
                    }
                    this.f53950i.set(0, 0, Math.round(this.f53949h.width()), Math.round(this.f53949h.height()));
                    if (c(this.f53959r, this.f53949h)) {
                        Bitmap bitmap = this.f53959r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f53960s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f53959r = a(this.f53949h, Bitmap.Config.ARGB_8888);
                        this.f53960s = a(this.f53949h, Bitmap.Config.ALPHA_8);
                        this.f53961t = new Canvas(this.f53959r);
                        this.f53962u = new Canvas(this.f53960s);
                    } else {
                        Canvas canvas4 = this.f53961t;
                        if (canvas4 == null || this.f53962u == null || (aVar = this.f53956o) == null) {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                        }
                        canvas4.drawRect(this.f53950i, aVar);
                        this.f53962u.drawRect(this.f53950i, this.f53956o);
                    }
                    if (this.f53960s == null) {
                        throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                    }
                    if (this.f53963v == null) {
                        this.f53963v = new s7.a(1);
                    }
                    RectF rectF3 = this.f53945d;
                    this.f53962u.drawBitmap(this.f53953l, Math.round((rectF3.left - rectFB2.left) * f12), Math.round((rectF3.top - rectFB2.top) * f10), (Paint) null);
                    if (this.f53964w == null || this.f53965x != bVar3.getRadius()) {
                        float radius2 = ((f12 + f10) * bVar3.getRadius()) / 2.0f;
                        if (radius2 > 0.0f) {
                            this.f53964w = new BlurMaskFilter(radius2, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f53964w = null;
                        }
                        this.f53965x = bVar3.getRadius();
                    }
                    this.f53963v.setColor(bVar3.getColor());
                    if (bVar3.getRadius() > 0.0f) {
                        this.f53963v.setMaskFilter(this.f53964w);
                    } else {
                        this.f53963v.setMaskFilter(null);
                    }
                    this.f53963v.setFilterBitmap(true);
                    this.f53961t.drawBitmap(this.f53960s, Math.round(bVar3.getDx() * f12), Math.round(bVar3.getDy() * f10), this.f53963v);
                    canvas3.drawBitmap(this.f53959r, this.f53950i, this.f53947f, this.f53952k);
                }
                if (this.f53955n == null) {
                    this.f53955n = new Rect();
                }
                this.f53955n.set(0, 0, (int) (this.f53945d.width() * this.f53958q[0]), (int) (this.f53945d.height() * this.f53958q[4]));
                this.f53942a.drawBitmap(this.f53953l, this.f53955n, this.f53945d, this.f53952k);
            }
        }
        this.f53942a = null;
    }
}
