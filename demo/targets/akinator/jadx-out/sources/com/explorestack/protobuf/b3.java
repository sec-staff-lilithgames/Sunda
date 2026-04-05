package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b3 extends o6 implements d3 {

    /* renamed from: b, reason: collision with root package name */
    public int f21928b;

    /* renamed from: c, reason: collision with root package name */
    public List f21929c;

    /* renamed from: e, reason: collision with root package name */
    public pa f21930e;

    public b3() {
        super(null);
        this.f21929c = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            e();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.W;
    }

    public b3 addAllAnnotation(Iterable<? extends z2> iterable) {
        pa paVar = this.f21930e;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        c();
        b.a.addAll((Iterable) iterable, this.f21929c);
        onChanged();
        return this;
    }

    public b3 addAnnotation(z2 z2Var) {
        pa paVar = this.f21930e;
        if (paVar != null) {
            paVar.addMessage(z2Var);
            return this;
        }
        z2Var.getClass();
        c();
        this.f21929c.add(z2Var);
        onChanged();
        return this;
    }

    public y2 addAnnotationBuilder() {
        return (y2) e().addBuilder(z2.getDefaultInstance());
    }

    public final void c() {
        if ((this.f21928b & 1) == 0) {
            this.f21929c = new ArrayList(this.f21929c);
            this.f21928b |= 1;
        }
    }

    public b3 clearAnnotation() {
        pa paVar = this.f21930e;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f21929c = Collections.EMPTY_LIST;
        this.f21928b &= -2;
        onChanged();
        return this;
    }

    public final pa e() {
        if (this.f21930e == null) {
            this.f21930e = new pa(this.f21929c, (this.f21928b & 1) != 0, getParentForChildren(), isClean());
            this.f21929c = null;
        }
        return this.f21930e;
    }

    @Override // com.explorestack.protobuf.d3
    public z2 getAnnotation(int i10) {
        pa paVar = this.f21930e;
        return paVar == null ? (z2) this.f21929c.get(i10) : (z2) paVar.getMessage(i10);
    }

    public y2 getAnnotationBuilder(int i10) {
        return (y2) e().getBuilder(i10);
    }

    public List<y2> getAnnotationBuilderList() {
        return e().getBuilderList();
    }

    @Override // com.explorestack.protobuf.d3
    public int getAnnotationCount() {
        pa paVar = this.f21930e;
        return paVar == null ? this.f21929c.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.d3
    public List<z2> getAnnotationList() {
        pa paVar = this.f21930e;
        return paVar == null ? Collections.unmodifiableList(this.f21929c) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.d3
    public a3 getAnnotationOrBuilder(int i10) {
        pa paVar = this.f21930e;
        return paVar == null ? (a3) this.f21929c.get(i10) : (a3) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.d3
    public List<? extends a3> getAnnotationOrBuilderList() {
        pa paVar = this.f21930e;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f21929c);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.W;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.X.ensureFieldAccessorsInitialized(c3.class, b3.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public b3 removeAnnotation(int i10) {
        pa paVar = this.f21930e;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        c();
        this.f21929c.remove(i10);
        onChanged();
        return this;
    }

    public b3 setAnnotation(int i10, z2 z2Var) {
        pa paVar = this.f21930e;
        if (paVar != null) {
            paVar.setMessage(i10, z2Var);
            return this;
        }
        z2Var.getClass();
        c();
        this.f21929c.set(i10, z2Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public b3 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (b3) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public c3 build() {
        c3 c3VarBuildPartial = buildPartial();
        if (c3VarBuildPartial.isInitialized()) {
            return c3VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) c3VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public c3 buildPartial() {
        c3 c3Var = new c3(this);
        c3Var.f21981c = (byte) -1;
        int i10 = this.f21928b;
        pa paVar = this.f21930e;
        if (paVar == null) {
            if ((i10 & 1) != 0) {
                this.f21929c = Collections.unmodifiableList(this.f21929c);
                this.f21928b &= -2;
            }
            c3Var.f21980b = this.f21929c;
        } else {
            c3Var.f21980b = paVar.build();
        }
        onBuilt();
        return c3Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public b3 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (b3) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public c3 getDefaultInstanceForType() {
        return c3.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public b3 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (b3) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public b3 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (b3) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final b3 setUnknownFields(gc gcVar) {
        return (b3) super.setUnknownFields(gcVar);
    }

    public y2 addAnnotationBuilder(int i10) {
        return (y2) e().addBuilder(i10, z2.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public b3 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (b3) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final b3 mergeUnknownFields(gc gcVar) {
        return (b3) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public b3 clear() {
        super.clear();
        pa paVar = this.f21930e;
        if (paVar == null) {
            this.f21929c = Collections.EMPTY_LIST;
            this.f21928b &= -2;
            return this;
        }
        paVar.clear();
        return this;
    }

    public b3 addAnnotation(int i10, z2 z2Var) {
        pa paVar = this.f21930e;
        if (paVar == null) {
            z2Var.getClass();
            c();
            this.f21929c.add(i10, z2Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, z2Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public b3 mo500clone() {
        return (b3) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public b3 mergeFrom(Message message) {
        if (message instanceof c3) {
            return mergeFrom((c3) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public b3 setAnnotation(int i10, y2 y2Var) {
        pa paVar = this.f21930e;
        if (paVar == null) {
            c();
            this.f21929c.set(i10, y2Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, y2Var.build());
        return this;
    }

    public b3 mergeFrom(c3 c3Var) {
        if (c3Var == c3.getDefaultInstance()) {
            return this;
        }
        if (this.f21930e == null) {
            if (!c3Var.f21980b.isEmpty()) {
                if (this.f21929c.isEmpty()) {
                    this.f21929c = c3Var.f21980b;
                    this.f21928b &= -2;
                } else {
                    c();
                    this.f21929c.addAll(c3Var.f21980b);
                }
                onChanged();
            }
        } else if (!c3Var.f21980b.isEmpty()) {
            if (this.f21930e.isEmpty()) {
                this.f21930e.dispose();
                this.f21930e = null;
                this.f21929c = c3Var.f21980b;
                this.f21928b &= -2;
                this.f21930e = k7.alwaysUseFieldBuilders ? e() : null;
            } else {
                this.f21930e.addAllMessages(c3Var.f21980b);
            }
        }
        mergeUnknownFields(c3Var.unknownFields);
        onChanged();
        return this;
    }

    public b3 addAnnotation(y2 y2Var) {
        pa paVar = this.f21930e;
        if (paVar == null) {
            c();
            this.f21929c.add(y2Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(y2Var.build());
        return this;
    }

    public b3 addAnnotation(int i10, y2 y2Var) {
        pa paVar = this.f21930e;
        if (paVar == null) {
            c();
            this.f21929c.add(i10, y2Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, y2Var.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.b3 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.w2 r1 = com.explorestack.protobuf.c3.f21979f     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.c3 r3 = (com.explorestack.protobuf.c3) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.c3 r4 = (com.explorestack.protobuf.c3) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.b3.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.b3");
    }
}
