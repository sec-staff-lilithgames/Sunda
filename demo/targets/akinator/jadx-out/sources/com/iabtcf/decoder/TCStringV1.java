package com.iabtcf.decoder;

import com.iabtcf.utils.BitReader;
import com.iabtcf.utils.BitSetIntIterable;
import com.iabtcf.utils.FieldDefs;
import com.iabtcf.utils.IntIterable;
import com.iabtcf.v2.PublisherRestriction;
import com.ironsource.C3191e4;
import j$.time.Instant;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class TCStringV1 implements TCString {
    private final BitReader bbv;

    private TCStringV1(BitReader bitReader) {
        this.bbv = bitReader;
    }

    private IntIterable fillVendorsV1(BitReader bitReader, FieldDefs fieldDefs, FieldDefs fieldDefs2) {
        BitSet bitSet = new BitSet();
        int bits16 = bitReader.readBits16(fieldDefs);
        if (bitReader.readBits1(fieldDefs.getEnd(bitReader))) {
            boolean bits1 = bitReader.readBits1(FieldDefs.V1_VENDOR_DEFAULT_CONSENT);
            TCStringV2.vendorIdsFromRange(bitReader, bitSet, FieldDefs.V1_VENDOR_NUM_ENTRIES.getOffset(bitReader), (Optional<FieldDefs>) Optional.of(fieldDefs));
            if (bits1) {
                bitSet.flip(1, bits16 + 1);
            }
        } else {
            for (int i10 = 0; i10 < bits16; i10++) {
                if (bitReader.readBits1(fieldDefs2.getOffset(bitReader) + i10)) {
                    bitSet.set(i10 + 1);
                }
            }
        }
        return BitSetIntIterable.from(bitSet);
    }

    public static TCStringV1 fromBitVector(BitReader bitReader) {
        return new TCStringV1(bitReader);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TCStringV1 tCStringV1 = (TCStringV1) obj;
        return getVersion() == tCStringV1.getVersion() && Objects.equals(getCreated(), tCStringV1.getCreated()) && Objects.equals(getLastUpdated(), tCStringV1.getLastUpdated()) && getCmpId() == tCStringV1.getCmpId() && getCmpVersion() == tCStringV1.getCmpVersion() && getConsentScreen() == tCStringV1.getConsentScreen() && Objects.equals(getConsentLanguage(), tCStringV1.getConsentLanguage()) && getVendorListVersion() == tCStringV1.getVendorListVersion() && Objects.equals(getVendorConsent(), tCStringV1.getVendorConsent()) && getDefaultVendorConsent() == tCStringV1.getDefaultVendorConsent() && Objects.equals(getPurposesConsent(), tCStringV1.getPurposesConsent());
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getAllowedVendors() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpId() {
        return this.bbv.readBits12(FieldDefs.V1_CMP_ID);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpVersion() {
        return this.bbv.readBits12(FieldDefs.V1_CMP_VERSION);
    }

    @Override // com.iabtcf.decoder.TCString
    public String getConsentLanguage() {
        return this.bbv.readStr2(FieldDefs.V1_CONSENT_LANGUAGE);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getConsentScreen() {
        return this.bbv.readBits6(FieldDefs.V1_CONSENT_SCREEN);
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getCreated() {
        return Instant.ofEpochMilli(this.bbv.readBits36(FieldDefs.V1_CREATED) * 100);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesConsent() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getDefaultVendorConsent() {
        return this.bbv.readBits1(FieldDefs.V1_VENDOR_IS_RANGE_ENCODING) && this.bbv.readBits1(FieldDefs.V1_VENDOR_DEFAULT_CONSENT);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getDisclosedVendors() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getLastUpdated() {
        return Instant.ofEpochMilli(this.bbv.readBits36(FieldDefs.V1_LAST_UPDATED) * 100);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesConsent() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public String getPublisherCC() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public List<PublisherRestriction> getPublisherRestrictions() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getPurposeOneTreatment() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesConsent() {
        return TCStringV2.fillBitSet(this.bbv, FieldDefs.V1_PURPOSES_ALLOW);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getSpecialFeatureOptIns() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public int getTcfPolicyVersion() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getUseNonStandardStacks() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorConsent() {
        return fillVendorsV1(this.bbv, FieldDefs.V1_VENDOR_MAX_VENDOR_ID, FieldDefs.V1_VENDOR_BITRANGE_FIELD);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorLegitimateInterest() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVendorListVersion() {
        return this.bbv.readBits12(FieldDefs.V1_VENDOR_LIST_VERSION);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVersion() {
        return this.bbv.readBits6(FieldDefs.V1_VERSION);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getVersion()), getCreated(), getLastUpdated(), Integer.valueOf(getCmpId()), Integer.valueOf(getCmpVersion()), Integer.valueOf(getConsentScreen()), getConsentLanguage(), Integer.valueOf(getVendorListVersion()), getVendorConsent(), Boolean.valueOf(getDefaultVendorConsent()), getPurposesConsent());
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean isServiceSpecific() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return "TCStringV1 [getVersion()=" + getVersion() + ", getCreated()=" + getCreated() + ", getLastUpdated()=" + getLastUpdated() + ", getCmpId()=" + getCmpId() + ", getCmpVersion()=" + getCmpVersion() + ", getConsentScreen()=" + getConsentScreen() + ", getConsentLanguage()=" + getConsentLanguage() + ", getVendorListVersion()=" + getVendorListVersion() + ", getVendorConsent()=" + getVendorConsent() + ", getDefaultVendorConsent()=" + getDefaultVendorConsent() + ", getPurposesConsent()=" + getPurposesConsent() + C3191e4.i.f36531e;
    }
}
