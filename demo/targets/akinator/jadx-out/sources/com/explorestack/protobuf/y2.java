package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y2 extends o6 implements a3 {

    /* renamed from: b, reason: collision with root package name */
    public int f22905b;

    /* renamed from: c, reason: collision with root package name */
    public s7 f22906c;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f22907e;

    /* renamed from: f, reason: collision with root package name */
    public int f22908f;

    /* renamed from: g, reason: collision with root package name */
    public int f22909g;

    public y2() {
        super(null);
        this.f22906c = k7.emptyIntList();
        this.f22907e = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.Y;
    }

    public y2 addAllPath(Iterable<? extends Integer> iterable) {
        c();
        b.a.addAll((Iterable) iterable, (List) this.f22906c);
        onChanged();
        return this;
    }

    public y2 addPath(int i10) {
        c();
        ((l7) this.f22906c).addInt(i10);
        onChanged();
        return this;
    }

    public final void c() {
        if ((this.f22905b & 1) == 0) {
            this.f22906c = k7.mutableCopy(this.f22906c);
            this.f22905b |= 1;
        }
    }

    public y2 clearBegin() {
        this.f22905b &= -5;
        this.f22908f = 0;
        onChanged();
        return this;
    }

    public y2 clearEnd() {
        this.f22905b &= -9;
        this.f22909g = 0;
        onChanged();
        return this;
    }

    public y2 clearPath() {
        this.f22906c = k7.emptyIntList();
        this.f22905b &= -2;
        onChanged();
        return this;
    }

    public y2 clearSourceFile() {
        this.f22905b &= -3;
        this.f22907e = z2.getDefaultInstance().getSourceFile();
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.a3
    public int getBegin() {
        return this.f22908f;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.Y;
    }

    @Override // com.explorestack.protobuf.a3
    public int getEnd() {
        return this.f22909g;
    }

    @Override // com.explorestack.protobuf.a3
    public int getPath(int i10) {
        return ((l7) this.f22906c).getInt(i10);
    }

    @Override // com.explorestack.protobuf.a3
    public int getPathCount() {
        return this.f22906c.size();
    }

    @Override // com.explorestack.protobuf.a3
    public List<Integer> getPathList() {
        return (this.f22905b & 1) != 0 ? Collections.unmodifiableList(this.f22906c) : this.f22906c;
    }

    @Override // com.explorestack.protobuf.a3
    public String getSourceFile() {
        Serializable serializable = this.f22907e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22907e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.a3
    public ByteString getSourceFileBytes() {
        Serializable serializable = this.f22907e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22907e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.a3
    public boolean hasBegin() {
        return (this.f22905b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.a3
    public boolean hasEnd() {
        return (this.f22905b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.a3
    public boolean hasSourceFile() {
        return (this.f22905b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.Z.ensureFieldAccessorsInitialized(z2.class, y2.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public y2 setBegin(int i10) {
        this.f22905b |= 4;
        this.f22908f = i10;
        onChanged();
        return this;
    }

    public y2 setEnd(int i10) {
        this.f22905b |= 8;
        this.f22909g = i10;
        onChanged();
        return this;
    }

    public y2 setPath(int i10, int i11) {
        c();
        ((l7) this.f22906c).setInt(i10, i11);
        onChanged();
        return this;
    }

    public y2 setSourceFile(String str) {
        str.getClass();
        this.f22905b |= 2;
        this.f22907e = str;
        onChanged();
        return this;
    }

    public y2 setSourceFileBytes(ByteString byteString) {
        byteString.getClass();
        this.f22905b |= 2;
        this.f22907e = byteString;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y2 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (y2) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public z2 build() {
        z2 z2VarBuildPartial = buildPartial();
        if (z2VarBuildPartial.isInitialized()) {
            return z2VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) z2VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public z2 buildPartial() {
        z2 z2Var = new z2(this);
        z2Var.f22943e = -1;
        z2Var.f22947i = (byte) -1;
        int i10 = this.f22905b;
        if ((i10 & 1) != 0) {
            ((e) this.f22906c).makeImmutable();
            this.f22905b &= -2;
        }
        z2Var.f22942c = this.f22906c;
        int i11 = (i10 & 2) != 0 ? 1 : 0;
        z2Var.f22944f = this.f22907e;
        if ((i10 & 4) != 0) {
            z2Var.f22945g = this.f22908f;
            i11 |= 2;
        }
        if ((i10 & 8) != 0) {
            z2Var.f22946h = this.f22909g;
            i11 |= 4;
        }
        z2Var.f22941b = i11;
        onBuilt();
        return z2Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y2 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (y2) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public z2 getDefaultInstanceForType() {
        return z2.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y2 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (y2) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y2 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (y2) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final y2 setUnknownFields(gc gcVar) {
        return (y2) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public y2 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (y2) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final y2 mergeUnknownFields(gc gcVar) {
        return (y2) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public y2 clear() {
        super.clear();
        this.f22906c = k7.emptyIntList();
        int i10 = this.f22905b;
        this.f22907e = "";
        this.f22908f = 0;
        this.f22909g = 0;
        this.f22905b = i10 & (-16);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public y2 mo500clone() {
        return (y2) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public y2 mergeFrom(Message message) {
        if (message instanceof z2) {
            return mergeFrom((z2) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public y2 mergeFrom(z2 z2Var) {
        if (z2Var == z2.getDefaultInstance()) {
            return this;
        }
        if (!z2Var.f22942c.isEmpty()) {
            if (this.f22906c.isEmpty()) {
                this.f22906c = z2Var.f22942c;
                this.f22905b &= -2;
            } else {
                c();
                this.f22906c.addAll(z2Var.f22942c);
            }
            onChanged();
        }
        if (z2Var.hasSourceFile()) {
            this.f22905b |= 2;
            this.f22907e = z2Var.f22944f;
            onChanged();
        }
        if (z2Var.hasBegin()) {
            setBegin(z2Var.getBegin());
        }
        if (z2Var.hasEnd()) {
            setEnd(z2Var.getEnd());
        }
        mergeUnknownFields(z2Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.y2 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.x2 r1 = com.explorestack.protobuf.z2.f22940k     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.z2 r3 = (com.explorestack.protobuf.z2) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.z2 r4 = (com.explorestack.protobuf.z2) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.y2.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.y2");
    }
}
