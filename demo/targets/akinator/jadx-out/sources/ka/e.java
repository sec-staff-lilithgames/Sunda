package ka;

import androidx.core.app.NotificationCompat;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f70715a = null;

    /* renamed from: b, reason: collision with root package name */
    public int[] f70716b = null;

    /* renamed from: c, reason: collision with root package name */
    public int[] f70717c = null;

    /* renamed from: d, reason: collision with root package name */
    public int[] f70718d = null;

    /* renamed from: e, reason: collision with root package name */
    public float f70719e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float[] f70720f = null;

    /* renamed from: g, reason: collision with root package name */
    public float[] f70721g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f70722h = NotificationCompat.FLAG_LOCAL_ONLY;

    /* renamed from: i, reason: collision with root package name */
    public int f70723i = NotificationCompat.FLAG_LOCAL_ONLY;

    /* renamed from: j, reason: collision with root package name */
    public int f70724j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f70725k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Random f70726l = new Random();

    /* renamed from: m, reason: collision with root package name */
    public final int f70727m = 100;

    /* renamed from: n, reason: collision with root package name */
    public int f70728n = 0;

    /* renamed from: o, reason: collision with root package name */
    public d f70729o = d.f70711c;

    public synchronized d doStep() {
        try {
            int i10 = this.f70728n + 1;
            this.f70728n = i10;
            d dVar = this.f70729o;
            d dVar2 = d.f70711c;
            if (dVar == dVar2) {
                int i11 = this.f70727m;
                this.f70715a = new int[i11];
                this.f70716b = new int[i11];
                this.f70717c = new int[i11];
                this.f70718d = new int[i11];
                this.f70720f = new float[i11];
                this.f70721g = new float[i11];
                this.f70724j = this.f70726l.nextInt(4) + 1;
                this.f70725k = this.f70726l.nextInt(4) + 1;
                this.f70726l.nextFloat();
                this.f70722h = this.f70726l.nextInt(512);
                this.f70723i = (int) (Math.sqrt((r0 * 512) + (-(r0 * r0))) + (((int) (this.f70719e * 512.0f)) - 256));
                float fNextFloat = (this.f70726l.nextFloat() * 100.0f) + 150.0f;
                for (int i12 = 0; i12 < this.f70727m; i12++) {
                    this.f70720f[i12] = this.f70726l.nextFloat() * 3.14158f * 2.0f;
                    this.f70721g[i12] = (this.f70726l.nextFloat() * fNextFloat) / 50.0f;
                }
                this.f70729o = d.f70710b;
                this.f70728n = 0;
            } else if (dVar == d.f70710b) {
                if (i10 >= 50) {
                    this.f70729o = dVar2;
                    this.f70715a = null;
                    this.f70716b = null;
                    this.f70717c = null;
                    this.f70718d = null;
                    this.f70728n = 0;
                } else {
                    int i13 = 50 - i10;
                    for (int i14 = 0; i14 < this.f70727m; i14++) {
                        this.f70715a[i14] = (int) ((Math.cos(this.f70720f[i14]) * this.f70721g[i14] * this.f70728n) + this.f70722h);
                        int[] iArr = this.f70716b;
                        double dSin = Math.sin(this.f70720f[i14]);
                        float f10 = this.f70721g[i14];
                        iArr[i14] = (int) ((((dSin * f10) * this.f70728n) - (1.0f * r6)) + this.f70723i);
                        this.f70717c[i14] = i13;
                        this.f70718d[i14] = f10 < 0.7f ? this.f70724j : this.f70725k;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f70729o;
    }

    public final synchronized int[] getBaseColors() {
        int[] iArr;
        iArr = this.f70718d;
        return iArr == null ? null : (int[]) iArr.clone();
    }

    public final synchronized int[] getParticlesX() {
        int[] iArr;
        iArr = this.f70715a;
        return iArr == null ? null : (int[]) iArr.clone();
    }

    public final synchronized int[] getParticlesY() {
        int[] iArr;
        iArr = this.f70716b;
        return iArr == null ? null : (int[]) iArr.clone();
    }

    public synchronized d getStepSimuletion() {
        return this.f70729o;
    }

    public final synchronized int[] getTemperatures() {
        int[] iArr;
        iArr = this.f70717c;
        return iArr == null ? null : (int[]) iArr.clone();
    }

    public void setRatioYX(float f10) {
        this.f70719e = f10;
    }
}
