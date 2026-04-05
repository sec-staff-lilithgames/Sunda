package com.explorestack.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface fa {
    Object parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws InvalidProtocolBufferException;

    Object parseFrom(ByteString byteString) throws InvalidProtocolBufferException;

    Object parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException;

    Object parseFrom(y yVar) throws InvalidProtocolBufferException;

    Object parseFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException;

    Object parseFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parseFrom(InputStream inputStream, m5 m5Var) throws InvalidProtocolBufferException;

    Object parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    Object parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException;

    Object parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parsePartialDelimitedFrom(InputStream inputStream, m5 m5Var) throws InvalidProtocolBufferException;

    Object parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException;

    Object parsePartialFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException;

    Object parsePartialFrom(y yVar) throws InvalidProtocolBufferException;

    Object parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException;

    Object parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parsePartialFrom(InputStream inputStream, m5 m5Var) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException;
}
