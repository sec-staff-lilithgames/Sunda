package kh;

import com.google.api.OAuthRequirements;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l3 extends GeneratedMessageLite.Builder implements m3 {
    public l3 clearCanonicalScopes() {
        copyOnWrite();
        ((OAuthRequirements) this.instance).clearCanonicalScopes();
        return this;
    }

    @Override // kh.m3
    public String getCanonicalScopes() {
        return ((OAuthRequirements) this.instance).getCanonicalScopes();
    }

    @Override // kh.m3
    public ByteString getCanonicalScopesBytes() {
        return ((OAuthRequirements) this.instance).getCanonicalScopesBytes();
    }

    public l3 setCanonicalScopes(String str) {
        copyOnWrite();
        ((OAuthRequirements) this.instance).setCanonicalScopes(str);
        return this;
    }

    public l3 setCanonicalScopesBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((OAuthRequirements) this.instance).setCanonicalScopesBytes(byteString);
        return this;
    }
}
