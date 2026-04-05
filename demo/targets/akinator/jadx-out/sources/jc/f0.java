package jc;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.C3191e4;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URL;
import java.security.AccessController;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import rc.a;
import rc.e1;
import rc.i1;
import rc.j1;
import tb.l1;
import tb.v0;
import tb.w0;
import tb.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f0 extends ub.a0 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    public static final lc.a f69277q = new lc.a(null, new rc.o0(), null, null, cd.s.defaultInstance(), null, dd.j0.f52037o, null, Locale.getDefault(), null, ub.c.getDefaultVariant(), xc.m.f91908b, new rc.k0(), lc.s.defaultInstance());

    /* renamed from: b, reason: collision with root package name */
    public final ub.k f69278b;

    /* renamed from: c, reason: collision with root package name */
    public cd.s f69279c;

    /* renamed from: e, reason: collision with root package name */
    public n f69280e;

    /* renamed from: f, reason: collision with root package name */
    public wc.f f69281f;

    /* renamed from: g, reason: collision with root package name */
    public final lc.j f69282g;

    /* renamed from: h, reason: collision with root package name */
    public final lc.e f69283h;

    /* renamed from: i, reason: collision with root package name */
    public e1 f69284i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f69285j;

    /* renamed from: k, reason: collision with root package name */
    public zc.l f69286k;

    /* renamed from: l, reason: collision with root package name */
    public zc.s f69287l;

    /* renamed from: m, reason: collision with root package name */
    public j f69288m;

    /* renamed from: n, reason: collision with root package name */
    public mc.p f69289n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashSet f69290o;

    /* renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f69291p;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends xc.q implements Serializable {

        /* renamed from: j, reason: collision with root package name */
        public final g0 f69292j;

        /* renamed from: k, reason: collision with root package name */
        public final wc.d f69293k;

        @Deprecated
        public a(g0 g0Var) {
            this(g0Var, xc.m.f91908b);
        }

        public static a construct(g0 g0Var, wc.d dVar) {
            return new a(g0Var, dVar);
        }

        @Override // xc.q, wc.i
        public wc.g buildTypeDeserializer(j jVar, o oVar, Collection<wc.c> collection) {
            if (useForType(oVar)) {
                return super.buildTypeDeserializer(jVar, oVar, collection);
            }
            return null;
        }

        @Override // xc.q, wc.i
        public wc.j buildTypeSerializer(s0 s0Var, o oVar, Collection<wc.c> collection) {
            if (useForType(oVar)) {
                return super.buildTypeSerializer(s0Var, oVar, collection);
            }
            return null;
        }

        @Override // xc.q
        public wc.d subTypeValidator(lc.z zVar) {
            return this.f69293k;
        }

        public boolean useForType(o oVar) {
            if (oVar.isPrimitive()) {
                return false;
            }
            int iOrdinal = this.f69292j.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        while (oVar.isArrayType()) {
                            oVar = oVar.getContentType();
                        }
                        while (oVar.isReferenceType()) {
                            oVar = oVar.getReferencedType();
                        }
                        return (oVar.isFinal() || ub.o0.class.isAssignableFrom(oVar.getRawClass())) ? false : true;
                    }
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            return oVar.isJavaLangObject();
                        }
                        return true;
                    }
                    while (oVar.isArrayType()) {
                        oVar = oVar.getContentType();
                    }
                    while (oVar.isReferenceType()) {
                        oVar = oVar.getReferencedType();
                    }
                    return !(oVar.isFinal() || ub.o0.class.isAssignableFrom(oVar.getRawClass())) || oVar.isEnumType();
                }
                while (oVar.isArrayType()) {
                    oVar = oVar.getContentType();
                }
            }
            while (oVar.isReferenceType()) {
                oVar = oVar.getReferencedType();
            }
            return oVar.isJavaLangObject() || !(oVar.isConcrete() || ub.o0.class.isAssignableFrom(oVar.getRawClass()));
        }

        @Override // xc.q, wc.i
        public /* bridge */ /* synthetic */ wc.i withDefaultImpl(Class cls) {
            return withDefaultImpl((Class<?>) cls);
        }

        public a(g0 g0Var, wc.d dVar) {
            if (g0Var == null) {
                throw new NullPointerException("Can not pass `null` DefaultTyping");
            }
            this.f69292j = g0Var;
            if (dVar == null) {
                throw new NullPointerException("Can not pass `null` PolymorphicTypeValidator");
            }
            this.f69293k = dVar;
        }

        @Override // xc.q, wc.i
        public /* bridge */ /* synthetic */ xc.q withDefaultImpl(Class cls) {
            return withDefaultImpl((Class<?>) cls);
        }

        @Override // xc.q, wc.i
        public a withDefaultImpl(Class<?> cls) {
            if (this.f91921h == cls) {
                return this;
            }
            dd.i.verifyMustOverride(a.class, this, "withDefaultImpl");
            return new a(this, cls);
        }

        public a(a aVar, Class cls) {
            super(aVar, cls);
            this.f69292j = aVar.f69292j;
            this.f69293k = aVar.f69293k;
        }
    }

    public f0(ub.k kVar, f0 f0Var) {
        this.f69291p = new ConcurrentHashMap(64, 0.6f, 2);
        kVar = kVar == null ? f0Var.f69278b.copy() : kVar;
        this.f69278b = kVar;
        kVar.setCodec(this);
        this.f69281f = f0Var.f69281f.copy();
        this.f69279c = f0Var.f69279c;
        this.f69280e = f0Var.f69280e;
        lc.j jVarCopy = f0Var.f69282g.copy();
        this.f69282g = jVarCopy;
        lc.e eVarCopy = f0Var.f69283h.copy();
        this.f69283h = eVarCopy;
        this.f69284i = f0Var.f69284i.copy();
        dd.h0 h0Var = new dd.h0();
        this.f69285j = new s0(f0Var.f69285j, this.f69281f, this.f69284i, h0Var, jVarCopy);
        this.f69288m = new j(f0Var.f69288m, this.f69281f, this.f69284i, h0Var, jVarCopy, eVarCopy);
        this.f69286k = f0Var.f69286k.copy();
        this.f69289n = f0Var.f69289n.copy();
        this.f69287l = f0Var.f69287l;
        LinkedHashSet linkedHashSet = f0Var.f69290o;
        if (linkedHashSet == null) {
            this.f69290o = null;
        } else {
            this.f69290o = new LinkedHashSet(linkedHashSet);
        }
    }

    public static List<c0> findModules() {
        return findModules(null);
    }

    public final void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(a.b.l("argument \"", str, "\" is null"));
        }
    }

    public void acceptJsonFormatVisitor(Class<?> cls, uc.h hVar) throws r {
        acceptJsonFormatVisitor(this.f69279c.constructType(cls), hVar);
    }

    public f0 activateDefaultTyping(wc.d dVar) {
        return activateDefaultTyping(dVar, g0.f69294b);
    }

    public f0 activateDefaultTypingAsProperty(wc.d dVar, g0 g0Var, String str) {
        return setDefaultTyping(a.construct(g0Var, dVar).withSettings(y0.construct(w0.f86794e, v0.f86787b, str, null, false, null)));
    }

    public f0 addHandler(mc.q qVar) {
        this.f69288m = this.f69288m.withHandler(qVar);
        return this;
    }

    public f0 addMixIn(Class<?> cls, Class<?> cls2) {
        this.f69284i.addLocalDefinition(cls, cls2);
        return this;
    }

    @Deprecated
    public final void addMixInAnnotations(Class<?> cls, Class<?> cls2) {
        addMixIn(cls, cls2);
    }

    public final void b(Class cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy()/copyWith(): " + getClass().getName() + " (version: " + version() + ") does not override copy()/copyWith(); it has to");
    }

    public final Object c(Object obj, o oVar) {
        Object objDeserialize;
        zc.l lVarJ = j(getSerializationConfig().without(t0.WRAP_ROOT_VALUE));
        dd.k0 k0VarBufferForValueConversion = lVarJ.bufferForValueConversion(this);
        if (isEnabled(l.USE_BIG_DECIMAL_FOR_FLOATS)) {
            k0VarBufferForValueConversion = k0VarBufferForValueConversion.forceUseOfBigDecimal(true);
        }
        try {
            lVarJ.serializeValue(k0VarBufferForValueConversion, obj);
            ub.u uVarAsParser = k0VarBufferForValueConversion.asParser();
            j deserializationConfig = getDeserializationConfig();
            ub.z zVarE = e(uVarAsParser, oVar);
            if (zVarE == ub.z.VALUE_NULL) {
                mc.p pVarL = l(uVarAsParser, deserializationConfig);
                objDeserialize = d(pVarL, oVar).getNullValue(pVarL);
            } else if (zVarE == ub.z.END_ARRAY || zVarE == ub.z.END_OBJECT) {
                objDeserialize = null;
            } else {
                mc.p pVarL2 = l(uVarAsParser, deserializationConfig);
                objDeserialize = d(pVarL2, oVar).deserialize(uVarAsParser, pVarL2);
            }
            uVarAsParser.close();
            return objDeserialize;
        } catch (IOException e10) {
            throw new IllegalArgumentException(e10.getMessage(), e10);
        }
    }

    @Deprecated
    public boolean canDeserialize(o oVar) {
        return l(null, getDeserializationConfig()).hasValueDeserializerFor(oVar, null);
    }

    @Deprecated
    public boolean canSerialize(Class<?> cls) {
        return j(getSerializationConfig()).hasSerializerFor(cls, null);
    }

    public void clearCaches() {
        this.f69291p.clear();
        this.f69279c.clearCache();
        this.f69289n.flushCachedDeserializers();
        this.f69286k.flushCachedSerializers();
    }

    public f0 clearProblemHandlers() {
        this.f69288m = this.f69288m.withNoProblemHandlers();
        return this;
    }

    public lc.b0 coercionConfigDefaults() {
        return this.f69283h.defaultCoercions();
    }

    public lc.b0 coercionConfigFor(cd.h hVar) {
        return this.f69283h.findOrCreateCoercion(hVar);
    }

    public lc.c0 configOverride(Class<?> cls) {
        return this.f69282g.findOrCreateOverride(cls);
    }

    @Deprecated
    public f0 configure(y yVar, boolean z10) {
        this.f69285j = (s0) (z10 ? this.f69285j.with(yVar) : this.f69285j.without(yVar));
        this.f69288m = (j) (z10 ? this.f69288m.with(yVar) : this.f69288m.without(yVar));
        return this;
    }

    public o constructType(Type type) {
        a(type, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP);
        return this.f69279c.constructType(type);
    }

    public <T> T convertValue(Object obj, Class<T> cls) throws IllegalArgumentException {
        return (T) c(obj, this.f69279c.constructType(cls));
    }

    public f0 copy() {
        b(f0.class);
        return new f0(null, this);
    }

    public f0 copyWith(ub.k kVar) {
        b(f0.class);
        return new f0(kVar, this);
    }

    public ub.o createGenerator(OutputStream outputStream) throws IOException {
        a(outputStream, "out");
        ub.o oVarCreateGenerator = this.f69278b.createGenerator(outputStream, ub.i.f88232f);
        this.f69285j.initialize(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public ub.u createNonBlockingByteArrayParser() throws IOException {
        return this.f69288m.initialize(this.f69278b.createNonBlockingByteArrayParser());
    }

    public ub.u createParser(File file) throws IOException {
        a(file, "src");
        return this.f69288m.initialize(this.f69278b.createParser(file));
    }

    public final q d(mc.p pVar, o oVar) throws r {
        ConcurrentHashMap concurrentHashMap = this.f69291p;
        q qVar = (q) concurrentHashMap.get(oVar);
        if (qVar != null) {
            return qVar;
        }
        q qVarFindRootValueDeserializer = pVar.findRootValueDeserializer(oVar);
        if (qVarFindRootValueDeserializer != null) {
            concurrentHashMap.put(oVar, qVarFindRootValueDeserializer);
            return qVarFindRootValueDeserializer;
        }
        return (q) pVar.reportBadDefinition(oVar, "Cannot find a deserializer for type " + oVar);
    }

    public f0 deactivateDefaultTyping() {
        return setDefaultTyping(null);
    }

    @Deprecated
    public f0 disable(y... yVarArr) {
        this.f69288m = (j) this.f69288m.without(yVarArr);
        this.f69285j = (s0) this.f69285j.without(yVarArr);
        return this;
    }

    @Deprecated
    public f0 disableDefaultTyping() {
        return setDefaultTyping(null);
    }

    public final ub.z e(ub.u uVar, o oVar) throws IOException {
        this.f69288m.initialize(uVar);
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken != null) {
            return zVarCurrentToken;
        }
        ub.z zVarNextToken = uVar.nextToken();
        if (zVarNextToken != null) {
            return zVarNextToken;
        }
        throw pc.f.from(uVar, oVar, "No content to map due to end-of-input");
    }

    @Deprecated
    public f0 enable(y... yVarArr) {
        this.f69288m = (j) this.f69288m.with(yVarArr);
        this.f69285j = (s0) this.f69285j.with(yVarArr);
        return this;
    }

    @Deprecated
    public f0 enableDefaultTyping() {
        return activateDefaultTyping(getPolymorphicTypeValidator());
    }

    @Deprecated
    public f0 enableDefaultTypingAsProperty(g0 g0Var, String str) {
        return activateDefaultTypingAsProperty(getPolymorphicTypeValidator(), g0Var, str);
    }

    public final h0 f(j jVar) {
        return new h0(this, jVar, null, null, null);
    }

    public f0 findAndRegisterModules() {
        return registerModules(findModules());
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        return this.f69284i.findMixInClassFor(cls);
    }

    public final Object g(ub.u uVar, o oVar) throws IOException {
        Object rootValue;
        ub.z zVarNextToken;
        try {
            j deserializationConfig = getDeserializationConfig();
            mc.p pVarL = l(uVar, deserializationConfig);
            ub.z zVarE = e(uVar, oVar);
            if (zVarE == ub.z.VALUE_NULL) {
                rootValue = d(pVarL, oVar).getNullValue(pVarL);
            } else if (zVarE == ub.z.END_ARRAY || zVarE == ub.z.END_OBJECT || zVarE == ub.z.NOT_AVAILABLE) {
                rootValue = null;
            } else {
                rootValue = pVarL.readRootValue(uVar, oVar, d(pVarL, oVar), null);
                pVarL.checkUnresolvedObjectId();
            }
            if (deserializationConfig.isEnabled(l.FAIL_ON_TRAILING_TOKENS) && (zVarNextToken = uVar.nextToken()) != null) {
                pVarL.reportTrailingTokens(dd.i.rawClass(oVar), uVar, zVarNextToken);
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

    @Deprecated
    public vc.a generateJsonSchema(Class<?> cls) throws r {
        return j(getSerializationConfig()).generateJsonSchema(cls);
    }

    public DateFormat getDateFormat() {
        return this.f69285j.getDateFormat();
    }

    public j getDeserializationConfig() {
        return this.f69288m;
    }

    public k getDeserializationContext() {
        return this.f69289n;
    }

    public m getEnumNamingStrategy() {
        this.f69285j.getEnumNamingStrategy();
        return null;
    }

    @Override // ub.a0
    public ub.k getFactory() {
        return this.f69278b;
    }

    public n getInjectableValues() {
        return this.f69280e;
    }

    public yc.o getNodeFactory() {
        return this.f69288m.getNodeFactory();
    }

    public wc.d getPolymorphicTypeValidator() {
        return this.f69288m.f73176c.getPolymorphicTypeValidator();
    }

    public o0 getPropertyNamingStrategy() {
        return this.f69285j.getPropertyNamingStrategy();
    }

    public Set<Object> getRegisteredModuleIds() {
        LinkedHashSet linkedHashSet = this.f69290o;
        return linkedHashSet == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(linkedHashSet);
    }

    public s0 getSerializationConfig() {
        return this.f69285j;
    }

    public zc.s getSerializerFactory() {
        return this.f69287l;
    }

    public u0 getSerializerProvider() {
        return this.f69286k;
    }

    public u0 getSerializerProviderInstance() {
        return j(this.f69285j);
    }

    public wc.f getSubtypeResolver() {
        return this.f69281f;
    }

    public cd.s getTypeFactory() {
        return this.f69279c;
    }

    public j1 getVisibilityChecker() {
        return this.f69285j.getDefaultVisibilityChecker();
    }

    public final t h(ub.u uVar) throws IOException {
        ub.z zVarNextToken;
        try {
            o oVarConstructType = constructType(t.class);
            j deserializationConfig = getDeserializationConfig();
            deserializationConfig.initialize(uVar);
            ub.z zVarCurrentToken = uVar.currentToken();
            if (zVarCurrentToken == null && (zVarCurrentToken = uVar.nextToken()) == null) {
                t tVarMissingNode = deserializationConfig.getNodeFactory().missingNode();
                uVar.close();
                return tVarMissingNode;
            }
            mc.p pVarL = l(uVar, deserializationConfig);
            t tVarNullNode = zVarCurrentToken == ub.z.VALUE_NULL ? deserializationConfig.getNodeFactory().nullNode() : (t) pVarL.readRootValue(uVar, oVarConstructType, d(pVarL, oVarConstructType), null);
            if (deserializationConfig.isEnabled(l.FAIL_ON_TRAILING_TOKENS) && (zVarNextToken = uVar.nextToken()) != null) {
                pVarL.reportTrailingTokens(dd.i.rawClass(oVarConstructType), uVar, zVarNextToken);
            }
            uVar.close();
            return tVarNullNode;
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

    public final Object i(j jVar, ub.u uVar, o oVar) throws IOException {
        ub.z zVarNextToken;
        ub.z zVarE = e(uVar, oVar);
        mc.p pVarL = l(uVar, jVar);
        Object nullValue = zVarE == ub.z.VALUE_NULL ? d(pVarL, oVar).getNullValue(pVarL) : (zVarE == ub.z.END_ARRAY || zVarE == ub.z.END_OBJECT || zVarE == ub.z.NOT_AVAILABLE) ? null : pVarL.readRootValue(uVar, oVar, d(pVarL, oVar), null);
        uVar.clearCurrentToken();
        if (jVar.isEnabled(l.FAIL_ON_TRAILING_TOKENS) && (zVarNextToken = uVar.nextToken()) != null) {
            pVarL.reportTrailingTokens(dd.i.rawClass(oVar), uVar, zVarNextToken);
        }
        return nullValue;
    }

    public boolean isEnabled(y yVar) {
        return this.f69285j.isEnabled(yVar);
    }

    public final zc.l j(s0 s0Var) {
        return this.f69286k.createInstance(s0Var, this.f69287l);
    }

    public final void k(ub.o oVar, Object obj) throws IOException {
        s0 serializationConfig = getSerializationConfig();
        if (!serializationConfig.isEnabled(t0.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                j(serializationConfig).serializeValue(oVar, obj);
                oVar.close();
                return;
            } catch (Exception e10) {
                dd.i.closeOnFailAndThrowAsIOE(oVar, e10);
                return;
            }
        }
        Closeable closeable = (Closeable) obj;
        try {
            j(serializationConfig).serializeValue(oVar, obj);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            closeable.close();
            oVar.close();
        } catch (Exception e12) {
            e = e12;
            closeable = null;
            dd.i.closeOnFailAndThrowAsIOE(oVar, closeable, e);
        }
    }

    public final mc.p l(ub.u uVar, j jVar) {
        return this.f69289n.createInstance(jVar, uVar, this.f69280e);
    }

    public int mixInCount() {
        return this.f69284i.localSize();
    }

    @Override // ub.a0, ub.n0
    public <T extends ub.o0> T readTree(ub.u uVar) throws IOException {
        a(uVar, "p");
        j deserializationConfig = getDeserializationConfig();
        if (uVar.currentToken() == null && uVar.nextToken() == null) {
            return null;
        }
        t tVar = (t) i(deserializationConfig, uVar, constructType(t.class));
        return tVar == null ? getNodeFactory().nullNode() : tVar;
    }

    @Override // ub.a0
    public <T> T readValue(ub.u uVar, Class<T> cls) throws IOException {
        a(uVar, "p");
        return (T) i(getDeserializationConfig(), uVar, this.f69279c.constructType(cls));
    }

    public h0 reader() {
        return f(getDeserializationConfig()).with(this.f69280e);
    }

    public h0 readerFor(o oVar) {
        return new h0(this, getDeserializationConfig(), oVar, null, this.f69280e);
    }

    public h0 readerForArrayOf(Class<?> cls) {
        a(cls, "type");
        return new h0(this, getDeserializationConfig(), this.f69279c.constructArrayType(cls), null, this.f69280e);
    }

    public h0 readerForListOf(Class<?> cls) {
        a(cls, "type");
        return new h0(this, getDeserializationConfig(), this.f69279c.constructCollectionType(List.class, cls), null, this.f69280e);
    }

    public h0 readerForMapOf(Class<?> cls) {
        a(cls, "type");
        return new h0(this, getDeserializationConfig(), this.f69279c.constructMapType(Map.class, String.class, cls), null, this.f69280e);
    }

    public h0 readerForUpdating(Object obj) {
        return new h0(this, getDeserializationConfig(), obj == null ? null : this.f69279c.constructType(obj.getClass()), obj, this.f69280e);
    }

    public h0 readerWithView(Class<?> cls) {
        return f(getDeserializationConfig().withView(cls));
    }

    public f0 registerModule(c0 c0Var) {
        Object typeId;
        a(c0Var, "module");
        if (c0Var.getModuleName() == null) {
            throw new IllegalArgumentException("Module without defined name");
        }
        if (c0Var.version() == null) {
            throw new IllegalArgumentException("Module without defined version");
        }
        Iterator<? extends c0> it = c0Var.getDependencies().iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        if (isEnabled(y.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (typeId = c0Var.getTypeId()) != null) {
            if (this.f69290o == null) {
                this.f69290o = new LinkedHashSet();
            }
            if (!this.f69290o.add(typeId)) {
                return this;
            }
        }
        c0Var.setupModule(new d0(this));
        return this;
    }

    public f0 registerModules(c0... c0VarArr) {
        for (c0 c0Var : c0VarArr) {
            registerModule(c0Var);
        }
        return this;
    }

    public void registerSubtypes(Class<?>... clsArr) {
        getSubtypeResolver().registerSubtypes(clsArr);
    }

    public f0 setAccessorNaming(a.AbstractC0776a abstractC0776a) {
        this.f69285j = (s0) this.f69285j.with(abstractC0776a);
        this.f69288m = (j) this.f69288m.with(abstractC0776a);
        return this;
    }

    public f0 setAnnotationIntrospector(c cVar) {
        this.f69285j = (s0) this.f69285j.with(cVar);
        this.f69288m = (j) this.f69288m.with(cVar);
        return this;
    }

    public f0 setAnnotationIntrospectors(c cVar, c cVar2) {
        this.f69285j = (s0) this.f69285j.with(cVar);
        this.f69288m = (j) this.f69288m.with(cVar2);
        return this;
    }

    public f0 setBase64Variant(ub.b bVar) {
        this.f69285j = (s0) this.f69285j.with(bVar);
        this.f69288m = (j) this.f69288m.with(bVar);
        return this;
    }

    public f0 setCacheProvider(lc.b bVar) {
        a(bVar, "cacheProvider");
        this.f69288m = (j) this.f69288m.with(bVar);
        this.f69285j = (s0) this.f69285j.with(bVar);
        this.f69289n = this.f69289n.withCaches(bVar);
        this.f69286k = this.f69286k.withCaches(bVar);
        this.f69279c = this.f69279c.withCache(((lc.s) bVar).forTypeFactory());
        return this;
    }

    public f0 setConfig(j jVar) {
        a(jVar, DTBMetricsConfiguration.CONFIG_DIR);
        this.f69288m = jVar;
        return this;
    }

    public f0 setConstructorDetector(lc.l lVar) {
        this.f69288m = this.f69288m.with(lVar);
        this.f69285j = this.f69285j.with(lVar);
        return this;
    }

    public f0 setDateFormat(DateFormat dateFormat) {
        this.f69288m = (j) this.f69288m.with(dateFormat);
        this.f69285j = this.f69285j.with(dateFormat);
        return this;
    }

    public f0 setDefaultAttributes(lc.n nVar) {
        this.f69288m = this.f69288m.with(nVar);
        this.f69285j = this.f69285j.with(nVar);
        return this;
    }

    public f0 setDefaultLeniency(Boolean bool) {
        this.f69282g.setDefaultLeniency(bool);
        return this;
    }

    public f0 setDefaultMergeable(Boolean bool) {
        this.f69282g.setDefaultMergeable(bool);
        return this;
    }

    public f0 setDefaultPrettyPrinter(ub.b0 b0Var) {
        this.f69285j = this.f69285j.withDefaultPrettyPrinter(b0Var);
        return this;
    }

    public f0 setDefaultPropertyInclusion(tb.d0 d0Var) {
        this.f69282g.setDefaultInclusion(d0Var);
        return this;
    }

    public f0 setDefaultSetterInfo(tb.q0 q0Var) {
        this.f69282g.setDefaultSetterInfo(q0Var);
        return this;
    }

    public f0 setDefaultTyping(wc.i iVar) {
        this.f69288m = (j) this.f69288m.with(iVar);
        this.f69285j = (s0) this.f69285j.with(iVar);
        return this;
    }

    public f0 setDefaultVisibility(tb.h hVar) {
        this.f69282g.setDefaultVisibility(i1.construct(hVar));
        return this;
    }

    public f0 setEnumNamingStrategy(m mVar) {
        this.f69285j = (s0) this.f69285j.with(mVar);
        this.f69288m = (j) this.f69288m.with(mVar);
        return this;
    }

    public f0 setFilterProvider(zc.m mVar) {
        this.f69285j = this.f69285j.withFilters(mVar);
        return this;
    }

    @Deprecated
    public void setFilters(zc.m mVar) {
        this.f69285j = this.f69285j.withFilters(mVar);
    }

    public Object setHandlerInstantiator(lc.v vVar) {
        this.f69288m = (j) this.f69288m.with(vVar);
        this.f69285j = (s0) this.f69285j.with(vVar);
        return this;
    }

    public f0 setInjectableValues(n nVar) {
        this.f69280e = nVar;
        return this;
    }

    public f0 setLocale(Locale locale) {
        this.f69288m = (j) this.f69288m.with(locale);
        this.f69285j = (s0) this.f69285j.with(locale);
        return this;
    }

    @Deprecated
    public void setMixInAnnotations(Map<Class<?>, Class<?>> map) {
        setMixIns(map);
    }

    public f0 setMixInResolver(rc.e0 e0Var) {
        e1 e1VarWithOverrides = this.f69284i.withOverrides(e0Var);
        if (e1VarWithOverrides != this.f69284i) {
            this.f69284i = e1VarWithOverrides;
            this.f69288m = new j(this.f69288m, e1VarWithOverrides);
            this.f69285j = new s0(this.f69285j, e1VarWithOverrides);
        }
        return this;
    }

    public f0 setMixIns(Map<Class<?>, Class<?>> map) {
        this.f69284i.setLocalDefinitions(map);
        return this;
    }

    public f0 setNodeFactory(yc.o oVar) {
        this.f69288m = this.f69288m.with(oVar);
        return this;
    }

    public f0 setPolymorphicTypeValidator(wc.d dVar) {
        lc.a aVarWith = this.f69288m.f73176c.with(dVar);
        j jVar = this.f69288m;
        if (jVar.f73176c != aVarWith) {
            jVar = new j(jVar, aVarWith);
        }
        this.f69288m = jVar;
        return this;
    }

    @Deprecated
    public f0 setPropertyInclusion(tb.d0 d0Var) {
        return setDefaultPropertyInclusion(d0Var);
    }

    public f0 setPropertyNamingStrategy(o0 o0Var) {
        this.f69285j = (s0) this.f69285j.with(o0Var);
        this.f69288m = (j) this.f69288m.with(o0Var);
        return this;
    }

    public f0 setSerializationInclusion(tb.c0 c0Var) {
        setPropertyInclusion(tb.d0.construct(c0Var, c0Var));
        return this;
    }

    public f0 setSerializerFactory(zc.s sVar) {
        this.f69287l = sVar;
        return this;
    }

    public f0 setSerializerProvider(zc.l lVar) {
        this.f69286k = lVar;
        return this;
    }

    public f0 setSubtypeResolver(wc.f fVar) {
        this.f69281f = fVar;
        this.f69288m = this.f69288m.with(fVar);
        this.f69285j = this.f69285j.with(fVar);
        return this;
    }

    public f0 setTimeZone(TimeZone timeZone) {
        this.f69288m = (j) this.f69288m.with(timeZone);
        this.f69285j = (s0) this.f69285j.with(timeZone);
        return this;
    }

    public f0 setTypeFactory(cd.s sVar) {
        this.f69279c = sVar;
        this.f69288m = (j) this.f69288m.with(sVar);
        this.f69285j = (s0) this.f69285j.with(sVar);
        return this;
    }

    public f0 setVisibility(j1 j1Var) {
        this.f69282g.setDefaultVisibility(j1Var);
        return this;
    }

    @Deprecated
    public void setVisibilityChecker(j1 j1Var) {
        setVisibility(j1Var);
    }

    public ub.k tokenStreamFactory() {
        return this.f69278b;
    }

    @Override // ub.a0, ub.n0
    public ub.u treeAsTokens(ub.o0 o0Var) {
        a(o0Var, "n");
        return new yc.z((t) o0Var, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ub.a0
    public <T> T treeToValue(ub.o0 o0Var, Class<T> cls) throws ub.x, IllegalArgumentException {
        T t10;
        if (o0Var == 0) {
            return null;
        }
        try {
            return (ub.o0.class.isAssignableFrom(cls) && cls.isAssignableFrom(o0Var.getClass())) ? o0Var : (o0Var.asToken() == ub.z.VALUE_EMBEDDED_OBJECT && (o0Var instanceof yc.w) && ((t10 = (T) ((yc.w) o0Var).getPojo()) == null || cls.isInstance(t10))) ? t10 : (T) readValue(treeAsTokens(o0Var), cls);
        } catch (ub.x e10) {
            throw e10;
        } catch (IOException e11) {
            throw new IllegalArgumentException(e11.getMessage(), e11);
        }
    }

    public <T> T updateValue(T t10, Object obj) throws r {
        if (t10 == null || obj == null) {
            return t10;
        }
        zc.l lVarJ = j(getSerializationConfig().without(t0.WRAP_ROOT_VALUE));
        dd.k0 k0VarBufferForValueConversion = lVarJ.bufferForValueConversion(this);
        if (isEnabled(l.USE_BIG_DECIMAL_FOR_FLOATS)) {
            k0VarBufferForValueConversion = k0VarBufferForValueConversion.forceUseOfBigDecimal(true);
        }
        try {
            lVarJ.serializeValue(k0VarBufferForValueConversion, obj);
            ub.u uVarAsParser = k0VarBufferForValueConversion.asParser();
            T t11 = (T) readerForUpdating(t10).readValue(uVarAsParser);
            uVarAsParser.close();
            return t11;
        } catch (IOException e10) {
            if (e10 instanceof r) {
                throw ((r) e10);
            }
            throw r.fromUnexpectedIOE(e10);
        }
    }

    public <T extends t> T valueToTree(Object obj) throws IllegalArgumentException {
        if (obj == null) {
            return getNodeFactory().nullNode();
        }
        zc.l lVarJ = j(getSerializationConfig());
        dd.k0 k0VarBufferForValueConversion = lVarJ.bufferForValueConversion(this);
        if (isEnabled(l.USE_BIG_DECIMAL_FOR_FLOATS)) {
            k0VarBufferForValueConversion = k0VarBufferForValueConversion.forceUseOfBigDecimal(true);
        }
        try {
            lVarJ.serializeValue(k0VarBufferForValueConversion, obj);
            ub.u uVarAsParser = k0VarBufferForValueConversion.asParser();
            try {
                T t10 = (T) readTree(uVarAsParser);
                if (uVarAsParser == null) {
                    return t10;
                }
                uVarAsParser.close();
                return t10;
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalArgumentException(e10.getMessage(), e10);
        }
    }

    @Override // ub.a0, ub.q0
    public ub.p0 version() {
        return lc.d0.f73093b;
    }

    @Override // ub.a0, ub.n0
    public void writeTree(ub.o oVar, ub.o0 o0Var) throws IOException {
        a(oVar, "g");
        s0 serializationConfig = getSerializationConfig();
        j(serializationConfig).serializeValue(oVar, o0Var);
        if (serializationConfig.isEnabled(t0.FLUSH_AFTER_WRITE_VALUE)) {
            oVar.flush();
        }
    }

    @Override // ub.a0
    public void writeValue(ub.o oVar, Object obj) throws IOException {
        a(oVar, "g");
        s0 serializationConfig = getSerializationConfig();
        if (serializationConfig.isEnabled(t0.INDENT_OUTPUT) && oVar.getPrettyPrinter() == null) {
            oVar.setPrettyPrinter(serializationConfig.constructDefaultPrettyPrinter());
        }
        if (!serializationConfig.isEnabled(t0.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            j(serializationConfig).serializeValue(oVar, obj);
            if (serializationConfig.isEnabled(t0.FLUSH_AFTER_WRITE_VALUE)) {
                oVar.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            j(serializationConfig).serializeValue(oVar, obj);
            if (serializationConfig.isEnabled(t0.FLUSH_AFTER_WRITE_VALUE)) {
                oVar.flush();
            }
            closeable.close();
        } catch (Exception e10) {
            dd.i.closeOnFailAndThrowAsIOE(null, closeable, e10);
        }
    }

    public byte[] writeValueAsBytes(Object obj) throws ub.x {
        ic.b bVar_getBufferRecycler = this.f69278b._getBufferRecycler();
        try {
            try {
                try {
                    ic.d dVar = new ic.d(bVar_getBufferRecycler);
                    try {
                        k(createGenerator(dVar, ub.i.f88232f), obj);
                        byte[] byteArray = dVar.toByteArray();
                        dVar.release();
                        dVar.close();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            try {
                                dVar.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                } catch (IOException e10) {
                    throw r.fromUnexpectedIOE(e10);
                }
            } finally {
                bVar_getBufferRecycler.releaseToPool();
            }
        } catch (ub.x e11) {
            throw e11;
        }
    }

    public String writeValueAsString(Object obj) throws ub.x {
        ic.b bVar_getBufferRecycler = this.f69278b._getBufferRecycler();
        try {
            try {
                cc.p pVar = new cc.p(bVar_getBufferRecycler);
                try {
                    k(createGenerator(pVar), obj);
                    String andClear = pVar.getAndClear();
                    pVar.close();
                    return andClear;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        try {
                            pVar.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (ub.x e10) {
                throw e10;
            } catch (IOException e11) {
                throw r.fromUnexpectedIOE(e11);
            }
        } finally {
            bVar_getBufferRecycler.releaseToPool();
        }
    }

    public k0 writer() {
        return new k0(this, getSerializationConfig());
    }

    public k0 writerFor(Class<?> cls) {
        return new k0(this, getSerializationConfig(), cls == null ? null : this.f69279c.constructType(cls), (ub.b0) null);
    }

    public k0 writerWithDefaultPrettyPrinter() {
        s0 serializationConfig = getSerializationConfig();
        return new k0(this, serializationConfig, (o) null, serializationConfig.getDefaultPrettyPrinter());
    }

    @Deprecated
    public k0 writerWithType(Class<?> cls) {
        return new k0(this, getSerializationConfig(), cls == null ? null : this.f69279c.constructType(cls), (ub.b0) null);
    }

    public k0 writerWithView(Class<?> cls) {
        return new k0(this, getSerializationConfig().withView(cls));
    }

    public static List<c0> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = (System.getSecurityManager() == null ? classLoader == null ? ServiceLoader.load(c0.class) : ServiceLoader.load(c0.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new e0(classLoader))).iterator();
        while (it.hasNext()) {
            arrayList.add((c0) it.next());
        }
        return arrayList;
    }

    public void acceptJsonFormatVisitor(o oVar, uc.h hVar) throws r {
        if (oVar == null) {
            throw new IllegalArgumentException("type must be provided");
        }
        j(getSerializationConfig()).acceptJsonFormatVisitor(oVar, hVar);
    }

    public f0 activateDefaultTyping(wc.d dVar, g0 g0Var) {
        return activateDefaultTyping(dVar, g0Var, v0.f86789e);
    }

    @Deprecated
    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        return j(getSerializationConfig()).hasSerializerFor(cls, atomicReference);
    }

    public lc.b0 coercionConfigFor(Class<?> cls) {
        return this.f69283h.findOrCreateCoercion(cls);
    }

    public <T> T convertValue(Object obj, hc.b bVar) throws IllegalArgumentException {
        return (T) c(obj, this.f69279c.constructType(bVar));
    }

    @Override // ub.a0, ub.n0
    public yc.a createArrayNode() {
        return this.f69288m.getNodeFactory().arrayNode();
    }

    @Override // ub.a0, ub.n0
    public yc.v createObjectNode() {
        return this.f69288m.getNodeFactory().objectNode();
    }

    @Deprecated
    public f0 enableDefaultTyping(g0 g0Var) {
        return enableDefaultTyping(g0Var, v0.f86789e);
    }

    public boolean isEnabled(t0 t0Var) {
        return this.f69285j.isEnabled(t0Var);
    }

    @Override // ub.n0
    public t missingNode() {
        return this.f69288m.getNodeFactory().missingNode();
    }

    @Override // ub.n0
    public t nullNode() {
        return this.f69288m.getNodeFactory().nullNode();
    }

    public h0 reader(l lVar) {
        return f(getDeserializationConfig().with(lVar));
    }

    public void registerSubtypes(wc.c... cVarArr) {
        getSubtypeResolver().registerSubtypes(cVarArr);
    }

    public f0 setDefaultPropertyInclusion(tb.c0 c0Var) {
        this.f69282g.setDefaultInclusion(tb.d0.construct(c0Var, c0Var));
        return this;
    }

    public f0 setVisibility(l1 l1Var, tb.i iVar) {
        lc.j jVar = this.f69282g;
        jVar.setDefaultVisibility(jVar.getDefaultVisibility().withVisibility(l1Var, iVar));
        return this;
    }

    public f0 activateDefaultTyping(wc.d dVar, g0 g0Var, v0 v0Var) {
        if (v0Var != v0.f86790f) {
            return setDefaultTyping(a.construct(g0Var, dVar).withSettings(y0.construct(w0.f86794e, v0Var, null, null, false, null)));
        }
        throw new IllegalArgumentException("Cannot use includeAs of " + v0Var);
    }

    public o constructType(hc.b bVar) {
        a(bVar, "typeRef");
        throw null;
    }

    public <T> T convertValue(Object obj, o oVar) throws IllegalArgumentException {
        return (T) c(obj, oVar);
    }

    public ub.u createParser(URL url) throws IOException {
        a(url, "src");
        return this.f69288m.initialize(this.f69278b.createParser(url));
    }

    public f0 disable(t0 t0Var) {
        this.f69285j = this.f69285j.without(t0Var);
        return this;
    }

    public f0 enable(t0 t0Var) {
        this.f69285j = this.f69285j.with(t0Var);
        return this;
    }

    @Deprecated
    public f0 enableDefaultTyping(g0 g0Var, v0 v0Var) {
        return activateDefaultTyping(getPolymorphicTypeValidator(), g0Var, v0Var);
    }

    public boolean isEnabled(l lVar) {
        return this.f69288m.isEnabled(lVar);
    }

    @Override // ub.a0
    public <T> T readValue(ub.u uVar, hc.b bVar) throws IOException {
        a(uVar, "p");
        return (T) i(getDeserializationConfig(), uVar, this.f69279c.constructType(bVar));
    }

    public h0 reader(l lVar, l... lVarArr) {
        return f(getDeserializationConfig().with(lVar, lVarArr));
    }

    public h0 readerFor(Class<?> cls) {
        return new h0(this, getDeserializationConfig(), cls == null ? null : this.f69279c.constructType(cls), null, this.f69280e);
    }

    public f0 registerModules(Iterable<? extends c0> iterable) {
        a(iterable, "modules");
        Iterator<? extends c0> it = iterable.iterator();
        while (it.hasNext()) {
            registerModule(it.next());
        }
        return this;
    }

    public void registerSubtypes(Collection<Class<?>> collection) {
        getSubtypeResolver().registerSubtypes(collection);
    }

    public f0 setConfig(s0 s0Var) {
        a(s0Var, DTBMetricsConfiguration.CONFIG_DIR);
        this.f69285j = s0Var;
        return this;
    }

    public k0 writer(t0 t0Var) {
        return new k0(this, getSerializationConfig().with(t0Var));
    }

    @Deprecated
    public boolean canDeserialize(o oVar, AtomicReference<Throwable> atomicReference) {
        return l(null, getDeserializationConfig()).hasValueDeserializerFor(oVar, atomicReference);
    }

    public ub.o createGenerator(OutputStream outputStream, ub.i iVar) throws IOException {
        a(outputStream, "out");
        ub.o oVarCreateGenerator = this.f69278b.createGenerator(outputStream, iVar);
        this.f69285j.initialize(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public f0 disable(t0 t0Var, t0... t0VarArr) {
        this.f69285j = this.f69285j.without(t0Var, t0VarArr);
        return this;
    }

    public f0 enable(t0 t0Var, t0... t0VarArr) {
        this.f69285j = this.f69285j.with(t0Var, t0VarArr);
        return this;
    }

    public boolean isEnabled(ub.r rVar) {
        return this.f69288m.isEnabled(rVar, this.f69278b);
    }

    @Override // ub.a0
    public <T> z readValues(ub.u uVar, hc.a aVar) throws IOException {
        return readValues(uVar, (o) aVar);
    }

    public h0 reader(yc.o oVar) {
        a(oVar, "nodeFactory");
        return f(getDeserializationConfig()).with(oVar);
    }

    public k0 writerFor(hc.b bVar) {
        return new k0(this, getSerializationConfig(), (o) null, (ub.b0) null);
    }

    @Deprecated
    public k0 writerWithType(hc.b bVar) {
        return new k0(this, getSerializationConfig(), (o) null, (ub.b0) null);
    }

    public f0 configure(t0 t0Var, boolean z10) {
        this.f69285j = z10 ? this.f69285j.with(t0Var) : this.f69285j.without(t0Var);
        return this;
    }

    public ub.u createParser(InputStream inputStream) throws IOException {
        a(inputStream, ScarConstants.IN_SIGNAL_KEY);
        return this.f69288m.initialize(this.f69278b.createParser(inputStream));
    }

    public f0 disable(l lVar) {
        this.f69288m = this.f69288m.without(lVar);
        return this;
    }

    public f0 enable(l lVar) {
        this.f69288m = this.f69288m.with(lVar);
        return this;
    }

    public boolean isEnabled(ub.n nVar) {
        return this.f69285j.isEnabled(nVar, this.f69278b);
    }

    @Override // ub.a0
    public final <T> T readValue(ub.u uVar, hc.a aVar) throws IOException {
        a(uVar, "p");
        return (T) i(getDeserializationConfig(), uVar, (o) aVar);
    }

    public <T> z readValues(ub.u uVar, o oVar) throws IOException {
        a(uVar, "p");
        mc.p pVarL = l(uVar, getDeserializationConfig());
        return new z(uVar, pVarL, d(pVarL, oVar), false, null);
    }

    public k0 writer(t0 t0Var, t0... t0VarArr) {
        return new k0(this, getSerializationConfig().with(t0Var, t0VarArr));
    }

    public f0 disable(l lVar, l... lVarArr) {
        this.f69288m = this.f69288m.without(lVar, lVarArr);
        return this;
    }

    public f0 enable(l lVar, l... lVarArr) {
        this.f69288m = this.f69288m.with(lVar, lVarArr);
        return this;
    }

    public boolean isEnabled(ub.j jVar) {
        return this.f69278b.isEnabled(jVar);
    }

    public h0 reader(ub.g gVar) {
        return new h0(this, getDeserializationConfig(), null, null, this.f69280e);
    }

    public h0 readerFor(hc.b bVar) {
        a(bVar, "type");
        throw null;
    }

    public void writeTree(ub.o oVar, t tVar) throws IOException {
        a(oVar, "g");
        s0 serializationConfig = getSerializationConfig();
        j(serializationConfig).serializeValue(oVar, tVar);
        if (serializationConfig.isEnabled(t0.FLUSH_AFTER_WRITE_VALUE)) {
            oVar.flush();
        }
    }

    public k0 writerFor(o oVar) {
        return new k0(this, getSerializationConfig(), oVar, (ub.b0) null);
    }

    @Deprecated
    public k0 writerWithType(o oVar) {
        return new k0(this, getSerializationConfig(), oVar, (ub.b0) null);
    }

    public f0 configure(l lVar, boolean z10) {
        this.f69288m = z10 ? this.f69288m.with(lVar) : this.f69288m.without(lVar);
        return this;
    }

    public ub.o createGenerator(Writer writer) throws IOException {
        a(writer, "w");
        ub.o oVarCreateGenerator = this.f69278b.createGenerator(writer);
        this.f69285j.initialize(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public ub.u createParser(Reader reader) throws IOException {
        a(reader, "r");
        return this.f69288m.initialize(this.f69278b.createParser(reader));
    }

    public f0 disable(ub.r... rVarArr) {
        for (ub.r rVar : rVarArr) {
            this.f69278b.disable(rVar);
        }
        return this;
    }

    public f0 enable(ub.r... rVarArr) {
        for (ub.r rVar : rVarArr) {
            this.f69278b.enable(rVar);
        }
        return this;
    }

    public boolean isEnabled(ub.g0 g0Var) {
        return isEnabled(g0Var.mappedFeature());
    }

    public t readTree(InputStream inputStream) throws IOException {
        a(inputStream, ScarConstants.IN_SIGNAL_KEY);
        return h(this.f69278b.createParser(inputStream));
    }

    public <T> T readValue(ub.u uVar, o oVar) throws IOException {
        a(uVar, "p");
        return (T) i(getDeserializationConfig(), uVar, oVar);
    }

    public k0 writer(DateFormat dateFormat) {
        return new k0(this, getSerializationConfig().with(dateFormat));
    }

    public boolean isEnabled(ub.k0 k0Var) {
        return isEnabled(k0Var.mappedFeature());
    }

    public h0 reader(n nVar) {
        return new h0(this, getDeserializationConfig(), null, null, nVar);
    }

    public f0 configure(lc.o oVar, boolean z10) {
        if (z10) {
            this.f69288m = (j) this.f69288m.with(oVar);
            this.f69285j = (s0) this.f69285j.with(oVar);
            return this;
        }
        this.f69288m = (j) this.f69288m.without(oVar);
        this.f69285j = (s0) this.f69285j.without(oVar);
        return this;
    }

    public ub.u createParser(byte[] bArr) throws IOException {
        a(bArr, "content");
        return this.f69288m.initialize(this.f69278b.createParser(bArr));
    }

    public f0 disable(ub.n... nVarArr) {
        for (ub.n nVar : nVarArr) {
            this.f69278b.disable(nVar);
        }
        return this;
    }

    public f0 enable(ub.n... nVarArr) {
        for (ub.n nVar : nVarArr) {
            this.f69278b.enable(nVar);
        }
        return this;
    }

    public t readTree(Reader reader) throws IOException {
        a(reader, "r");
        return h(this.f69278b.createParser(reader));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        a(file, "src");
        return (T) g(this.f69278b.createParser(file), this.f69279c.constructType(cls));
    }

    public k0 writer(ub.b0 b0Var) {
        if (b0Var == null) {
            b0Var = k0.f69338i;
        }
        return new k0(this, getSerializationConfig(), (o) null, b0Var);
    }

    public ub.o createGenerator(File file, ub.i iVar) throws IOException {
        a(file, "outputFile");
        ub.o oVarCreateGenerator = this.f69278b.createGenerator(file, iVar);
        this.f69285j.initialize(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    @Override // ub.a0
    public <T> z readValues(ub.u uVar, Class<T> cls) throws IOException {
        return readValues(uVar, this.f69279c.constructType(cls));
    }

    public h0 reader(ub.b bVar) {
        return f((j) getDeserializationConfig().with(bVar));
    }

    public ub.u createParser(byte[] bArr, int i10, int i11) throws IOException {
        a(bArr, "content");
        return this.f69288m.initialize(this.f69278b.createParser(bArr, i10, i11));
    }

    public t readTree(String str) throws ub.x {
        a(str, "content");
        try {
            return h(this.f69278b.createParser(str));
        } catch (ub.x e10) {
            throw e10;
        } catch (IOException e11) {
            throw r.fromUnexpectedIOE(e11);
        }
    }

    public <T> T readValue(File file, hc.b bVar) throws IOException {
        a(file, "src");
        return (T) g(this.f69278b.createParser(file), this.f69279c.constructType(bVar));
    }

    @Override // ub.a0
    public <T> z readValues(ub.u uVar, hc.b bVar) throws IOException {
        return readValues(uVar, this.f69279c.constructType(bVar));
    }

    public h0 reader(lc.n nVar) {
        return f(getDeserializationConfig().with(nVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T treeToValue(ub.o0 o0Var, o oVar) throws ub.x, IllegalArgumentException {
        T t10;
        if (o0Var == 0) {
            return null;
        }
        try {
            return (oVar.isTypeOrSubTypeOf(ub.o0.class) && oVar.isTypeOrSuperTypeOf(o0Var.getClass())) ? o0Var : (o0Var.asToken() == ub.z.VALUE_EMBEDDED_OBJECT && (o0Var instanceof yc.w) && ((t10 = (T) ((yc.w) o0Var).getPojo()) == null || oVar.isTypeOrSuperTypeOf(t10.getClass()))) ? t10 : (T) readValue(treeAsTokens(o0Var), oVar);
        } catch (ub.x e10) {
            throw e10;
        } catch (IOException e11) {
            throw new IllegalArgumentException(e11.getMessage(), e11);
        }
    }

    @Deprecated
    public h0 reader(o oVar) {
        return new h0(this, getDeserializationConfig(), oVar, null, this.f69280e);
    }

    public k0 writer(zc.m mVar) {
        return new k0(this, getSerializationConfig().withFilters(mVar));
    }

    public f0 configure(ub.r rVar, boolean z10) {
        this.f69278b.configure(rVar, z10);
        return this;
    }

    public ub.o createGenerator(DataOutput dataOutput) throws IOException {
        a(dataOutput, "out");
        ub.o oVarCreateGenerator = this.f69278b.createGenerator(dataOutput);
        this.f69285j.initialize(oVarCreateGenerator);
        return oVarCreateGenerator;
    }

    public ub.u createParser(String str) throws IOException {
        a(str, "content");
        return this.f69288m.initialize(this.f69278b.createParser(str));
    }

    public <T> T readValue(File file, o oVar) throws IOException {
        a(file, "src");
        return (T) g(this.f69278b.createParser(file), oVar);
    }

    public f0 configure(ub.n nVar, boolean z10) {
        this.f69278b.configure(nVar, z10);
        return this;
    }

    @Deprecated
    public h0 reader(Class<?> cls) {
        return new h0(this, getDeserializationConfig(), this.f69279c.constructType(cls), null, this.f69280e);
    }

    public k0 writer(ub.g gVar) {
        return new k0(this, getSerializationConfig(), 0);
    }

    public ub.u createParser(char[] cArr) throws IOException {
        a(cArr, "content");
        return this.f69288m.initialize(this.f69278b.createParser(cArr));
    }

    public t readTree(byte[] bArr) throws IOException {
        a(bArr, "content");
        return h(this.f69278b.createParser(bArr));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        a(url, "src");
        return (T) g(this.f69278b.createParser(url), this.f69279c.constructType(cls));
    }

    @Deprecated
    public h0 reader(hc.b bVar) {
        return new h0(this, getDeserializationConfig(), this.f69279c.constructType(bVar), null, this.f69280e);
    }

    public void writeValue(File file, Object obj) throws IOException {
        k(createGenerator(file, ub.i.f88232f), obj);
    }

    public k0 writer(ub.b bVar) {
        return new k0(this, (s0) getSerializationConfig().with(bVar));
    }

    public ub.u createParser(char[] cArr, int i10, int i11) throws IOException {
        a(cArr, "content");
        return this.f69288m.initialize(this.f69278b.createParser(cArr, i10, i11));
    }

    public t readTree(byte[] bArr, int i10, int i11) throws IOException {
        a(bArr, "content");
        return h(this.f69278b.createParser(bArr, i10, i11));
    }

    public <T> T readValue(URL url, hc.b bVar) throws IOException {
        a(url, "src");
        return (T) g(this.f69278b.createParser(url), this.f69279c.constructType(bVar));
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        k(createGenerator(outputStream, ub.i.f88232f), obj);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        k(createGenerator(dataOutput), obj);
    }

    public k0 writer(cc.e eVar) {
        return new k0(this, getSerializationConfig()).with(eVar);
    }

    public ub.u createParser(DataInput dataInput) throws IOException {
        a(dataInput, "content");
        return this.f69288m.initialize(this.f69278b.createParser(dataInput));
    }

    public t readTree(File file) throws IOException {
        a(file, C3191e4.h.f36473b);
        return h(this.f69278b.createParser(file));
    }

    public <T> T readValue(URL url, o oVar) throws IOException {
        a(url, "src");
        return (T) g(this.f69278b.createParser(url), oVar);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        k(createGenerator(writer), obj);
    }

    public f0(ub.k kVar, zc.l lVar, mc.p pVar) {
        this.f69291p = new ConcurrentHashMap(64, 0.6f, 2);
        if (kVar == null) {
            this.f69278b = new a0(this);
        } else {
            this.f69278b = kVar;
            if (kVar.getCodec() == null) {
                kVar.setCodec(this);
            }
        }
        this.f69281f = new xc.p();
        dd.h0 h0Var = new dd.h0();
        this.f69279c = cd.s.defaultInstance();
        e1 e1Var = new e1(null);
        this.f69284i = e1Var;
        lc.a aVarWithClassIntrospector = f69277q.withClassIntrospector(new rc.c0());
        lc.j jVar = new lc.j();
        this.f69282g = jVar;
        lc.e eVar = new lc.e();
        this.f69283h = eVar;
        this.f69285j = new s0(aVarWithClassIntrospector, this.f69281f, e1Var, h0Var, jVar, lc.q.defaultFeatures());
        this.f69288m = new j(aVarWithClassIntrospector, this.f69281f, e1Var, h0Var, jVar, eVar, lc.q.defaultFeatures());
        boolean zRequiresPropertyOrdering = this.f69278b.requiresPropertyOrdering();
        s0 s0Var = this.f69285j;
        y yVar = y.SORT_PROPERTIES_ALPHABETICALLY;
        if (s0Var.isEnabled(yVar) ^ zRequiresPropertyOrdering) {
            configure(yVar, zRequiresPropertyOrdering);
        }
        this.f69286k = lVar == null ? new zc.k() : lVar;
        this.f69289n = pVar == null ? new mc.o(mc.h.f74198e) : pVar;
        this.f69287l = zc.g.f97785f;
    }

    public t readTree(URL url) throws IOException {
        a(url, "source");
        return h(this.f69278b.createParser(url));
    }

    public <T> T readValue(String str, Class<T> cls) throws ub.x {
        a(str, "content");
        return (T) readValue(str, this.f69279c.constructType(cls));
    }

    public <T> T treeToValue(ub.o0 o0Var, hc.b bVar) throws ub.x, IllegalArgumentException {
        return (T) treeToValue(o0Var, constructType(bVar));
    }

    public k0 writer(lc.n nVar) {
        return new k0(this, getSerializationConfig().with(nVar));
    }

    public <T> T readValue(String str, hc.b bVar) throws ub.x {
        a(str, "content");
        return (T) readValue(str, this.f69279c.constructType(bVar));
    }

    public <T> T readValue(String str, o oVar) throws ub.x {
        a(str, "content");
        try {
            return (T) g(this.f69278b.createParser(str), oVar);
        } catch (ub.x e10) {
            throw e10;
        } catch (IOException e11) {
            throw r.fromUnexpectedIOE(e11);
        }
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        a(reader, "src");
        return (T) g(this.f69278b.createParser(reader), this.f69279c.constructType(cls));
    }

    public <T> T readValue(Reader reader, hc.b bVar) throws IOException {
        a(reader, "src");
        return (T) g(this.f69278b.createParser(reader), this.f69279c.constructType(bVar));
    }

    public <T> T readValue(Reader reader, o oVar) throws IOException {
        a(reader, "src");
        return (T) g(this.f69278b.createParser(reader), oVar);
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        a(inputStream, "src");
        return (T) g(this.f69278b.createParser(inputStream), this.f69279c.constructType(cls));
    }

    public <T> T readValue(InputStream inputStream, hc.b bVar) throws IOException {
        a(inputStream, "src");
        return (T) g(this.f69278b.createParser(inputStream), this.f69279c.constructType(bVar));
    }

    public <T> T readValue(InputStream inputStream, o oVar) throws IOException {
        a(inputStream, "src");
        return (T) g(this.f69278b.createParser(inputStream), oVar);
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        a(bArr, "src");
        return (T) g(this.f69278b.createParser(bArr), this.f69279c.constructType(cls));
    }

    public <T> T readValue(byte[] bArr, int i10, int i11, Class<T> cls) throws IOException {
        a(bArr, "src");
        return (T) g(this.f69278b.createParser(bArr, i10, i11), this.f69279c.constructType(cls));
    }

    public f0() {
        this(null, null, null);
    }

    public <T> T readValue(byte[] bArr, hc.b bVar) throws IOException {
        a(bArr, "src");
        return (T) g(this.f69278b.createParser(bArr), this.f69279c.constructType(bVar));
    }

    public f0(ub.k kVar) {
        this(kVar, null, null);
    }

    public <T> T readValue(byte[] bArr, int i10, int i11, hc.b bVar) throws IOException {
        a(bArr, "src");
        return (T) g(this.f69278b.createParser(bArr, i10, i11), this.f69279c.constructType(bVar));
    }

    public <T> T readValue(byte[] bArr, o oVar) throws IOException {
        a(bArr, "src");
        return (T) g(this.f69278b.createParser(bArr), oVar);
    }

    public <T> T readValue(byte[] bArr, int i10, int i11, o oVar) throws IOException {
        a(bArr, "src");
        return (T) g(this.f69278b.createParser(bArr, i10, i11), oVar);
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        a(dataInput, "src");
        return (T) g(this.f69278b.createParser(dataInput), this.f69279c.constructType(cls));
    }

    public <T> T readValue(DataInput dataInput, o oVar) throws IOException {
        a(dataInput, "src");
        return (T) g(this.f69278b.createParser(dataInput), oVar);
    }
}
