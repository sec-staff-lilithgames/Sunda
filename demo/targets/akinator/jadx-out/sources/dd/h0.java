package dd;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final transient s f52013b = new s(20, 200);

    public jc.n0 findRootName(jc.o oVar, lc.z zVar) {
        return findRootName(oVar.getRawClass(), zVar);
    }

    public jc.n0 findRootName(Class<?> cls, lc.z zVar) {
        cd.b bVar = new cd.b(cls);
        s sVar = this.f52013b;
        jc.n0 n0Var = (jc.n0) sVar.get(bVar);
        if (n0Var != null) {
            return n0Var;
        }
        jc.n0 n0VarFindRootName = zVar.getAnnotationIntrospector().findRootName(zVar.introspectClassAnnotations(cls).getClassInfo());
        if (n0VarFindRootName == null || !n0VarFindRootName.hasSimpleName()) {
            n0VarFindRootName = jc.n0.construct(cls.getSimpleName());
        }
        sVar.put(bVar, n0VarFindRootName);
        return n0VarFindRootName;
    }
}
