package kh;

import com.google.api.MonitoredResource;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y2 extends GeneratedMessageLite.Builder implements h3 {
    public y2 clearLabels() {
        copyOnWrite();
        ((MonitoredResource) this.instance).getMutableLabelsMap().clear();
        return this;
    }

    public y2 clearType() {
        copyOnWrite();
        ((MonitoredResource) this.instance).clearType();
        return this;
    }

    @Override // kh.h3
    public boolean containsLabels(String str) {
        str.getClass();
        return ((MonitoredResource) this.instance).getLabelsMap().containsKey(str);
    }

    @Override // kh.h3
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // kh.h3
    public int getLabelsCount() {
        return ((MonitoredResource) this.instance).getLabelsMap().size();
    }

    @Override // kh.h3
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(((MonitoredResource) this.instance).getLabelsMap());
    }

    @Override // kh.h3
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> labelsMap = ((MonitoredResource) this.instance).getLabelsMap();
        return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
    }

    @Override // kh.h3
    public String getLabelsOrThrow(String str) {
        str.getClass();
        Map<String, String> labelsMap = ((MonitoredResource) this.instance).getLabelsMap();
        if (labelsMap.containsKey(str)) {
            return labelsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // kh.h3
    public String getType() {
        return ((MonitoredResource) this.instance).getType();
    }

    @Override // kh.h3
    public ByteString getTypeBytes() {
        return ((MonitoredResource) this.instance).getTypeBytes();
    }

    public y2 putAllLabels(Map<String, String> map) {
        copyOnWrite();
        ((MonitoredResource) this.instance).getMutableLabelsMap().putAll(map);
        return this;
    }

    public y2 putLabels(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((MonitoredResource) this.instance).getMutableLabelsMap().put(str, str2);
        return this;
    }

    public y2 removeLabels(String str) {
        str.getClass();
        copyOnWrite();
        ((MonitoredResource) this.instance).getMutableLabelsMap().remove(str);
        return this;
    }

    public y2 setType(String str) {
        copyOnWrite();
        ((MonitoredResource) this.instance).setType(str);
        return this;
    }

    public y2 setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MonitoredResource) this.instance).setTypeBytes(byteString);
        return this;
    }
}
