package uk;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.Status;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c0 extends GeneratedMessageLite.Builder implements d0 {
    public c0 addAllDetails(Iterable<? extends Any> iterable) {
        copyOnWrite();
        ((Status) this.instance).addAllDetails(iterable);
        return this;
    }

    public c0 addDetails(Any any) {
        copyOnWrite();
        ((Status) this.instance).addDetails(any);
        return this;
    }

    public c0 clearCode() {
        copyOnWrite();
        ((Status) this.instance).clearCode();
        return this;
    }

    public c0 clearDetails() {
        copyOnWrite();
        ((Status) this.instance).clearDetails();
        return this;
    }

    public c0 clearMessage() {
        copyOnWrite();
        ((Status) this.instance).clearMessage();
        return this;
    }

    @Override // uk.d0
    public int getCode() {
        return ((Status) this.instance).getCode();
    }

    @Override // uk.d0
    public Any getDetails(int i10) {
        return ((Status) this.instance).getDetails(i10);
    }

    @Override // uk.d0
    public int getDetailsCount() {
        return ((Status) this.instance).getDetailsCount();
    }

    @Override // uk.d0
    public List<Any> getDetailsList() {
        return Collections.unmodifiableList(((Status) this.instance).getDetailsList());
    }

    @Override // uk.d0
    public String getMessage() {
        return ((Status) this.instance).getMessage();
    }

    @Override // uk.d0
    public ByteString getMessageBytes() {
        return ((Status) this.instance).getMessageBytes();
    }

    public c0 removeDetails(int i10) {
        copyOnWrite();
        ((Status) this.instance).removeDetails(i10);
        return this;
    }

    public c0 setCode(int i10) {
        copyOnWrite();
        ((Status) this.instance).setCode(i10);
        return this;
    }

    public c0 setDetails(int i10, Any any) {
        copyOnWrite();
        ((Status) this.instance).setDetails(i10, any);
        return this;
    }

    public c0 setMessage(String str) {
        copyOnWrite();
        ((Status) this.instance).setMessage(str);
        return this;
    }

    public c0 setMessageBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Status) this.instance).setMessageBytes(byteString);
        return this;
    }

    public c0 addDetails(int i10, Any any) {
        copyOnWrite();
        ((Status) this.instance).addDetails(i10, any);
        return this;
    }

    public c0 setDetails(int i10, Any.Builder builder) {
        copyOnWrite();
        ((Status) this.instance).setDetails(i10, builder.build());
        return this;
    }

    public c0 addDetails(Any.Builder builder) {
        copyOnWrite();
        ((Status) this.instance).addDetails(builder.build());
        return this;
    }

    public c0 addDetails(int i10, Any.Builder builder) {
        copyOnWrite();
        ((Status) this.instance).addDetails(i10, builder.build());
        return this;
    }
}
