package pu;

import mt.b0;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f extends b0 implements i0 {
    public abstract Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasObservers();

    public abstract boolean hasThrowable();

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th2);

    public abstract /* synthetic */ void onNext(Object obj);

    public abstract /* synthetic */ void onSubscribe(pt.c cVar);

    public final f toSerialized() {
        return this instanceof e ? this : new e(this);
    }
}
