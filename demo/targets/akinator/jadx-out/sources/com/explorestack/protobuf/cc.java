package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class cc implements MessageLite.Builder {

    /* renamed from: b, reason: collision with root package name */
    public Map f22036b;

    /* renamed from: c, reason: collision with root package name */
    public int f22037c;

    /* renamed from: e, reason: collision with root package name */
    public dc f22038e;

    public final dc a(int i10) {
        dc dcVar = this.f22038e;
        if (dcVar != null) {
            int i11 = this.f22037c;
            if (i10 == i11) {
                return dcVar;
            }
            addField(i11, dcVar.build());
        }
        if (i10 == 0) {
            return null;
        }
        ec ecVar = (ec) this.f22036b.get(Integer.valueOf(i10));
        this.f22037c = i10;
        dc dcVarNewBuilder = ec.newBuilder();
        this.f22038e = dcVarNewBuilder;
        if (ecVar != null) {
            dcVarNewBuilder.mergeFrom(ecVar);
        }
        return this.f22038e;
    }

    public cc addField(int i10, ec ecVar) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        if (this.f22038e != null && this.f22037c == i10) {
            this.f22038e = null;
            this.f22037c = 0;
        }
        if (this.f22036b.isEmpty()) {
            this.f22036b = new TreeMap();
        }
        this.f22036b.put(Integer.valueOf(i10), ecVar);
        return this;
    }

    public Map<Integer, ec> asMap() {
        a(0);
        return Collections.unmodifiableMap(this.f22036b);
    }

    public cc clearField(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        if (this.f22038e != null && this.f22037c == i10) {
            this.f22038e = null;
            this.f22037c = 0;
        }
        if (this.f22036b.containsKey(Integer.valueOf(i10))) {
            this.f22036b.remove(Integer.valueOf(i10));
        }
        return this;
    }

    public boolean hasField(int i10) {
        if (i10 != 0) {
            return i10 == this.f22037c || this.f22036b.containsKey(Integer.valueOf(i10));
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 == -1) {
            return false;
        }
        mergeFrom((InputStream) new a(inputStream, y.readRawVarint32(i10, inputStream)));
        return true;
    }

    public cc mergeField(int i10, ec ecVar) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        if (hasField(i10)) {
            a(i10).mergeFrom(ecVar);
            return this;
        }
        addField(i10, ecVar);
        return this;
    }

    public boolean mergeFieldFrom(int i10, y yVar) throws IOException {
        int tagFieldNumber = hd.getTagFieldNumber(i10);
        int tagWireType = hd.getTagWireType(i10);
        if (tagWireType == 0) {
            a(tagFieldNumber).addVarint(yVar.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            a(tagFieldNumber).addFixed64(yVar.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            a(tagFieldNumber).addLengthDelimited(yVar.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            cc ccVarNewBuilder = gc.newBuilder();
            yVar.readGroup(tagFieldNumber, ccVarNewBuilder, i5.getEmptyRegistry());
            a(tagFieldNumber).addGroup(ccVarNewBuilder.build());
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        a(tagFieldNumber).addFixed32(yVar.readFixed32());
        return true;
    }

    public cc mergeLengthDelimitedField(int i10, ByteString byteString) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        a(i10).addLengthDelimited(byteString);
        return this;
    }

    public cc mergeVarintField(int i10, int i11) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        a(i10).addVarint(i11);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public gc build() {
        gc gcVar;
        a(0);
        if (this.f22036b.isEmpty()) {
            gcVar = gc.getDefaultInstance();
        } else {
            gcVar = new gc(Collections.unmodifiableMap(this.f22036b), Collections.unmodifiableMap(((TreeMap) this.f22036b).descendingMap()));
        }
        this.f22036b = null;
        return gcVar;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public gc buildPartial() {
        return build();
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc clear() {
        this.f22036b = Collections.EMPTY_MAP;
        this.f22037c = 0;
        this.f22038e = null;
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public gc getDefaultInstanceForType() {
        return gc.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public cc m502clone() {
        a(0);
        return gc.newBuilder().mergeFrom(new gc(this.f22036b, Collections.unmodifiableMap(((TreeMap) this.f22036b).descendingMap())));
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public boolean mergeDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return mergeDelimitedFrom(inputStream);
    }

    public cc mergeFrom(gc gcVar) {
        if (gcVar != gc.getDefaultInstance()) {
            for (Map.Entry entry : gcVar.f22176b.entrySet()) {
                mergeField(((Integer) entry.getKey()).intValue(), (ec) entry.getValue());
            }
        }
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(y yVar) throws IOException {
        int tag;
        do {
            tag = yVar.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, yVar));
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
        try {
            y yVarNewCodedInput = byteString.newCodedInput();
            mergeFrom(yVarNewCodedInput);
            yVarNewCodedInput.checkLastTagWas(0);
            return this;
        } catch (InvalidProtocolBufferException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e11);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
        try {
            y yVarNewInstance = y.newInstance(bArr);
            mergeFrom(yVarNewInstance);
            yVarNewInstance.checkLastTagWas(0);
            return this;
        } catch (InvalidProtocolBufferException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(InputStream inputStream) throws IOException {
        y yVarNewInstance = y.newInstance(inputStream);
        mergeFrom(yVarNewInstance);
        yVarNewInstance.checkLastTagWas(0);
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(y yVar, m5 m5Var) throws IOException {
        return mergeFrom(yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return mergeFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        try {
            y yVarNewInstance = y.newInstance(bArr, i10, i11);
            mergeFrom(yVarNewInstance);
            yVarNewInstance.checkLastTagWas(0);
            return this;
        } catch (InvalidProtocolBufferException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e11);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return mergeFrom(bArr);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException {
        return mergeFrom(bArr, i10, i11);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public cc mergeFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return mergeFrom(inputStream);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder
    public cc mergeFrom(MessageLite messageLite) {
        if (messageLite instanceof gc) {
            return mergeFrom((gc) messageLite);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
