package bj;

import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l0 extends GeneratedMessageLite.Builder implements m0 {
    public l0 clearExperimentId() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentLite) this.instance).clearExperimentId();
        return this;
    }

    @Override // bj.m0
    public String getExperimentId() {
        return ((ExperimentPayloadProto$ExperimentLite) this.instance).getExperimentId();
    }

    @Override // bj.m0
    public ByteString getExperimentIdBytes() {
        return ((ExperimentPayloadProto$ExperimentLite) this.instance).getExperimentIdBytes();
    }

    public l0 setExperimentId(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentLite) this.instance).setExperimentId(str);
        return this;
    }

    public l0 setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentLite) this.instance).setExperimentIdBytes(byteString);
        return this;
    }
}
