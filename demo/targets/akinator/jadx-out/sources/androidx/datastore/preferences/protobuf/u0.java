package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 extends t0 {
    @Override // androidx.datastore.preferences.protobuf.t0
    public final i1 a(s0 s0Var, r2 r2Var, int i10) {
        return s0Var.findLiteExtensionByNumber(r2Var, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final a1 b(Object obj) {
        return ((f1.b) obj).r();
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final Object c(d0 d0Var, i1 i1Var, s0 s0Var, a1 a1Var, Object obj) throws IOException {
        Object field;
        ArrayList arrayList;
        i1Var.getNumber();
        h1 h1Var = i1Var.f5901d;
        if (h1Var.isRepeated() && h1Var.isPacked()) {
            switch (i1Var.getLiteType().ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    d0Var.readDoubleList(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    d0Var.readFloatList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    d0Var.readInt64List(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    d0Var.readUInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    d0Var.readInt32List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    d0Var.readFixed64List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    d0Var.readFixed32List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    d0Var.readBoolList(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + h1Var.getLiteType());
                case 12:
                    arrayList = new ArrayList();
                    d0Var.readUInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    d0Var.readEnumList(arrayList);
                    h1Var.getEnumType();
                    Class cls = o3.f5966a;
                    break;
                case 14:
                    arrayList = new ArrayList();
                    d0Var.readSFixed32List(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    d0Var.readSFixed64List(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    d0Var.readSInt32List(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    d0Var.readSInt64List(arrayList);
                    break;
            }
            a1Var.setField(h1Var, arrayList);
            return obj;
        }
        Object objBuildPartial = null;
        if (i1Var.getLiteType() == r4.f5982h) {
            d0Var.readInt32();
            h1Var.getEnumType();
            throw null;
        }
        switch (i1Var.getLiteType().ordinal()) {
            case 0:
                objBuildPartial = Double.valueOf(d0Var.readDouble());
                break;
            case 1:
                objBuildPartial = Float.valueOf(d0Var.readFloat());
                break;
            case 2:
                objBuildPartial = Long.valueOf(d0Var.readInt64());
                break;
            case 3:
                objBuildPartial = Long.valueOf(d0Var.readUInt64());
                break;
            case 4:
                objBuildPartial = Integer.valueOf(d0Var.readInt32());
                break;
            case 5:
                objBuildPartial = Long.valueOf(d0Var.readFixed64());
                break;
            case 6:
                objBuildPartial = Integer.valueOf(d0Var.readFixed32());
                break;
            case 7:
                objBuildPartial = Boolean.valueOf(d0Var.readBool());
                break;
            case 8:
                objBuildPartial = d0Var.readString();
                break;
            case 9:
                if (!i1Var.isRepeated()) {
                    Object field2 = a1Var.getField(h1Var);
                    if (field2 instanceof f1) {
                        m3 m3VarSchemaFor = d3.getInstance().schemaFor((d3) field2);
                        if (!((f1) field2).j()) {
                            Object objNewInstance = m3VarSchemaFor.newInstance();
                            m3VarSchemaFor.mergeFrom(objNewInstance, field2);
                            a1Var.setField(h1Var, objNewInstance);
                            field2 = objNewInstance;
                        }
                        d0Var.mergeGroupField(field2, m3VarSchemaFor, s0Var);
                        return obj;
                    }
                }
                objBuildPartial = d0Var.readGroup(i1Var.getMessageDefaultInstance().getClass(), s0Var);
                break;
            case 10:
                if (!i1Var.isRepeated()) {
                    Object field3 = a1Var.getField(h1Var);
                    if (field3 instanceof f1) {
                        m3 m3VarSchemaFor2 = d3.getInstance().schemaFor((d3) field3);
                        if (!((f1) field3).j()) {
                            Object objNewInstance2 = m3VarSchemaFor2.newInstance();
                            m3VarSchemaFor2.mergeFrom(objNewInstance2, field3);
                            a1Var.setField(h1Var, objNewInstance2);
                            field3 = objNewInstance2;
                        }
                        d0Var.mergeMessageField(field3, m3VarSchemaFor2, s0Var);
                        return obj;
                    }
                }
                objBuildPartial = d0Var.readMessage(i1Var.getMessageDefaultInstance().getClass(), s0Var);
                break;
            case 11:
                objBuildPartial = d0Var.readBytes();
                break;
            case 12:
                objBuildPartial = Integer.valueOf(d0Var.readUInt32());
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                objBuildPartial = Integer.valueOf(d0Var.readSFixed32());
                break;
            case 15:
                objBuildPartial = Long.valueOf(d0Var.readSFixed64());
                break;
            case 16:
                objBuildPartial = Integer.valueOf(d0Var.readSInt32());
                break;
            case 17:
                objBuildPartial = Long.valueOf(d0Var.readSInt64());
                break;
        }
        if (i1Var.isRepeated()) {
            a1Var.addRepeatedField(h1Var, objBuildPartial);
            return obj;
        }
        int iOrdinal = i1Var.getLiteType().ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (field = a1Var.getField(h1Var)) != null) {
            objBuildPartial = ((r2) field).toBuilder().mergeFrom((r2) objBuildPartial).buildPartial();
        }
        a1Var.setField(h1Var, objBuildPartial);
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void d(m0 m0Var, Map.Entry entry) throws IOException {
        h1 h1Var = (h1) entry.getKey();
        if (!h1Var.isRepeated()) {
            switch (h1Var.getLiteType().ordinal()) {
                case 0:
                    m0Var.writeDouble(h1Var.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    m0Var.writeFloat(h1Var.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    m0Var.writeInt64(h1Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    m0Var.writeUInt64(h1Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    m0Var.writeInt32(h1Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    m0Var.writeFixed64(h1Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    m0Var.writeFixed32(h1Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    m0Var.writeBool(h1Var.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    m0Var.writeString(h1Var.getNumber(), (String) entry.getValue());
                    break;
                case 9:
                    m0Var.writeGroup(h1Var.getNumber(), entry.getValue(), d3.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
                case 10:
                    m0Var.writeMessage(h1Var.getNumber(), entry.getValue(), d3.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
                case 11:
                    m0Var.writeBytes(h1Var.getNumber(), (x) entry.getValue());
                    break;
                case 12:
                    m0Var.writeUInt32(h1Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    m0Var.writeInt32(h1Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    m0Var.writeSFixed32(h1Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    m0Var.writeSFixed64(h1Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    m0Var.writeSInt32(h1Var.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    m0Var.writeSInt64(h1Var.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        switch (h1Var.getLiteType().ordinal()) {
            case 0:
                o3.writeDoubleList(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 1:
                o3.writeFloatList(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 2:
                o3.writeInt64List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 3:
                o3.writeUInt64List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 4:
                o3.writeInt32List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 5:
                o3.writeFixed64List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 6:
                o3.writeFixed32List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 7:
                o3.writeBoolList(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 8:
                o3.writeStringList(h1Var.getNumber(), (List) entry.getValue(), m0Var);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    o3.writeGroupList(h1Var.getNumber(), (List) entry.getValue(), m0Var, d3.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    o3.writeMessageList(h1Var.getNumber(), (List) entry.getValue(), m0Var, d3.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                o3.writeBytesList(h1Var.getNumber(), (List) entry.getValue(), m0Var);
                break;
            case 12:
                o3.writeUInt32List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 13:
                o3.writeInt32List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 14:
                o3.writeSFixed32List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 15:
                o3.writeSFixed64List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 16:
                o3.writeSInt32List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
            case 17:
                o3.writeSInt64List(h1Var.getNumber(), (List) entry.getValue(), m0Var, h1Var.isPacked());
                break;
        }
    }
}
