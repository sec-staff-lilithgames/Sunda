package com.google.rpc.context;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.rpc.context.AttributeContext;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k extends GeneratedMessageLite.Builder implements vk.f {
    public k clearCode() {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).clearCode();
        return this;
    }

    public k clearHeaders() {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).getMutableHeadersMap().clear();
        return this;
    }

    public k clearSize() {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).clearSize();
        return this;
    }

    public k clearTime() {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).clearTime();
        return this;
    }

    @Override // vk.f
    public boolean containsHeaders(String str) {
        str.getClass();
        return ((AttributeContext.Response) this.instance).getHeadersMap().containsKey(str);
    }

    @Override // vk.f
    public long getCode() {
        return ((AttributeContext.Response) this.instance).getCode();
    }

    @Override // vk.f
    @Deprecated
    public Map<String, String> getHeaders() {
        return getHeadersMap();
    }

    @Override // vk.f
    public int getHeadersCount() {
        return ((AttributeContext.Response) this.instance).getHeadersMap().size();
    }

    @Override // vk.f
    public Map<String, String> getHeadersMap() {
        return Collections.unmodifiableMap(((AttributeContext.Response) this.instance).getHeadersMap());
    }

    @Override // vk.f
    public String getHeadersOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> headersMap = ((AttributeContext.Response) this.instance).getHeadersMap();
        return headersMap.containsKey(str) ? headersMap.get(str) : str2;
    }

    @Override // vk.f
    public String getHeadersOrThrow(String str) {
        str.getClass();
        Map<String, String> headersMap = ((AttributeContext.Response) this.instance).getHeadersMap();
        if (headersMap.containsKey(str)) {
            return headersMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // vk.f
    public long getSize() {
        return ((AttributeContext.Response) this.instance).getSize();
    }

    @Override // vk.f
    public Timestamp getTime() {
        return ((AttributeContext.Response) this.instance).getTime();
    }

    @Override // vk.f
    public boolean hasTime() {
        return ((AttributeContext.Response) this.instance).hasTime();
    }

    public k mergeTime(Timestamp timestamp) {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).mergeTime(timestamp);
        return this;
    }

    public k putAllHeaders(Map<String, String> map) {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).getMutableHeadersMap().putAll(map);
        return this;
    }

    public k putHeaders(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((AttributeContext.Response) this.instance).getMutableHeadersMap().put(str, str2);
        return this;
    }

    public k removeHeaders(String str) {
        str.getClass();
        copyOnWrite();
        ((AttributeContext.Response) this.instance).getMutableHeadersMap().remove(str);
        return this;
    }

    public k setCode(long j10) {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).setCode(j10);
        return this;
    }

    public k setSize(long j10) {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).setSize(j10);
        return this;
    }

    public k setTime(Timestamp timestamp) {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).setTime(timestamp);
        return this;
    }

    public k setTime(Timestamp.Builder builder) {
        copyOnWrite();
        ((AttributeContext.Response) this.instance).setTime(builder.build());
        return this;
    }
}
