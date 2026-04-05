package nu;

import mt.l;
import mt.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a extends l implements tw.a, q {
    public abstract Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasSubscribers();

    public abstract boolean hasThrowable();

    @Override // tw.a, tw.c, mt.f
    public abstract /* synthetic */ void onComplete();

    @Override // tw.a, tw.c, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // tw.a, tw.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // tw.a, tw.c
    public abstract /* synthetic */ void onSubscribe(tw.d dVar);

    public final a toSerialized() {
        return this instanceof b ? this : new b(this);
    }
}
