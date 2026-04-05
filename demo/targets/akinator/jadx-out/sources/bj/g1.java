package bj;

import com.google.firebase.inappmessaging.MessagesProto$Action;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g1 extends GeneratedMessageLite.Builder implements h1 {
    public g1 clearActionUrl() {
        copyOnWrite();
        ((MessagesProto$Action) this.instance).clearActionUrl();
        return this;
    }

    @Override // bj.h1
    public String getActionUrl() {
        return ((MessagesProto$Action) this.instance).getActionUrl();
    }

    @Override // bj.h1
    public ByteString getActionUrlBytes() {
        return ((MessagesProto$Action) this.instance).getActionUrlBytes();
    }

    public g1 setActionUrl(String str) {
        copyOnWrite();
        ((MessagesProto$Action) this.instance).setActionUrl(str);
        return this;
    }

    public g1 setActionUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MessagesProto$Action) this.instance).setActionUrlBytes(byteString);
        return this;
    }
}
