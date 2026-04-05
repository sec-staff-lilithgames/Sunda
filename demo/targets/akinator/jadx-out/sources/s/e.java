package s;

import java.util.Iterator;
import java.util.Map;
import s.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e extends f.a implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public c f85140b;

    /* renamed from: c, reason: collision with root package name */
    public c f85141c;

    public abstract c a(c cVar);

    public abstract c b(c cVar);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f85141c != null;
    }

    @Override // s.f.a
    public void supportRemove(c cVar) {
        c cVarB = null;
        if (this.f85140b == cVar && cVar == this.f85141c) {
            this.f85141c = null;
            this.f85140b = null;
        }
        c cVar2 = this.f85140b;
        if (cVar2 == cVar) {
            this.f85140b = a(cVar2);
        }
        c cVar3 = this.f85141c;
        if (cVar3 == cVar) {
            c cVar4 = this.f85140b;
            if (cVar3 != cVar4 && cVar4 != null) {
                cVarB = b(cVar3);
            }
            this.f85141c = cVarB;
        }
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        c cVar = this.f85141c;
        c cVar2 = this.f85140b;
        this.f85141c = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
