package lc;

import java.security.AccessController;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.function.Consumer;
import jc.f0;
import jc.g0;
import jc.o0;
import jc.t0;
import rc.a;
import rc.j1;
import rc.k0;
import tb.l1;
import tb.q0;
import tb.v0;
import ub.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f73174a;

    public y(tc.a aVar) {
        this.f73174a = aVar;
    }

    public static List<jc.c0> findModules() {
        return findModules(null);
    }

    public y accessorNaming(a.AbstractC0776a abstractC0776a) {
        if (abstractC0776a == null) {
            abstractC0776a = new k0();
        }
        this.f73174a.setAccessorNaming(abstractC0776a);
        return this;
    }

    public y activateDefaultTyping(wc.d dVar) {
        this.f73174a.activateDefaultTyping(dVar);
        return this;
    }

    public y activateDefaultTypingAsProperty(wc.d dVar, g0 g0Var, String str) {
        this.f73174a.activateDefaultTypingAsProperty(dVar, g0Var, str);
        return this;
    }

    public y addHandler(mc.q qVar) {
        this.f73174a.addHandler(qVar);
        return this;
    }

    public y addMixIn(Class<?> cls, Class<?> cls2) {
        this.f73174a.addMixIn(cls, cls2);
        return this;
    }

    public y addModule(jc.c0 c0Var) {
        this.f73174a.registerModule(c0Var);
        return this;
    }

    public y addModules(jc.c0... c0VarArr) {
        for (jc.c0 c0Var : c0VarArr) {
            addModule(c0Var);
        }
        return this;
    }

    public y annotationIntrospector(jc.c cVar) {
        this.f73174a.setAnnotationIntrospector(cVar);
        return this;
    }

    public f0 build() {
        return this.f73174a;
    }

    public y cacheProvider(b bVar) {
        this.f73174a.setCacheProvider(bVar);
        return this;
    }

    public y clearProblemHandlers() {
        this.f73174a.clearProblemHandlers();
        return this;
    }

    public y configure(jc.y yVar, boolean z10) {
        this.f73174a.configure(yVar, z10);
        return this;
    }

    public y constructorDetector(l lVar) {
        this.f73174a.setConstructorDetector(lVar);
        return this;
    }

    public y deactivateDefaultTyping() {
        this.f73174a.deactivateDefaultTyping();
        return this;
    }

    public y defaultAttributes(n nVar) {
        this.f73174a.setDefaultAttributes(nVar);
        return this;
    }

    public y defaultBase64Variant(ub.b bVar) {
        this.f73174a.setBase64Variant(bVar);
        return this;
    }

    public y defaultDateFormat(DateFormat dateFormat) {
        this.f73174a.setDateFormat(dateFormat);
        return this;
    }

    public y defaultLeniency(Boolean bool) {
        this.f73174a.setDefaultLeniency(bool);
        return this;
    }

    public y defaultLocale(Locale locale) {
        this.f73174a.setLocale(locale);
        return this;
    }

    public y defaultMergeable(Boolean bool) {
        this.f73174a.setDefaultMergeable(bool);
        return this;
    }

    public y defaultPrettyPrinter(ub.b0 b0Var) {
        this.f73174a.setDefaultPrettyPrinter(b0Var);
        return this;
    }

    public y defaultPropertyInclusion(tb.d0 d0Var) {
        this.f73174a.setDefaultPropertyInclusion(d0Var);
        return this;
    }

    public y defaultSetterInfo(q0 q0Var) {
        this.f73174a.setDefaultSetterInfo(q0Var);
        return this;
    }

    public y defaultTimeZone(TimeZone timeZone) {
        this.f73174a.setTimeZone(timeZone);
        return this;
    }

    public y disable(jc.y... yVarArr) {
        this.f73174a.disable(yVarArr);
        return this;
    }

    public y enable(jc.y... yVarArr) {
        this.f73174a.enable(yVarArr);
        return this;
    }

    public y enumNamingStrategy(jc.m mVar) {
        this.f73174a.setEnumNamingStrategy(mVar);
        return this;
    }

    public y filterProvider(zc.m mVar) {
        this.f73174a.setFilterProvider(mVar);
        return this;
    }

    public y findAndAddModules() {
        return addModules(findModules());
    }

    public y handlerInstantiator(v vVar) {
        this.f73174a.setHandlerInstantiator(vVar);
        return this;
    }

    public y injectableValues(jc.n nVar) {
        this.f73174a.setInjectableValues(nVar);
        return this;
    }

    public boolean isEnabled(jc.y yVar) {
        return this.f73174a.isEnabled(yVar);
    }

    public y nodeFactory(yc.o oVar) {
        this.f73174a.setNodeFactory(oVar);
        return this;
    }

    public y polymorphicTypeValidator(wc.d dVar) {
        this.f73174a.setPolymorphicTypeValidator(dVar);
        return this;
    }

    public y propertyNamingStrategy(o0 o0Var) {
        this.f73174a.setPropertyNamingStrategy(o0Var);
        return this;
    }

    public y registerSubtypes(Class<?>... clsArr) {
        this.f73174a.registerSubtypes(clsArr);
        return this;
    }

    public y removeMixIn(Class<?> cls) {
        this.f73174a.addMixIn(cls, null);
        return this;
    }

    public y serializationInclusion(tb.c0 c0Var) {
        this.f73174a.setSerializationInclusion(c0Var);
        return this;
    }

    public y serializerFactory(zc.s sVar) {
        this.f73174a.setSerializerFactory(sVar);
        return this;
    }

    public y setDefaultTyping(wc.i iVar) {
        this.f73174a.setDefaultTyping(iVar);
        return this;
    }

    public m0 streamFactory() {
        return this.f73174a.tokenStreamFactory();
    }

    public y subtypeResolver(wc.f fVar) {
        this.f73174a.setSubtypeResolver(fVar);
        return this;
    }

    public y typeFactory(cd.s sVar) {
        this.f73174a.setTypeFactory(sVar);
        return this;
    }

    public y visibility(j1 j1Var) {
        this.f73174a.setVisibility(j1Var);
        return this;
    }

    public y withCoercionConfig(cd.h hVar, Consumer<b0> consumer) {
        consumer.accept(this.f73174a.coercionConfigFor(hVar));
        return this;
    }

    public y withCoercionConfigDefaults(Consumer<b0> consumer) {
        consumer.accept(this.f73174a.coercionConfigDefaults());
        return this;
    }

    public y withConfigOverride(Class<?> cls, Consumer<c0> consumer) {
        consumer.accept(this.f73174a.configOverride(cls));
        return this;
    }

    public static List<jc.c0> findModules(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList();
        Iterator it = (System.getSecurityManager() == null ? classLoader == null ? ServiceLoader.load(jc.c0.class) : ServiceLoader.load(jc.c0.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new x(classLoader))).iterator();
        while (it.hasNext()) {
            arrayList.add((jc.c0) it.next());
        }
        return arrayList;
    }

    public y activateDefaultTyping(wc.d dVar, g0 g0Var) {
        this.f73174a.activateDefaultTyping(dVar, g0Var);
        return this;
    }

    public y configure(t0 t0Var, boolean z10) {
        this.f73174a.configure(t0Var, z10);
        return this;
    }

    public y disable(t0... t0VarArr) {
        for (t0 t0Var : t0VarArr) {
            this.f73174a.disable(t0Var);
        }
        return this;
    }

    public y enable(t0... t0VarArr) {
        for (t0 t0Var : t0VarArr) {
            this.f73174a.enable(t0Var);
        }
        return this;
    }

    public boolean isEnabled(jc.l lVar) {
        return this.f73174a.isEnabled(lVar);
    }

    public y registerSubtypes(wc.c... cVarArr) {
        this.f73174a.registerSubtypes(cVarArr);
        return this;
    }

    public y visibility(l1 l1Var, tb.i iVar) {
        this.f73174a.setVisibility(l1Var, iVar);
        return this;
    }

    public y withCoercionConfig(Class<?> cls, Consumer<b0> consumer) {
        consumer.accept(this.f73174a.coercionConfigFor(cls));
        return this;
    }

    public y activateDefaultTyping(wc.d dVar, g0 g0Var, v0 v0Var) {
        this.f73174a.activateDefaultTyping(dVar, g0Var, v0Var);
        return this;
    }

    public y addModules(Iterable<? extends jc.c0> iterable) {
        Iterator<? extends jc.c0> it = iterable.iterator();
        while (it.hasNext()) {
            addModule(it.next());
        }
        return this;
    }

    public y configure(jc.l lVar, boolean z10) {
        this.f73174a.configure(lVar, z10);
        return this;
    }

    public boolean isEnabled(t0 t0Var) {
        return this.f73174a.isEnabled(t0Var);
    }

    public y registerSubtypes(Collection<Class<?>> collection) {
        this.f73174a.registerSubtypes(collection);
        return this;
    }

    public y configure(o oVar, boolean z10) {
        this.f73174a.configure(oVar, z10);
        return this;
    }

    public y disable(jc.l... lVarArr) {
        for (jc.l lVar : lVarArr) {
            this.f73174a.disable(lVar);
        }
        return this;
    }

    public y enable(jc.l... lVarArr) {
        for (jc.l lVar : lVarArr) {
            this.f73174a.enable(lVar);
        }
        return this;
    }

    public boolean isEnabled(ub.r rVar) {
        return this.f73174a.isEnabled(rVar);
    }

    public y configure(ub.r rVar, boolean z10) {
        this.f73174a.configure(rVar, z10);
        return this;
    }

    public boolean isEnabled(ub.n nVar) {
        return this.f73174a.isEnabled(nVar);
    }

    public y configure(ub.n nVar, boolean z10) {
        this.f73174a.configure(nVar, z10);
        return this;
    }

    public y disable(o... oVarArr) {
        for (o oVar : oVarArr) {
            this.f73174a.configure(oVar, false);
        }
        return this;
    }

    public y enable(o... oVarArr) {
        for (o oVar : oVarArr) {
            this.f73174a.configure(oVar, true);
        }
        return this;
    }

    public y configure(ub.g0 g0Var, boolean z10) {
        this.f73174a.configure(g0Var.mappedFeature(), z10);
        return this;
    }

    public y configure(ub.k0 k0Var, boolean z10) {
        this.f73174a.configure(k0Var.mappedFeature(), z10);
        return this;
    }

    public y disable(ub.r... rVarArr) {
        this.f73174a.disable(rVarArr);
        return this;
    }

    public y enable(ub.r... rVarArr) {
        this.f73174a.enable(rVarArr);
        return this;
    }

    public y disable(ub.n... nVarArr) {
        this.f73174a.disable(nVarArr);
        return this;
    }

    public y enable(ub.n... nVarArr) {
        this.f73174a.enable(nVarArr);
        return this;
    }

    public y disable(ub.g0... g0VarArr) {
        for (ub.g0 g0Var : g0VarArr) {
            this.f73174a.disable(g0Var.mappedFeature());
        }
        return this;
    }

    public y enable(ub.g0... g0VarArr) {
        for (ub.g0 g0Var : g0VarArr) {
            this.f73174a.enable(g0Var.mappedFeature());
        }
        return this;
    }

    public y disable(ub.k0... k0VarArr) {
        for (ub.k0 k0Var : k0VarArr) {
            this.f73174a.disable(k0Var.mappedFeature());
        }
        return this;
    }

    public y enable(ub.k0... k0VarArr) {
        for (ub.k0 k0Var : k0VarArr) {
            this.f73174a.enable(k0Var.mappedFeature());
        }
        return this;
    }
}
