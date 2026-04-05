package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.QuotaFailure;
import uk.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k extends GeneratedMessageLite.Builder implements r {
    public k clearDescription() {
        copyOnWrite();
        ((QuotaFailure.Violation) this.instance).clearDescription();
        return this;
    }

    public k clearSubject() {
        copyOnWrite();
        ((QuotaFailure.Violation) this.instance).clearSubject();
        return this;
    }

    @Override // uk.r
    public String getDescription() {
        return ((QuotaFailure.Violation) this.instance).getDescription();
    }

    @Override // uk.r
    public ByteString getDescriptionBytes() {
        return ((QuotaFailure.Violation) this.instance).getDescriptionBytes();
    }

    @Override // uk.r
    public String getSubject() {
        return ((QuotaFailure.Violation) this.instance).getSubject();
    }

    @Override // uk.r
    public ByteString getSubjectBytes() {
        return ((QuotaFailure.Violation) this.instance).getSubjectBytes();
    }

    public k setDescription(String str) {
        copyOnWrite();
        ((QuotaFailure.Violation) this.instance).setDescription(str);
        return this;
    }

    public k setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((QuotaFailure.Violation) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public k setSubject(String str) {
        copyOnWrite();
        ((QuotaFailure.Violation) this.instance).setSubject(str);
        return this;
    }

    public k setSubjectBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((QuotaFailure.Violation) this.instance).setSubjectBytes(byteString);
        return this;
    }
}
