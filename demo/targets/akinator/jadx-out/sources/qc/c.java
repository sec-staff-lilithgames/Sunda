package qc;

import dd.i;
import dd.p;
import jc.n0;
import rc.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f82734a;

    static {
        c cVar;
        try {
            cVar = (c) i.createInstance(d.class, false);
        } catch (IllegalAccessError unused) {
            cVar = null;
            f82734a = cVar;
        } catch (Throwable th2) {
            p.rethrowIfFatal(th2);
            cVar = null;
            f82734a = cVar;
        }
        f82734a = cVar;
    }

    public static c instance() {
        return f82734a;
    }

    public abstract n0 findConstructorName(q qVar);

    public abstract Boolean findTransient(rc.b bVar);

    public abstract Boolean hasCreatorAnnotation(rc.b bVar);
}
