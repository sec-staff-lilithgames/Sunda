package kh;

import com.google.api.AuthProvider;
import com.google.api.JwtLocation;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends GeneratedMessageLite.Builder implements f {
    public e addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        copyOnWrite();
        ((AuthProvider) this.instance).addAllJwtLocations(iterable);
        return this;
    }

    public e addJwtLocations(JwtLocation jwtLocation) {
        copyOnWrite();
        ((AuthProvider) this.instance).addJwtLocations(jwtLocation);
        return this;
    }

    public e clearAudiences() {
        copyOnWrite();
        ((AuthProvider) this.instance).clearAudiences();
        return this;
    }

    public e clearAuthorizationUrl() {
        copyOnWrite();
        ((AuthProvider) this.instance).clearAuthorizationUrl();
        return this;
    }

    public e clearId() {
        copyOnWrite();
        ((AuthProvider) this.instance).clearId();
        return this;
    }

    public e clearIssuer() {
        copyOnWrite();
        ((AuthProvider) this.instance).clearIssuer();
        return this;
    }

    public e clearJwksUri() {
        copyOnWrite();
        ((AuthProvider) this.instance).clearJwksUri();
        return this;
    }

    public e clearJwtLocations() {
        copyOnWrite();
        ((AuthProvider) this.instance).clearJwtLocations();
        return this;
    }

    @Override // kh.f
    public String getAudiences() {
        return ((AuthProvider) this.instance).getAudiences();
    }

    @Override // kh.f
    public ByteString getAudiencesBytes() {
        return ((AuthProvider) this.instance).getAudiencesBytes();
    }

    @Override // kh.f
    public String getAuthorizationUrl() {
        return ((AuthProvider) this.instance).getAuthorizationUrl();
    }

    @Override // kh.f
    public ByteString getAuthorizationUrlBytes() {
        return ((AuthProvider) this.instance).getAuthorizationUrlBytes();
    }

    @Override // kh.f
    public String getId() {
        return ((AuthProvider) this.instance).getId();
    }

    @Override // kh.f
    public ByteString getIdBytes() {
        return ((AuthProvider) this.instance).getIdBytes();
    }

    @Override // kh.f
    public String getIssuer() {
        return ((AuthProvider) this.instance).getIssuer();
    }

    @Override // kh.f
    public ByteString getIssuerBytes() {
        return ((AuthProvider) this.instance).getIssuerBytes();
    }

    @Override // kh.f
    public String getJwksUri() {
        return ((AuthProvider) this.instance).getJwksUri();
    }

    @Override // kh.f
    public ByteString getJwksUriBytes() {
        return ((AuthProvider) this.instance).getJwksUriBytes();
    }

    @Override // kh.f
    public JwtLocation getJwtLocations(int i10) {
        return ((AuthProvider) this.instance).getJwtLocations(i10);
    }

    @Override // kh.f
    public int getJwtLocationsCount() {
        return ((AuthProvider) this.instance).getJwtLocationsCount();
    }

    @Override // kh.f
    public List<JwtLocation> getJwtLocationsList() {
        return Collections.unmodifiableList(((AuthProvider) this.instance).getJwtLocationsList());
    }

    public e removeJwtLocations(int i10) {
        copyOnWrite();
        ((AuthProvider) this.instance).removeJwtLocations(i10);
        return this;
    }

    public e setAudiences(String str) {
        copyOnWrite();
        ((AuthProvider) this.instance).setAudiences(str);
        return this;
    }

    public e setAudiencesBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthProvider) this.instance).setAudiencesBytes(byteString);
        return this;
    }

    public e setAuthorizationUrl(String str) {
        copyOnWrite();
        ((AuthProvider) this.instance).setAuthorizationUrl(str);
        return this;
    }

    public e setAuthorizationUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthProvider) this.instance).setAuthorizationUrlBytes(byteString);
        return this;
    }

    public e setId(String str) {
        copyOnWrite();
        ((AuthProvider) this.instance).setId(str);
        return this;
    }

    public e setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthProvider) this.instance).setIdBytes(byteString);
        return this;
    }

    public e setIssuer(String str) {
        copyOnWrite();
        ((AuthProvider) this.instance).setIssuer(str);
        return this;
    }

    public e setIssuerBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthProvider) this.instance).setIssuerBytes(byteString);
        return this;
    }

    public e setJwksUri(String str) {
        copyOnWrite();
        ((AuthProvider) this.instance).setJwksUri(str);
        return this;
    }

    public e setJwksUriBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthProvider) this.instance).setJwksUriBytes(byteString);
        return this;
    }

    public e setJwtLocations(int i10, JwtLocation jwtLocation) {
        copyOnWrite();
        ((AuthProvider) this.instance).setJwtLocations(i10, jwtLocation);
        return this;
    }

    public e addJwtLocations(int i10, JwtLocation jwtLocation) {
        copyOnWrite();
        ((AuthProvider) this.instance).addJwtLocations(i10, jwtLocation);
        return this;
    }

    public e setJwtLocations(int i10, q1 q1Var) {
        copyOnWrite();
        ((AuthProvider) this.instance).setJwtLocations(i10, (JwtLocation) q1Var.build());
        return this;
    }

    public e addJwtLocations(q1 q1Var) {
        copyOnWrite();
        ((AuthProvider) this.instance).addJwtLocations((JwtLocation) q1Var.build());
        return this;
    }

    public e addJwtLocations(int i10, q1 q1Var) {
        copyOnWrite();
        ((AuthProvider) this.instance).addJwtLocations(i10, (JwtLocation) q1Var.build());
        return this;
    }
}
