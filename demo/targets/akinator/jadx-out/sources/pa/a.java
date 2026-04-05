package pa;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.TextureView;
import ka.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public int f80923b = 200;

    /* renamed from: c, reason: collision with root package name */
    public int f80924c = 400;

    /* renamed from: e, reason: collision with root package name */
    public float f80925e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f80926f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public long f80927g = System.currentTimeMillis();

    /* renamed from: h, reason: collision with root package name */
    public long f80928h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final e f80929i;

    /* renamed from: j, reason: collision with root package name */
    public final TextureView f80930j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint[] f80931k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f80932l;

    public a(TextureView textureView, e eVar) {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        Paint paint4 = new Paint(1);
        Paint paint5 = new Paint(1);
        this.f80931k = new Paint[]{paint5, paint, paint2, paint3, paint4};
        this.f80932l = false;
        this.f80930j = textureView;
        this.f80929i = eVar;
        paint.setColor(-16776961);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(-16711936);
        paint2.setStyle(style);
        paint4.setColor(-256);
        paint4.setStyle(style);
        paint3.setColor(-65536);
        paint3.setStyle(style);
        paint5.setColor(-1);
        paint5.setStyle(style);
    }

    public final void a(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        e eVar = this.f80929i;
        int[] particlesX = eVar.getParticlesX();
        int[] particlesY = eVar.getParticlesY();
        int[] temperatures = eVar.getTemperatures();
        int[] baseColors = eVar.getBaseColors();
        if (particlesX != null) {
            for (int i10 = 0; i10 < particlesX.length; i10++) {
                float f10 = particlesX[i10];
                float f11 = this.f80926f;
                canvas.drawCircle((f10 * f11) + 0.0f, this.f80925e - (particlesY[i10] * f11), (temperatures[i10] / 10.0f) * f11, this.f80931k[baseColors[i10]]);
            }
        }
    }

    public void doReadapt() {
        float f10 = this.f80923b;
        int i10 = this.f80924c;
        if (i10 < f10) {
            f10 = i10;
        }
        this.f80926f = (float) (f10 / 512.0d);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f80932l) {
            this.f80929i.doStep();
            if (!this.f80932l) {
                return;
            }
            Canvas canvasLockCanvas = this.f80930j.lockCanvas(null);
            try {
                a(canvasLockCanvas);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = (this.f80927g + 34) - jCurrentTimeMillis;
                this.f80927g = jCurrentTimeMillis;
                if (j10 > 0) {
                    Thread.sleep(j10);
                }
                if (this.f80928h + 1000 < jCurrentTimeMillis) {
                    this.f80928h = jCurrentTimeMillis;
                }
            } catch (Exception unused) {
                if (canvasLockCanvas != null) {
                }
            } catch (Throwable th2) {
                if (canvasLockCanvas != null) {
                    this.f80930j.unlockCanvasAndPost(canvasLockCanvas);
                }
                throw th2;
            }
            this.f80930j.unlockCanvasAndPost(canvasLockCanvas);
        }
    }

    public void setRunning(boolean z10) {
        this.f80932l = z10;
    }

    public void setSurfaceSize(int i10, int i11) {
        if (this.f80924c == i10 && this.f80923b == i11) {
            return;
        }
        this.f80924c = i10;
        this.f80923b = i11;
        this.f80925e = i11;
        doReadapt();
    }
}
