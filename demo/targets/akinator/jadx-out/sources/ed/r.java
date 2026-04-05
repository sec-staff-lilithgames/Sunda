package ed;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f54123b;

    /* renamed from: c, reason: collision with root package name */
    public o f54124c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f54125e;

    public r(v vVar) {
        this.f54125e = vVar;
        this.f54123b = vVar.f54132b.values().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f54123b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        o oVar = (o) this.f54123b.next();
        this.f54124c = oVar;
        return oVar.a();
    }

    @Override // java.util.Iterator
    public void remove() {
        o oVar = this.f54124c;
        boolean z10 = oVar != null;
        int i10 = v.f54130q;
        if (!z10) {
            throw new IllegalStateException();
        }
        this.f54125e.remove(oVar.f54115b);
        this.f54124c = null;
    }
}
