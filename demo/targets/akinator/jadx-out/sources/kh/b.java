package kh;

import com.google.api.Advice;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearDescription() {
        copyOnWrite();
        ((Advice) this.instance).clearDescription();
        return this;
    }

    @Override // kh.c
    public String getDescription() {
        return ((Advice) this.instance).getDescription();
    }

    @Override // kh.c
    public ByteString getDescriptionBytes() {
        return ((Advice) this.instance).getDescriptionBytes();
    }

    public b setDescription(String str) {
        copyOnWrite();
        ((Advice) this.instance).setDescription(str);
        return this;
    }

    public b setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Advice) this.instance).setDescriptionBytes(byteString);
        return this;
    }
}
