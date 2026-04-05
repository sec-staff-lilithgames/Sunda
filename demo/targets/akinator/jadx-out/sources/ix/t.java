package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import xchange.Error$ErrorResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t extends GeneratedMessageLite.Builder implements u {
    public t clearCode() {
        copyOnWrite();
        ((Error$ErrorResponse) this.instance).clearCode();
        return this;
    }

    public t clearDescription() {
        copyOnWrite();
        ((Error$ErrorResponse) this.instance).clearDescription();
        return this;
    }

    @Override // ix.u
    public s getCode() {
        return ((Error$ErrorResponse) this.instance).getCode();
    }

    @Override // ix.u
    public int getCodeValue() {
        return ((Error$ErrorResponse) this.instance).getCodeValue();
    }

    @Override // ix.u
    public String getDescription() {
        return ((Error$ErrorResponse) this.instance).getDescription();
    }

    @Override // ix.u
    public ByteString getDescriptionBytes() {
        return ((Error$ErrorResponse) this.instance).getDescriptionBytes();
    }

    public t setCode(s sVar) {
        copyOnWrite();
        ((Error$ErrorResponse) this.instance).setCode(sVar);
        return this;
    }

    public t setCodeValue(int i10) {
        copyOnWrite();
        ((Error$ErrorResponse) this.instance).setCodeValue(i10);
        return this;
    }

    public t setDescription(String str) {
        copyOnWrite();
        ((Error$ErrorResponse) this.instance).setDescription(str);
        return this;
    }

    public t setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Error$ErrorResponse) this.instance).setDescriptionBytes(byteString);
        return this;
    }
}
