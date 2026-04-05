package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.PreconditionFailure;
import uk.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h extends GeneratedMessageLite.Builder implements p {
    public h clearDescription() {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).clearDescription();
        return this;
    }

    public h clearSubject() {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).clearSubject();
        return this;
    }

    public h clearType() {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).clearType();
        return this;
    }

    @Override // uk.p
    public String getDescription() {
        return ((PreconditionFailure.Violation) this.instance).getDescription();
    }

    @Override // uk.p
    public ByteString getDescriptionBytes() {
        return ((PreconditionFailure.Violation) this.instance).getDescriptionBytes();
    }

    @Override // uk.p
    public String getSubject() {
        return ((PreconditionFailure.Violation) this.instance).getSubject();
    }

    @Override // uk.p
    public ByteString getSubjectBytes() {
        return ((PreconditionFailure.Violation) this.instance).getSubjectBytes();
    }

    @Override // uk.p
    public String getType() {
        return ((PreconditionFailure.Violation) this.instance).getType();
    }

    @Override // uk.p
    public ByteString getTypeBytes() {
        return ((PreconditionFailure.Violation) this.instance).getTypeBytes();
    }

    public h setDescription(String str) {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).setDescription(str);
        return this;
    }

    public h setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public h setSubject(String str) {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).setSubject(str);
        return this;
    }

    public h setSubjectBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).setSubjectBytes(byteString);
        return this;
    }

    public h setType(String str) {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).setType(str);
        return this;
    }

    public h setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((PreconditionFailure.Violation) this.instance).setTypeBytes(byteString);
        return this;
    }
}
