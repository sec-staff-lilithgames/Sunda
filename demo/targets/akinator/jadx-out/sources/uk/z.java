package uk;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.RetryInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class z extends GeneratedMessageLite.Builder implements a0 {
    public z clearRetryDelay() {
        copyOnWrite();
        ((RetryInfo) this.instance).clearRetryDelay();
        return this;
    }

    @Override // uk.a0
    public Duration getRetryDelay() {
        return ((RetryInfo) this.instance).getRetryDelay();
    }

    @Override // uk.a0
    public boolean hasRetryDelay() {
        return ((RetryInfo) this.instance).hasRetryDelay();
    }

    public z mergeRetryDelay(Duration duration) {
        copyOnWrite();
        ((RetryInfo) this.instance).mergeRetryDelay(duration);
        return this;
    }

    public z setRetryDelay(Duration duration) {
        copyOnWrite();
        ((RetryInfo) this.instance).setRetryDelay(duration);
        return this;
    }

    public z setRetryDelay(Duration.Builder builder) {
        copyOnWrite();
        ((RetryInfo) this.instance).setRetryDelay(builder.build());
        return this;
    }
}
