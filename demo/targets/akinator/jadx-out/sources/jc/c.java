package jc;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import rc.c1;
import rc.j1;
import tb.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c implements ub.q0, Serializable {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final b f69267a;

        /* renamed from: b, reason: collision with root package name */
        public final String f69268b;

        public a(b bVar, String str) {
            this.f69267a = bVar;
            this.f69268b = str;
        }

        public static a back(String str) {
            return new a(b.f69265c, str);
        }

        public static a managed(String str) {
            return new a(b.f69264b, str);
        }

        public String getName() {
            return this.f69268b;
        }

        public b getType() {
            return this.f69267a;
        }

        public boolean isBackReference() {
            return this.f69267a == b.f69265c;
        }

        public boolean isManagedReference() {
            return this.f69267a == b.f69264b;
        }
    }

    public static c nopInstance() {
        return rc.s0.f84250b;
    }

    public static c pair(c cVar, c cVar2) {
        return new rc.z(cVar, cVar2);
    }

    public Collection<c> allIntrospectors() {
        return Collections.singletonList(this);
    }

    public String findClassDescription(rc.e eVar) {
        return null;
    }

    public Object findContentDeserializer(rc.b bVar) {
        return null;
    }

    public Object findContentSerializer(rc.b bVar) {
        return null;
    }

    public tb.m findCreatorAnnotation(lc.z zVar, rc.b bVar) {
        return null;
    }

    @Deprecated
    public tb.m findCreatorBinding(rc.b bVar) {
        return null;
    }

    public c1 findDefaultCreator(lc.z zVar, rc.e eVar, List<c1> list, List<c1> list2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Enum<?> findDefaultEnumValue(rc.e eVar, Enum<?>[] enumArr) {
        return findDefaultEnumValue(eVar.getRawType());
    }

    public Object findDeserializationContentConverter(rc.l lVar) {
        return null;
    }

    public Object findDeserializationConverter(rc.b bVar) {
        return null;
    }

    public Object findDeserializer(rc.b bVar) {
        return null;
    }

    @Deprecated
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
    }

    public Object findEnumNamingStrategy(lc.z zVar, rc.e eVar) {
        return null;
    }

    @Deprecated
    public String findEnumValue(Enum<?> r12) {
        return r12.name();
    }

    @Deprecated
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    public Object findFilterId(rc.b bVar) {
        return null;
    }

    public tb.t findFormat(rc.b bVar) {
        return tb.t.empty();
    }

    public String findImplicitPropertyName(rc.l lVar) {
        return null;
    }

    public tb.c findInjectableValue(rc.l lVar) {
        Object objFindInjectableValueId = findInjectableValueId(lVar);
        if (objFindInjectableValueId != null) {
            return tb.c.forId(objFindInjectableValueId);
        }
        return null;
    }

    @Deprecated
    public Object findInjectableValueId(rc.l lVar) {
        return null;
    }

    public Object findKeyDeserializer(rc.b bVar) {
        return null;
    }

    public Object findKeySerializer(rc.b bVar) {
        return null;
    }

    public Boolean findMergeInfo(rc.b bVar) {
        return null;
    }

    public n0 findNameForDeserialization(rc.b bVar) {
        return null;
    }

    public n0 findNameForSerialization(rc.b bVar) {
        return null;
    }

    public Object findNamingStrategy(rc.e eVar) {
        return null;
    }

    public Object findNullSerializer(rc.b bVar) {
        return null;
    }

    public rc.t0 findObjectIdInfo(rc.b bVar) {
        return null;
    }

    public Class<?> findPOJOBuilder(rc.e eVar) {
        return null;
    }

    public kc.h findPOJOBuilderConfig(rc.e eVar) {
        return null;
    }

    public y0 findPolymorphicTypeInfo(lc.z zVar, rc.b bVar) {
        return null;
    }

    public tb.k0 findPropertyAccess(rc.b bVar) {
        return null;
    }

    public List<n0> findPropertyAliases(rc.b bVar) {
        return null;
    }

    public wc.i findPropertyContentTypeResolver(lc.z zVar, rc.l lVar, o oVar) {
        return null;
    }

    public String findPropertyDefaultValue(rc.b bVar) {
        return null;
    }

    public String findPropertyDescription(rc.b bVar) {
        return null;
    }

    public tb.z findPropertyIgnoralByName(lc.z zVar, rc.b bVar) {
        return findPropertyIgnorals(bVar);
    }

    @Deprecated
    public tb.z findPropertyIgnorals(rc.b bVar) {
        return tb.z.empty();
    }

    public tb.d0 findPropertyInclusion(rc.b bVar) {
        return tb.d0.empty();
    }

    public tb.f0 findPropertyInclusionByName(lc.z zVar, rc.b bVar) {
        return tb.f0.all();
    }

    public Integer findPropertyIndex(rc.b bVar) {
        return null;
    }

    public wc.i findPropertyTypeResolver(lc.z zVar, rc.l lVar, o oVar) {
        return null;
    }

    public a findReferenceType(rc.l lVar) {
        return null;
    }

    public n0 findRenameByField(lc.z zVar, rc.i iVar, n0 n0Var) {
        return null;
    }

    public n0 findRootName(rc.e eVar) {
        return null;
    }

    public Object findSerializationContentConverter(rc.l lVar) {
        return null;
    }

    public Object findSerializationConverter(rc.b bVar) {
        return null;
    }

    public String[] findSerializationPropertyOrder(rc.e eVar) {
        return null;
    }

    public Boolean findSerializationSortAlphabetically(rc.b bVar) {
        return null;
    }

    public kc.k findSerializationTyping(rc.b bVar) {
        return null;
    }

    public Object findSerializer(rc.b bVar) {
        return null;
    }

    public tb.q0 findSetterInfo(rc.b bVar) {
        return tb.q0.empty();
    }

    public List<wc.c> findSubtypes(rc.b bVar) {
        return null;
    }

    public String findTypeName(rc.e eVar) {
        return null;
    }

    public wc.i findTypeResolver(lc.z zVar, rc.e eVar, o oVar) {
        return null;
    }

    public dd.a0 findUnwrappingNameTransformer(rc.l lVar) {
        return null;
    }

    public Object findValueInstantiator(rc.e eVar) {
        return null;
    }

    public Class<?>[] findViews(rc.b bVar) {
        return null;
    }

    public n0 findWrapperName(rc.b bVar) {
        return null;
    }

    public Boolean hasAnyGetter(rc.b bVar) {
        if ((bVar instanceof rc.m) && hasAnyGetterAnnotation((rc.m) bVar)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(rc.m mVar) {
        return false;
    }

    public Boolean hasAnySetter(rc.b bVar) {
        return null;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(rc.m mVar) {
        return false;
    }

    public Boolean hasAsKey(lc.z zVar, rc.b bVar) {
        return null;
    }

    public Boolean hasAsValue(rc.b bVar) {
        if ((bVar instanceof rc.m) && hasAsValueAnnotation((rc.m) bVar)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(rc.m mVar) {
        return false;
    }

    @Deprecated
    public boolean hasCreatorAnnotation(rc.b bVar) {
        return false;
    }

    public boolean hasIgnoreMarker(rc.l lVar) {
        return false;
    }

    public Boolean hasRequiredMarker(rc.l lVar) {
        return null;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return false;
    }

    public Boolean isIgnorableType(rc.e eVar) {
        return null;
    }

    public Boolean isTypeId(rc.l lVar) {
        return null;
    }

    public rc.m resolveSetterConflict(lc.z zVar, rc.m mVar, rc.m mVar2) {
        return null;
    }

    @Override // ub.q0
    public abstract ub.p0 version();

    public Collection<c> allIntrospectors(Collection<c> collection) {
        collection.add(this);
        return collection;
    }

    public void findEnumAliases(lc.z zVar, rc.e eVar, Enum<?>[] enumArr, String[][] strArr) {
    }

    public String[] findEnumValues(lc.z zVar, rc.e eVar, Enum<?>[] enumArr, String[] strArr) {
        return strArr;
    }

    @Deprecated
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return null;
    }

    public j1 findAutoDetectVisibility(rc.e eVar, j1 j1Var) {
        return j1Var;
    }

    public rc.t0 findObjectReferenceInfo(rc.b bVar, rc.t0 t0Var) {
        return t0Var;
    }

    public void findAndAddVirtualProperties(lc.z zVar, rc.e eVar, List<zc.d> list) {
    }

    public o refineDeserializationType(lc.z zVar, rc.b bVar, o oVar) throws r {
        return oVar;
    }

    public o refineSerializationType(lc.z zVar, rc.b bVar, o oVar) throws r {
        return oVar;
    }
}
