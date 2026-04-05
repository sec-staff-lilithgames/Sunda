package wk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.type.PostalAddress;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class x extends GeneratedMessageLite.Builder implements y {
    public x addAddressLines(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).addAddressLines(str);
        return this;
    }

    public x addAddressLinesBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).addAddressLinesBytes(byteString);
        return this;
    }

    public x addAllAddressLines(Iterable<String> iterable) {
        copyOnWrite();
        ((PostalAddress) this.instance).addAllAddressLines(iterable);
        return this;
    }

    public x addAllRecipients(Iterable<String> iterable) {
        copyOnWrite();
        ((PostalAddress) this.instance).addAllRecipients(iterable);
        return this;
    }

    public x addRecipients(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).addRecipients(str);
        return this;
    }

    public x addRecipientsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).addRecipientsBytes(byteString);
        return this;
    }

    public x clearAddressLines() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearAddressLines();
        return this;
    }

    public x clearAdministrativeArea() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearAdministrativeArea();
        return this;
    }

    public x clearLanguageCode() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearLanguageCode();
        return this;
    }

    public x clearLocality() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearLocality();
        return this;
    }

    public x clearOrganization() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearOrganization();
        return this;
    }

    public x clearPostalCode() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearPostalCode();
        return this;
    }

    public x clearRecipients() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearRecipients();
        return this;
    }

    public x clearRegionCode() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearRegionCode();
        return this;
    }

    public x clearRevision() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearRevision();
        return this;
    }

    public x clearSortingCode() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearSortingCode();
        return this;
    }

    public x clearSublocality() {
        copyOnWrite();
        ((PostalAddress) this.instance).clearSublocality();
        return this;
    }

    @Override // wk.y
    public String getAddressLines(int i10) {
        return ((PostalAddress) this.instance).getAddressLines(i10);
    }

    @Override // wk.y
    public ByteString getAddressLinesBytes(int i10) {
        return ((PostalAddress) this.instance).getAddressLinesBytes(i10);
    }

    @Override // wk.y
    public int getAddressLinesCount() {
        return ((PostalAddress) this.instance).getAddressLinesCount();
    }

    @Override // wk.y
    public List<String> getAddressLinesList() {
        return Collections.unmodifiableList(((PostalAddress) this.instance).getAddressLinesList());
    }

    @Override // wk.y
    public String getAdministrativeArea() {
        return ((PostalAddress) this.instance).getAdministrativeArea();
    }

    @Override // wk.y
    public ByteString getAdministrativeAreaBytes() {
        return ((PostalAddress) this.instance).getAdministrativeAreaBytes();
    }

    @Override // wk.y
    public String getLanguageCode() {
        return ((PostalAddress) this.instance).getLanguageCode();
    }

    @Override // wk.y
    public ByteString getLanguageCodeBytes() {
        return ((PostalAddress) this.instance).getLanguageCodeBytes();
    }

    @Override // wk.y
    public String getLocality() {
        return ((PostalAddress) this.instance).getLocality();
    }

    @Override // wk.y
    public ByteString getLocalityBytes() {
        return ((PostalAddress) this.instance).getLocalityBytes();
    }

    @Override // wk.y
    public String getOrganization() {
        return ((PostalAddress) this.instance).getOrganization();
    }

    @Override // wk.y
    public ByteString getOrganizationBytes() {
        return ((PostalAddress) this.instance).getOrganizationBytes();
    }

    @Override // wk.y
    public String getPostalCode() {
        return ((PostalAddress) this.instance).getPostalCode();
    }

    @Override // wk.y
    public ByteString getPostalCodeBytes() {
        return ((PostalAddress) this.instance).getPostalCodeBytes();
    }

    @Override // wk.y
    public String getRecipients(int i10) {
        return ((PostalAddress) this.instance).getRecipients(i10);
    }

    @Override // wk.y
    public ByteString getRecipientsBytes(int i10) {
        return ((PostalAddress) this.instance).getRecipientsBytes(i10);
    }

    @Override // wk.y
    public int getRecipientsCount() {
        return ((PostalAddress) this.instance).getRecipientsCount();
    }

    @Override // wk.y
    public List<String> getRecipientsList() {
        return Collections.unmodifiableList(((PostalAddress) this.instance).getRecipientsList());
    }

    @Override // wk.y
    public String getRegionCode() {
        return ((PostalAddress) this.instance).getRegionCode();
    }

    @Override // wk.y
    public ByteString getRegionCodeBytes() {
        return ((PostalAddress) this.instance).getRegionCodeBytes();
    }

    @Override // wk.y
    public int getRevision() {
        return ((PostalAddress) this.instance).getRevision();
    }

    @Override // wk.y
    public String getSortingCode() {
        return ((PostalAddress) this.instance).getSortingCode();
    }

    @Override // wk.y
    public ByteString getSortingCodeBytes() {
        return ((PostalAddress) this.instance).getSortingCodeBytes();
    }

    @Override // wk.y
    public String getSublocality() {
        return ((PostalAddress) this.instance).getSublocality();
    }

    @Override // wk.y
    public ByteString getSublocalityBytes() {
        return ((PostalAddress) this.instance).getSublocalityBytes();
    }

    public x setAddressLines(int i10, String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setAddressLines(i10, str);
        return this;
    }

    public x setAdministrativeArea(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setAdministrativeArea(str);
        return this;
    }

    public x setAdministrativeAreaBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).setAdministrativeAreaBytes(byteString);
        return this;
    }

    public x setLanguageCode(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setLanguageCode(str);
        return this;
    }

    public x setLanguageCodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).setLanguageCodeBytes(byteString);
        return this;
    }

    public x setLocality(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setLocality(str);
        return this;
    }

    public x setLocalityBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).setLocalityBytes(byteString);
        return this;
    }

    public x setOrganization(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setOrganization(str);
        return this;
    }

    public x setOrganizationBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).setOrganizationBytes(byteString);
        return this;
    }

    public x setPostalCode(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setPostalCode(str);
        return this;
    }

    public x setPostalCodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).setPostalCodeBytes(byteString);
        return this;
    }

    public x setRecipients(int i10, String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setRecipients(i10, str);
        return this;
    }

    public x setRegionCode(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setRegionCode(str);
        return this;
    }

    public x setRegionCodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).setRegionCodeBytes(byteString);
        return this;
    }

    public x setRevision(int i10) {
        copyOnWrite();
        ((PostalAddress) this.instance).setRevision(i10);
        return this;
    }

    public x setSortingCode(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setSortingCode(str);
        return this;
    }

    public x setSortingCodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).setSortingCodeBytes(byteString);
        return this;
    }

    public x setSublocality(String str) {
        copyOnWrite();
        ((PostalAddress) this.instance).setSublocality(str);
        return this;
    }

    public x setSublocalityBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PostalAddress) this.instance).setSublocalityBytes(byteString);
        return this;
    }
}
