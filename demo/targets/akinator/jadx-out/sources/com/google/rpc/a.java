package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.BadRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a extends GeneratedMessageLite.Builder implements c {
    public a addAllFieldViolations(Iterable<? extends BadRequest.FieldViolation> iterable) {
        copyOnWrite();
        ((BadRequest) this.instance).addAllFieldViolations(iterable);
        return this;
    }

    public a addFieldViolations(BadRequest.FieldViolation fieldViolation) {
        copyOnWrite();
        ((BadRequest) this.instance).addFieldViolations(fieldViolation);
        return this;
    }

    public a clearFieldViolations() {
        copyOnWrite();
        ((BadRequest) this.instance).clearFieldViolations();
        return this;
    }

    @Override // com.google.rpc.c
    public BadRequest.FieldViolation getFieldViolations(int i10) {
        return ((BadRequest) this.instance).getFieldViolations(i10);
    }

    @Override // com.google.rpc.c
    public int getFieldViolationsCount() {
        return ((BadRequest) this.instance).getFieldViolationsCount();
    }

    @Override // com.google.rpc.c
    public List<BadRequest.FieldViolation> getFieldViolationsList() {
        return Collections.unmodifiableList(((BadRequest) this.instance).getFieldViolationsList());
    }

    public a removeFieldViolations(int i10) {
        copyOnWrite();
        ((BadRequest) this.instance).removeFieldViolations(i10);
        return this;
    }

    public a setFieldViolations(int i10, BadRequest.FieldViolation fieldViolation) {
        copyOnWrite();
        ((BadRequest) this.instance).setFieldViolations(i10, fieldViolation);
        return this;
    }

    public a addFieldViolations(int i10, BadRequest.FieldViolation fieldViolation) {
        copyOnWrite();
        ((BadRequest) this.instance).addFieldViolations(i10, fieldViolation);
        return this;
    }

    public a setFieldViolations(int i10, b bVar) {
        copyOnWrite();
        ((BadRequest) this.instance).setFieldViolations(i10, (BadRequest.FieldViolation) bVar.build());
        return this;
    }

    public a addFieldViolations(b bVar) {
        copyOnWrite();
        ((BadRequest) this.instance).addFieldViolations((BadRequest.FieldViolation) bVar.build());
        return this;
    }

    public a addFieldViolations(int i10, b bVar) {
        copyOnWrite();
        ((BadRequest) this.instance).addFieldViolations(i10, (BadRequest.FieldViolation) bVar.build());
        return this;
    }
}
