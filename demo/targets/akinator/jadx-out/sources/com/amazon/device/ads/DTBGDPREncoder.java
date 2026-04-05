package com.amazon.device.ads;

import android.util.Base64;
import com.amazon.device.ads.AdRegistration;
import j1.o2;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBGDPREncoder {
    public static final int AMAZON_CONSENT_STRING_VERSION_VALUE = 1;
    public static final int CMP_INDICATOR_RANGE = 4;
    public static final int CMP_INDICATOR_START_INDEX = 11;
    public static final int CONSENT_STATUS_INDICATOR_RANGE = 3;
    public static final int CONSENT_STATUS_START_INDEX = 15;
    public static final int CONSENT_STRING_VERSION_INDICATOR_RANGE = 5;
    public static final int CONSENT_STRING_VERSION_START_INDEX = 6;
    public static final int EXPLICIT_NO_VALUE = 0;
    public static final int EXPLICIT_YES_VALUE = 7;
    public static final int GOOGLE_CMP_VALUE = 1;
    public static final int MAX_VENDOR_ID_INDICATOR_RANGE = 14;
    public static final int MAX_VENDOR_ID_START_INDEX = 18;
    public static final int MOPUB_CMP_VALUE = 2;
    public static final int TOTAL_NUMBER_OF_BITS_FOR_META_INFO = 32;
    public static final int UNKNOWN_CONSENT_STATUS_VALUE = 1;

    public static String getBinaryStringBasedOnPositions(List<Integer> list) {
        if (list.isEmpty()) {
            return "";
        }
        int iIntValue = ((Integer) Collections.max(list)).intValue() + 1;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < iIntValue; i10++) {
            sb2.append("0");
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sb2.setCharAt(it.next().intValue(), '1');
        }
        return sb2.toString();
    }

    public static String getEncodedBinaryString(List<Integer> list) {
        String binaryStringBasedOnPositions = getBinaryStringBasedOnPositions(list);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 32; i10++) {
            sb2.append("0");
        }
        setBitSetBasedOnConsentStringVersion(sb2);
        setBitSetBasedOnCMPFlavor(sb2);
        setBitSetBasedOnConsentStatus(sb2);
        if (binaryStringBasedOnPositions.length() >= 1) {
            setBitSetBasedOnMaxVendorID(sb2, binaryStringBasedOnPositions.length() - 1);
        }
        sb2.append(binaryStringBasedOnPositions);
        return sb2.toString();
    }

    public static String getEncodedNonIABConsentString(List<Integer> list) {
        String encodedBinaryString = getEncodedBinaryString(list);
        int length = encodedBinaryString.length();
        byte[] bArr = new byte[(length / 8) + ((length % 8 == 0 ? 1 : 0) ^ 1)];
        for (int i10 = 0; i10 < length; i10++) {
            if (encodedBinaryString.charAt(i10) == '1') {
                setBit(bArr, i10);
            } else {
                unsetBit(bArr, i10);
            }
        }
        return Base64.encodeToString(bArr, 11).trim();
    }

    public static String getValidPaddedStringForInt(int i10, int i11) {
        String binaryString = Integer.toBinaryString(i10);
        int length = i11 - binaryString.length();
        String strL = "";
        for (int i12 = 0; i12 < length; i12++) {
            strL = o2.l(strL, "0");
        }
        return o2.l(strL, binaryString);
    }

    public static void setBit(byte[] bArr, int i10) {
        int i11 = i10 / 8;
        bArr[i11] = (byte) ((1 << ((((i11 + 1) * 8) - i10) - 1)) | bArr[i11]);
    }

    public static void setBitSetBasedOnCMPFlavor(StringBuilder sb2) {
        AdRegistration.CMPFlavor cMPFlavor = AdRegistration.getCMPFlavor();
        if (cMPFlavor == AdRegistration.CMPFlavor.GOOGLE_CMP || cMPFlavor == AdRegistration.CMPFlavor.ADMOB_CMP) {
            sb2.replace(11, 15, getValidPaddedStringForInt(1, 4));
        } else if (cMPFlavor == AdRegistration.CMPFlavor.MOPUB_CMP) {
            sb2.replace(11, 15, getValidPaddedStringForInt(2, 4));
        }
    }

    public static void setBitSetBasedOnConsentStatus(StringBuilder sb2) {
        AdRegistration.ConsentStatus consentStatus = AdRegistration.getConsentStatus();
        if (consentStatus == AdRegistration.ConsentStatus.EXPLICIT_YES) {
            sb2.replace(15, 18, getValidPaddedStringForInt(7, 3));
        } else if (consentStatus == AdRegistration.ConsentStatus.EXPLICIT_NO) {
            sb2.replace(15, 18, getValidPaddedStringForInt(0, 3));
        } else {
            sb2.replace(15, 18, getValidPaddedStringForInt(1, 3));
        }
    }

    public static void setBitSetBasedOnConsentStringVersion(StringBuilder sb2) {
        sb2.replace(6, 11, getValidPaddedStringForInt(1, 5));
    }

    public static void setBitSetBasedOnMaxVendorID(StringBuilder sb2, int i10) {
        sb2.replace(18, 32, getValidPaddedStringForInt(i10, 14));
    }

    public static void unsetBit(byte[] bArr, int i10) {
        int i11 = i10 / 8;
        bArr[i11] = (byte) ((~(1 << ((((i11 + 1) * 8) - i10) - 1))) & bArr[i11]);
    }
}
