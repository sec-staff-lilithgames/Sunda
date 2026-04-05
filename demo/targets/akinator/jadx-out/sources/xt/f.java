package xt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends AtomicBoolean implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f93402c;

    public f(g gVar, mt.f fVar) {
        this.f93402c = gVar;
        this.f93401b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        if (compareAndSet(false, true)) {
            this.f93402c.d(this);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get();
    }
}
