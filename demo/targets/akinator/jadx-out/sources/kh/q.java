package kh;

import com.google.api.Backend;
import com.google.api.BackendRule;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q extends GeneratedMessageLite.Builder implements r {
    public q addAllRules(Iterable<? extends BackendRule> iterable) {
        copyOnWrite();
        ((Backend) this.instance).addAllRules(iterable);
        return this;
    }

    public q addRules(BackendRule backendRule) {
        copyOnWrite();
        ((Backend) this.instance).addRules(backendRule);
        return this;
    }

    public q clearRules() {
        copyOnWrite();
        ((Backend) this.instance).clearRules();
        return this;
    }

    @Override // kh.r
    public BackendRule getRules(int i10) {
        return ((Backend) this.instance).getRules(i10);
    }

    @Override // kh.r
    public int getRulesCount() {
        return ((Backend) this.instance).getRulesCount();
    }

    @Override // kh.r
    public List<BackendRule> getRulesList() {
        return Collections.unmodifiableList(((Backend) this.instance).getRulesList());
    }

    public q removeRules(int i10) {
        copyOnWrite();
        ((Backend) this.instance).removeRules(i10);
        return this;
    }

    public q setRules(int i10, BackendRule backendRule) {
        copyOnWrite();
        ((Backend) this.instance).setRules(i10, backendRule);
        return this;
    }

    public q addRules(int i10, BackendRule backendRule) {
        copyOnWrite();
        ((Backend) this.instance).addRules(i10, backendRule);
        return this;
    }

    public q setRules(int i10, u uVar) {
        copyOnWrite();
        ((Backend) this.instance).setRules(i10, (BackendRule) uVar.build());
        return this;
    }

    public q addRules(u uVar) {
        copyOnWrite();
        ((Backend) this.instance).addRules((BackendRule) uVar.build());
        return this;
    }

    public q addRules(int i10, u uVar) {
        copyOnWrite();
        ((Backend) this.instance).addRules(i10, (BackendRule) uVar.build());
        return this;
    }
}
