package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.rpc.context.AttributeContext;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends GeneratedMessageLite.Builder implements vk.d {
    public d clearIp() {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).clearIp();
        return this;
    }

    public d clearLabels() {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).getMutableLabelsMap().clear();
        return this;
    }

    public d clearPort() {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).clearPort();
        return this;
    }

    public d clearPrincipal() {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).clearPrincipal();
        return this;
    }

    public d clearRegionCode() {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).clearRegionCode();
        return this;
    }

    @Override // vk.d
    public boolean containsLabels(String str) {
        str.getClass();
        return ((AttributeContext.Peer) this.instance).getLabelsMap().containsKey(str);
    }

    @Override // vk.d
    public String getIp() {
        return ((AttributeContext.Peer) this.instance).getIp();
    }

    @Override // vk.d
    public ByteString getIpBytes() {
        return ((AttributeContext.Peer) this.instance).getIpBytes();
    }

    @Override // vk.d
    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    @Override // vk.d
    public int getLabelsCount() {
        return ((AttributeContext.Peer) this.instance).getLabelsMap().size();
    }

    @Override // vk.d
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(((AttributeContext.Peer) this.instance).getLabelsMap());
    }

    @Override // vk.d
    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> labelsMap = ((AttributeContext.Peer) this.instance).getLabelsMap();
        return labelsMap.containsKey(str) ? labelsMap.get(str) : str2;
    }

    @Override // vk.d
    public String getLabelsOrThrow(String str) {
        str.getClass();
        Map<String, String> labelsMap = ((AttributeContext.Peer) this.instance).getLabelsMap();
        if (labelsMap.containsKey(str)) {
            return labelsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // vk.d
    public long getPort() {
        return ((AttributeContext.Peer) this.instance).getPort();
    }

    @Override // vk.d
    public String getPrincipal() {
        return ((AttributeContext.Peer) this.instance).getPrincipal();
    }

    @Override // vk.d
    public ByteString getPrincipalBytes() {
        return ((AttributeContext.Peer) this.instance).getPrincipalBytes();
    }

    @Override // vk.d
    public String getRegionCode() {
        return ((AttributeContext.Peer) this.instance).getRegionCode();
    }

    @Override // vk.d
    public ByteString getRegionCodeBytes() {
        return ((AttributeContext.Peer) this.instance).getRegionCodeBytes();
    }

    public d putAllLabels(Map<String, String> map) {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).getMutableLabelsMap().putAll(map);
        return this;
    }

    public d putLabels(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).getMutableLabelsMap().put(str, str2);
        return this;
    }

    public d removeLabels(String str) {
        str.getClass();
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).getMutableLabelsMap().remove(str);
        return this;
    }

    public d setIp(String str) {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).setIp(str);
        return this;
    }

    public d setIpBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).setIpBytes(byteString);
        return this;
    }

    public d setPort(long j10) {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).setPort(j10);
        return this;
    }

    public d setPrincipal(String str) {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).setPrincipal(str);
        return this;
    }

    public d setPrincipalBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).setPrincipalBytes(byteString);
        return this;
    }

    public d setRegionCode(String str) {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).setRegionCode(str);
        return this;
    }

    public d setRegionCodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Peer) this.instance).setRegionCodeBytes(byteString);
        return this;
    }
}
