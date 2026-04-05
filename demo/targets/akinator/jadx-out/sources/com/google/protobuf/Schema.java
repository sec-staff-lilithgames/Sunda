package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@CheckReturnValue
/* loaded from: classes7.dex */
interface Schema<T> {
    boolean equals(T t10, T t11);

    int getSerializedSize(T t10);

    int hashCode(T t10);

    boolean isInitialized(T t10);

    void makeImmutable(T t10);

    void mergeFrom(T t10, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t10, T t11);

    void mergeFrom(T t10, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();

    void writeTo(T t10, Writer writer) throws IOException;
}
