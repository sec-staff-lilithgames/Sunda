package ed;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f54110b;

    /* renamed from: c, reason: collision with root package name */
    public Object f54111c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f54112e;

    public m(v vVar) {
        this.f54112e = vVar;
        this.f54110b = vVar.f54132b.keySet().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f54110b.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f54110b.next();
        this.f54111c = next;
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        Object obj = this.f54111c;
        boolean z10 = obj != null;
        int i10 = v.f54130q;
        if (!z10) {
            throw new IllegalStateException();
        }
        this.f54112e.remove(obj);
        this.f54111c = null;
    }
}
