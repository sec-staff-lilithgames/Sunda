package com.iabtcf.decoder;

import com.iabtcf.exceptions.ByteParseException;
import com.iabtcf.exceptions.UnsupportedVersionException;
import com.iabtcf.utils.BitReader;
import com.iabtcf.utils.FieldDefs;
import com.iabtcf.utils.IntIterable;
import com.ironsource.C3191e4;
import j$.time.Instant;
import j$.util.Base64;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class PPCString {
    private final BitReader bbv;

    private PPCString(BitReader bitReader) {
        this.bbv = bitReader;
    }

    public static PPCString decode(String str) throws ByteParseException, IllegalArgumentException, UnsupportedVersionException {
        return new PPCString(new BitReader(Base64.getUrlDecoder().decode(str)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PPCString pPCString = (PPCString) obj;
        return getVersion() == pPCString.getVersion() && Objects.equals(getCreated(), pPCString.getCreated()) && Objects.equals(getLastUpdated(), pPCString.getLastUpdated()) && getCmpId() == pPCString.getCmpId() && getCmpVersion() == pPCString.getCmpVersion() && getConsentScreen() == pPCString.getConsentScreen() && Objects.equals(getConsentLanguage(), pPCString.getConsentLanguage()) && getVendorListVersion() == pPCString.getVendorListVersion() && Integer.valueOf(getPublisherPurposesVersion()).equals(Integer.valueOf(pPCString.getPublisherPurposesVersion())) && Objects.equals(getStandardPurposesAllowed(), pPCString.getStandardPurposesAllowed()) && Objects.equals(getCustomPurposesBitField(), pPCString.getCustomPurposesBitField());
    }

    public int getCmpId() {
        return this.bbv.readBits12(FieldDefs.V1_CMP_ID);
    }

    public int getCmpVersion() {
        return this.bbv.readBits12(FieldDefs.V1_CMP_VERSION);
    }

    public String getConsentLanguage() {
        return this.bbv.readStr2(FieldDefs.V1_CONSENT_LANGUAGE);
    }

    public int getConsentScreen() {
        return this.bbv.readBits6(FieldDefs.V1_CONSENT_SCREEN);
    }

    public Instant getCreated() {
        return Instant.ofEpochMilli(this.bbv.readBits36(FieldDefs.V1_CREATED) * 100);
    }

    public IntIterable getCustomPurposesBitField() {
        return TCStringV2.fillBitSet(this.bbv, FieldDefs.V1_PPC_CUSTOM_PURPOSES_BITFIELD);
    }

    public Instant getLastUpdated() {
        return Instant.ofEpochMilli(this.bbv.readBits36(FieldDefs.V1_LAST_UPDATED) * 100);
    }

    public int getPublisherPurposesVersion() {
        return this.bbv.readBits12(FieldDefs.V1_PPC_PUBLISHER_PURPOSES_VERSION);
    }

    public IntIterable getStandardPurposesAllowed() {
        return TCStringV2.fillBitSet(this.bbv, FieldDefs.V1_PPC_STANDARD_PURPOSES_ALLOWED);
    }

    public int getVendorListVersion() {
        return this.bbv.readBits12(FieldDefs.V1_VENDOR_LIST_VERSION);
    }

    public int getVersion() {
        return this.bbv.readBits6(FieldDefs.V1_VERSION);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getVersion()), getCreated(), getLastUpdated(), Integer.valueOf(getCmpId()), Integer.valueOf(getCmpVersion()), Integer.valueOf(getConsentScreen()), getConsentLanguage(), Integer.valueOf(getVendorListVersion()), Integer.valueOf(getPublisherPurposesVersion()), getStandardPurposesAllowed(), getCustomPurposesBitField());
    }

    public String toString() {
        return "PPCString [getVersion()=" + getVersion() + ", getCreated()=" + getCreated() + ", getLastUpdated()=" + getLastUpdated() + ", getCmpId()=" + getCmpId() + ", getCmpVersion()=" + getCmpVersion() + ", getConsentScreen()=" + getConsentScreen() + ", getConsentLanguage()=" + getConsentLanguage() + ", getVendorListVersion()=" + getVendorListVersion() + ", getPublisherPurposesVersion()=" + getPublisherPurposesVersion() + ", getStandardPurposesAllowed()=" + getStandardPurposesAllowed() + ", getCustomPurposesBitField()=" + getCustomPurposesBitField() + C3191e4.i.f36531e;
    }
}
