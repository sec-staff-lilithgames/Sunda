package com.sfbx.appconsent.core;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UserAcceptance {
    private final boolean isAllDataArePresent(Boolean bool, Boolean bool2, Boolean bool3) {
        return (bool == null || bool2 == null || bool3 == null) ? false : true;
    }

    private final boolean isConsentablesAndStacksAndVendorsAreNull(Boolean bool, Boolean bool2, Boolean bool3) {
        return bool == null && bool2 == null && bool3 == null;
    }

    private final boolean isOnlyConsentablesAndStacksArePresent(Boolean bool, Boolean bool2, Boolean bool3) {
        return (bool == null || bool2 == null || bool3 != null) ? false : true;
    }

    private final boolean isOnlyConsentablesAndVendorsArePresent(Boolean bool, Boolean bool2, Boolean bool3) {
        return (bool == null || bool2 != null || bool3 == null) ? false : true;
    }

    private final boolean isOnlyConsentablesArePresent(Boolean bool, Boolean bool2, Boolean bool3) {
        return bool != null && bool2 == null && bool3 == null;
    }

    private final boolean isOnlyStacksAndVendorsArePresent(Boolean bool, Boolean bool2, Boolean bool3) {
        return (bool != null || bool2 == null || bool3 == null) ? false : true;
    }

    private final boolean isOnlyStacksArePresent(Boolean bool, Boolean bool2, Boolean bool3) {
        return bool == null && bool2 != null && bool3 == null;
    }

    private final boolean isOnlyVendorsArePresent(Boolean bool, Boolean bool2, Boolean bool3) {
        return bool == null && bool2 == null && bool3 != null;
    }

    public final Boolean checkAllUseCase$appconsent_core_prodXchangeRelease(Boolean bool, Boolean bool2, Boolean bool3) {
        boolean zIsConsentablesAndStacksAndVendorsAreNull = isConsentablesAndStacksAndVendorsAreNull(bool, bool2, bool3);
        Boolean boolValueOf = Boolean.valueOf(zIsConsentablesAndStacksAndVendorsAreNull);
        if (!zIsConsentablesAndStacksAndVendorsAreNull) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return null;
        }
        boolean zIsOnlyConsentablesArePresent = isOnlyConsentablesArePresent(bool, bool2, bool3);
        Boolean boolValueOf2 = Boolean.valueOf(zIsOnlyConsentablesArePresent);
        if (!zIsOnlyConsentablesArePresent) {
            boolValueOf2 = null;
        }
        if (boolValueOf2 != null) {
            return bool;
        }
        boolean zIsOnlyStacksArePresent = isOnlyStacksArePresent(bool, bool2, bool3);
        Boolean boolValueOf3 = Boolean.valueOf(zIsOnlyStacksArePresent);
        if (!zIsOnlyStacksArePresent) {
            boolValueOf3 = null;
        }
        if (boolValueOf3 != null) {
            return bool2;
        }
        boolean zIsOnlyVendorsArePresent = isOnlyVendorsArePresent(bool, bool2, bool3);
        Boolean boolValueOf4 = Boolean.valueOf(zIsOnlyVendorsArePresent);
        if (!zIsOnlyVendorsArePresent) {
            boolValueOf4 = null;
        }
        if (boolValueOf4 != null) {
            return bool3;
        }
        boolean zIsOnlyConsentablesAndStacksArePresent = isOnlyConsentablesAndStacksArePresent(bool, bool2, bool3);
        Boolean boolValueOf5 = Boolean.valueOf(zIsOnlyConsentablesAndStacksArePresent);
        if (!zIsOnlyConsentablesAndStacksArePresent) {
            boolValueOf5 = null;
        }
        boolean z10 = false;
        if (boolValueOf5 != null) {
            e0.checkNotNull(bool);
            if (bool.booleanValue()) {
                e0.checkNotNull(bool2);
                if (bool2.booleanValue()) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
        boolean zIsOnlyConsentablesAndVendorsArePresent = isOnlyConsentablesAndVendorsArePresent(bool, bool2, bool3);
        Boolean boolValueOf6 = Boolean.valueOf(zIsOnlyConsentablesAndVendorsArePresent);
        if (!zIsOnlyConsentablesAndVendorsArePresent) {
            boolValueOf6 = null;
        }
        if (boolValueOf6 != null) {
            e0.checkNotNull(bool);
            if (bool.booleanValue()) {
                e0.checkNotNull(bool3);
                if (bool3.booleanValue()) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
        boolean zIsOnlyStacksAndVendorsArePresent = isOnlyStacksAndVendorsArePresent(bool, bool2, bool3);
        Boolean boolValueOf7 = Boolean.valueOf(zIsOnlyStacksAndVendorsArePresent);
        if (!zIsOnlyStacksAndVendorsArePresent) {
            boolValueOf7 = null;
        }
        if (boolValueOf7 != null) {
            e0.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                e0.checkNotNull(bool3);
                if (bool3.booleanValue()) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
        boolean zIsAllDataArePresent = isAllDataArePresent(bool, bool2, bool3);
        Boolean boolValueOf8 = Boolean.valueOf(zIsAllDataArePresent);
        if (!zIsAllDataArePresent) {
            boolValueOf8 = null;
        }
        if (boolValueOf8 == null) {
            return null;
        }
        e0.checkNotNull(bool);
        if (bool.booleanValue()) {
            e0.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                e0.checkNotNull(bool3);
                if (bool3.booleanValue()) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
