package kh;

import com.google.api.Context;
import com.google.api.ContextRule;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i0 extends GeneratedMessageLite.Builder implements j0 {
    public i0 addAllRules(Iterable<? extends ContextRule> iterable) {
        copyOnWrite();
        ((Context) this.instance).addAllRules(iterable);
        return this;
    }

    public i0 addRules(ContextRule contextRule) {
        copyOnWrite();
        ((Context) this.instance).addRules(contextRule);
        return this;
    }

    public i0 clearRules() {
        copyOnWrite();
        ((Context) this.instance).clearRules();
        return this;
    }

    @Override // kh.j0
    public ContextRule getRules(int i10) {
        return ((Context) this.instance).getRules(i10);
    }

    @Override // kh.j0
    public int getRulesCount() {
        return ((Context) this.instance).getRulesCount();
    }

    @Override // kh.j0
    public List<ContextRule> getRulesList() {
        return Collections.unmodifiableList(((Context) this.instance).getRulesList());
    }

    public i0 removeRules(int i10) {
        copyOnWrite();
        ((Context) this.instance).removeRules(i10);
        return this;
    }

    public i0 setRules(int i10, ContextRule contextRule) {
        copyOnWrite();
        ((Context) this.instance).setRules(i10, contextRule);
        return this;
    }

    public i0 addRules(int i10, ContextRule contextRule) {
        copyOnWrite();
        ((Context) this.instance).addRules(i10, contextRule);
        return this;
    }

    public i0 setRules(int i10, l0 l0Var) {
        copyOnWrite();
        ((Context) this.instance).setRules(i10, (ContextRule) l0Var.build());
        return this;
    }

    public i0 addRules(l0 l0Var) {
        copyOnWrite();
        ((Context) this.instance).addRules((ContextRule) l0Var.build());
        return this;
    }

    public i0 addRules(int i10, l0 l0Var) {
        copyOnWrite();
        ((Context) this.instance).addRules(i10, (ContextRule) l0Var.build());
        return this;
    }
}
