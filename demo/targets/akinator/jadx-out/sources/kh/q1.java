package kh;

import com.google.api.JwtLocation;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q1 extends GeneratedMessageLite.Builder implements s1 {
    public q1 clearHeader() {
        copyOnWrite();
        ((JwtLocation) this.instance).clearHeader();
        return this;
    }

    public q1 clearIn() {
        copyOnWrite();
        ((JwtLocation) this.instance).clearIn();
        return this;
    }

    public q1 clearQuery() {
        copyOnWrite();
        ((JwtLocation) this.instance).clearQuery();
        return this;
    }

    public q1 clearValuePrefix() {
        copyOnWrite();
        ((JwtLocation) this.instance).clearValuePrefix();
        return this;
    }

    @Override // kh.s1
    public String getHeader() {
        return ((JwtLocation) this.instance).getHeader();
    }

    @Override // kh.s1
    public ByteString getHeaderBytes() {
        return ((JwtLocation) this.instance).getHeaderBytes();
    }

    @Override // kh.s1
    public r1 getInCase() {
        return ((JwtLocation) this.instance).getInCase();
    }

    @Override // kh.s1
    public String getQuery() {
        return ((JwtLocation) this.instance).getQuery();
    }

    @Override // kh.s1
    public ByteString getQueryBytes() {
        return ((JwtLocation) this.instance).getQueryBytes();
    }

    @Override // kh.s1
    public String getValuePrefix() {
        return ((JwtLocation) this.instance).getValuePrefix();
    }

    @Override // kh.s1
    public ByteString getValuePrefixBytes() {
        return ((JwtLocation) this.instance).getValuePrefixBytes();
    }

    @Override // kh.s1
    public boolean hasHeader() {
        return ((JwtLocation) this.instance).hasHeader();
    }

    @Override // kh.s1
    public boolean hasQuery() {
        return ((JwtLocation) this.instance).hasQuery();
    }

    public q1 setHeader(String str) {
        copyOnWrite();
        ((JwtLocation) this.instance).setHeader(str);
        return this;
    }

    public q1 setHeaderBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((JwtLocation) this.instance).setHeaderBytes(byteString);
        return this;
    }

    public q1 setQuery(String str) {
        copyOnWrite();
        ((JwtLocation) this.instance).setQuery(str);
        return this;
    }

    public q1 setQueryBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((JwtLocation) this.instance).setQueryBytes(byteString);
        return this;
    }

    public q1 setValuePrefix(String str) {
        copyOnWrite();
        ((JwtLocation) this.instance).setValuePrefix(str);
        return this;
    }

    public q1 setValuePrefixBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((JwtLocation) this.instance).setValuePrefixBytes(byteString);
        return this;
    }
}
