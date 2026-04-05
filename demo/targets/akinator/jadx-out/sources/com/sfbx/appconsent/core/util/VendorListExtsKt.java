package com.sfbx.appconsent.core.util;

import ac.Models;
import com.google.protobuf.Timestamp;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.DataCategoryCore;
import com.sfbx.appconsent.core.model.FloatingConsent;
import com.sfbx.appconsent.core.model.api.proto.Consentable;
import com.sfbx.appconsent.core.model.api.proto.DataCategoryProtoMapper;
import com.sfbx.appconsent.core.model.api.proto.DataRetention;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.Stack;
import com.sfbx.appconsent.core.model.api.proto.Vendor;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import com.sfbx.appconsent.core.model.api.proto.VendorUrl;
import com.sfbx.appconsent.core.model.reducer.TimestampSurrogate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.o1;
import uu.p0;
import uu.p1;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorListExtsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Models.ConsentFloatingExtraPurposeType.values().length];
            try {
                iArr[Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_DENY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConsentStatus.values().length];
            try {
                iArr2[ConsentStatus.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ConsentStatus.DISALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final DataCategoryCore toCore(Models.Vendorlist.DataCategory dataCategory) {
        e0.checkNotNullParameter(dataCategory, "<this>");
        int id2 = dataCategory.getId();
        Models.I18NString name = dataCategory.getName();
        e0.checkNotNullExpressionValue(name, "name");
        return new DataCategoryCore(id2, HelloReplyExtsKt.toCoreModel(name));
    }

    public static final VendorList toCoreModel(Models.Vendorlist vendorlist) {
        e0.checkNotNullParameter(vendorlist, "<this>");
        Map<Integer, Models.Vendorlist.DataCategory> dataCategoriesMap = vendorlist.getDataCategoriesMap();
        e0.checkNotNullExpressionValue(dataCategoriesMap, "dataCategoriesMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(dataCategoriesMap.size()));
        Iterator<T> it = dataCategoriesMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            e0.checkNotNullExpressionValue(value, "it.value");
            linkedHashMap.put(key, toCore((Models.Vendorlist.DataCategory) value));
        }
        int iabGvl = vendorlist.getIabGvl();
        List<Models.Vendorlist.Consentable> consentablesList = vendorlist.getConsentablesList();
        e0.checkNotNullExpressionValue(consentablesList, "consentablesList");
        List<Models.Vendorlist.Consentable> list = consentablesList;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        for (Models.Vendorlist.Consentable it2 : list) {
            e0.checkNotNullExpressionValue(it2, "it");
            arrayList.add(toCoreModel(it2));
        }
        List<Models.Vendorlist.Vendor> vendorsList = vendorlist.getVendorsList();
        e0.checkNotNullExpressionValue(vendorsList, "vendorsList");
        List<Models.Vendorlist.Vendor> list2 = vendorsList;
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
        for (Models.Vendorlist.Vendor it3 : list2) {
            e0.checkNotNullExpressionValue(it3, "it");
            arrayList2.add(toCoreModel(it3));
        }
        List<Models.Vendorlist.Stack> stacksList = vendorlist.getStacksList();
        e0.checkNotNullExpressionValue(stacksList, "stacksList");
        List<Models.Vendorlist.Stack> list3 = stacksList;
        ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(list3, 10));
        for (Models.Vendorlist.Stack it4 : list3) {
            e0.checkNotNullExpressionValue(it4, "it");
            arrayList3.add(toCoreModel(it4));
        }
        int tcfPolicyVersion = vendorlist.getTcfPolicyVersion();
        String publisherCc = vendorlist.getPublisherCc();
        String publisherRestrictions = vendorlist.getPublisherRestrictions();
        List<Integer> geolocAdList = vendorlist.getGeolocAdList();
        List<Integer> geolocMarketList = vendorlist.getGeolocMarketList();
        String googleProviders = vendorlist.getGoogleProviders();
        e0.checkNotNullExpressionValue(googleProviders, "googleProviders");
        String googleProviders2 = googleProviders.length() == 0 ? null : vendorlist.getGoogleProviders();
        int consentLifetime = vendorlist.getConsentLifetime();
        boolean removeLegintables = vendorlist.getRemoveLegintables();
        e0.checkNotNullExpressionValue(publisherCc, "publisherCc");
        e0.checkNotNullExpressionValue(publisherRestrictions, "publisherRestrictions");
        e0.checkNotNullExpressionValue(geolocAdList, "geolocAdList");
        e0.checkNotNullExpressionValue(geolocMarketList, "geolocMarketList");
        return new VendorList(iabGvl, arrayList, linkedHashMap, arrayList2, arrayList3, 0, tcfPolicyVersion, publisherCc, publisherRestrictions, geolocAdList, geolocMarketList, googleProviders2, consentLifetime, removeLegintables, 32, (u) null);
    }

    public static final Models.Vendorlist.DataCategory toProto(DataCategoryCore dataCategoryCore) {
        e0.checkNotNullParameter(dataCategoryCore, "<this>");
        return Models.Vendorlist.DataCategory.newBuilder().setId(dataCategoryCore.getId()).setName(HelloReplyExtsKt.toProtoModel(dataCategoryCore.getName())).build();
    }

    public static final Models.Vendorlist toProtoModel(VendorList vendorList) {
        e0.checkNotNullParameter(vendorList, "<this>");
        Models.Vendorlist.Builder builderAddAllGeolocMarket = Models.Vendorlist.newBuilder().setIabGvl(vendorList.getGvlVersion()).setTcfPolicyVersion(vendorList.getTcfPolicyVersion()).setPublisherCc(vendorList.getPublisherCC()).setPublisherRestrictions(vendorList.getPublisherRestrictions()).addAllGeolocAd(vendorList.getGeolocAds()).addAllGeolocMarket(vendorList.getGeolocMarkets());
        String googleProvider = vendorList.getGoogleProvider();
        if (googleProvider == null) {
            googleProvider = "";
        }
        Models.Vendorlist.Builder consentLifetime = builderAddAllGeolocMarket.setGoogleProviders(googleProvider).setConsentLifetime(vendorList.getConsentLifetime());
        List<Consentable> consentables = vendorList.getConsentables();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(consentables, 10));
        Iterator<T> it = consentables.iterator();
        while (it.hasNext()) {
            arrayList.add(toProtoModel((Consentable) it.next()));
        }
        Models.Vendorlist.Builder builderAddAllConsentables = consentLifetime.addAllConsentables(arrayList);
        List<Vendor> vendors = vendorList.getVendors();
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(vendors, 10));
        Iterator<T> it2 = vendors.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toProtoModel((Vendor) it2.next()));
        }
        Models.Vendorlist.Builder builderAddAllVendors = builderAddAllConsentables.addAllVendors(arrayList2);
        List<Stack> stacks = vendorList.getStacks();
        ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(stacks, 10));
        Iterator<T> it3 = stacks.iterator();
        while (it3.hasNext()) {
            arrayList3.add(toProtoModel((Stack) it3.next()));
        }
        Models.Vendorlist.Builder removeLegintables = builderAddAllVendors.addAllStacks(arrayList3).setRemoveLegintables(vendorList.getRemoveLegintables());
        Map<Integer, DataCategoryCore> dataCategories = vendorList.getDataCategories();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(dataCategories.size()));
        Iterator<T> it4 = dataCategories.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            linkedHashMap.put(entry.getKey(), toProto((DataCategoryCore) entry.getValue()));
        }
        return removeLegintables.putAllDataCategories(linkedHashMap).build();
    }

    public static final Consentable toCoreModel(Models.Vendorlist.Consentable consentable) {
        e0.checkNotNullParameter(consentable, "<this>");
        int id2 = consentable.getId();
        Integer numValueOf = consentable.getIabId() == 0 ? null : Integer.valueOf(consentable.getIabId());
        String extraId = consentable.getExtraId();
        e0.checkNotNullExpressionValue(extraId, "extraId");
        String extraId2 = extraId.length() != 0 ? consentable.getExtraId() : null;
        Models.I18NString name = consentable.getName();
        e0.checkNotNullExpressionValue(name, "name");
        I18NString coreModel = HelloReplyExtsKt.toCoreModel(name);
        Models.I18NString description = consentable.getDescription();
        e0.checkNotNullExpressionValue(description, "description");
        I18NString coreModel2 = HelloReplyExtsKt.toCoreModel(description);
        Models.I18NString descriptionLegal = consentable.getDescriptionLegal();
        e0.checkNotNullExpressionValue(descriptionLegal, "descriptionLegal");
        I18NString coreModel3 = HelloReplyExtsKt.toCoreModel(descriptionLegal);
        Models.I18NString illustrations = consentable.getIllustrations();
        e0.checkNotNullExpressionValue(illustrations, "illustrations");
        return new Consentable(id2, numValueOf, extraId2, coreModel, coreModel2, coreModel3, HelloReplyExtsKt.toCoreModel(illustrations), consentable.getTypeValue(), (ConsentStatus) null, (ConsentStatus) null, Integer.valueOf(consentable.getVendorsNumber()), 768, (u) null);
    }

    public static final Models.Vendorlist.Consentable toProtoModel(Consentable consentable) {
        Models.I18NString defaultInstance;
        e0.checkNotNullParameter(consentable, "<this>");
        Models.Vendorlist.Consentable.Builder id2 = Models.Vendorlist.Consentable.newBuilder().setId(consentable.getId());
        Integer iabId = consentable.getIabId();
        Models.Vendorlist.Consentable.Builder iabId2 = id2.setIabId(iabId != null ? iabId.intValue() : 0);
        String extraId = consentable.getExtraId();
        if (extraId == null) {
            extraId = "";
        }
        Models.Vendorlist.Consentable.Builder descriptionLegal = iabId2.setExtraId(extraId).setName(HelloReplyExtsKt.toProtoModel(consentable.getName())).setDescription(HelloReplyExtsKt.toProtoModel(consentable.getDescription())).setDescriptionLegal(HelloReplyExtsKt.toProtoModel(consentable.getDescriptionLegal()));
        I18NString illustrations = consentable.getIllustrations();
        if (illustrations == null || (defaultInstance = HelloReplyExtsKt.toProtoModel(illustrations)) == null) {
            defaultInstance = Models.I18NString.getDefaultInstance();
        }
        Models.Vendorlist.Consentable.Builder typeValue = descriptionLegal.setIllustrations(defaultInstance).setTypeValue(consentable.getType());
        Integer vendorsNumber = consentable.getVendorsNumber();
        return typeValue.setVendorsNumber(vendorsNumber != null ? vendorsNumber.intValue() : 0).build();
    }

    public static final Vendor toCoreModel(Models.Vendorlist.Vendor vendor) {
        e0.checkNotNullParameter(vendor, "<this>");
        int id2 = vendor.getId();
        Integer numValueOf = vendor.getIabId() == 0 ? null : Integer.valueOf(vendor.getIabId());
        String extraId = vendor.getExtraId();
        e0.checkNotNullExpressionValue(extraId, "extraId");
        String extraId2 = extraId.length() != 0 ? vendor.getExtraId() : null;
        String name = vendor.getName();
        String policyUrl = vendor.getPolicyUrl();
        Models.Vendorlist.Vendor.DataRetention dataRetention = vendor.getDataRetention();
        e0.checkNotNullExpressionValue(dataRetention, "dataRetention");
        DataRetention coreModel = HelloReplyExtsKt.toCoreModel(dataRetention);
        Map<String, Models.Vendorlist.Vendor.VendorUrl> urlsMap = vendor.getUrlsMap();
        e0.checkNotNullExpressionValue(urlsMap, "urlsMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(urlsMap.size()));
        Iterator<T> it = urlsMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new VendorUrl(((Models.Vendorlist.Vendor.VendorUrl) entry.getValue()).getPrivacy(), ((Models.Vendorlist.Vendor.VendorUrl) entry.getValue()).getLegintClaim()));
        }
        List<Integer> consentablesList = vendor.getConsentablesList();
        List<Integer> legintablesList = vendor.getLegintablesList();
        List<Integer> flexiblesList = vendor.getFlexiblesList();
        long cookieMaxAgeSeconds = vendor.getCookieMaxAgeSeconds();
        boolean usesNonCookieAccess = vendor.getUsesNonCookieAccess();
        int googleAtpId = vendor.getGoogleAtpId();
        List<Integer> dataDeclarationList = vendor.getDataDeclarationList();
        Integer num = numValueOf;
        e0.checkNotNullExpressionValue(name, "name");
        e0.checkNotNullExpressionValue(policyUrl, "policyUrl");
        e0.checkNotNullExpressionValue(consentablesList, "consentablesList");
        e0.checkNotNullExpressionValue(legintablesList, "legintablesList");
        e0.checkNotNullExpressionValue(flexiblesList, "flexiblesList");
        Long lValueOf = Long.valueOf(cookieMaxAgeSeconds);
        Boolean boolValueOf = Boolean.valueOf(usesNonCookieAccess);
        Integer numValueOf2 = Integer.valueOf(googleAtpId);
        e0.checkNotNullExpressionValue(dataDeclarationList, "dataDeclarationList");
        return new Vendor(id2, num, extraId2, name, policyUrl, linkedHashMap, coreModel, consentablesList, legintablesList, flexiblesList, (ConsentStatus) null, (ConsentStatus) null, lValueOf, boolValueOf, numValueOf2, dataDeclarationList, 3072, (u) null);
    }

    public static final Models.Vendorlist.Vendor toProtoModel(Vendor vendor) {
        e0.checkNotNullParameter(vendor, "<this>");
        Models.Vendorlist.Vendor.Builder id2 = Models.Vendorlist.Vendor.newBuilder().setId(vendor.getId());
        Integer iabId = vendor.getIabId();
        Models.Vendorlist.Vendor.Builder iabId2 = id2.setIabId(iabId != null ? iabId.intValue() : 0);
        String extraId = vendor.getExtraId();
        if (extraId == null) {
            extraId = "";
        }
        Models.Vendorlist.Vendor.Builder builderAddAllDataCategories = iabId2.setExtraId(extraId).setName(vendor.getName()).setPolicyUrl(vendor.getPolicyUrl()).setDataRetention(toProtoModel(vendor.getDataRetention())).addAllDataCategories(p0.emptyList());
        Map<String, VendorUrl> urls = vendor.getUrls();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(urls.size()));
        Iterator<T> it = urls.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Models.Vendorlist.Vendor.VendorUrl.Builder builderNewBuilder = Models.Vendorlist.Vendor.VendorUrl.newBuilder();
            String privacy = ((VendorUrl) entry.getValue()).getPrivacy();
            if (privacy == null) {
                privacy = "";
            }
            Models.Vendorlist.Vendor.VendorUrl.Builder privacy2 = builderNewBuilder.setPrivacy(privacy);
            String legintClaim = ((VendorUrl) entry.getValue()).getLegintClaim();
            if (legintClaim == null) {
                legintClaim = "";
            }
            linkedHashMap.put(key, privacy2.setLegintClaim(legintClaim).build());
        }
        Models.Vendorlist.Vendor.Builder builderAddAllDataDeclaration = builderAddAllDataCategories.putAllUrls(linkedHashMap).addAllConsentables(vendor.getConsentables()).addAllLegintables(vendor.getLegintables()).addAllFlexibles(vendor.getFlexibles()).addAllDataDeclaration(vendor.getDataDeclaration());
        Boolean usesNonCookieAccess = vendor.getUsesNonCookieAccess();
        Models.Vendorlist.Vendor.Builder usesNonCookieAccess2 = builderAddAllDataDeclaration.setUsesNonCookieAccess(usesNonCookieAccess != null ? usesNonCookieAccess.booleanValue() : false);
        Long cookieMaxAgeSeconds = vendor.getCookieMaxAgeSeconds();
        Models.Vendorlist.Vendor.Builder cookieMaxAgeSeconds2 = usesNonCookieAccess2.setCookieMaxAgeSeconds(cookieMaxAgeSeconds != null ? cookieMaxAgeSeconds.longValue() : 0L);
        Integer googleAtpId = vendor.getGoogleAtpId();
        return cookieMaxAgeSeconds2.setGoogleAtpId(googleAtpId != null ? googleAtpId.intValue() : 0).build();
    }

    public static final Models.Vendorlist.DataCategory toProtoModel(DataCategoryProtoMapper dataCategoryProtoMapper) {
        e0.checkNotNullParameter(dataCategoryProtoMapper, "<this>");
        return Models.Vendorlist.DataCategory.newBuilder().setId(dataCategoryProtoMapper.getId()).setName(HelloReplyExtsKt.toProtoModel(dataCategoryProtoMapper.getName())).build();
    }

    public static final Models.ConsentFloatingExtraPurpose toProtoModel(FloatingConsent floatingConsent) {
        Models.ConsentFloatingExtraPurposeType consentFloatingExtraPurposeType;
        Timestamp defaultInstance;
        e0.checkNotNullParameter(floatingConsent, "<this>");
        Models.ConsentFloatingExtraPurpose.Builder builderNewBuilder = Models.ConsentFloatingExtraPurpose.newBuilder();
        String uuid = floatingConsent.getUuid();
        if (uuid == null) {
            uuid = "";
        }
        Models.ConsentFloatingExtraPurpose.Builder uuid2 = builderNewBuilder.setUuid(uuid);
        String id2 = floatingConsent.getId();
        Models.ConsentFloatingExtraPurpose.Builder extraId = uuid2.setExtraId(id2 != null ? id2 : "");
        Integer version = floatingConsent.getVersion();
        Models.ConsentFloatingExtraPurpose.Builder version2 = extraId.setVersion(version != null ? version.intValue() : 0);
        Map<String, String> externalIds = floatingConsent.getExternalIds();
        if (externalIds == null) {
            externalIds = p1.emptyMap();
        }
        Models.ConsentFloatingExtraPurpose.Builder builderPutAllExternalIds = version2.putAllExternalIds(externalIds);
        ConsentStatus status = floatingConsent.getStatus();
        int i10 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i10 == 1) {
            consentFloatingExtraPurposeType = Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_ACCEPT;
        } else if (i10 != 2) {
            consentFloatingExtraPurposeType = Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_UNKNOWN;
        } else {
            consentFloatingExtraPurposeType = Models.ConsentFloatingExtraPurposeType.ConsentFloatingExtraPurposeType_DENY;
        }
        Models.ConsentFloatingExtraPurpose.Builder type = builderPutAllExternalIds.setType(consentFloatingExtraPurposeType);
        if (floatingConsent.getGivenAt() != null) {
            defaultInstance = Timestamp.newBuilder().setSeconds(floatingConsent.getGivenAt().getSeconds()).setNanos(floatingConsent.getGivenAt().getNanos()).build();
        } else {
            defaultInstance = Timestamp.getDefaultInstance();
        }
        return type.setGivenAt(defaultInstance).build();
    }

    public static final DataCategoryProtoMapper toCoreModel(Models.Vendorlist.DataCategory dataCategory) {
        e0.checkNotNullParameter(dataCategory, "<this>");
        int id2 = dataCategory.getId();
        Models.I18NString name = dataCategory.getName();
        e0.checkNotNullExpressionValue(name, "name");
        return new DataCategoryProtoMapper(id2, HelloReplyExtsKt.toCoreModel(name));
    }

    public static final Stack toCoreModel(Models.Vendorlist.Stack stack) {
        e0.checkNotNullParameter(stack, "<this>");
        int id2 = stack.getId();
        Integer numValueOf = stack.getIabId() == 0 ? null : Integer.valueOf(stack.getIabId());
        Models.I18NString name = stack.getName();
        e0.checkNotNullExpressionValue(name, "name");
        I18NString coreModel = HelloReplyExtsKt.toCoreModel(name);
        Models.I18NString description = stack.getDescription();
        e0.checkNotNullExpressionValue(description, "description");
        I18NString coreModel2 = HelloReplyExtsKt.toCoreModel(description);
        List<Integer> consentablesList = stack.getConsentablesList();
        e0.checkNotNullExpressionValue(consentablesList, "consentablesList");
        return new Stack(id2, numValueOf, coreModel, coreModel2, consentablesList, (ConsentStatus) null, (ConsentStatus) null, Integer.valueOf(stack.getVendorsNumber()), 96, (u) null);
    }

    public static final FloatingConsent toCoreModel(Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
        ConsentStatus consentStatus;
        e0.checkNotNullParameter(consentFloatingExtraPurpose, "<this>");
        String extraId = consentFloatingExtraPurpose.getExtraId();
        Map<String, String> externalIdsMap = consentFloatingExtraPurpose.getExternalIdsMap();
        Integer numValueOf = Integer.valueOf(consentFloatingExtraPurpose.getVersion());
        String uuid = consentFloatingExtraPurpose.getUuid();
        TimestampSurrogate timestampSurrogate = new TimestampSurrogate(consentFloatingExtraPurpose.getGivenAt().getNanos(), consentFloatingExtraPurpose.getGivenAt().getSeconds());
        Models.ConsentFloatingExtraPurposeType type = consentFloatingExtraPurpose.getType();
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            consentStatus = ConsentStatus.ALLOWED;
        } else if (i10 != 2) {
            consentStatus = ConsentStatus.UNDEFINED;
        } else {
            consentStatus = ConsentStatus.DISALLOWED;
        }
        return new FloatingConsent(extraId, externalIdsMap, numValueOf, uuid, timestampSurrogate, consentStatus);
    }

    public static final Models.Vendorlist.Stack toProtoModel(Stack stack) {
        e0.checkNotNullParameter(stack, "<this>");
        Models.Vendorlist.Stack.Builder id2 = Models.Vendorlist.Stack.newBuilder().setId(stack.getId());
        Integer iabId = stack.getIabId();
        Models.Vendorlist.Stack.Builder builderAddAllConsentables = id2.setIabId(iabId != null ? iabId.intValue() : 0).setName(HelloReplyExtsKt.toProtoModel(stack.getName())).setDescription(HelloReplyExtsKt.toProtoModel(stack.getDescription())).addAllConsentables(stack.getConsentables());
        Integer vendorsNumber = stack.getVendorsNumber();
        return builderAddAllConsentables.setVendorsNumber(vendorsNumber != null ? vendorsNumber.intValue() : 0).build();
    }

    public static final Models.Vendorlist.Vendor.DataRetention toProtoModel(DataRetention dataRetention) {
        e0.checkNotNullParameter(dataRetention, "<this>");
        return Models.Vendorlist.Vendor.DataRetention.newBuilder().setStdRetention(dataRetention.getStdRetention()).putAllPurposes(dataRetention.getPurposes()).putAllSpecialPurposes(dataRetention.getSpecialPurposes()).build();
    }
}
