package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x7 implements xe {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f76759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76760c;

    /* renamed from: e, reason: collision with root package name */
    public Object f76761e;

    public x7(Iterator it) {
        this.f76759b = (Iterator) mh.p1.checkNotNull(it);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76760c || this.f76759b.hasNext();
    }

    @Override // nh.xe, java.util.Iterator
    public Object next() {
        if (!this.f76760c) {
            return this.f76759b.next();
        }
        Object obj = this.f76761e;
        this.f76760c = false;
        this.f76761e = null;
        return obj;
    }

    @Override // nh.xe
    public Object peek() {
        if (!this.f76760c) {
            this.f76761e = this.f76759b.next();
            this.f76760c = true;
        }
        return this.f76761e;
    }

    @Override // nh.xe, java.util.Iterator
    public void remove() {
        mh.p1.checkState(!this.f76760c, "Can't remove after you've peeked at next");
        this.f76759b.remove();
    }
}
