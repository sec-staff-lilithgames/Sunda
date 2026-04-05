package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c7 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public boolean f76152b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f76153c;

    public c7(Iterator it) {
        this.f76153c = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76153c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f76153c.next();
        this.f76152b = false;
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        jh.i.t(!this.f76152b);
        this.f76153c.remove();
    }
}
