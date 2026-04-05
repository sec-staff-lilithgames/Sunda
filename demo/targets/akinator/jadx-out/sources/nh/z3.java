package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z3 extends d4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f76809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.f76809c = iterable2;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this.f76809c.iterator();
    }
}
