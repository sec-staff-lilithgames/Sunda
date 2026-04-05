package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s8 extends AbstractMessage {

    /* renamed from: b, reason: collision with root package name */
    public final Object f22626b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22627c;

    /* renamed from: e, reason: collision with root package name */
    public final r8 f22628e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f22629f = -1;

    public s8(Descriptors.Descriptor descriptor, bd bdVar, Object obj, bd bdVar2, Object obj2) {
        this.f22626b = obj;
        this.f22627c = obj2;
        this.f22628e = new r8(descriptor, this, bdVar, bdVar2);
    }

    public static <K, V> s8 newDefaultInstance(Descriptors.Descriptor descriptor, bd bdVar, K k10, bd bdVar2, V v10) {
        return new s8(descriptor, bdVar, k10, bdVar2, v10);
    }

    public final void b(Descriptors.FieldDescriptor fieldDescriptor) {
        Descriptors.Descriptor containingType = fieldDescriptor.getContainingType();
        r8 r8Var = this.f22628e;
        if (containingType == r8Var.f22540e) {
            return;
        }
        throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + r8Var.f22540e.getFullName());
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (Descriptors.FieldDescriptor fieldDescriptor : this.f22628e.f22540e.getFields()) {
            if (hasField(fieldDescriptor)) {
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.f22628e.f22540e;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        b(fieldDescriptor);
        Object key = fieldDescriptor.getNumber() == 1 ? getKey() : getValue();
        return fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(((Integer) key).intValue()) : key;
    }

    public Object getKey() {
        return this.f22626b;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return this.f22628e.f22541f;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        if (this.f22629f != -1) {
            return this.f22629f;
        }
        int iA = u8.a(this.f22628e, this.f22626b, this.f22627c);
        this.f22629f = iA;
        return iA;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public gc getUnknownFields() {
        return gc.getDefaultInstance();
    }

    public Object getValue() {
        return this.f22627c;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        b(fieldDescriptor);
        return true;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        if (this.f22628e.f22663c.getJavaType() == cd.MESSAGE) {
            return ((MessageLite) this.f22627c).isInitialized();
        }
        return true;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        u8.d(h0Var, this.f22628e, this.f22626b, this.f22627c);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public s8 getDefaultInstanceForType() {
        r8 r8Var = this.f22628e;
        return new s8(r8Var, r8Var.f22662b, r8Var.f22664d);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p8 newBuilderForType() {
        r8 r8Var = this.f22628e;
        return new p8(r8Var, r8Var.f22662b, r8Var.f22664d, false, false);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p8 toBuilder() {
        return new p8(this.f22628e, this.f22626b, this.f22627c, true, true);
    }

    public s8(r8 r8Var, Object obj, Object obj2) {
        this.f22626b = obj;
        this.f22627c = obj2;
        this.f22628e = r8Var;
    }

    public s8(r8 r8Var, y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        try {
            this.f22628e = r8Var;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntryB = u8.b(yVar, r8Var, m5Var);
            this.f22626b = simpleImmutableEntryB.getKey();
            this.f22627c = simpleImmutableEntryB.getValue();
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(this);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
        }
    }
}
