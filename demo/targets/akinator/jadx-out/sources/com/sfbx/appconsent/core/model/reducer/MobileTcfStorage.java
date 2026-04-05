package com.sfbx.appconsent.core.model.reducer;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.sfbx.appconsent.core.IABConstants;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class MobileTcfStorage {
    public static final Companion Companion = new Companion(null);
    private final int cmpSdkId;
    private final int cmpSdkVersion;
    private final String consentString;
    private final int policyVersion;
    private final String publisherConsent;
    private final String publisherCountryCode;
    private final String publisherCustomPurposeConsent;
    private final String publisherCustomPurposeLegInt;
    private final String publisherLegInt;
    private final String purposeConsents;
    private final String purposeLegInt;
    private final int purposeOneTreatment;
    private final String specialFeatureOptIns;
    private final int useNonStandardStacks;
    private final String vendorConsents;
    private final String vendorLegInt;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<MobileTcfStorage> serializer() {
            return MobileTcfStorage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ MobileTcfStorage(int i10, @SerialName(IABConstants.CMP_SDK_ID) int i11, @SerialName(IABConstants.CMP_SDK_VERSION) int i12, @SerialName(IABConstants.POLICY_VERSION) int i13, @SerialName(IABConstants.PUBLISHER_CC) String str, @SerialName(IABConstants.PURPOSE_ONE_TREATMENT) int i14, @SerialName(IABConstants.USE_NON_STANDARD_STACKS) int i15, @SerialName("IABTCF_TCString") String str2, @SerialName(IABConstants.VENDOR_CONSENTS) String str3, @SerialName(IABConstants.VENDOR_LEGITIMATE_INTERESTS) String str4, @SerialName(IABConstants.PURPOSE_CONSENTS) String str5, @SerialName(IABConstants.PURPOSE_LEGITIMATE_INTERESTS) String str6, @SerialName(IABConstants.SPECIAL_FEATURE_OPT_INS) String str7, @SerialName(IABConstants.PUBLISHER_CONSENT) String str8, @SerialName(IABConstants.PUBLISHER_LEGITIMATE_INTERESTS) String str9, @SerialName(IABConstants.PUBLISHER_CUSTOM_PURPOSES_CONSENTS) String str10, @SerialName(IABConstants.PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS) String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (65535 != (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
            PluginExceptionsKt.throwMissingFieldException(i10, Settings.DEFAULT_INITIAL_WINDOW_SIZE, MobileTcfStorage$$serializer.INSTANCE.getDescriptor());
        }
        this.cmpSdkId = i11;
        this.cmpSdkVersion = i12;
        this.policyVersion = i13;
        this.publisherCountryCode = str;
        this.purposeOneTreatment = i14;
        this.useNonStandardStacks = i15;
        this.consentString = str2;
        this.vendorConsents = str3;
        this.vendorLegInt = str4;
        this.purposeConsents = str5;
        this.purposeLegInt = str6;
        this.specialFeatureOptIns = str7;
        this.publisherConsent = str8;
        this.publisherLegInt = str9;
        this.publisherCustomPurposeConsent = str10;
        this.publisherCustomPurposeLegInt = str11;
    }

    public static final void write$Self(MobileTcfStorage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.cmpSdkId);
        output.encodeIntElement(serialDesc, 1, self.cmpSdkVersion);
        output.encodeIntElement(serialDesc, 2, self.policyVersion);
        output.encodeStringElement(serialDesc, 3, self.publisherCountryCode);
        output.encodeIntElement(serialDesc, 4, self.purposeOneTreatment);
        output.encodeIntElement(serialDesc, 5, self.useNonStandardStacks);
        output.encodeStringElement(serialDesc, 6, self.consentString);
        output.encodeStringElement(serialDesc, 7, self.vendorConsents);
        output.encodeStringElement(serialDesc, 8, self.vendorLegInt);
        output.encodeStringElement(serialDesc, 9, self.purposeConsents);
        output.encodeStringElement(serialDesc, 10, self.purposeLegInt);
        output.encodeStringElement(serialDesc, 11, self.specialFeatureOptIns);
        output.encodeStringElement(serialDesc, 12, self.publisherConsent);
        output.encodeStringElement(serialDesc, 13, self.publisherLegInt);
        output.encodeStringElement(serialDesc, 14, self.publisherCustomPurposeConsent);
        output.encodeStringElement(serialDesc, 15, self.publisherCustomPurposeLegInt);
    }

    public final int component1() {
        return this.cmpSdkId;
    }

    public final String component10() {
        return this.purposeConsents;
    }

    public final String component11() {
        return this.purposeLegInt;
    }

    public final String component12() {
        return this.specialFeatureOptIns;
    }

    public final String component13() {
        return this.publisherConsent;
    }

    public final String component14() {
        return this.publisherLegInt;
    }

    public final String component15() {
        return this.publisherCustomPurposeConsent;
    }

    public final String component16() {
        return this.publisherCustomPurposeLegInt;
    }

    public final int component2() {
        return this.cmpSdkVersion;
    }

    public final int component3() {
        return this.policyVersion;
    }

    public final String component4() {
        return this.publisherCountryCode;
    }

    public final int component5() {
        return this.purposeOneTreatment;
    }

    public final int component6() {
        return this.useNonStandardStacks;
    }

    public final String component7() {
        return this.consentString;
    }

    public final String component8() {
        return this.vendorConsents;
    }

    public final String component9() {
        return this.vendorLegInt;
    }

    public final MobileTcfStorage copy(int i10, int i11, int i12, String publisherCountryCode, int i13, int i14, String consentString, String vendorConsents, String vendorLegInt, String purposeConsents, String purposeLegInt, String specialFeatureOptIns, String publisherConsent, String publisherLegInt, String publisherCustomPurposeConsent, String publisherCustomPurposeLegInt) {
        e0.checkNotNullParameter(publisherCountryCode, "publisherCountryCode");
        e0.checkNotNullParameter(consentString, "consentString");
        e0.checkNotNullParameter(vendorConsents, "vendorConsents");
        e0.checkNotNullParameter(vendorLegInt, "vendorLegInt");
        e0.checkNotNullParameter(purposeConsents, "purposeConsents");
        e0.checkNotNullParameter(purposeLegInt, "purposeLegInt");
        e0.checkNotNullParameter(specialFeatureOptIns, "specialFeatureOptIns");
        e0.checkNotNullParameter(publisherConsent, "publisherConsent");
        e0.checkNotNullParameter(publisherLegInt, "publisherLegInt");
        e0.checkNotNullParameter(publisherCustomPurposeConsent, "publisherCustomPurposeConsent");
        e0.checkNotNullParameter(publisherCustomPurposeLegInt, "publisherCustomPurposeLegInt");
        return new MobileTcfStorage(i10, i11, i12, publisherCountryCode, i13, i14, consentString, vendorConsents, vendorLegInt, purposeConsents, purposeLegInt, specialFeatureOptIns, publisherConsent, publisherLegInt, publisherCustomPurposeConsent, publisherCustomPurposeLegInt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileTcfStorage)) {
            return false;
        }
        MobileTcfStorage mobileTcfStorage = (MobileTcfStorage) obj;
        return this.cmpSdkId == mobileTcfStorage.cmpSdkId && this.cmpSdkVersion == mobileTcfStorage.cmpSdkVersion && this.policyVersion == mobileTcfStorage.policyVersion && e0.areEqual(this.publisherCountryCode, mobileTcfStorage.publisherCountryCode) && this.purposeOneTreatment == mobileTcfStorage.purposeOneTreatment && this.useNonStandardStacks == mobileTcfStorage.useNonStandardStacks && e0.areEqual(this.consentString, mobileTcfStorage.consentString) && e0.areEqual(this.vendorConsents, mobileTcfStorage.vendorConsents) && e0.areEqual(this.vendorLegInt, mobileTcfStorage.vendorLegInt) && e0.areEqual(this.purposeConsents, mobileTcfStorage.purposeConsents) && e0.areEqual(this.purposeLegInt, mobileTcfStorage.purposeLegInt) && e0.areEqual(this.specialFeatureOptIns, mobileTcfStorage.specialFeatureOptIns) && e0.areEqual(this.publisherConsent, mobileTcfStorage.publisherConsent) && e0.areEqual(this.publisherLegInt, mobileTcfStorage.publisherLegInt) && e0.areEqual(this.publisherCustomPurposeConsent, mobileTcfStorage.publisherCustomPurposeConsent) && e0.areEqual(this.publisherCustomPurposeLegInt, mobileTcfStorage.publisherCustomPurposeLegInt);
    }

    public final int getCmpSdkId() {
        return this.cmpSdkId;
    }

    public final int getCmpSdkVersion() {
        return this.cmpSdkVersion;
    }

    public final String getConsentString() {
        return this.consentString;
    }

    public final int getPolicyVersion() {
        return this.policyVersion;
    }

    public final String getPublisherConsent() {
        return this.publisherConsent;
    }

    public final String getPublisherCountryCode() {
        return this.publisherCountryCode;
    }

    public final String getPublisherCustomPurposeConsent() {
        return this.publisherCustomPurposeConsent;
    }

    public final String getPublisherCustomPurposeLegInt() {
        return this.publisherCustomPurposeLegInt;
    }

    public final String getPublisherLegInt() {
        return this.publisherLegInt;
    }

    public final String getPurposeConsents() {
        return this.purposeConsents;
    }

    public final String getPurposeLegInt() {
        return this.purposeLegInt;
    }

    public final int getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public final String getSpecialFeatureOptIns() {
        return this.specialFeatureOptIns;
    }

    public final int getUseNonStandardStacks() {
        return this.useNonStandardStacks;
    }

    public final String getVendorConsents() {
        return this.vendorConsents;
    }

    public final String getVendorLegInt() {
        return this.vendorLegInt;
    }

    public int hashCode() {
        return this.publisherCustomPurposeLegInt.hashCode() + o2.e(o2.e(o2.e(o2.e(o2.e(o2.e(o2.e(o2.e(o2.e(g.d(this.useNonStandardStacks, g.d(this.purposeOneTreatment, o2.e(g.d(this.policyVersion, g.d(this.cmpSdkVersion, Integer.hashCode(this.cmpSdkId) * 31, 31), 31), 31, this.publisherCountryCode), 31), 31), 31, this.consentString), 31, this.vendorConsents), 31, this.vendorLegInt), 31, this.purposeConsents), 31, this.purposeLegInt), 31, this.specialFeatureOptIns), 31, this.publisherConsent), 31, this.publisherLegInt), 31, this.publisherCustomPurposeConsent);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MobileTcfStorage(cmpSdkId=");
        sb2.append(this.cmpSdkId);
        sb2.append(", cmpSdkVersion=");
        sb2.append(this.cmpSdkVersion);
        sb2.append(", policyVersion=");
        sb2.append(this.policyVersion);
        sb2.append(", publisherCountryCode=");
        sb2.append(this.publisherCountryCode);
        sb2.append(", purposeOneTreatment=");
        sb2.append(this.purposeOneTreatment);
        sb2.append(", useNonStandardStacks=");
        sb2.append(this.useNonStandardStacks);
        sb2.append(", consentString=");
        sb2.append(this.consentString);
        sb2.append(", vendorConsents=");
        sb2.append(this.vendorConsents);
        sb2.append(", vendorLegInt=");
        sb2.append(this.vendorLegInt);
        sb2.append(", purposeConsents=");
        sb2.append(this.purposeConsents);
        sb2.append(", purposeLegInt=");
        sb2.append(this.purposeLegInt);
        sb2.append(", specialFeatureOptIns=");
        sb2.append(this.specialFeatureOptIns);
        sb2.append(", publisherConsent=");
        sb2.append(this.publisherConsent);
        sb2.append(", publisherLegInt=");
        sb2.append(this.publisherLegInt);
        sb2.append(", publisherCustomPurposeConsent=");
        sb2.append(this.publisherCustomPurposeConsent);
        sb2.append(", publisherCustomPurposeLegInt=");
        return o2.q(sb2, this.publisherCustomPurposeLegInt, ')');
    }

    public MobileTcfStorage(int i10, int i11, int i12, String publisherCountryCode, int i13, int i14, String consentString, String vendorConsents, String vendorLegInt, String purposeConsents, String purposeLegInt, String specialFeatureOptIns, String publisherConsent, String publisherLegInt, String publisherCustomPurposeConsent, String publisherCustomPurposeLegInt) {
        e0.checkNotNullParameter(publisherCountryCode, "publisherCountryCode");
        e0.checkNotNullParameter(consentString, "consentString");
        e0.checkNotNullParameter(vendorConsents, "vendorConsents");
        e0.checkNotNullParameter(vendorLegInt, "vendorLegInt");
        e0.checkNotNullParameter(purposeConsents, "purposeConsents");
        e0.checkNotNullParameter(purposeLegInt, "purposeLegInt");
        e0.checkNotNullParameter(specialFeatureOptIns, "specialFeatureOptIns");
        e0.checkNotNullParameter(publisherConsent, "publisherConsent");
        e0.checkNotNullParameter(publisherLegInt, "publisherLegInt");
        e0.checkNotNullParameter(publisherCustomPurposeConsent, "publisherCustomPurposeConsent");
        e0.checkNotNullParameter(publisherCustomPurposeLegInt, "publisherCustomPurposeLegInt");
        this.cmpSdkId = i10;
        this.cmpSdkVersion = i11;
        this.policyVersion = i12;
        this.publisherCountryCode = publisherCountryCode;
        this.purposeOneTreatment = i13;
        this.useNonStandardStacks = i14;
        this.consentString = consentString;
        this.vendorConsents = vendorConsents;
        this.vendorLegInt = vendorLegInt;
        this.purposeConsents = purposeConsents;
        this.purposeLegInt = purposeLegInt;
        this.specialFeatureOptIns = specialFeatureOptIns;
        this.publisherConsent = publisherConsent;
        this.publisherLegInt = publisherLegInt;
        this.publisherCustomPurposeConsent = publisherCustomPurposeConsent;
        this.publisherCustomPurposeLegInt = publisherCustomPurposeLegInt;
    }

    @SerialName(IABConstants.CMP_SDK_ID)
    public static /* synthetic */ void getCmpSdkId$annotations() {
    }

    @SerialName(IABConstants.CMP_SDK_VERSION)
    public static /* synthetic */ void getCmpSdkVersion$annotations() {
    }

    @SerialName("IABTCF_TCString")
    public static /* synthetic */ void getConsentString$annotations() {
    }

    @SerialName(IABConstants.POLICY_VERSION)
    public static /* synthetic */ void getPolicyVersion$annotations() {
    }

    @SerialName(IABConstants.PUBLISHER_CONSENT)
    public static /* synthetic */ void getPublisherConsent$annotations() {
    }

    @SerialName(IABConstants.PUBLISHER_CC)
    public static /* synthetic */ void getPublisherCountryCode$annotations() {
    }

    @SerialName(IABConstants.PUBLISHER_CUSTOM_PURPOSES_CONSENTS)
    public static /* synthetic */ void getPublisherCustomPurposeConsent$annotations() {
    }

    @SerialName(IABConstants.PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS)
    public static /* synthetic */ void getPublisherCustomPurposeLegInt$annotations() {
    }

    @SerialName(IABConstants.PUBLISHER_LEGITIMATE_INTERESTS)
    public static /* synthetic */ void getPublisherLegInt$annotations() {
    }

    @SerialName(IABConstants.PURPOSE_CONSENTS)
    public static /* synthetic */ void getPurposeConsents$annotations() {
    }

    @SerialName(IABConstants.PURPOSE_LEGITIMATE_INTERESTS)
    public static /* synthetic */ void getPurposeLegInt$annotations() {
    }

    @SerialName(IABConstants.PURPOSE_ONE_TREATMENT)
    public static /* synthetic */ void getPurposeOneTreatment$annotations() {
    }

    @SerialName(IABConstants.SPECIAL_FEATURE_OPT_INS)
    public static /* synthetic */ void getSpecialFeatureOptIns$annotations() {
    }

    @SerialName(IABConstants.USE_NON_STANDARD_STACKS)
    public static /* synthetic */ void getUseNonStandardStacks$annotations() {
    }

    @SerialName(IABConstants.VENDOR_CONSENTS)
    public static /* synthetic */ void getVendorConsents$annotations() {
    }

    @SerialName(IABConstants.VENDOR_LEGITIMATE_INTERESTS)
    public static /* synthetic */ void getVendorLegInt$annotations() {
    }
}
