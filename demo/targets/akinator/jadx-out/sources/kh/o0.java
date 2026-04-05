package kh;

import com.google.api.Control;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o0 extends GeneratedMessageLite.Builder implements p0 {
    public o0 clearEnvironment() {
        copyOnWrite();
        ((Control) this.instance).clearEnvironment();
        return this;
    }

    @Override // kh.p0
    public String getEnvironment() {
        return ((Control) this.instance).getEnvironment();
    }

    @Override // kh.p0
    public ByteString getEnvironmentBytes() {
        return ((Control) this.instance).getEnvironmentBytes();
    }

    public o0 setEnvironment(String str) {
        copyOnWrite();
        ((Control) this.instance).setEnvironment(str);
        return this;
    }

    public o0 setEnvironmentBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Control) this.instance).setEnvironmentBytes(byteString);
        return this;
    }
}
