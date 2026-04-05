package mc;

import com.ironsource.C3191e4;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import nc.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final jc.g f74220b;

    /* renamed from: c, reason: collision with root package name */
    public final rc.l f74221c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f74222e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f74223f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.q f74224g;

    /* renamed from: h, reason: collision with root package name */
    public final wc.g f74225h;

    /* renamed from: i, reason: collision with root package name */
    public final jc.x f74226i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends i0.a {

        /* renamed from: c, reason: collision with root package name */
        public final x f74227c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f74228d;

        /* renamed from: e, reason: collision with root package name */
        public final String f74229e;

        public a(x xVar, a0 a0Var, Class<?> cls, Object obj, String str) {
            super(a0Var, cls);
            this.f74227c = xVar;
            this.f74228d = obj;
            this.f74229e = str;
        }

        @Override // nc.i0.a
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (hasId(obj)) {
                this.f74227c.set(this.f74228d, this.f74229e, obj2);
            } else {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends x implements Serializable {

        /* renamed from: j, reason: collision with root package name */
        public final yc.o f74231j;

        /* renamed from: k, reason: collision with root package name */
        public final int f74232k;

        public c(jc.g gVar, rc.l lVar, jc.o oVar, jc.q qVar, yc.o oVar2, int i10) {
            super(gVar, lVar, oVar, null, qVar, null);
            this.f74231j = oVar2;
            this.f74232k = i10;
        }

        @Override // mc.x
        public final void a(Object obj, Object obj2, Object obj3) {
            ((yc.v) obj).set((String) obj2, (jc.t) obj3);
        }

        @Override // mc.x
        public Object createParameterObject() {
            return this.f74231j.objectNode();
        }

        @Override // mc.x
        public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
            return this.f74224g.deserialize(uVar, kVar);
        }

        @Override // mc.x
        public int getParameterIndex() {
            return this.f74232k;
        }

        @Override // mc.x
        public x withValueDeserializer(jc.q qVar) {
            throw new UnsupportedOperationException("Cannot call withValueDeserializer() on ".concat(getClass().getName()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends x implements Serializable {

        /* renamed from: j, reason: collision with root package name */
        public final c0 f74233j;

        public d(jc.g gVar, rc.l lVar, jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar2, c0 c0Var) {
            super(gVar, lVar, oVar, xVar, qVar, gVar2);
            this.f74233j = c0Var;
        }

        @Override // mc.x
        public final void a(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, jc.r {
            rc.i iVar = (rc.i) this.f74221c;
            Map map = (Map) iVar.getValue(obj);
            if (map == null) {
                c0 c0Var = this.f74233j;
                if (c0Var == null) {
                    throw jc.r.from((jc.k) null, e3.g.l("Cannot create an instance of ", dd.i.nameOf(this.f74223f.getRawClass()), " for use as \"any-setter\" '", this.f74220b.getName(), "'"));
                }
                map = (Map) c0Var.createUsingDefault(null);
                iVar.setValue(obj, map);
            }
            map.put(obj2, obj3);
        }

        @Override // mc.x
        public x withValueDeserializer(jc.q qVar) {
            return new d(this.f74220b, this.f74221c, this.f74223f, this.f74226i, qVar, this.f74225h, this.f74233j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends x implements Serializable {

        /* renamed from: j, reason: collision with root package name */
        public final c0 f74234j;

        /* renamed from: k, reason: collision with root package name */
        public final int f74235k;

        public e(jc.g gVar, rc.l lVar, jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar2, c0 c0Var, int i10) {
            super(gVar, lVar, oVar, xVar, qVar, gVar2);
            Objects.requireNonNull(c0Var, "ValueInstantiator for MapParameterAnyProperty cannot be `null`");
            this.f74234j = c0Var;
            this.f74235k = i10;
        }

        @Override // mc.x
        public final void a(Object obj, Object obj2, Object obj3) {
            ((Map) obj).put(obj2, obj3);
        }

        @Override // mc.x
        public Object createParameterObject() {
            return new HashMap();
        }

        @Override // mc.x
        public int getParameterIndex() {
            return this.f74235k;
        }

        @Override // mc.x
        public x withValueDeserializer(jc.q qVar) {
            return new e(this.f74220b, this.f74221c, this.f74223f, this.f74226i, qVar, this.f74225h, this.f74234j, this.f74235k);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f extends x implements Serializable {
        public f(jc.g gVar, rc.l lVar, jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar2) {
            super(gVar, lVar, oVar, xVar, qVar, gVar2);
        }

        @Override // mc.x
        public final void a(Object obj, Object obj2, Object obj3) throws Exception {
            ((rc.m) this.f74221c).callOnWith(obj, obj2, obj3);
        }

        @Override // mc.x
        public x withValueDeserializer(jc.q qVar) {
            return new f(this.f74220b, this.f74221c, this.f74223f, this.f74226i, qVar, this.f74225h);
        }
    }

    public x(jc.g gVar, rc.l lVar, jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar2) {
        this.f74220b = gVar;
        this.f74221c = lVar;
        this.f74223f = oVar;
        this.f74224g = qVar;
        this.f74225h = gVar2;
        this.f74226i = xVar;
        this.f74222e = lVar instanceof rc.i;
    }

    public static x constructForJsonNodeField(jc.k kVar, jc.g gVar, rc.l lVar, jc.o oVar, jc.q qVar) {
        return new b(gVar, lVar, oVar, qVar, kVar.getNodeFactory());
    }

    public static x constructForJsonNodeParameter(jc.k kVar, jc.g gVar, rc.l lVar, jc.o oVar, jc.q qVar, int i10) {
        return new c(gVar, lVar, oVar, qVar, kVar.getNodeFactory(), i10);
    }

    public static x constructForMapField(jc.k kVar, jc.g gVar, rc.l lVar, jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar2) {
        Class<?> rawType = lVar.getRawType();
        if (rawType == Map.class) {
            rawType = LinkedHashMap.class;
        }
        return new d(gVar, lVar, oVar, xVar, qVar, gVar2, nc.n.findStdValueInstantiator(kVar.getConfig(), rawType));
    }

    public static x constructForMapParameter(jc.k kVar, jc.g gVar, rc.l lVar, jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar2, int i10) {
        Class<?> rawType = lVar.getRawType();
        if (rawType == Map.class) {
            rawType = LinkedHashMap.class;
        }
        return new e(gVar, lVar, oVar, xVar, qVar, gVar2, nc.n.findStdValueInstantiator(kVar.getConfig(), rawType), i10);
    }

    public static x constructForMethod(jc.k kVar, jc.g gVar, rc.l lVar, jc.o oVar, jc.x xVar, jc.q qVar, wc.g gVar2) {
        return new f(gVar, lVar, oVar, xVar, qVar, gVar2);
    }

    public abstract void a(Object obj, Object obj2, Object obj3);

    public Object createParameterObject() {
        throw new UnsupportedOperationException("Cannot call createParameterObject() on ".concat(getClass().getName()));
    }

    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        boolean zHasToken = uVar.hasToken(ub.z.VALUE_NULL);
        jc.q qVar = this.f74224g;
        if (zHasToken) {
            return qVar.getNullValue(kVar);
        }
        wc.g gVar = this.f74225h;
        return gVar != null ? qVar.deserializeWithType(uVar, kVar, gVar) : qVar.deserialize(uVar, kVar);
    }

    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj, String str) throws IOException {
        try {
            jc.x xVar = this.f74226i;
            set(obj, xVar == null ? str : xVar.deserializeKey(str, kVar), deserialize(uVar, kVar));
        } catch (a0 e10) {
            if (this.f74224g.getObjectIdReader() == null) {
                throw jc.r.from(uVar, "Unresolved forward reference but no identity info.", e10);
            }
            e10.getRoid().appendReferring(new a(this, e10, this.f74223f.getRawClass(), obj, str));
        }
    }

    public void fixAccess(jc.j jVar) {
        this.f74221c.fixAccess(jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public int getParameterIndex() {
        return -1;
    }

    public jc.g getProperty() {
        return this.f74220b;
    }

    public String getPropertyName() {
        return this.f74220b.getName();
    }

    public jc.o getType() {
        return this.f74223f;
    }

    public boolean hasValueDeserializer() {
        return this.f74224g != null;
    }

    public boolean isFieldType() {
        return this.f74222e;
    }

    public boolean isSetterType() {
        return this.f74221c instanceof rc.m;
    }

    public void set(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            a(obj, obj2, obj3);
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            if (!(e11 instanceof IllegalArgumentException)) {
                dd.i.throwIfIOE(e11);
                dd.i.throwIfRTE(e11);
                Throwable rootCause = dd.i.getRootCause(e11);
                throw new jc.r((Closeable) null, dd.i.exceptionMessage(rootCause), rootCause);
            }
            String strClassNameOf = dd.i.classNameOf(obj3);
            StringBuilder sb2 = new StringBuilder("Problem deserializing \"any-property\" '");
            sb2.append(obj2);
            sb2.append("' of class " + dd.i.nameOf(this.f74221c.getDeclaringClass()) + " (expected type: ");
            sb2.append(this.f74223f);
            sb2.append("; actual type: ");
            sb2.append(strClassNameOf);
            sb2.append(")");
            String strExceptionMessage = dd.i.exceptionMessage(e11);
            if (strExceptionMessage != null) {
                sb2.append(", problem: ");
                sb2.append(strExceptionMessage);
            } else {
                sb2.append(" (no error message provided)");
            }
            throw new jc.r((Closeable) null, sb2.toString(), e11);
        }
    }

    public String toString() {
        return "[any property on class " + dd.i.nameOf(this.f74221c.getDeclaringClass()) + C3191e4.i.f36531e;
    }

    public abstract x withValueDeserializer(jc.q qVar);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends x implements Serializable {

        /* renamed from: j, reason: collision with root package name */
        public final yc.o f74230j;

        public b(jc.g gVar, rc.l lVar, jc.o oVar, jc.q qVar, yc.o oVar2) {
            super(gVar, lVar, oVar, null, qVar, null);
            this.f74230j = oVar2;
        }

        @Override // mc.x
        public final void a(Object obj, Object obj2, Object obj3) throws IllegalAccessException, IllegalArgumentException, jc.r {
            b(obj, (String) obj2, (jc.t) obj3);
        }

        public final void b(Object obj, String str, jc.t tVar) throws IllegalAccessException, IllegalArgumentException, jc.r {
            yc.v vVarObjectNode;
            rc.i iVar = (rc.i) this.f74221c;
            Object value = iVar.getValue(obj);
            if (value == null) {
                vVarObjectNode = this.f74230j.objectNode();
                iVar.setValue(obj, vVarObjectNode);
            } else {
                if (!(value instanceof yc.v)) {
                    throw jc.r.from((jc.k) null, "Value \"any-setter\" '" + getPropertyName() + "' not `ObjectNode` but " + dd.i.nameOf(value.getClass()));
                }
                vVarObjectNode = (yc.v) value;
            }
            vVarObjectNode.set(str, tVar);
        }

        @Override // mc.x
        public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
            return this.f74224g.deserialize(uVar, kVar);
        }

        @Override // mc.x
        public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj, String str) throws IllegalAccessException, IOException, IllegalArgumentException {
            b(obj, str, (jc.t) deserialize(uVar, kVar));
        }

        @Override // mc.x
        public x withValueDeserializer(jc.q qVar) {
            return this;
        }
    }
}
