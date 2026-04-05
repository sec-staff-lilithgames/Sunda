package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o5 extends n5 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f22434a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22435b = 0;

    static {
        f22434a = sc.f22643c.objectFieldOffset(s6.class.getDeclaredField(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
    }

    @Override // com.explorestack.protobuf.n5
    public final int a(Map.Entry entry) {
        return ((Descriptors.FieldDescriptor) entry.getKey()).getNumber();
    }

    @Override // com.explorestack.protobuf.n5
    public final Object b(m5 m5Var, MessageLite messageLite, int i10) {
        return ((i5) m5Var).findExtensionByNumber(((Message) messageLite).getDescriptorForType(), i10);
    }

    @Override // com.explorestack.protobuf.n5
    public final b6 c(Object obj) {
        b6 extensions = getExtensions(obj);
        if (!extensions.isImmutable()) {
            return extensions;
        }
        b6 b6VarM501clone = extensions.m501clone();
        sc.s(obj, f22434a, b6VarM501clone);
        return b6VarM501clone;
    }

    @Override // com.explorestack.protobuf.n5
    public final boolean d(MessageLite messageLite) {
        return messageLite instanceof s6;
    }

    @Override // com.explorestack.protobuf.n5
    public final void e(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.explorestack.protobuf.n5
    public final Object f(la laVar, Object obj, m5 m5Var, b6 b6Var, Object obj2, bc bcVar) throws IOException {
        Object objValueOf;
        Object field;
        List<Double> arrayList;
        h5 h5Var = (h5) obj;
        a6 a6Var = h5Var.f22194a;
        Message message = h5Var.f22195b;
        int number = a6Var.getNumber();
        if (!a6Var.isRepeated() || !a6Var.isPacked()) {
            if (a6Var.getLiteType() != bd.f21959i) {
                switch (a6Var.getLiteType().ordinal()) {
                    case 0:
                        objValueOf = Double.valueOf(laVar.readDouble());
                        break;
                    case 1:
                        objValueOf = Float.valueOf(laVar.readFloat());
                        break;
                    case 2:
                        objValueOf = Long.valueOf(laVar.readInt64());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(laVar.readUInt64());
                        break;
                    case 4:
                        objValueOf = Integer.valueOf(laVar.readInt32());
                        break;
                    case 5:
                        objValueOf = Long.valueOf(laVar.readFixed64());
                        break;
                    case 6:
                        objValueOf = Integer.valueOf(laVar.readFixed32());
                        break;
                    case 7:
                        objValueOf = Boolean.valueOf(laVar.readBool());
                        break;
                    case 8:
                        objValueOf = laVar.readString();
                        break;
                    case 9:
                        objValueOf = laVar.readGroup(message.getClass(), m5Var);
                        break;
                    case 10:
                        objValueOf = laVar.readMessage(message.getClass(), m5Var);
                        break;
                    case 11:
                        objValueOf = laVar.readBytes();
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(laVar.readUInt32());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        objValueOf = Integer.valueOf(laVar.readSFixed32());
                        break;
                    case 15:
                        objValueOf = Long.valueOf(laVar.readSFixed64());
                        break;
                    case 16:
                        objValueOf = Integer.valueOf(laVar.readSInt32());
                        break;
                    case 17:
                        objValueOf = Long.valueOf(laVar.readSInt64());
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = laVar.readInt32();
                objValueOf = a6Var.getEnumType().findValueByNumber(int32);
                if (objValueOf == null) {
                    return wa.A(number, int32, obj2, bcVar);
                }
            }
            if (a6Var.isRepeated()) {
                b6Var.addRepeatedField(a6Var, objValueOf);
                return obj2;
            }
            int iOrdinal = a6Var.getLiteType().ordinal();
            if ((iOrdinal == 9 || iOrdinal == 10) && (field = b6Var.getField(a6Var)) != null) {
                objValueOf = x7.b(field, objValueOf);
            }
            b6Var.setField(a6Var, objValueOf);
            return obj2;
        }
        switch (a6Var.getLiteType().ordinal()) {
            case 0:
                arrayList = new ArrayList<>();
                laVar.readDoubleList(arrayList);
                break;
            case 1:
                arrayList = new ArrayList<>();
                laVar.readFloatList(arrayList);
                break;
            case 2:
                arrayList = new ArrayList<>();
                laVar.readInt64List(arrayList);
                break;
            case 3:
                arrayList = new ArrayList<>();
                laVar.readUInt64List(arrayList);
                break;
            case 4:
                arrayList = new ArrayList<>();
                laVar.readInt32List(arrayList);
                break;
            case 5:
                arrayList = new ArrayList<>();
                laVar.readFixed64List(arrayList);
                break;
            case 6:
                arrayList = new ArrayList<>();
                laVar.readFixed32List(arrayList);
                break;
            case 7:
                arrayList = new ArrayList<>();
                laVar.readBoolList(arrayList);
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                throw new IllegalStateException("Type cannot be packed: " + a6Var.getLiteType());
            case 12:
                arrayList = new ArrayList<>();
                laVar.readUInt32List(arrayList);
                break;
            case 13:
                ArrayList arrayList2 = new ArrayList();
                laVar.readEnumList(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    Descriptors.EnumValueDescriptor enumValueDescriptorFindValueByNumber = a6Var.getEnumType().findValueByNumber(iIntValue);
                    if (enumValueDescriptorFindValueByNumber != null) {
                        arrayList3.add(enumValueDescriptorFindValueByNumber);
                    } else {
                        obj2 = wa.A(number, iIntValue, obj2, bcVar);
                    }
                }
                arrayList = arrayList3;
                break;
            case 14:
                arrayList = new ArrayList<>();
                laVar.readSFixed32List(arrayList);
                break;
            case 15:
                arrayList = new ArrayList<>();
                laVar.readSFixed64List(arrayList);
                break;
            case 16:
                arrayList = new ArrayList<>();
                laVar.readSInt32List(arrayList);
                break;
            case 17:
                arrayList = new ArrayList<>();
                laVar.readSInt64List(arrayList);
                break;
        }
        b6Var.setField(a6Var, arrayList);
        return obj2;
    }

    @Override // com.explorestack.protobuf.n5
    public final void g(la laVar, Object obj, m5 m5Var, b6 b6Var) {
        h5 h5Var = (h5) obj;
        Descriptors.FieldDescriptor fieldDescriptor = h5Var.f22194a;
        Message message = h5Var.f22195b;
        if (m5.isEagerlyParseMessageSets()) {
            b6Var.setField(fieldDescriptor, laVar.readMessage(message.getClass(), m5Var));
        } else {
            b6Var.setField(fieldDescriptor, new b8(message, m5Var, laVar.readBytes()));
        }
    }

    @Override // com.explorestack.protobuf.n5
    public b6 getExtensions(Object obj) {
        return (b6) sc.f22643c.getObject(obj, f22434a);
    }

    @Override // com.explorestack.protobuf.n5
    public final void h(ByteString byteString, Object obj, m5 m5Var, b6 b6Var) throws IOException {
        h5 h5Var = (h5) obj;
        Message message = h5Var.f22195b;
        Descriptors.FieldDescriptor fieldDescriptor = h5Var.f22194a;
        Message messageBuildPartial = message.newBuilderForType().buildPartial();
        if (!m5.isEagerlyParseMessageSets()) {
            b6Var.setField(fieldDescriptor, new b8(message, m5Var, byteString));
            return;
        }
        l lVarNewInstance = l.newInstance(ByteBuffer.wrap(byteString.toByteArray()), true);
        ia.getInstance().mergeFrom(messageBuildPartial, lVarNewInstance, m5Var);
        b6Var.setField(fieldDescriptor, messageBuildPartial);
        if (lVarNewInstance.getFieldNumber() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.explorestack.protobuf.n5
    public final void i(i0 i0Var, Map.Entry entry) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
        if (!fieldDescriptor.isRepeated()) {
            switch (fieldDescriptor.getLiteType().ordinal()) {
                case 0:
                    i0Var.writeDouble(fieldDescriptor.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    i0Var.writeFloat(fieldDescriptor.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    i0Var.writeInt64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    i0Var.writeUInt64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    i0Var.writeInt32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    i0Var.writeFixed64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    i0Var.writeFixed32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    i0Var.writeBool(fieldDescriptor.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    i0Var.writeString(fieldDescriptor.getNumber(), (String) entry.getValue());
                    break;
                case 9:
                    i0Var.writeGroup(fieldDescriptor.getNumber(), entry.getValue());
                    break;
                case 10:
                    i0Var.writeMessage(fieldDescriptor.getNumber(), entry.getValue());
                    break;
                case 11:
                    i0Var.writeBytes(fieldDescriptor.getNumber(), (ByteString) entry.getValue());
                    break;
                case 12:
                    i0Var.writeUInt32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    i0Var.writeInt32(fieldDescriptor.getNumber(), ((Descriptors.EnumValueDescriptor) entry.getValue()).getNumber());
                    break;
                case 14:
                    i0Var.writeSFixed32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    i0Var.writeSFixed64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    i0Var.writeSInt32(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    i0Var.writeSInt64(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        switch (fieldDescriptor.getLiteType().ordinal()) {
            case 0:
                wa.writeDoubleList(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 1:
                wa.writeFloatList(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 2:
                wa.writeInt64List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 3:
                wa.writeUInt64List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 4:
                wa.writeInt32List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 5:
                wa.writeFixed64List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 6:
                wa.writeFixed32List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 7:
                wa.writeBoolList(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 8:
                wa.writeStringList(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var);
                break;
            case 9:
                wa.writeGroupList(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var);
                break;
            case 10:
                wa.writeMessageList(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var);
                break;
            case 11:
                wa.writeBytesList(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var);
                break;
            case 12:
                wa.writeUInt32List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 13:
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Descriptors.EnumValueDescriptor) it.next()).getNumber()));
                }
                wa.writeInt32List(fieldDescriptor.getNumber(), arrayList, i0Var, fieldDescriptor.isPacked());
                break;
            case 14:
                wa.writeSFixed32List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 15:
                wa.writeSFixed64List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 16:
                wa.writeSInt32List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
            case 17:
                wa.writeSInt64List(fieldDescriptor.getNumber(), (List) entry.getValue(), i0Var, fieldDescriptor.isPacked());
                break;
        }
    }
}
