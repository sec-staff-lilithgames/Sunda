package ed;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o extends AtomicReference implements a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f54115b;

    /* renamed from: c, reason: collision with root package name */
    public o f54116c;

    /* renamed from: e, reason: collision with root package name */
    public o f54117e;

    public o(Object obj, t tVar) {
        super(tVar);
        this.f54115b = obj;
    }

    public final Object a() {
        return ((t) get()).f54128b;
    }

    @Override // ed.a
    public o getNext() {
        return this.f54117e;
    }

    @Override // ed.a
    public o getPrevious() {
        return this.f54116c;
    }

    @Override // ed.a
    public void setNext(o oVar) {
        this.f54117e = oVar;
    }

    @Override // ed.a
    public void setPrevious(o oVar) {
        this.f54116c = oVar;
    }
}
