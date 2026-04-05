package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p8 extends AbstractMessage.Builder {

    /* renamed from: b, reason: collision with root package name */
    public final r8 f22488b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22489c;

    /* renamed from: e, reason: collision with root package name */
    public Object f22490e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22491f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22492g;

    public p8(r8 r8Var, Object obj, Object obj2, boolean z10, boolean z11) {
        this.f22488b = r8Var;
        this.f22489c = obj;
        this.f22490e = obj2;
        this.f22491f = z10;
        this.f22492g = z11;
    }

    public final void b(Descriptors.FieldDescriptor fieldDescriptor) {
        Descriptors.Descriptor containingType = fieldDescriptor.getContainingType();
        r8 r8Var = this.f22488b;
        if (containingType == r8Var.f22540e) {
            return;
        }
        throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + r8Var.f22540e.getFullName());
    }

    public p8 clearKey() {
        this.f22489c = this.f22488b.f22662b;
        this.f22491f = false;
        return this;
    }

    public p8 clearValue() {
        this.f22490e = this.f22488b.f22664d;
        this.f22492g = false;
        return this;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (Descriptors.FieldDescriptor fieldDescriptor : this.f22488b.f22540e.getFields()) {
            if (hasField(fieldDescriptor)) {
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.f22488b.f22540e;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        b(fieldDescriptor);
        Object key = fieldDescriptor.getNumber() == 1 ? getKey() : getValue();
        return fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(((Integer) key).intValue()) : key;
    }

    public Object getKey() {
        return this.f22489c;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public gc getUnknownFields() {
        return gc.getDefaultInstance();
    }

    public Object getValue() {
        return this.f22490e;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        b(fieldDescriptor);
        return fieldDescriptor.getNumber() == 1 ? this.f22491f : this.f22492g;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        Object obj = this.f22490e;
        if (this.f22488b.f22663c.getJavaType() == cd.MESSAGE) {
            return ((MessageLite) obj).isInitialized();
        }
        return true;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
        b(fieldDescriptor);
        if (fieldDescriptor.getNumber() == 2 && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            return ((Message) this.f22490e).newBuilderForType();
        }
        throw new RuntimeException("\"" + fieldDescriptor.getFullName() + "\" is not a message value field.");
    }

    public p8 setKey(Object obj) {
        this.f22489c = obj;
        this.f22491f = true;
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public p8 setUnknownFields(gc gcVar) {
        return this;
    }

    public p8 setValue(Object obj) {
        this.f22490e = obj;
        this.f22492g = true;
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public p8 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public p8 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        b(fieldDescriptor);
        if (fieldDescriptor.getNumber() == 1) {
            clearKey();
            return this;
        }
        clearValue();
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public p8 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        b(fieldDescriptor);
        if (fieldDescriptor.getNumber() == 1) {
            setKey(obj);
            return this;
        }
        if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
            obj = Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber());
        } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && obj != null) {
            r8 r8Var = this.f22488b;
            if (!r8Var.f22664d.getClass().isInstance(obj)) {
                obj = ((Message) r8Var.f22664d).toBuilder().mergeFrom((Message) obj).build();
            }
        }
        setValue(obj);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public p8 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public s8 build() {
        s8 s8VarBuildPartial = buildPartial();
        if (s8VarBuildPartial.isInitialized()) {
            return s8VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) s8VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public s8 buildPartial() {
        return new s8(this.f22488b, this.f22489c, this.f22490e);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public s8 getDefaultInstanceForType() {
        r8 r8Var = this.f22488b;
        return new s8(r8Var, r8Var.f22662b, r8Var.f22664d);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public p8 mo500clone() {
        return new p8(this.f22488b, this.f22489c, this.f22490e, this.f22491f, this.f22492g);
    }
}
