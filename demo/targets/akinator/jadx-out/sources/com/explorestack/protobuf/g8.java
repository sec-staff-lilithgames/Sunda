package com.explorestack.protobuf;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface g8 extends ka {
    void add(ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends ByteString> collection);

    List<byte[]> asByteArrayList();

    @Override // com.explorestack.protobuf.ka
    /* synthetic */ List asByteStringList();

    byte[] getByteArray(int i10);

    ByteString getByteString(int i10);

    Object getRaw(int i10);

    List<?> getUnderlyingElements();

    g8 getUnmodifiableView();

    void mergeFrom(g8 g8Var);

    void set(int i10, ByteString byteString);

    void set(int i10, byte[] bArr);
}
