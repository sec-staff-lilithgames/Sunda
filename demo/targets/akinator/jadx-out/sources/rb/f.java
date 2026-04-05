package rb;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b3;
import com.explorestack.protobuf.c3;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d3;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends k7 implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final f f84085i = new f();

    /* renamed from: j, reason: collision with root package name */
    public static final d f84086j = new d();

    /* renamed from: b, reason: collision with root package name */
    public int f84087b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f84088c;

    /* renamed from: e, reason: collision with root package name */
    public volatile Serializable f84089e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Serializable f84090f;

    /* renamed from: g, reason: collision with root package name */
    public c3 f84091g;

    /* renamed from: h, reason: collision with root package name */
    public byte f84092h;

    public f() {
        this.f84092h = (byte) -1;
        this.f84088c = "";
        this.f84089e = "";
        this.f84090f = "";
    }

    public static f getDefaultInstance() {
        return f84085i;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return j.f84102c;
    }

    public static e newBuilder() {
        return f84085i.toBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (f) k7.parseDelimitedWithIOException(f84086j, inputStream);
    }

    public static f parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f) f84086j.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f84086j;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (hasName() != fVar.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(fVar.getName())) || hasInsertionPoint() != fVar.hasInsertionPoint()) {
            return false;
        }
        if ((hasInsertionPoint() && !getInsertionPoint().equals(fVar.getInsertionPoint())) || hasContent() != fVar.hasContent()) {
            return false;
        }
        if ((!hasContent() || getContent().equals(fVar.getContent())) && hasGeneratedCodeInfo() == fVar.hasGeneratedCodeInfo()) {
            return (!hasGeneratedCodeInfo() || getGeneratedCodeInfo().equals(fVar.getGeneratedCodeInfo())) && this.unknownFields.equals(fVar.unknownFields);
        }
        return false;
    }

    @Override // rb.g
    public String getContent() {
        Serializable serializable = this.f84090f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f84090f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // rb.g
    public ByteString getContentBytes() {
        Serializable serializable = this.f84090f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f84090f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // rb.g
    public c3 getGeneratedCodeInfo() {
        c3 c3Var = this.f84091g;
        return c3Var == null ? c3.getDefaultInstance() : c3Var;
    }

    @Override // rb.g
    public d3 getGeneratedCodeInfoOrBuilder() {
        c3 c3Var = this.f84091g;
        return c3Var == null ? c3.getDefaultInstance() : c3Var;
    }

    @Override // rb.g
    public String getInsertionPoint() {
        Serializable serializable = this.f84089e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f84089e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // rb.g
    public ByteString getInsertionPointBytes() {
        Serializable serializable = this.f84089e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f84089e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // rb.g
    public String getName() {
        Serializable serializable = this.f84088c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f84088c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // rb.g
    public ByteString getNameBytes() {
        Serializable serializable = this.f84088c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f84088c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f84086j;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f84087b & 1) != 0 ? k7.computeStringSize(1, this.f84088c) : 0;
        if ((this.f84087b & 2) != 0) {
            iComputeStringSize += k7.computeStringSize(2, this.f84089e);
        }
        if ((this.f84087b & 4) != 0) {
            iComputeStringSize += k7.computeStringSize(15, this.f84090f);
        }
        if ((this.f84087b & 8) != 0) {
            iComputeStringSize += h0.computeMessageSize(16, getGeneratedCodeInfo());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // rb.g
    public boolean hasContent() {
        return (this.f84087b & 4) != 0;
    }

    @Override // rb.g
    public boolean hasGeneratedCodeInfo() {
        return (this.f84087b & 8) != 0;
    }

    @Override // rb.g
    public boolean hasInsertionPoint() {
        return (this.f84087b & 2) != 0;
    }

    @Override // rb.g
    public boolean hasName() {
        return (this.f84087b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasInsertionPoint()) {
            iHashCode = o2.B(iHashCode, 37, 2, 53) + getInsertionPoint().hashCode();
        }
        if (hasContent()) {
            iHashCode = o2.B(iHashCode, 37, 15, 53) + getContent().hashCode();
        }
        if (hasGeneratedCodeInfo()) {
            iHashCode = o2.B(iHashCode, 37, 16, 53) + getGeneratedCodeInfo().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return j.f84103d.ensureFieldAccessorsInitialized(f.class, e.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f84092h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f84092h = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new f();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f84087b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f84088c);
        }
        if ((this.f84087b & 2) != 0) {
            k7.writeString(h0Var, 2, this.f84089e);
        }
        if ((this.f84087b & 4) != 0) {
            k7.writeString(h0Var, 15, this.f84090f);
        }
        if ((this.f84087b & 8) != 0) {
            h0Var.writeMessage(16, getGeneratedCodeInfo());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static e newBuilder(f fVar) {
        return f84085i.toBuilder().mergeFrom(fVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (f) f84086j.parseFrom(byteBuffer, m5Var);
    }

    public static f parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (f) k7.parseDelimitedWithIOException(f84086j, inputStream, m5Var);
    }

    public static f parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (f) f84086j.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public f getDefaultInstanceForType() {
        return f84085i;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public e newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public e toBuilder() {
        if (this == f84085i) {
            return new e();
        }
        return new e().mergeFrom(this);
    }

    public static f parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (f) f84086j.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        e eVar = new e(p6Var);
        eVar.f84080c = "";
        eVar.f84081e = "";
        eVar.f84082f = "";
        if (k7.alwaysUseFieldBuilders && eVar.f84084h == null) {
            eVar.f84084h = new xa(eVar.getGeneratedCodeInfo(), eVar.getParentForChildren(), eVar.isClean());
            eVar.f84083g = null;
        }
        return eVar;
    }

    public static f parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (f) f84086j.parseFrom(bArr);
    }

    public f(y yVar, m5 m5Var) {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            ByteString bytes = yVar.readBytes();
                            this.f84087b = 1 | this.f84087b;
                            this.f84088c = bytes;
                        } else if (tag == 18) {
                            ByteString bytes2 = yVar.readBytes();
                            this.f84087b |= 2;
                            this.f84089e = bytes2;
                        } else if (tag == 122) {
                            ByteString bytes3 = yVar.readBytes();
                            this.f84087b |= 4;
                            this.f84090f = bytes3;
                        } else if (tag != 130) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            b3 builder = (this.f84087b & 8) != 0 ? this.f84091g.toBuilder() : null;
                            c3 c3Var = (c3) yVar.readMessage(c3.f21979f, m5Var);
                            this.f84091g = c3Var;
                            if (builder != null) {
                                builder.mergeFrom(c3Var);
                                this.f84091g = builder.buildPartial();
                            }
                            this.f84087b |= 8;
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static f parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (f) f84086j.parseFrom(bArr, m5Var);
    }

    public static f parseFrom(InputStream inputStream) throws IOException {
        return (f) k7.parseWithIOException(f84086j, inputStream);
    }

    public static f parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (f) k7.parseWithIOException(f84086j, inputStream, m5Var);
    }

    public static f parseFrom(y yVar) throws IOException {
        return (f) k7.parseWithIOException(f84086j, yVar);
    }

    public static f parseFrom(y yVar, m5 m5Var) throws IOException {
        return (f) k7.parseWithIOException(f84086j, yVar, m5Var);
    }
}
