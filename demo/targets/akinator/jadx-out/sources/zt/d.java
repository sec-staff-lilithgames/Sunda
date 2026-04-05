package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends AtomicReference implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98560b;

    public d(mt.v vVar, e eVar) {
        super(eVar);
        this.f98560b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        e eVar = (e) getAndSet(null);
        if (eVar != null) {
            eVar.a(this);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == null;
    }
}
