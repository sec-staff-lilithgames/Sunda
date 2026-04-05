package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import java.util.Collections;
import java.util.List;
import kh.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends GeneratedMessageLite.Builder implements u0 {
    public n addAllAttachments(Iterable<? extends Any> iterable) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).addAllAttachments(iterable);
        return this;
    }

    public n addAttachments(Any any) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).addAttachments(any);
        return this;
    }

    public n clearAttachments() {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).clearAttachments();
        return this;
    }

    public n clearTimestamp() {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).clearTimestamp();
        return this;
    }

    public n clearValue() {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).clearValue();
        return this;
    }

    @Override // kh.u0
    public Any getAttachments(int i10) {
        return ((Distribution.Exemplar) this.instance).getAttachments(i10);
    }

    @Override // kh.u0
    public int getAttachmentsCount() {
        return ((Distribution.Exemplar) this.instance).getAttachmentsCount();
    }

    @Override // kh.u0
    public List<Any> getAttachmentsList() {
        return Collections.unmodifiableList(((Distribution.Exemplar) this.instance).getAttachmentsList());
    }

    @Override // kh.u0
    public Timestamp getTimestamp() {
        return ((Distribution.Exemplar) this.instance).getTimestamp();
    }

    @Override // kh.u0
    public double getValue() {
        return ((Distribution.Exemplar) this.instance).getValue();
    }

    @Override // kh.u0
    public boolean hasTimestamp() {
        return ((Distribution.Exemplar) this.instance).hasTimestamp();
    }

    public n mergeTimestamp(Timestamp timestamp) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).mergeTimestamp(timestamp);
        return this;
    }

    public n removeAttachments(int i10) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).removeAttachments(i10);
        return this;
    }

    public n setAttachments(int i10, Any any) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).setAttachments(i10, any);
        return this;
    }

    public n setTimestamp(Timestamp timestamp) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).setTimestamp(timestamp);
        return this;
    }

    public n setValue(double d10) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).setValue(d10);
        return this;
    }

    public n addAttachments(int i10, Any any) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).addAttachments(i10, any);
        return this;
    }

    public n setAttachments(int i10, Any.Builder builder) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).setAttachments(i10, builder.build());
        return this;
    }

    public n setTimestamp(Timestamp.Builder builder) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).setTimestamp(builder.build());
        return this;
    }

    public n addAttachments(Any.Builder builder) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).addAttachments(builder.build());
        return this;
    }

    public n addAttachments(int i10, Any.Builder builder) {
        copyOnWrite();
        ((Distribution.Exemplar) this.instance).addAttachments(i10, builder.build());
        return this;
    }
}
