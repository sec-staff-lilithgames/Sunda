package kh;

import com.google.api.SystemParameterRule;
import com.google.api.SystemParameters;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c5 extends GeneratedMessageLite.Builder implements d5 {
    public c5 addAllRules(Iterable<? extends SystemParameterRule> iterable) {
        copyOnWrite();
        ((SystemParameters) this.instance).addAllRules(iterable);
        return this;
    }

    public c5 addRules(SystemParameterRule systemParameterRule) {
        copyOnWrite();
        ((SystemParameters) this.instance).addRules(systemParameterRule);
        return this;
    }

    public c5 clearRules() {
        copyOnWrite();
        ((SystemParameters) this.instance).clearRules();
        return this;
    }

    @Override // kh.d5
    public SystemParameterRule getRules(int i10) {
        return ((SystemParameters) this.instance).getRules(i10);
    }

    @Override // kh.d5
    public int getRulesCount() {
        return ((SystemParameters) this.instance).getRulesCount();
    }

    @Override // kh.d5
    public List<SystemParameterRule> getRulesList() {
        return Collections.unmodifiableList(((SystemParameters) this.instance).getRulesList());
    }

    public c5 removeRules(int i10) {
        copyOnWrite();
        ((SystemParameters) this.instance).removeRules(i10);
        return this;
    }

    public c5 setRules(int i10, SystemParameterRule systemParameterRule) {
        copyOnWrite();
        ((SystemParameters) this.instance).setRules(i10, systemParameterRule);
        return this;
    }

    public c5 addRules(int i10, SystemParameterRule systemParameterRule) {
        copyOnWrite();
        ((SystemParameters) this.instance).addRules(i10, systemParameterRule);
        return this;
    }

    public c5 setRules(int i10, z4 z4Var) {
        copyOnWrite();
        ((SystemParameters) this.instance).setRules(i10, (SystemParameterRule) z4Var.build());
        return this;
    }

    public c5 addRules(z4 z4Var) {
        copyOnWrite();
        ((SystemParameters) this.instance).addRules((SystemParameterRule) z4Var.build());
        return this;
    }

    public c5 addRules(int i10, z4 z4Var) {
        copyOnWrite();
        ((SystemParameters) this.instance).addRules(i10, (SystemParameterRule) z4Var.build());
        return this;
    }
}
