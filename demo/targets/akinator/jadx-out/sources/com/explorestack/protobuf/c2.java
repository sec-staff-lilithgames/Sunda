package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c2 extends o6 implements g2 {

    /* renamed from: b, reason: collision with root package name */
    public int f21965b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f21966c;

    /* renamed from: e, reason: collision with root package name */
    public int f21967e;

    /* renamed from: f, reason: collision with root package name */
    public int f21968f;

    /* renamed from: g, reason: collision with root package name */
    public int f21969g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f21970h;

    /* renamed from: i, reason: collision with root package name */
    public Serializable f21971i;

    /* renamed from: j, reason: collision with root package name */
    public Serializable f21972j;

    /* renamed from: k, reason: collision with root package name */
    public int f21973k;

    /* renamed from: l, reason: collision with root package name */
    public Serializable f21974l;

    /* renamed from: m, reason: collision with root package name */
    public l2 f21975m;

    /* renamed from: n, reason: collision with root package name */
    public xa f21976n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21977o;

    public c2() {
        super(null);
        this.f21966c = "";
        this.f21968f = 1;
        this.f21969g = 1;
        this.f21970h = "";
        this.f21971i = "";
        this.f21972j = "";
        this.f21974l = "";
        if (k7.alwaysUseFieldBuilders && this.f21976n == null) {
            this.f21976n = new xa(getOptions(), getParentForChildren(), isClean());
            this.f21975m = null;
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22844k;
    }

    public c2 clearDefaultValue() {
        this.f21965b &= -65;
        this.f21972j = f2.getDefaultInstance().getDefaultValue();
        onChanged();
        return this;
    }

    public c2 clearExtendee() {
        this.f21965b &= -33;
        this.f21971i = f2.getDefaultInstance().getExtendee();
        onChanged();
        return this;
    }

    public c2 clearJsonName() {
        this.f21965b &= -257;
        this.f21974l = f2.getDefaultInstance().getJsonName();
        onChanged();
        return this;
    }

    public c2 clearLabel() {
        this.f21965b &= -5;
        this.f21968f = 1;
        onChanged();
        return this;
    }

    public c2 clearName() {
        this.f21965b &= -2;
        this.f21966c = f2.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public c2 clearNumber() {
        this.f21965b &= -3;
        this.f21967e = 0;
        onChanged();
        return this;
    }

    public c2 clearOneofIndex() {
        this.f21965b &= -129;
        this.f21973k = 0;
        onChanged();
        return this;
    }

    public c2 clearOptions() {
        xa xaVar = this.f21976n;
        if (xaVar == null) {
            this.f21975m = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f21965b &= -513;
        return this;
    }

    public c2 clearProto3Optional() {
        this.f21965b &= -1025;
        this.f21977o = false;
        onChanged();
        return this;
    }

    public c2 clearType() {
        this.f21965b &= -9;
        this.f21969g = 1;
        onChanged();
        return this;
    }

    public c2 clearTypeName() {
        this.f21965b &= -17;
        this.f21970h = f2.getDefaultInstance().getTypeName();
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.g2
    public String getDefaultValue() {
        Serializable serializable = this.f21972j;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f21972j = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getDefaultValueBytes() {
        Serializable serializable = this.f21972j;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f21972j = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22844k;
    }

    @Override // com.explorestack.protobuf.g2
    public String getExtendee() {
        Serializable serializable = this.f21971i;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f21971i = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getExtendeeBytes() {
        Serializable serializable = this.f21971i;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f21971i = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public String getJsonName() {
        Serializable serializable = this.f21974l;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f21974l = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getJsonNameBytes() {
        Serializable serializable = this.f21974l;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f21974l = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public DescriptorProtos$FieldDescriptorProto$Label getLabel() {
        DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$LabelValueOf = DescriptorProtos$FieldDescriptorProto$Label.valueOf(this.f21968f);
        return descriptorProtos$FieldDescriptorProto$LabelValueOf == null ? DescriptorProtos$FieldDescriptorProto$Label.LABEL_OPTIONAL : descriptorProtos$FieldDescriptorProto$LabelValueOf;
    }

    @Override // com.explorestack.protobuf.g2
    public String getName() {
        Serializable serializable = this.f21966c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f21966c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getNameBytes() {
        Serializable serializable = this.f21966c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f21966c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public int getNumber() {
        return this.f21967e;
    }

    @Override // com.explorestack.protobuf.g2
    public int getOneofIndex() {
        return this.f21973k;
    }

    @Override // com.explorestack.protobuf.g2
    public l2 getOptions() {
        xa xaVar = this.f21976n;
        if (xaVar != null) {
            return (l2) xaVar.getMessage();
        }
        l2 l2Var = this.f21975m;
        return l2Var == null ? l2.getDefaultInstance() : l2Var;
    }

    public i2 getOptionsBuilder() {
        this.f21965b |= 512;
        onChanged();
        if (this.f21976n == null) {
            this.f21976n = new xa(getOptions(), getParentForChildren(), isClean());
            this.f21975m = null;
        }
        return (i2) this.f21976n.getBuilder();
    }

    @Override // com.explorestack.protobuf.g2
    public m2 getOptionsOrBuilder() {
        xa xaVar = this.f21976n;
        if (xaVar != null) {
            return (m2) xaVar.getMessageOrBuilder();
        }
        l2 l2Var = this.f21975m;
        return l2Var == null ? l2.getDefaultInstance() : l2Var;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean getProto3Optional() {
        return this.f21977o;
    }

    @Override // com.explorestack.protobuf.g2
    public DescriptorProtos$FieldDescriptorProto$Type getType() {
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$TypeValueOf = DescriptorProtos$FieldDescriptorProto$Type.valueOf(this.f21969g);
        return descriptorProtos$FieldDescriptorProto$TypeValueOf == null ? DescriptorProtos$FieldDescriptorProto$Type.TYPE_DOUBLE : descriptorProtos$FieldDescriptorProto$TypeValueOf;
    }

    @Override // com.explorestack.protobuf.g2
    public String getTypeName() {
        Serializable serializable = this.f21970h;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f21970h = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getTypeNameBytes() {
        Serializable serializable = this.f21970h;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f21970h = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasDefaultValue() {
        return (this.f21965b & 64) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasExtendee() {
        return (this.f21965b & 32) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasJsonName() {
        return (this.f21965b & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasLabel() {
        return (this.f21965b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasName() {
        return (this.f21965b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasNumber() {
        return (this.f21965b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasOneofIndex() {
        return (this.f21965b & 128) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasOptions() {
        return (this.f21965b & 512) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasProto3Optional() {
        return (this.f21965b & 1024) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasType() {
        return (this.f21965b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasTypeName() {
        return (this.f21965b & 16) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22845l.ensureFieldAccessorsInitialized(f2.class, c2.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return !hasOptions() || getOptions().isInitialized();
    }

    public c2 mergeOptions(l2 l2Var) {
        l2 l2Var2;
        xa xaVar = this.f21976n;
        if (xaVar == null) {
            if ((this.f21965b & 512) == 0 || (l2Var2 = this.f21975m) == null || l2Var2 == l2.getDefaultInstance()) {
                this.f21975m = l2Var;
            } else {
                this.f21975m = l2.newBuilder(this.f21975m).mergeFrom(l2Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(l2Var);
        }
        this.f21965b |= 512;
        return this;
    }

    public c2 setDefaultValue(String str) {
        str.getClass();
        this.f21965b |= 64;
        this.f21972j = str;
        onChanged();
        return this;
    }

    public c2 setDefaultValueBytes(ByteString byteString) {
        byteString.getClass();
        this.f21965b |= 64;
        this.f21972j = byteString;
        onChanged();
        return this;
    }

    public c2 setExtendee(String str) {
        str.getClass();
        this.f21965b |= 32;
        this.f21971i = str;
        onChanged();
        return this;
    }

    public c2 setExtendeeBytes(ByteString byteString) {
        byteString.getClass();
        this.f21965b |= 32;
        this.f21971i = byteString;
        onChanged();
        return this;
    }

    public c2 setJsonName(String str) {
        str.getClass();
        this.f21965b |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.f21974l = str;
        onChanged();
        return this;
    }

    public c2 setJsonNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f21965b |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.f21974l = byteString;
        onChanged();
        return this;
    }

    public c2 setLabel(DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$Label) {
        descriptorProtos$FieldDescriptorProto$Label.getClass();
        this.f21965b |= 4;
        this.f21968f = descriptorProtos$FieldDescriptorProto$Label.getNumber();
        onChanged();
        return this;
    }

    public c2 setName(String str) {
        str.getClass();
        this.f21965b |= 1;
        this.f21966c = str;
        onChanged();
        return this;
    }

    public c2 setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f21965b |= 1;
        this.f21966c = byteString;
        onChanged();
        return this;
    }

    public c2 setNumber(int i10) {
        this.f21965b |= 2;
        this.f21967e = i10;
        onChanged();
        return this;
    }

    public c2 setOneofIndex(int i10) {
        this.f21965b |= 128;
        this.f21973k = i10;
        onChanged();
        return this;
    }

    public c2 setOptions(l2 l2Var) {
        xa xaVar = this.f21976n;
        if (xaVar == null) {
            l2Var.getClass();
            this.f21975m = l2Var;
            onChanged();
        } else {
            xaVar.setMessage(l2Var);
        }
        this.f21965b |= 512;
        return this;
    }

    public c2 setProto3Optional(boolean z10) {
        this.f21965b |= 1024;
        this.f21977o = z10;
        onChanged();
        return this;
    }

    public c2 setType(DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$Type) {
        descriptorProtos$FieldDescriptorProto$Type.getClass();
        this.f21965b |= 8;
        this.f21969g = descriptorProtos$FieldDescriptorProto$Type.getNumber();
        onChanged();
        return this;
    }

    public c2 setTypeName(String str) {
        str.getClass();
        this.f21965b |= 16;
        this.f21970h = str;
        onChanged();
        return this;
    }

    public c2 setTypeNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f21965b |= 16;
        this.f21970h = byteString;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public c2 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (c2) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public f2 build() {
        f2 f2VarBuildPartial = buildPartial();
        if (f2VarBuildPartial.isInitialized()) {
            return f2VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) f2VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public f2 buildPartial() {
        f2 f2Var = new f2(this);
        f2Var.f22118o = (byte) -1;
        int i10 = this.f21965b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        f2Var.f22107c = this.f21966c;
        if ((i10 & 2) != 0) {
            f2Var.f22108e = this.f21967e;
            i11 |= 2;
        }
        if ((i10 & 4) != 0) {
            i11 |= 4;
        }
        f2Var.f22109f = this.f21968f;
        if ((i10 & 8) != 0) {
            i11 |= 8;
        }
        f2Var.f22110g = this.f21969g;
        if ((i10 & 16) != 0) {
            i11 |= 16;
        }
        f2Var.f22111h = this.f21970h;
        if ((i10 & 32) != 0) {
            i11 |= 32;
        }
        f2Var.f22112i = this.f21971i;
        if ((i10 & 64) != 0) {
            i11 |= 64;
        }
        f2Var.f22113j = this.f21972j;
        if ((i10 & 128) != 0) {
            f2Var.f22114k = this.f21973k;
            i11 |= 128;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        f2Var.f22115l = this.f21974l;
        if ((i10 & 512) != 0) {
            xa xaVar = this.f21976n;
            if (xaVar == null) {
                f2Var.f22116m = this.f21975m;
            } else {
                f2Var.f22116m = (l2) xaVar.build();
            }
            i11 |= 512;
        }
        if ((i10 & 1024) != 0) {
            f2Var.f22117n = this.f21977o;
            i11 |= 1024;
        }
        f2Var.f22106b = i11;
        onBuilt();
        return f2Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public c2 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (c2) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public f2 getDefaultInstanceForType() {
        return f2.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public c2 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (c2) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public c2 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (c2) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final c2 setUnknownFields(gc gcVar) {
        return (c2) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public c2 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (c2) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final c2 mergeUnknownFields(gc gcVar) {
        return (c2) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public c2 clear() {
        super.clear();
        this.f21966c = "";
        int i10 = this.f21965b;
        this.f21967e = 0;
        this.f21968f = 1;
        this.f21969g = 1;
        this.f21970h = "";
        this.f21971i = "";
        this.f21972j = "";
        this.f21973k = 0;
        this.f21974l = "";
        this.f21965b = i10 & (-512);
        xa xaVar = this.f21976n;
        if (xaVar == null) {
            this.f21975m = null;
        } else {
            xaVar.clear();
        }
        int i11 = this.f21965b;
        this.f21977o = false;
        this.f21965b = i11 & (-1537);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public c2 mo500clone() {
        return (c2) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public c2 mergeFrom(Message message) {
        if (message instanceof f2) {
            return mergeFrom((f2) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public c2 setOptions(i2 i2Var) {
        xa xaVar = this.f21976n;
        if (xaVar == null) {
            this.f21975m = i2Var.build();
            onChanged();
        } else {
            xaVar.setMessage(i2Var.build());
        }
        this.f21965b |= 512;
        return this;
    }

    public c2 mergeFrom(f2 f2Var) {
        if (f2Var == f2.getDefaultInstance()) {
            return this;
        }
        if (f2Var.hasName()) {
            this.f21965b |= 1;
            this.f21966c = f2Var.f22107c;
            onChanged();
        }
        if (f2Var.hasNumber()) {
            setNumber(f2Var.getNumber());
        }
        if (f2Var.hasLabel()) {
            setLabel(f2Var.getLabel());
        }
        if (f2Var.hasType()) {
            setType(f2Var.getType());
        }
        if (f2Var.hasTypeName()) {
            this.f21965b |= 16;
            this.f21970h = f2Var.f22111h;
            onChanged();
        }
        if (f2Var.hasExtendee()) {
            this.f21965b |= 32;
            this.f21971i = f2Var.f22112i;
            onChanged();
        }
        if (f2Var.hasDefaultValue()) {
            this.f21965b |= 64;
            this.f21972j = f2Var.f22113j;
            onChanged();
        }
        if (f2Var.hasOneofIndex()) {
            setOneofIndex(f2Var.getOneofIndex());
        }
        if (f2Var.hasJsonName()) {
            this.f21965b |= NotificationCompat.FLAG_LOCAL_ONLY;
            this.f21974l = f2Var.f22115l;
            onChanged();
        }
        if (f2Var.hasOptions()) {
            mergeOptions(f2Var.getOptions());
        }
        if (f2Var.hasProto3Optional()) {
            setProto3Optional(f2Var.getProto3Optional());
        }
        mergeUnknownFields(f2Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.c2 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.b2 r1 = com.explorestack.protobuf.f2.f22105q     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.f2 r3 = (com.explorestack.protobuf.f2) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.f2 r4 = (com.explorestack.protobuf.f2) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.c2.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.c2");
    }
}
