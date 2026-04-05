package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k4 extends o6 implements m4 {

    /* renamed from: b, reason: collision with root package name */
    public int f22301b;

    /* renamed from: c, reason: collision with root package name */
    public s7 f22302c;

    /* renamed from: e, reason: collision with root package name */
    public s7 f22303e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f22304f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f22305g;

    /* renamed from: h, reason: collision with root package name */
    public g8 f22306h;

    public k4() {
        super(null);
        this.f22302c = k7.emptyIntList();
        this.f22303e = k7.emptyIntList();
        this.f22304f = "";
        this.f22305g = "";
        this.f22306h = f8.f22138e;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.U;
    }

    public k4 addAllLeadingDetachedComments(Iterable<String> iterable) {
        c();
        b.a.addAll((Iterable) iterable, (List) this.f22306h);
        onChanged();
        return this;
    }

    public k4 addAllPath(Iterable<? extends Integer> iterable) {
        e();
        b.a.addAll((Iterable) iterable, (List) this.f22302c);
        onChanged();
        return this;
    }

    public k4 addAllSpan(Iterable<? extends Integer> iterable) {
        f();
        b.a.addAll((Iterable) iterable, (List) this.f22303e);
        onChanged();
        return this;
    }

    public k4 addLeadingDetachedComments(String str) {
        str.getClass();
        c();
        this.f22306h.add((g8) str);
        onChanged();
        return this;
    }

    public k4 addLeadingDetachedCommentsBytes(ByteString byteString) {
        byteString.getClass();
        c();
        this.f22306h.add(byteString);
        onChanged();
        return this;
    }

    public k4 addPath(int i10) {
        e();
        ((l7) this.f22302c).addInt(i10);
        onChanged();
        return this;
    }

    public k4 addSpan(int i10) {
        f();
        ((l7) this.f22303e).addInt(i10);
        onChanged();
        return this;
    }

    public final void c() {
        if ((this.f22301b & 16) == 0) {
            this.f22306h = new f8(this.f22306h);
            this.f22301b |= 16;
        }
    }

    public k4 clearLeadingComments() {
        this.f22301b &= -5;
        this.f22304f = l4.getDefaultInstance().getLeadingComments();
        onChanged();
        return this;
    }

    public k4 clearLeadingDetachedComments() {
        this.f22306h = f8.f22138e;
        this.f22301b &= -17;
        onChanged();
        return this;
    }

    public k4 clearPath() {
        this.f22302c = k7.emptyIntList();
        this.f22301b &= -2;
        onChanged();
        return this;
    }

    public k4 clearSpan() {
        this.f22303e = k7.emptyIntList();
        this.f22301b &= -3;
        onChanged();
        return this;
    }

    public k4 clearTrailingComments() {
        this.f22301b &= -9;
        this.f22305g = l4.getDefaultInstance().getTrailingComments();
        onChanged();
        return this;
    }

    public final void e() {
        if ((this.f22301b & 1) == 0) {
            this.f22302c = k7.mutableCopy(this.f22302c);
            this.f22301b |= 1;
        }
    }

    public final void f() {
        if ((this.f22301b & 2) == 0) {
            this.f22303e = k7.mutableCopy(this.f22303e);
            this.f22301b |= 2;
        }
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.U;
    }

    @Override // com.explorestack.protobuf.m4
    public String getLeadingComments() {
        Serializable serializable = this.f22304f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22304f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.m4
    public ByteString getLeadingCommentsBytes() {
        Serializable serializable = this.f22304f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22304f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.m4
    public String getLeadingDetachedComments(int i10) {
        return (String) this.f22306h.get(i10);
    }

    @Override // com.explorestack.protobuf.m4
    public ByteString getLeadingDetachedCommentsBytes(int i10) {
        return this.f22306h.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.m4
    public int getLeadingDetachedCommentsCount() {
        return this.f22306h.size();
    }

    @Override // com.explorestack.protobuf.m4
    public int getPath(int i10) {
        return ((l7) this.f22302c).getInt(i10);
    }

    @Override // com.explorestack.protobuf.m4
    public int getPathCount() {
        return this.f22302c.size();
    }

    @Override // com.explorestack.protobuf.m4
    public List<Integer> getPathList() {
        return (this.f22301b & 1) != 0 ? Collections.unmodifiableList(this.f22302c) : this.f22302c;
    }

    @Override // com.explorestack.protobuf.m4
    public int getSpan(int i10) {
        return ((l7) this.f22303e).getInt(i10);
    }

    @Override // com.explorestack.protobuf.m4
    public int getSpanCount() {
        return this.f22303e.size();
    }

    @Override // com.explorestack.protobuf.m4
    public List<Integer> getSpanList() {
        return (this.f22301b & 2) != 0 ? Collections.unmodifiableList(this.f22303e) : this.f22303e;
    }

    @Override // com.explorestack.protobuf.m4
    public String getTrailingComments() {
        Serializable serializable = this.f22305g;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22305g = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.m4
    public ByteString getTrailingCommentsBytes() {
        Serializable serializable = this.f22305g;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22305g = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.m4
    public boolean hasLeadingComments() {
        return (this.f22301b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.m4
    public boolean hasTrailingComments() {
        return (this.f22301b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.V.ensureFieldAccessorsInitialized(l4.class, k4.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public k4 setLeadingComments(String str) {
        str.getClass();
        this.f22301b |= 4;
        this.f22304f = str;
        onChanged();
        return this;
    }

    public k4 setLeadingCommentsBytes(ByteString byteString) {
        byteString.getClass();
        this.f22301b |= 4;
        this.f22304f = byteString;
        onChanged();
        return this;
    }

    public k4 setLeadingDetachedComments(int i10, String str) {
        str.getClass();
        c();
        this.f22306h.set(i10, (int) str);
        onChanged();
        return this;
    }

    public k4 setPath(int i10, int i11) {
        e();
        ((l7) this.f22302c).setInt(i10, i11);
        onChanged();
        return this;
    }

    public k4 setSpan(int i10, int i11) {
        f();
        ((l7) this.f22303e).setInt(i10, i11);
        onChanged();
        return this;
    }

    public k4 setTrailingComments(String str) {
        str.getClass();
        this.f22301b |= 8;
        this.f22305g = str;
        onChanged();
        return this;
    }

    public k4 setTrailingCommentsBytes(ByteString byteString) {
        byteString.getClass();
        this.f22301b |= 8;
        this.f22305g = byteString;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.m4
    public ka getLeadingDetachedCommentsList() {
        return this.f22306h.getUnmodifiableView();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public k4 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (k4) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public l4 build() {
        l4 l4VarBuildPartial = buildPartial();
        if (l4VarBuildPartial.isInitialized()) {
            return l4VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) l4VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public l4 buildPartial() {
        l4 l4Var = new l4(this);
        l4Var.f22339e = -1;
        l4Var.f22341g = -1;
        l4Var.f22345k = (byte) -1;
        int i10 = this.f22301b;
        if ((i10 & 1) != 0) {
            ((e) this.f22302c).makeImmutable();
            this.f22301b &= -2;
        }
        l4Var.f22338c = this.f22302c;
        if ((this.f22301b & 2) != 0) {
            ((e) this.f22303e).makeImmutable();
            this.f22301b &= -3;
        }
        l4Var.f22340f = this.f22303e;
        int i11 = (i10 & 4) != 0 ? 1 : 0;
        l4Var.f22342h = this.f22304f;
        if ((i10 & 8) != 0) {
            i11 |= 2;
        }
        l4Var.f22343i = this.f22305g;
        if ((this.f22301b & 16) != 0) {
            this.f22306h = this.f22306h.getUnmodifiableView();
            this.f22301b &= -17;
        }
        l4Var.f22344j = this.f22306h;
        l4Var.f22337b = i11;
        onBuilt();
        return l4Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public k4 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (k4) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public l4 getDefaultInstanceForType() {
        return l4.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public k4 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (k4) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public k4 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (k4) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final k4 setUnknownFields(gc gcVar) {
        return (k4) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public k4 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (k4) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final k4 mergeUnknownFields(gc gcVar) {
        return (k4) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public k4 clear() {
        super.clear();
        this.f22302c = k7.emptyIntList();
        this.f22301b &= -2;
        this.f22303e = k7.emptyIntList();
        int i10 = this.f22301b;
        this.f22304f = "";
        this.f22305g = "";
        this.f22301b = i10 & (-15);
        this.f22306h = f8.f22138e;
        this.f22301b = i10 & (-31);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public k4 mo500clone() {
        return (k4) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public k4 mergeFrom(Message message) {
        if (message instanceof l4) {
            return mergeFrom((l4) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public k4 mergeFrom(l4 l4Var) {
        if (l4Var == l4.getDefaultInstance()) {
            return this;
        }
        if (!l4Var.f22338c.isEmpty()) {
            if (this.f22302c.isEmpty()) {
                this.f22302c = l4Var.f22338c;
                this.f22301b &= -2;
            } else {
                e();
                this.f22302c.addAll(l4Var.f22338c);
            }
            onChanged();
        }
        if (!l4Var.f22340f.isEmpty()) {
            if (this.f22303e.isEmpty()) {
                this.f22303e = l4Var.f22340f;
                this.f22301b &= -3;
            } else {
                f();
                this.f22303e.addAll(l4Var.f22340f);
            }
            onChanged();
        }
        if (l4Var.hasLeadingComments()) {
            this.f22301b |= 4;
            this.f22304f = l4Var.f22342h;
            onChanged();
        }
        if (l4Var.hasTrailingComments()) {
            this.f22301b |= 8;
            this.f22305g = l4Var.f22343i;
            onChanged();
        }
        if (!l4Var.f22344j.isEmpty()) {
            if (this.f22306h.isEmpty()) {
                this.f22306h = l4Var.f22344j;
                this.f22301b &= -17;
            } else {
                c();
                this.f22306h.addAll(l4Var.f22344j);
            }
            onChanged();
        }
        mergeUnknownFields(l4Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.k4 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.j4 r1 = com.explorestack.protobuf.l4.f22336m     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.l4 r3 = (com.explorestack.protobuf.l4) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.l4 r4 = (com.explorestack.protobuf.l4) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.k4.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.k4");
    }
}
