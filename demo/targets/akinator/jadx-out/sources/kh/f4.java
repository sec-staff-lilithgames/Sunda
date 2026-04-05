package kh;

import com.google.api.MetricRule;
import com.google.api.QuotaLimit;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface f4 extends MessageLiteOrBuilder {
    QuotaLimit getLimits(int i10);

    int getLimitsCount();

    List<QuotaLimit> getLimitsList();

    MetricRule getMetricRules(int i10);

    int getMetricRulesCount();

    List<MetricRule> getMetricRulesList();
}
