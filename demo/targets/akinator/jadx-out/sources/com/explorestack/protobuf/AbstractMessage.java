package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b;
import com.ironsource.C3191e4;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class AbstractMessage extends b implements Message {
    protected int memoizedSize = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Builder<BuilderType extends Builder<BuilderType>> extends b.a implements Message.Builder {
        public static ac newUninitializedMessageException(Message message) {
            ArrayList arrayList = new ArrayList();
            q9.b(message, "", arrayList);
            return new ac(arrayList);
        }

        public void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public List<String> findInitializationErrors() {
            ArrayList arrayList = new ArrayList();
            q9.b(this, "", arrayList);
            return arrayList;
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public String getInitializationErrorString() {
            return q9.a(findInitializationErrors());
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public abstract /* synthetic */ boolean isInitialized();

        public void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return super.mergeDelimitedFrom(inputStream);
        }

        public String toString() {
            return TextFormat.printer().printToString(this);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public BuilderType clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            throw new UnsupportedOperationException("clearOneof() is not implemented.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.explorestack.protobuf.b.a
        public BuilderType internalMergeFrom(b bVar) {
            return (BuilderType) mergeFrom((Message) bVar);
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return super.mergeDelimitedFrom(inputStream, m5Var);
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public BuilderType mergeUnknownFields(gc gcVar) {
            setUnknownFields(gc.newBuilder(getUnknownFields()).mergeFrom(gcVar).build());
            return this;
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType clear() {
            Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> it = getAllFields().entrySet().iterator();
            while (it.hasNext()) {
                clearField(it.next().getKey());
            }
            return this;
        }

        @Override // com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public BuilderType mo500clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        @Override // com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(Message message) {
            return (BuilderType) mergeFrom(message, message.getAllFields());
        }

        public BuilderType mergeFrom(Message message, Map<Descriptors.FieldDescriptor, Object> map) {
            if (message.getDescriptorForType() == getDescriptorForType()) {
                for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
                    Descriptors.FieldDescriptor key = entry.getKey();
                    if (key.isRepeated()) {
                        Iterator it = ((List) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            addRepeatedField(key, it.next());
                        }
                    } else if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        Message message2 = (Message) getField(key);
                        if (message2 == message2.getDefaultInstanceForType()) {
                            setField(key, entry.getValue());
                        } else {
                            setField(key, message2.newBuilderForType().mergeFrom(message2).mergeFrom((Message) entry.getValue()).build());
                        }
                    } else {
                        setField(key, entry.getValue());
                    }
                }
                mergeUnknownFields(message.getUnknownFields());
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(y yVar) throws IOException {
            return (BuilderType) mergeFrom(yVar, (m5) i5.getEmptyRegistry());
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(y yVar, m5 m5Var) throws IOException {
            yVar.getClass();
            cc ccVarNewBuilder = gc.newBuilder(getUnknownFields());
            while (true) {
                int tag = yVar.readTag();
                if (tag == 0) {
                    break;
                }
                y yVar2 = yVar;
                m5 m5Var2 = m5Var;
                if (!q9.d(yVar2, ccVarNewBuilder, m5Var2, getDescriptorForType(), new m9(this), tag)) {
                    break;
                }
                yVar = yVar2;
                m5Var = m5Var2;
            }
            if (ccVarNewBuilder != null) {
                setUnknownFields(ccVarNewBuilder.build());
            }
            return this;
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(byteString);
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr);
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, i10, i11);
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, m5Var);
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException {
            return (BuilderType) super.mergeFrom(bArr, i10, i11, m5Var);
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            return (BuilderType) super.mergeFrom(inputStream);
        }

        @Override // com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BuilderType mergeFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (BuilderType) super.mergeFrom(inputStream, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface BuilderParent {
        void markDirty();
    }

    private static boolean compareBytes(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : toByteString(obj).equals(toByteString(obj2));
    }

    public static boolean compareFields(Map<Descriptors.FieldDescriptor, Object> map, Map<Descriptors.FieldDescriptor, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Descriptors.FieldDescriptor fieldDescriptor : map.keySet()) {
            if (!map2.containsKey(fieldDescriptor)) {
                return false;
            }
            Object obj = map.get(fieldDescriptor);
            Object obj2 = map2.get(fieldDescriptor);
            if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                if (fieldDescriptor.isRepeated()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!compareBytes(list.get(i10), list2.get(i10))) {
                            return false;
                        }
                    }
                } else if (!compareBytes(obj, obj2)) {
                    return false;
                }
            } else if (fieldDescriptor.isMapField()) {
                if (!compareMapField(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareMapField(Object obj, Object obj2) {
        return c9.d(convertMapEntryListToMap((List) obj), convertMapEntryListToMap((List) obj2));
    }

    private static Map convertMapEntryListToMap(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        Message message = (Message) it.next();
        Descriptors.Descriptor descriptorForType = message.getDescriptorForType();
        Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(C3191e4.h.W);
        Descriptors.FieldDescriptor fieldDescriptorFindFieldByName2 = descriptorForType.findFieldByName("value");
        Object field = message.getField(fieldDescriptorFindFieldByName2);
        if (field instanceof Descriptors.EnumValueDescriptor) {
            field = Integer.valueOf(((Descriptors.EnumValueDescriptor) field).getNumber());
        }
        map.put(message.getField(fieldDescriptorFindFieldByName), field);
        while (it.hasNext()) {
            Message message2 = (Message) it.next();
            Object field2 = message2.getField(fieldDescriptorFindFieldByName2);
            if (field2 instanceof Descriptors.EnumValueDescriptor) {
                field2 = Integer.valueOf(((Descriptors.EnumValueDescriptor) field2).getNumber());
            }
            map.put(message2.getField(fieldDescriptorFindFieldByName), field2);
        }
        return map;
    }

    @Deprecated
    public static int hashBoolean(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    @Deprecated
    public static int hashEnum(o7 o7Var) {
        return o7Var.getNumber();
    }

    @Deprecated
    public static int hashEnumList(List<? extends o7> list) {
        Iterator<? extends o7> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static int hashFields(int i10, Map<Descriptors.FieldDescriptor, Object> map) {
        int i11;
        int iHashEnum;
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            int number = key.getNumber() + (i10 * 37);
            if (key.isMapField()) {
                i10 = (number * 53) + hashMapField(value);
            } else {
                if (key.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                    i11 = number * 53;
                    iHashEnum = value.hashCode();
                } else if (key.isRepeated()) {
                    i11 = number * 53;
                    iHashEnum = x7.hashEnumList((List) value);
                } else {
                    i11 = number * 53;
                    iHashEnum = x7.hashEnum((o7) value);
                }
                i10 = iHashEnum + i11;
            }
        }
        return i10;
    }

    @Deprecated
    public static int hashLong(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    private static int hashMapField(Object obj) {
        return c9.a(convertMapEntryListToMap((List) obj));
    }

    private static ByteString toByteString(Object obj) {
        return obj instanceof byte[] ? ByteString.copyFrom((byte[]) obj) : (ByteString) obj;
    }

    @Override // com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return getDescriptorForType() == message.getDescriptorForType() && compareFields(getAllFields(), message.getAllFields()) && getUnknownFields().equals(message.getUnknownFields());
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public List<String> findInitializationErrors() {
        ArrayList arrayList = new ArrayList();
        q9.b(this, "", arrayList);
        return arrayList;
    }

    @Override // com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public String getInitializationErrorString() {
        return q9.a(findInitializationErrors());
    }

    @Override // com.explorestack.protobuf.b
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iC = q9.c(this, getAllFields());
        this.memoizedSize = iC;
        return iC;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    @Override // com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getUnknownFields().hashCode() + (hashFields(getDescriptorForType().hashCode() + 779, getAllFields()) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor fieldDescriptor : getDescriptorForType().getFields()) {
            if (fieldDescriptor.isRequired() && !hasField(fieldDescriptor)) {
                return false;
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            if (key.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((Message) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((Message) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public Message.Builder newBuilderForType(BuilderParent builderParent) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.explorestack.protobuf.b
    public ac newUninitializedMessageException() {
        return Builder.newUninitializedMessageException((Message) this);
    }

    @Override // com.explorestack.protobuf.b
    public void setMemoizedSerializedSize(int i10) {
        this.memoizedSize = i10;
    }

    @Override // com.explorestack.protobuf.Message
    public final String toString() {
        return TextFormat.printer().printToString(this);
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        q9.f(this, getAllFields(), h0Var);
    }
}
