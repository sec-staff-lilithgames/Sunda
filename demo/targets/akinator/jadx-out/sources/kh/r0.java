package kh;

import com.google.api.CustomHttpPattern;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r0 extends GeneratedMessageLite.Builder implements s0 {
    public r0 clearKind() {
        copyOnWrite();
        ((CustomHttpPattern) this.instance).clearKind();
        return this;
    }

    public r0 clearPath() {
        copyOnWrite();
        ((CustomHttpPattern) this.instance).clearPath();
        return this;
    }

    @Override // kh.s0
    public String getKind() {
        return ((CustomHttpPattern) this.instance).getKind();
    }

    @Override // kh.s0
    public ByteString getKindBytes() {
        return ((CustomHttpPattern) this.instance).getKindBytes();
    }

    @Override // kh.s0
    public String getPath() {
        return ((CustomHttpPattern) this.instance).getPath();
    }

    @Override // kh.s0
    public ByteString getPathBytes() {
        return ((CustomHttpPattern) this.instance).getPathBytes();
    }

    public r0 setKind(String str) {
        copyOnWrite();
        ((CustomHttpPattern) this.instance).setKind(str);
        return this;
    }

    public r0 setKindBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CustomHttpPattern) this.instance).setKindBytes(byteString);
        return this;
    }

    public r0 setPath(String str) {
        copyOnWrite();
        ((CustomHttpPattern) this.instance).setPath(str);
        return this;
    }

    public r0 setPathBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CustomHttpPattern) this.instance).setPathBytes(byteString);
        return this;
    }
}
