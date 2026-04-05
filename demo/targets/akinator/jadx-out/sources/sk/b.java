package sk;

import com.google.logging.type.HttpRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearCacheFillBytes() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearCacheFillBytes();
        return this;
    }

    public b clearCacheHit() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearCacheHit();
        return this;
    }

    public b clearCacheLookup() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearCacheLookup();
        return this;
    }

    public b clearCacheValidatedWithOriginServer() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearCacheValidatedWithOriginServer();
        return this;
    }

    public b clearLatency() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearLatency();
        return this;
    }

    public b clearProtocol() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearProtocol();
        return this;
    }

    public b clearReferer() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearReferer();
        return this;
    }

    public b clearRemoteIp() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearRemoteIp();
        return this;
    }

    public b clearRequestMethod() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearRequestMethod();
        return this;
    }

    public b clearRequestSize() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearRequestSize();
        return this;
    }

    public b clearRequestUrl() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearRequestUrl();
        return this;
    }

    public b clearResponseSize() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearResponseSize();
        return this;
    }

    public b clearServerIp() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearServerIp();
        return this;
    }

    public b clearStatus() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearStatus();
        return this;
    }

    public b clearUserAgent() {
        copyOnWrite();
        ((HttpRequest) this.instance).clearUserAgent();
        return this;
    }

    @Override // sk.c
    public long getCacheFillBytes() {
        return ((HttpRequest) this.instance).getCacheFillBytes();
    }

    @Override // sk.c
    public boolean getCacheHit() {
        return ((HttpRequest) this.instance).getCacheHit();
    }

    @Override // sk.c
    public boolean getCacheLookup() {
        return ((HttpRequest) this.instance).getCacheLookup();
    }

    @Override // sk.c
    public boolean getCacheValidatedWithOriginServer() {
        return ((HttpRequest) this.instance).getCacheValidatedWithOriginServer();
    }

    @Override // sk.c
    public Duration getLatency() {
        return ((HttpRequest) this.instance).getLatency();
    }

    @Override // sk.c
    public String getProtocol() {
        return ((HttpRequest) this.instance).getProtocol();
    }

    @Override // sk.c
    public ByteString getProtocolBytes() {
        return ((HttpRequest) this.instance).getProtocolBytes();
    }

    @Override // sk.c
    public String getReferer() {
        return ((HttpRequest) this.instance).getReferer();
    }

    @Override // sk.c
    public ByteString getRefererBytes() {
        return ((HttpRequest) this.instance).getRefererBytes();
    }

    @Override // sk.c
    public String getRemoteIp() {
        return ((HttpRequest) this.instance).getRemoteIp();
    }

    @Override // sk.c
    public ByteString getRemoteIpBytes() {
        return ((HttpRequest) this.instance).getRemoteIpBytes();
    }

    @Override // sk.c
    public String getRequestMethod() {
        return ((HttpRequest) this.instance).getRequestMethod();
    }

    @Override // sk.c
    public ByteString getRequestMethodBytes() {
        return ((HttpRequest) this.instance).getRequestMethodBytes();
    }

    @Override // sk.c
    public long getRequestSize() {
        return ((HttpRequest) this.instance).getRequestSize();
    }

    @Override // sk.c
    public String getRequestUrl() {
        return ((HttpRequest) this.instance).getRequestUrl();
    }

    @Override // sk.c
    public ByteString getRequestUrlBytes() {
        return ((HttpRequest) this.instance).getRequestUrlBytes();
    }

    @Override // sk.c
    public long getResponseSize() {
        return ((HttpRequest) this.instance).getResponseSize();
    }

    @Override // sk.c
    public String getServerIp() {
        return ((HttpRequest) this.instance).getServerIp();
    }

    @Override // sk.c
    public ByteString getServerIpBytes() {
        return ((HttpRequest) this.instance).getServerIpBytes();
    }

    @Override // sk.c
    public int getStatus() {
        return ((HttpRequest) this.instance).getStatus();
    }

    @Override // sk.c
    public String getUserAgent() {
        return ((HttpRequest) this.instance).getUserAgent();
    }

    @Override // sk.c
    public ByteString getUserAgentBytes() {
        return ((HttpRequest) this.instance).getUserAgentBytes();
    }

    @Override // sk.c
    public boolean hasLatency() {
        return ((HttpRequest) this.instance).hasLatency();
    }

    public b mergeLatency(Duration duration) {
        copyOnWrite();
        ((HttpRequest) this.instance).mergeLatency(duration);
        return this;
    }

    public b setCacheFillBytes(long j10) {
        copyOnWrite();
        ((HttpRequest) this.instance).setCacheFillBytes(j10);
        return this;
    }

    public b setCacheHit(boolean z10) {
        copyOnWrite();
        ((HttpRequest) this.instance).setCacheHit(z10);
        return this;
    }

    public b setCacheLookup(boolean z10) {
        copyOnWrite();
        ((HttpRequest) this.instance).setCacheLookup(z10);
        return this;
    }

    public b setCacheValidatedWithOriginServer(boolean z10) {
        copyOnWrite();
        ((HttpRequest) this.instance).setCacheValidatedWithOriginServer(z10);
        return this;
    }

    public b setLatency(Duration duration) {
        copyOnWrite();
        ((HttpRequest) this.instance).setLatency(duration);
        return this;
    }

    public b setProtocol(String str) {
        copyOnWrite();
        ((HttpRequest) this.instance).setProtocol(str);
        return this;
    }

    public b setProtocolBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRequest) this.instance).setProtocolBytes(byteString);
        return this;
    }

    public b setReferer(String str) {
        copyOnWrite();
        ((HttpRequest) this.instance).setReferer(str);
        return this;
    }

    public b setRefererBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRequest) this.instance).setRefererBytes(byteString);
        return this;
    }

    public b setRemoteIp(String str) {
        copyOnWrite();
        ((HttpRequest) this.instance).setRemoteIp(str);
        return this;
    }

    public b setRemoteIpBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRequest) this.instance).setRemoteIpBytes(byteString);
        return this;
    }

    public b setRequestMethod(String str) {
        copyOnWrite();
        ((HttpRequest) this.instance).setRequestMethod(str);
        return this;
    }

    public b setRequestMethodBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRequest) this.instance).setRequestMethodBytes(byteString);
        return this;
    }

    public b setRequestSize(long j10) {
        copyOnWrite();
        ((HttpRequest) this.instance).setRequestSize(j10);
        return this;
    }

    public b setRequestUrl(String str) {
        copyOnWrite();
        ((HttpRequest) this.instance).setRequestUrl(str);
        return this;
    }

    public b setRequestUrlBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRequest) this.instance).setRequestUrlBytes(byteString);
        return this;
    }

    public b setResponseSize(long j10) {
        copyOnWrite();
        ((HttpRequest) this.instance).setResponseSize(j10);
        return this;
    }

    public b setServerIp(String str) {
        copyOnWrite();
        ((HttpRequest) this.instance).setServerIp(str);
        return this;
    }

    public b setServerIpBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRequest) this.instance).setServerIpBytes(byteString);
        return this;
    }

    public b setStatus(int i10) {
        copyOnWrite();
        ((HttpRequest) this.instance).setStatus(i10);
        return this;
    }

    public b setUserAgent(String str) {
        copyOnWrite();
        ((HttpRequest) this.instance).setUserAgent(str);
        return this;
    }

    public b setUserAgentBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpRequest) this.instance).setUserAgentBytes(byteString);
        return this;
    }

    public b setLatency(Duration.Builder builder) {
        copyOnWrite();
        ((HttpRequest) this.instance).setLatency(builder.build());
        return this;
    }
}
