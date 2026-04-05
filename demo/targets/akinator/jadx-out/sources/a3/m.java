package a3;

import com.ironsource.C3191e4;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public d f3996a;

    /* renamed from: b, reason: collision with root package name */
    public l f3997b;

    /* renamed from: c, reason: collision with root package name */
    public String f3998c;

    /* renamed from: d, reason: collision with root package name */
    public int f3999d = 0;

    /* renamed from: e, reason: collision with root package name */
    public String f4000e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f4001f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4002g = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends m {

        /* renamed from: h, reason: collision with root package name */
        public final int f4003h;

        public a(String str) {
            this.f4003h = f0.getId(str);
        }

        public void setPathRotate(y2.h hVar, float f10, double d10, double d11) {
            hVar.setRotationZ(get(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // a3.m
        public void setProperty(y2.h hVar, float f10) {
            hVar.setValue(this.f4003h, get(f10));
        }
    }

    public static m makeWidgetCycle(String str) {
        if (str.equals("pathRotate")) {
            return new a(str);
        }
        k kVar = new k();
        kVar.f3980h = f0.getId(str);
        return kVar;
    }

    public float get(float f10) {
        return (float) this.f3997b.getValues(f10);
    }

    public d getCurveFit() {
        return this.f3996a;
    }

    public float getSlope(float f10) {
        return (float) this.f3997b.getSlope(f10);
    }

    public void setPoint(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13, Object obj) {
        this.f4002g.add(new n(f10, f11, f12, f13, i10));
        if (i12 != -1) {
            this.f4001f = i12;
        }
        this.f3999d = i11;
        a(obj);
        this.f4000e = str;
    }

    public void setType(String str) {
        this.f3998c = str;
    }

    public void setup(float f10) {
        ArrayList arrayList = this.f4002g;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new j());
        double[] dArr = new double[size];
        char c10 = 2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        int i10 = this.f3999d;
        String str = this.f4000e;
        l lVar = new l();
        t tVar = new t();
        lVar.f3981a = tVar;
        tVar.setType(i10, str);
        lVar.f3982b = new float[size];
        lVar.f3983c = new double[size];
        lVar.f3984d = new float[size];
        lVar.f3985e = new float[size];
        lVar.f3986f = new float[size];
        float[] fArr = new float[size];
        this.f3997b = lVar;
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            n nVar = (n) it.next();
            float f11 = nVar.f4012d;
            dArr[i11] = f11 * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f12 = nVar.f4010b;
            dArr3[0] = f12;
            float f13 = nVar.f4011c;
            char c11 = c10;
            dArr3[1] = f13;
            float f14 = nVar.f4013e;
            dArr3[c11] = f14;
            this.f3997b.setPoint(i11, nVar.f4009a, f11, f13, f14, f12);
            i11++;
            c10 = c11;
            dArr2 = dArr2;
        }
        this.f3997b.setup(f10);
        this.f3996a = d.get(0, dArr, dArr2);
    }

    public String toString() {
        String string = this.f3998c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f4002g.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            StringBuilder sbT = a.b.t(string, C3191e4.i.f36529d);
            sbT.append(nVar.f4009a);
            sbT.append(" , ");
            sbT.append(decimalFormat.format(nVar.f4010b));
            sbT.append("] ");
            string = sbT.toString();
        }
        return string;
    }

    public boolean variesByPath() {
        return this.f4001f == 1;
    }

    public void setPoint(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13) {
        this.f4002g.add(new n(f10, f11, f12, f13, i10));
        if (i12 != -1) {
            this.f4001f = i12;
        }
        this.f3999d = i11;
        this.f4000e = str;
    }

    public void a(Object obj) {
    }

    public void setProperty(y2.h hVar, float f10) {
    }
}
