package com.applovin.impl;

import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class u6 {
    public static String a(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 2) {
            return "SFBX CMP";
        }
        if (iIntValue == 3) {
            return "Liveramp CMP";
        }
        if (iIntValue == 5) {
            return "UserCentrics CMP";
        }
        if (iIntValue == 6) {
            return "Sourcepoint Dialogue CMP";
        }
        if (iIntValue == 7) {
            return "Didomi CMP";
        }
        if (iIntValue == 27) {
            return "Associated Newspapers Ltd CMP";
        }
        if (iIntValue == 28) {
            return "Onetrust / Cookiepro CMP";
        }
        if (iIntValue == 104) {
            return "AdOcean CMP";
        }
        if (iIntValue == 105) {
            return "Dailymotion CMP";
        }
        if (iIntValue == 302) {
            return "Gravito CMP";
        }
        if (iIntValue == 303) {
            return "Impala CMP";
        }
        if (iIntValue == 414) {
            return "MBEX LTD CMP";
        }
        if (iIntValue == 415) {
            return "Match Group LLC CMP";
        }
        switch (iIntValue) {
            case 10:
                break;
            case 14:
                break;
            case 21:
                break;
            case 31:
                break;
            case 35:
                break;
            case 59:
                break;
            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                break;
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                break;
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                break;
            case 79:
                break;
            case 84:
                break;
            case 90:
                break;
            case INVALID_RI_ENDPOINT_VALUE:
                break;
            case INVALID_METRICS_ENDPOINT_VALUE:
                break;
            case 134:
                break;
            case 167:
                break;
            case 171:
                break;
            case 198:
                break;
            case 212:
                break;
            case 231:
                break;
            case 237:
                break;
            case 246:
                break;
            case 258:
                break;
            case 260:
                break;
            case 273:
                break;
            case 280:
                break;
            case 300:
                break;
            case 306:
                break;
            case ASSET_FAILED_TO_DELETE_VALUE:
                break;
            case AD_CLOSED_MISSING_HEARTBEAT_VALUE:
                break;
            case 327:
                break;
            case 329:
                break;
            case 340:
                break;
            case 345:
                break;
            case 348:
                break;
            case 355:
                break;
            case 371:
                break;
            case 385:
                break;
            case 387:
                break;
            case 397:
                break;
            case 399:
                break;
            case 409:
                break;
            case StatusLine.HTTP_MISDIRECTED_REQUEST /* 421 */:
                break;
            case 432:
                break;
            case 436:
                break;
            default:
                switch (iIntValue) {
                }
        }
        return null;
    }
}
