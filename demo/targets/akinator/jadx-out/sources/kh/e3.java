package kh;

import com.google.api.MonitoredResourceMetadata;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Struct;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e3 extends GeneratedMessageLite.Builder implements g3 {
    public e3 clearSystemLabels() {
        copyOnWrite();
        ((MonitoredResourceMetadata) this.instance).clearSystemLabels();
        return this;
    }

    public e3 clearUserLabels() {
        copyOnWrite();
        ((MonitoredResourceMetadata) this.instance).getMutableUserLabelsMap().clear();
        return this;
    }

    @Override // kh.g3
    public boolean containsUserLabels(String str) {
        str.getClass();
        return ((MonitoredResourceMetadata) this.instance).getUserLabelsMap().containsKey(str);
    }

    @Override // kh.g3
    public Struct getSystemLabels() {
        return ((MonitoredResourceMetadata) this.instance).getSystemLabels();
    }

    @Override // kh.g3
    @Deprecated
    public Map<String, String> getUserLabels() {
        return getUserLabelsMap();
    }

    @Override // kh.g3
    public int getUserLabelsCount() {
        return ((MonitoredResourceMetadata) this.instance).getUserLabelsMap().size();
    }

    @Override // kh.g3
    public Map<String, String> getUserLabelsMap() {
        return Collections.unmodifiableMap(((MonitoredResourceMetadata) this.instance).getUserLabelsMap());
    }

    @Override // kh.g3
    public String getUserLabelsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> userLabelsMap = ((MonitoredResourceMetadata) this.instance).getUserLabelsMap();
        return userLabelsMap.containsKey(str) ? userLabelsMap.get(str) : str2;
    }

    @Override // kh.g3
    public String getUserLabelsOrThrow(String str) {
        str.getClass();
        Map<String, String> userLabelsMap = ((MonitoredResourceMetadata) this.instance).getUserLabelsMap();
        if (userLabelsMap.containsKey(str)) {
            return userLabelsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // kh.g3
    public boolean hasSystemLabels() {
        return ((MonitoredResourceMetadata) this.instance).hasSystemLabels();
    }

    public e3 mergeSystemLabels(Struct struct) {
        copyOnWrite();
        ((MonitoredResourceMetadata) this.instance).mergeSystemLabels(struct);
        return this;
    }

    public e3 putAllUserLabels(Map<String, String> map) {
        copyOnWrite();
        ((MonitoredResourceMetadata) this.instance).getMutableUserLabelsMap().putAll(map);
        return this;
    }

    public e3 putUserLabels(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((MonitoredResourceMetadata) this.instance).getMutableUserLabelsMap().put(str, str2);
        return this;
    }

    public e3 removeUserLabels(String str) {
        str.getClass();
        copyOnWrite();
        ((MonitoredResourceMetadata) this.instance).getMutableUserLabelsMap().remove(str);
        return this;
    }

    public e3 setSystemLabels(Struct struct) {
        copyOnWrite();
        ((MonitoredResourceMetadata) this.instance).setSystemLabels(struct);
        return this;
    }

    public e3 setSystemLabels(Struct.Builder builder) {
        copyOnWrite();
        ((MonitoredResourceMetadata) this.instance).setSystemLabels(builder.build());
        return this;
    }
}
