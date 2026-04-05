package bd;

import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b extends zc.i implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final jc.o f9054e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.g f9055f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9056g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f9057h;

    /* renamed from: i, reason: collision with root package name */
    public final wc.j f9058i;

    /* renamed from: j, reason: collision with root package name */
    public final jc.w f9059j;

    /* renamed from: k, reason: collision with root package name */
    public ad.t f9060k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Class cls, jc.o oVar, boolean z10, wc.j jVar, jc.w wVar) {
        super(cls, 0);
        boolean z11 = false;
        this.f9054e = oVar;
        if (z10 || (oVar != null && oVar.isFinal())) {
            z11 = true;
        }
        this.f9056g = z11;
        this.f9058i = jVar;
        this.f9055f = null;
        this.f9059j = wVar;
        this.f9060k = ad.t.emptyForProperties();
        this.f9057h = null;
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        jc.o oVar2;
        if (this.f9059j == null && (oVar2 = this.f9054e) != null) {
            hVar.getProvider().findContentValueSerializer(oVar2, this.f9055f);
        }
        hVar.expectArrayFormat(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    @Override // zc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w createContextual(jc.u0 r8, jc.g r9) throws jc.r {
        /*
            r7 = this;
            wc.j r0 = r7.f9058i
            if (r0 == 0) goto L9
            wc.j r1 = r0.forProperty(r9)
            goto La
        L9:
            r1 = r0
        La:
            r2 = 0
            if (r9 == 0) goto L22
            jc.c r3 = r8.getAnnotationIntrospector()
            rc.l r4 = r9.getMember()
            if (r4 == 0) goto L22
            java.lang.Object r3 = r3.findContentSerializer(r4)
            if (r3 == 0) goto L22
            jc.w r3 = r8.serializerInstance(r4, r3)
            goto L23
        L22:
            r3 = r2
        L23:
            java.lang.Class r4 = r7.handledType()
            tb.t r4 = bd.z0.c(r4, r8, r9)
            if (r4 == 0) goto L33
            tb.q r2 = tb.q.f86758g
            java.lang.Boolean r2 = r4.getFeature(r2)
        L33:
            jc.w r4 = r7.f9059j
            if (r3 != 0) goto L38
            r3 = r4
        L38:
            jc.w r3 = bd.z0.b(r8, r9, r3)
            if (r3 != 0) goto L50
            jc.o r5 = r7.f9054e
            if (r5 == 0) goto L50
            boolean r6 = r7.f9056g
            if (r6 == 0) goto L50
            boolean r6 = r5.isJavaLangObject()
            if (r6 != 0) goto L50
            jc.w r3 = r8.findContentValueSerializer(r5, r9)
        L50:
            if (r3 != r4) goto L62
            jc.g r8 = r7.f9055f
            if (r9 != r8) goto L62
            if (r0 != r1) goto L62
            java.lang.Boolean r8 = r7.f9057h
            boolean r8 = java.util.Objects.equals(r8, r2)
            if (r8 != 0) goto L61
            goto L62
        L61:
            return r7
        L62:
            bd.b r8 = r7.withResolved(r9, r1, r3, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.b.createContextual(jc.u0, jc.g):jc.w");
    }

    public final jc.w e(ad.t tVar, Class cls, jc.u0 u0Var) throws jc.r {
        ad.q qVarFindAndAddSecondarySerializer = tVar.findAndAddSecondarySerializer((Class<?>) cls, u0Var, this.f9055f);
        ad.t tVar2 = qVarFindAndAddSecondarySerializer.f4292b;
        if (tVar != tVar2) {
            this.f9060k = tVar2;
        }
        return qVarFindAndAddSecondarySerializer.f4291a;
    }

    public final jc.w f(ad.t tVar, jc.o oVar, jc.u0 u0Var) throws jc.r {
        ad.q qVarFindAndAddSecondarySerializer = tVar.findAndAddSecondarySerializer(oVar, u0Var, this.f9055f);
        ad.t tVar2 = qVarFindAndAddSecondarySerializer.f4292b;
        if (tVar != tVar2) {
            this.f9060k = tVar2;
        }
        return qVarFindAndAddSecondarySerializer.f4291a;
    }

    @Override // zc.i
    public jc.w getContentSerializer() {
        return this.f9059j;
    }

    @Override // zc.i
    public jc.o getContentType() {
        return this.f9054e;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) throws jc.r {
        yc.v vVarA = z0.a("array");
        uc.e eVar = this.f9059j;
        if (eVar != null) {
            jc.t schema = eVar instanceof vc.c ? ((vc.c) eVar).getSchema(u0Var, null) : null;
            if (schema == null) {
                schema = vc.a.getDefaultSchemaNode();
            }
            vVarA.set("items", schema);
        }
        return vVarA;
    }

    @Override // bd.z0, jc.w
    public void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (u0Var.isEnabled(jc.t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(obj)) {
            serializeContents(obj, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(obj);
        serializeContents(obj, oVar, u0Var);
        oVar.writeEndArray();
    }

    public abstract void serializeContents(Object obj, ub.o oVar, jc.u0 u0Var);

    @Override // jc.w
    public void serializeWithType(Object obj, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(obj, ub.z.START_ARRAY));
        oVar.assignCurrentValue(obj);
        serializeContents(obj, oVar, u0Var);
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }

    @Deprecated
    public final b withResolved(jc.g gVar, wc.j jVar, jc.w wVar) {
        return withResolved(gVar, jVar, wVar, this.f9057h);
    }

    public abstract b withResolved(jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool);

    public b(b bVar, jc.g gVar, wc.j jVar, jc.w wVar, Boolean bool) {
        super(bVar.f9159b, 0);
        this.f9054e = bVar.f9054e;
        this.f9056g = bVar.f9056g;
        this.f9058i = jVar;
        this.f9055f = gVar;
        this.f9059j = wVar;
        this.f9060k = ad.t.emptyForProperties();
        this.f9057h = bool;
    }
}
