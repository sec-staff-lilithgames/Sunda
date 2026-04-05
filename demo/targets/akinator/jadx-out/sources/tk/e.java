package tk;

import com.google.longrunning.DeleteOperationRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e extends GeneratedMessageLite.Builder implements f {
    public e clearName() {
        copyOnWrite();
        ((DeleteOperationRequest) this.instance).clearName();
        return this;
    }

    @Override // tk.f
    public String getName() {
        return ((DeleteOperationRequest) this.instance).getName();
    }

    @Override // tk.f
    public ByteString getNameBytes() {
        return ((DeleteOperationRequest) this.instance).getNameBytes();
    }

    public e setName(String str) {
        copyOnWrite();
        ((DeleteOperationRequest) this.instance).setName(str);
        return this;
    }

    public e setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((DeleteOperationRequest) this.instance).setNameBytes(byteString);
        return this;
    }
}
