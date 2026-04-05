package bd;

import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z0 extends jc.w implements vc.c, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9158c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Class f9159b;

    public z0(Class cls) {
        this.f9159b = cls;
    }

    public static yc.v a(String str) {
        yc.v vVarObjectNode = yc.o.f94329c.objectNode();
        vVarObjectNode.put("type", str);
        return vVarObjectNode;
    }

    public static jc.w b(jc.u0 u0Var, jc.g gVar, jc.w wVar) {
        jc.w t0Var;
        rc.l member;
        Object objFindSerializationContentConverter;
        Object obj = f9158c;
        Map identityHashMap = (Map) u0Var.getAttribute(obj);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            u0Var.setAttribute(obj, (Object) identityHashMap);
        } else if (identityHashMap.get(gVar) != null) {
            return wVar;
        }
        identityHashMap.put(gVar, Boolean.TRUE);
        try {
            jc.c annotationIntrospector = u0Var.getAnnotationIntrospector();
            if (!((annotationIntrospector == null || gVar == null) ? false : true) || (member = gVar.getMember()) == null || (objFindSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) == null) {
                t0Var = wVar;
            } else {
                nc.o oVar = (nc.o) u0Var.converterInstance(gVar.getMember(), objFindSerializationContentConverter);
                jc.o outputType = oVar.getOutputType(u0Var.getTypeFactory());
                t0Var = new t0(oVar, outputType, (wVar != null || outputType.isJavaLangObject()) ? wVar : u0Var.findValueSerializer(outputType));
            }
            return t0Var != null ? u0Var.handleSecondaryContextualization(t0Var, gVar) : wVar;
        } finally {
            identityHashMap.remove(gVar);
        }
    }

    public static tb.t c(Class cls, jc.u0 u0Var, jc.g gVar) {
        return gVar != null ? gVar.findPropertyFormat(u0Var.getConfig(), cls) : u0Var.getDefaultPropertyFormat(cls);
    }

    @Override // jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectAnyFormat(oVar);
    }

    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) throws jc.r {
        return a("string");
    }

    @Override // jc.w
    public Class<Object> handledType() {
        return this.f9159b;
    }

    @Override // jc.w
    public abstract void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException;

    public void wrapAndThrow(jc.u0 u0Var, Throwable th2, Object obj, String str) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        dd.i.throwIfError(th2);
        boolean z10 = u0Var == null || u0Var.isEnabled(jc.t0.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof ub.h)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            dd.i.throwIfRTE(th2);
        }
        throw jc.r.wrapWithPath(th2, obj, str);
    }

    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type, boolean z10) throws jc.r {
        yc.v vVar = (yc.v) getSchema(u0Var, type);
        if (!z10) {
            vVar.put("required", true);
        }
        return vVar;
    }

    public z0(jc.o oVar) {
        this.f9159b = oVar.getRawClass();
    }

    public final zc.o d(jc.u0 u0Var, Object obj, Object obj2) {
        zc.m filterProvider = u0Var.getFilterProvider();
        if (filterProvider == null) {
            return (zc.o) u0Var.reportBadDefinition(handledType(), "Cannot resolve PropertyFilter with id '" + obj + PcrIk.xlapxUfp);
        }
        return filterProvider.findPropertyFilter(obj, obj2);
    }

    public z0(Class cls, int i10) {
        this.f9159b = cls;
    }

    public z0(z0 z0Var) {
        this.f9159b = z0Var.f9159b;
    }

    public void wrapAndThrow(jc.u0 u0Var, Throwable th2, Object obj, int i10) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        dd.i.throwIfError(th2);
        boolean z10 = u0Var == null || u0Var.isEnabled(jc.t0.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof ub.h)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            dd.i.throwIfRTE(th2);
        }
        throw jc.r.wrapWithPath(th2, obj, i10);
    }
}
