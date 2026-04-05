package tk;

import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.Status;
import uk.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q extends GeneratedMessageLite.Builder implements v {
    public q clearDone() {
        copyOnWrite();
        ((Operation) this.instance).clearDone();
        return this;
    }

    public q clearError() {
        copyOnWrite();
        ((Operation) this.instance).clearError();
        return this;
    }

    public q clearMetadata() {
        copyOnWrite();
        ((Operation) this.instance).clearMetadata();
        return this;
    }

    public q clearName() {
        copyOnWrite();
        ((Operation) this.instance).clearName();
        return this;
    }

    public q clearResponse() {
        copyOnWrite();
        ((Operation) this.instance).clearResponse();
        return this;
    }

    public q clearResult() {
        copyOnWrite();
        ((Operation) this.instance).clearResult();
        return this;
    }

    @Override // tk.v
    public boolean getDone() {
        return ((Operation) this.instance).getDone();
    }

    @Override // tk.v
    public Status getError() {
        return ((Operation) this.instance).getError();
    }

    @Override // tk.v
    public Any getMetadata() {
        return ((Operation) this.instance).getMetadata();
    }

    @Override // tk.v
    public String getName() {
        return ((Operation) this.instance).getName();
    }

    @Override // tk.v
    public ByteString getNameBytes() {
        return ((Operation) this.instance).getNameBytes();
    }

    @Override // tk.v
    public Any getResponse() {
        return ((Operation) this.instance).getResponse();
    }

    @Override // tk.v
    public r getResultCase() {
        return ((Operation) this.instance).getResultCase();
    }

    @Override // tk.v
    public boolean hasError() {
        return ((Operation) this.instance).hasError();
    }

    @Override // tk.v
    public boolean hasMetadata() {
        return ((Operation) this.instance).hasMetadata();
    }

    @Override // tk.v
    public boolean hasResponse() {
        return ((Operation) this.instance).hasResponse();
    }

    public q mergeError(Status status) {
        copyOnWrite();
        ((Operation) this.instance).mergeError(status);
        return this;
    }

    public q mergeMetadata(Any any) {
        copyOnWrite();
        ((Operation) this.instance).mergeMetadata(any);
        return this;
    }

    public q mergeResponse(Any any) {
        copyOnWrite();
        ((Operation) this.instance).mergeResponse(any);
        return this;
    }

    public q setDone(boolean z10) {
        copyOnWrite();
        ((Operation) this.instance).setDone(z10);
        return this;
    }

    public q setError(Status status) {
        copyOnWrite();
        ((Operation) this.instance).setError(status);
        return this;
    }

    public q setMetadata(Any any) {
        copyOnWrite();
        ((Operation) this.instance).setMetadata(any);
        return this;
    }

    public q setName(String str) {
        copyOnWrite();
        ((Operation) this.instance).setName(str);
        return this;
    }

    public q setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Operation) this.instance).setNameBytes(byteString);
        return this;
    }

    public q setResponse(Any any) {
        copyOnWrite();
        ((Operation) this.instance).setResponse(any);
        return this;
    }

    public q setError(c0 c0Var) {
        copyOnWrite();
        ((Operation) this.instance).setError((Status) c0Var.build());
        return this;
    }

    public q setMetadata(Any.Builder builder) {
        copyOnWrite();
        ((Operation) this.instance).setMetadata(builder.build());
        return this;
    }

    public q setResponse(Any.Builder builder) {
        copyOnWrite();
        ((Operation) this.instance).setResponse(builder.build());
        return this;
    }
}
