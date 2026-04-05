package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.PreconditionFailure;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g extends GeneratedMessageLite.Builder implements i {
    public g addAllViolations(Iterable<? extends PreconditionFailure.Violation> iterable) {
        copyOnWrite();
        ((PreconditionFailure) this.instance).addAllViolations(iterable);
        return this;
    }

    public g addViolations(PreconditionFailure.Violation violation) {
        copyOnWrite();
        ((PreconditionFailure) this.instance).addViolations(violation);
        return this;
    }

    public g clearViolations() {
        copyOnWrite();
        ((PreconditionFailure) this.instance).clearViolations();
        return this;
    }

    @Override // com.google.rpc.i
    public PreconditionFailure.Violation getViolations(int i10) {
        return ((PreconditionFailure) this.instance).getViolations(i10);
    }

    @Override // com.google.rpc.i
    public int getViolationsCount() {
        return ((PreconditionFailure) this.instance).getViolationsCount();
    }

    @Override // com.google.rpc.i
    public List<PreconditionFailure.Violation> getViolationsList() {
        return Collections.unmodifiableList(((PreconditionFailure) this.instance).getViolationsList());
    }

    public g removeViolations(int i10) {
        copyOnWrite();
        ((PreconditionFailure) this.instance).removeViolations(i10);
        return this;
    }

    public g setViolations(int i10, PreconditionFailure.Violation violation) {
        copyOnWrite();
        ((PreconditionFailure) this.instance).setViolations(i10, violation);
        return this;
    }

    public g addViolations(int i10, PreconditionFailure.Violation violation) {
        copyOnWrite();
        ((PreconditionFailure) this.instance).addViolations(i10, violation);
        return this;
    }

    public g setViolations(int i10, h hVar) {
        copyOnWrite();
        ((PreconditionFailure) this.instance).setViolations(i10, (PreconditionFailure.Violation) hVar.build());
        return this;
    }

    public g addViolations(h hVar) {
        copyOnWrite();
        ((PreconditionFailure) this.instance).addViolations((PreconditionFailure.Violation) hVar.build());
        return this;
    }

    public g addViolations(int i10, h hVar) {
        copyOnWrite();
        ((PreconditionFailure) this.instance).addViolations(i10, (PreconditionFailure.Violation) hVar.build());
        return this;
    }
}
