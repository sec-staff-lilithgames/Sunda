package com.amazon.aps.bidder.status;

import cv.a;
import cv.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsBidderSDKInitializationStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ApsBidderSDKInitializationStatus[] $VALUES;
    public static final ApsBidderSDKInitializationStatus SUCCESS = new ApsBidderSDKInitializationStatus("SUCCESS", 0);
    public static final ApsBidderSDKInitializationStatus FAILURE = new ApsBidderSDKInitializationStatus("FAILURE", 1);

    private static final /* synthetic */ ApsBidderSDKInitializationStatus[] $values() {
        return new ApsBidderSDKInitializationStatus[]{SUCCESS, FAILURE};
    }

    static {
        ApsBidderSDKInitializationStatus[] apsBidderSDKInitializationStatusArr$values = $values();
        $VALUES = apsBidderSDKInitializationStatusArr$values;
        $ENTRIES = b.enumEntries(apsBidderSDKInitializationStatusArr$values);
    }

    private ApsBidderSDKInitializationStatus(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ApsBidderSDKInitializationStatus valueOf(String str) {
        return (ApsBidderSDKInitializationStatus) Enum.valueOf(ApsBidderSDKInitializationStatus.class, str);
    }

    public static ApsBidderSDKInitializationStatus[] values() {
        return (ApsBidderSDKInitializationStatus[]) $VALUES.clone();
    }
}
