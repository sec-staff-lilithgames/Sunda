package lh;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends GeneratedMessageLite.Builder implements f {
    public e clearPrincipalEmail() {
        copyOnWrite();
        ((AuthenticationInfo) this.instance).clearPrincipalEmail();
        return this;
    }

    @Override // lh.f
    public String getPrincipalEmail() {
        return ((AuthenticationInfo) this.instance).getPrincipalEmail();
    }

    @Override // lh.f
    public ByteString getPrincipalEmailBytes() {
        return ((AuthenticationInfo) this.instance).getPrincipalEmailBytes();
    }

    public e setPrincipalEmail(String str) {
        copyOnWrite();
        ((AuthenticationInfo) this.instance).setPrincipalEmail(str);
        return this;
    }

    public e setPrincipalEmailBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AuthenticationInfo) this.instance).setPrincipalEmailBytes(byteString);
        return this;
    }
}
