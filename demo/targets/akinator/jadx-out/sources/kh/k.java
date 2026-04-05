package kh;

import com.google.api.AuthProvider;
import com.google.api.Authentication;
import com.google.api.AuthenticationRule;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends GeneratedMessageLite.Builder implements l {
    public k addAllProviders(Iterable<? extends AuthProvider> iterable) {
        copyOnWrite();
        ((Authentication) this.instance).addAllProviders(iterable);
        return this;
    }

    public k addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        copyOnWrite();
        ((Authentication) this.instance).addAllRules(iterable);
        return this;
    }

    public k addProviders(AuthProvider authProvider) {
        copyOnWrite();
        ((Authentication) this.instance).addProviders(authProvider);
        return this;
    }

    public k addRules(AuthenticationRule authenticationRule) {
        copyOnWrite();
        ((Authentication) this.instance).addRules(authenticationRule);
        return this;
    }

    public k clearProviders() {
        copyOnWrite();
        ((Authentication) this.instance).clearProviders();
        return this;
    }

    public k clearRules() {
        copyOnWrite();
        ((Authentication) this.instance).clearRules();
        return this;
    }

    @Override // kh.l
    public AuthProvider getProviders(int i10) {
        return ((Authentication) this.instance).getProviders(i10);
    }

    @Override // kh.l
    public int getProvidersCount() {
        return ((Authentication) this.instance).getProvidersCount();
    }

    @Override // kh.l
    public List<AuthProvider> getProvidersList() {
        return Collections.unmodifiableList(((Authentication) this.instance).getProvidersList());
    }

    @Override // kh.l
    public AuthenticationRule getRules(int i10) {
        return ((Authentication) this.instance).getRules(i10);
    }

    @Override // kh.l
    public int getRulesCount() {
        return ((Authentication) this.instance).getRulesCount();
    }

    @Override // kh.l
    public List<AuthenticationRule> getRulesList() {
        return Collections.unmodifiableList(((Authentication) this.instance).getRulesList());
    }

    public k removeProviders(int i10) {
        copyOnWrite();
        ((Authentication) this.instance).removeProviders(i10);
        return this;
    }

    public k removeRules(int i10) {
        copyOnWrite();
        ((Authentication) this.instance).removeRules(i10);
        return this;
    }

    public k setProviders(int i10, AuthProvider authProvider) {
        copyOnWrite();
        ((Authentication) this.instance).setProviders(i10, authProvider);
        return this;
    }

    public k setRules(int i10, AuthenticationRule authenticationRule) {
        copyOnWrite();
        ((Authentication) this.instance).setRules(i10, authenticationRule);
        return this;
    }

    public k addProviders(int i10, AuthProvider authProvider) {
        copyOnWrite();
        ((Authentication) this.instance).addProviders(i10, authProvider);
        return this;
    }

    public k addRules(int i10, AuthenticationRule authenticationRule) {
        copyOnWrite();
        ((Authentication) this.instance).addRules(i10, authenticationRule);
        return this;
    }

    public k setProviders(int i10, e eVar) {
        copyOnWrite();
        ((Authentication) this.instance).setProviders(i10, (AuthProvider) eVar.build());
        return this;
    }

    public k setRules(int i10, n nVar) {
        copyOnWrite();
        ((Authentication) this.instance).setRules(i10, (AuthenticationRule) nVar.build());
        return this;
    }

    public k addProviders(e eVar) {
        copyOnWrite();
        ((Authentication) this.instance).addProviders((AuthProvider) eVar.build());
        return this;
    }

    public k addRules(n nVar) {
        copyOnWrite();
        ((Authentication) this.instance).addRules((AuthenticationRule) nVar.build());
        return this;
    }

    public k addProviders(int i10, e eVar) {
        copyOnWrite();
        ((Authentication) this.instance).addProviders(i10, (AuthProvider) eVar.build());
        return this;
    }

    public k addRules(int i10, n nVar) {
        copyOnWrite();
        ((Authentication) this.instance).addRules(i10, (AuthenticationRule) nVar.build());
        return this;
    }
}
