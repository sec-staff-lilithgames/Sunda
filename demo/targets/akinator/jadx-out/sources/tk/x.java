package tk;

import com.google.longrunning.WaitOperationRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class x extends GeneratedMessageLite.Builder implements y {
    public x clearName() {
        copyOnWrite();
        ((WaitOperationRequest) this.instance).clearName();
        return this;
    }

    public x clearTimeout() {
        copyOnWrite();
        ((WaitOperationRequest) this.instance).clearTimeout();
        return this;
    }

    @Override // tk.y
    public String getName() {
        return ((WaitOperationRequest) this.instance).getName();
    }

    @Override // tk.y
    public ByteString getNameBytes() {
        return ((WaitOperationRequest) this.instance).getNameBytes();
    }

    @Override // tk.y
    public Duration getTimeout() {
        return ((WaitOperationRequest) this.instance).getTimeout();
    }

    @Override // tk.y
    public boolean hasTimeout() {
        return ((WaitOperationRequest) this.instance).hasTimeout();
    }

    public x mergeTimeout(Duration duration) {
        copyOnWrite();
        ((WaitOperationRequest) this.instance).mergeTimeout(duration);
        return this;
    }

    public x setName(String str) {
        copyOnWrite();
        ((WaitOperationRequest) this.instance).setName(str);
        return this;
    }

    public x setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((WaitOperationRequest) this.instance).setNameBytes(byteString);
        return this;
    }

    public x setTimeout(Duration duration) {
        copyOnWrite();
        ((WaitOperationRequest) this.instance).setTimeout(duration);
        return this;
    }

    public x setTimeout(Duration.Builder builder) {
        copyOnWrite();
        ((WaitOperationRequest) this.instance).setTimeout(builder.build());
        return this;
    }
}
