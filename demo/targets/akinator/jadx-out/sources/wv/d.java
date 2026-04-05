package wv;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import metric.Metric$MetricMessage;
import metric.Metric$UserMetric;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends GeneratedMessageLite.Builder implements f {
    public d clearContent() {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).clearContent();
        return this;
    }

    public d clearCreatedAt() {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).clearCreatedAt();
        return this;
    }

    public d clearEmitter() {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).clearEmitter();
        return this;
    }

    public d clearUserMetric() {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).clearUserMetric();
        return this;
    }

    @Override // wv.f
    public e getContentCase() {
        return ((Metric$MetricMessage) this.instance).getContentCase();
    }

    @Override // wv.f
    public Timestamp getCreatedAt() {
        return ((Metric$MetricMessage) this.instance).getCreatedAt();
    }

    @Override // wv.f
    public String getEmitter() {
        return ((Metric$MetricMessage) this.instance).getEmitter();
    }

    @Override // wv.f
    public ByteString getEmitterBytes() {
        return ((Metric$MetricMessage) this.instance).getEmitterBytes();
    }

    @Override // wv.f
    public Metric$UserMetric getUserMetric() {
        return ((Metric$MetricMessage) this.instance).getUserMetric();
    }

    @Override // wv.f
    public boolean hasCreatedAt() {
        return ((Metric$MetricMessage) this.instance).hasCreatedAt();
    }

    @Override // wv.f
    public boolean hasUserMetric() {
        return ((Metric$MetricMessage) this.instance).hasUserMetric();
    }

    public d mergeCreatedAt(Timestamp timestamp) {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).mergeCreatedAt(timestamp);
        return this;
    }

    public d mergeUserMetric(Metric$UserMetric metric$UserMetric) {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).mergeUserMetric(metric$UserMetric);
        return this;
    }

    public d setCreatedAt(Timestamp timestamp) {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).setCreatedAt(timestamp);
        return this;
    }

    public d setEmitter(String str) {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).setEmitter(str);
        return this;
    }

    public d setEmitterBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).setEmitterBytes(byteString);
        return this;
    }

    public d setUserMetric(Metric$UserMetric metric$UserMetric) {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).setUserMetric(metric$UserMetric);
        return this;
    }

    public d setCreatedAt(Timestamp.Builder builder) {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).setCreatedAt(builder.build());
        return this;
    }

    public d setUserMetric(g gVar) {
        copyOnWrite();
        ((Metric$MetricMessage) this.instance).setUserMetric((Metric$UserMetric) gVar.build());
        return this;
    }
}
