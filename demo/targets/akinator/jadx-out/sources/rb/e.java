package rb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b3;
import com.explorestack.protobuf.c3;
import com.explorestack.protobuf.d3;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.xa;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends o6 implements g {

    /* renamed from: b, reason: collision with root package name */
    public int f84079b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f84080c;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f84081e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f84082f;

    /* renamed from: g, reason: collision with root package name */
    public c3 f84083g;

    /* renamed from: h, reason: collision with root package name */
    public xa f84084h;

    public e() {
        super(null);
        this.f84080c = "";
        this.f84081e = "";
        this.f84082f = "";
        if (k7.alwaysUseFieldBuilders && this.f84084h == null) {
            this.f84084h = new xa(getGeneratedCodeInfo(), getParentForChildren(), isClean());
            this.f84083g = null;
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return j.f84102c;
    }

    public e clearContent() {
        this.f84079b &= -5;
        this.f84082f = f.getDefaultInstance().getContent();
        onChanged();
        return this;
    }

    public e clearGeneratedCodeInfo() {
        xa xaVar = this.f84084h;
        if (xaVar == null) {
            this.f84083g = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f84079b &= -9;
        return this;
    }

    public e clearInsertionPoint() {
        this.f84079b &= -3;
        this.f84081e = f.getDefaultInstance().getInsertionPoint();
        onChanged();
        return this;
    }

    public e clearName() {
        this.f84079b &= -2;
        this.f84080c = f.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    @Override // rb.g
    public String getContent() {
        Serializable serializable = this.f84082f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f84082f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // rb.g
    public ByteString getContentBytes() {
        Serializable serializable = this.f84082f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f84082f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return j.f84102c;
    }

    @Override // rb.g
    public c3 getGeneratedCodeInfo() {
        xa xaVar = this.f84084h;
        if (xaVar != null) {
            return (c3) xaVar.getMessage();
        }
        c3 c3Var = this.f84083g;
        return c3Var == null ? c3.getDefaultInstance() : c3Var;
    }

    public b3 getGeneratedCodeInfoBuilder() {
        this.f84079b |= 8;
        onChanged();
        if (this.f84084h == null) {
            this.f84084h = new xa(getGeneratedCodeInfo(), getParentForChildren(), isClean());
            this.f84083g = null;
        }
        return (b3) this.f84084h.getBuilder();
    }

    @Override // rb.g
    public d3 getGeneratedCodeInfoOrBuilder() {
        xa xaVar = this.f84084h;
        if (xaVar != null) {
            return (d3) xaVar.getMessageOrBuilder();
        }
        c3 c3Var = this.f84083g;
        return c3Var == null ? c3.getDefaultInstance() : c3Var;
    }

    @Override // rb.g
    public String getInsertionPoint() {
        Serializable serializable = this.f84081e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f84081e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // rb.g
    public ByteString getInsertionPointBytes() {
        Serializable serializable = this.f84081e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f84081e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // rb.g
    public String getName() {
        Serializable serializable = this.f84080c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f84080c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // rb.g
    public ByteString getNameBytes() {
        Serializable serializable = this.f84080c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f84080c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // rb.g
    public boolean hasContent() {
        return (this.f84079b & 4) != 0;
    }

    @Override // rb.g
    public boolean hasGeneratedCodeInfo() {
        return (this.f84079b & 8) != 0;
    }

    @Override // rb.g
    public boolean hasInsertionPoint() {
        return (this.f84079b & 2) != 0;
    }

    @Override // rb.g
    public boolean hasName() {
        return (this.f84079b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return j.f84103d.ensureFieldAccessorsInitialized(f.class, e.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public e mergeGeneratedCodeInfo(c3 c3Var) {
        c3 c3Var2;
        xa xaVar = this.f84084h;
        if (xaVar == null) {
            if ((this.f84079b & 8) == 0 || (c3Var2 = this.f84083g) == null || c3Var2 == c3.getDefaultInstance()) {
                this.f84083g = c3Var;
            } else {
                this.f84083g = c3.newBuilder(this.f84083g).mergeFrom(c3Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(c3Var);
        }
        this.f84079b |= 8;
        return this;
    }

    public e setContent(String str) {
        str.getClass();
        this.f84079b |= 4;
        this.f84082f = str;
        onChanged();
        return this;
    }

    public e setContentBytes(ByteString byteString) {
        byteString.getClass();
        this.f84079b |= 4;
        this.f84082f = byteString;
        onChanged();
        return this;
    }

    public e setGeneratedCodeInfo(c3 c3Var) {
        xa xaVar = this.f84084h;
        if (xaVar == null) {
            c3Var.getClass();
            this.f84083g = c3Var;
            onChanged();
        } else {
            xaVar.setMessage(c3Var);
        }
        this.f84079b |= 8;
        return this;
    }

    public e setInsertionPoint(String str) {
        str.getClass();
        this.f84079b |= 2;
        this.f84081e = str;
        onChanged();
        return this;
    }

    public e setInsertionPointBytes(ByteString byteString) {
        byteString.getClass();
        this.f84079b |= 2;
        this.f84081e = byteString;
        onChanged();
        return this;
    }

    public e setName(String str) {
        str.getClass();
        this.f84079b |= 1;
        this.f84080c = str;
        onChanged();
        return this;
    }

    public e setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f84079b |= 1;
        this.f84080c = byteString;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (e) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public f build() {
        f fVarBuildPartial = buildPartial();
        if (fVarBuildPartial.isInitialized()) {
            return fVarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) fVarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public f buildPartial() {
        f fVar = new f(this);
        fVar.f84092h = (byte) -1;
        int i10 = this.f84079b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        fVar.f84088c = this.f84080c;
        if ((i10 & 2) != 0) {
            i11 |= 2;
        }
        fVar.f84089e = this.f84081e;
        if ((i10 & 4) != 0) {
            i11 |= 4;
        }
        fVar.f84090f = this.f84082f;
        if ((i10 & 8) != 0) {
            xa xaVar = this.f84084h;
            if (xaVar == null) {
                fVar.f84091g = this.f84083g;
            } else {
                fVar.f84091g = (c3) xaVar.build();
            }
            i11 |= 8;
        }
        fVar.f84087b = i11;
        onBuilt();
        return fVar;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (e) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public f getDefaultInstanceForType() {
        return f.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (e) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (e) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final e setUnknownFields(gc gcVar) {
        return (e) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public e clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (e) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final e mergeUnknownFields(gc gcVar) {
        return (e) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public e clear() {
        super.clear();
        this.f84080c = "";
        int i10 = this.f84079b;
        this.f84081e = "";
        this.f84082f = "";
        this.f84079b = i10 & (-8);
        xa xaVar = this.f84084h;
        if (xaVar == null) {
            this.f84083g = null;
        } else {
            xaVar.clear();
        }
        this.f84079b &= -9;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public e mo500clone() {
        return (e) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public e mergeFrom(Message message) {
        if (message instanceof f) {
            return mergeFrom((f) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public e setGeneratedCodeInfo(b3 b3Var) {
        xa xaVar = this.f84084h;
        if (xaVar == null) {
            this.f84083g = b3Var.build();
            onChanged();
        } else {
            xaVar.setMessage(b3Var.build());
        }
        this.f84079b |= 8;
        return this;
    }

    public e mergeFrom(f fVar) {
        if (fVar == f.getDefaultInstance()) {
            return this;
        }
        if (fVar.hasName()) {
            this.f84079b |= 1;
            this.f84080c = fVar.f84088c;
            onChanged();
        }
        if (fVar.hasInsertionPoint()) {
            this.f84079b |= 2;
            this.f84081e = fVar.f84089e;
            onChanged();
        }
        if (fVar.hasContent()) {
            this.f84079b |= 4;
            this.f84082f = fVar.f84090f;
            onChanged();
        }
        if (fVar.hasGeneratedCodeInfo()) {
            mergeGeneratedCodeInfo(fVar.getGeneratedCodeInfo());
        }
        mergeUnknownFields(((k7) fVar).unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rb.e mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            rb.d r1 = rb.f.f84086j     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            rb.f r3 = (rb.f) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            if (r3 == 0) goto Le
            r2.mergeFrom(r3)
        Le:
            return r2
        Lf:
            r3 = move-exception
            goto L1f
        L11:
            r3 = move-exception
            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
            rb.f r4 = (rb.f) r4     // Catch: java.lang.Throwable -> Lf
            java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.mergeFrom(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.e.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):rb.e");
    }
}
