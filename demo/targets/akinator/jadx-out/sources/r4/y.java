package r4;

import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y implements a {

    /* renamed from: n, reason: collision with root package name */
    public static final o f83763n;

    /* renamed from: o, reason: collision with root package name */
    public static final p f83764o;

    /* renamed from: p, reason: collision with root package name */
    public static final q f83765p;

    /* renamed from: q, reason: collision with root package name */
    public static final r f83766q;

    /* renamed from: r, reason: collision with root package name */
    public static final s f83767r;

    /* renamed from: s, reason: collision with root package name */
    public static final h f83768s;

    /* renamed from: a, reason: collision with root package name */
    public float f83769a;

    /* renamed from: b, reason: collision with root package name */
    public float f83770b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83771c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f83772d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f83773e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f83774f;

    /* renamed from: g, reason: collision with root package name */
    public float f83775g;

    /* renamed from: h, reason: collision with root package name */
    public float f83776h;

    /* renamed from: i, reason: collision with root package name */
    public long f83777i;

    /* renamed from: j, reason: collision with root package name */
    public float f83778j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f83779k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f83780l;

    /* renamed from: m, reason: collision with root package name */
    public c f83781m;

    static {
        new l("translationX");
        new m("translationY");
        new n("translationZ");
        f83763n = new o("scaleX");
        f83764o = new p("scaleY");
        f83765p = new q("rotation");
        f83766q = new r("rotationX");
        f83767r = new s("rotationY");
        new t("x");
        new f("y");
        new g("z");
        f83768s = new h("alpha");
        new i("scrollX");
        new j("scrollY");
    }

    public y(b0 b0Var) {
        this.f83769a = 0.0f;
        this.f83770b = Float.MAX_VALUE;
        this.f83771c = false;
        this.f83774f = false;
        this.f83775g = Float.MAX_VALUE;
        this.f83776h = -3.4028235E38f;
        this.f83777i = 0L;
        this.f83779k = new ArrayList();
        this.f83780l = new ArrayList();
        this.f83772d = null;
        this.f83773e = new k(b0Var);
        this.f83778j = 1.0f;
    }

    public final void a(boolean z10) {
        ArrayList arrayList;
        int i10 = 0;
        this.f83774f = false;
        c animationHandler = getAnimationHandler();
        animationHandler.f83735a.remove(this);
        ArrayList arrayList2 = animationHandler.f83736b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            animationHandler.f83740f = true;
        }
        this.f83777i = 0L;
        this.f83771c = false;
        while (true) {
            arrayList = this.f83779k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((e6.e0) ((v) arrayList.get(i10))).onAnimationEnd(this, z10, this.f83770b, this.f83769a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public y addEndListener(v vVar) {
        ArrayList arrayList = this.f83779k;
        if (!arrayList.contains(vVar)) {
            arrayList.add(vVar);
        }
        return this;
    }

    public y addUpdateListener(w wVar) {
        if (isRunning()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = this.f83780l;
        if (!arrayList.contains(wVar)) {
            arrayList.add(wVar);
        }
        return this;
    }

    public final void b(float f10) {
        ArrayList arrayList;
        this.f83773e.setValue(this.f83772d, f10);
        int i10 = 0;
        while (true) {
            arrayList = this.f83780l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((e6.f0) ((w) arrayList.get(i10))).onAnimationUpdate(this, this.f83770b, this.f83769a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void cancel() {
        if (!((e) getAnimationHandler().f83739e).isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f83774f) {
            a(true);
        }
    }

    @Override // r4.a
    public boolean doAnimationFrame(long j10) {
        long j11 = this.f83777i;
        if (j11 == 0) {
            this.f83777i = j10;
            b(this.f83770b);
            return false;
        }
        long j12 = j10 - j11;
        this.f83777i = j10;
        float durationScale = getAnimationHandler().getDurationScale();
        long j13 = durationScale == 0.0f ? 2147483647L : (long) (j12 / durationScale);
        e0 e0Var = (e0) this;
        boolean z10 = true;
        if (e0Var.f83749v) {
            float f10 = e0Var.f83748u;
            if (f10 != Float.MAX_VALUE) {
                e0Var.f83747t.setFinalPosition(f10);
                e0Var.f83748u = Float.MAX_VALUE;
            }
            e0Var.f83770b = e0Var.f83747t.getFinalPosition();
            e0Var.f83769a = 0.0f;
            e0Var.f83749v = false;
        } else {
            if (e0Var.f83748u != Float.MAX_VALUE) {
                long j14 = j13 / 2;
                u uVarA = e0Var.f83747t.a(j14, e0Var.f83770b, e0Var.f83769a);
                e0Var.f83747t.setFinalPosition(e0Var.f83748u);
                e0Var.f83748u = Float.MAX_VALUE;
                u uVarA2 = e0Var.f83747t.a(j14, uVarA.f83761a, uVarA.f83762b);
                e0Var.f83770b = uVarA2.f83761a;
                e0Var.f83769a = uVarA2.f83762b;
            } else {
                u uVarA3 = e0Var.f83747t.a(j13, e0Var.f83770b, e0Var.f83769a);
                e0Var.f83770b = uVarA3.f83761a;
                e0Var.f83769a = uVarA3.f83762b;
            }
            float fMax = Math.max(e0Var.f83770b, e0Var.f83776h);
            e0Var.f83770b = fMax;
            float fMin = Math.min(fMax, e0Var.f83775g);
            e0Var.f83770b = fMin;
            if (e0Var.f83747t.isAtEquilibrium(fMin, e0Var.f83769a)) {
                e0Var.f83770b = e0Var.f83747t.getFinalPosition();
                e0Var.f83769a = 0.0f;
            } else {
                z10 = false;
            }
        }
        float fMin2 = Math.min(this.f83770b, this.f83775g);
        this.f83770b = fMin2;
        float fMax2 = Math.max(fMin2, this.f83776h);
        this.f83770b = fMax2;
        b(fMax2);
        if (z10) {
            a(false);
        }
        return z10;
    }

    public c getAnimationHandler() {
        c cVar = this.f83781m;
        if (cVar != null) {
            return cVar;
        }
        ThreadLocal threadLocal = c.f83734i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new e()));
        }
        return (c) threadLocal.get();
    }

    public float getMinimumVisibleChange() {
        return this.f83778j;
    }

    public d0 getScheduler() {
        c cVar = this.f83781m;
        if (cVar != null) {
            return cVar.f83739e;
        }
        ThreadLocal threadLocal = c.f83734i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new e()));
        }
        return ((c) threadLocal.get()).f83739e;
    }

    public boolean isRunning() {
        return this.f83774f;
    }

    public void removeEndListener(v vVar) {
        ArrayList arrayList = this.f83779k;
        int iIndexOf = arrayList.indexOf(vVar);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public void removeUpdateListener(w wVar) {
        ArrayList arrayList = this.f83780l;
        int iIndexOf = arrayList.indexOf(wVar);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public y setMaxValue(float f10) {
        this.f83775g = f10;
        return this;
    }

    public y setMinValue(float f10) {
        this.f83776h = f10;
        return this;
    }

    public y setMinimumVisibleChange(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f83778j = f10;
        return this;
    }

    public void setScheduler(d0 d0Var) {
        c cVar = this.f83781m;
        if (cVar == null || cVar.f83739e != d0Var) {
            if (this.f83774f) {
                throw new AndroidRuntimeException("Animations are still running and the animationhandler should not be set at this timming");
            }
            this.f83781m = new c(d0Var);
        }
    }

    public y setStartValue(float f10) {
        this.f83770b = f10;
        this.f83771c = true;
        return this;
    }

    public y setStartVelocity(float f10) {
        this.f83769a = f10;
        return this;
    }

    public void start() {
        if (!((e) getAnimationHandler().f83739e).isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z10 = this.f83774f;
        if (z10 || z10) {
            return;
        }
        this.f83774f = true;
        if (!this.f83771c) {
            this.f83770b = this.f83773e.getValue(this.f83772d);
        }
        float f10 = this.f83770b;
        if (f10 > this.f83775g || f10 < this.f83776h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        getAnimationHandler().a(this);
    }

    public y(Object obj, a0 a0Var) {
        this.f83769a = 0.0f;
        this.f83770b = Float.MAX_VALUE;
        this.f83771c = false;
        this.f83774f = false;
        this.f83775g = Float.MAX_VALUE;
        this.f83776h = -3.4028235E38f;
        this.f83777i = 0L;
        this.f83779k = new ArrayList();
        this.f83780l = new ArrayList();
        this.f83772d = obj;
        this.f83773e = a0Var;
        if (a0Var != f83765p && a0Var != f83766q && a0Var != f83767r) {
            if (a0Var == f83768s) {
                this.f83778j = 0.00390625f;
                return;
            } else if (a0Var != f83763n && a0Var != f83764o) {
                this.f83778j = 1.0f;
                return;
            } else {
                this.f83778j = 0.002f;
                return;
            }
        }
        this.f83778j = 0.1f;
    }
}
