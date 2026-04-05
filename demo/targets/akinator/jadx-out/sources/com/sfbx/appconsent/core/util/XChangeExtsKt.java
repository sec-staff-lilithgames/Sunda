package com.sfbx.appconsent.core.util;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3144bb;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sfbx.appconsent.core.model.api.XChangeData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class XChangeExtsKt {
    public static final Map<String, String> toMap(XChangeData xChangeData) {
        e0.checkNotNullParameter(xChangeData, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xChangeData.getAge() != null) {
            linkedHashMap.put("age", xChangeData.getAge().toString());
        }
        if (xChangeData.getAppNameBundle() != null) {
            linkedHashMap.put("appNameBundle", xChangeData.getAppNameBundle());
        }
        if (xChangeData.getConsentString() != null) {
            linkedHashMap.put("consentString", xChangeData.getConsentString());
        }
        if (xChangeData.getCsp() != null) {
            linkedHashMap.put(b.JSON_KEY_CSP, xChangeData.getCsp());
        }
        if (xChangeData.getDateOfBirth() != null) {
            linkedHashMap.put("dateOfBirth", xChangeData.getDateOfBirth());
        }
        if (xChangeData.getDeviceCountryCode() != null) {
            linkedHashMap.put("deviceCountryCode", xChangeData.getDeviceCountryCode());
        }
        if (xChangeData.getDeviceManufacturer() != null) {
            linkedHashMap.put("deviceManufacturer", xChangeData.getDeviceManufacturer());
        }
        if (xChangeData.getDeviceOS() != null) {
            linkedHashMap.put(C3144bb.f36078o, xChangeData.getDeviceOS());
        }
        if (xChangeData.getCountry() != null) {
            linkedHashMap.put("country", xChangeData.getCountry());
        }
        if (xChangeData.getFloor() != null) {
            linkedHashMap.put("floor", xChangeData.getFloor());
        }
        if (xChangeData.getPostCode() != null) {
            linkedHashMap.put("postCode", xChangeData.getPostCode());
        }
        if (xChangeData.getDeviceCarrier() != null) {
            linkedHashMap.put("deviceCarrier", xChangeData.getDeviceCarrier());
        }
        if (xChangeData.getDeviceSimCode() != null) {
            linkedHashMap.put("deviceSimCode", xChangeData.getDeviceSimCode());
        }
        if (xChangeData.getDeviceCarrierCode() != null) {
            linkedHashMap.put("deviceCarrierCode", xChangeData.getDeviceCarrierCode());
        }
        if (xChangeData.getDeviceModel() != null) {
            linkedHashMap.put("deviceModel", xChangeData.getDeviceModel());
        }
        if (xChangeData.getDeviceOSVersion() != null) {
            linkedHashMap.put(C3191e4.i.f36549n, xChangeData.getDeviceOSVersion());
        }
        if (xChangeData.getEmailMD5() != null) {
            linkedHashMap.put("emailMD5", xChangeData.getEmailMD5());
        }
        if (xChangeData.getEmailSHA1() != null) {
            linkedHashMap.put("emailSHA1", xChangeData.getEmailSHA1());
        }
        if (xChangeData.getEmailSHA256() != null) {
            linkedHashMap.put("emailSHA256", xChangeData.getEmailSHA256());
        }
        if (xChangeData.getExternalId() != null) {
            linkedHashMap.put("externalId", xChangeData.getExternalId());
        }
        if (xChangeData.getFirstName() != null) {
            linkedHashMap.put("firstName", xChangeData.getFirstName());
        }
        if (xChangeData.getGender() != null) {
            linkedHashMap.put(InneractiveMediationDefs.KEY_GENDER, xChangeData.getGender());
        }
        if (xChangeData.getHousehold() != null) {
            linkedHashMap.put("household", xChangeData.getHousehold());
        }
        if (xChangeData.getIpv4Address() != null) {
            linkedHashMap.put("ipv4Address", xChangeData.getIpv4Address());
        }
        if (xChangeData.getIpv6Address() != null) {
            linkedHashMap.put("ipv6Address", xChangeData.getIpv6Address());
        }
        if (xChangeData.getLastName() != null) {
            linkedHashMap.put("lastName", xChangeData.getLastName());
        }
        if (xChangeData.getMacAddress() != null) {
            linkedHashMap.put("macAddress", xChangeData.getMacAddress());
        }
        if (xChangeData.getMaid() != null) {
            linkedHashMap.put("maid", xChangeData.getMaid());
        }
        if (xChangeData.getMaidType() != null) {
            linkedHashMap.put("maidType", xChangeData.getMaidType());
        }
        if (xChangeData.getNetworkType() != null) {
            linkedHashMap.put("networkType", xChangeData.getNetworkType());
        }
        if (xChangeData.getPhoneMD5() != null) {
            linkedHashMap.put("phoneMD5", xChangeData.getPhoneMD5());
        }
        if (xChangeData.getPhoneSHA1() != null) {
            linkedHashMap.put("phoneSHA1", xChangeData.getPhoneSHA1());
        }
        if (xChangeData.getPhoneSHA256() != null) {
            linkedHashMap.put("phoneSHA256", xChangeData.getPhoneSHA256());
        }
        if (xChangeData.getRegion() != null) {
            linkedHashMap.put(TtmlNode.TAG_REGION, xChangeData.getRegion());
        }
        if (xChangeData.getRevenues() != null) {
            linkedHashMap.put("revenues", xChangeData.getRevenues());
        }
        if (xChangeData.getSignalStrength() != null) {
            linkedHashMap.put("signalStrength", xChangeData.getSignalStrength().toString());
        }
        if (xChangeData.getStreetName() != null) {
            linkedHashMap.put("streetName", xChangeData.getStreetName());
        }
        if (xChangeData.getStreetNo() != null) {
            linkedHashMap.put("streetNo", xChangeData.getStreetNo());
        }
        if (xChangeData.getStreetType() != null) {
            linkedHashMap.put("streetType", xChangeData.getStreetType());
        }
        if (xChangeData.getTimestampCollect() != null) {
            linkedHashMap.put("timestampCollect", xChangeData.getTimestampCollect().toString());
        }
        if (xChangeData.getTown() != null) {
            linkedHashMap.put("town", xChangeData.getTown());
        }
        if (xChangeData.getUnstructuredData() != null) {
            linkedHashMap.put("unstructuredData", xChangeData.getUnstructuredData());
        }
        if (xChangeData.getWifiSSID() != null) {
            linkedHashMap.put("wifiSSID", xChangeData.getWifiSSID());
        }
        return linkedHashMap;
    }
}
