package kh;

import com.google.api.Metric;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i2 extends GeneratedMessageLite.Builder implements s2 {
    public i2 clearLabels() {
        copyOnWrite();
        ((Metric) this.instance).getMutableLabelsMap().clear();
        return this;
    }

    public i2 clearType() {
        copyOnWrite();
        ((Metric) this.instance).clearType();
        return this;
    }

    @Override // kh.s2
    public boolean containsLabels(String str) {
        str.getClass();
        return ((Metric) this.instance).getLabelsMap().containsKey(str);
    }

    @Override // kh.s2
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // kh.s2
    public int getLabelsCount() {
        return ((Metric) this.instance).getLabelsMap().size();
    }

    @Override // kh.s2
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(((Metric) this.instance).getLabelsMap());
    }

    @Override // kh.s2
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> labelsMap = ((Metric) this.instance).getLabelsMap();
        return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
    }

    @Override // kh.s2
    public String getLabelsOrThrow(String str) {
        str.getClass();
        Map<String, String> labelsMap = ((Metric) this.instance).getLabelsMap();
        if (labelsMap.containsKey(str)) {
            return labelsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // kh.s2
    public String getType() {
        return ((Metric) this.instance).getType();
    }

    @Override // kh.s2
    public ByteString getTypeBytes() {
        return ((Metric) this.instance).getTypeBytes();
    }

    public i2 putAllLabels(Map<String, String> map) {
        copyOnWrite();
        ((Metric) this.instance).getMutableLabelsMap().putAll(map);
        return this;
    }

    public i2 putLabels(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((Metric) this.instance).getMutableLabelsMap().put(str, str2);
        return this;
    }

    public i2 removeLabels(String str) {
        str.getClass();
        copyOnWrite();
        ((Metric) this.instance).getMutableLabelsMap().remove(str);
        return this;
    }

    public i2 setType(String str) {
        copyOnWrite();
        ((Metric) this.instance).setType(str);
        return this;
    }

    public i2 setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric) this.instance).setTypeBytes(byteString);
        return this;
    }
}
