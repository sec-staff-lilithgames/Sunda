package com.sfbx.appconsent.core.util;

import ac.AcError;
import ac.Api;
import ac.Models;
import com.sfbx.appconsent.core.model.FloatingConsent;
import com.sfbx.appconsent.core.model.api.proto.Configuration;
import com.sfbx.appconsent.core.model.api.proto.Consent;
import com.sfbx.appconsent.core.model.api.proto.CountryProto;
import com.sfbx.appconsent.core.model.api.proto.DataRetention;
import com.sfbx.appconsent.core.model.api.proto.ErrorCode;
import com.sfbx.appconsent.core.model.api.proto.ErrorResponse;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HelloReplyExtsKt {
    public static final HelloReply toCoreModel(Api.HelloReply helloReply) {
        ErrorResponse coreModel;
        Configuration coreModel2;
        Consent coreModel3;
        VendorList coreModel4;
        e0.checkNotNullParameter(helloReply, "<this>");
        FloatingConsent coreModel5 = null;
        if (e0.areEqual(helloReply.getError(), AcError.ErrorResponse.getDefaultInstance())) {
            coreModel = null;
        } else {
            AcError.ErrorResponse error = helloReply.getError();
            e0.checkNotNullExpressionValue(error, "error");
            coreModel = toCoreModel(error);
        }
        String uuid = helloReply.getUuid();
        if (e0.areEqual(helloReply.getConfiguration(), Models.Configuration.getDefaultInstance())) {
            coreModel2 = null;
        } else {
            Models.Configuration configuration = helloReply.getConfiguration();
            e0.checkNotNullExpressionValue(configuration, "configuration");
            coreModel2 = toCoreModel(configuration);
        }
        if (e0.areEqual(helloReply.getConsent(), Models.Consent.getDefaultInstance())) {
            coreModel3 = null;
        } else {
            Models.Consent consent = helloReply.getConsent();
            e0.checkNotNullExpressionValue(consent, "consent");
            coreModel3 = toCoreModel(consent);
        }
        if (e0.areEqual(helloReply.getVendorlist(), Models.Vendorlist.getDefaultInstance())) {
            coreModel4 = null;
        } else {
            Models.Vendorlist vendorlist = helloReply.getVendorlist();
            e0.checkNotNullExpressionValue(vendorlist, "vendorlist");
            coreModel4 = VendorListExtsKt.toCoreModel(vendorlist);
        }
        String cmpHash = helloReply.getCmpHash();
        e0.checkNotNullExpressionValue(cmpHash, "cmpHash");
        String cmpHash2 = cmpHash.length() == 0 ? null : helloReply.getCmpHash();
        Integer numValueOf = helloReply.getCmpHashVersion() == 0 ? null : Integer.valueOf(helloReply.getCmpHashVersion());
        int floatingVersion = helloReply.getFloatingVersion();
        String floatingExtraId = helloReply.getFloatingExtraId();
        String floatingExtraId2 = (floatingExtraId == null || floatingExtraId.length() == 0) ? null : helloReply.getFloatingExtraId();
        if (!e0.areEqual(helloReply.getConsentFloatingExtraPurpose(), Models.ConsentFloatingExtraPurpose.getDefaultInstance())) {
            Models.ConsentFloatingExtraPurpose consentFloatingExtraPurpose = helloReply.getConsentFloatingExtraPurpose();
            e0.checkNotNullExpressionValue(consentFloatingExtraPurpose, "consentFloatingExtraPurpose");
            coreModel5 = VendorListExtsKt.toCoreModel(consentFloatingExtraPurpose);
        }
        FloatingConsent floatingConsent = coreModel5;
        Models.Country country = helloReply.getCountry();
        e0.checkNotNullExpressionValue(country, "country");
        CountryProto coreModel6 = toCoreModel(country);
        e0.checkNotNullExpressionValue(uuid, "uuid");
        return new HelloReply(coreModel, uuid, coreModel2, coreModel3, coreModel4, numValueOf, cmpHash2, floatingExtraId2, Integer.valueOf(floatingVersion), floatingConsent, coreModel6);
    }

    public static final Api.HelloReply toProtoModel(HelloReply helloReply) {
        AcError.ErrorResponse defaultInstance;
        Models.Configuration defaultInstance2;
        Models.Consent defaultInstance3;
        Models.Vendorlist defaultInstance4;
        Models.Country defaultInstance5;
        e0.checkNotNullParameter(helloReply, "<this>");
        Api.HelloReply.Builder builderNewBuilder = Api.HelloReply.newBuilder();
        ErrorResponse error = helloReply.getError();
        if (error == null || (defaultInstance = toProtoModel(error)) == null) {
            defaultInstance = AcError.ErrorResponse.getDefaultInstance();
        }
        Api.HelloReply.Builder uuid = builderNewBuilder.setError(defaultInstance).setUuid(helloReply.getUuid());
        Configuration configuration = helloReply.getConfiguration();
        if (configuration == null || (defaultInstance2 = ConfigurationExtsKt.toProtoModel(configuration)) == null) {
            defaultInstance2 = Models.Configuration.getDefaultInstance();
        }
        Api.HelloReply.Builder configuration2 = uuid.setConfiguration(defaultInstance2);
        Consent consent = helloReply.getConsent();
        if (consent == null || (defaultInstance3 = toProtoModel(consent)) == null) {
            defaultInstance3 = Models.Consent.getDefaultInstance();
        }
        Api.HelloReply.Builder consent2 = configuration2.setConsent(defaultInstance3);
        VendorList vendorList = helloReply.getVendorList();
        if (vendorList == null || (defaultInstance4 = VendorListExtsKt.toProtoModel(vendorList)) == null) {
            defaultInstance4 = Models.Vendorlist.getDefaultInstance();
        }
        Api.HelloReply.Builder vendorlist = consent2.setVendorlist(defaultInstance4);
        String cmpHash = helloReply.getCmpHash();
        if (cmpHash == null) {
            cmpHash = "";
        }
        Api.HelloReply.Builder cmpHash2 = vendorlist.setCmpHash(cmpHash);
        Integer cmpHashVersion = helloReply.getCmpHashVersion();
        Api.HelloReply.Builder cmpHashVersion2 = cmpHash2.setCmpHashVersion(cmpHashVersion != null ? cmpHashVersion.intValue() : 0);
        CountryProto country = helloReply.getCountry();
        if (country == null || (defaultInstance5 = toProtoModel(country)) == null) {
            defaultInstance5 = Models.Country.getDefaultInstance();
        }
        Api.HelloReply.Builder country2 = cmpHashVersion2.setCountry(defaultInstance5);
        String floatingExtraId = helloReply.getFloatingExtraId();
        Api.HelloReply.Builder floatingExtraId2 = country2.setFloatingExtraId(floatingExtraId != null ? floatingExtraId : "");
        Integer floatingExtraVersion = helloReply.getFloatingExtraVersion();
        return floatingExtraId2.setFloatingVersion(floatingExtraVersion != null ? floatingExtraVersion.intValue() : 0).build();
    }

    public static final Models.Consent toProtoModel(Consent consent) {
        e0.checkNotNullParameter(consent, "<this>");
        Models.Consent.Builder builderAddAllVendorsLegint = Models.Consent.newBuilder().setIabCs(consent.getConsentString()).addAllSpecialFeatures(consent.getSpecialFeatureOptIns()).addAllPurposes(consent.getPurposesConsent()).addAllPurposesLegint(consent.getPurposesLITransparency()).addAllVendors(consent.getVendorsConsent()).addAllVendorsLegint(consent.getVendorLIT());
        String uuid = consent.getUuid();
        if (uuid == null) {
            uuid = "";
        }
        Models.Consent.Builder typeValue = builderAddAllVendorsLegint.setUuid(uuid).setTypeValue(consent.getType());
        String cmpHash = consent.getCmpHash();
        Models.Consent.Builder cmpHash2 = typeValue.setCmpHash(cmpHash != null ? cmpHash : "");
        Integer cmpHashVersion = consent.getCmpHashVersion();
        return cmpHash2.setCmpHashVersion(cmpHashVersion != null ? cmpHashVersion.intValue() : 0).putAllExternalIds(consent.getExternalIds()).build();
    }

    public static final Configuration toCoreModel(Models.Configuration configuration) {
        e0.checkNotNullParameter(configuration, "<this>");
        String fallbackLanguage = configuration.getFallbackLanguage();
        List<Integer> xchangeVendorsList = configuration.getXchangeVendorsList();
        Map<String, Models.I18NString> textsMap = configuration.getTextsMap();
        e0.checkNotNullExpressionValue(textsMap, "textsMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(textsMap.size()));
        Iterator<T> it = textsMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            e0.checkNotNullExpressionValue(value, "it.value");
            linkedHashMap.put(key, toCoreModel((Models.I18NString) value));
        }
        boolean useBanner = configuration.getUseBanner();
        int ctaLayout = configuration.getCtaLayout();
        boolean useSuccessScreen = configuration.getUseSuccessScreen();
        Map<String, String> imagesMap = configuration.getImagesMap();
        Map<String, Integer> actionsMap = configuration.getActionsMap();
        Map<String, String> colorsMap = configuration.getColorsMap();
        Map<String, Boolean> configsMap = configuration.getConfigsMap();
        boolean highlightAcceptAllButton = configuration.getHighlightAcceptAllButton();
        boolean enableLegintOnRefuseAll = configuration.getEnableLegintOnRefuseAll();
        boolean continueWithoutAccepting = configuration.getContinueWithoutAccepting();
        boolean enableIllustrations = configuration.getEnableIllustrations();
        boolean notBannerDisplayPurposesList = configuration.getNotBannerDisplayPurposesList();
        e0.checkNotNullExpressionValue(fallbackLanguage, "fallbackLanguage");
        e0.checkNotNullExpressionValue(xchangeVendorsList, "xchangeVendorsList");
        e0.checkNotNullExpressionValue(imagesMap, "imagesMap");
        e0.checkNotNullExpressionValue(actionsMap, "actionsMap");
        e0.checkNotNullExpressionValue(colorsMap, "colorsMap");
        e0.checkNotNullExpressionValue(configsMap, "configsMap");
        return new Configuration(fallbackLanguage, xchangeVendorsList, linkedHashMap, useBanner, ctaLayout, highlightAcceptAllButton, useSuccessScreen, imagesMap, actionsMap, colorsMap, configsMap, enableLegintOnRefuseAll, continueWithoutAccepting, enableIllustrations, notBannerDisplayPurposesList);
    }

    public static final AcError.ErrorResponse toProtoModel(ErrorResponse errorResponse) {
        e0.checkNotNullParameter(errorResponse, "<this>");
        return AcError.ErrorResponse.newBuilder().setCode(AcError.ErrorCode.UNKNOWN).build();
    }

    public static final Models.I18NString toProtoModel(I18NString i18NString) {
        e0.checkNotNullParameter(i18NString, "<this>");
        return Models.I18NString.newBuilder().putAllValues(i18NString.getValues()).build();
    }

    public static final Models.Country toProtoModel(CountryProto countryProto) {
        e0.checkNotNullParameter(countryProto, "<this>");
        return Models.Country.newBuilder().setCode(countryProto.getCode()).setGdpr(countryProto.getGdpr()).build();
    }

    public static final Consent toCoreModel(Models.Consent consent) {
        e0.checkNotNullParameter(consent, "<this>");
        String iabCs = consent.getIabCs();
        e0.checkNotNullExpressionValue(iabCs, "iabCs");
        List<Integer> specialFeaturesList = consent.getSpecialFeaturesList();
        e0.checkNotNullExpressionValue(specialFeaturesList, "specialFeaturesList");
        List<Integer> purposesList = consent.getPurposesList();
        e0.checkNotNullExpressionValue(purposesList, "purposesList");
        List<Integer> purposesLegintList = consent.getPurposesLegintList();
        e0.checkNotNullExpressionValue(purposesLegintList, "purposesLegintList");
        List<Integer> vendorsList = consent.getVendorsList();
        e0.checkNotNullExpressionValue(vendorsList, "vendorsList");
        List<Integer> vendorsLegintList = consent.getVendorsLegintList();
        e0.checkNotNullExpressionValue(vendorsLegintList, "vendorsLegintList");
        Integer numValueOf = Integer.valueOf(consent.getCmpVersion());
        String uuid = consent.getUuid();
        int typeValue = consent.getTypeValue();
        String cmpHash = consent.getCmpHash();
        e0.checkNotNullExpressionValue(cmpHash, "cmpHash");
        String cmpHash2 = cmpHash.length() == 0 ? null : consent.getCmpHash();
        Integer numValueOf2 = consent.getCmpHashVersion() != 0 ? Integer.valueOf(consent.getCmpHashVersion()) : null;
        Map<String, String> externalIdsMap = consent.getExternalIdsMap();
        e0.checkNotNullExpressionValue(externalIdsMap, "externalIdsMap");
        return new Consent(iabCs, specialFeaturesList, purposesList, purposesLegintList, vendorsList, vendorsLegintList, numValueOf, uuid, typeValue, cmpHash2, numValueOf2, externalIdsMap);
    }

    public static final ErrorResponse toCoreModel(AcError.ErrorResponse errorResponse) {
        e0.checkNotNullParameter(errorResponse, "<this>");
        return new ErrorResponse(ErrorCode.UNKNOWN, (String) null, 2, (u) null);
    }

    public static final I18NString toCoreModel(Models.I18NString i18NString) {
        e0.checkNotNullParameter(i18NString, "<this>");
        Map<String, String> valuesMap = i18NString.getValuesMap();
        e0.checkNotNullExpressionValue(valuesMap, "valuesMap");
        return new I18NString(valuesMap);
    }

    public static final CountryProto toCoreModel(Models.Country country) {
        e0.checkNotNullParameter(country, "<this>");
        String code = country.getCode();
        e0.checkNotNullExpressionValue(code, "code");
        return new CountryProto(code, country.getGdpr());
    }

    public static final DataRetention toCoreModel(Models.Vendorlist.Vendor.DataRetention dataRetention) {
        e0.checkNotNullParameter(dataRetention, "<this>");
        int stdRetention = dataRetention.getStdRetention();
        Map<String, Integer> purposesMap = dataRetention.getPurposesMap();
        e0.checkNotNullExpressionValue(purposesMap, "this.purposesMap");
        Map<String, Integer> specialPurposesMap = dataRetention.getSpecialPurposesMap();
        e0.checkNotNullExpressionValue(specialPurposesMap, "this.specialPurposesMap");
        return new DataRetention(stdRetention, purposesMap, specialPurposesMap);
    }
}
