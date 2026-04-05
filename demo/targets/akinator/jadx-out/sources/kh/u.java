package kh;

import com.google.api.BackendRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u extends GeneratedMessageLite.Builder implements y {
    public u clearAddress() {
        copyOnWrite();
        ((BackendRule) this.instance).clearAddress();
        return this;
    }

    public u clearAuthentication() {
        copyOnWrite();
        ((BackendRule) this.instance).clearAuthentication();
        return this;
    }

    public u clearDeadline() {
        copyOnWrite();
        ((BackendRule) this.instance).clearDeadline();
        return this;
    }

    public u clearDisableAuth() {
        copyOnWrite();
        ((BackendRule) this.instance).clearDisableAuth();
        return this;
    }

    public u clearJwtAudience() {
        copyOnWrite();
        ((BackendRule) this.instance).clearJwtAudience();
        return this;
    }

    public u clearMinDeadline() {
        copyOnWrite();
        ((BackendRule) this.instance).clearMinDeadline();
        return this;
    }

    public u clearOperationDeadline() {
        copyOnWrite();
        ((BackendRule) this.instance).clearOperationDeadline();
        return this;
    }

    public u clearPathTranslation() {
        copyOnWrite();
        ((BackendRule) this.instance).clearPathTranslation();
        return this;
    }

    public u clearProtocol() {
        copyOnWrite();
        ((BackendRule) this.instance).clearProtocol();
        return this;
    }

    public u clearSelector() {
        copyOnWrite();
        ((BackendRule) this.instance).clearSelector();
        return this;
    }

    @Override // kh.y
    public String getAddress() {
        return ((BackendRule) this.instance).getAddress();
    }

    @Override // kh.y
    public ByteString getAddressBytes() {
        return ((BackendRule) this.instance).getAddressBytes();
    }

    @Override // kh.y
    public t getAuthenticationCase() {
        return ((BackendRule) this.instance).getAuthenticationCase();
    }

    @Override // kh.y
    public double getDeadline() {
        return ((BackendRule) this.instance).getDeadline();
    }

    @Override // kh.y
    public boolean getDisableAuth() {
        return ((BackendRule) this.instance).getDisableAuth();
    }

    @Override // kh.y
    public String getJwtAudience() {
        return ((BackendRule) this.instance).getJwtAudience();
    }

    @Override // kh.y
    public ByteString getJwtAudienceBytes() {
        return ((BackendRule) this.instance).getJwtAudienceBytes();
    }

    @Override // kh.y
    public double getMinDeadline() {
        return ((BackendRule) this.instance).getMinDeadline();
    }

    @Override // kh.y
    public double getOperationDeadline() {
        return ((BackendRule) this.instance).getOperationDeadline();
    }

    @Override // kh.y
    public x getPathTranslation() {
        return ((BackendRule) this.instance).getPathTranslation();
    }

    @Override // kh.y
    public int getPathTranslationValue() {
        return ((BackendRule) this.instance).getPathTranslationValue();
    }

    @Override // kh.y
    public String getProtocol() {
        return ((BackendRule) this.instance).getProtocol();
    }

    @Override // kh.y
    public ByteString getProtocolBytes() {
        return ((BackendRule) this.instance).getProtocolBytes();
    }

    @Override // kh.y
    public String getSelector() {
        return ((BackendRule) this.instance).getSelector();
    }

    @Override // kh.y
    public ByteString getSelectorBytes() {
        return ((BackendRule) this.instance).getSelectorBytes();
    }

    @Override // kh.y
    public boolean hasDisableAuth() {
        return ((BackendRule) this.instance).hasDisableAuth();
    }

    @Override // kh.y
    public boolean hasJwtAudience() {
        return ((BackendRule) this.instance).hasJwtAudience();
    }

    public u setAddress(String str) {
        copyOnWrite();
        ((BackendRule) this.instance).setAddress(str);
        return this;
    }

    public u setAddressBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BackendRule) this.instance).setAddressBytes(byteString);
        return this;
    }

    public u setDeadline(double d10) {
        copyOnWrite();
        ((BackendRule) this.instance).setDeadline(d10);
        return this;
    }

    public u setDisableAuth(boolean z10) {
        copyOnWrite();
        ((BackendRule) this.instance).setDisableAuth(z10);
        return this;
    }

    public u setJwtAudience(String str) {
        copyOnWrite();
        ((BackendRule) this.instance).setJwtAudience(str);
        return this;
    }

    public u setJwtAudienceBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BackendRule) this.instance).setJwtAudienceBytes(byteString);
        return this;
    }

    public u setMinDeadline(double d10) {
        copyOnWrite();
        ((BackendRule) this.instance).setMinDeadline(d10);
        return this;
    }

    public u setOperationDeadline(double d10) {
        copyOnWrite();
        ((BackendRule) this.instance).setOperationDeadline(d10);
        return this;
    }

    public u setPathTranslation(x xVar) {
        copyOnWrite();
        ((BackendRule) this.instance).setPathTranslation(xVar);
        return this;
    }

    public u setPathTranslationValue(int i10) {
        copyOnWrite();
        ((BackendRule) this.instance).setPathTranslationValue(i10);
        return this;
    }

    public u setProtocol(String str) {
        copyOnWrite();
        ((BackendRule) this.instance).setProtocol(str);
        return this;
    }

    public u setProtocolBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BackendRule) this.instance).setProtocolBytes(byteString);
        return this;
    }

    public u setSelector(String str) {
        copyOnWrite();
        ((BackendRule) this.instance).setSelector(str);
        return this;
    }

    public u setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BackendRule) this.instance).setSelectorBytes(byteString);
        return this;
    }
}
