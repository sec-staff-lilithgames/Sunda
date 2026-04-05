package nc;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import tb.f1;
import tb.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f75920a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.a f75921b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList f75922c;

    /* renamed from: d, reason: collision with root package name */
    public j1 f75923d;

    public i0(f1.a aVar) {
        this.f75921b = aVar;
    }

    public void appendReferring(a aVar) {
        if (this.f75922c == null) {
            this.f75922c = new LinkedList();
        }
        this.f75922c.add(aVar);
    }

    public void bindItem(Object obj) throws IOException {
        j1 j1Var = this.f75923d;
        f1.a aVar = this.f75921b;
        j1Var.bindItem(aVar, obj);
        this.f75920a = obj;
        Object obj2 = aVar.f86715e;
        LinkedList linkedList = this.f75922c;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            this.f75922c = null;
            while (it.hasNext()) {
                ((a) it.next()).handleResolvedForwardReference(obj2, obj);
            }
        }
    }

    public f1.a getKey() {
        return this.f75921b;
    }

    public j1 getResolver() {
        return this.f75923d;
    }

    public boolean hasReferringProperties() {
        LinkedList linkedList = this.f75922c;
        return (linkedList == null || linkedList.isEmpty()) ? false : true;
    }

    public Iterator<a> referringProperties() {
        LinkedList linkedList = this.f75922c;
        return linkedList == null ? Collections.EMPTY_LIST.iterator() : linkedList.iterator();
    }

    public Object resolve() {
        Object objResolveId = this.f75923d.resolveId(this.f75921b);
        this.f75920a = objResolveId;
        return objResolveId;
    }

    public void setResolver(j1 j1Var) {
        this.f75923d = j1Var;
    }

    public String toString() {
        return String.valueOf(this.f75921b);
    }

    public boolean tryToResolveUnresolved(jc.k kVar) {
        return false;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final mc.a0 f75924a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f75925b;

        public a(mc.a0 a0Var, Class<?> cls) {
            this.f75924a = a0Var;
            this.f75925b = cls;
        }

        public Class<?> getBeanType() {
            return this.f75925b;
        }

        public ub.p getLocation() {
            return this.f75924a.getLocation();
        }

        public abstract void handleResolvedForwardReference(Object obj, Object obj2) throws IOException;

        public boolean hasId(Object obj) {
            return obj.equals(this.f75924a.getUnresolvedId());
        }

        public a(mc.a0 a0Var, jc.o oVar) {
            this.f75924a = a0Var;
            this.f75925b = oVar.getRawClass();
        }
    }
}
