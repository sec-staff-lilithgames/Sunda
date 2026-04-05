package xc;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import lc.z;
import tb.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l extends t implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final wc.d f91906e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f91907f;

    @Deprecated
    public l(jc.o oVar, cd.s sVar, wc.d dVar) {
        this(oVar, sVar, null, dVar);
    }

    @Deprecated
    public static l construct(jc.o oVar, z zVar, wc.d dVar) {
        return new l(oVar, zVar.getTypeFactory(), dVar);
    }

    public final String b(Object obj, Class cls, cd.s sVar) {
        Class clsA = t.a(cls);
        String name = clsA.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                return sVar.constructCollectionType(EnumSet.class, dd.i.findEnumType((EnumSet<?>) obj)).toCanonical();
            }
            if (obj instanceof EnumMap) {
                return sVar.constructMapType(EnumMap.class, dd.i.findEnumType((EnumMap<?, ?>) obj), Object.class).toCanonical();
            }
        } else if (name.indexOf(36) >= 0 && dd.i.getOuterClass(clsA) != null) {
            jc.o oVar = this.f91934c;
            if (dd.i.getOuterClass(oVar.getRawClass()) == null) {
                return oVar.getRawClass().getName();
            }
        }
        return name;
    }

    public jc.o c(jc.h hVar, String str) throws jc.r, IllegalArgumentException {
        jc.k kVar = hVar instanceof jc.k ? (jc.k) hVar : null;
        Set set = this.f91907f;
        jc.o oVar = this.f91934c;
        if (set != null && kVar != null && kVar.isEnabled(jc.l.FAIL_ON_SUBTYPE_CLASS_NOT_REGISTERED) && !set.contains(str)) {
            throw kVar.invalidTypeIdException(oVar, str, "`DeserializationFeature.FAIL_ON_SUBTYPE_CLASS_NOT_REGISTERED` is enabled and the input class is not registered using `@JsonSubTypes` annotation");
        }
        jc.o oVarResolveAndValidateSubType = hVar.resolveAndValidateSubType(oVar, str, this.f91906e);
        return (oVarResolveAndValidateSubType != null || kVar == null) ? oVarResolveAndValidateSubType : kVar.handleUnknownTypeId(oVar, str, this, "no such class found");
    }

    @Override // xc.t, wc.h
    public String getDescForKnownTypeIds() {
        return "class name used as type id";
    }

    @Override // xc.t, wc.h
    public w0 getMechanism() {
        return w0.f86794e;
    }

    @Override // xc.t, wc.h
    public String idFromValue(Object obj) {
        return b(obj, obj.getClass(), this.f91933b);
    }

    @Override // xc.t, wc.h
    public String idFromValueAndType(Object obj, Class<?> cls) {
        return b(obj, cls, this.f91933b);
    }

    @Override // xc.t, wc.h
    public jc.o typeFromId(jc.h hVar, String str) throws IOException {
        return c(hVar, str);
    }

    public l(jc.o oVar, cd.s sVar, Collection<wc.c> collection, wc.d dVar) {
        super(oVar, sVar);
        this.f91906e = dVar;
        Set hashSet = null;
        if (collection != null) {
            for (wc.c cVar : collection) {
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(cVar.getType().getName());
            }
        }
        this.f91907f = hashSet == null ? Collections.EMPTY_SET : hashSet;
    }

    public static l construct(jc.o oVar, z zVar, Collection<wc.c> collection, wc.d dVar) {
        return new l(oVar, zVar.getTypeFactory(), collection, dVar);
    }

    @Deprecated
    public void registerSubtype(Class<?> cls, String str) {
    }
}
