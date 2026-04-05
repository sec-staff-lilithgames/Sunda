package wk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.type.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g0 extends GeneratedMessageLite.Builder implements h0 {
    public g0 clearId() {
        copyOnWrite();
        ((TimeZone) this.instance).clearId();
        return this;
    }

    public g0 clearVersion() {
        copyOnWrite();
        ((TimeZone) this.instance).clearVersion();
        return this;
    }

    @Override // wk.h0
    public String getId() {
        return ((TimeZone) this.instance).getId();
    }

    @Override // wk.h0
    public ByteString getIdBytes() {
        return ((TimeZone) this.instance).getIdBytes();
    }

    @Override // wk.h0
    public String getVersion() {
        return ((TimeZone) this.instance).getVersion();
    }

    @Override // wk.h0
    public ByteString getVersionBytes() {
        return ((TimeZone) this.instance).getVersionBytes();
    }

    public g0 setId(String str) {
        copyOnWrite();
        ((TimeZone) this.instance).setId(str);
        return this;
    }

    public g0 setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((TimeZone) this.instance).setIdBytes(byteString);
        return this;
    }

    public g0 setVersion(String str) {
        copyOnWrite();
        ((TimeZone) this.instance).setVersion(str);
        return this;
    }

    public g0 setVersionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((TimeZone) this.instance).setVersionBytes(byteString);
        return this;
    }
}
