package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.FloatingConsent;
import com.sfbx.appconsent.core.model.api.proto.Configuration;
import com.sfbx.appconsent.core.model.api.proto.Consent;
import com.sfbx.appconsent.core.model.api.proto.CountryProto;
import com.sfbx.appconsent.core.model.api.proto.ErrorResponse;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import com.sfbx.appconsent.core.model.api.proto.VendorList;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HelloReplyCoreKt {
    public static final HelloReplyCore convertTo(HelloReply helloReply) {
        e0.checkNotNullParameter(helloReply, "<this>");
        ErrorResponse error = helloReply.getError();
        ErrorResponseCore errorResponseCoreConvertTo = error != null ? ErrorResponseCoreKt.convertTo(error) : null;
        String uuid = helloReply.getUuid();
        Configuration configuration = helloReply.getConfiguration();
        ConfigurationCore configurationCoreConvertTo = configuration != null ? ConfigurationCoreKt.convertTo(configuration) : null;
        Consent consent = helloReply.getConsent();
        ConsentCore consentCoreConvertTo = consent != null ? ConsentCoreKt.convertTo(consent) : null;
        VendorList vendorList = helloReply.getVendorList();
        VendorListCore vendorListCoreConvertTo = vendorList != null ? VendorListCoreKt.convertTo(vendorList) : null;
        Integer cmpHashVersion = helloReply.getCmpHashVersion();
        String cmpHash = helloReply.getCmpHash();
        String floatingExtraId = helloReply.getFloatingExtraId();
        Integer floatingExtraVersion = helloReply.getFloatingExtraVersion();
        FloatingConsent floatingConsent = helloReply.getFloatingConsent();
        FloatingConsentCore floatingConsentCoreConvertTo = floatingConsent != null ? FloatingConsentCoreKt.convertTo(floatingConsent) : null;
        CountryProto country = helloReply.getCountry();
        return new HelloReplyCore(errorResponseCoreConvertTo, uuid, configurationCoreConvertTo, consentCoreConvertTo, vendorListCoreConvertTo, cmpHashVersion, cmpHash, floatingExtraId, floatingExtraVersion, floatingConsentCoreConvertTo, country != null ? CountryCoreKt.convertTo(country) : null);
    }
}
