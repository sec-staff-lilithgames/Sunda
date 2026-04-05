package zc;

import ad.h0;
import b0.e2;
import com.ironsource.C3191e4;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicReference;
import jc.n0;
import jc.s0;
import jc.t0;
import jc.u0;
import jc.w;
import rc.d0;
import tb.f1;
import yc.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l extends u0 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    public transient AbstractMap f97786q;

    /* renamed from: r, reason: collision with root package name */
    public transient ArrayList f97787r;

    /* renamed from: s, reason: collision with root package name */
    public transient ub.o f97788s;

    public static IOException j(ub.o oVar, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strExceptionMessage = dd.i.exceptionMessage(exc);
        if (strExceptionMessage == null) {
            strExceptionMessage = "[no message for " + exc.getClass().getName() + C3191e4.i.f36531e;
        }
        return new jc.r(oVar, strExceptionMessage, exc);
    }

    public void acceptJsonFormatVisitor(jc.o oVar, uc.h hVar) throws jc.r {
        if (oVar == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        hVar.setProvider(this);
        findValueSerializer(oVar, (jc.g) null).acceptJsonFormatVisitor(hVar, oVar);
    }

    public int cachedSerializersCount() {
        return this.f69448f.size();
    }

    public l copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    public abstract l createInstance(s0 s0Var, s sVar);

    @Override // jc.u0
    public h0 findObjectId(Object obj, f1 f1Var) {
        f1 f1VarNewForSerialization;
        AbstractMap abstractMap = this.f97786q;
        if (abstractMap == null) {
            this.f97786q = isEnabled(t0.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
        } else {
            h0 h0Var = (h0) abstractMap.get(obj);
            if (h0Var != null) {
                return h0Var;
            }
        }
        ArrayList arrayList = this.f97787r;
        if (arrayList == null) {
            this.f97787r = new ArrayList(8);
        } else {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                f1VarNewForSerialization = (f1) this.f97787r.get(i10);
                if (f1VarNewForSerialization.canUseFor(f1Var)) {
                    break;
                }
            }
        }
        f1VarNewForSerialization = null;
        if (f1VarNewForSerialization == null) {
            f1VarNewForSerialization = f1Var.newForSerialization(this);
            this.f97787r.add(f1VarNewForSerialization);
        }
        h0 h0Var2 = new h0(f1VarNewForSerialization);
        this.f97786q.put(obj, h0Var2);
        return h0Var2;
    }

    @Deprecated
    public vc.a generateJsonSchema(Class<?> cls) throws jc.r {
        uc.e eVarFindValueSerializer = findValueSerializer(cls, (jc.g) null);
        jc.t schema = eVarFindValueSerializer instanceof vc.c ? ((vc.c) eVarFindValueSerializer).getSchema(this, null) : vc.a.getDefaultSchemaNode();
        if (schema instanceof v) {
            return new vc.a((v) schema);
        }
        throw new IllegalArgumentException(e2.k(cls, new StringBuilder("Class "), " would not be serialized as a JSON object and therefore has no schema"));
    }

    @Override // jc.u0
    public ub.o getGenerator() {
        return this.f97788s;
    }

    public final void h(ub.o oVar, Object obj, w wVar, n0 n0Var) throws IOException {
        try {
            oVar.writeStartObject();
            oVar.writeFieldName(n0Var.simpleAsEncoded(this.f69445b));
            wVar.serialize(obj, oVar, this);
            oVar.writeEndObject();
        } catch (Exception e10) {
            throw j(oVar, e10);
        }
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this.f69445b.isEnabled(t0.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(cls);
            if (wVarUntypedValueSerializer == null && (wVarUntypedValueSerializer = this.f69448f.untypedValueSerializer(cls)) == null) {
                wVarUntypedValueSerializer = d(cls);
            }
            if (isUnknownTypeSerializer(wVarUntypedValueSerializer)) {
                wVarUntypedValueSerializer = null;
            }
            return wVarUntypedValueSerializer != null;
        } catch (RuntimeException e10) {
            if (atomicReference == null) {
                throw e10;
            }
            atomicReference.set(e10);
            return false;
        } catch (jc.r e11) {
            if (atomicReference != null) {
                atomicReference.set(e11);
            }
            return false;
        }
    }

    public final void i(ub.o oVar) throws IOException {
        try {
            getDefaultNullValueSerializer().serialize(null, oVar, this);
        } catch (Exception e10) {
            throw j(oVar, e10);
        }
    }

    @Override // jc.u0
    public Object includeFilterInstance(d0 d0Var, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        s0 s0Var = this.f69445b;
        lc.v handlerInstantiator = s0Var.getHandlerInstantiator();
        Object objIncludeFilterInstance = handlerInstantiator != null ? handlerInstantiator.includeFilterInstance(s0Var, d0Var, cls) : null;
        return objIncludeFilterInstance == null ? dd.i.createInstance(cls, s0Var.canOverrideAccessModifiers()) : objIncludeFilterInstance;
    }

    @Override // jc.u0
    public boolean includeFilterSuppressNulls(Object obj) throws jc.r {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String name2 = e10.getClass().getName();
            String strExceptionMessage = dd.i.exceptionMessage(e10);
            StringBuilder sbB = b3.h.b("Problem determining whether filter of type '", name, "' should filter out `null` values: (", name2, ") ");
            sbB.append(strExceptionMessage);
            reportBadDefinition(obj.getClass(), sbB.toString(), e10);
            return false;
        }
    }

    public void serializePolymorphic(ub.o oVar, Object obj, jc.o oVar2, w wVar, wc.j jVar) throws IOException {
        boolean zIsEnabled;
        this.f97788s = oVar;
        if (obj == null) {
            i(oVar);
            return;
        }
        if (oVar2 != null && !oVar2.getRawClass().isAssignableFrom(obj.getClass())) {
            g(obj, oVar2);
        }
        if (wVar == null) {
            wVar = (oVar2 == null || !oVar2.isContainerType()) ? findValueSerializer(obj.getClass(), (jc.g) null) : findValueSerializer(oVar2, (jc.g) null);
        }
        s0 s0Var = this.f69445b;
        n0 fullRootName = s0Var.getFullRootName();
        if (fullRootName == null) {
            zIsEnabled = s0Var.isEnabled(t0.WRAP_ROOT_VALUE);
            if (zIsEnabled) {
                oVar.writeStartObject();
                oVar.writeFieldName(s0Var.findRootName(obj.getClass()).simpleAsEncoded(s0Var));
            }
        } else if (fullRootName.isEmpty()) {
            zIsEnabled = false;
        } else {
            oVar.writeStartObject();
            oVar.writeFieldName(fullRootName.getSimpleName());
            zIsEnabled = true;
        }
        try {
            wVar.serializeWithType(obj, oVar, this, jVar);
            if (zIsEnabled) {
                oVar.writeEndObject();
            }
        } catch (Exception e10) {
            throw j(oVar, e10);
        }
    }

    public void serializeValue(ub.o oVar, Object obj) throws IOException {
        this.f97788s = oVar;
        if (obj == null) {
            i(oVar);
            return;
        }
        Class<?> cls = obj.getClass();
        w wVarFindTypedValueSerializer = findTypedValueSerializer(cls, true, (jc.g) null);
        s0 s0Var = this.f69445b;
        n0 fullRootName = s0Var.getFullRootName();
        if (fullRootName == null) {
            if (s0Var.isEnabled(t0.WRAP_ROOT_VALUE)) {
                h(oVar, obj, wVarFindTypedValueSerializer, s0Var.findRootName(cls));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            h(oVar, obj, wVarFindTypedValueSerializer, fullRootName);
            return;
        }
        try {
            wVarFindTypedValueSerializer.serialize(obj, oVar, this);
        } catch (Exception e10) {
            throw j(oVar, e10);
        }
    }

    @Override // jc.u0
    public w serializerInstance(rc.b bVar, Object obj) throws jc.r {
        w wVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof w) {
            wVar = (w) obj;
        } else {
            if (!(obj instanceof Class)) {
                reportBadDefinition(bVar.getType(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class<?> cls = (Class) obj;
            if (cls == w.a.class || dd.i.isBogusClass(cls)) {
                return null;
            }
            if (!w.class.isAssignableFrom(cls)) {
                reportBadDefinition(bVar.getType(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            s0 s0Var = this.f69445b;
            lc.v handlerInstantiator = s0Var.getHandlerInstantiator();
            w wVarSerializerInstance = handlerInstantiator != null ? handlerInstantiator.serializerInstance(s0Var, bVar, cls) : null;
            wVar = wVarSerializerInstance == null ? (w) dd.i.createInstance(cls, s0Var.canOverrideAccessModifiers()) : wVarSerializerInstance;
        }
        if (wVar instanceof q) {
            ((q) wVar).resolve(this);
        }
        return wVar;
    }

    public abstract l withCaches(lc.b bVar);

    public void serializeValue(ub.o oVar, Object obj, jc.o oVar2) throws IOException {
        this.f97788s = oVar;
        if (obj == null) {
            i(oVar);
            return;
        }
        if (!oVar2.getRawClass().isAssignableFrom(obj.getClass())) {
            g(obj, oVar2);
        }
        w wVarFindTypedValueSerializer = findTypedValueSerializer(oVar2, true, (jc.g) null);
        s0 s0Var = this.f69445b;
        n0 fullRootName = s0Var.getFullRootName();
        if (fullRootName == null) {
            if (s0Var.isEnabled(t0.WRAP_ROOT_VALUE)) {
                h(oVar, obj, wVarFindTypedValueSerializer, s0Var.findRootName(oVar2));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            h(oVar, obj, wVarFindTypedValueSerializer, fullRootName);
            return;
        }
        try {
            wVarFindTypedValueSerializer.serialize(obj, oVar, this);
        } catch (Exception e10) {
            throw j(oVar, e10);
        }
    }

    public void serializeValue(ub.o oVar, Object obj, jc.o oVar2, w wVar) throws IOException {
        n0 n0VarFindRootName;
        this.f97788s = oVar;
        if (obj == null) {
            i(oVar);
            return;
        }
        if (oVar2 != null && !oVar2.getRawClass().isAssignableFrom(obj.getClass())) {
            g(obj, oVar2);
        }
        if (wVar == null) {
            wVar = findTypedValueSerializer(oVar2, true, (jc.g) null);
        }
        s0 s0Var = this.f69445b;
        n0 fullRootName = s0Var.getFullRootName();
        if (fullRootName == null) {
            if (s0Var.isEnabled(t0.WRAP_ROOT_VALUE)) {
                if (oVar2 == null) {
                    n0VarFindRootName = s0Var.findRootName(obj.getClass());
                } else {
                    n0VarFindRootName = s0Var.findRootName(oVar2);
                }
                h(oVar, obj, wVar, n0VarFindRootName);
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            h(oVar, obj, wVar, fullRootName);
            return;
        }
        try {
            wVar.serialize(obj, oVar, this);
        } catch (Exception e10) {
            throw j(oVar, e10);
        }
    }
}
