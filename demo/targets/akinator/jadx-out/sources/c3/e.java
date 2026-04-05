package c3;

import a2.o;
import a3.d0;
import a3.g;
import a3.i;
import a3.i0;
import com.vungle.ads.internal.protos.Sdk;
import d3.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11753a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11754b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final d0 f11755c = new d0();

    /* renamed from: d, reason: collision with root package name */
    public String f11756d = null;

    /* renamed from: e, reason: collision with root package name */
    public g f11757e = null;

    /* renamed from: f, reason: collision with root package name */
    public float f11758f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f11759g;

    /* renamed from: h, reason: collision with root package name */
    public int f11760h;

    /* renamed from: i, reason: collision with root package name */
    public int f11761i;

    /* renamed from: j, reason: collision with root package name */
    public int f11762j;

    /* renamed from: k, reason: collision with root package name */
    public int f11763k;

    /* renamed from: l, reason: collision with root package name */
    public int f11764l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11765m;

    public e(c3.a aVar) {
    }

    public static b getInterpolator(int i10, String str) {
        switch (i10) {
            case -1:
                return new c(str, 0);
            case 0:
                return new o(18);
            case 1:
                return new o(19);
            case 2:
                return new o(20);
            case 3:
                return new o(21);
            case 4:
                return new o(24);
            case 5:
                return new o(23);
            case 6:
                return new o(22);
            default:
                return null;
        }
    }

    public void addCustomColor(int i10, String str, String str2, int i11) {
        getWidgetState(str, null, i10).getFrame(i10).addCustomColor(str2, i11);
    }

    public void addCustomFloat(int i10, String str, String str2, float f10) {
        getWidgetState(str, null, i10).getFrame(i10).addCustomFloat(str2, f10);
    }

    public void addKeyAttribute(String str, d0 d0Var) {
        getWidgetState(str, null, 0).setKeyAttribute(d0Var);
    }

    public void addKeyCycle(String str, d0 d0Var) {
        getWidgetState(str, null, 0).setKeyCycle(d0Var);
    }

    public void addKeyPosition(String str, d0 d0Var) {
        getWidgetState(str, null, 0).setKeyPosition(d0Var);
    }

    public void calcStagger() {
        float fMin;
        float fMax;
        float f10 = this.f11758f;
        if (f10 == 0.0f) {
            return;
        }
        boolean z10 = ((double) f10) < 0.0d;
        float fAbs = Math.abs(f10);
        HashMap map = this.f11754b;
        Iterator it = map.keySet().iterator();
        do {
            fMin = Float.MAX_VALUE;
            fMax = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    y2.e eVar = ((a) map.get((String) it2.next())).f11769d;
                    float finalY = eVar.getFinalY() + eVar.getFinalX();
                    fMin = Math.min(fMin, finalY);
                    fMax = Math.max(fMax, finalY);
                }
                Iterator it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    y2.e eVar2 = ((a) map.get((String) it3.next())).f11769d;
                    float finalY2 = eVar2.getFinalY() + eVar2.getFinalX();
                    float f11 = fMax - fMin;
                    float f12 = fAbs - (((finalY2 - fMin) * fAbs) / f11);
                    if (z10) {
                        f12 = fAbs - (((fMax - finalY2) / f11) * fAbs);
                    }
                    eVar2.setStaggerScale(1.0f / (1.0f - fAbs));
                    eVar2.setStaggerOffset(f12);
                }
                return;
            }
        } while (Float.isNaN(((a) map.get((String) it.next())).f11769d.getMotionStagger()));
        Iterator it4 = map.keySet().iterator();
        while (it4.hasNext()) {
            float motionStagger = ((a) map.get((String) it4.next())).f11769d.getMotionStagger();
            if (!Float.isNaN(motionStagger)) {
                fMin = Math.min(fMin, motionStagger);
                fMax = Math.max(fMax, motionStagger);
            }
        }
        Iterator it5 = map.keySet().iterator();
        while (it5.hasNext()) {
            y2.e eVar3 = ((a) map.get((String) it5.next())).f11769d;
            float motionStagger2 = eVar3.getMotionStagger();
            if (!Float.isNaN(motionStagger2)) {
                float f13 = 1.0f / (1.0f - fAbs);
                float f14 = fMax - fMin;
                float f15 = fAbs - (((motionStagger2 - fMin) * fAbs) / f14);
                if (z10) {
                    f15 = fAbs - (((fMax - motionStagger2) / f14) * fAbs);
                }
                eVar3.setStaggerScale(f13);
                eVar3.setStaggerOffset(f15);
            }
        }
    }

    public void clear() {
        this.f11754b.clear();
    }

    public boolean contains(String str) {
        return this.f11754b.containsKey(str);
    }

    public float dragToProgress(float f10, int i10, int i11, float f11, float f12) {
        Iterator it = this.f11754b.values().iterator();
        if ((it.hasNext() ? (a) it.next() : null) != null) {
            return (-f12) / r1.f11775j;
        }
        return 1.0f;
    }

    public void fillKeyPositions(f fVar, float[] fArr, float[] fArr2, float[] fArr3) {
        d dVar;
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap map = (HashMap) this.f11753a.get(Integer.valueOf(i11));
            if (map != null && (dVar = (d) map.get(fVar.f11777a.f51793l)) != null) {
                fArr[i10] = dVar.f11751b;
                fArr2[i10] = dVar.f11752c;
                fArr3[i10] = dVar.f11750a;
                i10++;
            }
        }
    }

    public d findNextPosition(String str, int i10) {
        d dVar;
        while (i10 <= 100) {
            HashMap map = (HashMap) this.f11753a.get(Integer.valueOf(i10));
            if (map != null && (dVar = (d) map.get(str)) != null) {
                return dVar;
            }
            i10++;
        }
        return null;
    }

    public d findPreviousPosition(String str, int i10) {
        d dVar;
        while (i10 >= 0) {
            HashMap map = (HashMap) this.f11753a.get(Integer.valueOf(i10));
            if (map != null && (dVar = (d) map.get(str)) != null) {
                return dVar;
            }
            i10--;
        }
        return null;
    }

    public int getAutoTransition() {
        return 0;
    }

    public f getEnd(String str) {
        a aVar = (a) this.f11754b.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.f11767b;
    }

    @Override // a3.i0
    public int getId(String str) {
        return 0;
    }

    public f getInterpolated(String str) {
        a aVar = (a) this.f11754b.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.f11768c;
    }

    public int getInterpolatedHeight() {
        return this.f11764l;
    }

    public int getInterpolatedWidth() {
        return this.f11763k;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return ((a) this.f11754b.get(str)).f11769d.buildKeyFrames(fArr, iArr, iArr2);
    }

    public y2.e getMotion(String str) {
        return getWidgetState(str, null, 0).f11769d;
    }

    public int getNumberKeyPositions(f fVar) {
        int i10 = 0;
        for (int i11 = 0; i11 <= 100; i11++) {
            HashMap map = (HashMap) this.f11753a.get(Integer.valueOf(i11));
            if (map != null && ((d) map.get(fVar.f11777a.f51793l)) != null) {
                i10++;
            }
        }
        return i10;
    }

    public float[] getPath(String str) {
        a aVar = (a) this.f11754b.get(str);
        float[] fArr = new float[Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE];
        aVar.f11769d.buildPath(fArr, 62);
        return fArr;
    }

    public f getStart(String str) {
        a aVar = (a) this.f11754b.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.f11766a;
    }

    public float getTouchUpProgress(long j10) {
        return 0.0f;
    }

    public a getWidgetState(String str, d3.g gVar, int i10) {
        HashMap map = this.f11754b;
        a aVar = (a) map.get(str);
        if (aVar == null) {
            aVar = new a();
            this.f11755c.applyDelta(aVar.f11769d);
            aVar.f11771f.updateMotion(aVar.f11769d);
            map.put(str, aVar);
            if (gVar != null) {
                aVar.update(gVar, i10);
            }
        }
        return aVar;
    }

    public boolean hasOnSwipe() {
        return false;
    }

    public boolean hasPositionKeyframes() {
        return this.f11753a.size() > 0;
    }

    public void interpolate(int i10, int i11, float f10) {
        if (this.f11765m) {
            this.f11763k = (int) (((this.f11761i - r0) * f10) + this.f11759g + 0.5f);
            this.f11764l = (int) (((this.f11762j - r0) * f10) + this.f11760h + 0.5f);
        }
        g gVar = this.f11757e;
        if (gVar != null) {
            f10 = (float) gVar.get(f10);
        }
        HashMap map = this.f11754b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((a) map.get((String) it.next())).interpolate(i10, i11, f10, this);
        }
    }

    public boolean isEmpty() {
        return this.f11754b.isEmpty();
    }

    public boolean isFirstDownAccepted(float f10, float f11) {
        return false;
    }

    public boolean isTouchNotDone(float f10) {
        throw null;
    }

    public void setTransitionProperties(d0 d0Var) {
        d0Var.applyDelta(this.f11755c);
        d0Var.applyDelta(this);
    }

    @Override // a3.i0
    public boolean setValue(int i10, int i11) {
        return false;
    }

    public void updateFrom(h hVar, int i10) {
        d3.f[] fVarArr = hVar.Y;
        d3.f fVar = fVarArr[0];
        d3.f fVar2 = d3.f.f51767c;
        boolean z10 = fVar == fVar2;
        this.f11765m = z10;
        this.f11765m = z10 | (fVarArr[1] == fVar2);
        if (i10 == 0) {
            int width = hVar.getWidth();
            this.f11759g = width;
            this.f11763k = width;
            int height = hVar.getHeight();
            this.f11760h = height;
            this.f11764l = height;
        } else {
            this.f11761i = hVar.getWidth();
            this.f11762j = hVar.getHeight();
        }
        ArrayList<d3.g> children = hVar.getChildren();
        int size = children.size();
        a[] aVarArr = new a[size];
        for (int i11 = 0; i11 < size; i11++) {
            d3.g gVar = children.get(i11);
            a widgetState = getWidgetState(gVar.f51793l, null, i10);
            aVarArr[i11] = widgetState;
            widgetState.update(gVar, i10);
            String animateRelativeTo = widgetState.f11769d.getAnimateRelativeTo();
            if (animateRelativeTo != null) {
                widgetState.setPathRelative(getWidgetState(animateRelativeTo, null, i10));
            }
        }
        calcStagger();
    }

    public void addKeyAttribute(String str, d0 d0Var, y2.c[] cVarArr) {
        getWidgetState(str, null, 0).setKeyAttribute(d0Var, cVarArr);
    }

    public void addKeyPosition(String str, int i10, int i11, float f10, float f11) {
        d0 d0Var = new d0();
        d0Var.add(510, 2);
        d0Var.add(100, i10);
        d0Var.add(506, f10);
        d0Var.add(507, f11);
        getWidgetState(str, null, 0).setKeyPosition(d0Var);
        d dVar = new d();
        dVar.f11750a = i10;
        dVar.f11751b = f10;
        dVar.f11752c = f11;
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f11753a;
        HashMap map2 = (HashMap) map.get(numValueOf);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(Integer.valueOf(i10), map2);
        }
        map2.put(str, dVar);
    }

    @Override // a3.i0
    public boolean setValue(int i10, float f10) {
        if (i10 != 706) {
            return false;
        }
        this.f11758f = f10;
        return false;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11766a;

        /* renamed from: b, reason: collision with root package name */
        public final f f11767b;

        /* renamed from: c, reason: collision with root package name */
        public final f f11768c;

        /* renamed from: d, reason: collision with root package name */
        public final y2.e f11769d;

        /* renamed from: f, reason: collision with root package name */
        public final y2.h f11771f;

        /* renamed from: g, reason: collision with root package name */
        public final y2.h f11772g;

        /* renamed from: h, reason: collision with root package name */
        public final y2.h f11773h;

        /* renamed from: e, reason: collision with root package name */
        public boolean f11770e = true;

        /* renamed from: i, reason: collision with root package name */
        public final i f11774i = new i();

        /* renamed from: j, reason: collision with root package name */
        public int f11775j = -1;

        public a() {
            f fVar = new f();
            this.f11766a = fVar;
            f fVar2 = new f();
            this.f11767b = fVar2;
            f fVar3 = new f();
            this.f11768c = fVar3;
            y2.h hVar = new y2.h(fVar);
            this.f11771f = hVar;
            y2.h hVar2 = new y2.h(fVar2);
            this.f11772g = hVar2;
            this.f11773h = new y2.h(fVar3);
            y2.e eVar = new y2.e(hVar);
            this.f11769d = eVar;
            eVar.setStart(hVar);
            eVar.setEnd(hVar2);
        }

        public f getFrame(int i10) {
            return i10 == 0 ? this.f11766a : i10 == 1 ? this.f11767b : this.f11768c;
        }

        public void interpolate(int i10, int i11, float f10, e eVar) {
            this.f11775j = i11;
            if (this.f11770e) {
                this.f11769d.setup(i10, i11, 1.0f, System.nanoTime());
                this.f11770e = false;
            }
            f.interpolate(i10, i11, this.f11768c, this.f11766a, this.f11767b, eVar, f10);
            this.f11768c.f11793q = f10;
            this.f11769d.interpolate(this.f11773h, f10, System.nanoTime(), this.f11774i);
        }

        public void setKeyAttribute(d0 d0Var) {
            z2.b bVar = new z2.b();
            d0Var.applyDelta(bVar);
            this.f11769d.addKey(bVar);
        }

        public void setKeyCycle(d0 d0Var) {
            z2.c cVar = new z2.c();
            d0Var.applyDelta(cVar);
            this.f11769d.addKey(cVar);
        }

        public void setKeyPosition(d0 d0Var) {
            z2.d dVar = new z2.d();
            d0Var.applyDelta(dVar);
            this.f11769d.addKey(dVar);
        }

        public void setPathRelative(a aVar) {
            this.f11769d.setupRelative(aVar.f11769d);
        }

        public void update(d3.g gVar, int i10) {
            y2.e eVar = this.f11769d;
            if (i10 == 0) {
                this.f11766a.update(gVar);
                y2.h hVar = this.f11771f;
                hVar.updateMotion(hVar);
                eVar.setStart(hVar);
                this.f11770e = true;
                return;
            }
            if (i10 == 1) {
                this.f11767b.update(gVar);
                eVar.setEnd(this.f11772g);
                this.f11770e = true;
            }
        }

        public void setKeyAttribute(d0 d0Var, y2.c[] cVarArr) {
            z2.b bVar = new z2.b();
            d0Var.applyDelta(bVar);
            if (cVarArr != null) {
                for (int i10 = 0; i10 < cVarArr.length; i10++) {
                    bVar.f97456c.put(cVarArr[i10].getName(), cVarArr[i10]);
                }
            }
            this.f11769d.addKey(bVar);
        }
    }

    public f getEnd(d3.g gVar) {
        return getWidgetState(gVar.f51793l, null, 1).f11767b;
    }

    public f getInterpolated(d3.g gVar) {
        return getWidgetState(gVar.f51793l, null, 2).f11768c;
    }

    public f getStart(d3.g gVar) {
        return getWidgetState(gVar.f51793l, null, 0).f11766a;
    }

    @Override // a3.i0
    public boolean setValue(int i10, String str) {
        if (i10 != 705) {
            return false;
        }
        this.f11756d = str;
        this.f11757e = g.getInterpolator(str);
        return false;
    }

    @Override // a3.i0
    public boolean setValue(int i10, boolean z10) {
        return false;
    }

    public b getInterpolator() {
        return getInterpolator(0, this.f11756d);
    }

    public void setTouchUp(float f10, long j10, float f11, float f12) {
    }
}
