package jc;

import java.util.List;
import java.util.Map;
import java.util.Set;
import rc.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final o f69269a;

    public d(o oVar) {
        this.f69269a = oVar;
    }

    public abstract rc.l findAnyGetter();

    public abstract rc.l findAnySetterAccessor();

    public abstract List<rc.d0> findBackReferences();

    public String findClassDescription() {
        return null;
    }

    public abstract rc.g findDefaultConstructor();

    public abstract Class<?>[] findDefaultViews();

    public abstract dd.m findDeserializationConverter();

    public abstract tb.t findExpectedFormat();

    @Deprecated
    public tb.t findExpectedFormat(tb.t tVar) {
        tb.t tVarFindExpectedFormat = findExpectedFormat();
        return tVar == null ? tVarFindExpectedFormat : tVarFindExpectedFormat == null ? tVar : tVar.withOverrides(tVarFindExpectedFormat);
    }

    public abstract Map<Object, rc.l> findInjectables();

    public rc.l findJsonKeyAccessor() {
        return null;
    }

    public abstract rc.l findJsonValueAccessor();

    public abstract rc.m findMethod(String str, Class<?>[] clsArr);

    public abstract Class<?> findPOJOBuilder();

    public abstract kc.h findPOJOBuilderConfig();

    public abstract List<rc.d0> findProperties();

    public abstract tb.d0 findPropertyInclusion(tb.d0 d0Var);

    public abstract dd.m findSerializationConverter();

    public Class<?> getBeanClass() {
        return this.f69269a.getRawClass();
    }

    public abstract dd.b getClassAnnotations();

    public abstract rc.e getClassInfo();

    public abstract List<rc.g> getConstructors();

    public abstract List<rc.c> getConstructorsWithMode();

    public abstract List<rc.m> getFactoryMethods();

    public abstract List<rc.c> getFactoryMethodsWithMode();

    public abstract Set<String> getIgnoredPropertyNames();

    public abstract rc.t0 getObjectIdInfo();

    public abstract d1 getPotentialCreators();

    public o getType() {
        return this.f69269a;
    }

    public abstract boolean hasKnownClassAnnotations();

    public abstract Object instantiateBean(boolean z10);

    public boolean isNonStaticInnerClass() {
        return getClassInfo().isNonStaticInnerClass();
    }

    public boolean isRecordType() {
        return this.f69269a.isRecordType();
    }
}
