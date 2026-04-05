package w2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends d0 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f90336b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f90337c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f90338d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f90339e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f90340f;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f90336b = atomicReferenceFieldUpdater;
        this.f90337c = atomicReferenceFieldUpdater2;
        this.f90338d = atomicReferenceFieldUpdater3;
        this.f90339e = atomicReferenceFieldUpdater4;
        this.f90340f = atomicReferenceFieldUpdater5;
    }

    @Override // kotlin.jvm.internal.d0
    public final void C(h hVar, h hVar2) {
        this.f90337c.lazySet(hVar, hVar2);
    }

    @Override // kotlin.jvm.internal.d0
    public final void E(h hVar, Thread thread) {
        this.f90336b.lazySet(hVar, thread);
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean e(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f90339e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean g(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f90340f;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean i(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f90338d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
