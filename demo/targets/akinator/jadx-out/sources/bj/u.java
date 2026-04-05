package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$ScionConversionEvent;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u extends GeneratedMessageLite.Builder implements v {
    public u clearName() {
        copyOnWrite();
        ((CommonTypesProto$ScionConversionEvent) this.instance).clearName();
        return this;
    }

    @Override // bj.v
    public String getName() {
        return ((CommonTypesProto$ScionConversionEvent) this.instance).getName();
    }

    @Override // bj.v
    public ByteString getNameBytes() {
        return ((CommonTypesProto$ScionConversionEvent) this.instance).getNameBytes();
    }

    public u setName(String str) {
        copyOnWrite();
        ((CommonTypesProto$ScionConversionEvent) this.instance).setName(str);
        return this;
    }

    public u setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CommonTypesProto$ScionConversionEvent) this.instance).setNameBytes(byteString);
        return this;
    }
}
