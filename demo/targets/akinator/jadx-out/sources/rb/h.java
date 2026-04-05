package rb;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends k7 implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final h f84093h = new h();

    /* renamed from: i, reason: collision with root package name */
    public static final a f84094i = new a();

    /* renamed from: b, reason: collision with root package name */
    public int f84095b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f84096c;

    /* renamed from: e, reason: collision with root package name */
    public long f84097e;

    /* renamed from: f, reason: collision with root package name */
    public List f84098f;

    /* renamed from: g, reason: collision with root package name */
    public byte f84099g;

    public h() {
        this.f84099g = (byte) -1;
        this.f84096c = "";
        this.f84098f = Collections.EMPTY_LIST;
    }

    public static h getDefaultInstance() {
        return f84093h;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return j.f84100a;
    }

    public static b newBuilder() {
        return f84093h.toBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (h) k7.parseDelimitedWithIOException(f84094i, inputStream);
    }

    public static h parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (h) f84094i.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f84094i;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (hasError() != hVar.hasError()) {
            return false;
        }
        if ((!hasError() || getError().equals(hVar.getError())) && hasSupportedFeatures() == hVar.hasSupportedFeatures()) {
            return (!hasSupportedFeatures() || getSupportedFeatures() == hVar.getSupportedFeatures()) && getFileList().equals(hVar.getFileList()) && this.unknownFields.equals(hVar.unknownFields);
        }
        return false;
    }

    @Override // rb.i
    public String getError() {
        Serializable serializable = this.f84096c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f84096c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // rb.i
    public ByteString getErrorBytes() {
        Serializable serializable = this.f84096c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f84096c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // rb.i
    public f getFile(int i10) {
        return (f) this.f84098f.get(i10);
    }

    @Override // rb.i
    public int getFileCount() {
        return this.f84098f.size();
    }

    @Override // rb.i
    public List<f> getFileList() {
        return this.f84098f;
    }

    @Override // rb.i
    public g getFileOrBuilder(int i10) {
        return (g) this.f84098f.get(i10);
    }

    @Override // rb.i
    public List<? extends g> getFileOrBuilderList() {
        return this.f84098f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f84094i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f84095b & 1) != 0 ? k7.computeStringSize(1, this.f84096c) : 0;
        if ((this.f84095b & 2) != 0) {
            iComputeStringSize += h0.computeUInt64Size(2, this.f84097e);
        }
        for (int i11 = 0; i11 < this.f84098f.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(15, (MessageLite) this.f84098f.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // rb.i
    public long getSupportedFeatures() {
        return this.f84097e;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // rb.i
    public boolean hasError() {
        return (this.f84095b & 1) != 0;
    }

    @Override // rb.i
    public boolean hasSupportedFeatures() {
        return (this.f84095b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasError()) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getError().hashCode();
        }
        if (hasSupportedFeatures()) {
            iHashCode = o2.B(iHashCode, 37, 2, 53) + x7.hashLong(getSupportedFeatures());
        }
        if (getFileCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 15, 53) + getFileList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return j.f84101b.ensureFieldAccessorsInitialized(h.class, b.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f84099g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f84099g = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new h();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f84095b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f84096c);
        }
        if ((this.f84095b & 2) != 0) {
            h0Var.writeUInt64(2, this.f84097e);
        }
        for (int i10 = 0; i10 < this.f84098f.size(); i10++) {
            h0Var.writeMessage(15, (MessageLite) this.f84098f.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static b newBuilder(h hVar) {
        return f84093h.toBuilder().mergeFrom(hVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (h) f84094i.parseFrom(byteBuffer, m5Var);
    }

    public static h parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (h) k7.parseDelimitedWithIOException(f84094i, inputStream, m5Var);
    }

    public static h parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (h) f84094i.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public h getDefaultInstanceForType() {
        return f84093h;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public b newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public b toBuilder() {
        if (this == f84093h) {
            return new b();
        }
        return new b().mergeFrom(this);
    }

    public static h parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (h) f84094i.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        b bVar = new b(p6Var);
        bVar.f84075c = "";
        bVar.f84077f = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            bVar.e();
        }
        return bVar;
    }

    public h(y yVar, m5 m5Var) {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            ByteString bytes = yVar.readBytes();
                            this.f84095b = 1 | this.f84095b;
                            this.f84096c = bytes;
                        } else if (tag == 16) {
                            this.f84095b |= 2;
                            this.f84097e = yVar.readUInt64();
                        } else if (tag != 122) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            if ((c10 & 4) == 0) {
                                this.f84098f = new ArrayList();
                                c10 = 4;
                            }
                            this.f84098f.add(yVar.readMessage(f.f84086j, m5Var));
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((c10 & 4) != 0) {
                    this.f84098f = Collections.unmodifiableList(this.f84098f);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((c10 & 4) != 0) {
            this.f84098f = Collections.unmodifiableList(this.f84098f);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static h parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (h) f84094i.parseFrom(bArr);
    }

    public static h parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (h) f84094i.parseFrom(bArr, m5Var);
    }

    public static h parseFrom(InputStream inputStream) throws IOException {
        return (h) k7.parseWithIOException(f84094i, inputStream);
    }

    public static h parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (h) k7.parseWithIOException(f84094i, inputStream, m5Var);
    }

    public static h parseFrom(y yVar) throws IOException {
        return (h) k7.parseWithIOException(f84094i, yVar);
    }

    public static h parseFrom(y yVar, m5 m5Var) throws IOException {
        return (h) k7.parseWithIOException(f84094i, yVar, m5Var);
    }
}
