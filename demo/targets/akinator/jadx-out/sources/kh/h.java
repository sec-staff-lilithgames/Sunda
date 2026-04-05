package kh;

import com.google.api.AuthRequirement;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends GeneratedMessageLite.Builder implements i {
    public h clearAudiences() {
        copyOnWrite();
        ((AuthRequirement) this.instance).clearAudiences();
        return this;
    }

    public h clearProviderId() {
        copyOnWrite();
        ((AuthRequirement) this.instance).clearProviderId();
        return this;
    }

    @Override // kh.i
    public String getAudiences() {
        return ((AuthRequirement) this.instance).getAudiences();
    }

    @Override // kh.i
    public ByteString getAudiencesBytes() {
        return ((AuthRequirement) this.instance).getAudiencesBytes();
    }

    @Override // kh.i
    public String getProviderId() {
        return ((AuthRequirement) this.instance).getProviderId();
    }

    @Override // kh.i
    public ByteString getProviderIdBytes() {
        return ((AuthRequirement) this.instance).getProviderIdBytes();
    }

    public h setAudiences(String str) {
        copyOnWrite();
        ((AuthRequirement) this.instance).setAudiences(str);
        return this;
    }

    public h setAudiencesBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthRequirement) this.instance).setAudiencesBytes(byteString);
        return this;
    }

    public h setProviderId(String str) {
        copyOnWrite();
        ((AuthRequirement) this.instance).setProviderId(str);
        return this;
    }

    public h setProviderIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthRequirement) this.instance).setProviderIdBytes(byteString);
        return this;
    }
}
