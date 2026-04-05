package x0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends d implements Iterator, lv.c {

    /* renamed from: f, reason: collision with root package name */
    public final c f91323f;

    /* renamed from: g, reason: collision with root package name */
    public Object f91324g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91325h;

    /* renamed from: i, reason: collision with root package name */
    public int f91326i;

    public e(c cVar) {
        super(cVar.getFirstElement$runtime(), cVar.getHashMapBuilder$runtime());
        this.f91323f = cVar;
        this.f91326i = cVar.getHashMapBuilder$runtime().getModCount$runtime();
    }

    @Override // x0.d, java.util.Iterator
    public Object next() {
        if (this.f91323f.getHashMapBuilder$runtime().getModCount$runtime() != this.f91326i) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.f91324g = next;
        this.f91325h = true;
        return next;
    }

    @Override // x0.d, java.util.Iterator
    public void remove() {
        if (!this.f91325h) {
            throw new IllegalStateException();
        }
        Object obj = this.f91324g;
        c cVar = this.f91323f;
        h1.asMutableCollection(cVar).remove(obj);
        this.f91324g = null;
        this.f91325h = false;
        this.f91326i = cVar.getHashMapBuilder$runtime().getModCount$runtime();
        setIndex$runtime(getIndex$runtime() - 1);
    }
}
