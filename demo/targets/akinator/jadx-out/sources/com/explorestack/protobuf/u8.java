package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u8 {

    /* renamed from: a, reason: collision with root package name */
    public final t8 f22720a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22721b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22722c;

    public u8(bd bdVar, Object obj, bd bdVar2, Object obj2) {
        this.f22720a = new t8(bdVar, obj, bdVar2, obj2);
        this.f22721b = obj;
        this.f22722c = obj2;
    }

    public static int a(t8 t8Var, Object obj, Object obj2) {
        return b6.d(t8Var.f22663c, 2, obj2) + b6.d(t8Var.f22661a, 1, obj);
    }

    public static AbstractMap.SimpleImmutableEntry b(y yVar, t8 t8Var, m5 m5Var) {
        Object objC = t8Var.f22662b;
        bd bdVar = t8Var.f22663c;
        bd bdVar2 = t8Var.f22661a;
        Object objC2 = t8Var.f22664d;
        while (true) {
            int tag = yVar.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == (bdVar2.getWireType() | 8)) {
                objC = c(yVar, m5Var, bdVar2, objC);
            } else if (tag == (bdVar.getWireType() | 16)) {
                objC2 = c(yVar, m5Var, bdVar, objC2);
            } else if (!yVar.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objC, objC2);
    }

    public static Object c(y yVar, m5 m5Var, bd bdVar, Object obj) throws IOException {
        int iOrdinal = bdVar.ordinal();
        if (iOrdinal == 9) {
            throw new RuntimeException("Groups are not allowed in maps.");
        }
        if (iOrdinal != 10) {
            return iOrdinal != 13 ? b6.readPrimitiveField(yVar, bdVar, true) : Integer.valueOf(yVar.readEnum());
        }
        MessageLite.Builder builder = ((MessageLite) obj).toBuilder();
        yVar.readMessage(builder, m5Var);
        return builder.buildPartial();
    }

    public static void d(h0 h0Var, t8 t8Var, Object obj, Object obj2) {
        b6.k(h0Var, t8Var.f22661a, 1, obj);
        b6.k(h0Var, t8Var.f22663c, 2, obj2);
    }

    public static <K, V> u8 newDefaultInstance(bd bdVar, K k10, bd bdVar2, V v10) {
        return new u8(bdVar, k10, bdVar2, v10);
    }

    public int computeMessageSize(int i10, Object obj, Object obj2) {
        int iComputeTagSize = h0.computeTagSize(i10);
        int iA = a(this.f22720a, obj, obj2);
        return h0.computeUInt32SizeNoTag(iA) + iA + iComputeTagSize;
    }

    public Object getKey() {
        return this.f22721b;
    }

    public Object getValue() {
        return this.f22722c;
    }

    public Map.Entry<Object, Object> parseEntry(ByteString byteString, m5 m5Var) throws IOException {
        return b(byteString.newCodedInput(), this.f22720a, m5Var);
    }

    public void parseInto(c9 c9Var, y yVar, m5 m5Var) throws IOException {
        int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
        t8 t8Var = this.f22720a;
        Object objC = t8Var.f22662b;
        Object objC2 = t8Var.f22664d;
        while (true) {
            int tag = yVar.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == (t8Var.f22661a.getWireType() | 8)) {
                objC = c(yVar, m5Var, t8Var.f22661a, objC);
            } else if (tag == (t8Var.f22663c.getWireType() | 16)) {
                objC2 = c(yVar, m5Var, t8Var.f22663c, objC2);
            } else if (!yVar.skipField(tag)) {
                break;
            }
        }
        yVar.checkLastTagWas(0);
        yVar.popLimit(iPushLimit);
        c9Var.put(objC, objC2);
    }

    public void serializeTo(h0 h0Var, int i10, Object obj, Object obj2) throws IOException {
        h0Var.writeTag(i10, 2);
        t8 t8Var = this.f22720a;
        h0Var.writeUInt32NoTag(a(t8Var, obj, obj2));
        d(h0Var, t8Var, obj, obj2);
    }
}
