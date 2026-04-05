package bu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.g0 f10136b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10137c;

    public c(mt.g0 g0Var, int i10) {
        this.f10136b = g0Var;
        this.f10137c = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        b bVar = new b(this.f10137c);
        this.f10136b.subscribe(bVar);
        return bVar;
    }
}
