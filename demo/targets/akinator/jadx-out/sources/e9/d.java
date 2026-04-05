package e9;

import j9.p;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p8.s0;
import p8.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f53981c = new s0(Object.class, Object.class, Object.class, Collections.singletonList(new t(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new c9.h(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final z.f f53982a = new z.f();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f53983b = new AtomicReference();

    public <Data, TResource, Transcode> s0 get(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        s0 s0Var;
        p pVar = (p) this.f53983b.getAndSet(null);
        if (pVar == null) {
            pVar = new p();
        }
        pVar.set(cls, cls2, cls3);
        synchronized (this.f53982a) {
            s0Var = (s0) this.f53982a.get(pVar);
        }
        this.f53983b.set(pVar);
        return s0Var;
    }

    public boolean isEmptyLoadPath(s0 s0Var) {
        return f53981c.equals(s0Var);
    }

    public void put(Class<?> cls, Class<?> cls2, Class<?> cls3, s0 s0Var) {
        synchronized (this.f53982a) {
            z.f fVar = this.f53982a;
            p pVar = new p(cls, cls2, cls3);
            if (s0Var == null) {
                s0Var = f53981c;
            }
            fVar.put(pVar, s0Var);
        }
    }
}
