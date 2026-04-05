package mc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import jc.m0;
import jc.n0;
import jc.u0;
import rc.h0;
import rc.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z extends h0 {

    /* renamed from: p, reason: collision with root package name */
    public static final nc.k f74237p = new nc.k("No _valueDeserializer assigned");

    /* renamed from: e, reason: collision with root package name */
    public final n0 f74238e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f74239f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f74240g;

    /* renamed from: h, reason: collision with root package name */
    public final transient dd.b f74241h;

    /* renamed from: i, reason: collision with root package name */
    public final jc.q f74242i;

    /* renamed from: j, reason: collision with root package name */
    public final wc.g f74243j;

    /* renamed from: k, reason: collision with root package name */
    public final v f74244k;

    /* renamed from: l, reason: collision with root package name */
    public String f74245l;

    /* renamed from: m, reason: collision with root package name */
    public t0 f74246m;

    /* renamed from: n, reason: collision with root package name */
    public dd.n0 f74247n;

    /* renamed from: o, reason: collision with root package name */
    public int f74248o;

    public z(rc.d0 d0Var, jc.o oVar, wc.g gVar, dd.b bVar) {
        this(d0Var.getFullName(), oVar, d0Var.getWrapperName(), gVar, bVar, d0Var.getMetadata());
    }

    public final void a(ub.u uVar, Exception exc, Object obj) throws IOException {
        if (!(exc instanceof IllegalArgumentException)) {
            dd.i.throwIfIOE(exc);
            dd.i.throwIfRTE(exc);
            Throwable rootCause = dd.i.getRootCause(exc);
            throw jc.r.from(uVar, dd.i.exceptionMessage(rootCause), rootCause);
        }
        String strClassNameOf = dd.i.classNameOf(obj);
        StringBuilder sb2 = new StringBuilder("Problem deserializing property '");
        sb2.append(getName());
        sb2.append("' (expected type: ");
        sb2.append(getType());
        sb2.append("; actual type: ");
        sb2.append(strClassNameOf);
        sb2.append(")");
        String strExceptionMessage = dd.i.exceptionMessage(exc);
        if (strExceptionMessage != null) {
            sb2.append(", problem: ");
            sb2.append(strExceptionMessage);
        } else {
            sb2.append(" (no error message provided)");
        }
        throw jc.r.from(uVar, sb2.toString(), exc);
    }

    public void assignIndex(int i10) {
        if (this.f74248o == -1) {
            this.f74248o = i10;
            return;
        }
        throw new IllegalStateException("Property '" + getName() + "' already had index (" + this.f74248o + "), trying to assign " + i10);
    }

    public Class b() {
        return getMember().getDeclaringClass();
    }

    @Override // rc.h0, jc.g
    public void depositSchemaProperty(uc.m mVar, u0 u0Var) throws jc.r {
        if (isRequired()) {
            mVar.property();
        } else {
            mVar.a();
        }
    }

    public final Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        boolean zHasToken = uVar.hasToken(ub.z.VALUE_NULL);
        v vVar = this.f74244k;
        if (zHasToken) {
            return vVar.getNullValue(kVar);
        }
        jc.q qVar = this.f74242i;
        wc.g gVar = this.f74243j;
        if (gVar != null) {
            return qVar.deserializeWithType(uVar, kVar, gVar);
        }
        Object objDeserialize = qVar.deserialize(uVar, kVar);
        return objDeserialize == null ? vVar.getNullValue(kVar) : objDeserialize;
    }

    public abstract void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IOException;

    public abstract Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IOException;

    public final Object deserializeWith(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        boolean zHasToken = uVar.hasToken(ub.z.VALUE_NULL);
        v vVar = this.f74244k;
        if (zHasToken) {
            if (!nc.u.isSkipper(vVar)) {
                return vVar.getNullValue(kVar);
            }
        } else {
            if (this.f74243j != null) {
                return kVar.findContextualValueDeserializer(kVar.getTypeFactory().constructType(obj.getClass()), this).deserialize(uVar, kVar, obj);
            }
            Object objDeserialize = this.f74242i.deserialize(uVar, kVar, obj);
            if (objDeserialize != null) {
                return objDeserialize;
            }
            if (!nc.u.isSkipper(vVar)) {
                return vVar.getNullValue(kVar);
            }
        }
        return obj;
    }

    @Override // rc.h0, jc.g
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    @Override // rc.h0, jc.g
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this.f74241h.get(cls);
    }

    public int getCreatorIndex() {
        throw new IllegalStateException(e3.g.l("Internal error: no creator index for property '", getName(), "' (of type ", getClass().getName(), ")"));
    }

    @Override // rc.h0, jc.g
    public n0 getFullName() {
        return this.f74238e;
    }

    public Object getInjectableValueId() {
        return null;
    }

    public String getManagedReferenceName() {
        return this.f74245l;
    }

    @Override // rc.h0, jc.g
    public abstract rc.l getMember();

    @Override // rc.h0, jc.g, dd.b0
    public final String getName() {
        return this.f74238e.getSimpleName();
    }

    public v getNullValueProvider() {
        return this.f74244k;
    }

    public t0 getObjectIdInfo() {
        return this.f74246m;
    }

    public int getPropertyIndex() {
        return this.f74248o;
    }

    @Override // rc.h0, jc.g
    public jc.o getType() {
        return this.f74239f;
    }

    public jc.q getValueDeserializer() {
        nc.k kVar = f74237p;
        jc.q qVar = this.f74242i;
        if (qVar == kVar) {
            return null;
        }
        return qVar;
    }

    public wc.g getValueTypeDeserializer() {
        return this.f74243j;
    }

    @Override // rc.h0, jc.g
    public n0 getWrapperName() {
        return this.f74240g;
    }

    public boolean hasValueDeserializer() {
        jc.q qVar = this.f74242i;
        return (qVar == null || qVar == f74237p) ? false : true;
    }

    public boolean hasValueTypeDeserializer() {
        return this.f74243j != null;
    }

    public boolean hasViews() {
        return this.f74247n != null;
    }

    public boolean isIgnorable() {
        return false;
    }

    public boolean isInjectionOnly() {
        return false;
    }

    public abstract void set(Object obj, Object obj2) throws IOException;

    public abstract Object setAndReturn(Object obj, Object obj2) throws IOException;

    public void setManagedReferenceName(String str) {
        this.f74245l = str;
    }

    public void setObjectIdInfo(t0 t0Var) {
        this.f74246m = t0Var;
    }

    public void setViews(Class<?>[] clsArr) {
        if (clsArr == null) {
            this.f74247n = null;
        } else {
            this.f74247n = dd.n0.construct(clsArr);
        }
    }

    public String toString() {
        return "[property '" + getName() + "']";
    }

    public z unwrapped(dd.a0 a0Var) {
        jc.q qVarUnwrappingDeserializer;
        z zVarWithSimpleName = withSimpleName(a0Var.transform(getName()));
        jc.q valueDeserializer = zVarWithSimpleName.getValueDeserializer();
        return (valueDeserializer == null || (qVarUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(a0Var)) == valueDeserializer) ? zVarWithSimpleName : zVarWithSimpleName.withValueDeserializer(qVarUnwrappingDeserializer);
    }

    public boolean visibleInView(Class<?> cls) {
        dd.n0 n0Var = this.f74247n;
        return n0Var == null || n0Var.isVisibleForView(cls);
    }

    public abstract z withName(n0 n0Var);

    public abstract z withNullProvider(v vVar);

    public z withSimpleName(String str) {
        n0 n0Var = this.f74238e;
        n0 n0Var2 = n0Var == null ? new n0(str) : n0Var.withSimpleName(str);
        return n0Var2 == n0Var ? this : withName(n0Var2);
    }

    public abstract z withValueDeserializer(jc.q qVar);

    public z(n0 n0Var, jc.o oVar, n0 n0Var2, wc.g gVar, dd.b bVar, m0 m0Var) {
        super(m0Var);
        this.f74248o = -1;
        if (n0Var == null) {
            this.f74238e = n0.f69382g;
        } else {
            this.f74238e = n0Var.internSimpleName();
        }
        this.f74239f = oVar;
        this.f74240g = n0Var2;
        this.f74241h = bVar;
        this.f74247n = null;
        this.f74243j = gVar != null ? gVar.forProperty(this) : gVar;
        nc.k kVar = f74237p;
        this.f74242i = kVar;
        this.f74244k = kVar;
    }

    public z(n0 n0Var, jc.o oVar, m0 m0Var, jc.q qVar) {
        super(m0Var);
        this.f74248o = -1;
        if (n0Var == null) {
            this.f74238e = n0.f69382g;
        } else {
            this.f74238e = n0Var.internSimpleName();
        }
        this.f74239f = oVar;
        this.f74240g = null;
        this.f74241h = null;
        this.f74247n = null;
        this.f74243j = null;
        this.f74242i = qVar;
        this.f74244k = qVar;
    }

    public void markAsIgnorable() {
    }

    public z(z zVar) {
        super(zVar);
        this.f74248o = -1;
        this.f74238e = zVar.f74238e;
        this.f74239f = zVar.f74239f;
        this.f74240g = zVar.f74240g;
        this.f74241h = zVar.f74241h;
        this.f74242i = zVar.f74242i;
        this.f74243j = zVar.f74243j;
        this.f74245l = zVar.f74245l;
        this.f74248o = zVar.f74248o;
        this.f74247n = zVar.f74247n;
        this.f74246m = zVar.f74246m;
        this.f74244k = zVar.f74244k;
    }

    public void fixAccess(jc.j jVar) {
    }

    public z(z zVar, jc.q qVar, v vVar) {
        super(zVar);
        this.f74248o = -1;
        this.f74238e = zVar.f74238e;
        this.f74239f = zVar.f74239f;
        this.f74240g = zVar.f74240g;
        this.f74241h = zVar.f74241h;
        this.f74243j = zVar.f74243j;
        this.f74245l = zVar.f74245l;
        this.f74248o = zVar.f74248o;
        nc.k kVar = f74237p;
        if (qVar == null) {
            this.f74242i = kVar;
        } else {
            this.f74242i = qVar;
        }
        this.f74247n = zVar.f74247n;
        this.f74246m = zVar.f74246m;
        this.f74244k = vVar == kVar ? this.f74242i : vVar;
    }

    public z(z zVar, n0 n0Var) {
        super(zVar);
        this.f74248o = -1;
        this.f74238e = n0Var;
        this.f74239f = zVar.f74239f;
        this.f74240g = zVar.f74240g;
        this.f74241h = zVar.f74241h;
        this.f74242i = zVar.f74242i;
        this.f74243j = zVar.f74243j;
        this.f74245l = zVar.f74245l;
        this.f74248o = zVar.f74248o;
        this.f74247n = zVar.f74247n;
        this.f74246m = zVar.f74246m;
        this.f74244k = zVar.f74244k;
    }
}
