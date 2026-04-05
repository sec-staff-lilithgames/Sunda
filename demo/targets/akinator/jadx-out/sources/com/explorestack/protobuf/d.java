package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d implements fa {
    private static final m5 EMPTY_REGISTRY = m5.getEmptyRegistry();

    public static void a(MessageLite messageLite) throws InvalidProtocolBufferException {
        if (messageLite == null || messageLite.isInitialized()) {
        } else {
            throw (messageLite instanceof b ? ((b) messageLite).newUninitializedMessageException() : new ac(messageLite)).asInvalidProtocolBufferException().setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.fa
    public abstract /* synthetic */ Object parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException;

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        MessageLite partialDelimitedFrom = parsePartialDelimitedFrom(inputStream, m5Var);
        a(partialDelimitedFrom);
        return partialDelimitedFrom;
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new a(inputStream, y.readRawVarint32(i10, inputStream)), m5Var);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(y yVar) throws InvalidProtocolBufferException {
        return (MessageLite) parsePartialFrom(yVar, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        y yVarNewCodedInput = byteString.newCodedInput();
        MessageLite messageLite = (MessageLite) parsePartialFrom(yVarNewCodedInput, m5Var);
        try {
            yVarNewCodedInput.checkLastTagWas(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        MessageLite messageLite = (MessageLite) parsePartialFrom(yVar, m5Var);
        a(messageLite);
        return messageLite;
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(y yVar) throws InvalidProtocolBufferException {
        return parseFrom(yVar, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        MessageLite partialFrom = parsePartialFrom(byteString, m5Var);
        a(partialFrom);
        return partialFrom;
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return parsePartialFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return parseFrom(byteString, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException {
        y yVarNewInstance = y.newInstance(bArr, i10, i11);
        MessageLite messageLite = (MessageLite) parsePartialFrom(yVarNewInstance, m5Var);
        try {
            yVarNewInstance.checkLastTagWas(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        y yVarNewInstance = y.newInstance(byteBuffer);
        MessageLite messageLite = (MessageLite) parsePartialFrom(yVarNewInstance, m5Var);
        try {
            yVarNewInstance.checkLastTagWas(0);
            a(messageLite);
            return messageLite;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return parsePartialFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, m5Var);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException {
        MessageLite partialFrom = parsePartialFrom(bArr, i10, i11, m5Var);
        a(partialFrom);
        return partialFrom;
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(InputStream inputStream, m5 m5Var) throws InvalidProtocolBufferException {
        y yVarNewInstance = y.newInstance(inputStream);
        MessageLite messageLite = (MessageLite) parsePartialFrom(yVarNewInstance, m5Var);
        try {
            yVarNewInstance.checkLastTagWas(0);
            return messageLite;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(messageLite);
        }
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return parseFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return parseFrom(bArr, 0, bArr.length, m5Var);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(InputStream inputStream, m5 m5Var) throws InvalidProtocolBufferException {
        MessageLite partialFrom = parsePartialFrom(inputStream, m5Var);
        a(partialFrom);
        return partialFrom;
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.explorestack.protobuf.fa
    public MessageLite parseFrom(InputStream inputStream) throws InvalidProtocolBufferException {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
