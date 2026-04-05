package eu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends AtomicReference {

    /* renamed from: b, reason: collision with root package name */
    public Object f55134b;

    public Object getAndNullValue() {
        Object objLpValue = lpValue();
        spValue(null);
        return objLpValue;
    }

    public Object lpValue() {
        return this.f55134b;
    }

    public a lvNext() {
        return (a) get();
    }

    public void soNext(a aVar) {
        lazySet(aVar);
    }

    public void spValue(Object obj) {
        this.f55134b = obj;
    }
}
