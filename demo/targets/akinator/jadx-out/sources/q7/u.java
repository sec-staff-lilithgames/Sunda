package q7;

import m7.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends r {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public u(v vVar) {
        super(null);
    }

    @Override // q7.r
    public boolean allowHardwareMainThread(m7.j jVar) {
        m7.c width = jVar.getWidth();
        if ((width instanceof c.a ? ((c.a) width).f74052a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        m7.c height = jVar.getHeight();
        return (height instanceof c.a ? ((c.a) height).f74052a : Integer.MAX_VALUE) > 100;
    }

    @Override // q7.r
    public boolean allowHardwareWorkerThread() {
        return q.f82550a.hasAvailableFileDescriptors(null);
    }
}
