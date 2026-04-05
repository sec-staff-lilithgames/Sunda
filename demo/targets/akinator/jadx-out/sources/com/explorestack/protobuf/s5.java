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
public final class s5 extends o6 implements y5 {

    /* renamed from: b, reason: collision with root package name */
    public int f22613b;

    /* renamed from: c, reason: collision with root package name */
    public int f22614c;

    /* renamed from: e, reason: collision with root package name */
    public int f22615e;

    /* renamed from: f, reason: collision with root package name */
    public int f22616f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f22617g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f22618h;

    /* renamed from: i, reason: collision with root package name */
    public int f22619i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22620j;

    /* renamed from: k, reason: collision with root package name */
    public List f22621k;

    /* renamed from: l, reason: collision with root package name */
    public pa f22622l;

    /* renamed from: m, reason: collision with root package name */
    public Serializable f22623m;

    /* renamed from: n, reason: collision with root package name */
    public Serializable f22624n;

    public s5() {
        super(null);
        this.f22614c = 0;
        this.f22615e = 0;
        this.f22617g = "";
        this.f22618h = "";
        this.f22621k = Collections.EMPTY_LIST;
        this.f22623m = "";
        this.f22624n = "";
        if (k7.alwaysUseFieldBuilders) {
            e();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ub.f22723a;
    }

    public s5 addAllOptions(Iterable<? extends da> iterable) {
        pa paVar = this.f22622l;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        c();
        b.a.addAll((Iterable) iterable, this.f22621k);
        onChanged();
        return this;
    }

    public s5 addOptions(da daVar) {
        pa paVar = this.f22622l;
        if (paVar != null) {
            paVar.addMessage(daVar);
            return this;
        }
        daVar.getClass();
        c();
        this.f22621k.add(daVar);
        onChanged();
        return this;
    }

    public ca addOptionsBuilder() {
        return (ca) e().addBuilder(da.getDefaultInstance());
    }

    public final void c() {
        if ((this.f22613b & 1) == 0) {
            this.f22621k = new ArrayList(this.f22621k);
            this.f22613b |= 1;
        }
    }

    public s5 clearCardinality() {
        this.f22615e = 0;
        onChanged();
        return this;
    }

    public s5 clearDefaultValue() {
        this.f22624n = v5.getDefaultInstance().getDefaultValue();
        onChanged();
        return this;
    }

    public s5 clearJsonName() {
        this.f22623m = v5.getDefaultInstance().getJsonName();
        onChanged();
        return this;
    }

    public s5 clearKind() {
        this.f22614c = 0;
        onChanged();
        return this;
    }

    public s5 clearName() {
        this.f22617g = v5.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public s5 clearNumber() {
        this.f22616f = 0;
        onChanged();
        return this;
    }

    public s5 clearOneofIndex() {
        this.f22619i = 0;
        onChanged();
        return this;
    }

    public s5 clearOptions() {
        pa paVar = this.f22622l;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22621k = Collections.EMPTY_LIST;
        this.f22613b &= -2;
        onChanged();
        return this;
    }

    public s5 clearPacked() {
        this.f22620j = false;
        onChanged();
        return this;
    }

    public s5 clearTypeUrl() {
        this.f22618h = v5.getDefaultInstance().getTypeUrl();
        onChanged();
        return this;
    }

    public final pa e() {
        if (this.f22622l == null) {
            this.f22622l = new pa(this.f22621k, (this.f22613b & 1) != 0, getParentForChildren(), isClean());
            this.f22621k = null;
        }
        return this.f22622l;
    }

    @Override // com.explorestack.protobuf.y5
    public Field$Cardinality getCardinality() {
        Field$Cardinality field$CardinalityValueOf = Field$Cardinality.valueOf(this.f22615e);
        return field$CardinalityValueOf == null ? Field$Cardinality.UNRECOGNIZED : field$CardinalityValueOf;
    }

    @Override // com.explorestack.protobuf.y5
    public int getCardinalityValue() {
        return this.f22615e;
    }

    @Override // com.explorestack.protobuf.y5
    public String getDefaultValue() {
        Serializable serializable = this.f22624n;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22624n = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public ByteString getDefaultValueBytes() {
        Serializable serializable = this.f22624n;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22624n = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return ub.f22723a;
    }

    @Override // com.explorestack.protobuf.y5
    public String getJsonName() {
        Serializable serializable = this.f22623m;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22623m = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public ByteString getJsonNameBytes() {
        Serializable serializable = this.f22623m;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22623m = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public Field$Kind getKind() {
        Field$Kind field$KindValueOf = Field$Kind.valueOf(this.f22614c);
        return field$KindValueOf == null ? Field$Kind.UNRECOGNIZED : field$KindValueOf;
    }

    @Override // com.explorestack.protobuf.y5
    public int getKindValue() {
        return this.f22614c;
    }

    @Override // com.explorestack.protobuf.y5
    public String getName() {
        Serializable serializable = this.f22617g;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22617g = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public ByteString getNameBytes() {
        Serializable serializable = this.f22617g;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22617g = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public int getNumber() {
        return this.f22616f;
    }

    @Override // com.explorestack.protobuf.y5
    public int getOneofIndex() {
        return this.f22619i;
    }

    @Override // com.explorestack.protobuf.y5
    public da getOptions(int i10) {
        pa paVar = this.f22622l;
        return paVar == null ? (da) this.f22621k.get(i10) : (da) paVar.getMessage(i10);
    }

    public ca getOptionsBuilder(int i10) {
        return (ca) e().getBuilder(i10);
    }

    public List<ca> getOptionsBuilderList() {
        return e().getBuilderList();
    }

    @Override // com.explorestack.protobuf.y5
    public int getOptionsCount() {
        pa paVar = this.f22622l;
        return paVar == null ? this.f22621k.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.y5
    public List<da> getOptionsList() {
        pa paVar = this.f22622l;
        return paVar == null ? Collections.unmodifiableList(this.f22621k) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.y5
    public ea getOptionsOrBuilder(int i10) {
        pa paVar = this.f22622l;
        return paVar == null ? (ea) this.f22621k.get(i10) : (ea) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.y5
    public List<? extends ea> getOptionsOrBuilderList() {
        pa paVar = this.f22622l;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22621k);
    }

    @Override // com.explorestack.protobuf.y5
    public boolean getPacked() {
        return this.f22620j;
    }

    @Override // com.explorestack.protobuf.y5
    public String getTypeUrl() {
        Serializable serializable = this.f22618h;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22618h = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public ByteString getTypeUrlBytes() {
        Serializable serializable = this.f22618h;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22618h = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return ub.f22724b.ensureFieldAccessorsInitialized(v5.class, s5.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.s5 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.r5 r1 = com.explorestack.protobuf.v5.f22768o     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.v5 r3 = (com.explorestack.protobuf.v5) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.v5 r4 = (com.explorestack.protobuf.v5) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.s5.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.s5");
    }

    public s5 removeOptions(int i10) {
        pa paVar = this.f22622l;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        c();
        this.f22621k.remove(i10);
        onChanged();
        return this;
    }

    public s5 setCardinality(Field$Cardinality field$Cardinality) {
        field$Cardinality.getClass();
        this.f22615e = field$Cardinality.getNumber();
        onChanged();
        return this;
    }

    public s5 setCardinalityValue(int i10) {
        this.f22615e = i10;
        onChanged();
        return this;
    }

    public s5 setDefaultValue(String str) {
        str.getClass();
        this.f22624n = str;
        onChanged();
        return this;
    }

    public s5 setDefaultValueBytes(ByteString byteString) throws IllegalArgumentException {
        byteString.getClass();
        b.checkByteStringIsUtf8(byteString);
        this.f22624n = byteString;
        onChanged();
        return this;
    }

    public s5 setJsonName(String str) {
        str.getClass();
        this.f22623m = str;
        onChanged();
        return this;
    }

    public s5 setJsonNameBytes(ByteString byteString) throws IllegalArgumentException {
        byteString.getClass();
        b.checkByteStringIsUtf8(byteString);
        this.f22623m = byteString;
        onChanged();
        return this;
    }

    public s5 setKind(Field$Kind field$Kind) {
        field$Kind.getClass();
        this.f22614c = field$Kind.getNumber();
        onChanged();
        return this;
    }

    public s5 setKindValue(int i10) {
        this.f22614c = i10;
        onChanged();
        return this;
    }

    public s5 setName(String str) {
        str.getClass();
        this.f22617g = str;
        onChanged();
        return this;
    }

    public s5 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        byteString.getClass();
        b.checkByteStringIsUtf8(byteString);
        this.f22617g = byteString;
        onChanged();
        return this;
    }

    public s5 setNumber(int i10) {
        this.f22616f = i10;
        onChanged();
        return this;
    }

    public s5 setOneofIndex(int i10) {
        this.f22619i = i10;
        onChanged();
        return this;
    }

    public s5 setOptions(int i10, da daVar) {
        pa paVar = this.f22622l;
        if (paVar != null) {
            paVar.setMessage(i10, daVar);
            return this;
        }
        daVar.getClass();
        c();
        this.f22621k.set(i10, daVar);
        onChanged();
        return this;
    }

    public s5 setPacked(boolean z10) {
        this.f22620j = z10;
        onChanged();
        return this;
    }

    public s5 setTypeUrl(String str) {
        str.getClass();
        this.f22618h = str;
        onChanged();
        return this;
    }

    public s5 setTypeUrlBytes(ByteString byteString) throws IllegalArgumentException {
        byteString.getClass();
        b.checkByteStringIsUtf8(byteString);
        this.f22618h = byteString;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s5 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s5) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public v5 build() {
        v5 v5VarBuildPartial = buildPartial();
        if (v5VarBuildPartial.isInitialized()) {
            return v5VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) v5VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public v5 buildPartial() {
        v5 v5Var = new v5(this);
        v5Var.f22779m = (byte) -1;
        v5Var.f22769b = this.f22614c;
        v5Var.f22770c = this.f22615e;
        v5Var.f22771e = this.f22616f;
        v5Var.f22772f = this.f22617g;
        v5Var.f22773g = this.f22618h;
        v5Var.f22774h = this.f22619i;
        v5Var.f22775i = this.f22620j;
        pa paVar = this.f22622l;
        if (paVar == null) {
            if ((this.f22613b & 1) != 0) {
                this.f22621k = Collections.unmodifiableList(this.f22621k);
                this.f22613b &= -2;
            }
            v5Var.f22776j = this.f22621k;
        } else {
            v5Var.f22776j = paVar.build();
        }
        v5Var.f22777k = this.f22623m;
        v5Var.f22778l = this.f22624n;
        onBuilt();
        return v5Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s5 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (s5) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public v5 getDefaultInstanceForType() {
        return v5.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s5 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s5) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s5 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (s5) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final s5 setUnknownFields(gc gcVar) {
        return (s5) super.setUnknownFields(gcVar);
    }

    public ca addOptionsBuilder(int i10) {
        return (ca) e().addBuilder(i10, da.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s5 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (s5) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final s5 mergeUnknownFields(gc gcVar) {
        return (s5) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public s5 clear() {
        super.clear();
        this.f22614c = 0;
        this.f22615e = 0;
        this.f22616f = 0;
        this.f22617g = "";
        this.f22618h = "";
        this.f22619i = 0;
        this.f22620j = false;
        pa paVar = this.f22622l;
        if (paVar == null) {
            this.f22621k = Collections.EMPTY_LIST;
            this.f22613b &= -2;
        } else {
            paVar.clear();
        }
        this.f22623m = "";
        this.f22624n = "";
        return this;
    }

    public s5 addOptions(int i10, da daVar) {
        pa paVar = this.f22622l;
        if (paVar == null) {
            daVar.getClass();
            c();
            this.f22621k.add(i10, daVar);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, daVar);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public s5 mo500clone() {
        return (s5) super.mo500clone();
    }

    public s5 setOptions(int i10, ca caVar) {
        pa paVar = this.f22622l;
        if (paVar == null) {
            c();
            this.f22621k.set(i10, caVar.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, caVar.build());
        return this;
    }

    public s5 addOptions(ca caVar) {
        pa paVar = this.f22622l;
        if (paVar == null) {
            c();
            this.f22621k.add(caVar.build());
            onChanged();
            return this;
        }
        paVar.addMessage(caVar.build());
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s5 mergeFrom(Message message) {
        if (message instanceof v5) {
            return mergeFrom((v5) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public s5 mergeFrom(v5 v5Var) {
        if (v5Var == v5.getDefaultInstance()) {
            return this;
        }
        if (v5Var.f22769b != 0) {
            setKindValue(v5Var.getKindValue());
        }
        if (v5Var.f22770c != 0) {
            setCardinalityValue(v5Var.getCardinalityValue());
        }
        if (v5Var.getNumber() != 0) {
            setNumber(v5Var.getNumber());
        }
        if (!v5Var.getName().isEmpty()) {
            this.f22617g = v5Var.f22772f;
            onChanged();
        }
        if (!v5Var.getTypeUrl().isEmpty()) {
            this.f22618h = v5Var.f22773g;
            onChanged();
        }
        if (v5Var.getOneofIndex() != 0) {
            setOneofIndex(v5Var.getOneofIndex());
        }
        if (v5Var.getPacked()) {
            setPacked(v5Var.getPacked());
        }
        if (this.f22622l == null) {
            if (!v5Var.f22776j.isEmpty()) {
                if (this.f22621k.isEmpty()) {
                    this.f22621k = v5Var.f22776j;
                    this.f22613b &= -2;
                } else {
                    c();
                    this.f22621k.addAll(v5Var.f22776j);
                }
                onChanged();
            }
        } else if (!v5Var.f22776j.isEmpty()) {
            if (this.f22622l.isEmpty()) {
                this.f22622l.dispose();
                this.f22622l = null;
                this.f22621k = v5Var.f22776j;
                this.f22613b &= -2;
                this.f22622l = k7.alwaysUseFieldBuilders ? e() : null;
            } else {
                this.f22622l.addAllMessages(v5Var.f22776j);
            }
        }
        if (!v5Var.getJsonName().isEmpty()) {
            this.f22623m = v5Var.f22777k;
            onChanged();
        }
        if (!v5Var.getDefaultValue().isEmpty()) {
            this.f22624n = v5Var.f22778l;
            onChanged();
        }
        mergeUnknownFields(v5Var.unknownFields);
        onChanged();
        return this;
    }

    public s5 addOptions(int i10, ca caVar) {
        pa paVar = this.f22622l;
        if (paVar == null) {
            c();
            this.f22621k.add(i10, caVar.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, caVar.build());
        return this;
    }
}
