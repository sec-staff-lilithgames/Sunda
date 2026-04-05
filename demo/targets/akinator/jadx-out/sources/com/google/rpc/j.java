package com.google.rpc;

import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.QuotaFailure;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j extends GeneratedMessageLite.Builder implements l {
    public j addAllViolations(Iterable<? extends QuotaFailure.Violation> iterable) {
        copyOnWrite();
        ((QuotaFailure) this.instance).addAllViolations(iterable);
        return this;
    }

    public j addViolations(QuotaFailure.Violation violation) {
        copyOnWrite();
        ((QuotaFailure) this.instance).addViolations(violation);
        return this;
    }

    public j clearViolations() {
        copyOnWrite();
        ((QuotaFailure) this.instance).clearViolations();
        return this;
    }

    @Override // com.google.rpc.l
    public QuotaFailure.Violation getViolations(int i10) {
        return ((QuotaFailure) this.instance).getViolations(i10);
    }

    @Override // com.google.rpc.l
    public int getViolationsCount() {
        return ((QuotaFailure) this.instance).getViolationsCount();
    }

    @Override // com.google.rpc.l
    public List<QuotaFailure.Violation> getViolationsList() {
        return Collections.unmodifiableList(((QuotaFailure) this.instance).getViolationsList());
    }

    public j removeViolations(int i10) {
        copyOnWrite();
        ((QuotaFailure) this.instance).removeViolations(i10);
        return this;
    }

    public j setViolations(int i10, QuotaFailure.Violation violation) {
        copyOnWrite();
        ((QuotaFailure) this.instance).setViolations(i10, violation);
        return this;
    }

    public j addViolations(int i10, QuotaFailure.Violation violation) {
        copyOnWrite();
        ((QuotaFailure) this.instance).addViolations(i10, violation);
        return this;
    }

    public j setViolations(int i10, k kVar) {
        copyOnWrite();
        ((QuotaFailure) this.instance).setViolations(i10, (QuotaFailure.Violation) kVar.build());
        return this;
    }

    public j addViolations(k kVar) {
        copyOnWrite();
        ((QuotaFailure) this.instance).addViolations((QuotaFailure.Violation) kVar.build());
        return this;
    }

    public j addViolations(int i10, k kVar) {
        copyOnWrite();
        ((QuotaFailure) this.instance).addViolations(i10, (QuotaFailure.Violation) kVar.build());
        return this;
    }
}
