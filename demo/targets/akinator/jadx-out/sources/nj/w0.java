package nj;

import com.google.firebase.inappmessaging.internal.RateLimitProto$Counter;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w0 extends GeneratedMessageLite.Builder implements x0 {
    public w0 clearStartTimeEpoch() {
        copyOnWrite();
        ((RateLimitProto$Counter) this.instance).clearStartTimeEpoch();
        return this;
    }

    public w0 clearValue() {
        copyOnWrite();
        ((RateLimitProto$Counter) this.instance).clearValue();
        return this;
    }

    @Override // nj.x0
    public long getStartTimeEpoch() {
        return ((RateLimitProto$Counter) this.instance).getStartTimeEpoch();
    }

    @Override // nj.x0
    public long getValue() {
        return ((RateLimitProto$Counter) this.instance).getValue();
    }

    public w0 setStartTimeEpoch(long j10) {
        copyOnWrite();
        ((RateLimitProto$Counter) this.instance).setStartTimeEpoch(j10);
        return this;
    }

    public w0 setValue(long j10) {
        copyOnWrite();
        ((RateLimitProto$Counter) this.instance).setValue(j10);
        return this;
    }
}
