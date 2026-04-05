package jc;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 extends ub.a0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final j f69296b;

    /* renamed from: c, reason: collision with root package name */
    public final mc.p f69297c;

    /* renamed from: e, reason: collision with root package name */
    public final ub.k f69298e;

    /* renamed from: f, reason: collision with root package name */
    public final yb.b f69299f;

    /* renamed from: g, reason: collision with root package name */
    public final o f69300g;

    /* renamed from: h, reason: collision with root package name */
    public final q f69301h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f69302i;

    /* renamed from: j, reason: collision with root package name */
    public final n f69303j;

    /* renamed from: k, reason: collision with root package name */
    public final mc.m f69304k;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f69305l;

    /* renamed from: m, reason: collision with root package name */
    public transient o f69306m;

    public h0(f0 f0Var, j jVar, o oVar, Object obj, n nVar) {
        this.f69296b = jVar;
        this.f69297c = f0Var.f69289n;
        this.f69305l = f0Var.f69291p;
        this.f69298e = f0Var.f69278b;
        this.f69300g = oVar;
        this.f69302i = obj;
        this.f69303j = nVar;
        jVar.useRootWrapping();
        this.f69301h = m(oVar);
        this.f69304k = null;
        this.f69299f = null;
    }

    public static void n(Object obj) throws ub.q {
        throw new ub.q((ub.u) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public static void o(mc.m mVar) throws ub.q {
        throw new ub.q((ub.u) null, "Cannot detect format from input, does not look like any of detectable formats " + mVar.toString());
    }

    public final void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(a.b.l("argument \"", str, "\" is null"));
        }
    }

    public h0 at(String str) {
        a(str, "pointerExpr");
        return new h0(this, new yb.b(str));
    }

    public final Object b(ub.u uVar, Object obj) throws IOException {
        mc.p pVarR = r(uVar);
        j jVar = this.f69296b;
        jVar.initialize(uVar, null);
        ub.z zVarCurrentToken = uVar.currentToken();
        o oVar = this.f69300g;
        if (zVarCurrentToken == null && (zVarCurrentToken = uVar.nextToken()) == null) {
            pVarR.reportInputMismatch(oVar, "No content to map due to end-of-input", new Object[0]);
        }
        if (zVarCurrentToken == ub.z.VALUE_NULL) {
            if (obj == null) {
                obj = j(pVarR).getNullValue(pVarR);
            }
        } else if (zVarCurrentToken != ub.z.END_ARRAY && zVarCurrentToken != ub.z.END_OBJECT && zVarCurrentToken != ub.z.NOT_AVAILABLE) {
            obj = pVarR.readRootValue(uVar, oVar, j(pVarR), this.f69302i);
        }
        uVar.clearCurrentToken();
        if (jVar.isEnabled(l.FAIL_ON_TRAILING_TOKENS)) {
            p(uVar, pVarR, oVar);
        }
        return obj;
    }

    public final Object c(ub.u uVar) throws IOException {
        j jVar = this.f69296b;
        try {
            mc.p pVarR = r(uVar);
            jVar.initialize(uVar, null);
            ub.z zVarCurrentToken = uVar.currentToken();
            o oVar = this.f69300g;
            if (zVarCurrentToken == null && (zVarCurrentToken = uVar.nextToken()) == null) {
                pVarR.reportInputMismatch(oVar, "No content to map due to end-of-input", new Object[0]);
            }
            ub.z zVar = ub.z.VALUE_NULL;
            Object rootValue = this.f69302i;
            if (zVarCurrentToken == zVar) {
                if (rootValue == null) {
                    rootValue = j(pVarR).getNullValue(pVarR);
                }
            } else if (zVarCurrentToken != ub.z.END_ARRAY && zVarCurrentToken != ub.z.END_OBJECT && zVarCurrentToken != ub.z.NOT_AVAILABLE) {
                rootValue = pVarR.readRootValue(uVar, oVar, j(pVarR), rootValue);
            }
            if (jVar.isEnabled(l.FAIL_ON_TRAILING_TOKENS)) {
                p(uVar, pVarR, oVar);
            }
            uVar.close();
            return rootValue;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (uVar != null) {
                    try {
                        uVar.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public ub.u createNonBlockingByteArrayParser() throws IOException {
        return this.f69296b.initialize(this.f69298e.createNonBlockingByteArrayParser(), null);
    }

    public ub.u createParser(File file) throws IOException {
        a(file, "src");
        return this.f69296b.initialize(this.f69298e.createParser(file), null);
    }

    public final t d(ub.u uVar) throws IOException {
        try {
            t tVarF = f(uVar);
            if (uVar != null) {
                uVar.close();
            }
            return tVarF;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (uVar != null) {
                    try {
                        uVar.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    public final z e(ub.u uVar) throws IOException {
        mc.p pVarR = r(uVar);
        this.f69296b.initialize(uVar, null);
        uVar.nextToken();
        return new z(uVar, pVarR, j(pVarR), true, this.f69302i);
    }

    public final t f(ub.u uVar) throws IOException {
        Object obj = this.f69302i;
        if (obj != null) {
            return (t) b(uVar, obj);
        }
        j jVar = this.f69296b;
        jVar.initialize(uVar);
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == null && (zVarCurrentToken = uVar.nextToken()) == null) {
            return jVar.getNodeFactory().missingNode();
        }
        mc.p pVarR = r(uVar);
        t tVarNullNode = zVarCurrentToken == ub.z.VALUE_NULL ? jVar.getNodeFactory().nullNode() : (t) pVarR.readRootValue(uVar, l(), k(pVarR), null);
        uVar.clearCurrentToken();
        if (jVar.isEnabled(l.FAIL_ON_TRAILING_TOKENS)) {
            p(uVar, pVarR, l());
        }
        return tVarNullNode;
    }

    public h0 forType(o oVar) {
        if (oVar != null && oVar.equals(this.f69300g)) {
            return this;
        }
        q qVarM = m(oVar);
        mc.m mVarWithType = this.f69304k;
        if (mVarWithType != null) {
            mVarWithType = mVarWithType.withType(oVar);
        }
        return new h0(this, this.f69296b, oVar, qVarM, this.f69302i, this.f69303j, mVarWithType);
    }

    public final ub.u g(ub.u uVar, boolean z10) {
        yb.b bVar = this.f69299f;
        return (bVar == null || yb.a.class.isInstance(uVar)) ? uVar : new yb.a(uVar, bVar, yb.c.f94288b, z10);
    }

    public lc.n getAttributes() {
        return this.f69296b.getAttributes();
    }

    public j getConfig() {
        return this.f69296b;
    }

    @Override // ub.a0
    public ub.k getFactory() {
        return this.f69298e;
    }

    public n getInjectableValues() {
        return this.f69303j;
    }

    public cd.s getTypeFactory() {
        return this.f69296b.getTypeFactory();
    }

    public o getValueType() {
        return this.f69300g;
    }

    public final Object h(mc.n nVar, boolean z10) throws IOException {
        if (!nVar.hasMatch()) {
            o(this.f69304k);
            throw null;
        }
        ub.u uVarCreateParserWithMatch = nVar.createParserWithMatch();
        if (z10) {
            uVarCreateParserWithMatch.enable(ub.r.AUTO_CLOSE_SOURCE);
        }
        return nVar.getReader().c(uVarCreateParserWithMatch);
    }

    public final z i(mc.n nVar, boolean z10) throws IOException {
        if (!nVar.hasMatch()) {
            o(this.f69304k);
            throw null;
        }
        ub.u uVarCreateParserWithMatch = nVar.createParserWithMatch();
        if (z10) {
            uVarCreateParserWithMatch.enable(ub.r.AUTO_CLOSE_SOURCE);
        }
        return nVar.getReader().e(uVarCreateParserWithMatch);
    }

    public boolean isEnabled(l lVar) {
        return this.f69296b.isEnabled(lVar);
    }

    public final q j(mc.p pVar) throws r {
        q qVar = this.f69301h;
        if (qVar != null) {
            return qVar;
        }
        o oVar = this.f69300g;
        if (oVar == null) {
            pVar.reportBadDefinition((o) null, "No value type configured for ObjectReader");
        }
        ConcurrentHashMap concurrentHashMap = this.f69305l;
        q qVar2 = (q) concurrentHashMap.get(oVar);
        if (qVar2 != null) {
            return qVar2;
        }
        q qVarFindRootValueDeserializer = pVar.findRootValueDeserializer(oVar);
        if (qVarFindRootValueDeserializer == null) {
            pVar.reportBadDefinition(oVar, "Cannot find a deserializer for type " + oVar);
        }
        concurrentHashMap.put(oVar, qVarFindRootValueDeserializer);
        return qVarFindRootValueDeserializer;
    }

    public final q k(mc.p pVar) throws r {
        o oVarL = l();
        ConcurrentHashMap concurrentHashMap = this.f69305l;
        q qVarFindRootValueDeserializer = (q) concurrentHashMap.get(oVarL);
        if (qVarFindRootValueDeserializer == null) {
            qVarFindRootValueDeserializer = pVar.findRootValueDeserializer(oVarL);
            if (qVarFindRootValueDeserializer == null) {
                pVar.reportBadDefinition(oVarL, "Cannot find a deserializer for type " + oVarL);
            }
            concurrentHashMap.put(oVarL, qVarFindRootValueDeserializer);
        }
        return qVarFindRootValueDeserializer;
    }

    public final o l() {
        o oVar = this.f69306m;
        if (oVar != null) {
            return oVar;
        }
        o oVarConstructType = getTypeFactory().constructType(t.class);
        this.f69306m = oVarConstructType;
        return oVarConstructType;
    }

    public final q m(o oVar) {
        if (oVar == null) {
            return null;
        }
        l lVar = l.EAGER_DESERIALIZER_FETCH;
        j jVar = this.f69296b;
        if (!jVar.isEnabled(lVar)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f69305l;
        q qVarFindRootValueDeserializer = (q) concurrentHashMap.get(oVar);
        if (qVarFindRootValueDeserializer == null) {
            try {
                qVarFindRootValueDeserializer = this.f69297c.createDummyInstance(jVar).findRootValueDeserializer(oVar);
                if (qVarFindRootValueDeserializer != null) {
                    concurrentHashMap.put(oVar, qVarFindRootValueDeserializer);
                }
            } catch (ub.h unused) {
            }
        }
        return qVarFindRootValueDeserializer;
    }

    public final void p(ub.u uVar, mc.p pVar, o oVar) throws IOException {
        Object obj;
        ub.z zVarNextToken = uVar.nextToken();
        if (zVarNextToken != null) {
            Class<?> clsRawClass = dd.i.rawClass(oVar);
            if (clsRawClass == null && (obj = this.f69302i) != null) {
                clsRawClass = obj.getClass();
            }
            pVar.reportTrailingTokens(clsRawClass, uVar, zVarNextToken);
        }
    }

    public final h0 q(j jVar) {
        if (jVar == this.f69296b) {
            return this;
        }
        h0 h0Var = new h0(this, jVar);
        mc.m mVar = this.f69304k;
        return mVar != null ? h0Var.withFormatDetection(mVar.with(jVar)) : h0Var;
    }

    public final mc.p r(ub.u uVar) {
        return this.f69297c.createInstance(this.f69296b, uVar, this.f69303j);
    }

    @Override // ub.a0, ub.n0
    public <T extends ub.o0> T readTree(ub.u uVar) throws IOException {
        a(uVar, "p");
        Object obj = this.f69302i;
        if (obj != null) {
            return (t) b(uVar, obj);
        }
        j jVar = this.f69296b;
        jVar.initialize(uVar);
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == null && (zVarCurrentToken = uVar.nextToken()) == null) {
            return null;
        }
        mc.p pVarR = r(uVar);
        T tNullNode = zVarCurrentToken == ub.z.VALUE_NULL ? jVar.getNodeFactory().nullNode() : (t) pVarR.readRootValue(uVar, l(), k(pVarR), null);
        uVar.clearCurrentToken();
        if (jVar.isEnabled(l.FAIL_ON_TRAILING_TOKENS)) {
            p(uVar, pVarR, l());
        }
        return tNullNode;
    }

    public <T> T readValue(ub.u uVar) throws IOException {
        a(uVar, "p");
        return (T) b(uVar, this.f69302i);
    }

    @Override // ub.a0
    public <T> Iterator<T> readValues(ub.u uVar, Class<T> cls) throws IOException {
        a(uVar, "p");
        return forType((Class<?>) cls).readValues(uVar);
    }

    @Override // ub.a0, ub.n0
    public ub.u treeAsTokens(ub.o0 o0Var) {
        a(o0Var, "n");
        return new yc.z((t) o0Var, withValueToUpdate(null));
    }

    @Override // ub.a0
    public <T> T treeToValue(ub.o0 o0Var, Class<T> cls) throws ub.x {
        a(o0Var, "n");
        try {
            return (T) readValue(treeAsTokens(o0Var), cls);
        } catch (ub.x e10) {
            throw e10;
        } catch (IOException e11) {
            throw r.fromUnexpectedIOE(e11);
        }
    }

    @Override // ub.a0, ub.q0
    public ub.p0 version() {
        return lc.d0.f73093b;
    }

    public h0 with(l lVar) {
        return q(this.f69296b.with(lVar));
    }

    public h0 withAttribute(Object obj, Object obj2) {
        return q((j) this.f69296b.withAttribute(obj, obj2));
    }

    public h0 withAttributes(Map<?, ?> map) {
        return q((j) this.f69296b.withAttributes(map));
    }

    public h0 withFeatures(l... lVarArr) {
        return q(this.f69296b.withFeatures(lVarArr));
    }

    public h0 withFormatDetection(mc.m mVar) {
        return new h0(this, this.f69296b, this.f69300g, this.f69301h, this.f69302i, this.f69303j, mVar);
    }

    public h0 withHandler(mc.q qVar) {
        return q(this.f69296b.withHandler(qVar));
    }

    public h0 withRootName(String str) {
        return q((j) this.f69296b.withRootName(str));
    }

    @Deprecated
    public h0 withType(o oVar) {
        return forType(oVar);
    }

    public h0 withValueToUpdate(Object obj) {
        if (obj == this.f69302i) {
            return this;
        }
        if (obj == null) {
            return new h0(this, this.f69296b, this.f69300g, this.f69301h, null, this.f69303j, this.f69304k);
        }
        o oVarConstructType = this.f69300g;
        if (oVarConstructType == null) {
            oVarConstructType = this.f69296b.constructType(obj.getClass());
        }
        return new h0(this, this.f69296b, oVarConstructType, this.f69301h, obj, this.f69303j, this.f69304k);
    }

    public h0 withView(Class<?> cls) {
        return q(this.f69296b.withView(cls));
    }

    public h0 without(l lVar) {
        return q(this.f69296b.without(lVar));
    }

    public h0 withoutAttribute(Object obj) {
        return q((j) this.f69296b.withoutAttribute(obj));
    }

    public h0 withoutFeatures(l... lVarArr) {
        return q(this.f69296b.withoutFeatures(lVarArr));
    }

    public h0 withoutRootName() {
        return q(this.f69296b.withRootName(n0.f69382g));
    }

    @Override // ub.a0, ub.n0
    public void writeTree(ub.o oVar, ub.o0 o0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // ub.a0
    public void writeValue(ub.o oVar, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    @Override // ub.a0, ub.n0
    public t createArrayNode() {
        return this.f69296b.getNodeFactory().arrayNode();
    }

    @Override // ub.a0, ub.n0
    public t createObjectNode() {
        return this.f69296b.getNodeFactory().objectNode();
    }

    public boolean isEnabled(y yVar) {
        return this.f69296b.isEnabled(yVar);
    }

    @Override // ub.n0
    public t missingNode() {
        return this.f69296b.getNodeFactory().missingNode();
    }

    @Override // ub.n0
    public t nullNode() {
        return this.f69296b.getNodeFactory().nullNode();
    }

    public h0 with(l lVar, l... lVarArr) {
        return q(this.f69296b.with(lVar, lVarArr));
    }

    public h0 withFeatures(lc.o... oVarArr) {
        return q((j) this.f69296b.withFeatures(oVarArr));
    }

    public h0 withFormatDetection(h0... h0VarArr) {
        return withFormatDetection(new mc.m(h0VarArr));
    }

    public h0 withRootName(n0 n0Var) {
        return q(this.f69296b.withRootName(n0Var));
    }

    @Deprecated
    public h0 withType(Class<?> cls) {
        return forType(this.f69296b.constructType(cls));
    }

    public h0 without(l lVar, l... lVarArr) {
        return q(this.f69296b.without(lVar, lVarArr));
    }

    public h0 withoutFeatures(lc.o... oVarArr) {
        return q((j) this.f69296b.withoutFeatures(oVarArr));
    }

    public h0 at(ub.w wVar) {
        a(wVar, "pointer");
        return new h0(this, new yb.b(wVar));
    }

    public ub.u createParser(URL url) throws IOException {
        a(url, "src");
        return this.f69296b.initialize(this.f69298e.createParser(url), null);
    }

    public boolean isEnabled(lc.o oVar) {
        return this.f69296b.isEnabled(oVar);
    }

    @Override // ub.a0
    public <T> T readValue(ub.u uVar, Class<T> cls) throws IOException {
        a(uVar, "p");
        return (T) forType((Class<?>) cls).readValue(uVar);
    }

    @Override // ub.a0
    public <T> Iterator<T> readValues(ub.u uVar, hc.b bVar) throws IOException {
        a(uVar, "p");
        return forType(bVar).readValues(uVar);
    }

    public h0 with(lc.o oVar) {
        return q((j) this.f69296b.with(oVar));
    }

    public h0 withFeatures(ub.r... rVarArr) {
        return q(this.f69296b.withFeatures(rVarArr));
    }

    @Deprecated
    public h0 withType(Type type) {
        return forType(this.f69296b.getTypeFactory().constructType(type));
    }

    public h0 without(lc.o oVar) {
        return q((j) this.f69296b.without(oVar));
    }

    public h0 withoutFeatures(ub.r... rVarArr) {
        return q(this.f69296b.withoutFeatures(rVarArr));
    }

    public boolean isEnabled(ub.r rVar) {
        return this.f69296b.isEnabled(rVar, this.f69298e);
    }

    public h0 with(ub.r rVar) {
        return q(this.f69296b.with(rVar));
    }

    public h0 withFeatures(ub.f... fVarArr) {
        return q(this.f69296b.withFeatures(fVarArr));
    }

    @Deprecated
    public h0 withType(hc.b bVar) {
        this.f69296b.getTypeFactory();
        throw null;
    }

    public h0 without(ub.r rVar) {
        return q(this.f69296b.without(rVar));
    }

    public h0 withoutFeatures(ub.f... fVarArr) {
        return q(this.f69296b.withoutFeatures(fVarArr));
    }

    public ub.u createParser(InputStream inputStream) throws IOException {
        a(inputStream, ScarConstants.IN_SIGNAL_KEY);
        return this.f69296b.initialize(this.f69298e.createParser(inputStream), null);
    }

    public boolean isEnabled(ub.g0 g0Var) {
        return this.f69296b.isEnabled(g0Var.mappedFeature(), this.f69298e);
    }

    @Override // ub.a0
    public <T> T readValue(ub.u uVar, hc.b bVar) throws IOException {
        a(uVar, "p");
        return (T) forType(bVar).readValue(uVar);
    }

    @Override // ub.a0
    public <T> Iterator<T> readValues(ub.u uVar, hc.a aVar) throws IOException {
        a(uVar, "p");
        return readValues(uVar, (o) aVar);
    }

    public <T> T treeToValue(ub.o0 o0Var, o oVar) throws ub.x {
        a(o0Var, "n");
        try {
            return (T) readValue(treeAsTokens(o0Var), oVar);
        } catch (ub.x e10) {
            throw e10;
        } catch (IOException e11) {
            throw r.fromUnexpectedIOE(e11);
        }
    }

    public h0 with(ub.g0 g0Var) {
        return q(this.f69296b.with(g0Var.mappedFeature()));
    }

    public h0 without(ub.g0 g0Var) {
        return q(this.f69296b.without(g0Var.mappedFeature()));
    }

    public h0 forType(Class<?> cls) {
        return forType(this.f69296b.constructType(cls));
    }

    public h0 with(ub.f fVar) {
        return q(this.f69296b.with(fVar));
    }

    public h0 without(ub.f fVar) {
        return q(this.f69296b.without(fVar));
    }

    public ub.u createParser(Reader reader) throws IOException {
        a(reader, "r");
        return this.f69296b.initialize(this.f69298e.createParser(reader), null);
    }

    public h0 forType(Type type) {
        return forType(this.f69296b.getTypeFactory().constructType(type));
    }

    @Override // ub.a0
    public <T> T readValue(ub.u uVar, hc.a aVar) throws IOException {
        a(uVar, "p");
        return (T) forType((o) aVar).readValue(uVar);
    }

    public <T> Iterator<T> readValues(ub.u uVar, o oVar) throws IOException {
        a(uVar, "p");
        return forType(oVar).readValues(uVar);
    }

    public h0 with(j jVar) {
        return q(jVar);
    }

    public h0 forType(hc.b bVar) {
        this.f69296b.getTypeFactory();
        throw null;
    }

    public h0 with(n nVar) {
        return this.f69303j == nVar ? this : new h0(this, this.f69296b, this.f69300g, this.f69301h, this.f69302i, nVar, this.f69304k);
    }

    public ub.u createParser(byte[] bArr) throws IOException {
        a(bArr, "content");
        return this.f69296b.initialize(this.f69298e.createParser(bArr), null);
    }

    public <T> T readValue(ub.u uVar, o oVar) throws IOException {
        a(uVar, "p");
        return (T) forType(oVar).readValue(uVar);
    }

    public <T> z readValues(ub.u uVar) throws IOException {
        a(uVar, "p");
        mc.p pVarR = r(uVar);
        return new z(uVar, pVarR, j(pVarR), false, this.f69302i);
    }

    public h0 with(yc.o oVar) {
        return q(this.f69296b.with(oVar));
    }

    public ub.u createParser(byte[] bArr, int i10, int i11) throws IOException {
        a(bArr, "content");
        return this.f69296b.initialize(this.f69298e.createParser(bArr, i10, i11), null);
    }

    public <T> T readValue(InputStream inputStream) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            return (T) h(mVar.findFormat(inputStream), false);
        }
        return (T) c(g(createParser(inputStream), false));
    }

    public h0 with(ub.k kVar) {
        if (kVar == this.f69298e) {
            return this;
        }
        h0 h0Var = new h0(this, kVar);
        if (kVar.getCodec() == null) {
            kVar.setCodec(h0Var);
        }
        return h0Var;
    }

    public h0(h0 h0Var, j jVar) {
        this.f69296b = jVar;
        this.f69297c = h0Var.f69297c;
        this.f69305l = h0Var.f69305l;
        this.f69298e = h0Var.f69298e;
        this.f69300g = h0Var.f69300g;
        this.f69301h = h0Var.f69301h;
        this.f69302i = h0Var.f69302i;
        this.f69303j = h0Var.f69303j;
        jVar.useRootWrapping();
        this.f69304k = h0Var.f69304k;
        this.f69299f = h0Var.f69299f;
    }

    public ub.u createParser(String str) throws IOException {
        a(str, "content");
        return this.f69296b.initialize(this.f69298e.createParser(str), null);
    }

    public <T> z readValues(InputStream inputStream) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            return i(mVar.findFormat(inputStream), false);
        }
        return e(g(createParser(inputStream), true));
    }

    public t readTree(InputStream inputStream) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            mc.n nVarFindFormat = mVar.findFormat(inputStream);
            if (nVarFindFormat.hasMatch()) {
                ub.u uVarCreateParserWithMatch = nVarFindFormat.createParserWithMatch();
                uVarCreateParserWithMatch.enable(ub.r.AUTO_CLOSE_SOURCE);
                return nVarFindFormat.getReader().d(uVarCreateParserWithMatch);
            }
            o(mVar);
            throw null;
        }
        return d(g(createParser(inputStream), false));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(inputStream);
    }

    public ub.u createParser(char[] cArr) throws IOException {
        a(cArr, "content");
        return this.f69296b.initialize(this.f69298e.createParser(cArr), null);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this.f69304k == null) {
            return (T) c(g(createParser(reader), false));
        }
        n(reader);
        throw null;
    }

    public h0 with(Locale locale) {
        return q((j) this.f69296b.with(locale));
    }

    public <T> z readValues(Reader reader) throws IOException {
        if (this.f69304k == null) {
            ub.u uVarG = g(createParser(reader), true);
            mc.p pVarR = r(uVarG);
            this.f69296b.initialize(uVarG, null);
            uVarG.nextToken();
            return new z(uVarG, pVarR, j(pVarR), true, this.f69302i);
        }
        n(reader);
        throw null;
    }

    public h0 with(TimeZone timeZone) {
        return q((j) this.f69296b.with(timeZone));
    }

    public ub.u createParser(char[] cArr, int i10, int i11) throws IOException {
        a(cArr, "content");
        return this.f69296b.initialize(this.f69298e.createParser(cArr, i10, i11), null);
    }

    public h0 with(ub.b bVar) {
        return q((j) this.f69296b.with(bVar));
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(reader);
    }

    public h0 with(lc.n nVar) {
        return q(this.f69296b.with(nVar));
    }

    public ub.u createParser(DataInput dataInput) throws IOException {
        a(dataInput, "content");
        return this.f69296b.initialize(this.f69298e.createParser(dataInput), null);
    }

    public <T> T readValue(String str) throws ub.x {
        if (this.f69304k == null) {
            try {
                return (T) c(g(createParser(str), false));
            } catch (ub.x e10) {
                throw e10;
            } catch (IOException e11) {
                throw r.fromUnexpectedIOE(e11);
            }
        }
        n(str);
        throw null;
    }

    public h0 with(ub.g gVar) {
        if (gVar == null) {
            return this;
        }
        ub.k kVar = this.f69298e;
        if (kVar.canUseSchema(gVar)) {
            return new h0(this, this.f69296b, this.f69300g, this.f69301h, this.f69302i, this.f69303j, this.f69304k);
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + gVar.getClass().getName() + " for format " + kVar.getFormatName());
    }

    public t readTree(Reader reader) throws IOException {
        if (this.f69304k == null) {
            return d(g(createParser(reader), false));
        }
        n(reader);
        throw null;
    }

    public <T> T readValue(String str, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(str);
    }

    public <T> z readValues(String str) throws IOException {
        if (this.f69304k == null) {
            ub.u uVarG = g(createParser(str), true);
            mc.p pVarR = r(uVarG);
            this.f69296b.initialize(uVarG, null);
            uVarG.nextToken();
            return new z(uVarG, pVarR, j(pVarR), true, this.f69302i);
        }
        n(str);
        throw null;
    }

    public h0(h0 h0Var, j jVar, o oVar, q qVar, Object obj, n nVar, mc.m mVar) {
        this.f69296b = jVar;
        this.f69297c = h0Var.f69297c;
        this.f69305l = h0Var.f69305l;
        this.f69298e = h0Var.f69298e;
        this.f69300g = oVar;
        this.f69301h = qVar;
        this.f69302i = obj;
        this.f69303j = nVar;
        jVar.useRootWrapping();
        this.f69304k = mVar;
        this.f69299f = h0Var.f69299f;
    }

    public t readTree(String str) throws ub.x {
        if (this.f69304k == null) {
            try {
                return d(g(createParser(str), false));
            } catch (ub.x e10) {
                throw e10;
            } catch (IOException e11) {
                throw r.fromUnexpectedIOE(e11);
            }
        }
        n(str);
        throw null;
    }

    public <T> T readValue(byte[] bArr) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            mc.n nVarFindFormat = mVar.findFormat(bArr, 0, bArr.length);
            if (nVarFindFormat.hasMatch()) {
                return (T) nVarFindFormat.getReader().c(nVarFindFormat.createParserWithMatch());
            }
            o(mVar);
            throw null;
        }
        return (T) c(g(createParser(bArr), false));
    }

    public t readTree(byte[] bArr) throws IOException {
        a(bArr, "json");
        if (this.f69304k == null) {
            return d(g(createParser(bArr), false));
        }
        n(bArr);
        throw null;
    }

    public <T> z readValues(byte[] bArr, int i10, int i11) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            return i(mVar.findFormat(bArr, i10, i11), false);
        }
        return e(g(createParser(bArr, i10, i11), true));
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(bArr);
    }

    public t readTree(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f69304k == null) {
            return d(g(createParser(bArr, i10, i11), false));
        }
        n(bArr);
        throw null;
    }

    public <T> T readValue(byte[] bArr, int i10, int i11) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            mc.n nVarFindFormat = mVar.findFormat(bArr, i10, i11);
            if (nVarFindFormat.hasMatch()) {
                return (T) nVarFindFormat.getReader().c(nVarFindFormat.createParserWithMatch());
            }
            o(mVar);
            throw null;
        }
        return (T) c(g(createParser(bArr, i10, i11), false));
    }

    public final <T> z readValues(byte[] bArr) throws IOException {
        a(bArr, "src");
        return readValues(bArr, 0, bArr.length);
    }

    public h0(h0 h0Var, ub.k kVar) {
        this.f69296b = (j) h0Var.f69296b.with(y.SORT_PROPERTIES_ALPHABETICALLY, kVar.requiresPropertyOrdering());
        this.f69297c = h0Var.f69297c;
        this.f69305l = h0Var.f69305l;
        this.f69298e = kVar;
        this.f69300g = h0Var.f69300g;
        this.f69301h = h0Var.f69301h;
        this.f69302i = h0Var.f69302i;
        this.f69303j = h0Var.f69303j;
        this.f69304k = h0Var.f69304k;
        this.f69299f = h0Var.f69299f;
    }

    public t readTree(DataInput dataInput) throws IOException {
        if (this.f69304k == null) {
            return d(g(createParser(dataInput), false));
        }
        n(dataInput);
        throw null;
    }

    public <T> z readValues(File file) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            return i(mVar.findFormat(new FileInputStream(file)), false);
        }
        return e(g(createParser(file), true));
    }

    public <T> T readValue(byte[] bArr, int i10, int i11, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(bArr, i10, i11);
    }

    public <T> T readValue(File file) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            return (T) h(mVar.findFormat(new FileInputStream(file)), true);
        }
        return (T) c(g(createParser(file), false));
    }

    public <T> z readValues(URL url) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            return i(mVar.findFormat(url.openStream()), true);
        }
        return e(g(createParser(url), true));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(file);
    }

    public <T> T readValue(URL url) throws IOException {
        mc.m mVar = this.f69304k;
        if (mVar != null) {
            return (T) h(mVar.findFormat(url.openStream()), true);
        }
        return (T) c(g(createParser(url), false));
    }

    public <T> z readValues(DataInput dataInput) throws IOException {
        if (this.f69304k == null) {
            return e(g(createParser(dataInput), true));
        }
        n(dataInput);
        throw null;
    }

    public h0(h0 h0Var, yb.b bVar) {
        this.f69296b = h0Var.f69296b;
        this.f69297c = h0Var.f69297c;
        this.f69305l = h0Var.f69305l;
        this.f69298e = h0Var.f69298e;
        this.f69300g = h0Var.f69300g;
        this.f69301h = h0Var.f69301h;
        this.f69302i = h0Var.f69302i;
        this.f69303j = h0Var.f69303j;
        this.f69304k = h0Var.f69304k;
        this.f69299f = bVar;
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(url);
    }

    public <T> T readValue(t tVar) throws IOException {
        a(tVar, "content");
        if (this.f69304k == null) {
            return (T) c(g(treeAsTokens(tVar), false));
        }
        n(tVar);
        throw null;
    }

    public <T> T readValue(t tVar, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(tVar);
    }

    public <T> T readValue(DataInput dataInput) throws IOException {
        if (this.f69304k == null) {
            return (T) c(g(createParser(dataInput), false));
        }
        n(dataInput);
        throw null;
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(dataInput);
    }
}
