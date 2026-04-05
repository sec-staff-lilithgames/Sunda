package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a4 extends o6 implements c4 {

    /* renamed from: b, reason: collision with root package name */
    public int f21841b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f21842c;

    /* renamed from: e, reason: collision with root package name */
    public List f21843e;

    /* renamed from: f, reason: collision with root package name */
    public pa f21844f;

    /* renamed from: g, reason: collision with root package name */
    public f4 f21845g;

    /* renamed from: h, reason: collision with root package name */
    public xa f21846h;

    public a4() {
        super(null);
        this.f21842c = "";
        this.f21843e = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            c();
            if (this.f21846h == null) {
                this.f21846h = new xa(getOptions(), getParentForChildren(), isClean());
                this.f21845g = null;
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22854u;
    }

    public a4 addAllMethod(Iterable<? extends k3> iterable) {
        pa paVar = this.f21844f;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        ensureMethodIsMutable();
        b.a.addAll((Iterable) iterable, this.f21843e);
        onChanged();
        return this;
    }

    public a4 addMethod(k3 k3Var) {
        pa paVar = this.f21844f;
        if (paVar != null) {
            paVar.addMessage(k3Var);
            return this;
        }
        k3Var.getClass();
        ensureMethodIsMutable();
        this.f21843e.add(k3Var);
        onChanged();
        return this;
    }

    public j3 addMethodBuilder() {
        return (j3) c().addBuilder(k3.getDefaultInstance());
    }

    public final pa c() {
        if (this.f21844f == null) {
            this.f21844f = new pa(this.f21843e, (this.f21841b & 2) != 0, getParentForChildren(), isClean());
            this.f21843e = null;
        }
        return this.f21844f;
    }

    public a4 clearMethod() {
        pa paVar = this.f21844f;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f21843e = Collections.EMPTY_LIST;
        this.f21841b &= -3;
        onChanged();
        return this;
    }

    public a4 clearName() {
        this.f21841b &= -2;
        this.f21842c = b4.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public a4 clearOptions() {
        xa xaVar = this.f21846h;
        if (xaVar == null) {
            this.f21845g = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f21841b &= -5;
        return this;
    }

    public final void ensureMethodIsMutable() {
        if ((this.f21841b & 2) == 0) {
            this.f21843e = new ArrayList(this.f21843e);
            this.f21841b |= 2;
        }
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22854u;
    }

    @Override // com.explorestack.protobuf.c4
    public k3 getMethod(int i10) {
        pa paVar = this.f21844f;
        return paVar == null ? (k3) this.f21843e.get(i10) : (k3) paVar.getMessage(i10);
    }

    public j3 getMethodBuilder(int i10) {
        return (j3) c().getBuilder(i10);
    }

    public List<j3> getMethodBuilderList() {
        return c().getBuilderList();
    }

    @Override // com.explorestack.protobuf.c4
    public int getMethodCount() {
        pa paVar = this.f21844f;
        return paVar == null ? this.f21843e.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.c4
    public List<k3> getMethodList() {
        pa paVar = this.f21844f;
        return paVar == null ? Collections.unmodifiableList(this.f21843e) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.c4
    public l3 getMethodOrBuilder(int i10) {
        pa paVar = this.f21844f;
        return paVar == null ? (l3) this.f21843e.get(i10) : (l3) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.c4
    public List<? extends l3> getMethodOrBuilderList() {
        pa paVar = this.f21844f;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f21843e);
    }

    @Override // com.explorestack.protobuf.c4
    public String getName() {
        Serializable serializable = this.f21842c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f21842c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.c4
    public ByteString getNameBytes() {
        Serializable serializable = this.f21842c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f21842c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.c4
    public f4 getOptions() {
        xa xaVar = this.f21846h;
        if (xaVar != null) {
            return (f4) xaVar.getMessage();
        }
        f4 f4Var = this.f21845g;
        return f4Var == null ? f4.getDefaultInstance() : f4Var;
    }

    public e4 getOptionsBuilder() {
        this.f21841b |= 4;
        onChanged();
        if (this.f21846h == null) {
            this.f21846h = new xa(getOptions(), getParentForChildren(), isClean());
            this.f21845g = null;
        }
        return (e4) this.f21846h.getBuilder();
    }

    @Override // com.explorestack.protobuf.c4
    public g4 getOptionsOrBuilder() {
        xa xaVar = this.f21846h;
        if (xaVar != null) {
            return (g4) xaVar.getMessageOrBuilder();
        }
        f4 f4Var = this.f21845g;
        return f4Var == null ? f4.getDefaultInstance() : f4Var;
    }

    @Override // com.explorestack.protobuf.c4
    public boolean hasName() {
        return (this.f21841b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.c4
    public boolean hasOptions() {
        return (this.f21841b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22855v.ensureFieldAccessorsInitialized(b4.class, a4.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        for (int i10 = 0; i10 < getMethodCount(); i10++) {
            if (!getMethod(i10).isInitialized()) {
                return false;
            }
        }
        return !hasOptions() || getOptions().isInitialized();
    }

    public a4 mergeOptions(f4 f4Var) {
        f4 f4Var2;
        xa xaVar = this.f21846h;
        if (xaVar == null) {
            if ((this.f21841b & 4) == 0 || (f4Var2 = this.f21845g) == null || f4Var2 == f4.getDefaultInstance()) {
                this.f21845g = f4Var;
            } else {
                this.f21845g = f4.newBuilder(this.f21845g).mergeFrom(f4Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(f4Var);
        }
        this.f21841b |= 4;
        return this;
    }

    public a4 removeMethod(int i10) {
        pa paVar = this.f21844f;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        ensureMethodIsMutable();
        this.f21843e.remove(i10);
        onChanged();
        return this;
    }

    public a4 setMethod(int i10, k3 k3Var) {
        pa paVar = this.f21844f;
        if (paVar != null) {
            paVar.setMessage(i10, k3Var);
            return this;
        }
        k3Var.getClass();
        ensureMethodIsMutable();
        this.f21843e.set(i10, k3Var);
        onChanged();
        return this;
    }

    public a4 setName(String str) {
        str.getClass();
        this.f21841b |= 1;
        this.f21842c = str;
        onChanged();
        return this;
    }

    public a4 setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f21841b |= 1;
        this.f21842c = byteString;
        onChanged();
        return this;
    }

    public a4 setOptions(f4 f4Var) {
        xa xaVar = this.f21846h;
        if (xaVar == null) {
            f4Var.getClass();
            this.f21845g = f4Var;
            onChanged();
        } else {
            xaVar.setMessage(f4Var);
        }
        this.f21841b |= 4;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public a4 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (a4) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public b4 build() {
        b4 b4VarBuildPartial = buildPartial();
        if (b4VarBuildPartial.isInitialized()) {
            return b4VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) b4VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public b4 buildPartial() {
        b4 b4Var = new b4(this);
        b4Var.f21937g = (byte) -1;
        int i10 = this.f21841b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        b4Var.f21934c = this.f21842c;
        pa paVar = this.f21844f;
        if (paVar == null) {
            if ((this.f21841b & 2) != 0) {
                this.f21843e = Collections.unmodifiableList(this.f21843e);
                this.f21841b &= -3;
            }
            b4Var.f21935e = this.f21843e;
        } else {
            b4Var.f21935e = paVar.build();
        }
        if ((i10 & 4) != 0) {
            xa xaVar = this.f21846h;
            if (xaVar == null) {
                b4Var.f21936f = this.f21845g;
            } else {
                b4Var.f21936f = (f4) xaVar.build();
            }
            i11 |= 2;
        }
        b4Var.f21933b = i11;
        onBuilt();
        return b4Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public a4 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (a4) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public b4 getDefaultInstanceForType() {
        return b4.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public a4 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (a4) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public a4 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (a4) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final a4 setUnknownFields(gc gcVar) {
        return (a4) super.setUnknownFields(gcVar);
    }

    public j3 addMethodBuilder(int i10) {
        return (j3) c().addBuilder(i10, k3.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public a4 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (a4) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final a4 mergeUnknownFields(gc gcVar) {
        return (a4) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public a4 clear() {
        super.clear();
        this.f21842c = "";
        int i10 = this.f21841b;
        this.f21841b = i10 & (-2);
        pa paVar = this.f21844f;
        if (paVar == null) {
            this.f21843e = Collections.EMPTY_LIST;
            this.f21841b = i10 & (-4);
        } else {
            paVar.clear();
        }
        xa xaVar = this.f21846h;
        if (xaVar == null) {
            this.f21845g = null;
        } else {
            xaVar.clear();
        }
        this.f21841b &= -5;
        return this;
    }

    public a4 addMethod(int i10, k3 k3Var) {
        pa paVar = this.f21844f;
        if (paVar == null) {
            k3Var.getClass();
            ensureMethodIsMutable();
            this.f21843e.add(i10, k3Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, k3Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public a4 mo500clone() {
        return (a4) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public a4 mergeFrom(Message message) {
        if (message instanceof b4) {
            return mergeFrom((b4) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public a4 setMethod(int i10, j3 j3Var) {
        pa paVar = this.f21844f;
        if (paVar == null) {
            ensureMethodIsMutable();
            this.f21843e.set(i10, j3Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, j3Var.build());
        return this;
    }

    public a4 setOptions(e4 e4Var) {
        xa xaVar = this.f21846h;
        if (xaVar == null) {
            this.f21845g = e4Var.build();
            onChanged();
        } else {
            xaVar.setMessage(e4Var.build());
        }
        this.f21841b |= 4;
        return this;
    }

    public a4 mergeFrom(b4 b4Var) {
        if (b4Var == b4.getDefaultInstance()) {
            return this;
        }
        if (b4Var.hasName()) {
            this.f21841b |= 1;
            this.f21842c = b4Var.f21934c;
            onChanged();
        }
        if (this.f21844f == null) {
            if (!b4Var.f21935e.isEmpty()) {
                if (this.f21843e.isEmpty()) {
                    this.f21843e = b4Var.f21935e;
                    this.f21841b &= -3;
                } else {
                    ensureMethodIsMutable();
                    this.f21843e.addAll(b4Var.f21935e);
                }
                onChanged();
            }
        } else if (!b4Var.f21935e.isEmpty()) {
            if (this.f21844f.isEmpty()) {
                this.f21844f.dispose();
                this.f21844f = null;
                this.f21843e = b4Var.f21935e;
                this.f21841b &= -3;
                this.f21844f = k7.alwaysUseFieldBuilders ? c() : null;
            } else {
                this.f21844f.addAllMessages(b4Var.f21935e);
            }
        }
        if (b4Var.hasOptions()) {
            mergeOptions(b4Var.getOptions());
        }
        mergeUnknownFields(b4Var.unknownFields);
        onChanged();
        return this;
    }

    public a4 addMethod(j3 j3Var) {
        pa paVar = this.f21844f;
        if (paVar == null) {
            ensureMethodIsMutable();
            this.f21843e.add(j3Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(j3Var.build());
        return this;
    }

    public a4 addMethod(int i10, j3 j3Var) {
        pa paVar = this.f21844f;
        if (paVar == null) {
            ensureMethodIsMutable();
            this.f21843e.add(i10, j3Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, j3Var.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.a4 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.z3 r1 = com.explorestack.protobuf.b4.f21932i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.b4 r3 = (com.explorestack.protobuf.b4) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.b4 r4 = (com.explorestack.protobuf.b4) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.a4.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.a4");
    }
}
