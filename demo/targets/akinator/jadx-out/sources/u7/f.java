package u7;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: c, reason: collision with root package name */
    public final c f87983c;

    /* renamed from: e, reason: collision with root package name */
    public f8.c f87985e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f87981a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f87982b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f87984d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f87986f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f87987g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f87988h = -1.0f;

    public f(List list) {
        c eVar;
        if (list.isEmpty()) {
            eVar = new b();
        } else {
            eVar = list.size() == 1 ? new e(list) : new d(list);
        }
        this.f87983c = eVar;
    }

    public final f8.a a() {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        f8.a currentKeyframe = this.f87983c.getCurrentKeyframe();
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return currentKeyframe;
    }

    public void addUpdateListener(a aVar) {
        this.f87981a.add(aVar);
    }

    public float b() {
        if (this.f87988h == -1.0f) {
            this.f87988h = this.f87983c.getEndProgress();
        }
        return this.f87988h;
    }

    public final float c() {
        Interpolator interpolator;
        f8.a aVarA = a();
        if (aVarA == null || aVarA.isStatic() || (interpolator = aVarA.f55491d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.f87982b) {
            return 0.0f;
        }
        f8.a aVarA = a();
        if (aVarA.isStatic()) {
            return 0.0f;
        }
        return (this.f87984d - aVarA.getStartProgress()) / (aVarA.getEndProgress() - aVarA.getStartProgress());
    }

    public Object e(f8.a aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean f() {
        return false;
    }

    public float getProgress() {
        return this.f87984d;
    }

    public Object getValue() {
        float fD = d();
        if (this.f87985e == null && this.f87983c.isCachedValueEnabled(fD) && !f()) {
            return this.f87986f;
        }
        f8.a aVarA = a();
        Interpolator interpolator = aVarA.f55492e;
        Interpolator interpolator2 = aVarA.f55493f;
        Object value = (interpolator == null || interpolator2 == null) ? getValue(aVarA, c()) : e(aVarA, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f87986f = value;
        return value;
    }

    public abstract Object getValue(f8.a aVar, float f10);

    public boolean hasValueCallback() {
        return this.f87985e != null;
    }

    public void notifyListeners() {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("BaseKeyframeAnimation#notifyListeners");
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f87981a;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((a) arrayList.get(i10)).onValueChanged();
            i10++;
        }
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void setIsDiscrete() {
        this.f87982b = true;
    }

    public void setProgress(float f10) {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("BaseKeyframeAnimation#setProgress");
        }
        c cVar = this.f87983c;
        if (cVar.isEmpty()) {
            if (r7.d.isTraceEnabled()) {
                r7.d.endSection("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (this.f87987g == -1.0f) {
            this.f87987g = cVar.getStartDelayProgress();
        }
        float f11 = this.f87987g;
        if (f10 < f11) {
            if (f11 == -1.0f) {
                this.f87987g = cVar.getStartDelayProgress();
            }
            f10 = this.f87987g;
        } else if (f10 > b()) {
            f10 = b();
        }
        if (f10 == this.f87984d) {
            if (r7.d.isTraceEnabled()) {
                r7.d.endSection("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f87984d = f10;
            if (cVar.isValueChanged(f10)) {
                notifyListeners();
            }
            if (r7.d.isTraceEnabled()) {
                r7.d.endSection("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void setValueCallback(f8.c cVar) {
        f8.c cVar2 = this.f87985e;
        if (cVar2 != null) {
            cVar2.setAnimation(null);
        }
        this.f87985e = cVar;
        if (cVar != null) {
            cVar.setAnimation(this);
        }
    }
}
