package mc;

import b0.e2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.x;
import nc.i0;
import tb.f1;
import tb.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p extends jc.k {

    /* renamed from: p, reason: collision with root package name */
    public transient LinkedHashMap f74214p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f74215q;

    @Override // jc.k
    public void checkUnresolvedObjectId() throws a0 {
        if (this.f74214p != null && isEnabled(jc.l.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            Iterator it = this.f74214p.entrySet().iterator();
            a0 a0VarWithStackTrace = null;
            while (it.hasNext()) {
                i0 i0Var = (i0) ((Map.Entry) it.next()).getValue();
                if (i0Var.hasReferringProperties() && !i0Var.tryToResolveUnresolved(this)) {
                    if (a0VarWithStackTrace == null) {
                        a0VarWithStackTrace = new a0(getParser(), "Unresolved forward references for: ").withStackTrace();
                    }
                    Object obj = i0Var.getKey().f86715e;
                    Iterator<i0.a> itReferringProperties = i0Var.referringProperties();
                    while (itReferringProperties.hasNext()) {
                        i0.a next = itReferringProperties.next();
                        a0VarWithStackTrace.addUnresolvedId(obj, next.getBeanType(), next.getLocation());
                    }
                }
            }
            if (a0VarWithStackTrace != null) {
                throw a0VarWithStackTrace;
            }
        }
    }

    public p copy() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    public abstract p createDummyInstance(jc.j jVar);

    public abstract p createInstance(jc.j jVar, ub.u uVar, jc.n nVar);

    @Override // jc.k
    public jc.q deserializerInstance(rc.b bVar, Object obj) throws jc.r {
        jc.q qVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof jc.q) {
            qVar = (jc.q) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + obj.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == jc.p.class || dd.i.isBogusClass(cls)) {
                return null;
            }
            if (!jc.q.class.isAssignableFrom(cls)) {
                throw new IllegalStateException(e2.k(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<JsonDeserializer>"));
            }
            jc.j jVar = this.f69327e;
            lc.v handlerInstantiator = jVar.getHandlerInstantiator();
            jc.q qVarDeserializerInstance = handlerInstantiator != null ? handlerInstantiator.deserializerInstance(jVar, bVar, cls) : null;
            qVar = qVarDeserializerInstance == null ? (jc.q) dd.i.createInstance(cls, jVar.canOverrideAccessModifiers()) : qVarDeserializerInstance;
        }
        if (qVar instanceof w) {
            ((w) qVar).resolve(this);
        }
        return qVar;
    }

    @Override // jc.k
    public i0 findObjectId(Object obj, f1 f1Var, j1 j1Var) {
        j1 j1VarNewForDeserialization = null;
        if (obj == null) {
            return null;
        }
        f1.a aVarKey = f1Var.key(obj);
        LinkedHashMap linkedHashMap = this.f74214p;
        if (linkedHashMap == null) {
            this.f74214p = new LinkedHashMap();
        } else {
            i0 i0Var = (i0) linkedHashMap.get(aVarKey);
            if (i0Var != null) {
                return i0Var;
            }
        }
        ArrayList arrayList = this.f74215q;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j1 j1Var2 = (j1) it.next();
                if (j1Var2.canUseFor(j1Var)) {
                    j1VarNewForDeserialization = j1Var2;
                    break;
                }
            }
        } else {
            this.f74215q = new ArrayList(8);
        }
        if (j1VarNewForDeserialization == null) {
            j1VarNewForDeserialization = j1Var.newForDeserialization(this);
            this.f74215q.add(j1VarNewForDeserialization);
        }
        i0 i0Var2 = new i0(aVarKey);
        i0Var2.setResolver(j1VarNewForDeserialization);
        this.f74214p.put(aVarKey, i0Var2);
        return i0Var2;
    }

    @Override // jc.k
    public final jc.x keyDeserializerInstance(rc.b bVar, Object obj) throws jc.r {
        jc.x xVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof jc.x) {
            xVar = (jc.x) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == x.a.class || dd.i.isBogusClass(cls)) {
                return null;
            }
            if (!jc.x.class.isAssignableFrom(cls)) {
                throw new IllegalStateException(e2.k(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<KeyDeserializer>"));
            }
            jc.j jVar = this.f69327e;
            lc.v handlerInstantiator = jVar.getHandlerInstantiator();
            jc.x xVarKeyDeserializerInstance = handlerInstantiator != null ? handlerInstantiator.keyDeserializerInstance(jVar, bVar, cls) : null;
            xVar = xVarKeyDeserializerInstance == null ? (jc.x) dd.i.createInstance(cls, jVar.canOverrideAccessModifiers()) : xVarKeyDeserializerInstance;
        }
        if (xVar instanceof w) {
            ((w) xVar).resolve(this);
        }
        return xVar;
    }

    public Object readRootValue(ub.u uVar, jc.o oVar, jc.q qVar, Object obj) throws IOException {
        jc.j jVar = this.f69327e;
        if (!jVar.useRootWrapping()) {
            return obj == null ? qVar.deserialize(uVar, this) : qVar.deserialize(uVar, this, obj);
        }
        String simpleName = jVar.findRootName(oVar).getSimpleName();
        ub.z zVarCurrentToken = uVar.currentToken();
        ub.z zVar = ub.z.START_OBJECT;
        if (zVarCurrentToken != zVar) {
            reportWrongTokenException(oVar, zVar, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", dd.i.name(simpleName), uVar.currentToken());
        }
        ub.z zVarNextToken = uVar.nextToken();
        ub.z zVar2 = ub.z.FIELD_NAME;
        if (zVarNextToken != zVar2) {
            reportWrongTokenException(oVar, zVar2, "Current token not FIELD_NAME (to contain expected root name %s), but %s", dd.i.name(simpleName), uVar.currentToken());
        }
        String strCurrentName = uVar.currentName();
        if (!simpleName.equals(strCurrentName)) {
            reportPropertyInputMismatch(oVar, strCurrentName, "Root name (%s) does not match expected (%s) for type %s", dd.i.name(strCurrentName), dd.i.name(simpleName), dd.i.getTypeDescription(oVar));
        }
        uVar.nextToken();
        Object objDeserialize = obj == null ? qVar.deserialize(uVar, this) : qVar.deserialize(uVar, this, obj);
        ub.z zVarNextToken2 = uVar.nextToken();
        ub.z zVar3 = ub.z.END_OBJECT;
        if (zVarNextToken2 != zVar3) {
            reportWrongTokenException(oVar, zVar3, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", dd.i.name(simpleName), uVar.currentToken());
        }
        return objDeserialize;
    }

    public abstract p with(s sVar);

    public abstract p withCaches(lc.b bVar);
}
