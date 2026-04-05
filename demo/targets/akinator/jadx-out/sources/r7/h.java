package r7;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public Map f83899c;

    /* renamed from: d, reason: collision with root package name */
    public Map f83900d;

    /* renamed from: e, reason: collision with root package name */
    public float f83901e;

    /* renamed from: f, reason: collision with root package name */
    public Map f83902f;

    /* renamed from: g, reason: collision with root package name */
    public List f83903g;

    /* renamed from: h, reason: collision with root package name */
    public u1 f83904h;

    /* renamed from: i, reason: collision with root package name */
    public z.x f83905i;

    /* renamed from: j, reason: collision with root package name */
    public List f83906j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f83907k;

    /* renamed from: l, reason: collision with root package name */
    public float f83908l;

    /* renamed from: m, reason: collision with root package name */
    public float f83909m;

    /* renamed from: n, reason: collision with root package name */
    public float f83910n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f83911o;

    /* renamed from: q, reason: collision with root package name */
    public int f83913q;

    /* renamed from: r, reason: collision with root package name */
    public int f83914r;

    /* renamed from: a, reason: collision with root package name */
    public final o0 f83897a = new o0();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f83898b = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f83912p = 0;

    public void addWarning(String str) {
        e8.e.warning(str);
        this.f83898b.add(str);
    }

    public Rect getBounds() {
        return this.f83907k;
    }

    public u1 getCharacters() {
        return this.f83904h;
    }

    public float getDuration() {
        return (long) ((getDurationFrames() / this.f83910n) * 1000.0f);
    }

    public float getDurationFrames() {
        return this.f83909m - this.f83908l;
    }

    public float getEndFrame() {
        return this.f83909m;
    }

    public Map<String, x7.d> getFonts() {
        return this.f83902f;
    }

    public float getFrameForProgress(float f10) {
        return e8.j.lerp(this.f83908l, this.f83909m, f10);
    }

    public float getFrameRate() {
        return this.f83910n;
    }

    public Map<String, d0> getImages() {
        float fDpScale = e8.n.dpScale();
        if (fDpScale != this.f83901e) {
            for (Map.Entry entry : this.f83900d.entrySet()) {
                this.f83900d.put((String) entry.getKey(), ((d0) entry.getValue()).copyWithScale(this.f83901e / fDpScale));
            }
        }
        this.f83901e = fDpScale;
        return this.f83900d;
    }

    public List<a8.f> getLayers() {
        return this.f83906j;
    }

    public x7.i getMarker(String str) {
        int size = this.f83903g.size();
        for (int i10 = 0; i10 < size; i10++) {
            x7.i iVar = (x7.i) this.f83903g.get(i10);
            if (iVar.matchesName(str)) {
                return iVar;
            }
        }
        return null;
    }

    public List<x7.i> getMarkers() {
        return this.f83903g;
    }

    public int getMaskAndMatteCount() {
        return this.f83912p;
    }

    public o0 getPerformanceTracker() {
        return this.f83897a;
    }

    public List<a8.f> getPrecomps(String str) {
        return (List) this.f83899c.get(str);
    }

    public float getProgressForFrame(float f10) {
        float f11 = this.f83908l;
        return (f10 - f11) / (this.f83909m - f11);
    }

    public float getStartFrame() {
        return this.f83908l;
    }

    public int getUnscaledHeight() {
        return this.f83914r;
    }

    public int getUnscaledWidth() {
        return this.f83913q;
    }

    public ArrayList<String> getWarnings() {
        HashSet hashSet = this.f83898b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    public boolean hasDashPattern() {
        return this.f83911o;
    }

    public boolean hasImages() {
        return !this.f83900d.isEmpty();
    }

    public void incrementMatteOrMaskCount(int i10) {
        this.f83912p += i10;
    }

    public void init(Rect rect, float f10, float f11, float f12, List<a8.f> list, z.x xVar, Map<String, List<a8.f>> map, Map<String, d0> map2, float f13, u1 u1Var, Map<String, x7.d> map3, List<x7.i> list2, int i10, int i11) {
        this.f83907k = rect;
        this.f83908l = f10;
        this.f83909m = f11;
        this.f83910n = f12;
        this.f83906j = list;
        this.f83905i = xVar;
        this.f83899c = map;
        this.f83900d = map2;
        this.f83901e = f13;
        this.f83904h = u1Var;
        this.f83902f = map3;
        this.f83903g = list2;
        this.f83913q = i10;
        this.f83914r = i11;
    }

    public a8.f layerModelForId(long j10) {
        return (a8.f) this.f83905i.get(j10);
    }

    public void setHasDashPattern(boolean z10) {
        this.f83911o = z10;
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f83897a.f83973a = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f83906j.iterator();
        while (it.hasNext()) {
            sb2.append(((a8.f) it.next()).toString("\t"));
        }
        return sb2.toString();
    }
}
