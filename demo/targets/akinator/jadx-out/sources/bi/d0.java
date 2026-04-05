package bi;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d0 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f9553a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f9554b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9555c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f9556d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f9557e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f9558f;

    /* renamed from: g, reason: collision with root package name */
    public final d f9559g;

    public d0(c cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.getDependencies()) {
            if (qVar.isDirectInjection()) {
                if (qVar.isSet()) {
                    hashSet4.add(qVar.getInterface());
                } else {
                    hashSet.add(qVar.getInterface());
                }
            } else if (qVar.isDeferred()) {
                hashSet3.add(qVar.getInterface());
            } else if (qVar.isSet()) {
                hashSet5.add(qVar.getInterface());
            } else {
                hashSet2.add(qVar.getInterface());
            }
        }
        if (!cVar.getPublishedEvents().isEmpty()) {
            hashSet.add(b0.unqualified(yi.c.class));
        }
        this.f9553a = Collections.unmodifiableSet(hashSet);
        this.f9554b = Collections.unmodifiableSet(hashSet2);
        this.f9555c = Collections.unmodifiableSet(hashSet3);
        this.f9556d = Collections.unmodifiableSet(hashSet4);
        this.f9557e = Collections.unmodifiableSet(hashSet5);
        this.f9558f = cVar.getPublishedEvents();
        this.f9559g = dVar;
    }

    @Override // bi.d
    public <T> T get(Class<T> cls) {
        if (this.f9553a.contains(b0.unqualified(cls))) {
            T t10 = (T) this.f9559g.get(cls);
            return !cls.equals(yi.c.class) ? t10 : (T) new c0(this.f9558f, (yi.c) t10);
        }
        throw new s("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // bi.d
    public <T> sj.b getDeferred(Class<T> cls) {
        return getDeferred(b0.unqualified(cls));
    }

    @Override // bi.d
    public <T> sj.c getProvider(Class<T> cls) {
        return getProvider(b0.unqualified(cls));
    }

    @Override // bi.d
    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
        return super.setOf(cls);
    }

    @Override // bi.d
    public <T> sj.c setOfProvider(Class<T> cls) {
        return setOfProvider(b0.unqualified(cls));
    }

    @Override // bi.d
    public <T> sj.b getDeferred(b0 b0Var) {
        if (this.f9555c.contains(b0Var)) {
            return this.f9559g.getDeferred(b0Var);
        }
        throw new s("Attempting to request an undeclared dependency Deferred<" + b0Var + ">.");
    }

    @Override // bi.d
    public <T> sj.c getProvider(b0 b0Var) {
        if (this.f9554b.contains(b0Var)) {
            return this.f9559g.getProvider(b0Var);
        }
        throw new s("Attempting to request an undeclared dependency Provider<" + b0Var + ">.");
    }

    @Override // bi.d
    public <T> Set<T> setOf(b0 b0Var) {
        if (this.f9556d.contains(b0Var)) {
            return this.f9559g.setOf(b0Var);
        }
        throw new s("Attempting to request an undeclared dependency Set<" + b0Var + ">.");
    }

    @Override // bi.d
    public <T> sj.c setOfProvider(b0 b0Var) {
        if (this.f9557e.contains(b0Var)) {
            return this.f9559g.setOfProvider(b0Var);
        }
        throw new s("Attempting to request an undeclared dependency Provider<Set<" + b0Var + ">>.");
    }

    @Override // bi.d
    public <T> T get(b0 b0Var) {
        if (this.f9553a.contains(b0Var)) {
            return (T) this.f9559g.get(b0Var);
        }
        throw new s("Attempting to request an undeclared dependency " + b0Var + ".");
    }
}
