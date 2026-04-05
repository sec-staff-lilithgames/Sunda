package kh;

import com.google.api.QuotaLimit;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c4 extends GeneratedMessageLite.Builder implements e4 {
    public c4 clearDefaultLimit() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearDefaultLimit();
        return this;
    }

    public c4 clearDescription() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearDescription();
        return this;
    }

    public c4 clearDisplayName() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearDisplayName();
        return this;
    }

    public c4 clearDuration() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearDuration();
        return this;
    }

    public c4 clearFreeTier() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearFreeTier();
        return this;
    }

    public c4 clearMaxLimit() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearMaxLimit();
        return this;
    }

    public c4 clearMetric() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearMetric();
        return this;
    }

    public c4 clearName() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearName();
        return this;
    }

    public c4 clearUnit() {
        copyOnWrite();
        ((QuotaLimit) this.instance).clearUnit();
        return this;
    }

    public c4 clearValues() {
        copyOnWrite();
        ((QuotaLimit) this.instance).getMutableValuesMap().clear();
        return this;
    }

    @Override // kh.e4
    public boolean containsValues(String str) {
        str.getClass();
        return ((QuotaLimit) this.instance).getValuesMap().containsKey(str);
    }

    @Override // kh.e4
    public long getDefaultLimit() {
        return ((QuotaLimit) this.instance).getDefaultLimit();
    }

    @Override // kh.e4
    public String getDescription() {
        return ((QuotaLimit) this.instance).getDescription();
    }

    @Override // kh.e4
    public ByteString getDescriptionBytes() {
        return ((QuotaLimit) this.instance).getDescriptionBytes();
    }

    @Override // kh.e4
    public String getDisplayName() {
        return ((QuotaLimit) this.instance).getDisplayName();
    }

    @Override // kh.e4
    public ByteString getDisplayNameBytes() {
        return ((QuotaLimit) this.instance).getDisplayNameBytes();
    }

    @Override // kh.e4
    public String getDuration() {
        return ((QuotaLimit) this.instance).getDuration();
    }

    @Override // kh.e4
    public ByteString getDurationBytes() {
        return ((QuotaLimit) this.instance).getDurationBytes();
    }

    @Override // kh.e4
    public long getFreeTier() {
        return ((QuotaLimit) this.instance).getFreeTier();
    }

    @Override // kh.e4
    public long getMaxLimit() {
        return ((QuotaLimit) this.instance).getMaxLimit();
    }

    @Override // kh.e4
    public String getMetric() {
        return ((QuotaLimit) this.instance).getMetric();
    }

    @Override // kh.e4
    public ByteString getMetricBytes() {
        return ((QuotaLimit) this.instance).getMetricBytes();
    }

    @Override // kh.e4
    public String getName() {
        return ((QuotaLimit) this.instance).getName();
    }

    @Override // kh.e4
    public ByteString getNameBytes() {
        return ((QuotaLimit) this.instance).getNameBytes();
    }

    @Override // kh.e4
    public String getUnit() {
        return ((QuotaLimit) this.instance).getUnit();
    }

    @Override // kh.e4
    public ByteString getUnitBytes() {
        return ((QuotaLimit) this.instance).getUnitBytes();
    }

    @Override // kh.e4
    @Deprecated
    public Map<String, Long> getValues() {
        return getValuesMap();
    }

    @Override // kh.e4
    public int getValuesCount() {
        return ((QuotaLimit) this.instance).getValuesMap().size();
    }

    @Override // kh.e4
    public Map<String, Long> getValuesMap() {
        return Collections.unmodifiableMap(((QuotaLimit) this.instance).getValuesMap());
    }

    @Override // kh.e4
    public long getValuesOrDefault(String str, long j10) {
        str.getClass();
        Map<String, Long> valuesMap = ((QuotaLimit) this.instance).getValuesMap();
        return valuesMap.containsKey(str) ? valuesMap.get(str).longValue() : j10;
    }

    @Override // kh.e4
    public long getValuesOrThrow(String str) {
        str.getClass();
        Map<String, Long> valuesMap = ((QuotaLimit) this.instance).getValuesMap();
        if (valuesMap.containsKey(str)) {
            return valuesMap.get(str).longValue();
        }
        throw new IllegalArgumentException();
    }

    public c4 putAllValues(Map<String, Long> map) {
        copyOnWrite();
        ((QuotaLimit) this.instance).getMutableValuesMap().putAll(map);
        return this;
    }

    public c4 putValues(String str, long j10) {
        str.getClass();
        copyOnWrite();
        ((QuotaLimit) this.instance).getMutableValuesMap().put(str, Long.valueOf(j10));
        return this;
    }

    public c4 removeValues(String str) {
        str.getClass();
        copyOnWrite();
        ((QuotaLimit) this.instance).getMutableValuesMap().remove(str);
        return this;
    }

    public c4 setDefaultLimit(long j10) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setDefaultLimit(j10);
        return this;
    }

    public c4 setDescription(String str) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setDescription(str);
        return this;
    }

    public c4 setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((QuotaLimit) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public c4 setDisplayName(String str) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setDisplayName(str);
        return this;
    }

    public c4 setDisplayNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((QuotaLimit) this.instance).setDisplayNameBytes(byteString);
        return this;
    }

    public c4 setDuration(String str) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setDuration(str);
        return this;
    }

    public c4 setDurationBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((QuotaLimit) this.instance).setDurationBytes(byteString);
        return this;
    }

    public c4 setFreeTier(long j10) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setFreeTier(j10);
        return this;
    }

    public c4 setMaxLimit(long j10) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setMaxLimit(j10);
        return this;
    }

    public c4 setMetric(String str) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setMetric(str);
        return this;
    }

    public c4 setMetricBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((QuotaLimit) this.instance).setMetricBytes(byteString);
        return this;
    }

    public c4 setName(String str) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setName(str);
        return this;
    }

    public c4 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((QuotaLimit) this.instance).setNameBytes(byteString);
        return this;
    }

    public c4 setUnit(String str) {
        copyOnWrite();
        ((QuotaLimit) this.instance).setUnit(str);
        return this;
    }

    public c4 setUnitBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((QuotaLimit) this.instance).setUnitBytes(byteString);
        return this;
    }
}
