package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i4 extends o6 implements o4 {

    /* renamed from: b, reason: collision with root package name */
    public int f22224b;

    /* renamed from: c, reason: collision with root package name */
    public List f22225c;

    /* renamed from: e, reason: collision with root package name */
    public pa f22226e;

    public i4() {
        super(null);
        this.f22225c = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            e();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.S;
    }

    public i4 addAllLocation(Iterable<? extends l4> iterable) {
        pa paVar = this.f22226e;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        c();
        b.a.addAll((Iterable) iterable, this.f22225c);
        onChanged();
        return this;
    }

    public i4 addLocation(l4 l4Var) {
        pa paVar = this.f22226e;
        if (paVar != null) {
            paVar.addMessage(l4Var);
            return this;
        }
        l4Var.getClass();
        c();
        this.f22225c.add(l4Var);
        onChanged();
        return this;
    }

    public k4 addLocationBuilder() {
        return (k4) e().addBuilder(l4.getDefaultInstance());
    }

    public final void c() {
        if ((this.f22224b & 1) == 0) {
            this.f22225c = new ArrayList(this.f22225c);
            this.f22224b |= 1;
        }
    }

    public i4 clearLocation() {
        pa paVar = this.f22226e;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22225c = Collections.EMPTY_LIST;
        this.f22224b &= -2;
        onChanged();
        return this;
    }

    public final pa e() {
        if (this.f22226e == null) {
            this.f22226e = new pa(this.f22225c, (this.f22224b & 1) != 0, getParentForChildren(), isClean());
            this.f22225c = null;
        }
        return this.f22226e;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.S;
    }

    @Override // com.explorestack.protobuf.o4
    public l4 getLocation(int i10) {
        pa paVar = this.f22226e;
        return paVar == null ? (l4) this.f22225c.get(i10) : (l4) paVar.getMessage(i10);
    }

    public k4 getLocationBuilder(int i10) {
        return (k4) e().getBuilder(i10);
    }

    public List<k4> getLocationBuilderList() {
        return e().getBuilderList();
    }

    @Override // com.explorestack.protobuf.o4
    public int getLocationCount() {
        pa paVar = this.f22226e;
        return paVar == null ? this.f22225c.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.o4
    public List<l4> getLocationList() {
        pa paVar = this.f22226e;
        return paVar == null ? Collections.unmodifiableList(this.f22225c) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.o4
    public m4 getLocationOrBuilder(int i10) {
        pa paVar = this.f22226e;
        return paVar == null ? (m4) this.f22225c.get(i10) : (m4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.o4
    public List<? extends m4> getLocationOrBuilderList() {
        pa paVar = this.f22226e;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22225c);
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.T.ensureFieldAccessorsInitialized(n4.class, i4.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public i4 removeLocation(int i10) {
        pa paVar = this.f22226e;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        c();
        this.f22225c.remove(i10);
        onChanged();
        return this;
    }

    public i4 setLocation(int i10, l4 l4Var) {
        pa paVar = this.f22226e;
        if (paVar != null) {
            paVar.setMessage(i10, l4Var);
            return this;
        }
        l4Var.getClass();
        c();
        this.f22225c.set(i10, l4Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public i4 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (i4) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public n4 build() {
        n4 n4VarBuildPartial = buildPartial();
        if (n4VarBuildPartial.isInitialized()) {
            return n4VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) n4VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public n4 buildPartial() {
        n4 n4Var = new n4(this);
        n4Var.f22402c = (byte) -1;
        int i10 = this.f22224b;
        pa paVar = this.f22226e;
        if (paVar == null) {
            if ((i10 & 1) != 0) {
                this.f22225c = Collections.unmodifiableList(this.f22225c);
                this.f22224b &= -2;
            }
            n4Var.f22401b = this.f22225c;
        } else {
            n4Var.f22401b = paVar.build();
        }
        onBuilt();
        return n4Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public i4 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (i4) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public n4 getDefaultInstanceForType() {
        return n4.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public i4 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (i4) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public i4 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (i4) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final i4 setUnknownFields(gc gcVar) {
        return (i4) super.setUnknownFields(gcVar);
    }

    public k4 addLocationBuilder(int i10) {
        return (k4) e().addBuilder(i10, l4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public i4 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (i4) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final i4 mergeUnknownFields(gc gcVar) {
        return (i4) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public i4 clear() {
        super.clear();
        pa paVar = this.f22226e;
        if (paVar == null) {
            this.f22225c = Collections.EMPTY_LIST;
            this.f22224b &= -2;
            return this;
        }
        paVar.clear();
        return this;
    }

    public i4 addLocation(int i10, l4 l4Var) {
        pa paVar = this.f22226e;
        if (paVar == null) {
            l4Var.getClass();
            c();
            this.f22225c.add(i10, l4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, l4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public i4 mo500clone() {
        return (i4) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public i4 mergeFrom(Message message) {
        if (message instanceof n4) {
            return mergeFrom((n4) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public i4 setLocation(int i10, k4 k4Var) {
        pa paVar = this.f22226e;
        if (paVar == null) {
            c();
            this.f22225c.set(i10, k4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, k4Var.build());
        return this;
    }

    public i4 mergeFrom(n4 n4Var) {
        if (n4Var == n4.getDefaultInstance()) {
            return this;
        }
        if (this.f22226e == null) {
            if (!n4Var.f22401b.isEmpty()) {
                if (this.f22225c.isEmpty()) {
                    this.f22225c = n4Var.f22401b;
                    this.f22224b &= -2;
                } else {
                    c();
                    this.f22225c.addAll(n4Var.f22401b);
                }
                onChanged();
            }
        } else if (!n4Var.f22401b.isEmpty()) {
            if (this.f22226e.isEmpty()) {
                this.f22226e.dispose();
                this.f22226e = null;
                this.f22225c = n4Var.f22401b;
                this.f22224b &= -2;
                this.f22226e = k7.alwaysUseFieldBuilders ? e() : null;
            } else {
                this.f22226e.addAllMessages(n4Var.f22401b);
            }
        }
        mergeUnknownFields(n4Var.unknownFields);
        onChanged();
        return this;
    }

    public i4 addLocation(k4 k4Var) {
        pa paVar = this.f22226e;
        if (paVar == null) {
            c();
            this.f22225c.add(k4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(k4Var.build());
        return this;
    }

    public i4 addLocation(int i10, k4 k4Var) {
        pa paVar = this.f22226e;
        if (paVar == null) {
            c();
            this.f22225c.add(i10, k4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, k4Var.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.i4 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.h4 r1 = com.explorestack.protobuf.n4.f22400f     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.n4 r3 = (com.explorestack.protobuf.n4) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.n4 r4 = (com.explorestack.protobuf.n4) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.i4.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.i4");
    }
}
