package w3;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Object f90372c;

    public h(int i10) {
        super(i10);
        this.f90372c = new Object();
    }

    @Override // w3.g, w3.f
    public Object acquire() {
        Object objAcquire;
        synchronized (this.f90372c) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // w3.g, w3.f
    public boolean release(Object instance) {
        boolean zRelease;
        e0.checkNotNullParameter(instance, "instance");
        synchronized (this.f90372c) {
            zRelease = super.release(instance);
        }
        return zRelease;
    }
}
