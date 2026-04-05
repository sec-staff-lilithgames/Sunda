package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k7 extends AbstractMessage implements Serializable {
    protected static boolean alwaysUseFieldBuilders = false;
    private static final long serialVersionUID = 1;
    protected gc unknownFields;

    public k7() {
        this.unknownFields = gc.getDefaultInstance();
    }

    public static Method access$1000(Class cls, String str, Class[] clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static Object access$1100(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static e5 access$500(f5 f5Var) {
        f5Var.getClass();
        if (f5Var instanceof e5) {
            return (e5) f5Var;
        }
        throw new IllegalArgumentException("Expected non-lite extension.");
    }

    public static void c(h0 h0Var, Map map, s8 s8Var, int i10, boolean z10) throws IOException {
        if (map.containsKey(Boolean.valueOf(z10))) {
            h0Var.writeMessage(i10, s8Var.newBuilderForType().setKey(Boolean.valueOf(z10)).setValue(map.get(Boolean.valueOf(z10))).build());
        }
    }

    public static boolean canUseUnsafe() {
        return sc.f22645e && sc.f22644d;
    }

    public static int computeStringSize(int i10, Object obj) {
        return obj instanceof String ? h0.computeStringSize(i10, (String) obj) : h0.computeBytesSize(i10, (ByteString) obj);
    }

    public static int computeStringSizeNoTag(Object obj) {
        return obj instanceof String ? h0.computeStringSizeNoTag((String) obj) : h0.computeBytesSizeNoTag((ByteString) obj);
    }

    public static void d(h0 h0Var, Map map, s8 s8Var, int i10) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            h0Var.writeMessage(i10, s8Var.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
    }

    public static m7 emptyBooleanList() {
        return q.emptyList();
    }

    public static n7 emptyDoubleList() {
        return y4.emptyList();
    }

    public static r7 emptyFloatList() {
        return d6.emptyList();
    }

    public static s7 emptyIntList() {
        return l7.emptyList();
    }

    public static v7 emptyLongList() {
        return l8.emptyList();
    }

    public static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    public static s7 mutableCopy(s7 s7Var) {
        int size = s7Var.size();
        return ((l7) s7Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static m7 newBooleanList() {
        return new q(new boolean[10], 0);
    }

    public static n7 newDoubleList() {
        return new y4(new double[10], 0);
    }

    public static r7 newFloatList() {
        return new d6(new float[10], 0);
    }

    public static s7 newIntList() {
        return new l7(new int[10], 0);
    }

    public static v7 newLongList() {
        return new l8(new long[10], 0);
    }

    public static <M extends Message> M parseDelimitedWithIOException(fa faVar, InputStream inputStream) throws IOException {
        try {
            return (M) faVar.parseDelimitedFrom(inputStream);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(fa faVar, InputStream inputStream) throws IOException {
        try {
            return (M) faVar.parseFrom(inputStream);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    public static <V> void serializeBooleanMapTo(h0 h0Var, b9 b9Var, s8 s8Var, int i10) throws IOException {
        Map<Object, Object> map = b9Var.getMap();
        if (!h0Var.f22187b) {
            d(h0Var, map, s8Var, i10);
        } else {
            c(h0Var, map, s8Var, i10, false);
            c(h0Var, map, s8Var, i10, true);
        }
    }

    public static <V> void serializeIntegerMapTo(h0 h0Var, b9 b9Var, s8 s8Var, int i10) throws IOException {
        Map<Object, Object> map = b9Var.getMap();
        if (!h0Var.f22187b) {
            d(h0Var, map, s8Var, i10);
            return;
        }
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Object> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            h0Var.writeMessage(i10, s8Var.newBuilderForType().setKey(Integer.valueOf(i13)).setValue(map.get(Integer.valueOf(i13))).build());
        }
    }

    public static <V> void serializeLongMapTo(h0 h0Var, b9 b9Var, s8 s8Var, int i10) throws IOException {
        Map<Object, Object> map = b9Var.getMap();
        if (!h0Var.f22187b) {
            d(h0Var, map, s8Var, i10);
            return;
        }
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Object> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            h0Var.writeMessage(i10, s8Var.newBuilderForType().setKey(Long.valueOf(j10)).setValue(map.get(Long.valueOf(j10))).build());
        }
    }

    public static <V> void serializeStringMapTo(h0 h0Var, b9 b9Var, s8 s8Var, int i10) throws IOException {
        Map<Object, Object> map = b9Var.getMap();
        if (!h0Var.f22187b) {
            d(h0Var, map, s8Var, i10);
            return;
        }
        String[] strArr = (String[]) map.keySet().toArray(new String[map.size()]);
        Arrays.sort(strArr);
        for (String str : strArr) {
            h0Var.writeMessage(i10, s8Var.newBuilderForType().setKey(str).setValue(map.get(str)).build());
        }
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z10) {
        alwaysUseFieldBuilders = z10;
    }

    public static void writeString(h0 h0Var, int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            h0Var.writeString(i10, (String) obj);
        } else {
            h0Var.writeBytes(i10, (ByteString) obj);
        }
    }

    public static void writeStringNoTag(h0 h0Var, Object obj) throws IOException {
        if (obj instanceof String) {
            h0Var.writeStringNoTag((String) obj);
        } else {
            h0Var.writeBytesNoTag((ByteString) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.TreeMap b(boolean r7) {
        /*
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.explorestack.protobuf.i7 r1 = r6.internalGetFieldAccessorTable()
            com.explorestack.protobuf.Descriptors$Descriptor r1 = r1.f22232a
            java.util.List r1 = r1.getFields()
            r2 = 0
        L10:
            int r3 = r1.size()
            if (r2 >= r3) goto L6e
            java.lang.Object r3 = r1.get(r2)
            com.explorestack.protobuf.Descriptors$FieldDescriptor r3 = (com.explorestack.protobuf.Descriptors.FieldDescriptor) r3
            com.explorestack.protobuf.Descriptors$OneofDescriptor r4 = r3.getContainingOneof()
            if (r4 == 0) goto L35
            int r3 = r4.getFieldCount()
            int r3 = r3 + (-1)
            int r2 = r2 + r3
            boolean r3 = r6.hasOneof(r4)
            if (r3 != 0) goto L30
            goto L6b
        L30:
            com.explorestack.protobuf.Descriptors$FieldDescriptor r3 = r6.getOneofFieldDescriptor(r4)
            goto L52
        L35:
            boolean r4 = r3.isRepeated()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r6.getField(r3)
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L6b
            r0.put(r3, r4)
            goto L6b
        L4b:
            boolean r4 = r6.hasField(r3)
            if (r4 != 0) goto L52
            goto L6b
        L52:
            if (r7 == 0) goto L64
            com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r4 = r3.getJavaType()
            com.explorestack.protobuf.Descriptors$FieldDescriptor$JavaType r5 = com.explorestack.protobuf.Descriptors.FieldDescriptor.JavaType.STRING
            if (r4 != r5) goto L64
            java.lang.Object r4 = r6.getFieldRaw(r3)
            r0.put(r3, r4)
            goto L6b
        L64:
            java.lang.Object r4 = r6.getField(r3)
            r0.put(r3, r4)
        L6b:
            int r2 = r2 + 1
            goto L10
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.k7.b(boolean):java.util.TreeMap");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return Collections.unmodifiableMap(b(false));
    }

    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(b(true));
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return internalGetFieldAccessorTable().f22232a;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).get(this);
    }

    public Object getFieldRaw(Descriptors.FieldDescriptor fieldDescriptor) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).getRaw(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return i7.a(internalGetFieldAccessorTable(), oneofDescriptor).get(this);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).getRepeated(this, i10);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).getRepeatedCount(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iC = q9.c(this, getAllFieldsRaw());
        this.memoizedSize = iC;
        return iC;
    }

    public gc getUnknownFields() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return i7.b(internalGetFieldAccessorTable(), fieldDescriptor).has(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return i7.a(internalGetFieldAccessorTable(), oneofDescriptor).has(this);
    }

    public abstract i7 internalGetFieldAccessorTable();

    public b9 internalGetMapField(int i10) {
        throw new RuntimeException("No map fields found in ".concat(getClass().getName()));
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
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

    public void mergeFromAndMakeImmutableInternal(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        ua uaVarSchemaFor = ia.getInstance().schemaFor((ia) this);
        try {
            uaVarSchemaFor.mergeFrom(this, z.forCodedInput(yVar), m5Var);
            uaVarSchemaFor.makeImmutable(this);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(this);
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage
    public Message.Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return newBuilderForType((p6) new m6(builderParent));
    }

    public abstract Message.Builder newBuilderForType(p6 p6Var);

    public abstract Object newInstance(j7 j7Var);

    public boolean parseUnknownField(y yVar, cc ccVar, m5 m5Var, int i10) throws IOException {
        yVar.getClass();
        return ccVar.mergeFieldFrom(i10, yVar);
    }

    public boolean parseUnknownFieldProto3(y yVar, cc ccVar, m5 m5Var, int i10) throws IOException {
        return parseUnknownField(yVar, ccVar, m5Var, i10);
    }

    public Object writeReplace() throws ObjectStreamException {
        return new l6(this);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        q9.f(this, getAllFieldsRaw(), h0Var);
    }

    public k7(o6 o6Var) {
        this.unknownFields = o6Var.getUnknownFields();
    }

    public static v7 mutableCopy(v7 v7Var) {
        int size = v7Var.size();
        return ((l8) v7Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <M extends Message> M parseDelimitedWithIOException(fa faVar, InputStream inputStream, m5 m5Var) throws IOException {
        try {
            return (M) faVar.parseDelimitedFrom(inputStream, m5Var);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    public static <M extends Message> M parseWithIOException(fa faVar, InputStream inputStream, m5 m5Var) throws IOException {
        try {
            return (M) faVar.parseFrom(inputStream, m5Var);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    public static r7 mutableCopy(r7 r7Var) {
        int size = r7Var.size();
        return ((d6) r7Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <M extends Message> M parseWithIOException(fa faVar, y yVar) throws IOException {
        try {
            return (M) faVar.parseFrom(yVar);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    public static n7 mutableCopy(n7 n7Var) {
        int size = n7Var.size();
        return ((y4) n7Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <M extends Message> M parseWithIOException(fa faVar, y yVar, m5 m5Var) throws IOException {
        try {
            return (M) faVar.parseFrom(yVar, m5Var);
        } catch (InvalidProtocolBufferException e10) {
            throw e10.unwrapIOException();
        }
    }

    public static m7 mutableCopy(m7 m7Var) {
        int size = m7Var.size();
        return ((q) m7Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public void makeExtensionsImmutable() {
    }
}
