package rb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.pa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends o6 implements i {

    /* renamed from: b, reason: collision with root package name */
    public int f84074b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f84075c;

    /* renamed from: e, reason: collision with root package name */
    public long f84076e;

    /* renamed from: f, reason: collision with root package name */
    public List f84077f;

    /* renamed from: g, reason: collision with root package name */
    public pa f84078g;

    public b() {
        super(null);
        this.f84075c = "";
        this.f84077f = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            e();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return j.f84100a;
    }

    public b addAllFile(Iterable<? extends f> iterable) {
        pa paVar = this.f84078g;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        c();
        b.a.addAll((Iterable) iterable, this.f84077f);
        onChanged();
        return this;
    }

    public b addFile(f fVar) {
        pa paVar = this.f84078g;
        if (paVar != null) {
            paVar.addMessage(fVar);
            return this;
        }
        fVar.getClass();
        c();
        this.f84077f.add(fVar);
        onChanged();
        return this;
    }

    public e addFileBuilder() {
        return (e) e().addBuilder(f.getDefaultInstance());
    }

    public final void c() {
        if ((this.f84074b & 4) == 0) {
            this.f84077f = new ArrayList(this.f84077f);
            this.f84074b |= 4;
        }
    }

    public b clearError() {
        this.f84074b &= -2;
        this.f84075c = h.getDefaultInstance().getError();
        onChanged();
        return this;
    }

    public b clearFile() {
        pa paVar = this.f84078g;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f84077f = Collections.EMPTY_LIST;
        this.f84074b &= -5;
        onChanged();
        return this;
    }

    public b clearSupportedFeatures() {
        this.f84074b &= -3;
        this.f84076e = 0L;
        onChanged();
        return this;
    }

    public final pa e() {
        if (this.f84078g == null) {
            this.f84078g = new pa(this.f84077f, (this.f84074b & 4) != 0, getParentForChildren(), isClean());
            this.f84077f = null;
        }
        return this.f84078g;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return j.f84100a;
    }

    @Override // rb.i
    public String getError() {
        Serializable serializable = this.f84075c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f84075c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // rb.i
    public ByteString getErrorBytes() {
        Serializable serializable = this.f84075c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f84075c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // rb.i
    public f getFile(int i10) {
        pa paVar = this.f84078g;
        return paVar == null ? (f) this.f84077f.get(i10) : (f) paVar.getMessage(i10);
    }

    public e getFileBuilder(int i10) {
        return (e) e().getBuilder(i10);
    }

    public List<e> getFileBuilderList() {
        return e().getBuilderList();
    }

    @Override // rb.i
    public int getFileCount() {
        pa paVar = this.f84078g;
        return paVar == null ? this.f84077f.size() : paVar.getCount();
    }

    @Override // rb.i
    public List<f> getFileList() {
        pa paVar = this.f84078g;
        return paVar == null ? Collections.unmodifiableList(this.f84077f) : paVar.getMessageList();
    }

    @Override // rb.i
    public g getFileOrBuilder(int i10) {
        pa paVar = this.f84078g;
        return paVar == null ? (g) this.f84077f.get(i10) : (g) paVar.getMessageOrBuilder(i10);
    }

    @Override // rb.i
    public List<? extends g> getFileOrBuilderList() {
        pa paVar = this.f84078g;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f84077f);
    }

    @Override // rb.i
    public long getSupportedFeatures() {
        return this.f84076e;
    }

    @Override // rb.i
    public boolean hasError() {
        return (this.f84074b & 1) != 0;
    }

    @Override // rb.i
    public boolean hasSupportedFeatures() {
        return (this.f84074b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return j.f84101b.ensureFieldAccessorsInitialized(h.class, b.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public b removeFile(int i10) {
        pa paVar = this.f84078g;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        c();
        this.f84077f.remove(i10);
        onChanged();
        return this;
    }

    public b setError(String str) {
        str.getClass();
        this.f84074b |= 1;
        this.f84075c = str;
        onChanged();
        return this;
    }

    public b setErrorBytes(ByteString byteString) {
        byteString.getClass();
        this.f84074b |= 1;
        this.f84075c = byteString;
        onChanged();
        return this;
    }

    public b setFile(int i10, f fVar) {
        pa paVar = this.f84078g;
        if (paVar != null) {
            paVar.setMessage(i10, fVar);
            return this;
        }
        fVar.getClass();
        c();
        this.f84077f.set(i10, fVar);
        onChanged();
        return this;
    }

    public b setSupportedFeatures(long j10) {
        this.f84074b |= 2;
        this.f84076e = j10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (b) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public h build() {
        h hVarBuildPartial = buildPartial();
        if (hVarBuildPartial.isInitialized()) {
            return hVarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) hVarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public h buildPartial() {
        h hVar = new h(this);
        hVar.f84099g = (byte) -1;
        int i10 = this.f84074b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        hVar.f84096c = this.f84075c;
        if ((i10 & 2) != 0) {
            hVar.f84097e = this.f84076e;
            i11 |= 2;
        }
        pa paVar = this.f84078g;
        if (paVar == null) {
            if ((this.f84074b & 4) != 0) {
                this.f84077f = Collections.unmodifiableList(this.f84077f);
                this.f84074b &= -5;
            }
            hVar.f84098f = this.f84077f;
        } else {
            hVar.f84098f = paVar.build();
        }
        hVar.f84095b = i11;
        onBuilt();
        return hVar;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (b) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public h getDefaultInstanceForType() {
        return h.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (b) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (b) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final b setUnknownFields(gc gcVar) {
        return (b) super.setUnknownFields(gcVar);
    }

    public e addFileBuilder(int i10) {
        return (e) e().addBuilder(i10, f.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (b) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final b mergeUnknownFields(gc gcVar) {
        return (b) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public b clear() {
        super.clear();
        this.f84075c = "";
        int i10 = this.f84074b;
        this.f84076e = 0L;
        this.f84074b = i10 & (-4);
        pa paVar = this.f84078g;
        if (paVar == null) {
            this.f84077f = Collections.EMPTY_LIST;
            this.f84074b = i10 & (-8);
            return this;
        }
        paVar.clear();
        return this;
    }

    public b addFile(int i10, f fVar) {
        pa paVar = this.f84078g;
        if (paVar == null) {
            fVar.getClass();
            c();
            this.f84077f.add(i10, fVar);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, fVar);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public b mo500clone() {
        return (b) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public b mergeFrom(Message message) {
        if (message instanceof h) {
            return mergeFrom((h) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public b setFile(int i10, e eVar) {
        pa paVar = this.f84078g;
        if (paVar == null) {
            c();
            this.f84077f.set(i10, eVar.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, eVar.build());
        return this;
    }

    public b mergeFrom(h hVar) {
        if (hVar == h.getDefaultInstance()) {
            return this;
        }
        if (hVar.hasError()) {
            this.f84074b |= 1;
            this.f84075c = hVar.f84096c;
            onChanged();
        }
        if (hVar.hasSupportedFeatures()) {
            setSupportedFeatures(hVar.getSupportedFeatures());
        }
        if (this.f84078g == null) {
            if (!hVar.f84098f.isEmpty()) {
                if (this.f84077f.isEmpty()) {
                    this.f84077f = hVar.f84098f;
                    this.f84074b &= -5;
                } else {
                    c();
                    this.f84077f.addAll(hVar.f84098f);
                }
                onChanged();
            }
        } else if (!hVar.f84098f.isEmpty()) {
            if (this.f84078g.isEmpty()) {
                this.f84078g.dispose();
                this.f84078g = null;
                this.f84077f = hVar.f84098f;
                this.f84074b &= -5;
                this.f84078g = k7.alwaysUseFieldBuilders ? e() : null;
            } else {
                this.f84078g.addAllMessages(hVar.f84098f);
            }
        }
        mergeUnknownFields(((k7) hVar).unknownFields);
        onChanged();
        return this;
    }

    public b addFile(e eVar) {
        pa paVar = this.f84078g;
        if (paVar == null) {
            c();
            this.f84077f.add(eVar.build());
            onChanged();
            return this;
        }
        paVar.addMessage(eVar.build());
        return this;
    }

    public b addFile(int i10, e eVar) {
        pa paVar = this.f84078g;
        if (paVar == null) {
            c();
            this.f84077f.add(i10, eVar.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, eVar.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rb.b mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            rb.a r1 = rb.h.f84094i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            rb.h r3 = (rb.h) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            rb.h r4 = (rb.h) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: rb.b.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):rb.b");
    }
}
