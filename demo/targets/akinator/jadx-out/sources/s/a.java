package s;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f85131g = new HashMap();

    @Override // s.f
    public final c a(Object obj) {
        return (c) this.f85131g.get(obj);
    }

    public Map.Entry<Object, Object> ceil(Object obj) {
        if (contains(obj)) {
            return ((c) this.f85131g.get(obj)).f85136f;
        }
        return null;
    }

    public boolean contains(Object obj) {
        return this.f85131g.containsKey(obj);
    }

    @Override // s.f
    public Object putIfAbsent(Object obj, Object obj2) {
        c cVarA = a(obj);
        if (cVarA != null) {
            return cVarA.f85134c;
        }
        c cVar = new c(obj, obj2);
        this.f85145f++;
        c cVar2 = this.f85143c;
        if (cVar2 == null) {
            this.f85142b = cVar;
            this.f85143c = cVar;
        } else {
            cVar2.f85135e = cVar;
            cVar.f85136f = cVar2;
            this.f85143c = cVar;
        }
        this.f85131g.put(obj, cVar);
        return null;
    }

    @Override // s.f
    public Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        this.f85131g.remove(obj);
        return objRemove;
    }
}
