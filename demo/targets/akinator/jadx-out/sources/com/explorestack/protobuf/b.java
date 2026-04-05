package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b implements MessageLite {
    protected int memoizedHashCode = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a implements MessageLite.Builder {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        public static ac newUninitializedMessageException(MessageLite messageLite) {
            return new ac(messageLite);
        }

        public final String a(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        @Override // 
        /* renamed from: clone */
        public abstract a mo500clone();

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

        public abstract a internalMergeFrom(b bVar);

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public abstract /* synthetic */ boolean isInitialized();

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom((InputStream) new com.explorestack.protobuf.a(inputStream, y.readRawVarint32(i10, inputStream)), m5Var);
            return true;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public abstract a mergeFrom(y yVar, m5 m5Var) throws IOException;

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Charset charset = x7.f22881a;
            iterable.getClass();
            if (iterable instanceof g8) {
                List<?> underlyingElements = ((g8) iterable).getUnderlyingElements();
                g8 g8Var = (g8) list;
                int size = list.size();
                for (Object obj : underlyingElements) {
                    if (obj == null) {
                        String str = "Element at index " + (g8Var.size() - size) + " is null.";
                        for (int size2 = g8Var.size() - 1; size2 >= size; size2--) {
                            g8Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    }
                    if (obj instanceof ByteString) {
                        g8Var.add((ByteString) obj);
                    } else {
                        g8Var.add((g8) obj);
                    }
                }
                return;
            }
            if (iterable instanceof ga) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(t10);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, m5.getEmptyRegistry());
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(y yVar) throws IOException {
            return mergeFrom(yVar, m5.getEmptyRegistry());
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                y yVarNewCodedInput = byteString.newCodedInput();
                mergeFrom(yVarNewCodedInput);
                yVarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(a("ByteString"), e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            try {
                y yVarNewCodedInput = byteString.newCodedInput();
                mergeFrom(yVarNewCodedInput, m5Var);
                yVarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(a("ByteString"), e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                y yVarNewInstance = y.newInstance(bArr, i10, i11);
                mergeFrom(yVarNewInstance);
                yVarNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(a("byte array"), e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, 0, bArr.length, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException {
            try {
                y yVarNewInstance = y.newInstance(bArr, i10, i11);
                mergeFrom(yVarNewInstance, m5Var);
                yVarNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(a("byte array"), e11);
            }
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(InputStream inputStream) throws IOException {
            y yVarNewInstance = y.newInstance(inputStream);
            mergeFrom(yVarNewInstance);
            yVarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public a mergeFrom(InputStream inputStream, m5 m5Var) throws IOException {
            y yVarNewInstance = y.newInstance(inputStream);
            mergeFrom(yVarNewInstance, m5Var);
            yVarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder
        public a mergeFrom(MessageLite messageLite) {
            if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                return internalMergeFrom((b) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(ua uaVar) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = uaVar.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ boolean isInitialized();

    public ac newUninitializedMessageException() {
        return new ac(this);
    }

    public void setMemoizedSerializedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            h0 h0VarNewInstance = h0.newInstance(bArr);
            writeTo(h0VarNewInstance);
            h0VarNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(a("byte array"), e10);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e10) {
            throw new RuntimeException(a("ByteString"), e10);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iComputeRawVarint32Size = h0.computeRawVarint32Size(serializedSize) + serializedSize;
        if (iComputeRawVarint32Size > 4096) {
            iComputeRawVarint32Size = 4096;
        }
        h0 h0VarNewInstance = h0.newInstance(outputStream, iComputeRawVarint32Size);
        h0VarNewInstance.writeRawVarint32(serializedSize);
        writeTo(h0VarNewInstance);
        h0VarNewInstance.flush();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = h0.f22184c;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        h0 h0VarNewInstance = h0.newInstance(outputStream, serializedSize);
        writeTo(h0VarNewInstance);
        h0VarNewInstance.flush();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        a.addAll((Iterable) iterable, (List) list);
    }
}
