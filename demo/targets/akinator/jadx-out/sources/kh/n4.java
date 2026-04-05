package kh;

import com.google.api.ResourceReference;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n4 extends GeneratedMessageLite.Builder implements o4 {
    public n4 clearChildType() {
        copyOnWrite();
        ((ResourceReference) this.instance).clearChildType();
        return this;
    }

    public n4 clearType() {
        copyOnWrite();
        ((ResourceReference) this.instance).clearType();
        return this;
    }

    @Override // kh.o4
    public String getChildType() {
        return ((ResourceReference) this.instance).getChildType();
    }

    @Override // kh.o4
    public ByteString getChildTypeBytes() {
        return ((ResourceReference) this.instance).getChildTypeBytes();
    }

    @Override // kh.o4
    public String getType() {
        return ((ResourceReference) this.instance).getType();
    }

    @Override // kh.o4
    public ByteString getTypeBytes() {
        return ((ResourceReference) this.instance).getTypeBytes();
    }

    public n4 setChildType(String str) {
        copyOnWrite();
        ((ResourceReference) this.instance).setChildType(str);
        return this;
    }

    public n4 setChildTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceReference) this.instance).setChildTypeBytes(byteString);
        return this;
    }

    public n4 setType(String str) {
        copyOnWrite();
        ((ResourceReference) this.instance).setType(str);
        return this;
    }

    public n4 setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ResourceReference) this.instance).setTypeBytes(byteString);
        return this;
    }
}
