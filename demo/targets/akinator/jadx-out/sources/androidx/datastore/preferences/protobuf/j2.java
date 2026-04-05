package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f5917a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5918b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5919c;

    public j2(r4 r4Var, Object obj, r4 r4Var2, Object obj2) {
        this.f5917a = new i2(r4Var, obj, r4Var2, obj2);
        this.f5918b = obj;
        this.f5919c = obj2;
    }

    public static int a(i2 i2Var, Object obj, Object obj2) {
        return a1.d(i2Var.f5904c, 2, obj2) + a1.d(i2Var.f5902a, 1, obj);
    }

    public static Object b(c0 c0Var, s0 s0Var, r4 r4Var, Object obj) throws IOException {
        int iOrdinal = r4Var.ordinal();
        if (iOrdinal == 9) {
            throw new RuntimeException("Groups are not allowed in maps.");
        }
        if (iOrdinal != 10) {
            return iOrdinal != 13 ? a1.readPrimitiveField(c0Var, r4Var, true) : Integer.valueOf(c0Var.readEnum());
        }
        q2 builder = ((r2) obj).toBuilder();
        c0Var.readMessage(builder, s0Var);
        return builder.buildPartial();
    }

    public static void c(l0 l0Var, i2 i2Var, Object obj, Object obj2) {
        a1.k(l0Var, i2Var.f5902a, 1, obj);
        a1.k(l0Var, i2Var.f5904c, 2, obj2);
    }

    public static <K, V> j2 newDefaultInstance(r4 r4Var, K k10, r4 r4Var2, V v10) {
        return new j2(r4Var, k10, r4Var2, v10);
    }

    public int computeMessageSize(int i10, Object obj, Object obj2) {
        int iComputeTagSize = l0.computeTagSize(i10);
        int iA = a(this.f5917a, obj, obj2);
        return l0.computeUInt32SizeNoTag(iA) + iA + iComputeTagSize;
    }

    public Object getKey() {
        return this.f5918b;
    }

    public Object getValue() {
        return this.f5919c;
    }

    public Map.Entry<Object, Object> parseEntry(x xVar, s0 s0Var) throws IOException {
        c0 c0VarNewCodedInput = xVar.newCodedInput();
        i2 i2Var = this.f5917a;
        Object objB = i2Var.f5903b;
        r4 r4Var = i2Var.f5904c;
        r4 r4Var2 = i2Var.f5902a;
        Object objB2 = i2Var.f5905d;
        while (true) {
            int tag = c0VarNewCodedInput.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == (r4Var2.getWireType() | 8)) {
                objB = b(c0VarNewCodedInput, s0Var, r4Var2, objB);
            } else if (tag == (r4Var.getWireType() | 16)) {
                objB2 = b(c0VarNewCodedInput, s0Var, r4Var, objB2);
            } else if (!c0VarNewCodedInput.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objB, objB2);
    }

    public void parseInto(k2 k2Var, c0 c0Var, s0 s0Var) throws IOException {
        int iPushLimit = c0Var.pushLimit(c0Var.readRawVarint32());
        i2 i2Var = this.f5917a;
        Object objB = i2Var.f5903b;
        Object objB2 = i2Var.f5905d;
        while (true) {
            int tag = c0Var.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == (i2Var.f5902a.getWireType() | 8)) {
                objB = b(c0Var, s0Var, i2Var.f5902a, objB);
            } else if (tag == (i2Var.f5904c.getWireType() | 16)) {
                objB2 = b(c0Var, s0Var, i2Var.f5904c, objB2);
            } else if (!c0Var.skipField(tag)) {
                break;
            }
        }
        c0Var.checkLastTagWas(0);
        c0Var.popLimit(iPushLimit);
        k2Var.put(objB, objB2);
    }

    public void serializeTo(l0 l0Var, int i10, Object obj, Object obj2) throws IOException {
        l0Var.writeTag(i10, 2);
        i2 i2Var = this.f5917a;
        l0Var.writeUInt32NoTag(a(i2Var, obj, obj2));
        c(l0Var, i2Var, obj, obj2);
    }
}
