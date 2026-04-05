package kh;

import com.google.api.MetricRule;
import com.google.api.Quota;
import com.google.api.QuotaLimit;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a4 extends GeneratedMessageLite.Builder implements f4 {
    public a4 addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        copyOnWrite();
        ((Quota) this.instance).addAllLimits(iterable);
        return this;
    }

    public a4 addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        copyOnWrite();
        ((Quota) this.instance).addAllMetricRules(iterable);
        return this;
    }

    public a4 addLimits(QuotaLimit quotaLimit) {
        copyOnWrite();
        ((Quota) this.instance).addLimits(quotaLimit);
        return this;
    }

    public a4 addMetricRules(MetricRule metricRule) {
        copyOnWrite();
        ((Quota) this.instance).addMetricRules(metricRule);
        return this;
    }

    public a4 clearLimits() {
        copyOnWrite();
        ((Quota) this.instance).clearLimits();
        return this;
    }

    public a4 clearMetricRules() {
        copyOnWrite();
        ((Quota) this.instance).clearMetricRules();
        return this;
    }

    @Override // kh.f4
    public QuotaLimit getLimits(int i10) {
        return ((Quota) this.instance).getLimits(i10);
    }

    @Override // kh.f4
    public int getLimitsCount() {
        return ((Quota) this.instance).getLimitsCount();
    }

    @Override // kh.f4
    public List<QuotaLimit> getLimitsList() {
        return Collections.unmodifiableList(((Quota) this.instance).getLimitsList());
    }

    @Override // kh.f4
    public MetricRule getMetricRules(int i10) {
        return ((Quota) this.instance).getMetricRules(i10);
    }

    @Override // kh.f4
    public int getMetricRulesCount() {
        return ((Quota) this.instance).getMetricRulesCount();
    }

    @Override // kh.f4
    public List<MetricRule> getMetricRulesList() {
        return Collections.unmodifiableList(((Quota) this.instance).getMetricRulesList());
    }

    public a4 removeLimits(int i10) {
        copyOnWrite();
        ((Quota) this.instance).removeLimits(i10);
        return this;
    }

    public a4 removeMetricRules(int i10) {
        copyOnWrite();
        ((Quota) this.instance).removeMetricRules(i10);
        return this;
    }

    public a4 setLimits(int i10, QuotaLimit quotaLimit) {
        copyOnWrite();
        ((Quota) this.instance).setLimits(i10, quotaLimit);
        return this;
    }

    public a4 setMetricRules(int i10, MetricRule metricRule) {
        copyOnWrite();
        ((Quota) this.instance).setMetricRules(i10, metricRule);
        return this;
    }

    public a4 addLimits(int i10, QuotaLimit quotaLimit) {
        copyOnWrite();
        ((Quota) this.instance).addLimits(i10, quotaLimit);
        return this;
    }

    public a4 addMetricRules(int i10, MetricRule metricRule) {
        copyOnWrite();
        ((Quota) this.instance).addMetricRules(i10, metricRule);
        return this;
    }

    public a4 setLimits(int i10, c4 c4Var) {
        copyOnWrite();
        ((Quota) this.instance).setLimits(i10, (QuotaLimit) c4Var.build());
        return this;
    }

    public a4 setMetricRules(int i10, u2 u2Var) {
        copyOnWrite();
        ((Quota) this.instance).setMetricRules(i10, (MetricRule) u2Var.build());
        return this;
    }

    public a4 addLimits(c4 c4Var) {
        copyOnWrite();
        ((Quota) this.instance).addLimits((QuotaLimit) c4Var.build());
        return this;
    }

    public a4 addMetricRules(u2 u2Var) {
        copyOnWrite();
        ((Quota) this.instance).addMetricRules((MetricRule) u2Var.build());
        return this;
    }

    public a4 addLimits(int i10, c4 c4Var) {
        copyOnWrite();
        ((Quota) this.instance).addLimits(i10, (QuotaLimit) c4Var.build());
        return this;
    }

    public a4 addMetricRules(int i10, u2 u2Var) {
        copyOnWrite();
        ((Quota) this.instance).addMetricRules(i10, (MetricRule) u2Var.build());
        return this;
    }
}
