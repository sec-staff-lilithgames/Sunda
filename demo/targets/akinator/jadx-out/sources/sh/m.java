package sh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m extends kotlin.jvm.internal.d0 {
    @Override // kotlin.jvm.internal.d0
    public final void B(s sVar, s sVar2) {
        sVar.f85856b = sVar2;
    }

    @Override // kotlin.jvm.internal.d0
    public final void D(s sVar, Thread thread) {
        sVar.f85855a = thread;
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean d(k kVar, h hVar, h hVar2) {
        synchronized (kVar) {
            try {
                if (kVar.f85863c != hVar) {
                    return false;
                }
                kVar.f85863c = hVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean f(t tVar, Object obj, Object obj2) {
        synchronized (tVar) {
            try {
                if (tVar.f85862b != obj) {
                    return false;
                }
                tVar.f85862b = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean h(t tVar, s sVar, s sVar2) {
        synchronized (tVar) {
            try {
                if (tVar.f85864e != sVar) {
                    return false;
                }
                tVar.f85864e = sVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.jvm.internal.d0
    public final h l(k kVar) {
        h hVar;
        h hVar2 = h.f85813d;
        synchronized (kVar) {
            try {
                hVar = kVar.f85863c;
                if (hVar != hVar2) {
                    kVar.f85863c = hVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // kotlin.jvm.internal.d0
    public final s m(k kVar) {
        s sVar;
        s sVar2 = s.f85854c;
        synchronized (kVar) {
            try {
                sVar = kVar.f85864e;
                if (sVar != sVar2) {
                    kVar.f85864e = sVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
