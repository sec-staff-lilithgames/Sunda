package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.BadRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements uk.b {
    public b clearDescription() {
        copyOnWrite();
        ((BadRequest.FieldViolation) this.instance).clearDescription();
        return this;
    }

    public b clearField() {
        copyOnWrite();
        ((BadRequest.FieldViolation) this.instance).clearField();
        return this;
    }

    @Override // uk.b
    public String getDescription() {
        return ((BadRequest.FieldViolation) this.instance).getDescription();
    }

    @Override // uk.b
    public ByteString getDescriptionBytes() {
        return ((BadRequest.FieldViolation) this.instance).getDescriptionBytes();
    }

    @Override // uk.b
    public String getField() {
        return ((BadRequest.FieldViolation) this.instance).getField();
    }

    @Override // uk.b
    public ByteString getFieldBytes() {
        return ((BadRequest.FieldViolation) this.instance).getFieldBytes();
    }

    public b setDescription(String str) {
        copyOnWrite();
        ((BadRequest.FieldViolation) this.instance).setDescription(str);
        return this;
    }

    public b setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BadRequest.FieldViolation) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public b setField(String str) {
        copyOnWrite();
        ((BadRequest.FieldViolation) this.instance).setField(str);
        return this;
    }

    public b setFieldBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BadRequest.FieldViolation) this.instance).setFieldBytes(byteString);
        return this;
    }
}
