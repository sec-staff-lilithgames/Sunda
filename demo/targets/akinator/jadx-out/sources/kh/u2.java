package kh;

import com.google.api.MetricRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u2 extends GeneratedMessageLite.Builder implements w2 {
    public u2 clearMetricCosts() {
        copyOnWrite();
        ((MetricRule) this.instance).getMutableMetricCostsMap().clear();
        return this;
    }

    public u2 clearSelector() {
        copyOnWrite();
        ((MetricRule) this.instance).clearSelector();
        return this;
    }

    @Override // kh.w2
    public boolean containsMetricCosts(String str) {
        str.getClass();
        return ((MetricRule) this.instance).getMetricCostsMap().containsKey(str);
    }

    @Override // kh.w2
    @Deprecated
    public Map<String, Long> getMetricCosts() {
        return getMetricCostsMap();
    }

    @Override // kh.w2
    public int getMetricCostsCount() {
        return ((MetricRule) this.instance).getMetricCostsMap().size();
    }

    @Override // kh.w2
    public Map<String, Long> getMetricCostsMap() {
        return Collections.unmodifiableMap(((MetricRule) this.instance).getMetricCostsMap());
    }

    @Override // kh.w2
    public long getMetricCostsOrDefault(String str, long j10) {
        str.getClass();
        Map<String, Long> metricCostsMap = ((MetricRule) this.instance).getMetricCostsMap();
        return metricCostsMap.containsKey(str) ? metricCostsMap.get(str).longValue() : j10;
    }

    @Override // kh.w2
    public long getMetricCostsOrThrow(String str) {
        str.getClass();
        Map<String, Long> metricCostsMap = ((MetricRule) this.instance).getMetricCostsMap();
        if (metricCostsMap.containsKey(str)) {
            return metricCostsMap.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // kh.w2
    public String getSelector() {
        return ((MetricRule) this.instance).getSelector();
    }

    @Override // kh.w2
    public ByteString getSelectorBytes() {
        return ((MetricRule) this.instance).getSelectorBytes();
    }

    public u2 putAllMetricCosts(Map<String, Long> map) {
        copyOnWrite();
        ((MetricRule) this.instance).getMutableMetricCostsMap().putAll(map);
        return this;
    }

    public u2 putMetricCosts(String str, long j10) {
        str.getClass();
        copyOnWrite();
        ((MetricRule) this.instance).getMutableMetricCostsMap().put(str, Long.valueOf(j10));
        return this;
    }

    public u2 removeMetricCosts(String str) {
        str.getClass();
        copyOnWrite();
        ((MetricRule) this.instance).getMutableMetricCostsMap().remove(str);
        return this;
    }

    public u2 setSelector(String str) {
        copyOnWrite();
        ((MetricRule) this.instance).setSelector(str);
        return this;
    }

    public u2 setSelectorBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricRule) this.instance).setSelectorBytes(byteString);
        return this;
    }
}
