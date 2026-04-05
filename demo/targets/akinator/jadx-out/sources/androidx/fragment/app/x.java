package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends i.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f6483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j.a f6484b;

    public x(AtomicReference atomicReference, j.a aVar) {
        this.f6483a = atomicReference;
        this.f6484b = aVar;
    }

    @Override // i.d
    public j.a getContract() {
        return this.f6484b;
    }

    @Override // i.d
    public void launch(Object obj, k3.h hVar) {
        i.d dVar = (i.d) this.f6483a.get();
        if (dVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        dVar.launch(obj, hVar);
    }

    @Override // i.d
    public void unregister() {
        i.d dVar = (i.d) this.f6483a.getAndSet(null);
        if (dVar != null) {
            dVar.unregister();
        }
    }
}
