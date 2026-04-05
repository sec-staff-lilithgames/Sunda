package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.api.proto.Consentable;
import com.sfbx.appconsent.core.model.api.proto.DataCategoryProtoMapper;
import com.sfbx.appconsent.core.model.api.proto.DataRetention;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.Stack;
import com.sfbx.appconsent.core.model.api.proto.Vendor;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import com.sfbx.appconsent.core.model.api.proto.VendorUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.o0;
import uu.o1;
import uu.p1;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class VendorListCoreKt {
    public static final VendorListCore convertTo(VendorList vendorList) {
        e0.checkNotNullParameter(vendorList, "<this>");
        int gvlVersion = vendorList.getGvlVersion();
        List<Consentable> consentables = vendorList.getConsentables();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = consentables.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, o0.listOf(convertTo((Consentable) it.next())));
        }
        List<Vendor> vendors = vendorList.getVendors();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = vendors.iterator();
        while (it2.hasNext()) {
            v0.addAll(arrayList2, o0.listOf(convertTo((Vendor) it2.next())));
        }
        List<Stack> stacks = vendorList.getStacks();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = stacks.iterator();
        while (it3.hasNext()) {
            v0.addAll(arrayList3, o0.listOf(convertTo((Stack) it3.next())));
        }
        return new VendorListCore(gvlVersion, arrayList, arrayList2, arrayList3, vendorList.getCmpVersion(), vendorList.getTcfPolicyVersion(), vendorList.getPublisherCC(), vendorList.getPublisherRestrictions(), y0.toList(vendorList.getGeolocAds()), y0.toList(vendorList.getGeolocMarkets()), vendorList.getGoogleProvider(), vendorList.getConsentLifetime(), vendorList.getRemoveLegintables(), vendorList.getDataCategories());
    }

    public static final ConsentableCore convertTo(Consentable consentable) {
        e0.checkNotNullParameter(consentable, "<this>");
        int id2 = consentable.getId();
        Integer iabId = consentable.getIabId();
        String extraId = consentable.getExtraId();
        I18NStringCore i18NStringCoreConvertTo = I18NStringCoreKt.convertTo(consentable.getName());
        I18NStringCore i18NStringCoreConvertTo2 = I18NStringCoreKt.convertTo(consentable.getDescription());
        I18NStringCore i18NStringCoreConvertTo3 = I18NStringCoreKt.convertTo(consentable.getDescriptionLegal());
        I18NString illustrations = consentable.getIllustrations();
        return new ConsentableCore(id2, iabId, extraId, i18NStringCoreConvertTo, i18NStringCoreConvertTo2, i18NStringCoreConvertTo3, illustrations != null ? I18NStringCoreKt.convertTo(illustrations) : null, consentable.getType(), ACConsentStatusKt.convertTo(consentable.getStatus()), ACConsentStatusKt.convertTo(consentable.getLegintStatus()));
    }

    public static final VendorCore convertTo(Vendor vendor) {
        e0.checkNotNullParameter(vendor, "<this>");
        int id2 = vendor.getId();
        Integer iabId = vendor.getIabId();
        String extraId = vendor.getExtraId();
        String name = vendor.getName();
        String policyUrl = vendor.getPolicyUrl();
        Map<String, VendorUrl> urls = vendor.getUrls();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(urls.size()));
        Iterator<T> it = urls.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), convertTo((VendorUrl) entry.getValue()));
        }
        return new VendorCore(id2, iabId, extraId, name, policyUrl, p1.toMap(linkedHashMap), convertTo(vendor.getDataRetention()), y0.toList(vendor.getConsentables()), y0.toList(vendor.getLegintables()), y0.toList(vendor.getFlexibles()), ACConsentStatusKt.convertTo(vendor.getStatus()), ACConsentStatusKt.convertTo(vendor.getLegintStatus()), vendor.getCookieMaxAgeSeconds(), vendor.getUsesNonCookieAccess(), vendor.getGoogleAtpId(), vendor.getDataDeclaration());
    }

    public static final VendorUrlCore convertTo(VendorUrl vendorUrl) {
        e0.checkNotNullParameter(vendorUrl, "<this>");
        return new VendorUrlCore(vendorUrl.getPrivacy(), vendorUrl.getLegintClaim());
    }

    public static final DataRetentionCore convertTo(DataRetention dataRetention) {
        e0.checkNotNullParameter(dataRetention, "<this>");
        return new DataRetentionCore(dataRetention.getStdRetention(), p1.toMap(dataRetention.getPurposes()), p1.toMap(dataRetention.getSpecialPurposes()));
    }

    public static final DataCategoryProtoMapperCore convertTo(DataCategoryProtoMapper dataCategoryProtoMapper) {
        e0.checkNotNullParameter(dataCategoryProtoMapper, "<this>");
        return new DataCategoryProtoMapperCore(dataCategoryProtoMapper.getId(), I18NStringCoreKt.convertTo(dataCategoryProtoMapper.getName()));
    }

    public static final StackCore convertTo(Stack stack) {
        e0.checkNotNullParameter(stack, "<this>");
        return new StackCore(stack.getId(), stack.getIabId(), I18NStringCoreKt.convertTo(stack.getName()), I18NStringCoreKt.convertTo(stack.getDescription()), y0.toList(stack.getConsentables()), ACConsentStatusKt.convertTo(stack.getStatus()), ACConsentStatusKt.convertTo(stack.getLegintStatus()));
    }
}
