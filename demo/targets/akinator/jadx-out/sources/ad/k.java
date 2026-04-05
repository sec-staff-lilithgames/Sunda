package ad;

import bd.z0;
import j1.o2;
import java.io.IOException;
import java.util.Map;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k extends zc.i implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final jc.g f4268e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4269f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.o f4270g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.o f4271h;

    /* renamed from: i, reason: collision with root package name */
    public final jc.w f4272i;

    /* renamed from: j, reason: collision with root package name */
    public final jc.w f4273j;

    /* renamed from: k, reason: collision with root package name */
    public final wc.j f4274k;

    /* renamed from: l, reason: collision with root package name */
    public t f4275l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f4276m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4277n;

    public k(jc.o oVar, jc.o oVar2, jc.o oVar3, boolean z10, wc.j jVar, jc.g gVar) {
        super(oVar);
        this.f4270g = oVar2;
        this.f4271h = oVar3;
        this.f4269f = z10;
        this.f4274k = jVar;
        this.f4268e = gVar;
        this.f4275l = t.emptyForProperties();
        this.f4276m = null;
        this.f4277n = false;
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return new k(this, this.f4272i, this.f4273j, this.f4276m, this.f4277n);
    }

    @Override // zc.j
    public jc.w createContextual(u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVarSerializerInstance;
        jc.w wVarSerializerInstance2;
        boolean zIncludeFilterSuppressNulls;
        jc.g gVar2;
        Object obj;
        tb.d0 d0VarFindPropertyInclusion;
        tb.c0 contentInclusion;
        jc.c annotationIntrospector = u0Var.getAnnotationIntrospector();
        Object defaultValue = null;
        rc.l member = gVar == null ? null : gVar.getMember();
        if (member == null || annotationIntrospector == null) {
            wVarSerializerInstance = null;
            wVarSerializerInstance2 = null;
        } else {
            Object objFindKeySerializer = annotationIntrospector.findKeySerializer(member);
            wVarSerializerInstance2 = objFindKeySerializer != null ? u0Var.serializerInstance(member, objFindKeySerializer) : null;
            Object objFindContentSerializer = annotationIntrospector.findContentSerializer(member);
            wVarSerializerInstance = objFindContentSerializer != null ? u0Var.serializerInstance(member, objFindContentSerializer) : null;
        }
        if (wVarSerializerInstance == null) {
            wVarSerializerInstance = this.f4273j;
        }
        jc.w wVarB = z0.b(u0Var, gVar, wVarSerializerInstance);
        jc.o oVar = this.f4271h;
        if (wVarB == null && this.f4269f && !oVar.isJavaLangObject()) {
            wVarB = u0Var.findContentValueSerializer(oVar, gVar);
        }
        jc.w wVar = wVarB;
        if (wVarSerializerInstance2 == null) {
            wVarSerializerInstance2 = this.f4272i;
        }
        jc.w wVarFindKeySerializer = wVarSerializerInstance2 == null ? u0Var.findKeySerializer(this.f4270g, gVar) : u0Var.handleSecondaryContextualization(wVarSerializerInstance2, gVar);
        if (gVar != null && (d0VarFindPropertyInclusion = gVar.findPropertyInclusion(u0Var.getConfig(), null)) != null && (contentInclusion = d0VarFindPropertyInclusion.getContentInclusion()) != tb.c0.f86699h) {
            int iOrdinal = contentInclusion.ordinal();
            zIncludeFilterSuppressNulls = true;
            if (iOrdinal != 1) {
                obj = tb.c0.f86696e;
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        gVar2 = gVar;
                    } else if (iOrdinal == 4) {
                        defaultValue = dd.f.getDefaultValue(oVar);
                        if (defaultValue != null && defaultValue.getClass().isArray()) {
                            defaultValue = dd.d.getArrayComparator(defaultValue);
                        }
                    } else if (iOrdinal != 5) {
                        zIncludeFilterSuppressNulls = false;
                    } else {
                        defaultValue = u0Var.includeFilterInstance(null, d0VarFindPropertyInclusion.getContentFilter());
                        if (defaultValue != null) {
                            zIncludeFilterSuppressNulls = u0Var.includeFilterSuppressNulls(defaultValue);
                        }
                    }
                } else if (oVar.isReferenceType()) {
                    defaultValue = obj;
                }
            }
            return withResolved(gVar2, wVarFindKeySerializer, wVar, obj, zIncludeFilterSuppressNulls);
        }
        defaultValue = this.f4276m;
        zIncludeFilterSuppressNulls = this.f4277n;
        gVar2 = gVar;
        obj = defaultValue;
        return withResolved(gVar2, wVarFindKeySerializer, wVar, obj, zIncludeFilterSuppressNulls);
    }

    public final void e(Map.Entry entry, ub.o oVar, u0 u0Var) throws IOException {
        jc.w defaultNullValueSerializer;
        Object key = entry.getKey();
        jc.g gVar = this.f4268e;
        jc.w wVarFindNullKeySerializer = key == null ? u0Var.findNullKeySerializer(this.f4270g, gVar) : this.f4272i;
        Object value = entry.getValue();
        if (value != null) {
            jc.w wVar = this.f4273j;
            if (wVar == null) {
                Class<?> cls = value.getClass();
                jc.w wVarSerializerFor = this.f4275l.serializerFor(cls);
                if (wVarSerializerFor == null) {
                    jc.o oVar2 = this.f4271h;
                    if (oVar2.hasGenericTypes()) {
                        t tVar = this.f4275l;
                        q qVarFindAndAddSecondarySerializer = tVar.findAndAddSecondarySerializer(u0Var.constructSpecializedType(oVar2, cls), u0Var, gVar);
                        t tVar2 = qVarFindAndAddSecondarySerializer.f4292b;
                        if (tVar != tVar2) {
                            this.f4275l = tVar2;
                        }
                        defaultNullValueSerializer = qVarFindAndAddSecondarySerializer.f4291a;
                    } else {
                        t tVar3 = this.f4275l;
                        q qVarFindAndAddSecondarySerializer2 = tVar3.findAndAddSecondarySerializer(cls, u0Var, gVar);
                        t tVar4 = qVarFindAndAddSecondarySerializer2.f4292b;
                        if (tVar3 != tVar4) {
                            this.f4275l = tVar4;
                        }
                        defaultNullValueSerializer = qVarFindAndAddSecondarySerializer2.f4291a;
                    }
                } else {
                    defaultNullValueSerializer = wVarSerializerFor;
                }
            } else {
                defaultNullValueSerializer = wVar;
            }
            Object obj = this.f4276m;
            if (obj != null) {
                if (obj == tb.c0.f86696e) {
                    if (defaultNullValueSerializer.isEmpty(u0Var, value)) {
                        return;
                    }
                } else if (obj.equals(value)) {
                    return;
                }
            }
        } else if (this.f4277n) {
            return;
        } else {
            defaultNullValueSerializer = u0Var.getDefaultNullValueSerializer();
        }
        wVarFindNullKeySerializer.serialize(key, oVar, u0Var);
        wc.j jVar = this.f4274k;
        try {
            if (jVar == null) {
                defaultNullValueSerializer.serialize(value, oVar, u0Var);
            } else {
                defaultNullValueSerializer.serializeWithType(value, oVar, u0Var, jVar);
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, entry, o2.j(key, ""));
        }
    }

    @Override // zc.i
    public jc.w getContentSerializer() {
        return this.f4273j;
    }

    @Override // zc.i
    public jc.o getContentType() {
        return this.f4271h;
    }

    public k withContentInclusion(Object obj, boolean z10) {
        return (this.f4276m == obj && this.f4277n == z10) ? this : new k(this, this.f4272i, this.f4273j, obj, z10);
    }

    public k withResolved(jc.g gVar, jc.w wVar, jc.w wVar2, Object obj, boolean z10) {
        return new k(this, wVar, wVar2, obj, z10);
    }

    @Override // zc.i
    public boolean hasSingleElement(Map.Entry<?, ?> entry) {
        return true;
    }

    @Override // jc.w
    public boolean isEmpty(u0 u0Var, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this.f4277n;
        }
        Object obj = this.f4276m;
        if (obj == null) {
            return false;
        }
        jc.w wVar = this.f4273j;
        if (wVar == null) {
            Class<?> cls = value.getClass();
            jc.w wVarSerializerFor = this.f4275l.serializerFor(cls);
            if (wVarSerializerFor == null) {
                try {
                    t tVar = this.f4275l;
                    q qVarFindAndAddSecondarySerializer = tVar.findAndAddSecondarySerializer(cls, u0Var, this.f4268e);
                    t tVar2 = qVarFindAndAddSecondarySerializer.f4292b;
                    if (tVar != tVar2) {
                        this.f4275l = tVar2;
                    }
                    wVar = qVarFindAndAddSecondarySerializer.f4291a;
                } catch (jc.r unused) {
                    return false;
                }
            } else {
                wVar = wVarSerializerFor;
            }
        }
        return obj == tb.c0.f86696e ? wVar.isEmpty(u0Var, value) : obj.equals(value);
    }

    @Override // bd.z0, jc.w
    public void serialize(Map.Entry<?, ?> entry, ub.o oVar, u0 u0Var) throws IOException {
        oVar.writeStartObject(entry);
        e(entry, oVar, u0Var);
        oVar.writeEndObject();
    }

    @Override // jc.w
    public void serializeWithType(Map.Entry<?, ?> entry, ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        oVar.assignCurrentValue(entry);
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(entry, ub.z.START_OBJECT));
        e(entry, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }

    public k(k kVar, jc.w wVar, jc.w wVar2, Object obj, boolean z10) {
        super(Map.class, 0);
        this.f4270g = kVar.f4270g;
        this.f4271h = kVar.f4271h;
        this.f4269f = kVar.f4269f;
        this.f4274k = kVar.f4274k;
        this.f4272i = wVar;
        this.f4273j = wVar2;
        this.f4275l = t.emptyForProperties();
        this.f4268e = kVar.f4268e;
        this.f4276m = obj;
        this.f4277n = z10;
    }
}
