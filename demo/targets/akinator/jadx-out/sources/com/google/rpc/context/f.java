package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.rpc.context.AttributeContext;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f extends GeneratedMessageLite.Builder implements h {
    public f clearAuth() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearAuth();
        return this;
    }

    public f clearHeaders() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).getMutableHeadersMap().clear();
        return this;
    }

    public f clearHost() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearHost();
        return this;
    }

    public f clearId() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearId();
        return this;
    }

    public f clearMethod() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearMethod();
        return this;
    }

    public f clearPath() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearPath();
        return this;
    }

    public f clearProtocol() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearProtocol();
        return this;
    }

    public f clearQuery() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearQuery();
        return this;
    }

    public f clearReason() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearReason();
        return this;
    }

    public f clearScheme() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearScheme();
        return this;
    }

    public f clearSize() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearSize();
        return this;
    }

    public f clearTime() {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).clearTime();
        return this;
    }

    @Override // com.google.rpc.context.h
    public boolean containsHeaders(String str) {
        str.getClass();
        return ((AttributeContext.Request) this.instance).getHeadersMap().containsKey(str);
    }

    @Override // com.google.rpc.context.h
    public AttributeContext.Auth getAuth() {
        return ((AttributeContext.Request) this.instance).getAuth();
    }

    @Override // com.google.rpc.context.h
    @Deprecated
    public Map<String, String> getHeaders() {
        return getHeadersMap();
    }

    @Override // com.google.rpc.context.h
    public int getHeadersCount() {
        return ((AttributeContext.Request) this.instance).getHeadersMap().size();
    }

    @Override // com.google.rpc.context.h
    public Map<String, String> getHeadersMap() {
        return Collections.unmodifiableMap(((AttributeContext.Request) this.instance).getHeadersMap());
    }

    @Override // com.google.rpc.context.h
    public String getHeadersOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> headersMap = ((AttributeContext.Request) this.instance).getHeadersMap();
        return headersMap.containsKey(str) ? headersMap.get(str) : str2;
    }

    @Override // com.google.rpc.context.h
    public String getHeadersOrThrow(String str) {
        str.getClass();
        Map<String, String> headersMap = ((AttributeContext.Request) this.instance).getHeadersMap();
        if (headersMap.containsKey(str)) {
            return headersMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.rpc.context.h
    public String getHost() {
        return ((AttributeContext.Request) this.instance).getHost();
    }

    @Override // com.google.rpc.context.h
    public ByteString getHostBytes() {
        return ((AttributeContext.Request) this.instance).getHostBytes();
    }

    @Override // com.google.rpc.context.h
    public String getId() {
        return ((AttributeContext.Request) this.instance).getId();
    }

    @Override // com.google.rpc.context.h
    public ByteString getIdBytes() {
        return ((AttributeContext.Request) this.instance).getIdBytes();
    }

    @Override // com.google.rpc.context.h
    public String getMethod() {
        return ((AttributeContext.Request) this.instance).getMethod();
    }

    @Override // com.google.rpc.context.h
    public ByteString getMethodBytes() {
        return ((AttributeContext.Request) this.instance).getMethodBytes();
    }

    @Override // com.google.rpc.context.h
    public String getPath() {
        return ((AttributeContext.Request) this.instance).getPath();
    }

    @Override // com.google.rpc.context.h
    public ByteString getPathBytes() {
        return ((AttributeContext.Request) this.instance).getPathBytes();
    }

    @Override // com.google.rpc.context.h
    public String getProtocol() {
        return ((AttributeContext.Request) this.instance).getProtocol();
    }

    @Override // com.google.rpc.context.h
    public ByteString getProtocolBytes() {
        return ((AttributeContext.Request) this.instance).getProtocolBytes();
    }

    @Override // com.google.rpc.context.h
    public String getQuery() {
        return ((AttributeContext.Request) this.instance).getQuery();
    }

    @Override // com.google.rpc.context.h
    public ByteString getQueryBytes() {
        return ((AttributeContext.Request) this.instance).getQueryBytes();
    }

    @Override // com.google.rpc.context.h
    public String getReason() {
        return ((AttributeContext.Request) this.instance).getReason();
    }

    @Override // com.google.rpc.context.h
    public ByteString getReasonBytes() {
        return ((AttributeContext.Request) this.instance).getReasonBytes();
    }

    @Override // com.google.rpc.context.h
    public String getScheme() {
        return ((AttributeContext.Request) this.instance).getScheme();
    }

    @Override // com.google.rpc.context.h
    public ByteString getSchemeBytes() {
        return ((AttributeContext.Request) this.instance).getSchemeBytes();
    }

    @Override // com.google.rpc.context.h
    public long getSize() {
        return ((AttributeContext.Request) this.instance).getSize();
    }

    @Override // com.google.rpc.context.h
    public Timestamp getTime() {
        return ((AttributeContext.Request) this.instance).getTime();
    }

    @Override // com.google.rpc.context.h
    public boolean hasAuth() {
        return ((AttributeContext.Request) this.instance).hasAuth();
    }

    @Override // com.google.rpc.context.h
    public boolean hasTime() {
        return ((AttributeContext.Request) this.instance).hasTime();
    }

    public f mergeAuth(AttributeContext.Auth auth) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).mergeAuth(auth);
        return this;
    }

    public f mergeTime(Timestamp timestamp) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).mergeTime(timestamp);
        return this;
    }

    public f putAllHeaders(Map<String, String> map) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).getMutableHeadersMap().putAll(map);
        return this;
    }

    public f putHeaders(String str, String str2) {
        str.getClass();
        str2.getClass();
        copyOnWrite();
        ((AttributeContext.Request) this.instance).getMutableHeadersMap().put(str, str2);
        return this;
    }

    public f removeHeaders(String str) {
        str.getClass();
        copyOnWrite();
        ((AttributeContext.Request) this.instance).getMutableHeadersMap().remove(str);
        return this;
    }

    public f setAuth(AttributeContext.Auth auth) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setAuth(auth);
        return this;
    }

    public f setHost(String str) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setHost(str);
        return this;
    }

    public f setHostBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setHostBytes(byteString);
        return this;
    }

    public f setId(String str) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setId(str);
        return this;
    }

    public f setIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setIdBytes(byteString);
        return this;
    }

    public f setMethod(String str) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setMethod(str);
        return this;
    }

    public f setMethodBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setMethodBytes(byteString);
        return this;
    }

    public f setPath(String str) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setPath(str);
        return this;
    }

    public f setPathBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setPathBytes(byteString);
        return this;
    }

    public f setProtocol(String str) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setProtocol(str);
        return this;
    }

    public f setProtocolBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setProtocolBytes(byteString);
        return this;
    }

    public f setQuery(String str) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setQuery(str);
        return this;
    }

    public f setQueryBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setQueryBytes(byteString);
        return this;
    }

    public f setReason(String str) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setReason(str);
        return this;
    }

    public f setReasonBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setReasonBytes(byteString);
        return this;
    }

    public f setScheme(String str) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setScheme(str);
        return this;
    }

    public f setSchemeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setSchemeBytes(byteString);
        return this;
    }

    public f setSize(long j10) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setSize(j10);
        return this;
    }

    public f setTime(Timestamp timestamp) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setTime(timestamp);
        return this;
    }

    public f setAuth(b bVar) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setAuth((AttributeContext.Auth) bVar.build());
        return this;
    }

    public f setTime(Timestamp.Builder builder) {
        copyOnWrite();
        ((AttributeContext.Request) this.instance).setTime(builder.build());
        return this;
    }
}
