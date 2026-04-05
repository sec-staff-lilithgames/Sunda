package bd;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f0 extends a {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9073g;

    /* renamed from: h, reason: collision with root package name */
    public final jc.o f9074h;

    /* renamed from: i, reason: collision with root package name */
    public final wc.j f9075i;

    /* renamed from: j, reason: collision with root package name */
    public final jc.w f9076j;

    /* renamed from: k, reason: collision with root package name */
    public ad.t f9077k;

    public f0(jc.o oVar, boolean z10, wc.j jVar, jc.w wVar) {
        super(Object[].class);
        this.f9074h = oVar;
        this.f9073g = z10;
        this.f9075i = jVar;
        this.f9077k = ad.t.emptyForProperties();
        this.f9076j = wVar;
    }

    @Override // bd.a
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new f0(this, gVar, this.f9075i, this.f9076j, bool);
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return new f0(this.f9074h, this.f9073g, jVar, this.f9076j);
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectArrayFormat(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // bd.a, zc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w createContextual(jc.u0 r6, jc.g r7) throws jc.r {
        /*
            r5 = this;
            wc.j r0 = r5.f9075i
            if (r0 == 0) goto L8
            wc.j r0 = r0.forProperty(r7)
        L8:
            r1 = 0
            if (r7 == 0) goto L20
            rc.l r2 = r7.getMember()
            jc.c r3 = r6.getAnnotationIntrospector()
            if (r2 == 0) goto L20
            java.lang.Object r3 = r3.findContentSerializer(r2)
            if (r3 == 0) goto L20
            jc.w r2 = r6.serializerInstance(r2, r3)
            goto L21
        L20:
            r2 = r1
        L21:
            java.lang.Class r3 = r5.handledType()
            tb.t r3 = bd.z0.c(r3, r6, r7)
            if (r3 == 0) goto L31
            tb.q r1 = tb.q.f86758g
            java.lang.Boolean r1 = r3.getFeature(r1)
        L31:
            if (r2 != 0) goto L35
            jc.w r2 = r5.f9076j
        L35:
            jc.w r2 = bd.z0.b(r6, r7, r2)
            if (r2 != 0) goto L4d
            jc.o r3 = r5.f9074h
            if (r3 == 0) goto L4d
            boolean r4 = r5.f9073g
            if (r4 == 0) goto L4d
            boolean r4 = r3.isJavaLangObject()
            if (r4 != 0) goto L4d
            jc.w r2 = r6.findContentValueSerializer(r3, r7)
        L4d:
            bd.f0 r6 = r5.withResolved(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.f0.createContextual(jc.u0, jc.g):jc.w");
    }

    @Override // zc.i
    public jc.w getContentSerializer() {
        return this.f9076j;
    }

    @Override // zc.i
    public jc.o getContentType() {
        return this.f9074h;
    }

    public void serializeContentsUsing(Object[] objArr, ub.o oVar, jc.u0 u0Var, jc.w wVar) throws IOException {
        int length = objArr.length;
        Object obj = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                obj = objArr[i10];
                if (obj == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    wc.j jVar = this.f9075i;
                    if (jVar == null) {
                        wVar.serialize(obj, oVar, u0Var);
                    } else {
                        wVar.serializeWithType(obj, oVar, u0Var, jVar);
                    }
                }
            } catch (Exception e10) {
                wrapAndThrow(u0Var, e10, obj, i10);
                return;
            }
        }
    }

    public void serializeTypedContents(Object[] objArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        int length = objArr.length;
        wc.j jVar = this.f9075i;
        int i10 = 0;
        Object obj = null;
        try {
            ad.t tVar = this.f9077k;
            while (i10 < length) {
                obj = objArr[i10];
                if (obj == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    Class<?> cls = obj.getClass();
                    jc.w wVarSerializerFor = tVar.serializerFor(cls);
                    if (wVarSerializerFor == null) {
                        ad.q qVarFindAndAddSecondarySerializer = tVar.findAndAddSecondarySerializer(cls, u0Var, this.f9051e);
                        ad.t tVar2 = qVarFindAndAddSecondarySerializer.f4292b;
                        if (tVar != tVar2) {
                            this.f9077k = tVar2;
                        }
                        wVarSerializerFor = qVarFindAndAddSecondarySerializer.f4291a;
                    }
                    wVarSerializerFor.serializeWithType(obj, oVar, u0Var, jVar);
                }
                i10++;
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, obj, i10);
        }
    }

    public f0 withResolved(jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        return (this.f9051e == gVar && wVar == this.f9076j && this.f9075i == jVar && Objects.equals(this.f9052f, bool)) ? this : new f0(this, gVar, jVar, wVar, bool);
    }

    @Override // zc.i
    public boolean hasSingleElement(Object[] objArr) {
        return objArr.length == 1;
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Object[] objArr) {
        return objArr.length == 0;
    }

    @Override // bd.a, bd.z0, jc.w
    public final void serialize(Object[] objArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        Boolean bool;
        int length = objArr.length;
        if (length == 1 && (((bool = this.f9052f) == null && u0Var.isEnabled(jc.t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || bool == Boolean.TRUE)) {
            serializeContents(objArr, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(objArr, length);
        serializeContents(objArr, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.a
    public void serializeContents(Object[] objArr, ub.o oVar, jc.u0 u0Var) throws IOException {
        jc.o oVar2 = this.f9074h;
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        jc.w wVar = this.f9076j;
        if (wVar != null) {
            serializeContentsUsing(objArr, oVar, u0Var, wVar);
            return;
        }
        if (this.f9075i != null) {
            serializeTypedContents(objArr, oVar, u0Var);
            return;
        }
        int i10 = 0;
        Object obj = null;
        try {
            ad.t tVar = this.f9077k;
            while (i10 < length) {
                obj = objArr[i10];
                if (obj == null) {
                    u0Var.defaultSerializeNull(oVar);
                } else {
                    Class<?> cls = obj.getClass();
                    jc.w wVarSerializerFor = tVar.serializerFor(cls);
                    if (wVarSerializerFor == null) {
                        boolean zHasGenericTypes = oVar2.hasGenericTypes();
                        jc.g gVar = this.f9051e;
                        if (zHasGenericTypes) {
                            ad.q qVarFindAndAddSecondarySerializer = tVar.findAndAddSecondarySerializer(u0Var.constructSpecializedType(oVar2, cls), u0Var, gVar);
                            ad.t tVar2 = qVarFindAndAddSecondarySerializer.f4292b;
                            if (tVar != tVar2) {
                                this.f9077k = tVar2;
                            }
                            wVarSerializerFor = qVarFindAndAddSecondarySerializer.f4291a;
                        } else {
                            ad.q qVarFindAndAddSecondarySerializer2 = tVar.findAndAddSecondarySerializer(cls, u0Var, gVar);
                            ad.t tVar3 = qVarFindAndAddSecondarySerializer2.f4292b;
                            if (tVar != tVar3) {
                                this.f9077k = tVar3;
                            }
                            wVarSerializerFor = qVarFindAndAddSecondarySerializer2.f4291a;
                        }
                    }
                    wVarSerializerFor.serialize(obj, oVar, u0Var);
                }
                i10++;
            }
        } catch (Exception e10) {
            wrapAndThrow(u0Var, e10, obj, i10);
        }
    }

    public f0(f0 f0Var, wc.j jVar) {
        super(f0Var);
        this.f9074h = f0Var.f9074h;
        this.f9075i = jVar;
        this.f9073g = f0Var.f9073g;
        this.f9077k = f0Var.f9077k;
        this.f9076j = f0Var.f9076j;
    }

    public f0(f0 f0Var, jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        super(f0Var, gVar, bool);
        this.f9074h = f0Var.f9074h;
        this.f9075i = jVar;
        this.f9073g = f0Var.f9073g;
        this.f9077k = ad.t.emptyForProperties();
        this.f9076j = wVar;
    }
}
