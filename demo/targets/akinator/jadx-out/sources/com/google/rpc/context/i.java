package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.context.AttributeContext;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i extends GeneratedMessageLite.Builder implements vk.e {
    public i clearLabels() {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).getMutableLabelsMap().clear();
        return this;
    }

    public i clearName() {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).clearName();
        return this;
    }

    public i clearService() {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).clearService();
        return this;
    }

    public i clearType() {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).clearType();
        return this;
    }

    @Override // vk.e
    public boolean containsLabels(String str) {
        str.getClass();
        return ((AttributeContext.Resource) this.instance).getLabelsMap().containsKey(str);
    }

    @Override // vk.e
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // vk.e
    public int getLabelsCount() {
        return ((AttributeContext.Resource) this.instance).getLabelsMap().size();
    }

    @Override // vk.e
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(((AttributeContext.Resource) this.instance).getLabelsMap());
    }

    @Override // vk.e
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> labelsMap = ((AttributeContext.Resource) this.instance).getLabelsMap();
        return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
    }

    @Override // vk.e
    public String getLabelsOrThrow(String str) {
        str.getClass();
        Map<String, String> labelsMap = ((AttributeContext.Resource) this.instance).getLabelsMap();
        if (labelsMap.containsKey(str)) {
            return labelsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // vk.e
    public String getName() {
        return ((AttributeContext.Resource) this.instance).getName();
    }

    @Override // vk.e
    public ByteString getNameBytes() {
        return ((AttributeContext.Resource) this.instance).getNameBytes();
    }

    @Override // vk.e
    public String getService() {
        return ((AttributeContext.Resource) this.instance).getService();
    }

    @Override // vk.e
    public ByteString getServiceBytes() {
        return ((AttributeContext.Resource) this.instance).getServiceBytes();
    }

    @Override // vk.e
    public String getType() {
        return ((AttributeContext.Resource) this.instance).getType();
    }

    @Override // vk.e
    public ByteString getTypeBytes() {
        return ((AttributeContext.Resource) this.instance).getTypeBytes();
    }

    public i putAllLabels(Map<String, String> map) {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).getMutableLabelsMap().putAll(map);
        return this;
    }

    public i putLabels(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).getMutableLabelsMap().put(str, str2);
        return this;
    }

    public i removeLabels(String str) {
        str.getClass();
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).getMutableLabelsMap().remove(str);
        return this;
    }

    public i setName(String str) {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).setName(str);
        return this;
    }

    public i setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).setNameBytes(byteString);
        return this;
    }

    public i setService(String str) {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).setService(str);
        return this;
    }

    public i setServiceBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).setServiceBytes(byteString);
        return this;
    }

    public i setType(String str) {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).setType(str);
        return this;
    }

    public i setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Resource) this.instance).setTypeBytes(byteString);
        return this;
    }
}
