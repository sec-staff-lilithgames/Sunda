package e9;

import j9.p;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f53984a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final z.f f53985b = new z.f();

    public void clear() {
        synchronized (this.f53985b) {
            this.f53985b.clear();
        }
    }

    public List<Class<?>> get(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        p pVar = (p) this.f53984a.getAndSet(null);
        if (pVar == null) {
            pVar = new p(cls, cls2, cls3);
        } else {
            pVar.set(cls, cls2, cls3);
        }
        synchronized (this.f53985b) {
            list = (List) this.f53985b.get(pVar);
        }
        this.f53984a.set(pVar);
        return list;
    }

    public void put(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f53985b) {
            this.f53985b.put(new p(cls, cls2, cls3), list);
        }
    }
}
