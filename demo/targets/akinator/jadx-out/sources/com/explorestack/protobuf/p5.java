package com.explorestack.protobuf;

import com.explorestack.protobuf.h6;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p5 extends n5 {
    @Override // com.explorestack.protobuf.n5
    public final int a(Map.Entry entry) {
        return ((j6) entry.getKey()).getNumber();
    }

    @Override // com.explorestack.protobuf.n5
    public final Object b(m5 m5Var, MessageLite messageLite, int i10) {
        return m5Var.findLiteExtensionByNumber(messageLite, i10);
    }

    @Override // com.explorestack.protobuf.n5
    public final b6 c(Object obj) {
        h6.a aVar = (h6.a) obj;
        if (aVar.f22199f.isImmutable()) {
            aVar.f22199f = aVar.f22199f.m501clone();
        }
        return aVar.f22199f;
    }

    @Override // com.explorestack.protobuf.n5
    public final boolean d(MessageLite messageLite) {
        return messageLite instanceof h6.a;
    }

    @Override // com.explorestack.protobuf.n5
    public final void e(Object obj) {
        ((h6.a) obj).f22199f.makeImmutable();
    }

    @Override // com.explorestack.protobuf.n5
    public final Object f(la laVar, Object obj, m5 m5Var, b6 b6Var, Object obj2, bc bcVar) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        k6 k6Var = (k6) obj;
        int number = k6Var.getNumber();
        a6 a6Var = k6Var.f22311d;
        if (!a6Var.isRepeated() || !a6Var.isPacked()) {
            if (k6Var.getLiteType() != bd.f21959i) {
                switch (k6Var.getLiteType().ordinal()) {
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
                        objValueOf = laVar.readGroup(k6Var.getMessageDefaultInstance().getClass(), m5Var);
                        break;
                    case 10:
                        objValueOf = laVar.readMessage(k6Var.getMessageDefaultInstance().getClass(), m5Var);
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
                if (a6Var.getEnumType().findValueByNumber(int32) == null) {
                    return wa.A(number, int32, obj2, bcVar);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (k6Var.isRepeated()) {
                b6Var.addRepeatedField(a6Var, objValueOf);
                return obj2;
            }
            int iOrdinal = k6Var.getLiteType().ordinal();
            if ((iOrdinal == 9 || iOrdinal == 10) && (field = b6Var.getField(a6Var)) != null) {
                objValueOf = x7.b(field, objValueOf);
            }
            b6Var.setField(a6Var, objValueOf);
            return obj2;
        }
        switch (k6Var.getLiteType().ordinal()) {
            case 0:
                arrayList = new ArrayList();
                laVar.readDoubleList(arrayList);
                break;
            case 1:
                arrayList = new ArrayList();
                laVar.readFloatList(arrayList);
                break;
            case 2:
                arrayList = new ArrayList();
                laVar.readInt64List(arrayList);
                break;
            case 3:
                arrayList = new ArrayList();
                laVar.readUInt64List(arrayList);
                break;
            case 4:
                arrayList = new ArrayList();
                laVar.readInt32List(arrayList);
                break;
            case 5:
                arrayList = new ArrayList();
                laVar.readFixed64List(arrayList);
                break;
            case 6:
                arrayList = new ArrayList();
                laVar.readFixed32List(arrayList);
                break;
            case 7:
                arrayList = new ArrayList();
                laVar.readBoolList(arrayList);
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                throw new IllegalStateException("Type cannot be packed: " + a6Var.getLiteType());
            case 12:
                arrayList = new ArrayList();
                laVar.readUInt32List(arrayList);
                break;
            case 13:
                arrayList = new ArrayList();
                laVar.readEnumList(arrayList);
                p7 enumType = a6Var.getEnumType();
                Class cls = wa.f22814a;
                if (enumType != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        Integer num = (Integer) arrayList.get(i11);
                        int iIntValue = num.intValue();
                        if (enumType.findValueByNumber(iIntValue) != null) {
                            if (i11 != i10) {
                                arrayList.set(i10, num);
                            }
                            i10++;
                        } else {
                            obj2 = wa.A(number, iIntValue, obj2, bcVar);
                        }
                    }
                    if (i10 != size) {
                        arrayList.subList(i10, size).clear();
                        break;
                    }
                }
                break;
            case 14:
                arrayList = new ArrayList();
                laVar.readSFixed32List(arrayList);
                break;
            case 15:
                arrayList = new ArrayList();
                laVar.readSFixed64List(arrayList);
                break;
            case 16:
                arrayList = new ArrayList();
                laVar.readSInt32List(arrayList);
                break;
            case 17:
                arrayList = new ArrayList();
                laVar.readSInt64List(arrayList);
                break;
        }
        b6Var.setField(a6Var, arrayList);
        return obj2;
    }

    @Override // com.explorestack.protobuf.n5
    public final void g(la laVar, Object obj, m5 m5Var, b6 b6Var) throws IOException {
        k6 k6Var = (k6) obj;
        b6Var.setField(k6Var.f22311d, laVar.readMessage(k6Var.getMessageDefaultInstance().getClass(), m5Var));
    }

    @Override // com.explorestack.protobuf.n5
    public final b6 getExtensions(Object obj) {
        return ((h6.a) obj).f22199f;
    }

    @Override // com.explorestack.protobuf.n5
    public final void h(ByteString byteString, Object obj, m5 m5Var, b6 b6Var) throws IOException {
        k6 k6Var = (k6) obj;
        MessageLite messageLiteBuildPartial = k6Var.getMessageDefaultInstance().newBuilderForType().buildPartial();
        l lVarNewInstance = l.newInstance(ByteBuffer.wrap(byteString.toByteArray()), true);
        ia.getInstance().mergeFrom(messageLiteBuildPartial, lVarNewInstance, m5Var);
        b6Var.setField(k6Var.f22311d, messageLiteBuildPartial);
        if (lVarNewInstance.getFieldNumber() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.explorestack.protobuf.n5
    public final void i(i0 i0Var, Map.Entry entry) throws IOException {
        j6 j6Var = (j6) entry.getKey();
        if (!j6Var.isRepeated()) {
            switch (j6Var.getLiteType().ordinal()) {
                case 0:
                    i0Var.writeDouble(j6Var.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    i0Var.writeFloat(j6Var.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    i0Var.writeInt64(j6Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    i0Var.writeUInt64(j6Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    i0Var.writeInt32(j6Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    i0Var.writeFixed64(j6Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    i0Var.writeFixed32(j6Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    i0Var.writeBool(j6Var.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    i0Var.writeString(j6Var.getNumber(), (String) entry.getValue());
                    break;
                case 9:
                    i0Var.writeGroup(j6Var.getNumber(), entry.getValue(), ia.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
                case 10:
                    i0Var.writeMessage(j6Var.getNumber(), entry.getValue(), ia.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
                case 11:
                    i0Var.writeBytes(j6Var.getNumber(), (ByteString) entry.getValue());
                    break;
                case 12:
                    i0Var.writeUInt32(j6Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    i0Var.writeInt32(j6Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    i0Var.writeSFixed32(j6Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    i0Var.writeSFixed64(j6Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    i0Var.writeSInt32(j6Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    i0Var.writeSInt64(j6Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        switch (j6Var.getLiteType().ordinal()) {
            case 0:
                wa.writeDoubleList(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 1:
                wa.writeFloatList(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 2:
                wa.writeInt64List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 3:
                wa.writeUInt64List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 4:
                wa.writeInt32List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 5:
                wa.writeFixed64List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 6:
                wa.writeFixed32List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 7:
                wa.writeBoolList(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 8:
                wa.writeStringList(j6Var.getNumber(), (List) entry.getValue(), i0Var);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    wa.writeGroupList(j6Var.getNumber(), (List) entry.getValue(), i0Var, ia.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    wa.writeMessageList(j6Var.getNumber(), (List) entry.getValue(), i0Var, ia.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                wa.writeBytesList(j6Var.getNumber(), (List) entry.getValue(), i0Var);
                break;
            case 12:
                wa.writeUInt32List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 13:
                wa.writeInt32List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 14:
                wa.writeSFixed32List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 15:
                wa.writeSFixed64List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 16:
                wa.writeSInt32List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
            case 17:
                wa.writeSInt64List(j6Var.getNumber(), (List) entry.getValue(), i0Var, j6Var.isPacked());
                break;
        }
    }
}
