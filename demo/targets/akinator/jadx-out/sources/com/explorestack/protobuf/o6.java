package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o6 extends AbstractMessage.Builder {
    private p6 builderParent;
    private boolean isClean;
    private n6 meAsParent;
    private gc unknownFields = gc.getDefaultInstance();

    public o6(p6 p6Var) {
        this.builderParent = p6Var;
    }

    public final TreeMap b() {
        TreeMap treeMap = new TreeMap();
        List<Descriptors.FieldDescriptor> fields = internalGetFieldAccessorTable().f22232a.getFields();
        int fieldCount = 0;
        while (fieldCount < fields.size()) {
            Descriptors.FieldDescriptor oneofFieldDescriptor = fields.get(fieldCount);
            Descriptors.OneofDescriptor containingOneof = oneofFieldDescriptor.getContainingOneof();
            if (containingOneof != null) {
                fieldCount += containingOneof.getFieldCount() - 1;
                if (hasOneof(containingOneof)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(containingOneof);
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            } else if (oneofFieldDescriptor.isRepeated()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
            }
            fieldCount++;
        }
        return treeMap;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder
    public void dispose() {
        this.builderParent = null;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(b());
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().f22232a;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        Object obj = i7.b(internalGetFieldAccessorTable(), fieldDescriptor).get(this);
        return fieldDescriptor.isRepeated() ? Collections.unmodifiableList((List) obj) : obj;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).getBuilder(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return i7.a(internalGetFieldAccessorTable(), oneofDescriptor).get(this);
    }

    public p6 getParentForChildren() {
        if (this.meAsParent == null) {
            this.meAsParent = new n6(this);
        }
        return this.meAsParent;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).getRepeated(this, i10);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).getRepeatedBuilder(this, i10);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).getRepeatedCount(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).has(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return i7.a(internalGetFieldAccessorTable(), oneofDescriptor).has(this);
    }

    public abstract i7 internalGetFieldAccessorTable();

    public b9 internalGetMapField(int i10) {
        throw new RuntimeException("No map fields found in ".concat(getClass().getName()));
    }

    public b9 internalGetMutableMapField(int i10) {
        throw new RuntimeException("No map fields found in ".concat(getClass().getName()));
    }

    public boolean isClean() {
        return this.isClean;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                return false;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    Iterator it = ((List) getField(fieldDescriptor)).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(fieldDescriptor) && !((Message) getField(fieldDescriptor)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder
    public void markClean() {
        this.isClean = true;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).newBuilder();
    }

    public void onBuilt() {
        if (this.builderParent != null) {
            markClean();
        }
    }

    public final void onChanged() {
        p6 p6Var;
        if (!this.isClean || (p6Var = this.builderParent) == null) {
            return;
        }
        p6Var.markDirty();
        this.isClean = false;
    }

    public o6 setUnknownFieldsProto3(gc gcVar) {
        this.unknownFields = gcVar;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public o6 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        i7.b(internalGetFieldAccessorTable(), fieldDescriptor).addRepeated(this, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public o6 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        i7.b(internalGetFieldAccessorTable(), fieldDescriptor).clear(this);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public o6 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        i7.b(internalGetFieldAccessorTable(), fieldDescriptor).set(this, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public o6 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        i7.b(internalGetFieldAccessorTable(), fieldDescriptor).setRepeated(this, i10, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public o6 setUnknownFields(gc gcVar) {
        this.unknownFields = gcVar;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public o6 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        i7.a(internalGetFieldAccessorTable(), oneofDescriptor).clear(this);
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public o6 mergeUnknownFields(gc gcVar) {
        return setUnknownFields(gc.newBuilder(this.unknownFields).mergeFrom(gcVar).build());
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public o6 clear() {
        this.unknownFields = gc.getDefaultInstance();
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public o6 mo500clone() {
        o6 o6Var = (o6) getDefaultInstanceForType().newBuilderForType();
        o6Var.mergeFrom(buildPartial());
        return o6Var;
    }
}
