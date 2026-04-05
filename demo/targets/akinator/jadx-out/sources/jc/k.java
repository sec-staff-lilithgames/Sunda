package jc;

import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import tb.f1;
import tb.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k extends h implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final mc.r f69325b;

    /* renamed from: c, reason: collision with root package name */
    public final mc.s f69326c;

    /* renamed from: e, reason: collision with root package name */
    public final j f69327e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69328f;

    /* renamed from: g, reason: collision with root package name */
    public final ic.l f69329g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f69330h;

    /* renamed from: i, reason: collision with root package name */
    public final transient ub.u f69331i;

    /* renamed from: j, reason: collision with root package name */
    public final n f69332j;

    /* renamed from: k, reason: collision with root package name */
    public transient dd.d f69333k;

    /* renamed from: l, reason: collision with root package name */
    public transient dd.d0 f69334l;

    /* renamed from: m, reason: collision with root package name */
    public transient DateFormat f69335m;

    /* renamed from: n, reason: collision with root package name */
    public transient lc.n f69336n;

    /* renamed from: o, reason: collision with root package name */
    public dd.t f69337o;

    public k(mc.s sVar, mc.r rVar) {
        Objects.requireNonNull(sVar);
        this.f69326c = sVar;
        this.f69325b = rVar;
        this.f69328f = 0;
        this.f69329g = null;
        this.f69327e = null;
        this.f69332j = null;
        this.f69330h = null;
        this.f69336n = null;
    }

    public static boolean d(Class cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        return cls.isPrimitive() && dd.i.wrapperType(cls).isInstance(obj);
    }

    public dd.k0 bufferAsCopyOfValue(ub.u uVar) throws IOException {
        dd.k0 k0VarBufferForInputBuffering = bufferForInputBuffering(uVar);
        k0VarBufferForInputBuffering.copyCurrentStructure(uVar);
        return k0VarBufferForInputBuffering;
    }

    public dd.k0 bufferForInputBuffering(ub.u uVar) {
        return new dd.k0(uVar, this);
    }

    @Override // jc.h
    public final boolean canOverrideAccessModifiers() {
        return this.f69327e.canOverrideAccessModifiers();
    }

    public abstract void checkUnresolvedObjectId() throws mc.a0;

    public Calendar constructCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    @Override // jc.h
    public o constructSpecializedType(o oVar, Class<?> cls) throws IllegalArgumentException {
        return oVar.hasRawClass(cls) ? oVar : getConfig().getTypeFactory().constructSpecializedType(oVar, cls, false);
    }

    public final o constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this.f69327e.constructType(cls);
    }

    public abstract q deserializerInstance(rc.b bVar, Object obj) throws r;

    public String extractScalarFromObject(ub.u uVar, q qVar, Class<?> cls) throws IOException {
        return (String) handleUnexpectedToken(cls, uVar);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public lc.c findCoercionAction(cd.h hVar, Class<?> cls, lc.f fVar) {
        return this.f69327e.findCoercionAction(hVar, cls, fVar);
    }

    public lc.c findCoercionFromBlankString(cd.h hVar, Class<?> cls, lc.c cVar) {
        return this.f69327e.findCoercionFromBlankString(hVar, cls, cVar);
    }

    public final q findContextualValueDeserializer(o oVar, g gVar) throws r {
        q qVarFindValueDeserializer = this.f69325b.findValueDeserializer(this, this.f69326c, oVar);
        return qVarFindValueDeserializer != null ? handleSecondaryContextualization(qVarFindValueDeserializer, gVar, oVar) : qVarFindValueDeserializer;
    }

    public final Object findInjectableValue(Object obj, g gVar, Object obj2) throws r {
        n nVar = this.f69332j;
        return nVar == null ? reportBadDefinition(dd.i.classOf(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj)) : nVar.findInjectableValue(obj, this, gVar, obj2);
    }

    public final x findKeyDeserializer(o oVar, g gVar) throws r {
        try {
            return this.f69325b.findKeyDeserializer(this, this.f69326c, oVar);
        } catch (IllegalArgumentException e10) {
            reportBadDefinition(oVar, dd.i.exceptionMessage(e10));
            return null;
        }
    }

    public final q findNonContextualValueDeserializer(o oVar) throws r {
        return this.f69325b.findValueDeserializer(this, this.f69326c, oVar);
    }

    public abstract nc.i0 findObjectId(Object obj, f1 f1Var, j1 j1Var);

    public final q findRootValueDeserializer(o oVar) throws r {
        mc.r rVar = this.f69325b;
        mc.s sVar = this.f69326c;
        q qVarFindValueDeserializer = rVar.findValueDeserializer(this, sVar, oVar);
        if (qVarFindValueDeserializer == null) {
            return null;
        }
        q qVarHandleSecondaryContextualization = handleSecondaryContextualization(qVarFindValueDeserializer, null, oVar);
        wc.g gVarFindTypeDeserializer = sVar.findTypeDeserializer(this.f69327e, oVar);
        return gVarFindTypeDeserializer != null ? new nc.k0(gVarFindTypeDeserializer.forProperty(null), qVarHandleSecondaryContextualization) : qVarHandleSecondaryContextualization;
    }

    public void flushCachedDeserializers() {
        this.f69325b.flushCachedDeserializers();
    }

    @Override // jc.h
    public final Class<?> getActiveView() {
        return this.f69330h;
    }

    @Override // jc.h
    public final c getAnnotationIntrospector() {
        return this.f69327e.getAnnotationIntrospector();
    }

    public final dd.d getArrayBuilders() {
        if (this.f69333k == null) {
            this.f69333k = new dd.d();
        }
        return this.f69333k;
    }

    @Override // jc.h
    public Object getAttribute(Object obj) {
        return this.f69336n.getAttribute(obj);
    }

    public final ub.b getBase64Variant() {
        return this.f69327e.getBase64Variant();
    }

    public o getContextualType() {
        dd.t tVar = this.f69337o;
        if (tVar == null) {
            return null;
        }
        return (o) tVar.value();
    }

    @Override // jc.h
    public final lc.q getDatatypeFeatures() {
        return this.f69327e.getDatatypeFeatures();
    }

    @Override // jc.h
    public final tb.t getDefaultPropertyFormat(Class<?> cls) {
        return this.f69327e.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this.f69328f;
    }

    public mc.s getFactory() {
        return this.f69326c;
    }

    @Override // jc.h
    public Locale getLocale() {
        return this.f69327e.getLocale();
    }

    public final yc.o getNodeFactory() {
        return this.f69327e.getNodeFactory();
    }

    public final ub.u getParser() {
        return this.f69331i;
    }

    @Override // jc.h
    public TimeZone getTimeZone() {
        return this.f69327e.getTimeZone();
    }

    @Override // jc.h
    public final cd.s getTypeFactory() {
        return this.f69327e.getTypeFactory();
    }

    public void handleBadMerge(q qVar) throws r {
        if (isEnabled(y.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        o oVarConstructType = constructType(qVar.handledType());
        throw pc.b.from(getParser(), a.b.l("Invalid configuration: values of type ", dd.i.getTypeDescription(oVarConstructType), " cannot be merged"), oVarConstructType);
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th2) throws IOException {
        for (dd.t problemHandlers = this.f69327e.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleInstantiationProblem = ((mc.q) problemHandlers.value()).handleInstantiationProblem(this, cls, obj, th2);
            if (objHandleInstantiationProblem != mc.q.f74216a) {
                if (d(cls, objHandleInstantiationProblem)) {
                    return objHandleInstantiationProblem;
                }
                reportBadDefinition(constructType(cls), a.b.m("DeserializationProblemHandler.handleInstantiationProblem() for type ", dd.i.getClassDescription(cls), " returned value of type ", dd.i.classNameOf(objHandleInstantiationProblem)));
            }
        }
        dd.i.throwIfIOE(th2);
        if (!isEnabled(l.WRAP_EXCEPTIONS)) {
            dd.i.throwIfRTE(th2);
        }
        throw instantiationException(cls, th2);
    }

    public Object handleMissingInstantiator(Class<?> cls, mc.c0 c0Var, ub.u uVar, String str, Object... objArr) throws IOException {
        if (uVar == null) {
            uVar = getParser();
        }
        ub.u uVar2 = uVar;
        String strB = h.b(str, objArr);
        dd.t problemHandlers = this.f69327e.getProblemHandlers();
        while (problemHandlers != null) {
            Class<?> cls2 = cls;
            mc.c0 c0Var2 = c0Var;
            Object objHandleMissingInstantiator = ((mc.q) problemHandlers.value()).handleMissingInstantiator(this, cls2, c0Var2, uVar2, strB);
            if (objHandleMissingInstantiator != mc.q.f74216a) {
                if (d(cls2, objHandleMissingInstantiator)) {
                    return objHandleMissingInstantiator;
                }
                reportBadDefinition(constructType(cls2), a.b.m("DeserializationProblemHandler.handleMissingInstantiator() for type ", dd.i.getClassDescription(cls2), " returned value of type ", dd.i.getClassDescription(objHandleMissingInstantiator)));
            }
            problemHandlers = problemHandlers.next();
            cls = cls2;
            c0Var = c0Var2;
        }
        Class<?> cls3 = cls;
        mc.c0 c0Var3 = c0Var;
        return c0Var3 == null ? reportBadDefinition(cls3, a.b.m("Cannot construct instance of ", dd.i.nameOf(cls3), ": ", strB)) : !c0Var3.canInstantiate() ? reportBadDefinition(cls3, a.b.m("Cannot construct instance of ", dd.i.nameOf(cls3), " (no Creators, like default constructor, exist): ", strB)) : reportInputMismatch(cls3, a.b.m("Cannot construct instance of ", dd.i.nameOf(cls3), " (although at least one Creator exists): ", strB), new Object[0]);
    }

    public o handleMissingTypeId(o oVar, wc.h hVar, String str) throws IOException {
        for (dd.t problemHandlers = this.f69327e.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            o oVarHandleMissingTypeId = ((mc.q) problemHandlers.value()).handleMissingTypeId(this, oVar, hVar, str);
            if (oVarHandleMissingTypeId != null) {
                if (oVarHandleMissingTypeId.hasRawClass(Void.class)) {
                    return null;
                }
                if (oVarHandleMissingTypeId.isTypeOrSubTypeOf(oVar.getRawClass())) {
                    return oVarHandleMissingTypeId;
                }
                throw invalidTypeIdException(oVar, null, "problem handler tried to resolve into non-subtype: " + dd.i.getTypeDescription(oVarHandleMissingTypeId));
            }
        }
        throw missingTypeIdException(oVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q handlePrimaryContextualization(q qVar, g gVar, o oVar) throws r {
        if (!(qVar instanceof mc.k)) {
            return qVar;
        }
        this.f69337o = new dd.t(oVar, this.f69337o);
        try {
            return ((mc.k) qVar).createContextual(this, gVar);
        } finally {
            this.f69337o = this.f69337o.next();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q handleSecondaryContextualization(q qVar, g gVar, o oVar) throws r {
        if (!(qVar instanceof mc.k)) {
            return qVar;
        }
        this.f69337o = new dd.t(oVar, this.f69337o);
        try {
            return ((mc.k) qVar).createContextual(this, gVar);
        } finally {
            this.f69337o = this.f69337o.next();
        }
    }

    public Object handleUnexpectedToken(Class<?> cls, ub.u uVar) throws IOException {
        return handleUnexpectedToken(constructType(cls), uVar.currentToken(), uVar, (String) null, new Object[0]);
    }

    public boolean handleUnknownProperty(ub.u uVar, q qVar, Object obj, String str) throws IOException {
        dd.t problemHandlers = this.f69327e.getProblemHandlers();
        while (problemHandlers != null) {
            ub.u uVar2 = uVar;
            q qVar2 = qVar;
            Object obj2 = obj;
            String str2 = str;
            if (((mc.q) problemHandlers.value()).handleUnknownProperty(this, uVar2, qVar2, obj2, str2)) {
                return true;
            }
            problemHandlers = problemHandlers.next();
            uVar = uVar2;
            qVar = qVar2;
            obj = obj2;
            str = str2;
        }
        ub.u uVar3 = uVar;
        q qVar3 = qVar;
        Object obj3 = obj;
        String str3 = str;
        if (isEnabled(l.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw pc.h.from(this.f69331i, obj3, str3, qVar3 == null ? null : qVar3.getKnownPropertyNames());
        }
        uVar3.skipChildren();
        return true;
    }

    public o handleUnknownTypeId(o oVar, String str, wc.h hVar, String str2) throws IOException {
        dd.t problemHandlers = this.f69327e.getProblemHandlers();
        while (problemHandlers != null) {
            o oVar2 = oVar;
            String str3 = str;
            wc.h hVar2 = hVar;
            String str4 = str2;
            o oVarHandleUnknownTypeId = ((mc.q) problemHandlers.value()).handleUnknownTypeId(this, oVar2, str3, hVar2, str4);
            if (oVarHandleUnknownTypeId != null) {
                if (oVarHandleUnknownTypeId.hasRawClass(Void.class)) {
                    return null;
                }
                if (oVarHandleUnknownTypeId.isTypeOrSubTypeOf(oVar2.getRawClass())) {
                    return oVarHandleUnknownTypeId;
                }
                throw invalidTypeIdException(oVar2, str3, "problem handler tried to resolve into non-subtype: " + dd.i.getTypeDescription(oVarHandleUnknownTypeId));
            }
            problemHandlers = problemHandlers.next();
            oVar = oVar2;
            str = str3;
            hVar = hVar2;
            str2 = str4;
        }
        o oVar3 = oVar;
        String str5 = str;
        String str6 = str2;
        if (isEnabled(l.FAIL_ON_INVALID_SUBTYPE)) {
            throw invalidTypeIdException(oVar3, str5, str6);
        }
        return null;
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String strB = h.b(str2, objArr);
        for (dd.t problemHandlers = this.f69327e.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleWeirdKey = ((mc.q) problemHandlers.value()).handleWeirdKey(this, cls, str, strB);
            if (objHandleWeirdKey != mc.q.f74216a) {
                if (objHandleWeirdKey == null || cls.isInstance(objHandleWeirdKey)) {
                    return objHandleWeirdKey;
                }
                throw weirdStringException(str, cls, a.b.m("DeserializationProblemHandler.handleWeirdKey() for type ", dd.i.getClassDescription(cls), " returned value of type ", dd.i.getClassDescription(objHandleWeirdKey)));
            }
        }
        throw weirdKeyException(cls, str, strB);
    }

    public Object handleWeirdNativeValue(o oVar, Object obj, ub.u uVar) throws IOException {
        Class<?> rawClass = oVar.getRawClass();
        for (dd.t problemHandlers = this.f69327e.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleWeirdNativeValue = ((mc.q) problemHandlers.value()).handleWeirdNativeValue(this, oVar, obj, uVar);
            if (objHandleWeirdNativeValue != mc.q.f74216a) {
                if (objHandleWeirdNativeValue == null || rawClass.isInstance(objHandleWeirdNativeValue)) {
                    return objHandleWeirdNativeValue;
                }
                throw r.from(uVar, String.format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", dd.i.getClassDescription(oVar), dd.i.getClassDescription(objHandleWeirdNativeValue)));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String strB = h.b(str, objArr);
        for (dd.t problemHandlers = this.f69327e.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleWeirdNumberValue = ((mc.q) problemHandlers.value()).handleWeirdNumberValue(this, cls, number, strB);
            if (objHandleWeirdNumberValue != mc.q.f74216a) {
                if (d(cls, objHandleWeirdNumberValue)) {
                    return objHandleWeirdNumberValue;
                }
                throw weirdNumberException(number, cls, a.b.m("DeserializationProblemHandler.handleWeirdNumberValue() for type ", dd.i.getClassDescription(cls), " returned value of type ", dd.i.getClassDescription(objHandleWeirdNumberValue)));
            }
        }
        throw weirdNumberException(number, cls, strB);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String strB = h.b(str2, objArr);
        for (dd.t problemHandlers = this.f69327e.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.next()) {
            Object objHandleWeirdStringValue = ((mc.q) problemHandlers.value()).handleWeirdStringValue(this, cls, str, strB);
            if (objHandleWeirdStringValue != mc.q.f74216a) {
                if (d(cls, objHandleWeirdStringValue)) {
                    return objHandleWeirdStringValue;
                }
                throw weirdStringException(str, cls, a.b.m("DeserializationProblemHandler.handleWeirdStringValue() for type ", dd.i.getClassDescription(cls), " returned value of type ", dd.i.getClassDescription(objHandleWeirdStringValue)));
            }
        }
        throw weirdStringException(str, cls, strB);
    }

    public final boolean hasDeserializationFeatures(int i10) {
        return (this.f69328f & i10) == i10;
    }

    public final boolean hasSomeOfFeatures(int i10) {
        return (i10 & this.f69328f) != 0;
    }

    public boolean hasValueDeserializerFor(o oVar, AtomicReference<Throwable> atomicReference) {
        try {
            return this.f69325b.hasValueDeserializerFor(this, this.f69326c, oVar);
        } catch (RuntimeException e10) {
            if (atomicReference == null) {
                throw e10;
            }
            atomicReference.set(e10);
            return false;
        } catch (i e11) {
            if (atomicReference == null) {
                return false;
            }
            atomicReference.set(e11);
            return false;
        }
    }

    public r instantiationException(Class<?> cls, Throwable th2) {
        String strExceptionMessage;
        if (th2 == null) {
            strExceptionMessage = "N/A";
        } else {
            strExceptionMessage = dd.i.exceptionMessage(th2);
            if (strExceptionMessage == null) {
                strExceptionMessage = dd.i.nameOf(th2.getClass());
            }
        }
        return pc.i.from(this.f69331i, a.b.m("Cannot construct instance of ", dd.i.nameOf(cls), ", problem: ", strExceptionMessage), constructType(cls), th2);
    }

    @Override // jc.h
    public r invalidTypeIdException(o oVar, String str, String str2) {
        return pc.e.from(this.f69331i, h.a(a.b.m("Could not resolve type id '", str, "' as a subtype of ", dd.i.getTypeDescription(oVar)), str2), oVar, str);
    }

    @Override // jc.h
    public final boolean isEnabled(y yVar) {
        return this.f69327e.isEnabled(yVar);
    }

    public abstract x keyDeserializerInstance(rc.b bVar, Object obj) throws r;

    public final dd.d0 leaseObjectBuffer() {
        dd.d0 d0Var = this.f69334l;
        if (d0Var == null) {
            return new dd.d0();
        }
        this.f69334l = null;
        return d0Var;
    }

    public r missingTypeIdException(o oVar, String str) {
        return pc.e.from(this.f69331i, h.a(String.format("Could not resolve subtype of %s", oVar), str), oVar, null);
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            DateFormat dateFormat = this.f69335m;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this.f69327e.getDateFormat().clone();
                this.f69335m = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e10) {
            throw new IllegalArgumentException(a.b.m("Failed to parse Date value '", str, "': ", dd.i.exceptionMessage(e10)));
        }
    }

    public <T> T readPropertyValue(ub.u uVar, g gVar, Class<T> cls) throws IOException {
        return (T) readPropertyValue(uVar, gVar, getTypeFactory().constructType(cls));
    }

    public t readTree(ub.u uVar) throws IOException {
        ub.z zVarCurrentToken = uVar.currentToken();
        return (zVarCurrentToken == null && (zVarCurrentToken = uVar.nextToken()) == null) ? getNodeFactory().missingNode() : zVarCurrentToken == ub.z.VALUE_NULL ? getNodeFactory().nullNode() : (t) findRootValueDeserializer(this.f69327e.constructType(t.class)).deserialize(uVar, this);
    }

    public <T> T readTreeAsValue(t tVar, Class<T> cls) throws IOException {
        if (tVar == null || tVar.isMissingNode()) {
            return null;
        }
        ub.u uVar = this.f69331i;
        yc.z zVar = new yc.z(tVar, uVar != null ? uVar.getCodec() : null);
        zVar.nextToken();
        try {
            T t10 = (T) readValue(zVar, cls);
            zVar.close();
            return t10;
        } finally {
        }
    }

    public <T> T readValue(ub.u uVar, Class<T> cls) throws IOException {
        return (T) readValue(uVar, getTypeFactory().constructType(cls));
    }

    public <T> T reportBadCoercion(q qVar, Class<?> cls, Object obj, String str, Object... objArr) throws r {
        throw pc.c.from(getParser(), h.b(str, objArr), obj, cls);
    }

    @Override // jc.h
    public <T> T reportBadDefinition(o oVar, String str) throws r {
        throw pc.b.from(this.f69331i, str, oVar);
    }

    public <T> T reportBadPropertyDefinition(d dVar, rc.d0 d0Var, String str, Object... objArr) throws r {
        String strB = h.b(str, objArr);
        StringBuilder sbB = b3.h.b("Invalid definition for property ", dd.i.nameOf(d0Var), " (of type ", dd.i.nameOf(dVar.getBeanClass()), "): ");
        sbB.append(strB);
        throw pc.b.from(this.f69331i, sbB.toString(), dVar, d0Var);
    }

    @Override // jc.h
    public <T> T reportBadTypeDefinition(d dVar, String str, Object... objArr) throws r {
        throw pc.b.from(this.f69331i, a.b.m("Invalid type definition for type ", dd.i.nameOf(dVar.getBeanClass()), ": ", h.b(str, objArr)), dVar, (rc.d0) null);
    }

    public <T> T reportInputMismatch(q qVar, String str, Object... objArr) throws r {
        throw pc.f.from(getParser(), qVar.handledType(), h.b(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(Class<?> cls, String str, String str2, Object... objArr) throws r {
        pc.f fVarFrom = pc.f.from(getParser(), cls, h.b(str2, objArr));
        if (str == null) {
            throw fVarFrom;
        }
        fVarFrom.prependPath(cls, str);
        throw fVarFrom;
    }

    public <T> T reportTrailingTokens(Class<?> cls, ub.u uVar, ub.z zVar) throws r {
        throw pc.f.from(uVar, cls, "Trailing token (of type " + zVar + ") found after value (bound as " + dd.i.nameOf(cls) + "): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`");
    }

    public <T> T reportUnresolvedObjectId(nc.w wVar, Object obj) throws r {
        return (T) reportInputMismatch(wVar.f75971h, String.format("No Object Id found for an instance of %s, to assign to property '%s'", dd.i.classNameOf(obj), wVar.f75967c), new Object[0]);
    }

    public void reportWrongTokenException(q qVar, ub.z zVar, String str, Object... objArr) throws r {
        throw wrongTokenException(getParser(), qVar.handledType(), zVar, h.b(str, objArr));
    }

    public final void returnObjectBuffer(dd.d0 d0Var) {
        if (this.f69334l == null || d0Var.initialCapacity() >= this.f69334l.initialCapacity()) {
            this.f69334l = d0Var;
        }
    }

    public r weirdKeyException(Class<?> cls, String str, String str2) {
        StringBuilder sbB = b3.h.b("Cannot deserialize Map key of type ", dd.i.nameOf(cls), " from String ", h.c(str), ": ");
        sbB.append(str2);
        return pc.c.from(this.f69331i, sbB.toString(), str, cls);
    }

    public r weirdNativeValueException(Object obj, Class<?> cls) {
        return pc.c.from(this.f69331i, e3.g.l("Cannot deserialize value of type ", dd.i.nameOf(cls), " from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type ", dd.i.classNameOf(obj), ": incompatible types"), obj, cls);
    }

    public r weirdNumberException(Number number, Class<?> cls, String str) {
        StringBuilder sbB = b3.h.b("Cannot deserialize value of type ", dd.i.nameOf(cls), " from number ", String.valueOf(number), ": ");
        sbB.append(str);
        return pc.c.from(this.f69331i, sbB.toString(), number, cls);
    }

    public r weirdStringException(String str, Class<?> cls, String str2) {
        StringBuilder sbB = b3.h.b("Cannot deserialize value of type ", dd.i.nameOf(cls), " from String ", h.c(str), ": ");
        sbB.append(str2);
        return pc.c.from(this.f69331i, sbB.toString(), str, cls);
    }

    public r wrongTokenException(ub.u uVar, o oVar, ub.z zVar, String str) {
        return pc.f.from(uVar, oVar, h.a("Unexpected token (" + uVar.currentToken() + "), expected " + zVar, str));
    }

    public final dd.k0 bufferForInputBuffering() {
        return bufferForInputBuffering(getParser());
    }

    @Override // jc.h
    public j getConfig() {
        return this.f69327e;
    }

    public Object handleUnexpectedToken(Class<?> cls, ub.z zVar, ub.u uVar, String str, Object... objArr) throws IOException {
        return handleUnexpectedToken(constructType(cls), zVar, uVar, str, objArr);
    }

    @Override // jc.h
    public final boolean isEnabled(lc.o oVar) {
        return this.f69327e.isEnabled(oVar);
    }

    public <T> T readPropertyValue(ub.u uVar, g gVar, o oVar) throws IOException {
        q qVarFindContextualValueDeserializer = findContextualValueDeserializer(oVar, gVar);
        return qVarFindContextualValueDeserializer == null ? (T) reportBadDefinition(oVar, e3.g.l("Could not find JsonDeserializer for type ", dd.i.getTypeDescription(oVar), " (via property ", dd.i.nameOf(gVar), ")")) : uVar.hasToken(ub.z.VALUE_NULL) ? (T) qVarFindContextualValueDeserializer.getNullValue(this) : (T) qVarFindContextualValueDeserializer.deserialize(uVar, this);
    }

    public <T> T readValue(ub.u uVar, o oVar) throws IOException {
        q qVarFindRootValueDeserializer = findRootValueDeserializer(oVar);
        if (qVarFindRootValueDeserializer != null) {
            return uVar.hasToken(ub.z.VALUE_NULL) ? (T) qVarFindRootValueDeserializer.getNullValue(this) : (T) qVarFindRootValueDeserializer.deserialize(uVar, this);
        }
        return (T) reportBadDefinition(oVar, "Could not find JsonDeserializer for type " + dd.i.getTypeDescription(oVar));
    }

    @Override // jc.h
    public k setAttribute(Object obj, Object obj2) {
        this.f69336n = this.f69336n.withPerCallAttribute(obj, obj2);
        return this;
    }

    public Object handleUnexpectedToken(o oVar, ub.u uVar) throws IOException {
        return handleUnexpectedToken(oVar, uVar.currentToken(), uVar, (String) null, new Object[0]);
    }

    public final boolean isEnabled(l lVar) {
        return (lVar.getMask() & this.f69328f) != 0;
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws r {
        throw pc.f.from(getParser(), cls, h.b(str, objArr));
    }

    public void reportWrongTokenException(o oVar, ub.z zVar, String str, Object... objArr) throws r {
        throw wrongTokenException(getParser(), oVar, zVar, h.b(str, objArr));
    }

    public Object handleUnexpectedToken(o oVar, ub.z zVar, ub.u uVar, String str, Object... objArr) throws IOException {
        String strB = h.b(str, objArr);
        dd.t problemHandlers = this.f69327e.getProblemHandlers();
        while (problemHandlers != null) {
            o oVar2 = oVar;
            ub.z zVar2 = zVar;
            ub.u uVar2 = uVar;
            Object objHandleUnexpectedToken = ((mc.q) problemHandlers.value()).handleUnexpectedToken(this, oVar2, zVar2, uVar2, strB);
            if (objHandleUnexpectedToken != mc.q.f74216a) {
                if (d(oVar2.getRawClass(), objHandleUnexpectedToken)) {
                    return objHandleUnexpectedToken;
                }
                reportBadDefinition(oVar2, a.b.m("DeserializationProblemHandler.handleUnexpectedToken() for type ", dd.i.getTypeDescription(oVar2), " returned value of type ", dd.i.classNameOf(objHandleUnexpectedToken)));
            }
            problemHandlers = problemHandlers.next();
            oVar = oVar2;
            zVar = zVar2;
            uVar = uVar2;
        }
        o oVar3 = oVar;
        ub.z zVar3 = zVar;
        ub.u uVar3 = uVar;
        if (strB == null) {
            String typeDescription = dd.i.getTypeDescription(oVar3);
            if (zVar3 == null) {
                strB = a.b.k("Unexpected end-of-input when trying read value of type ", typeDescription);
            } else {
                StringBuilder sbB = b3.h.b("Cannot deserialize value of type ", typeDescription, " from ", ub.z.valueDescFor(zVar3), " (token `JsonToken.");
                sbB.append(zVar3);
                sbB.append("`)");
                strB = sbB.toString();
            }
        }
        if (zVar3 != null && zVar3.isScalarValue()) {
            uVar3.getText();
        }
        reportInputMismatch(oVar3, strB, new Object[0]);
        return null;
    }

    public final boolean isEnabled(ub.d0 d0Var) {
        return this.f69329g.isEnabled(d0Var);
    }

    public <T> T reportInputMismatch(o oVar, String str, Object... objArr) throws r {
        throw pc.f.from(getParser(), oVar, h.b(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(o oVar, String str, String str2, Object... objArr) throws r {
        return (T) reportPropertyInputMismatch(oVar.getRawClass(), str, str2, objArr);
    }

    public void reportWrongTokenException(Class<?> cls, ub.z zVar, String str, Object... objArr) throws r {
        throw wrongTokenException(getParser(), cls, zVar, h.b(str, objArr));
    }

    public r wrongTokenException(ub.u uVar, Class<?> cls, ub.z zVar, String str) {
        return pc.f.from(uVar, cls, h.a("Unexpected token (" + uVar.currentToken() + "), expected " + zVar, str));
    }

    public <T> T reportInputMismatch(g gVar, String str, Object... objArr) throws r {
        rc.l member;
        pc.f fVarFrom = pc.f.from(getParser(), gVar == null ? null : gVar.getType(), h.b(str, objArr));
        if (gVar != null && (member = gVar.getMember()) != null) {
            fVarFrom.prependPath(member.getDeclaringClass(), gVar.getName());
            throw fVarFrom;
        }
        throw fVarFrom;
    }

    public <T> T readTreeAsValue(t tVar, o oVar) throws IOException {
        if (tVar == null || tVar.isMissingNode()) {
            return null;
        }
        ub.u uVar = this.f69331i;
        yc.z zVar = new yc.z(tVar, uVar != null ? uVar.getCodec() : null);
        zVar.nextToken();
        try {
            T t10 = (T) readValue(zVar, oVar);
            zVar.close();
            return t10;
        } finally {
        }
    }

    public k(mc.o oVar, mc.s sVar) {
        this.f69325b = oVar.f69325b;
        this.f69326c = sVar;
        this.f69327e = oVar.f69327e;
        this.f69328f = oVar.f69328f;
        this.f69329g = oVar.f69329g;
        this.f69330h = oVar.f69330h;
        this.f69331i = oVar.f69331i;
        this.f69332j = oVar.f69332j;
        this.f69336n = oVar.f69336n;
    }

    public r instantiationException(Class<?> cls, String str) {
        return pc.i.from(this.f69331i, a.b.m("Cannot construct instance of ", dd.i.nameOf(cls), ": ", str), constructType(cls));
    }

    public k(mc.o oVar, mc.r rVar) {
        this.f69325b = rVar;
        this.f69326c = oVar.f69326c;
        this.f69327e = oVar.f69327e;
        this.f69328f = oVar.f69328f;
        this.f69329g = oVar.f69329g;
        this.f69330h = oVar.f69330h;
        this.f69331i = oVar.f69331i;
        this.f69332j = oVar.f69332j;
        this.f69336n = oVar.f69336n;
    }

    public k(mc.o oVar, j jVar, ub.u uVar, n nVar) {
        this.f69325b = oVar.f69325b;
        this.f69326c = oVar.f69326c;
        this.f69329g = uVar == null ? null : uVar.getReadCapabilities();
        this.f69327e = jVar;
        this.f69328f = jVar.getDeserializationFeatures();
        this.f69330h = jVar.getActiveView();
        this.f69331i = uVar;
        this.f69332j = nVar;
        this.f69336n = jVar.getAttributes();
    }

    public k(mc.o oVar, j jVar) {
        this.f69325b = oVar.f69325b;
        this.f69326c = oVar.f69326c;
        this.f69329g = null;
        this.f69327e = jVar;
        this.f69328f = jVar.getDeserializationFeatures();
        this.f69330h = null;
        this.f69331i = null;
        this.f69332j = null;
        this.f69336n = null;
    }

    public k(mc.o oVar) {
        this.f69325b = oVar.f69325b.emptyCopy();
        this.f69326c = oVar.f69326c;
        this.f69327e = oVar.f69327e;
        this.f69328f = oVar.f69328f;
        this.f69329g = oVar.f69329g;
        this.f69330h = oVar.f69330h;
        this.f69332j = oVar.f69332j;
        this.f69336n = null;
    }
}
