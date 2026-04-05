package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r1 extends t1 {

    /* renamed from: l, reason: collision with root package name */
    public final s.f f6704l;

    public r1() {
        this.f6704l = new s.f();
    }

    public <S> void addSource(l1 l1Var, u1 u1Var) {
        if (l1Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        q1 q1Var = new q1(l1Var, u1Var);
        q1 q1Var2 = (q1) this.f6704l.putIfAbsent(l1Var, q1Var);
        if (q1Var2 != null && q1Var2.f6700c != u1Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (q1Var2 == null && hasActiveObservers()) {
            l1Var.observeForever(q1Var);
        }
    }

    @Override // androidx.lifecycle.l1
    public void d() {
        Iterator<Map.Entry<Object, Object>> it = this.f6704l.iterator();
        while (it.hasNext()) {
            q1 q1Var = (q1) it.next().getValue();
            q1Var.f6699b.observeForever(q1Var);
        }
    }

    @Override // androidx.lifecycle.l1
    public void e() {
        Iterator<Map.Entry<Object, Object>> it = this.f6704l.iterator();
        while (it.hasNext()) {
            q1 q1Var = (q1) it.next().getValue();
            q1Var.f6699b.removeObserver(q1Var);
        }
    }

    public <S> void removeSource(l1 l1Var) {
        q1 q1Var = (q1) this.f6704l.remove(l1Var);
        if (q1Var != null) {
            q1Var.f6699b.removeObserver(q1Var);
        }
    }

    public r1(Object obj) {
        super(obj);
        this.f6704l = new s.f();
    }
}
