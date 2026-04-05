package rc;

import b0.e2;
import com.ironsource.C3191e4;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends b implements g1 {

    /* renamed from: q, reason: collision with root package name */
    public static final d f84156q;

    /* renamed from: b, reason: collision with root package name */
    public final jc.o f84157b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f84158c;

    /* renamed from: e, reason: collision with root package name */
    public final cd.r f84159e;

    /* renamed from: f, reason: collision with root package name */
    public final List f84160f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.c f84161g;

    /* renamed from: h, reason: collision with root package name */
    public final cd.s f84162h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f84163i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f84164j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f84165k;

    /* renamed from: l, reason: collision with root package name */
    public final dd.b f84166l;

    /* renamed from: m, reason: collision with root package name */
    public d f84167m;

    /* renamed from: n, reason: collision with root package name */
    public p f84168n;

    /* renamed from: o, reason: collision with root package name */
    public List f84169o;

    /* renamed from: p, reason: collision with root package name */
    public transient Boolean f84170p;

    static {
        List list = Collections.EMPTY_LIST;
        f84156q = new d(null, list, list);
    }

    public e(Class cls) {
        this.f84157b = null;
        this.f84158c = cls;
        this.f84160f = Collections.EMPTY_LIST;
        this.f84164j = null;
        this.f84166l = y.emptyAnnotations();
        this.f84159e = cd.r.emptyBindings();
        this.f84161g = null;
        this.f84163i = null;
        this.f84162h = null;
        this.f84165k = false;
    }

    @Deprecated
    public static e construct(jc.o oVar, lc.z zVar) {
        return construct(oVar, zVar, zVar);
    }

    @Deprecated
    public static e constructWithoutSuperTypes(Class<?> cls, lc.z zVar) {
        return constructWithoutSuperTypes(cls, zVar, zVar);
    }

    public final d a() {
        e eVar;
        d dVarCollectCreators;
        d dVar = this.f84167m;
        if (dVar != null) {
            return dVar;
        }
        jc.o oVar = this.f84157b;
        if (oVar == null) {
            dVarCollectCreators = f84156q;
            eVar = this;
        } else {
            eVar = this;
            dVarCollectCreators = h.collectCreators(this.f84161g, this.f84162h, eVar, oVar, this.f84164j, this.f84165k);
        }
        eVar.f84167m = dVarCollectCreators;
        return dVarCollectCreators;
    }

    @Override // rc.b
    @Deprecated
    public Iterable<Annotation> annotations() {
        dd.b bVar = this.f84166l;
        if (bVar instanceof a0) {
            return ((a0) bVar).annotations();
        }
        if ((bVar instanceof v) || (bVar instanceof x)) {
            throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.EMPTY_LIST;
    }

    public final p b() {
        e eVar;
        p pVarCollectMethods;
        p pVar = this.f84168n;
        if (pVar != null) {
            return pVar;
        }
        jc.o oVar = this.f84157b;
        if (oVar == null) {
            pVarCollectMethods = new p();
            eVar = this;
        } else {
            eVar = this;
            pVarCollectMethods = o.collectMethods(this.f84161g, eVar, this.f84163i, this.f84162h, oVar, this.f84160f, this.f84164j, this.f84165k);
        }
        eVar.f84168n = pVarCollectMethods;
        return pVarCollectMethods;
    }

    @Override // rc.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return dd.i.hasClass(obj, e.class) && ((e) obj).f84158c == this.f84158c;
    }

    public Iterable<i> fields() {
        e eVar;
        List<i> listCollectFields;
        List list = this.f84169o;
        if (list != null) {
            return list;
        }
        jc.o oVar = this.f84157b;
        if (oVar == null) {
            listCollectFields = Collections.EMPTY_LIST;
            eVar = this;
        } else {
            eVar = this;
            listCollectFields = k.collectFields(this.f84161g, eVar, this.f84163i, this.f84162h, oVar, this.f84165k);
        }
        eVar.f84169o = listCollectFields;
        return listCollectFields;
    }

    public m findMethod(String str, Class<?>[] clsArr) {
        return b().find(str, clsArr);
    }

    @Override // rc.b
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f84166l.get(cls);
    }

    public dd.b getAnnotations() {
        return this.f84166l;
    }

    public List<g> getConstructors() {
        return a().f84149b;
    }

    public g getDefaultConstructor() {
        return a().f84148a;
    }

    public List<m> getFactoryMethods() {
        return a().f84150c;
    }

    public int getFieldCount() {
        e eVar;
        List<i> listCollectFields = this.f84169o;
        if (listCollectFields == null) {
            jc.o oVar = this.f84157b;
            if (oVar == null) {
                listCollectFields = Collections.EMPTY_LIST;
                eVar = this;
            } else {
                eVar = this;
                listCollectFields = k.collectFields(this.f84161g, eVar, this.f84163i, this.f84162h, oVar, this.f84165k);
            }
            eVar.f84169o = listCollectFields;
        }
        return listCollectFields.size();
    }

    public int getMemberMethodCount() {
        return b().size();
    }

    @Override // rc.b
    public int getModifiers() {
        return this.f84158c.getModifiers();
    }

    @Override // rc.b
    public String getName() {
        return this.f84158c.getName();
    }

    @Override // rc.b
    public Class<?> getRawType() {
        return this.f84158c;
    }

    @Deprecated
    public List<m> getStaticMethods() {
        return getFactoryMethods();
    }

    @Override // rc.b
    public jc.o getType() {
        return this.f84157b;
    }

    @Override // rc.b
    public boolean hasAnnotation(Class<?> cls) {
        return this.f84166l.has(cls);
    }

    public boolean hasAnnotations() {
        return this.f84166l.size() > 0;
    }

    @Override // rc.b
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this.f84166l.hasOneOf(clsArr);
    }

    @Override // rc.b
    public int hashCode() {
        return this.f84158c.hashCode();
    }

    public boolean isNonStaticInnerClass() {
        Boolean boolValueOf = this.f84170p;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(dd.i.isNonStaticInnerClass(this.f84158c));
            this.f84170p = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public Iterable<m> memberMethods() {
        return b();
    }

    @Override // rc.g1
    public jc.o resolveType(Type type) {
        return this.f84162h.resolveMemberType(type, this.f84159e);
    }

    @Override // rc.b
    public String toString() {
        return e2.k(this.f84158c, new StringBuilder("[AnnotedClass "), C3191e4.i.f36531e);
    }

    @Deprecated
    public static e construct(jc.o oVar, lc.z zVar, e0 e0Var) {
        return f.resolve(zVar, oVar, e0Var);
    }

    @Deprecated
    public static e constructWithoutSuperTypes(Class<?> cls, lc.z zVar, e0 e0Var) {
        return f.resolveWithoutSuperTypes(zVar, cls, e0Var);
    }

    @Override // rc.b
    public Class<?> getAnnotated() {
        return this.f84158c;
    }

    public e(jc.o oVar, Class cls, List list, Class cls2, dd.b bVar, cd.r rVar, jc.c cVar, e0 e0Var, cd.s sVar, boolean z10) {
        this.f84157b = oVar;
        this.f84158c = cls;
        this.f84160f = list;
        this.f84164j = cls2;
        this.f84166l = bVar;
        this.f84159e = rVar;
        this.f84161g = cVar;
        this.f84163i = e0Var;
        this.f84162h = sVar;
        this.f84165k = z10;
    }
}
