package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import xchange.Domain$SaleOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends GeneratedMessageLite.Builder implements o {
    public n clearId() {
        copyOnWrite();
        ((Domain$SaleOrder) this.instance).clearId();
        return this;
    }

    @Override // ix.o
    public String getId() {
        return ((Domain$SaleOrder) this.instance).getId();
    }

    @Override // ix.o
    public ByteString getIdBytes() {
        return ((Domain$SaleOrder) this.instance).getIdBytes();
    }

    public n setId(String str) {
        copyOnWrite();
        ((Domain$SaleOrder) this.instance).setId(str);
        return this;
    }

    public n setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Domain$SaleOrder) this.instance).setIdBytes(byteString);
        return this;
    }
}
