package y2;

import a3.c0;
import a3.d0;
import a3.i;
import a3.i0;
import a3.k0;
import a3.m;
import a3.m0;
import a3.p;
import a3.u;
import a3.x;
import androidx.core.app.NotificationCompat;
import j1.o2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e implements i0 {
    public h A;
    public int B;
    public float C;
    public d D;
    public e E;

    /* renamed from: a, reason: collision with root package name */
    public h f93961a;

    /* renamed from: b, reason: collision with root package name */
    public int f93962b;

    /* renamed from: c, reason: collision with root package name */
    public final g f93963c;

    /* renamed from: d, reason: collision with root package name */
    public final g f93964d;

    /* renamed from: e, reason: collision with root package name */
    public final f f93965e;

    /* renamed from: f, reason: collision with root package name */
    public final f f93966f;

    /* renamed from: g, reason: collision with root package name */
    public a3.d[] f93967g;

    /* renamed from: h, reason: collision with root package name */
    public a3.d f93968h;

    /* renamed from: i, reason: collision with root package name */
    public float f93969i;

    /* renamed from: j, reason: collision with root package name */
    public float f93970j;

    /* renamed from: k, reason: collision with root package name */
    public float f93971k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f93972l;

    /* renamed from: m, reason: collision with root package name */
    public double[] f93973m;

    /* renamed from: n, reason: collision with root package name */
    public double[] f93974n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f93975o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f93976p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f93977q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f93978r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f93979s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f93980t;

    /* renamed from: u, reason: collision with root package name */
    public HashMap f93981u;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f93982v;

    /* renamed from: w, reason: collision with root package name */
    public HashMap f93983w;

    /* renamed from: x, reason: collision with root package name */
    public z2.f[] f93984x;

    /* renamed from: y, reason: collision with root package name */
    public int f93985y;

    /* renamed from: z, reason: collision with root package name */
    public int f93986z;

    public e(h hVar) {
        new u();
        this.f93962b = 0;
        this.f93963c = new g();
        this.f93964d = new g();
        this.f93965e = new f();
        this.f93966f = new f();
        this.f93969i = Float.NaN;
        this.f93970j = 0.0f;
        this.f93971k = 1.0f;
        this.f93977q = new float[4];
        this.f93978r = new ArrayList();
        this.f93979s = new float[1];
        this.f93980t = new ArrayList();
        this.f93985y = -1;
        this.f93986z = -1;
        this.A = null;
        this.B = -1;
        this.C = Float.NaN;
        this.D = null;
        setView(hVar);
    }

    public final float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f93971k;
            if (f12 != 1.0d) {
                float f13 = this.f93970j;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        a3.g gVar = this.f93963c.f94001b;
        Iterator it = this.f93978r.iterator();
        float f14 = Float.NaN;
        while (it.hasNext()) {
            g gVar2 = (g) it.next();
            a3.g gVar3 = gVar2.f94001b;
            if (gVar3 != null) {
                float f15 = gVar2.f94003e;
                if (f15 < f10) {
                    gVar = gVar3;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = gVar2.f94003e;
                }
            }
        }
        if (gVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) gVar.get(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) gVar.getDiff(d10);
            }
        }
        return f10;
    }

    public void addKey(z2.a aVar) {
        this.f93980t.add(aVar);
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f93967g[0].getTimePoints();
        ArrayList arrayList = this.f93978r;
        if (iArr != null) {
            Iterator it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = ((g) it.next()).f94015q;
                i10++;
            }
        }
        if (iArr2 != null) {
            Iterator it2 = arrayList.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                iArr2[i11] = (int) (((g) it2.next()).f94004f * 100.0f);
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < timePoints.length; i13++) {
            this.f93967g[0].getPos(timePoints[i13], this.f93973m);
            this.f93963c.b(timePoints[i13], this.f93972l, this.f93973m, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void buildPath(float[] fArr, int i10) {
        int i11 = i10;
        float f10 = 1.0f;
        float f11 = 1.0f / (i11 - 1);
        HashMap map = this.f93982v;
        x xVar = map == null ? null : (x) map.get("translationX");
        HashMap map2 = this.f93982v;
        x xVar2 = map2 == null ? null : (x) map2.get("translationY");
        HashMap map3 = this.f93983w;
        m mVar = map3 == null ? null : (m) map3.get("translationX");
        HashMap map4 = this.f93983w;
        m mVar2 = map4 != null ? (m) map4.get("translationY") : null;
        int i12 = 0;
        while (i12 < i11) {
            float fMin = i12 * f11;
            float f12 = this.f93971k;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f93970j;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double d10 = fMin;
            a3.g gVar = this.f93963c.f94001b;
            Iterator it = this.f93978r.iterator();
            float f15 = Float.NaN;
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                a3.g gVar3 = gVar2.f94001b;
                if (gVar3 != null) {
                    float f16 = gVar2.f94003e;
                    if (f16 < fMin) {
                        f13 = f16;
                        gVar = gVar3;
                    } else if (Float.isNaN(f15)) {
                        f15 = gVar2.f94003e;
                    }
                }
            }
            if (gVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                d10 = (((float) gVar.get((fMin - f13) / r16)) * (f15 - f13)) + f13;
            }
            this.f93967g[0].getPos(d10, this.f93973m);
            a3.d dVar = this.f93968h;
            if (dVar != null) {
                double[] dArr = this.f93973m;
                if (dArr.length > 0) {
                    dVar.getPos(d10, dArr);
                }
            }
            int i13 = i12 * 2;
            this.f93963c.b(d10, this.f93972l, this.f93973m, fArr, i13);
            if (mVar != null) {
                fArr[i13] = mVar.get(fMin) + fArr[i13];
            } else if (xVar != null) {
                fArr[i13] = xVar.get(fMin) + fArr[i13];
            }
            if (mVar2 != null) {
                int i14 = i13 + 1;
                fArr[i14] = mVar2.get(fMin) + fArr[i14];
            } else if (xVar2 != null) {
                int i15 = i13 + 1;
                fArr[i15] = xVar2.get(fMin) + fArr[i15];
            }
            i12++;
            i11 = i10;
            f10 = 1.0f;
        }
    }

    public void buildRect(float f10, float[] fArr, int i10) {
        this.f93967g[0].getPos(a(f10, null), this.f93973m);
        int[] iArr = this.f93972l;
        double[] dArr = this.f93973m;
        g gVar = this.f93963c;
        float f11 = gVar.f94005g;
        float fCos = gVar.f94006h;
        float f12 = gVar.f94007i;
        float f13 = gVar.f94008j;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f11 = f14;
            } else if (i12 == 2) {
                fCos = f14;
            } else if (i12 == 3) {
                f12 = f14;
            } else if (i12 == 4) {
                f13 = f14;
            }
        }
        e eVar = gVar.f94013o;
        if (eVar != null) {
            float centerX = eVar.getCenterX();
            float centerY = gVar.f94013o.getCenterY();
            double d10 = f11;
            double d11 = fCos;
            float fSin = (float) (((Math.sin(d11) * d10) + centerX) - (f12 / 2.0f));
            fCos = (float) ((centerY - (Math.cos(d11) * d10)) - (f13 / 2.0f));
            f11 = fSin;
        }
        float f15 = f12 + f11;
        float f16 = f13 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f17 = f11 + 0.0f;
        float f18 = fCos + 0.0f;
        float f19 = f15 + 0.0f;
        float f20 = f16 + 0.0f;
        fArr[i10] = f17;
        fArr[i10 + 1] = f18;
        fArr[i10 + 2] = f19;
        fArr[i10 + 3] = f18;
        fArr[i10 + 4] = f19;
        fArr[i10 + 5] = f20;
        fArr[i10 + 6] = f17;
        fArr[i10 + 7] = f20;
    }

    public String getAnimateRelativeTo() {
        return this.f93963c.f94011m;
    }

    public void getCenter(double d10, float[] fArr, float[] fArr2) {
        float f10;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f93967g[0].getPos(d10, dArr);
        this.f93967g[0].getSlope(d10, dArr2);
        float f11 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f93972l;
        g gVar = this.f93963c;
        float f12 = gVar.f94005g;
        float f13 = gVar.f94006h;
        float f14 = gVar.f94007i;
        float f15 = gVar.f94008j;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f19 = (float) dArr[i10];
            float f20 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f19;
                f11 = f20;
            } else if (i11 == 2) {
                f13 = f19;
                f18 = f20;
            } else if (i11 == 3) {
                f14 = f19;
                f16 = f20;
            } else if (i11 == 4) {
                f15 = f19;
                f17 = f20;
            }
        }
        float fCos = (f16 / 2.0f) + f11;
        float fSin = (f17 / 2.0f) + f18;
        e eVar = gVar.f94013o;
        if (eVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            eVar.getCenter(d10, fArr3, fArr4);
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            double d11 = f12;
            double d12 = f13;
            float fSin2 = (float) (((Math.sin(d12) * d11) + f21) - (f14 / 2.0f));
            float fCos2 = (float) ((f22 - (Math.cos(d12) * d11)) - (f15 / 2.0f));
            double d13 = f11;
            double d14 = f18;
            f10 = 2.0f;
            f13 = fCos2;
            fCos = (float) ((Math.cos(d12) * d14) + (Math.sin(d12) * d13) + f23);
            fSin = (float) ((Math.sin(d12) * d14) + (f24 - (Math.cos(d12) * d13)));
            f12 = fSin2;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = (f14 / f10) + f12 + 0.0f;
        fArr[1] = (f15 / f10) + f13 + 0.0f;
        fArr2[0] = fCos;
        fArr2[1] = fSin;
    }

    public float getCenterX() {
        return 0.0f;
    }

    public float getCenterY() {
        return 0.0f;
    }

    public void getDpDt(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f93979s;
        float fA = a(f10, fArr2);
        a3.d[] dVarArr = this.f93967g;
        g gVar = this.f93963c;
        int i10 = 0;
        if (dVarArr == null) {
            g gVar2 = this.f93964d;
            float f13 = gVar2.f94005g - gVar.f94005g;
            float f14 = gVar2.f94006h - gVar.f94006h;
            float f15 = gVar2.f94007i - gVar.f94007i;
            float f16 = (gVar2.f94008j - gVar.f94008j) + f14;
            fArr[0] = ((f15 + f13) * f11) + ((1.0f - f11) * f13);
            fArr[1] = (f16 * f12) + ((1.0f - f12) * f14);
            return;
        }
        double d10 = fA;
        dVarArr[0].getSlope(d10, this.f93974n);
        this.f93967g[0].getPos(d10, this.f93973m);
        float f17 = fArr2[0];
        while (true) {
            dArr = this.f93974n;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * f17;
            i10++;
        }
        a3.d dVar = this.f93968h;
        if (dVar == null) {
            int[] iArr = this.f93972l;
            gVar.getClass();
            g.c(f11, f12, fArr, iArr, dArr);
            return;
        }
        double[] dArr2 = this.f93973m;
        if (dArr2.length > 0) {
            dVar.getPos(d10, dArr2);
            this.f93968h.getSlope(d10, this.f93974n);
            int[] iArr2 = this.f93972l;
            double[] dArr3 = this.f93974n;
            gVar.getClass();
            g.c(f11, f12, fArr, iArr2, dArr3);
        }
    }

    public int getDrawPath() {
        int iMax = this.f93963c.f94002c;
        Iterator it = this.f93978r.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((g) it.next()).f94002c);
        }
        return Math.max(iMax, this.f93964d.f94002c);
    }

    public float getFinalHeight() {
        return this.f93964d.f94008j;
    }

    public float getFinalWidth() {
        return this.f93964d.f94007i;
    }

    public float getFinalX() {
        return this.f93964d.f94005g;
    }

    public float getFinalY() {
        return this.f93964d.f94006h;
    }

    @Override // a3.i0
    public int getId(String str) {
        return 0;
    }

    public g getKeyFrame(int i10) {
        return (g) this.f93978r.get(i10);
    }

    public int getKeyFrameInfo(int i10, int[] iArr) {
        float[] fArr = new float[2];
        Iterator it = this.f93980t.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            z2.a aVar = (z2.a) it.next();
            int i13 = aVar.f97455b;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                iArr[i12 + 1] = i13;
                int i14 = aVar.f97454a;
                iArr[i12 + 2] = i14;
                double d10 = i14 / 100.0f;
                this.f93967g[0].getPos(d10, this.f93973m);
                this.f93963c.b(d10, this.f93972l, this.f93973m, fArr, 0);
                iArr[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i15 = i12 + 4;
                iArr[i15] = Float.floatToIntBits(fArr[1]);
                if (aVar instanceof z2.d) {
                    z2.d dVar = (z2.d) aVar;
                    iArr[i12 + 5] = dVar.f97498m;
                    iArr[i12 + 6] = Float.floatToIntBits(dVar.f97494i);
                    i15 = i12 + 7;
                    iArr[i15] = Float.floatToIntBits(dVar.f97495j);
                }
                int i16 = i15 + 1;
                iArr[i12] = i16 - i12;
                i11++;
                i12 = i16;
            }
        }
        return i11;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator it = this.f93980t.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            z2.a aVar = (z2.a) it.next();
            int i12 = aVar.f97454a;
            iArr[i10] = (aVar.f97455b * 1000) + i12;
            double d10 = i12 / 100.0f;
            this.f93967g[0].getPos(d10, this.f93973m);
            this.f93963c.b(d10, this.f93972l, this.f93973m, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }

    public float getMotionStagger() {
        return this.f93969i;
    }

    public float getStartHeight() {
        return this.f93963c.f94008j;
    }

    public float getStartWidth() {
        return this.f93963c.f94007i;
    }

    public float getStartX() {
        return this.f93963c.f94005g;
    }

    public float getStartY() {
        return this.f93963c.f94006h;
    }

    public int getTransformPivotTarget() {
        return this.f93986z;
    }

    public h getView() {
        return this.f93961a;
    }

    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r37v3 */
    public boolean interpolate(h hVar, float f10, long j10, i iVar) {
        ?? r37;
        float f11;
        double d10;
        float f12;
        int i10;
        float fA = a(f10, null);
        int i11 = this.B;
        if (i11 != -1) {
            float f13 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fA / f13)) * f13;
            float f14 = (fA % f13) / f13;
            if (!Float.isNaN(this.C)) {
                f14 = (f14 + this.C) % 1.0f;
            }
            d dVar = this.D;
            fA = ((dVar != null ? dVar.getInterpolation(f14) : ((double) f14) > 0.5d ? 1.0f : 0.0f) * f13) + fFloor;
        }
        float f15 = fA;
        HashMap map = this.f93982v;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((x) it.next()).setProperty(hVar, f15);
            }
        }
        a3.d[] dVarArr = this.f93967g;
        g gVar = this.f93963c;
        if (dVarArr != null) {
            double d11 = f15;
            dVarArr[0].getPos(d11, this.f93973m);
            this.f93967g[0].getSlope(d11, this.f93974n);
            a3.d dVar2 = this.f93968h;
            if (dVar2 != null) {
                double[] dArr = this.f93973m;
                if (dArr.length > 0) {
                    dVar2.getPos(d11, dArr);
                    this.f93968h.getSlope(d11, this.f93974n);
                }
            }
            int[] iArr = this.f93972l;
            double[] dArr2 = this.f93973m;
            double[] dArr3 = this.f93974n;
            float fSin = gVar.f94005g;
            float f16 = gVar.f94006h;
            float f17 = gVar.f94007i;
            float f18 = gVar.f94008j;
            r37 = 0;
            if (iArr.length != 0 && gVar.f94016r.length <= iArr[iArr.length - 1]) {
                int i12 = iArr[iArr.length - 1] + 1;
                gVar.f94016r = new double[i12];
                gVar.f94017s = new double[i12];
            }
            Arrays.fill(gVar.f94016r, Double.NaN);
            for (int i13 = 0; i13 < iArr.length; i13++) {
                double[] dArr4 = gVar.f94016r;
                int i14 = iArr[i13];
                dArr4[i14] = dArr2[i13];
                gVar.f94017s[i14] = dArr3[i13];
            }
            float f19 = Float.NaN;
            float f20 = 0.0f;
            float f21 = 0.0f;
            float f22 = 0.0f;
            float f23 = 0.0f;
            int i15 = 0;
            float f24 = f17;
            while (true) {
                double[] dArr5 = gVar.f94016r;
                f11 = f18;
                if (i15 >= dArr5.length) {
                    break;
                }
                if (Double.isNaN(dArr5[i15])) {
                    i10 = i15;
                } else {
                    i10 = i15;
                    float f25 = (float) (Double.isNaN(gVar.f94016r[i15]) ? 0.0d : gVar.f94016r[i15] + 0.0d);
                    float f26 = (float) gVar.f94017s[i10];
                    if (i10 == 1) {
                        f20 = f26;
                        fSin = f25;
                    } else if (i10 == 2) {
                        f21 = f26;
                        f16 = f25;
                    } else if (i10 == 3) {
                        f22 = f26;
                        f24 = f25;
                    } else if (i10 == 4) {
                        f23 = f26;
                        f11 = f25;
                    } else if (i10 == 5) {
                        f19 = f25;
                    }
                }
                i15 = i10 + 1;
                f18 = f11;
            }
            e eVar = gVar.f94013o;
            if (eVar != null) {
                float[] fArr = new float[2];
                f12 = 2.0f;
                float[] fArr2 = new float[2];
                eVar.getCenter(d11, fArr, fArr2);
                float f27 = fArr[0];
                float f28 = fArr[1];
                float f29 = fArr2[0];
                float f30 = fArr2[1];
                d10 = d11;
                double d12 = fSin;
                double d13 = f16;
                fSin = (float) (((Math.sin(d13) * d12) + f27) - (f24 / 2.0f));
                float fCos = (float) ((f28 - (Math.cos(d13) * d12)) - (f11 / 2.0f));
                double d14 = f20;
                double d15 = f21;
                float fCos2 = (float) ((Math.cos(d13) * d12 * d15) + (Math.sin(d13) * d14) + f29);
                float fSin2 = (float) ((Math.sin(d13) * d12 * d15) + (f30 - (Math.cos(d13) * d14)));
                if (dArr3.length >= 2) {
                    dArr3[0] = fCos2;
                    dArr3[1] = fSin2;
                }
                if (!Float.isNaN(f19)) {
                    hVar.setRotationZ((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + f19));
                }
                f16 = fCos;
            } else {
                d10 = d11;
                f12 = 2.0f;
                if (!Float.isNaN(f19)) {
                    hVar.setRotationZ(((float) (Math.toDegrees(Math.atan2((f23 / 2.0f) + f21, (f22 / 2.0f) + f20)) + f19)) + 0.0f);
                }
            }
            float f31 = fSin + 0.5f;
            float f32 = f16 + 0.5f;
            hVar.layout((int) f31, (int) f32, (int) (f31 + f24), (int) (f32 + f11));
            if (this.f93986z != -1) {
                if (this.A == null) {
                    this.A = hVar.getParent().findViewById(this.f93986z);
                }
                if (this.A != null) {
                    float bottom = (this.A.getBottom() + r1.getTop()) / f12;
                    float right = (this.A.getRight() + this.A.getLeft()) / f12;
                    if (hVar.getRight() - hVar.getLeft() > 0 && hVar.getBottom() - hVar.getTop() > 0) {
                        hVar.setPivotX(right - hVar.getLeft());
                        hVar.setPivotY(bottom - hVar.getTop());
                    }
                }
            }
            int i16 = 1;
            while (true) {
                a3.d[] dVarArr2 = this.f93967g;
                if (i16 >= dVarArr2.length) {
                    break;
                }
                a3.d dVar3 = dVarArr2[i16];
                float[] fArr3 = this.f93977q;
                dVar3.getPos(d10, fArr3);
                ((c) gVar.f94014p.get(this.f93975o[i16 - 1])).setInterpolatedValue(hVar, fArr3);
                i16++;
            }
            f fVar = this.f93965e;
            fVar.getClass();
            if (f15 <= 0.0f) {
                hVar.setVisibility(fVar.f93988c);
            } else {
                f fVar2 = this.f93966f;
                if (f15 >= 1.0f) {
                    hVar.setVisibility(fVar2.f93988c);
                } else if (fVar2.f93988c != fVar.f93988c) {
                    hVar.setVisibility(4);
                }
            }
            if (this.f93984x != null) {
                int i17 = 0;
                while (true) {
                    z2.f[] fVarArr = this.f93984x;
                    if (i17 >= fVarArr.length) {
                        break;
                    }
                    fVarArr[i17].conditionallyFire(f15, hVar);
                    i17++;
                }
            }
        } else {
            r37 = 0;
            float f33 = gVar.f94005g;
            g gVar2 = this.f93964d;
            float fA2 = o2.a(gVar2.f94005g, f33, f15, f33);
            float f34 = gVar.f94006h;
            float fA3 = o2.a(gVar2.f94006h, f34, f15, f34);
            float f35 = gVar.f94007i;
            float fA4 = o2.a(gVar2.f94007i, f35, f15, f35);
            float f36 = gVar.f94008j;
            float f37 = fA2 + 0.5f;
            float f38 = fA3 + 0.5f;
            hVar.layout((int) f37, (int) f38, (int) (f37 + fA4), (int) (f38 + o2.a(gVar2.f94008j, f36, f15, f36)));
        }
        HashMap map2 = this.f93983w;
        if (map2 != null) {
            for (m mVar : map2.values()) {
                if (mVar instanceof m.a) {
                    double[] dArr6 = this.f93974n;
                    ((m.a) mVar).setPathRotate(hVar, f15, dArr6[r37], dArr6[1]);
                } else {
                    mVar.setProperty(hVar, f15);
                }
            }
        }
        return r37;
    }

    public void setDrawPath(int i10) {
        this.f93963c.f94002c = i10;
    }

    public void setEnd(h hVar) {
        g gVar = this.f93964d;
        gVar.f94003e = 1.0f;
        gVar.f94004f = 1.0f;
        float x10 = this.f93961a.getX();
        float y10 = this.f93961a.getY();
        float width = this.f93961a.getWidth();
        float height = this.f93961a.getHeight();
        gVar.f94005g = x10;
        gVar.f94006h = y10;
        gVar.f94007i = width;
        gVar.f94008j = height;
        float left = hVar.getLeft();
        float top = hVar.getTop();
        float width2 = hVar.getWidth();
        float height2 = hVar.getHeight();
        gVar.f94005g = left;
        gVar.f94006h = top;
        gVar.f94007i = width2;
        gVar.f94008j = height2;
        gVar.applyParameters(hVar);
        this.f93966f.setState(hVar);
    }

    public void setIdString(String str) {
        this.f93963c.getClass();
    }

    public void setPathMotionArc(int i10) {
        this.f93985y = i10;
    }

    public void setStaggerOffset(float f10) {
        this.f93970j = f10;
    }

    public void setStaggerScale(float f10) {
        this.f93971k = f10;
    }

    public void setStart(h hVar) {
        g gVar = this.f93963c;
        gVar.f94003e = 0.0f;
        gVar.f94004f = 0.0f;
        float x10 = hVar.getX();
        float y10 = hVar.getY();
        float width = hVar.getWidth();
        float height = hVar.getHeight();
        gVar.f94005g = x10;
        gVar.f94006h = y10;
        gVar.f94007i = width;
        gVar.f94008j = height;
        gVar.applyParameters(hVar);
        this.f93965e.setState(hVar);
        d0 motionProperties = hVar.getWidgetFrame().getMotionProperties();
        if (motionProperties != null) {
            motionProperties.applyDelta(this);
        }
    }

    public void setStartState(m0 m0Var, h hVar, int i10, int i11, int i12) {
        g gVar = this.f93963c;
        gVar.f94003e = 0.0f;
        gVar.f94004f = 0.0f;
        u uVar = new u();
        if (i10 == 1) {
            int i13 = m0Var.f4005b + m0Var.f4007d;
            uVar.f4038b = ((m0Var.f4006c + m0Var.f4008e) - m0Var.width()) / 2;
            uVar.f4040d = i11 - ((m0Var.height() + i13) / 2);
            uVar.f4039c = m0Var.width() + uVar.f4038b;
            uVar.f4037a = m0Var.height() + uVar.f4040d;
        } else if (i10 == 2) {
            int i14 = m0Var.f4005b + m0Var.f4007d;
            uVar.f4038b = i12 - ((m0Var.width() + (m0Var.f4006c + m0Var.f4008e)) / 2);
            uVar.f4040d = (i14 - m0Var.height()) / 2;
            uVar.f4039c = m0Var.width() + uVar.f4038b;
            uVar.f4037a = m0Var.height() + uVar.f4040d;
        }
        float f10 = uVar.f4038b;
        float f11 = uVar.f4040d;
        float fWidth = uVar.width();
        float fHeight = uVar.height();
        gVar.f94005g = f10;
        gVar.f94006h = f11;
        gVar.f94007i = fWidth;
        gVar.f94008j = fHeight;
        this.f93965e.setState(uVar, hVar, i10, m0Var.f4004a);
    }

    public void setTransformPivotTarget(int i10) {
        this.f93986z = i10;
        this.A = null;
    }

    @Override // a3.i0
    public boolean setValue(int i10, int i11) {
        if (i10 == 509) {
            setPathMotionArc(i11);
            return true;
        }
        if (i10 != 610) {
            return i10 == 704;
        }
        this.B = i11;
        return true;
    }

    public void setView(h hVar) {
        this.f93961a = hVar;
    }

    public void setup(int i10, int i11, float f10, long j10) {
        g gVar;
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        String[] strArr;
        int i12;
        Iterator<String> it;
        char c10;
        int i13;
        c cVar;
        x xVarMakeSpline;
        c cVar2;
        Integer num;
        HashSet<String> hashSet3;
        HashSet<String> hashSet4;
        Iterator<String> it2;
        x xVarMakeSpline2;
        c cVar3;
        g gVar2;
        ArrayList arrayList2;
        new HashSet();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        e eVar = this.E;
        g gVar3 = this.f93964d;
        g gVar4 = this.f93963c;
        if (eVar != null) {
            gVar4.setupRelative(eVar, eVar.f93963c);
            e eVar2 = this.E;
            gVar3.setupRelative(eVar2, eVar2.f93964d);
        }
        int i14 = this.f93985y;
        if (i14 != -1 && gVar4.f94010l == -1) {
            gVar4.f94010l = i14;
        }
        f fVar = this.f93965e;
        float f11 = fVar.f93987b;
        f fVar2 = this.f93966f;
        if (f.a(f11, fVar2.f93987b)) {
            hashSet6.add("alpha");
        }
        if (f.a(0.0f, 0.0f)) {
            hashSet6.add("translationZ");
        }
        int i15 = fVar.f93988c;
        int i16 = fVar2.f93988c;
        char c11 = 4;
        if (i15 != i16 && (i15 == 4 || i16 == 4)) {
            hashSet6.add("alpha");
        }
        if (f.a(fVar.f93989e, fVar2.f93989e)) {
            hashSet6.add("rotationZ");
        }
        if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
            hashSet6.add("pathRotate");
        }
        if (!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) {
            hashSet6.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (f.a(fVar.f93990f, fVar2.f93990f)) {
            hashSet6.add("rotationX");
        }
        if (f.a(fVar.f93991g, fVar2.f93991g)) {
            hashSet6.add("rotationY");
        }
        if (f.a(fVar.f93994j, fVar2.f93994j)) {
            hashSet6.add("pivotX");
        }
        if (f.a(fVar.f93995k, fVar2.f93995k)) {
            hashSet6.add("pivotY");
        }
        if (f.a(fVar.f93992h, fVar2.f93992h)) {
            hashSet6.add("scaleX");
        }
        if (f.a(fVar.f93993i, fVar2.f93993i)) {
            hashSet6.add("scaleY");
        }
        if (f.a(fVar.f93996l, fVar2.f93996l)) {
            hashSet6.add("translationX");
        }
        if (f.a(fVar.f93997m, fVar2.f93997m)) {
            hashSet6.add("translationY");
        }
        if (f.a(fVar.f93998n, fVar2.f93998n)) {
            hashSet6.add("translationZ");
        }
        if (f.a(0.0f, 0.0f)) {
            hashSet6.add("elevation");
        }
        ArrayList arrayList3 = this.f93978r;
        ArrayList arrayList4 = this.f93980t;
        if (arrayList4 != null) {
            Iterator it3 = arrayList4.iterator();
            ArrayList arrayList5 = null;
            while (it3.hasNext()) {
                char c12 = c11;
                z2.a aVar = (z2.a) it3.next();
                if (aVar instanceof z2.d) {
                    z2.d dVar = (z2.d) aVar;
                    g gVar5 = new g(i10, i11, dVar, this.f93963c, this.f93964d);
                    Iterator it4 = arrayList3.iterator();
                    g gVar6 = null;
                    while (it4.hasNext()) {
                        ArrayList arrayList6 = arrayList4;
                        g gVar7 = (g) it4.next();
                        g gVar8 = gVar4;
                        if (gVar5.f94004f == gVar7.f94004f) {
                            gVar6 = gVar7;
                        }
                        gVar4 = gVar8;
                        arrayList4 = arrayList6;
                    }
                    gVar2 = gVar4;
                    arrayList2 = arrayList4;
                    if (gVar6 != null) {
                        arrayList3.remove(gVar6);
                    }
                    if (Collections.binarySearch(arrayList3, gVar5) == 0) {
                        k0.loge("MotionController", " KeyPath position \"" + gVar5.f94004f + "\" outside of range");
                    }
                    arrayList3.add((-r9) - 1, gVar5);
                    int i17 = dVar.f97489d;
                    if (i17 != -1) {
                        this.f93962b = i17;
                    }
                } else {
                    gVar2 = gVar4;
                    arrayList2 = arrayList4;
                    if (aVar instanceof z2.c) {
                        aVar.getAttributeNames(hashSet7);
                    } else if (aVar instanceof z2.e) {
                        aVar.getAttributeNames(hashSet5);
                    } else if (aVar instanceof z2.f) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        ArrayList arrayList7 = arrayList5;
                        arrayList7.add((z2.f) aVar);
                        arrayList5 = arrayList7;
                    } else {
                        aVar.setInterpolation(map);
                        aVar.getAttributeNames(hashSet6);
                    }
                }
                c11 = c12;
                gVar4 = gVar2;
                arrayList4 = arrayList2;
            }
            gVar = gVar4;
            arrayList = arrayList5;
        } else {
            gVar = gVar4;
            arrayList = null;
        }
        char c13 = c11;
        ArrayList arrayList8 = arrayList4;
        int i18 = 1;
        if (arrayList != null) {
            this.f93984x = (z2.f[]) arrayList.toArray(new z2.f[0]);
        }
        if (hashSet6.isEmpty()) {
            hashSet = hashSet5;
            hashSet2 = hashSet7;
        } else {
            this.f93982v = new HashMap();
            Iterator<String> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                String next = it5.next();
                if (next.startsWith("CUSTOM,")) {
                    p pVar = new p();
                    hashSet3 = hashSet5;
                    String str = next.split(",")[1];
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        HashSet<String> hashSet8 = hashSet7;
                        z2.a aVar2 = (z2.a) it6.next();
                        Iterator<String> it7 = it5;
                        HashMap map2 = aVar2.f97456c;
                        if (map2 != null && (cVar3 = (c) map2.get(str)) != null) {
                            pVar.append(aVar2.f97454a, cVar3);
                        }
                        it5 = it7;
                        hashSet7 = hashSet8;
                    }
                    hashSet4 = hashSet7;
                    it2 = it5;
                    xVarMakeSpline2 = x.makeCustomSplineSet(next, pVar);
                } else {
                    hashSet3 = hashSet5;
                    hashSet4 = hashSet7;
                    it2 = it5;
                    xVarMakeSpline2 = x.makeSpline(next, j10);
                }
                if (xVarMakeSpline2 != null) {
                    xVarMakeSpline2.setType(next);
                    this.f93982v.put(next, xVarMakeSpline2);
                }
                hashSet5 = hashSet3;
                it5 = it2;
                hashSet7 = hashSet4;
            }
            hashSet = hashSet5;
            hashSet2 = hashSet7;
            if (arrayList8 != null) {
                Iterator it8 = arrayList8.iterator();
                while (it8.hasNext()) {
                    z2.a aVar3 = (z2.a) it8.next();
                    if (aVar3 instanceof z2.b) {
                        aVar3.addValues(this.f93982v);
                    }
                }
            }
            fVar.addValues(this.f93982v, 0);
            fVar2.addValues(this.f93982v, 100);
            for (String str2 : this.f93982v.keySet()) {
                int iIntValue = (!map.containsKey(str2) || (num = map.get(str2)) == null) ? 0 : num.intValue();
                x xVar = (x) this.f93982v.get(str2);
                if (xVar != null) {
                    xVar.setup(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f93981u == null) {
                this.f93981u = new HashMap();
            }
            Iterator<String> it9 = hashSet.iterator();
            while (it9.hasNext()) {
                String next2 = it9.next();
                if (!this.f93981u.containsKey(next2)) {
                    if (next2.startsWith("CUSTOM,")) {
                        p pVar2 = new p();
                        String str3 = next2.split(",")[1];
                        Iterator it10 = arrayList8.iterator();
                        while (it10.hasNext()) {
                            z2.a aVar4 = (z2.a) it10.next();
                            HashMap map3 = aVar4.f97456c;
                            if (map3 != null && (cVar2 = (c) map3.get(str3)) != null) {
                                pVar2.append(aVar4.f97454a, cVar2);
                            }
                        }
                        xVarMakeSpline = x.makeCustomSplineSet(next2, pVar2);
                    } else {
                        xVarMakeSpline = x.makeSpline(next2, j10);
                    }
                    if (xVarMakeSpline != null) {
                        xVarMakeSpline.setType(next2);
                    }
                }
            }
            if (arrayList8 != null) {
                Iterator it11 = arrayList8.iterator();
                while (it11.hasNext()) {
                    z2.a aVar5 = (z2.a) it11.next();
                    if (aVar5 instanceof z2.e) {
                        ((z2.e) aVar5).addTimeValues(this.f93981u);
                    }
                }
            }
            for (String str4 : this.f93981u.keySet()) {
                ((c0) this.f93981u.get(str4)).setup(map.containsKey(str4) ? map.get(str4).intValue() : 0);
            }
        }
        int size = arrayList3.size();
        int i19 = size + 2;
        g[] gVarArr = new g[i19];
        gVarArr[0] = gVar;
        gVarArr[size + 1] = gVar3;
        if (arrayList3.size() > 0 && this.f93962b == -1) {
            this.f93962b = 0;
        }
        Iterator it12 = arrayList3.iterator();
        int i20 = 1;
        while (it12.hasNext()) {
            gVarArr[i20] = (g) it12.next();
            i20++;
        }
        HashSet hashSet9 = new HashSet();
        for (String str5 : gVar3.f94014p.keySet()) {
            g gVar9 = gVar;
            if (gVar9.f94014p.containsKey(str5)) {
                if (!hashSet6.contains("CUSTOM," + str5)) {
                    hashSet9.add(str5);
                }
            }
            gVar = gVar9;
        }
        g gVar10 = gVar;
        String[] strArr2 = (String[]) hashSet9.toArray(new String[0]);
        this.f93975o = strArr2;
        this.f93976p = new int[strArr2.length];
        int i21 = 0;
        while (true) {
            strArr = this.f93975o;
            if (i21 >= strArr.length) {
                break;
            }
            String str6 = strArr[i21];
            this.f93976p[i21] = 0;
            int i22 = 0;
            while (true) {
                if (i22 >= i19) {
                    break;
                }
                if (gVarArr[i22].f94014p.containsKey(str6) && (cVar = (c) gVarArr[i22].f94014p.get(str6)) != null) {
                    int[] iArr = this.f93976p;
                    iArr[i21] = cVar.numberOfInterpolatedValues() + iArr[i21];
                    break;
                }
                i22++;
            }
            i21++;
        }
        boolean z10 = gVarArr[0].f94010l != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        int i23 = 1;
        while (true) {
            i12 = 2;
            if (i23 >= i19) {
                break;
            }
            g gVar11 = gVarArr[i23];
            g gVar12 = gVarArr[i23 - 1];
            boolean zA = g.a(gVar11.f94005g, gVar12.f94005g);
            boolean zA2 = g.a(gVar11.f94006h, gVar12.f94006h);
            zArr[0] = zArr[0] | g.a(gVar11.f94004f, gVar12.f94004f);
            zArr[1] = zArr[1] | (zA || zA2 || z10);
            zArr[2] = zArr[2] | (zA || zA2 || z10);
            zArr[3] = zArr[3] | g.a(gVar11.f94007i, gVar12.f94007i);
            zArr[c13] = zArr[c13] | g.a(gVar11.f94008j, gVar12.f94008j);
            i23++;
        }
        int i24 = 0;
        for (int i25 = 1; i25 < length; i25++) {
            if (zArr[i25]) {
                i24++;
            }
        }
        this.f93972l = new int[i24];
        int iMax = Math.max(2, i24);
        this.f93973m = new double[iMax];
        this.f93974n = new double[iMax];
        int i26 = 0;
        for (int i27 = 1; i27 < length; i27++) {
            if (zArr[i27]) {
                this.f93972l[i26] = i27;
                i26++;
            }
        }
        int[] iArr2 = {i19, this.f93972l.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i19];
        int i28 = 0;
        while (i28 < i19) {
            g gVar13 = gVarArr[i28];
            double[] dArr3 = dArr[i28];
            int[] iArr3 = this.f93972l;
            float f12 = gVar13.f94004f;
            float f13 = gVar13.f94005g;
            int i29 = i12;
            float f14 = gVar13.f94006h;
            float f15 = gVar13.f94007i;
            g[] gVarArr2 = gVarArr;
            float f16 = gVar13.f94008j;
            float f17 = gVar13.f94009k;
            int i30 = i28;
            float[] fArr = new float[6];
            fArr[0] = f12;
            fArr[1] = f13;
            fArr[i29] = f14;
            fArr[3] = f15;
            fArr[c13] = f16;
            fArr[5] = f17;
            int i31 = 0;
            for (int i32 : iArr3) {
                if (i32 < 6) {
                    dArr3[i31] = fArr[r9];
                    i31++;
                }
            }
            dArr2[i30] = gVarArr2[i30].f94003e;
            i28 = i30 + 1;
            i12 = i29;
            gVarArr = gVarArr2;
        }
        g[] gVarArr3 = gVarArr;
        int i33 = i12;
        int i34 = 0;
        while (true) {
            int[] iArr4 = this.f93972l;
            if (i34 >= iArr4.length) {
                break;
            }
            if (iArr4[i34] < 6) {
                String strO = o2.o(new StringBuilder(), g.f94000t[this.f93972l[i34]], " [");
                for (int i35 = 0; i35 < i19; i35++) {
                    StringBuilder sbU = p0.o2.u(strO);
                    sbU.append(dArr[i35][i34]);
                    strO = sbU.toString();
                }
            }
            i34++;
        }
        this.f93967g = new a3.d[this.f93975o.length + 1];
        int i36 = 0;
        while (true) {
            String[] strArr3 = this.f93975o;
            if (i36 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i36];
            double[] dArr4 = null;
            double[][] dArr5 = null;
            int i37 = 0;
            int i38 = 0;
            while (i37 < i19) {
                if (gVarArr3[i37].f94014p.containsKey(str7)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i19];
                        c cVar4 = (c) gVarArr3[i37].f94014p.get(str7);
                        int[] iArr5 = new int[i33];
                        iArr5[i18] = cVar4 == null ? 0 : cVar4.numberOfInterpolatedValues();
                        iArr5[0] = i19;
                        dArr5 = (double[][]) Array.newInstance((Class<?>) cls, iArr5);
                    }
                    g gVar14 = gVarArr3[i37];
                    double[] dArr6 = dArr4;
                    double[][] dArr7 = dArr5;
                    dArr6[i38] = gVar14.f94003e;
                    double[] dArr8 = dArr7[i38];
                    c cVar5 = (c) gVar14.f94014p.get(str7);
                    if (cVar5 != null) {
                        if (cVar5.numberOfInterpolatedValues() == i18) {
                            dArr8[0] = cVar5.getValueToInterpolate();
                        } else {
                            int iNumberOfInterpolatedValues = cVar5.numberOfInterpolatedValues();
                            cVar5.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
                            int i39 = 0;
                            int i40 = 0;
                            while (i39 < iNumberOfInterpolatedValues) {
                                double[] dArr9 = dArr8;
                                dArr9[i40] = r13[i39];
                                i39++;
                                i40++;
                                i36 = i36;
                                dArr8 = dArr9;
                            }
                        }
                    }
                    i13 = i36;
                    i38++;
                    dArr4 = dArr6;
                    dArr5 = dArr7;
                } else {
                    i13 = i36;
                }
                i37++;
                i36 = i13;
                i33 = 2;
                i18 = 1;
            }
            int i41 = i36;
            double[] dArrCopyOf = Arrays.copyOf(dArr4, i38);
            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr5, i38);
            int i42 = i41 + 1;
            this.f93967g[i42] = a3.d.get(this.f93962b, dArrCopyOf, dArr10);
            i36 = i42;
            i33 = 2;
            i18 = 1;
        }
        this.f93967g[0] = a3.d.get(this.f93962b, dArr2, dArr);
        if (gVarArr3[0].f94010l != -1) {
            int[] iArr6 = new int[i19];
            double[] dArr11 = new double[i19];
            double[][] dArr12 = (double[][]) Array.newInstance((Class<?>) cls, i19, 2);
            for (int i43 = 0; i43 < i19; i43++) {
                iArr6[i43] = gVarArr3[i43].f94010l;
                dArr11[i43] = r6.f94003e;
                double[] dArr13 = dArr12[i43];
                dArr13[0] = r6.f94005g;
                dArr13[1] = r6.f94006h;
            }
            this.f93968h = a3.d.getArc(iArr6, dArr11, dArr12);
        }
        this.f93983w = new HashMap();
        if (arrayList8 != null) {
            Iterator<String> it13 = hashSet2.iterator();
            float f18 = Float.NaN;
            while (it13.hasNext()) {
                String next3 = it13.next();
                m mVarMakeWidgetCycle = m.makeWidgetCycle(next3);
                if (mVarMakeWidgetCycle != null) {
                    if (mVarMakeWidgetCycle.variesByPath() && Float.isNaN(f18)) {
                        float[] fArr2 = new float[2];
                        float f19 = 1.0f / 99;
                        double d10 = 0.0d;
                        float fHypot = 0.0f;
                        double d11 = 0.0d;
                        int i44 = 0;
                        while (i44 < 100) {
                            float f20 = i44 * f19;
                            double d12 = f20;
                            a3.g gVar15 = gVar10.f94001b;
                            Iterator it14 = arrayList3.iterator();
                            float f21 = Float.NaN;
                            float f22 = 0.0f;
                            while (it14.hasNext()) {
                                Iterator<String> it15 = it13;
                                g gVar16 = (g) it14.next();
                                float[] fArr3 = fArr2;
                                a3.g gVar17 = gVar16.f94001b;
                                if (gVar17 != null) {
                                    float f23 = gVar16.f94003e;
                                    if (f23 < f20) {
                                        f22 = f23;
                                        gVar15 = gVar17;
                                    } else if (Float.isNaN(f21)) {
                                        f21 = gVar16.f94003e;
                                    }
                                }
                                it13 = it15;
                                fArr2 = fArr3;
                            }
                            Iterator<String> it16 = it13;
                            float[] fArr4 = fArr2;
                            if (gVar15 != null) {
                                if (Float.isNaN(f21)) {
                                    f21 = 1.0f;
                                }
                                d12 = (((float) gVar15.get((f20 - f22) / r20)) * (f21 - f22)) + f22;
                            }
                            this.f93967g[0].getPos(d12, this.f93973m);
                            this.f93963c.b(d12, this.f93972l, this.f93973m, fArr4, 0);
                            if (i44 > 0) {
                                c10 = 0;
                                fHypot += (float) Math.hypot(d10 - fArr4[1], d11 - fArr4[0]);
                            } else {
                                c10 = 0;
                            }
                            d11 = fArr4[c10];
                            i44++;
                            d10 = fArr4[1];
                            fArr2 = fArr4;
                            it13 = it16;
                        }
                        it = it13;
                        f18 = fHypot;
                    } else {
                        it = it13;
                    }
                    mVarMakeWidgetCycle.setType(next3);
                    this.f93983w.put(next3, mVarMakeWidgetCycle);
                    it13 = it;
                }
            }
            Iterator it17 = arrayList8.iterator();
            while (it17.hasNext()) {
                z2.a aVar6 = (z2.a) it17.next();
                if (aVar6 instanceof z2.c) {
                    ((z2.c) aVar6).addCycleValues(this.f93983w);
                }
            }
            Iterator it18 = this.f93983w.values().iterator();
            while (it18.hasNext()) {
                ((m) it18.next()).setup(f18);
            }
        }
    }

    public void setupRelative(e eVar) {
        this.E = eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        g gVar = this.f93963c;
        sb2.append(gVar.f94005g);
        sb2.append(" y: ");
        sb2.append(gVar.f94006h);
        sb2.append(" end: x: ");
        g gVar2 = this.f93964d;
        sb2.append(gVar2.f94005g);
        sb2.append(" y: ");
        sb2.append(gVar2.f94006h);
        return sb2.toString();
    }

    @Override // a3.i0
    public boolean setValue(int i10, float f10) {
        if (602 == i10) {
            this.C = f10;
            return true;
        }
        if (600 != i10) {
            return false;
        }
        this.f93969i = f10;
        return true;
    }

    @Override // a3.i0
    public boolean setValue(int i10, String str) {
        if (705 == i10 || 611 == i10) {
            this.D = new d(a3.g.getInterpolator(str));
            return true;
        }
        if (605 != i10) {
            return false;
        }
        this.f93963c.f94011m = str;
        return true;
    }

    @Override // a3.i0
    public boolean setValue(int i10, boolean z10) {
        return false;
    }
}
