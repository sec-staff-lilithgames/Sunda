package xc;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oc.c0;
import tb.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s extends wc.g implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final wc.h f91925b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.o f91926c;

    /* renamed from: e, reason: collision with root package name */
    public final jc.g f91927e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f91928f;

    /* renamed from: g, reason: collision with root package name */
    public final String f91929g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f91930h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f91931i;

    /* renamed from: j, reason: collision with root package name */
    public jc.q f91932j;

    public s(jc.o oVar, wc.h hVar, String str, boolean z10, jc.o oVar2) {
        this.f91926c = oVar;
        this.f91925b = hVar;
        this.f91929g = dd.i.nonNullString(str);
        this.f91930h = z10;
        this.f91931i = new ConcurrentHashMap(16, 0.75f, 2);
        this.f91928f = oVar2;
        this.f91927e = null;
    }

    public final Object a(ub.u uVar, jc.k kVar, Object obj) {
        return c(obj instanceof String ? (String) obj : String.valueOf(obj), kVar).deserialize(uVar, kVar);
    }

    public final jc.q b(jc.k kVar) {
        jc.o oVar = this.f91928f;
        if (oVar == null) {
            if (kVar.isEnabled(jc.l.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return c0.f78800f;
        }
        if (dd.i.isBogusClass(oVar.getRawClass())) {
            return c0.f78800f;
        }
        if (this.f91932j == null) {
            synchronized (this.f91928f) {
                try {
                    if (this.f91932j == null) {
                        this.f91932j = kVar.findContextualValueDeserializer(this.f91928f, this.f91927e);
                    }
                } finally {
                }
            }
        }
        return this.f91932j;
    }

    public jc.o baseType() {
        return this.f91926c;
    }

    public String baseTypeName() {
        return this.f91926c.getRawClass().getName();
    }

    public final jc.q c(String str, jc.k kVar) throws IOException {
        jc.q qVarFindContextualValueDeserializer;
        ConcurrentHashMap concurrentHashMap = this.f91931i;
        jc.q qVar = (jc.q) concurrentHashMap.get(str);
        if (qVar != null) {
            return qVar;
        }
        wc.h hVar = this.f91925b;
        jc.o oVarTypeFromId = hVar.typeFromId(kVar, str);
        jc.g gVar = this.f91927e;
        jc.o oVar = this.f91926c;
        if (oVarTypeFromId == null) {
            qVarFindContextualValueDeserializer = b(kVar);
            if (qVarFindContextualValueDeserializer == null) {
                String descForKnownTypeIds = hVar.getDescForKnownTypeIds();
                String strConcat = descForKnownTypeIds == null ? "type ids are not statically known" : "known type ids = ".concat(descForKnownTypeIds);
                if (gVar != null) {
                    strConcat = e3.g.k(strConcat, " (for POJO property '", gVar.getName(), "')");
                }
                jc.o oVarHandleUnknownTypeId = kVar.handleUnknownTypeId(oVar, str, hVar, strConcat);
                if (oVarHandleUnknownTypeId == null) {
                    return c0.f78800f;
                }
                qVarFindContextualValueDeserializer = kVar.findContextualValueDeserializer(oVarHandleUnknownTypeId, gVar);
            }
        } else {
            if (oVar != null && oVar.getClass() == oVarTypeFromId.getClass() && !oVarTypeFromId.hasGenericTypes()) {
                try {
                    oVarTypeFromId = kVar.constructSpecializedType(oVar, oVarTypeFromId.getRawClass());
                } catch (IllegalArgumentException e10) {
                    throw kVar.invalidTypeIdException(oVar, str, e10.getMessage());
                }
            }
            qVarFindContextualValueDeserializer = kVar.findContextualValueDeserializer(oVarTypeFromId, gVar);
        }
        concurrentHashMap.put(str, qVarFindContextualValueDeserializer);
        return qVarFindContextualValueDeserializer;
    }

    @Override // wc.g
    public abstract wc.g forProperty(jc.g gVar);

    @Override // wc.g
    public Class<?> getDefaultImpl() {
        return dd.i.rawClass(this.f91928f);
    }

    @Override // wc.g
    public final String getPropertyName() {
        return this.f91929g;
    }

    @Override // wc.g
    public wc.h getTypeIdResolver() {
        return this.f91925b;
    }

    @Override // wc.g
    public abstract v0 getTypeInclusion();

    @Override // wc.g
    public boolean hasDefaultImpl() {
        return this.f91928f != null;
    }

    public String toString() {
        return C3191e4.i.f36529d + getClass().getName() + "; base-type:" + this.f91926c + "; id-resolver: " + this.f91925b + AbstractJsonLexerKt.END_LIST;
    }

    public s(s sVar, jc.g gVar) {
        this.f91926c = sVar.f91926c;
        this.f91925b = sVar.f91925b;
        this.f91929g = sVar.f91929g;
        this.f91930h = sVar.f91930h;
        this.f91931i = sVar.f91931i;
        this.f91928f = sVar.f91928f;
        this.f91932j = sVar.f91932j;
        this.f91927e = gVar;
    }
}
