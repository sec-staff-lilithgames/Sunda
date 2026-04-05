package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class s extends GeneratedMessageLite.Builder implements t {
    public s clearValue() {
        copyOnWrite();
        ((CommonTypesProto$Priority) this.instance).clearValue();
        return this;
    }

    @Override // bj.t
    public int getValue() {
        return ((CommonTypesProto$Priority) this.instance).getValue();
    }

    public s setValue(int i10) {
        copyOnWrite();
        ((CommonTypesProto$Priority) this.instance).setValue(i10);
        return this;
    }
}
