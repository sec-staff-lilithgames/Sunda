package tk;

import com.google.longrunning.CancelOperationRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearName() {
        copyOnWrite();
        ((CancelOperationRequest) this.instance).clearName();
        return this;
    }

    @Override // tk.c
    public String getName() {
        return ((CancelOperationRequest) this.instance).getName();
    }

    @Override // tk.c
    public ByteString getNameBytes() {
        return ((CancelOperationRequest) this.instance).getNameBytes();
    }

    public b setName(String str) {
        copyOnWrite();
        ((CancelOperationRequest) this.instance).setName(str);
        return this;
    }

    public b setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CancelOperationRequest) this.instance).setNameBytes(byteString);
        return this;
    }
}
