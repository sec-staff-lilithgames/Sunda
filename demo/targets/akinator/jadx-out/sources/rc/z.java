package rc;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jc.c;
import jc.w;
import jc.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class z extends jc.c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final jc.c f84295b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.c f84296c;

    public z(jc.c cVar, jc.c cVar2) {
        this.f84295b = cVar;
        this.f84296c = cVar2;
    }

    public static Object a(Class cls, Object obj) {
        if (obj == null || obj == cls) {
            return null;
        }
        if ((obj instanceof Class) && dd.i.isBogusClass((Class) obj)) {
            return null;
        }
        return obj;
    }

    public static boolean b(Class cls, Object obj) {
        if (obj == null || obj == cls) {
            return false;
        }
        if (obj instanceof Class) {
            return !dd.i.isBogusClass((Class) obj);
        }
        return true;
    }

    public static jc.c create(jc.c cVar, jc.c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new z(cVar, cVar2);
    }

    @Override // jc.c
    public Collection<jc.c> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    @Override // jc.c
    public void findAndAddVirtualProperties(lc.z zVar, e eVar, List<zc.d> list) {
        this.f84295b.findAndAddVirtualProperties(zVar, eVar, list);
        this.f84296c.findAndAddVirtualProperties(zVar, eVar, list);
    }

    @Override // jc.c
    public j1 findAutoDetectVisibility(e eVar, j1 j1Var) {
        return this.f84295b.findAutoDetectVisibility(eVar, this.f84296c.findAutoDetectVisibility(eVar, j1Var));
    }

    @Override // jc.c
    public String findClassDescription(e eVar) {
        String strFindClassDescription = this.f84295b.findClassDescription(eVar);
        return (strFindClassDescription == null || strFindClassDescription.isEmpty()) ? this.f84296c.findClassDescription(eVar) : strFindClassDescription;
    }

    @Override // jc.c
    public Object findContentDeserializer(b bVar) {
        Object objFindContentDeserializer = this.f84295b.findContentDeserializer(bVar);
        return b(jc.p.class, objFindContentDeserializer) ? objFindContentDeserializer : a(jc.p.class, this.f84296c.findContentDeserializer(bVar));
    }

    @Override // jc.c
    public Object findContentSerializer(b bVar) {
        Object objFindContentSerializer = this.f84295b.findContentSerializer(bVar);
        return b(w.a.class, objFindContentSerializer) ? objFindContentSerializer : a(w.a.class, this.f84296c.findContentSerializer(bVar));
    }

    @Override // jc.c
    public tb.m findCreatorAnnotation(lc.z zVar, b bVar) {
        tb.m mVarFindCreatorAnnotation = this.f84295b.findCreatorAnnotation(zVar, bVar);
        return mVarFindCreatorAnnotation == null ? this.f84296c.findCreatorAnnotation(zVar, bVar) : mVarFindCreatorAnnotation;
    }

    @Override // jc.c
    @Deprecated
    public tb.m findCreatorBinding(b bVar) {
        tb.m mVarFindCreatorBinding = this.f84295b.findCreatorBinding(bVar);
        return mVarFindCreatorBinding != null ? mVarFindCreatorBinding : this.f84296c.findCreatorBinding(bVar);
    }

    @Override // jc.c
    public c1 findDefaultCreator(lc.z zVar, e eVar, List<c1> list, List<c1> list2) {
        c1 c1VarFindDefaultCreator = this.f84295b.findDefaultCreator(zVar, eVar, list, list2);
        return c1VarFindDefaultCreator == null ? this.f84296c.findDefaultCreator(zVar, eVar, list, list2) : c1VarFindDefaultCreator;
    }

    @Override // jc.c
    @Deprecated
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        Enum<?> enumFindDefaultEnumValue = this.f84295b.findDefaultEnumValue(cls);
        return enumFindDefaultEnumValue == null ? this.f84296c.findDefaultEnumValue(cls) : enumFindDefaultEnumValue;
    }

    @Override // jc.c
    public Object findDeserializationContentConverter(l lVar) {
        Object objFindDeserializationContentConverter = this.f84295b.findDeserializationContentConverter(lVar);
        return objFindDeserializationContentConverter == null ? this.f84296c.findDeserializationContentConverter(lVar) : objFindDeserializationContentConverter;
    }

    @Override // jc.c
    public Object findDeserializationConverter(b bVar) {
        Object objFindDeserializationConverter = this.f84295b.findDeserializationConverter(bVar);
        return objFindDeserializationConverter == null ? this.f84296c.findDeserializationConverter(bVar) : objFindDeserializationConverter;
    }

    @Override // jc.c
    public Object findDeserializer(b bVar) {
        Object objFindDeserializer = this.f84295b.findDeserializer(bVar);
        return b(jc.p.class, objFindDeserializer) ? objFindDeserializer : a(jc.p.class, this.f84296c.findDeserializer(bVar));
    }

    @Override // jc.c
    @Deprecated
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        this.f84296c.findEnumAliases(cls, enumArr, strArr);
        this.f84295b.findEnumAliases(cls, enumArr, strArr);
    }

    @Override // jc.c
    public Object findEnumNamingStrategy(lc.z zVar, e eVar) {
        Object objFindEnumNamingStrategy = this.f84295b.findEnumNamingStrategy(zVar, eVar);
        return objFindEnumNamingStrategy == null ? this.f84296c.findEnumNamingStrategy(zVar, eVar) : objFindEnumNamingStrategy;
    }

    @Override // jc.c
    @Deprecated
    public String findEnumValue(Enum<?> r22) {
        String strFindEnumValue = this.f84295b.findEnumValue(r22);
        return strFindEnumValue == null ? this.f84296c.findEnumValue(r22) : strFindEnumValue;
    }

    @Override // jc.c
    @Deprecated
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this.f84295b.findEnumValues(cls, enumArr, this.f84296c.findEnumValues(cls, enumArr, strArr));
    }

    @Override // jc.c
    public Object findFilterId(b bVar) {
        Object objFindFilterId = this.f84295b.findFilterId(bVar);
        return objFindFilterId == null ? this.f84296c.findFilterId(bVar) : objFindFilterId;
    }

    @Override // jc.c
    public tb.t findFormat(b bVar) {
        tb.t tVarFindFormat = this.f84295b.findFormat(bVar);
        tb.t tVarFindFormat2 = this.f84296c.findFormat(bVar);
        return tVarFindFormat2 == null ? tVarFindFormat : tVarFindFormat2.withOverrides(tVarFindFormat);
    }

    @Override // jc.c
    public String findImplicitPropertyName(l lVar) {
        String strFindImplicitPropertyName = this.f84295b.findImplicitPropertyName(lVar);
        return strFindImplicitPropertyName == null ? this.f84296c.findImplicitPropertyName(lVar) : strFindImplicitPropertyName;
    }

    @Override // jc.c
    public tb.c findInjectableValue(l lVar) {
        tb.c cVarFindInjectableValue;
        tb.c cVarFindInjectableValue2 = this.f84295b.findInjectableValue(lVar);
        return ((cVarFindInjectableValue2 == null || cVarFindInjectableValue2.getUseInput() == null) && (cVarFindInjectableValue = this.f84296c.findInjectableValue(lVar)) != null) ? cVarFindInjectableValue2 == null ? cVarFindInjectableValue : cVarFindInjectableValue2.withUseInput(cVarFindInjectableValue.getUseInput()) : cVarFindInjectableValue2;
    }

    @Override // jc.c
    @Deprecated
    public Object findInjectableValueId(l lVar) {
        Object objFindInjectableValueId = this.f84295b.findInjectableValueId(lVar);
        return objFindInjectableValueId == null ? this.f84296c.findInjectableValueId(lVar) : objFindInjectableValueId;
    }

    @Override // jc.c
    public Object findKeyDeserializer(b bVar) {
        Object objFindKeyDeserializer = this.f84295b.findKeyDeserializer(bVar);
        return b(x.a.class, objFindKeyDeserializer) ? objFindKeyDeserializer : a(x.a.class, this.f84296c.findKeyDeserializer(bVar));
    }

    @Override // jc.c
    public Object findKeySerializer(b bVar) {
        Object objFindKeySerializer = this.f84295b.findKeySerializer(bVar);
        return b(w.a.class, objFindKeySerializer) ? objFindKeySerializer : a(w.a.class, this.f84296c.findKeySerializer(bVar));
    }

    @Override // jc.c
    public Boolean findMergeInfo(b bVar) {
        Boolean boolFindMergeInfo = this.f84295b.findMergeInfo(bVar);
        return boolFindMergeInfo == null ? this.f84296c.findMergeInfo(bVar) : boolFindMergeInfo;
    }

    @Override // jc.c
    public jc.n0 findNameForDeserialization(b bVar) {
        return jc.n0.merge(this.f84295b.findNameForDeserialization(bVar), this.f84296c.findNameForDeserialization(bVar));
    }

    @Override // jc.c
    public jc.n0 findNameForSerialization(b bVar) {
        return jc.n0.merge(this.f84295b.findNameForSerialization(bVar), this.f84296c.findNameForSerialization(bVar));
    }

    @Override // jc.c
    public Object findNamingStrategy(e eVar) {
        Object objFindNamingStrategy = this.f84295b.findNamingStrategy(eVar);
        return objFindNamingStrategy == null ? this.f84296c.findNamingStrategy(eVar) : objFindNamingStrategy;
    }

    @Override // jc.c
    public Object findNullSerializer(b bVar) {
        Object objFindNullSerializer = this.f84295b.findNullSerializer(bVar);
        return b(w.a.class, objFindNullSerializer) ? objFindNullSerializer : a(w.a.class, this.f84296c.findNullSerializer(bVar));
    }

    @Override // jc.c
    public t0 findObjectIdInfo(b bVar) {
        t0 t0VarFindObjectIdInfo = this.f84295b.findObjectIdInfo(bVar);
        return t0VarFindObjectIdInfo == null ? this.f84296c.findObjectIdInfo(bVar) : t0VarFindObjectIdInfo;
    }

    @Override // jc.c
    public t0 findObjectReferenceInfo(b bVar, t0 t0Var) {
        return this.f84295b.findObjectReferenceInfo(bVar, this.f84296c.findObjectReferenceInfo(bVar, t0Var));
    }

    @Override // jc.c
    public Class<?> findPOJOBuilder(e eVar) {
        Class<?> clsFindPOJOBuilder = this.f84295b.findPOJOBuilder(eVar);
        return clsFindPOJOBuilder == null ? this.f84296c.findPOJOBuilder(eVar) : clsFindPOJOBuilder;
    }

    @Override // jc.c
    public kc.h findPOJOBuilderConfig(e eVar) {
        kc.h hVarFindPOJOBuilderConfig = this.f84295b.findPOJOBuilderConfig(eVar);
        return hVarFindPOJOBuilderConfig == null ? this.f84296c.findPOJOBuilderConfig(eVar) : hVarFindPOJOBuilderConfig;
    }

    @Override // jc.c
    public tb.y0 findPolymorphicTypeInfo(lc.z zVar, b bVar) {
        tb.y0 y0VarFindPolymorphicTypeInfo = this.f84295b.findPolymorphicTypeInfo(zVar, bVar);
        return y0VarFindPolymorphicTypeInfo == null ? this.f84296c.findPolymorphicTypeInfo(zVar, bVar) : y0VarFindPolymorphicTypeInfo;
    }

    @Override // jc.c
    public tb.k0 findPropertyAccess(b bVar) {
        tb.k0 k0VarFindPropertyAccess = this.f84295b.findPropertyAccess(bVar);
        tb.k0 k0Var = tb.k0.f86732b;
        if (k0VarFindPropertyAccess != null && k0VarFindPropertyAccess != k0Var) {
            return k0VarFindPropertyAccess;
        }
        tb.k0 k0VarFindPropertyAccess2 = this.f84296c.findPropertyAccess(bVar);
        return k0VarFindPropertyAccess2 != null ? k0VarFindPropertyAccess2 : k0Var;
    }

    @Override // jc.c
    public List<jc.n0> findPropertyAliases(b bVar) {
        List<jc.n0> listFindPropertyAliases = this.f84295b.findPropertyAliases(bVar);
        return listFindPropertyAliases == null ? this.f84296c.findPropertyAliases(bVar) : listFindPropertyAliases;
    }

    @Override // jc.c
    public wc.i findPropertyContentTypeResolver(lc.z zVar, l lVar, jc.o oVar) {
        wc.i iVarFindPropertyContentTypeResolver = this.f84295b.findPropertyContentTypeResolver(zVar, lVar, oVar);
        return iVarFindPropertyContentTypeResolver == null ? this.f84296c.findPropertyContentTypeResolver(zVar, lVar, oVar) : iVarFindPropertyContentTypeResolver;
    }

    @Override // jc.c
    public String findPropertyDefaultValue(b bVar) {
        String strFindPropertyDefaultValue = this.f84295b.findPropertyDefaultValue(bVar);
        return (strFindPropertyDefaultValue == null || strFindPropertyDefaultValue.isEmpty()) ? this.f84296c.findPropertyDefaultValue(bVar) : strFindPropertyDefaultValue;
    }

    @Override // jc.c
    public String findPropertyDescription(b bVar) {
        String strFindPropertyDescription = this.f84295b.findPropertyDescription(bVar);
        return strFindPropertyDescription == null ? this.f84296c.findPropertyDescription(bVar) : strFindPropertyDescription;
    }

    @Override // jc.c
    public tb.z findPropertyIgnoralByName(lc.z zVar, b bVar) {
        tb.z zVarFindPropertyIgnoralByName = this.f84296c.findPropertyIgnoralByName(zVar, bVar);
        tb.z zVarFindPropertyIgnoralByName2 = this.f84295b.findPropertyIgnoralByName(zVar, bVar);
        return zVarFindPropertyIgnoralByName == null ? zVarFindPropertyIgnoralByName2 : zVarFindPropertyIgnoralByName.withOverrides(zVarFindPropertyIgnoralByName2);
    }

    @Override // jc.c
    @Deprecated
    public tb.z findPropertyIgnorals(b bVar) {
        tb.z zVarFindPropertyIgnorals = this.f84296c.findPropertyIgnorals(bVar);
        tb.z zVarFindPropertyIgnorals2 = this.f84295b.findPropertyIgnorals(bVar);
        return zVarFindPropertyIgnorals == null ? zVarFindPropertyIgnorals2 : zVarFindPropertyIgnorals.withOverrides(zVarFindPropertyIgnorals2);
    }

    @Override // jc.c
    public tb.d0 findPropertyInclusion(b bVar) {
        tb.d0 d0VarFindPropertyInclusion = this.f84296c.findPropertyInclusion(bVar);
        tb.d0 d0VarFindPropertyInclusion2 = this.f84295b.findPropertyInclusion(bVar);
        return d0VarFindPropertyInclusion == null ? d0VarFindPropertyInclusion2 : d0VarFindPropertyInclusion.withOverrides(d0VarFindPropertyInclusion2);
    }

    @Override // jc.c
    public tb.f0 findPropertyInclusionByName(lc.z zVar, b bVar) {
        tb.f0 f0VarFindPropertyInclusionByName = this.f84296c.findPropertyInclusionByName(zVar, bVar);
        tb.f0 f0VarFindPropertyInclusionByName2 = this.f84295b.findPropertyInclusionByName(zVar, bVar);
        return f0VarFindPropertyInclusionByName == null ? f0VarFindPropertyInclusionByName2 : f0VarFindPropertyInclusionByName.withOverrides(f0VarFindPropertyInclusionByName2);
    }

    @Override // jc.c
    public Integer findPropertyIndex(b bVar) {
        Integer numFindPropertyIndex = this.f84295b.findPropertyIndex(bVar);
        return numFindPropertyIndex == null ? this.f84296c.findPropertyIndex(bVar) : numFindPropertyIndex;
    }

    @Override // jc.c
    public wc.i findPropertyTypeResolver(lc.z zVar, l lVar, jc.o oVar) {
        wc.i iVarFindPropertyTypeResolver = this.f84295b.findPropertyTypeResolver(zVar, lVar, oVar);
        return iVarFindPropertyTypeResolver == null ? this.f84296c.findPropertyTypeResolver(zVar, lVar, oVar) : iVarFindPropertyTypeResolver;
    }

    @Override // jc.c
    public c.a findReferenceType(l lVar) {
        c.a aVarFindReferenceType = this.f84295b.findReferenceType(lVar);
        return aVarFindReferenceType == null ? this.f84296c.findReferenceType(lVar) : aVarFindReferenceType;
    }

    @Override // jc.c
    public jc.n0 findRenameByField(lc.z zVar, i iVar, jc.n0 n0Var) {
        return jc.n0.merge(this.f84296c.findRenameByField(zVar, iVar, n0Var), this.f84295b.findRenameByField(zVar, iVar, n0Var));
    }

    @Override // jc.c
    public jc.n0 findRootName(e eVar) {
        return jc.n0.merge(this.f84295b.findRootName(eVar), this.f84296c.findRootName(eVar));
    }

    @Override // jc.c
    public Object findSerializationContentConverter(l lVar) {
        Object objFindSerializationContentConverter = this.f84295b.findSerializationContentConverter(lVar);
        return objFindSerializationContentConverter == null ? this.f84296c.findSerializationContentConverter(lVar) : objFindSerializationContentConverter;
    }

    @Override // jc.c
    public Object findSerializationConverter(b bVar) {
        Object objFindSerializationConverter = this.f84295b.findSerializationConverter(bVar);
        return objFindSerializationConverter == null ? this.f84296c.findSerializationConverter(bVar) : objFindSerializationConverter;
    }

    @Override // jc.c
    public String[] findSerializationPropertyOrder(e eVar) {
        String[] strArrFindSerializationPropertyOrder = this.f84295b.findSerializationPropertyOrder(eVar);
        return strArrFindSerializationPropertyOrder == null ? this.f84296c.findSerializationPropertyOrder(eVar) : strArrFindSerializationPropertyOrder;
    }

    @Override // jc.c
    public Boolean findSerializationSortAlphabetically(b bVar) {
        Boolean boolFindSerializationSortAlphabetically = this.f84295b.findSerializationSortAlphabetically(bVar);
        return boolFindSerializationSortAlphabetically == null ? this.f84296c.findSerializationSortAlphabetically(bVar) : boolFindSerializationSortAlphabetically;
    }

    @Override // jc.c
    public kc.k findSerializationTyping(b bVar) {
        kc.k kVarFindSerializationTyping = this.f84295b.findSerializationTyping(bVar);
        return kVarFindSerializationTyping == null ? this.f84296c.findSerializationTyping(bVar) : kVarFindSerializationTyping;
    }

    @Override // jc.c
    public Object findSerializer(b bVar) {
        Object objFindSerializer = this.f84295b.findSerializer(bVar);
        return b(w.a.class, objFindSerializer) ? objFindSerializer : a(w.a.class, this.f84296c.findSerializer(bVar));
    }

    @Override // jc.c
    public tb.q0 findSetterInfo(b bVar) {
        tb.q0 q0VarFindSetterInfo = this.f84296c.findSetterInfo(bVar);
        tb.q0 q0VarFindSetterInfo2 = this.f84295b.findSetterInfo(bVar);
        return q0VarFindSetterInfo == null ? q0VarFindSetterInfo2 : q0VarFindSetterInfo.withOverrides(q0VarFindSetterInfo2);
    }

    @Override // jc.c
    public List<wc.c> findSubtypes(b bVar) {
        List<wc.c> listFindSubtypes = this.f84295b.findSubtypes(bVar);
        List<wc.c> listFindSubtypes2 = this.f84296c.findSubtypes(bVar);
        if (listFindSubtypes == null || listFindSubtypes.isEmpty()) {
            return listFindSubtypes2;
        }
        if (listFindSubtypes2 == null || listFindSubtypes2.isEmpty()) {
            return listFindSubtypes;
        }
        ArrayList arrayList = new ArrayList(listFindSubtypes2.size() + listFindSubtypes.size());
        arrayList.addAll(listFindSubtypes);
        arrayList.addAll(listFindSubtypes2);
        return arrayList;
    }

    @Override // jc.c
    public String findTypeName(e eVar) {
        String strFindTypeName = this.f84295b.findTypeName(eVar);
        return (strFindTypeName == null || strFindTypeName.isEmpty()) ? this.f84296c.findTypeName(eVar) : strFindTypeName;
    }

    @Override // jc.c
    public wc.i findTypeResolver(lc.z zVar, e eVar, jc.o oVar) {
        wc.i iVarFindTypeResolver = this.f84295b.findTypeResolver(zVar, eVar, oVar);
        return iVarFindTypeResolver == null ? this.f84296c.findTypeResolver(zVar, eVar, oVar) : iVarFindTypeResolver;
    }

    @Override // jc.c
    public dd.a0 findUnwrappingNameTransformer(l lVar) {
        dd.a0 a0VarFindUnwrappingNameTransformer = this.f84295b.findUnwrappingNameTransformer(lVar);
        return a0VarFindUnwrappingNameTransformer == null ? this.f84296c.findUnwrappingNameTransformer(lVar) : a0VarFindUnwrappingNameTransformer;
    }

    @Override // jc.c
    public Object findValueInstantiator(e eVar) {
        Object objFindValueInstantiator = this.f84295b.findValueInstantiator(eVar);
        return objFindValueInstantiator == null ? this.f84296c.findValueInstantiator(eVar) : objFindValueInstantiator;
    }

    @Override // jc.c
    public Class<?>[] findViews(b bVar) {
        Class<?>[] clsArrFindViews = this.f84295b.findViews(bVar);
        return clsArrFindViews == null ? this.f84296c.findViews(bVar) : clsArrFindViews;
    }

    @Override // jc.c
    public jc.n0 findWrapperName(b bVar) {
        return jc.n0.merge(this.f84295b.findWrapperName(bVar), this.f84296c.findWrapperName(bVar));
    }

    @Override // jc.c
    public Boolean hasAnyGetter(b bVar) {
        Boolean boolHasAnyGetter = this.f84295b.hasAnyGetter(bVar);
        return boolHasAnyGetter == null ? this.f84296c.hasAnyGetter(bVar) : boolHasAnyGetter;
    }

    @Override // jc.c
    @Deprecated
    public boolean hasAnyGetterAnnotation(m mVar) {
        return this.f84295b.hasAnyGetterAnnotation(mVar) || this.f84296c.hasAnyGetterAnnotation(mVar);
    }

    @Override // jc.c
    public Boolean hasAnySetter(b bVar) {
        Boolean boolHasAnySetter = this.f84295b.hasAnySetter(bVar);
        return boolHasAnySetter == null ? this.f84296c.hasAnySetter(bVar) : boolHasAnySetter;
    }

    @Override // jc.c
    @Deprecated
    public boolean hasAnySetterAnnotation(m mVar) {
        return this.f84295b.hasAnySetterAnnotation(mVar) || this.f84296c.hasAnySetterAnnotation(mVar);
    }

    @Override // jc.c
    public Boolean hasAsKey(lc.z zVar, b bVar) {
        Boolean boolHasAsKey = this.f84295b.hasAsKey(zVar, bVar);
        return boolHasAsKey == null ? this.f84296c.hasAsKey(zVar, bVar) : boolHasAsKey;
    }

    @Override // jc.c
    public Boolean hasAsValue(b bVar) {
        Boolean boolHasAsValue = this.f84295b.hasAsValue(bVar);
        return boolHasAsValue == null ? this.f84296c.hasAsValue(bVar) : boolHasAsValue;
    }

    @Override // jc.c
    @Deprecated
    public boolean hasAsValueAnnotation(m mVar) {
        return this.f84295b.hasAsValueAnnotation(mVar) || this.f84296c.hasAsValueAnnotation(mVar);
    }

    @Override // jc.c
    @Deprecated
    public boolean hasCreatorAnnotation(b bVar) {
        return this.f84295b.hasCreatorAnnotation(bVar) || this.f84296c.hasCreatorAnnotation(bVar);
    }

    @Override // jc.c
    public boolean hasIgnoreMarker(l lVar) {
        return this.f84295b.hasIgnoreMarker(lVar) || this.f84296c.hasIgnoreMarker(lVar);
    }

    @Override // jc.c
    public Boolean hasRequiredMarker(l lVar) {
        Boolean boolHasRequiredMarker = this.f84295b.hasRequiredMarker(lVar);
        return boolHasRequiredMarker == null ? this.f84296c.hasRequiredMarker(lVar) : boolHasRequiredMarker;
    }

    @Override // jc.c
    public boolean isAnnotationBundle(Annotation annotation) {
        return this.f84295b.isAnnotationBundle(annotation) || this.f84296c.isAnnotationBundle(annotation);
    }

    @Override // jc.c
    public Boolean isIgnorableType(e eVar) {
        Boolean boolIsIgnorableType = this.f84295b.isIgnorableType(eVar);
        return boolIsIgnorableType == null ? this.f84296c.isIgnorableType(eVar) : boolIsIgnorableType;
    }

    @Override // jc.c
    public Boolean isTypeId(l lVar) {
        Boolean boolIsTypeId = this.f84295b.isTypeId(lVar);
        return boolIsTypeId == null ? this.f84296c.isTypeId(lVar) : boolIsTypeId;
    }

    @Override // jc.c
    public jc.o refineDeserializationType(lc.z zVar, b bVar, jc.o oVar) throws jc.r {
        return this.f84295b.refineDeserializationType(zVar, bVar, this.f84296c.refineDeserializationType(zVar, bVar, oVar));
    }

    @Override // jc.c
    public jc.o refineSerializationType(lc.z zVar, b bVar, jc.o oVar) throws jc.r {
        return this.f84295b.refineSerializationType(zVar, bVar, this.f84296c.refineSerializationType(zVar, bVar, oVar));
    }

    @Override // jc.c
    public m resolveSetterConflict(lc.z zVar, m mVar, m mVar2) {
        m mVarResolveSetterConflict = this.f84295b.resolveSetterConflict(zVar, mVar, mVar2);
        return mVarResolveSetterConflict == null ? this.f84296c.resolveSetterConflict(zVar, mVar, mVar2) : mVarResolveSetterConflict;
    }

    @Override // jc.c, ub.q0
    public ub.p0 version() {
        return this.f84295b.version();
    }

    @Override // jc.c
    public Collection<jc.c> allIntrospectors(Collection<jc.c> collection) {
        this.f84295b.allIntrospectors(collection);
        this.f84296c.allIntrospectors(collection);
        return collection;
    }

    @Override // jc.c
    public Enum<?> findDefaultEnumValue(e eVar, Enum<?>[] enumArr) {
        Enum<?> enumFindDefaultEnumValue = this.f84295b.findDefaultEnumValue(eVar, enumArr);
        return enumFindDefaultEnumValue == null ? this.f84296c.findDefaultEnumValue(eVar, enumArr) : enumFindDefaultEnumValue;
    }

    @Override // jc.c
    public void findEnumAliases(lc.z zVar, e eVar, Enum<?>[] enumArr, String[][] strArr) {
        this.f84296c.findEnumAliases(zVar, eVar, enumArr, strArr);
        this.f84295b.findEnumAliases(zVar, eVar, enumArr, strArr);
    }

    @Override // jc.c
    public String[] findEnumValues(lc.z zVar, e eVar, Enum<?>[] enumArr, String[] strArr) {
        return this.f84295b.findEnumValues(zVar, eVar, enumArr, this.f84296c.findEnumValues(zVar, eVar, enumArr, strArr));
    }
}
