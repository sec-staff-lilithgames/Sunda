package zc;

import ad.f0;
import dd.a0;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import jc.n0;
import jc.s0;
import jc.t0;
import jc.u0;
import jc.w;
import jc.y;
import rc.d0;
import ub.c0;
import yc.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d extends p implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final cc.q f97759e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f97760f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.o f97761g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.o f97762h;

    /* renamed from: i, reason: collision with root package name */
    public jc.o f97763i;

    /* renamed from: j, reason: collision with root package name */
    public final transient dd.b f97764j;

    /* renamed from: k, reason: collision with root package name */
    public final rc.l f97765k;

    /* renamed from: l, reason: collision with root package name */
    public final transient Method f97766l;

    /* renamed from: m, reason: collision with root package name */
    public final transient Field f97767m;

    /* renamed from: n, reason: collision with root package name */
    public w f97768n;

    /* renamed from: o, reason: collision with root package name */
    public w f97769o;

    /* renamed from: p, reason: collision with root package name */
    public wc.j f97770p;

    /* renamed from: q, reason: collision with root package name */
    public transient ad.t f97771q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f97772r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f97773s;

    /* renamed from: t, reason: collision with root package name */
    public final Class[] f97774t;

    /* renamed from: u, reason: collision with root package name */
    public transient HashMap f97775u;

    public d(d0 d0Var, rc.l lVar, dd.b bVar, jc.o oVar, w wVar, wc.j jVar, jc.o oVar2, boolean z10, Object obj, Class<?>[] clsArr) {
        super(d0Var.getMetadata());
        this.f97765k = lVar;
        this.f97764j = bVar;
        this.f97759e = new cc.q(d0Var.getName());
        this.f97760f = d0Var.getWrapperName();
        this.f97761g = oVar;
        this.f97768n = wVar;
        this.f97771q = wVar == null ? ad.t.emptyForProperties() : null;
        this.f97770p = jVar;
        this.f97762h = oVar2;
        if (lVar instanceof rc.i) {
            this.f97766l = null;
            this.f97767m = (Field) lVar.getMember();
        } else if (lVar instanceof rc.m) {
            this.f97766l = (Method) lVar.getMember();
            this.f97767m = null;
        } else {
            this.f97766l = null;
            this.f97767m = null;
        }
        this.f97772r = z10;
        this.f97773s = obj;
        this.f97769o = null;
        this.f97774t = clsArr;
    }

    public void a(v vVar, jc.t tVar) {
        vVar.set(getName(), tVar);
    }

    public void assignNullSerializer(w wVar) {
        w wVar2 = this.f97769o;
        if (wVar2 != null && wVar2 != wVar) {
            throw new IllegalStateException(a.b.m("Cannot override _nullSerializer: had a ", dd.i.classNameOf(this.f97769o), ", trying to set to ", dd.i.classNameOf(wVar)));
        }
        this.f97769o = wVar;
    }

    public void assignSerializer(w wVar) {
        w wVar2 = this.f97768n;
        if (wVar2 != null && wVar2 != wVar) {
            throw new IllegalStateException(a.b.m("Cannot override _serializer: had a ", dd.i.classNameOf(this.f97768n), ", trying to set to ", dd.i.classNameOf(wVar)));
        }
        this.f97768n = wVar;
    }

    public void assignTypeSerializer(wc.j jVar) {
        this.f97770p = jVar;
    }

    public w b(ad.t tVar, Class cls, u0 u0Var) {
        jc.o oVar = this.f97763i;
        ad.q qVarFindAndAddPrimarySerializer = oVar != null ? tVar.findAndAddPrimarySerializer(u0Var.constructSpecializedType(oVar, cls), u0Var, this) : tVar.findAndAddPrimarySerializer((Class<?>) cls, u0Var, this);
        ad.t tVar2 = qVarFindAndAddPrimarySerializer.f4292b;
        if (tVar != tVar2) {
            this.f97771q = tVar2;
        }
        return qVarFindAndAddPrimarySerializer.f4291a;
    }

    public final boolean c(ub.o oVar, u0 u0Var, w wVar) throws IOException {
        if (wVar.usesObjectId()) {
            return false;
        }
        if (u0Var.isEnabled(t0.FAIL_ON_SELF_REFERENCES)) {
            if (!(wVar instanceof bd.d)) {
                return false;
            }
            u0Var.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
            return false;
        }
        if (!u0Var.isEnabled(t0.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this.f97769o == null) {
            return true;
        }
        if (!oVar.getOutputContext().inArray()) {
            oVar.writeFieldName(this.f97759e);
        }
        this.f97769o.serialize(null, oVar, u0Var);
        return true;
    }

    @Override // zc.p, rc.h0, jc.g
    public void depositSchemaProperty(uc.m mVar, u0 u0Var) throws jc.r {
        if (mVar != null) {
            if (isRequired()) {
                mVar.property();
            } else {
                mVar.a();
            }
        }
    }

    public void fixAccess(s0 s0Var) {
        this.f97765k.fixAccess(s0Var.isEnabled(y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public Object get(Object obj) throws Exception {
        Method method = this.f97766l;
        return method == null ? this.f97767m.get(obj) : method.invoke(obj, null);
    }

    @Override // zc.p, rc.h0, jc.g
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        rc.l lVar = this.f97765k;
        if (lVar == null) {
            return null;
        }
        return (A) lVar.getAnnotation(cls);
    }

    @Override // zc.p, rc.h0, jc.g
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        dd.b bVar = this.f97764j;
        if (bVar == null) {
            return null;
        }
        return (A) bVar.get(cls);
    }

    @Override // zc.p, rc.h0, jc.g
    public n0 getFullName() {
        return new n0(this.f97759e.getValue());
    }

    @Deprecated
    public Type getGenericPropertyType() {
        Method method = this.f97766l;
        if (method != null) {
            return method.getGenericReturnType();
        }
        Field field = this.f97767m;
        if (field != null) {
            return field.getGenericType();
        }
        return null;
    }

    public Object getInternalSetting(Object obj) {
        HashMap map = this.f97775u;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    @Override // zc.p, rc.h0, jc.g
    public rc.l getMember() {
        return this.f97765k;
    }

    @Override // zc.p, rc.h0, jc.g, dd.b0
    public String getName() {
        return this.f97759e.getValue();
    }

    @Deprecated
    public Class<?> getPropertyType() {
        Method method = this.f97766l;
        if (method != null) {
            return method.getReturnType();
        }
        Field field = this.f97767m;
        if (field != null) {
            return field.getType();
        }
        return null;
    }

    @Deprecated
    public Class<?> getRawSerializationType() {
        jc.o oVar = this.f97762h;
        if (oVar == null) {
            return null;
        }
        return oVar.getRawClass();
    }

    public jc.o getSerializationType() {
        return this.f97762h;
    }

    public c0 getSerializedName() {
        return this.f97759e;
    }

    public w getSerializer() {
        return this.f97768n;
    }

    @Override // zc.p, rc.h0, jc.g
    public jc.o getType() {
        return this.f97761g;
    }

    public wc.j getTypeSerializer() {
        return this.f97770p;
    }

    public Class<?>[] getViews() {
        return this.f97774t;
    }

    @Override // zc.p, rc.h0, jc.g
    public n0 getWrapperName() {
        return this.f97760f;
    }

    public boolean hasNullSerializer() {
        return this.f97769o != null;
    }

    public boolean hasSerializer() {
        return this.f97768n != null;
    }

    public boolean isUnwrapping() {
        return false;
    }

    public Object removeInternalSetting(Object obj) {
        HashMap map = this.f97775u;
        if (map == null) {
            return null;
        }
        Object objRemove = map.remove(obj);
        if (this.f97775u.size() == 0) {
            this.f97775u = null;
        }
        return objRemove;
    }

    public d rename(a0 a0Var) {
        cc.q qVar = this.f97759e;
        String strTransform = a0Var.transform(qVar.getValue());
        return strTransform.equals(qVar.toString()) ? this : new d(this, n0.construct(strTransform));
    }

    @Override // zc.p
    public void serializeAsElement(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        Method method = this.f97766l;
        Object objInvoke = method == null ? this.f97767m.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            w wVar = this.f97769o;
            if (wVar != null) {
                wVar.serialize(null, oVar, u0Var);
                return;
            } else {
                oVar.writeNull();
                return;
            }
        }
        w wVarB = this.f97768n;
        if (wVarB == null) {
            Class<?> cls = objInvoke.getClass();
            ad.t tVar = this.f97771q;
            w wVarSerializerFor = tVar.serializerFor(cls);
            wVarB = wVarSerializerFor == null ? b(tVar, cls, u0Var) : wVarSerializerFor;
        }
        Object obj2 = this.f97773s;
        if (obj2 != null) {
            if (tb.c0.f86696e == obj2) {
                if (wVarB.isEmpty(u0Var, objInvoke)) {
                    serializeAsPlaceholder(obj, oVar, u0Var);
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                serializeAsPlaceholder(obj, oVar, u0Var);
                return;
            }
        }
        if (objInvoke == obj && c(oVar, u0Var, wVarB)) {
            return;
        }
        wc.j jVar = this.f97770p;
        if (jVar == null) {
            wVarB.serialize(objInvoke, oVar, u0Var);
        } else {
            wVarB.serializeWithType(objInvoke, oVar, u0Var, jVar);
        }
    }

    @Override // zc.p
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        Method method = this.f97766l;
        Object objInvoke = method == null ? this.f97767m.get(obj) : method.invoke(obj, null);
        cc.q qVar = this.f97759e;
        Object obj2 = this.f97773s;
        if (objInvoke == null) {
            if ((obj2 == null || !u0Var.includeFilterSuppressNulls(obj2)) && this.f97769o != null) {
                oVar.writeFieldName(qVar);
                this.f97769o.serialize(null, oVar, u0Var);
                return;
            }
            return;
        }
        w wVarB = this.f97768n;
        if (wVarB == null) {
            Class<?> cls = objInvoke.getClass();
            ad.t tVar = this.f97771q;
            w wVarSerializerFor = tVar.serializerFor(cls);
            wVarB = wVarSerializerFor == null ? b(tVar, cls, u0Var) : wVarSerializerFor;
        }
        if (obj2 != null) {
            if (tb.c0.f86696e == obj2) {
                if (wVarB.isEmpty(u0Var, objInvoke)) {
                    return;
                }
            } else if (obj2.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj && c(oVar, u0Var, wVarB)) {
            return;
        }
        oVar.writeFieldName(qVar);
        wc.j jVar = this.f97770p;
        if (jVar == null) {
            wVarB.serialize(objInvoke, oVar, u0Var);
        } else {
            wVarB.serializeWithType(objInvoke, oVar, u0Var, jVar);
        }
    }

    @Override // zc.p
    public void serializeAsOmittedField(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        if (oVar.canOmitFields()) {
            return;
        }
        oVar.writeOmittedField(this.f97759e.getValue());
    }

    @Override // zc.p
    public void serializeAsPlaceholder(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        w wVar = this.f97769o;
        if (wVar != null) {
            wVar.serialize(null, oVar, u0Var);
        } else {
            oVar.writeNull();
        }
    }

    public Object setInternalSetting(Object obj, Object obj2) {
        if (this.f97775u == null) {
            this.f97775u = new HashMap();
        }
        return this.f97775u.put(obj, obj2);
    }

    public void setNonTrivialBaseType(jc.o oVar) {
        this.f97763i = oVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("property '");
        sb2.append(getName());
        sb2.append("' (");
        Method method = this.f97766l;
        if (method != null) {
            sb2.append("via method ");
            sb2.append(method.getDeclaringClass().getName());
            sb2.append("#");
            sb2.append(method.getName());
        } else {
            Field field = this.f97767m;
            if (field != null) {
                sb2.append("field \"");
                sb2.append(field.getDeclaringClass().getName());
                sb2.append("#");
                sb2.append(field.getName());
            } else {
                sb2.append("virtual");
            }
        }
        w wVar = this.f97768n;
        if (wVar == null) {
            sb2.append(", no static serializer");
        } else {
            sb2.append(", static serializer of type ".concat(wVar.getClass().getName()));
        }
        sb2.append(')');
        return sb2.toString();
    }

    public d unwrappingWriter(a0 a0Var) {
        return new f0(this, a0Var);
    }

    public boolean willSuppressNulls() {
        return this.f97772r;
    }

    public boolean wouldConflictWithName(n0 n0Var) {
        n0 n0Var2 = this.f97760f;
        return n0Var2 != null ? n0Var2.equals(n0Var) : n0Var.hasSimpleName(this.f97759e.getValue()) && !n0Var.hasNamespace();
    }

    @Override // zc.p
    @Deprecated
    public void depositSchemaProperty(v vVar, u0 u0Var) throws jc.r {
        jc.t defaultSchemaNode;
        jc.o serializationType = getSerializationType();
        Type type = serializationType == null ? getType() : serializationType.getRawClass();
        uc.e serializer = getSerializer();
        if (serializer == null) {
            serializer = u0Var.findValueSerializer(getType(), this);
        }
        boolean z10 = !isRequired();
        if (serializer instanceof vc.c) {
            defaultSchemaNode = ((vc.c) serializer).getSchema(u0Var, type, z10);
        } else {
            defaultSchemaNode = vc.a.getDefaultSchemaNode();
        }
        a(vVar, defaultSchemaNode);
    }

    public d(d dVar, cc.q qVar) {
        super(dVar);
        this.f97759e = qVar;
        this.f97760f = dVar.f97760f;
        this.f97765k = dVar.f97765k;
        this.f97764j = dVar.f97764j;
        this.f97761g = dVar.f97761g;
        this.f97766l = dVar.f97766l;
        this.f97767m = dVar.f97767m;
        this.f97768n = dVar.f97768n;
        this.f97769o = dVar.f97769o;
        if (dVar.f97775u != null) {
            this.f97775u = new HashMap(dVar.f97775u);
        }
        this.f97762h = dVar.f97762h;
        this.f97771q = ad.t.emptyForProperties();
        this.f97772r = dVar.f97772r;
        this.f97773s = dVar.f97773s;
        this.f97774t = dVar.f97774t;
        this.f97770p = dVar.f97770p;
        this.f97763i = dVar.f97763i;
    }

    public d(d dVar, n0 n0Var) {
        super(dVar);
        this.f97759e = new cc.q(n0Var.getSimpleName());
        this.f97760f = dVar.f97760f;
        this.f97764j = dVar.f97764j;
        this.f97761g = dVar.f97761g;
        this.f97765k = dVar.f97765k;
        this.f97766l = dVar.f97766l;
        this.f97767m = dVar.f97767m;
        this.f97768n = dVar.f97768n;
        this.f97769o = dVar.f97769o;
        if (dVar.f97775u != null) {
            this.f97775u = new HashMap(dVar.f97775u);
        }
        this.f97762h = dVar.f97762h;
        this.f97771q = ad.t.emptyForProperties();
        this.f97772r = dVar.f97772r;
        this.f97773s = dVar.f97773s;
        this.f97774t = dVar.f97774t;
        this.f97770p = dVar.f97770p;
        this.f97763i = dVar.f97763i;
    }

    @Deprecated
    public d(d0 d0Var, rc.l lVar, dd.b bVar, jc.o oVar, w wVar, wc.j jVar, jc.o oVar2, boolean z10, Object obj) {
        this(d0Var, lVar, bVar, oVar, wVar, jVar, oVar2, z10, obj, null);
    }

    public d(d dVar) {
        this(dVar, dVar.f97759e);
    }
}
