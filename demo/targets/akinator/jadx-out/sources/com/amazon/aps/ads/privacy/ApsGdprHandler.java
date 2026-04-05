package com.amazon.aps.ads.privacy;

import com.iabtcf.decoder.TCString;
import com.iabtcf.v2.PublisherRestriction;
import com.iabtcf.v2.RestrictionType;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsGdprHandler {
    private static int p1CalcCount;
    private Boolean isApsVendorConsented;
    private Boolean isGdprApplies;
    private boolean isPurpose1Consented;
    private boolean isTcfStringFound;
    private List<? extends PublisherRestriction> publisherRestrictions;
    private Boolean purpose1ConsentFlag;
    private TCString tcString;
    private Integer tcfVersion;
    private Integer vendorListVersion;
    public static final Companion Companion = new Companion(null);
    private static final int APS_IAB_VENDOR_CONST = 793;
    private static final int APS_SUPPORTED_GVL_VERSION = 25;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int getAPS_IAB_VENDOR_CONST() {
            return ApsGdprHandler.APS_IAB_VENDOR_CONST;
        }

        public final int getAPS_SUPPORTED_GVL_VERSION() {
            return ApsGdprHandler.APS_SUPPORTED_GVL_VERSION;
        }

        public final int getP1CalcCount() {
            return ApsGdprHandler.p1CalcCount;
        }

        public final void setP1CalcCount(int i10) {
            ApsGdprHandler.p1CalcCount = i10;
        }

        private Companion() {
        }
    }

    public final void calculatePurpose1Consent() {
        this.isPurpose1Consented = (isGdprAppliesTrue() || ((isGdprAppliesFalse() && this.isTcfStringFound) || (this.isGdprApplies == null && this.isTcfStringFound))) && isValidTcfV2String() && isPurpose1ConsentFlagOn() && isValidVendorVersion() && isRestrictedVendorListNotHavingAps();
    }

    public final Boolean isGdprApplies() {
        return this.isGdprApplies;
    }

    public final boolean isGdprAppliesFalse() {
        Boolean bool = this.isGdprApplies;
        return bool != null && e0.areEqual(bool, Boolean.FALSE);
    }

    public final boolean isGdprAppliesTrue() {
        Boolean bool = this.isGdprApplies;
        return bool != null && e0.areEqual(bool, Boolean.TRUE);
    }

    public final boolean isPurpose1ConsentFlagOn() {
        Boolean bool = this.purpose1ConsentFlag;
        return bool != null && e0.areEqual(bool, Boolean.TRUE);
    }

    public final boolean isPurpose1Consented() {
        return this.isPurpose1Consented;
    }

    public final boolean isRestrictedVendorListNotHavingAps() {
        List<? extends PublisherRestriction> list = this.publisherRestrictions;
        if (list != null) {
            if (list.isEmpty()) {
                return isVendorConsentOnForAps();
            }
            for (PublisherRestriction publisherRestriction : list) {
                if (publisherRestriction.getPurposeId() == 1 && publisherRestriction.getVendorIds() != null && publisherRestriction.getVendorIds().contains(APS_IAB_VENDOR_CONST) && publisherRestriction.getRestrictionType() != RestrictionType.NOT_ALLOWED && publisherRestriction.getRestrictionType() != RestrictionType.REQUIRE_LEGITIMATE_INTEREST) {
                    return true;
                }
            }
        }
        return isVendorConsentOnForAps();
    }

    public final boolean isTcfStringFound() {
        return this.isTcfStringFound;
    }

    public final boolean isValidTcfV2String() {
        Integer num;
        return (this.tcString == null || (num = this.tcfVersion) == null || num == null || num.intValue() != 2) ? false : true;
    }

    public final boolean isValidVendorVersion() {
        Integer num = this.vendorListVersion;
        return num != null ? num.intValue() >= APS_SUPPORTED_GVL_VERSION : num == null;
    }

    public final boolean isVendorConsentOnForAps() {
        Boolean bool = this.isApsVendorConsented;
        return bool != null && e0.areEqual(bool, Boolean.TRUE);
    }

    public final void setGdprApplies(Boolean bool) {
        this.isGdprApplies = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[Catch: Exception -> 0x010b, TryCatch #1 {Exception -> 0x010b, blocks: (B:29:0x0088, B:33:0x0099, B:35:0x00a0, B:39:0x00ab, B:42:0x00cc), top: B:46:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setGdprConsent(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.ads.privacy.ApsGdprHandler.setGdprConsent(java.lang.String):void");
    }

    public final void setGdprApplies(Integer num) {
        Boolean boolValueOf;
        if (num != null) {
            boolValueOf = Boolean.valueOf(num.intValue() == 1);
        } else {
            boolValueOf = null;
        }
        this.isGdprApplies = boolValueOf;
    }
}
