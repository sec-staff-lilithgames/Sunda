package kh;

import com.google.api.Http;
import com.google.api.HttpRule;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g1 extends GeneratedMessageLite.Builder implements k1 {
    public g1 addAllRules(Iterable<? extends HttpRule> iterable) {
        copyOnWrite();
        ((Http) this.instance).addAllRules(iterable);
        return this;
    }

    public g1 addRules(HttpRule httpRule) {
        copyOnWrite();
        ((Http) this.instance).addRules(httpRule);
        return this;
    }

    public g1 clearFullyDecodeReservedExpansion() {
        copyOnWrite();
        ((Http) this.instance).clearFullyDecodeReservedExpansion();
        return this;
    }

    public g1 clearRules() {
        copyOnWrite();
        ((Http) this.instance).clearRules();
        return this;
    }

    @Override // kh.k1
    public boolean getFullyDecodeReservedExpansion() {
        return ((Http) this.instance).getFullyDecodeReservedExpansion();
    }

    @Override // kh.k1
    public HttpRule getRules(int i10) {
        return ((Http) this.instance).getRules(i10);
    }

    @Override // kh.k1
    public int getRulesCount() {
        return ((Http) this.instance).getRulesCount();
    }

    @Override // kh.k1
    public List<HttpRule> getRulesList() {
        return Collections.unmodifiableList(((Http) this.instance).getRulesList());
    }

    public g1 removeRules(int i10) {
        copyOnWrite();
        ((Http) this.instance).removeRules(i10);
        return this;
    }

    public g1 setFullyDecodeReservedExpansion(boolean z10) {
        copyOnWrite();
        ((Http) this.instance).setFullyDecodeReservedExpansion(z10);
        return this;
    }

    public g1 setRules(int i10, HttpRule httpRule) {
        copyOnWrite();
        ((Http) this.instance).setRules(i10, httpRule);
        return this;
    }

    public g1 addRules(int i10, HttpRule httpRule) {
        copyOnWrite();
        ((Http) this.instance).addRules(i10, httpRule);
        return this;
    }

    public g1 setRules(int i10, m1 m1Var) {
        copyOnWrite();
        ((Http) this.instance).setRules(i10, (HttpRule) m1Var.build());
        return this;
    }

    public g1 addRules(m1 m1Var) {
        copyOnWrite();
        ((Http) this.instance).addRules((HttpRule) m1Var.build());
        return this;
    }

    public g1 addRules(int i10, m1 m1Var) {
        copyOnWrite();
        ((Http) this.instance).addRules(i10, (HttpRule) m1Var.build());
        return this;
    }
}
