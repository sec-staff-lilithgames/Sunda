package kh;

import com.google.api.AuthRequirement;
import com.google.api.AuthenticationRule;
import com.google.api.OAuthRequirements;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends GeneratedMessageLite.Builder implements o {
    public n addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).addAllRequirements(iterable);
        return this;
    }

    public n addRequirements(AuthRequirement authRequirement) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).addRequirements(authRequirement);
        return this;
    }

    public n clearAllowWithoutCredential() {
        copyOnWrite();
        ((AuthenticationRule) this.instance).clearAllowWithoutCredential();
        return this;
    }

    public n clearOauth() {
        copyOnWrite();
        ((AuthenticationRule) this.instance).clearOauth();
        return this;
    }

    public n clearRequirements() {
        copyOnWrite();
        ((AuthenticationRule) this.instance).clearRequirements();
        return this;
    }

    public n clearSelector() {
        copyOnWrite();
        ((AuthenticationRule) this.instance).clearSelector();
        return this;
    }

    @Override // kh.o
    public boolean getAllowWithoutCredential() {
        return ((AuthenticationRule) this.instance).getAllowWithoutCredential();
    }

    @Override // kh.o
    public OAuthRequirements getOauth() {
        return ((AuthenticationRule) this.instance).getOauth();
    }

    @Override // kh.o
    public AuthRequirement getRequirements(int i10) {
        return ((AuthenticationRule) this.instance).getRequirements(i10);
    }

    @Override // kh.o
    public int getRequirementsCount() {
        return ((AuthenticationRule) this.instance).getRequirementsCount();
    }

    @Override // kh.o
    public List<AuthRequirement> getRequirementsList() {
        return Collections.unmodifiableList(((AuthenticationRule) this.instance).getRequirementsList());
    }

    @Override // kh.o
    public String getSelector() {
        return ((AuthenticationRule) this.instance).getSelector();
    }

    @Override // kh.o
    public ByteString getSelectorBytes() {
        return ((AuthenticationRule) this.instance).getSelectorBytes();
    }

    @Override // kh.o
    public boolean hasOauth() {
        return ((AuthenticationRule) this.instance).hasOauth();
    }

    public n mergeOauth(OAuthRequirements oAuthRequirements) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).mergeOauth(oAuthRequirements);
        return this;
    }

    public n removeRequirements(int i10) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).removeRequirements(i10);
        return this;
    }

    public n setAllowWithoutCredential(boolean z10) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).setAllowWithoutCredential(z10);
        return this;
    }

    public n setOauth(OAuthRequirements oAuthRequirements) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).setOauth(oAuthRequirements);
        return this;
    }

    public n setRequirements(int i10, AuthRequirement authRequirement) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).setRequirements(i10, authRequirement);
        return this;
    }

    public n setSelector(String str) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).setSelector(str);
        return this;
    }

    public n setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthenticationRule) this.instance).setSelectorBytes(byteString);
        return this;
    }

    public n addRequirements(int i10, AuthRequirement authRequirement) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).addRequirements(i10, authRequirement);
        return this;
    }

    public n setOauth(l3 l3Var) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).setOauth((OAuthRequirements) l3Var.build());
        return this;
    }

    public n setRequirements(int i10, h hVar) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).setRequirements(i10, (AuthRequirement) hVar.build());
        return this;
    }

    public n addRequirements(h hVar) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).addRequirements((AuthRequirement) hVar.build());
        return this;
    }

    public n addRequirements(int i10, h hVar) {
        copyOnWrite();
        ((AuthenticationRule) this.instance).addRequirements(i10, (AuthRequirement) hVar.build());
        return this;
    }
}
