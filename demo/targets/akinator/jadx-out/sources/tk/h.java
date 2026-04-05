package tk;

import com.google.longrunning.GetOperationRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h extends GeneratedMessageLite.Builder implements i {
    public h clearName() {
        copyOnWrite();
        ((GetOperationRequest) this.instance).clearName();
        return this;
    }

    @Override // tk.i
    public String getName() {
        return ((GetOperationRequest) this.instance).getName();
    }

    @Override // tk.i
    public ByteString getNameBytes() {
        return ((GetOperationRequest) this.instance).getNameBytes();
    }

    public h setName(String str) {
        copyOnWrite();
        ((GetOperationRequest) this.instance).setName(str);
        return this;
    }

    public h setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((GetOperationRequest) this.instance).setNameBytes(byteString);
        return this;
    }
}
