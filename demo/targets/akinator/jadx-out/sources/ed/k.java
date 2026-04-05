package ed;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f54105b;

    /* renamed from: c, reason: collision with root package name */
    public o f54106c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f54107e;

    public k(v vVar) {
        this.f54107e = vVar;
        this.f54105b = vVar.f54132b.values().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f54105b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        o oVar = this.f54106c;
        boolean z10 = oVar != null;
        int i10 = v.f54130q;
        if (!z10) {
            throw new IllegalStateException();
        }
        this.f54107e.remove(oVar.f54115b);
        this.f54106c = null;
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        this.f54106c = (o) this.f54105b.next();
        return new u(this.f54107e, this.f54106c);
    }
}
