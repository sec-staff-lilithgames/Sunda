package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f6648k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f6649a;

    /* renamed from: b, reason: collision with root package name */
    public final s.f f6650b;

    /* renamed from: c, reason: collision with root package name */
    public int f6651c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6652d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f6653e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f6654f;

    /* renamed from: g, reason: collision with root package name */
    public int f6655g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6656h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6657i;

    /* renamed from: j, reason: collision with root package name */
    public final h1 f6658j;

    public l1(Object obj) {
        this.f6649a = new Object();
        this.f6650b = new s.f();
        this.f6651c = 0;
        this.f6654f = f6648k;
        this.f6658j = new h1(this);
        this.f6653e = obj;
        this.f6655g = 0;
    }

    public static void a(String str) {
        if (!r.a.getInstance().isMainThread()) {
            throw new IllegalStateException(a.b.l("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(k1 k1Var) {
        if (k1Var.f6637c) {
            if (!k1Var.d()) {
                k1Var.a(false);
                return;
            }
            int i10 = k1Var.f6638e;
            int i11 = this.f6655g;
            if (i10 >= i11) {
                return;
            }
            k1Var.f6638e = i11;
            k1Var.f6636b.onChanged(this.f6653e);
        }
    }

    public final void c(k1 k1Var) {
        if (this.f6656h) {
            this.f6657i = true;
            return;
        }
        this.f6656h = true;
        do {
            this.f6657i = false;
            if (k1Var != null) {
                b(k1Var);
                k1Var = null;
            } else {
                s.d dVarIteratorWithAdditions = this.f6650b.iteratorWithAdditions();
                while (dVarIteratorWithAdditions.hasNext()) {
                    b((k1) ((Map.Entry) dVarIteratorWithAdditions.next()).getValue());
                    if (this.f6657i) {
                        break;
                    }
                }
            }
        } while (this.f6657i);
        this.f6656h = false;
    }

    public Object getValue() {
        Object obj = this.f6653e;
        if (obj != f6648k) {
            return obj;
        }
        return null;
    }

    public boolean hasActiveObservers() {
        return this.f6651c > 0;
    }

    public boolean hasObservers() {
        return this.f6650b.size() > 0;
    }

    public boolean isInitialized() {
        return this.f6653e != f6648k;
    }

    public void observe(b1 b1Var, u1 u1Var) {
        a("observe");
        if (b1Var.getLifecycle().getCurrentState() == j0.f6614b) {
            return;
        }
        j1 j1Var = new j1(this, b1Var, u1Var);
        k1 k1Var = (k1) this.f6650b.putIfAbsent(u1Var, j1Var);
        if (k1Var != null && !k1Var.c(b1Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (k1Var != null) {
            return;
        }
        b1Var.getLifecycle().addObserver(j1Var);
    }

    public void observeForever(u1 u1Var) {
        a("observeForever");
        i1 i1Var = new i1(this, u1Var);
        k1 k1Var = (k1) this.f6650b.putIfAbsent(u1Var, i1Var);
        if (k1Var instanceof j1) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (k1Var != null) {
            return;
        }
        i1Var.a(true);
    }

    public void postValue(Object obj) {
        boolean z10;
        synchronized (this.f6649a) {
            z10 = this.f6654f == f6648k;
            this.f6654f = obj;
        }
        if (z10) {
            r.a.getInstance().postToMainThread(this.f6658j);
        }
    }

    public void removeObserver(u1 u1Var) {
        a("removeObserver");
        k1 k1Var = (k1) this.f6650b.remove(u1Var);
        if (k1Var == null) {
            return;
        }
        k1Var.b();
        k1Var.a(false);
    }

    public void removeObservers(b1 b1Var) {
        a("removeObservers");
        Iterator<Map.Entry<Object, Object>> it = this.f6650b.iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> next = it.next();
            if (((k1) next.getValue()).c(b1Var)) {
                removeObserver((u1) next.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        a("setValue");
        this.f6655g++;
        this.f6653e = obj;
        c(null);
    }

    public l1() {
        this.f6649a = new Object();
        this.f6650b = new s.f();
        this.f6651c = 0;
        Object obj = f6648k;
        this.f6654f = obj;
        this.f6658j = new h1(this);
        this.f6653e = obj;
        this.f6655g = -1;
    }

    public void d() {
    }

    public void e() {
    }
}
