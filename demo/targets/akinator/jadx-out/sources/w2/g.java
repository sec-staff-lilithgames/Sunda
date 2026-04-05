package w2;

import kotlin.jvm.internal.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends d0 {
    @Override // kotlin.jvm.internal.d0
    public final void C(h hVar, h hVar2) {
        hVar.f90345b = hVar2;
    }

    @Override // kotlin.jvm.internal.d0
    public final void E(h hVar, Thread thread) {
        hVar.f90344a = thread;
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean e(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f90351c != dVar) {
                    return false;
                }
                iVar.f90351c = dVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean g(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f90350b != obj) {
                    return false;
                }
                iVar.f90350b = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean i(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f90352e != hVar) {
                    return false;
                }
                iVar.f90352e = hVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
