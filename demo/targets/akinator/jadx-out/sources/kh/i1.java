package kh;

import com.google.api.HttpBody;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i1 extends GeneratedMessageLite.Builder implements j1 {
    public i1 addAllExtensions(Iterable<? extends Any> iterable) {
        copyOnWrite();
        ((HttpBody) this.instance).addAllExtensions(iterable);
        return this;
    }

    public i1 addExtensions(Any any) {
        copyOnWrite();
        ((HttpBody) this.instance).addExtensions(any);
        return this;
    }

    public i1 clearContentType() {
        copyOnWrite();
        ((HttpBody) this.instance).clearContentType();
        return this;
    }

    public i1 clearData() {
        copyOnWrite();
        ((HttpBody) this.instance).clearData();
        return this;
    }

    public i1 clearExtensions() {
        copyOnWrite();
        ((HttpBody) this.instance).clearExtensions();
        return this;
    }

    @Override // kh.j1
    public String getContentType() {
        return ((HttpBody) this.instance).getContentType();
    }

    @Override // kh.j1
    public ByteString getContentTypeBytes() {
        return ((HttpBody) this.instance).getContentTypeBytes();
    }

    @Override // kh.j1
    public ByteString getData() {
        return ((HttpBody) this.instance).getData();
    }

    @Override // kh.j1
    public Any getExtensions(int i10) {
        return ((HttpBody) this.instance).getExtensions(i10);
    }

    @Override // kh.j1
    public int getExtensionsCount() {
        return ((HttpBody) this.instance).getExtensionsCount();
    }

    @Override // kh.j1
    public List<Any> getExtensionsList() {
        return Collections.unmodifiableList(((HttpBody) this.instance).getExtensionsList());
    }

    public i1 removeExtensions(int i10) {
        copyOnWrite();
        ((HttpBody) this.instance).removeExtensions(i10);
        return this;
    }

    public i1 setContentType(String str) {
        copyOnWrite();
        ((HttpBody) this.instance).setContentType(str);
        return this;
    }

    public i1 setContentTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((HttpBody) this.instance).setContentTypeBytes(byteString);
        return this;
    }

    public i1 setData(ByteString byteString) {
        copyOnWrite();
        ((HttpBody) this.instance).setData(byteString);
        return this;
    }

    public i1 setExtensions(int i10, Any any) {
        copyOnWrite();
        ((HttpBody) this.instance).setExtensions(i10, any);
        return this;
    }

    public i1 addExtensions(int i10, Any any) {
        copyOnWrite();
        ((HttpBody) this.instance).addExtensions(i10, any);
        return this;
    }

    public i1 setExtensions(int i10, Any.Builder builder) {
        copyOnWrite();
        ((HttpBody) this.instance).setExtensions(i10, builder.build());
        return this;
    }

    public i1 addExtensions(Any.Builder builder) {
        copyOnWrite();
        ((HttpBody) this.instance).addExtensions(builder.build());
        return this;
    }

    public i1 addExtensions(int i10, Any.Builder builder) {
        copyOnWrite();
        ((HttpBody) this.instance).addExtensions(i10, builder.build());
        return this;
    }
}
