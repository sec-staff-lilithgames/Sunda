package s;

import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.ironsource.C3191e4;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class f implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public c f85142b;

    /* renamed from: c, reason: collision with root package name */
    public c f85143c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f85144e = new WeakHashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f85145f = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract void supportRemove(c cVar);
    }

    public c a(Object obj) {
        c cVar = this.f85142b;
        while (cVar != null && !cVar.f85133b.equals(obj)) {
            cVar = cVar.f85135e;
        }
        return cVar;
    }

    public Iterator<Map.Entry<Object, Object>> descendingIterator() {
        b bVar = new b(this.f85143c, this.f85142b, 1);
        this.f85144e.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry<Object, Object> eldest() {
        return this.f85142b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (size() != fVar.size()) {
            return false;
        }
        Iterator<Map.Entry<Object, Object>> it = iterator();
        Iterator<Map.Entry<Object, Object>> it2 = fVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<Object, Object> next = it.next();
            Map.Entry<Object, Object> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<Object, Object>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<Object, Object>> iterator() {
        b bVar = new b(this.f85142b, this.f85143c, 0);
        this.f85144e.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public d iteratorWithAdditions() {
        d dVar = new d(this);
        this.f85144e.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<Object, Object> newest() {
        return this.f85143c;
    }

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
            return null;
        }
        cVar2.f85135e = cVar;
        cVar.f85136f = cVar2;
        this.f85143c = cVar;
        return null;
    }

    public Object remove(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.f85145f--;
        WeakHashMap weakHashMap = this.f85144e;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((a) it.next()).supportRemove(cVarA);
            }
        }
        c cVar = cVarA.f85136f;
        if (cVar != null) {
            cVar.f85135e = cVarA.f85135e;
        } else {
            this.f85142b = cVarA.f85135e;
        }
        c cVar2 = cVarA.f85135e;
        if (cVar2 != null) {
            cVar2.f85136f = cVar;
        } else {
            this.f85143c = cVar;
        }
        cVarA.f85135e = null;
        cVarA.f85136f = null;
        return cVarA.f85134c;
    }

    public int size() {
        return this.f85145f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        Iterator<Map.Entry<Object, Object>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(LJjmO.VSADxwFrvpLncR);
            }
        }
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }
}
