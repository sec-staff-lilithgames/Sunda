package com.explorestack.protobuf;

import com.explorestack.protobuf.h6;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s9 implements ua {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f22630a;

    /* renamed from: b, reason: collision with root package name */
    public final bc f22631b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22632c;

    /* renamed from: d, reason: collision with root package name */
    public final n5 f22633d;

    public s9(bc bcVar, n5 n5Var, MessageLite messageLite) {
        this.f22631b = bcVar;
        this.f22632c = n5Var.d(messageLite);
        this.f22633d = n5Var;
        this.f22630a = messageLite;
    }

    public final boolean a(la laVar, m5 m5Var, n5 n5Var, b6 b6Var, bc bcVar, Object obj) throws IOException {
        int tag = laVar.getTag();
        MessageLite messageLite = this.f22630a;
        if (tag != 11) {
            if (hd.getTagWireType(tag) != 2) {
                return laVar.skipField();
            }
            Object objB = n5Var.b(m5Var, messageLite, hd.getTagFieldNumber(tag));
            if (objB == null) {
                return bcVar.l(obj, laVar);
            }
            n5Var.g(laVar, objB, m5Var, b6Var);
            return true;
        }
        Object objB2 = null;
        int uInt32 = 0;
        ByteString bytes = null;
        while (laVar.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = laVar.getTag();
            if (tag2 == 16) {
                uInt32 = laVar.readUInt32();
                objB2 = n5Var.b(m5Var, messageLite, uInt32);
            } else if (tag2 == 26) {
                if (objB2 != null) {
                    n5Var.g(laVar, objB2, m5Var, b6Var);
                } else {
                    bytes = laVar.readBytes();
                }
            } else if (!laVar.skipField()) {
                break;
            }
        }
        if (laVar.getTag() != 12) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objB2 != null) {
                n5Var.h(bytes, objB2, m5Var, b6Var);
                return true;
            }
            bcVar.d(obj, uInt32, bytes);
        }
        return true;
    }

    @Override // com.explorestack.protobuf.ua
    public boolean equals(Object obj, Object obj2) {
        bc bcVar = this.f22631b;
        if (!bcVar.g(obj).equals(bcVar.g(obj2))) {
            return false;
        }
        if (!this.f22632c) {
            return true;
        }
        n5 n5Var = this.f22633d;
        return n5Var.getExtensions(obj).equals(n5Var.getExtensions(obj2));
    }

    @Override // com.explorestack.protobuf.ua
    public int getSerializedSize(Object obj) {
        bc bcVar = this.f22631b;
        int i10 = bcVar.i(bcVar.g(obj));
        return this.f22632c ? this.f22633d.getExtensions(obj).getMessageSetSerializedSize() + i10 : i10;
    }

    @Override // com.explorestack.protobuf.ua
    public int hashCode(Object obj) {
        int iHashCode = this.f22631b.g(obj).hashCode();
        if (!this.f22632c) {
            return iHashCode;
        }
        return this.f22633d.getExtensions(obj).hashCode() + (iHashCode * 53);
    }

    @Override // com.explorestack.protobuf.ua
    public final boolean isInitialized(Object obj) {
        return this.f22633d.getExtensions(obj).isInitialized();
    }

    @Override // com.explorestack.protobuf.ua
    public void makeImmutable(Object obj) {
        this.f22631b.j(obj);
        this.f22633d.e(obj);
    }

    @Override // com.explorestack.protobuf.ua
    public void mergeFrom(Object obj, Object obj2) {
        Class cls = wa.f22814a;
        bc bcVar = this.f22631b;
        bcVar.o(obj, bcVar.k(bcVar.g(obj), bcVar.g(obj2)));
        if (this.f22632c) {
            n5 n5Var = this.f22633d;
            b6 extensions = n5Var.getExtensions(obj2);
            if (extensions.f21943a.isEmpty()) {
                return;
            }
            n5Var.c(obj).mergeFrom(extensions);
        }
    }

    @Override // com.explorestack.protobuf.ua
    public Object newInstance() {
        return this.f22630a.newBuilderForType().buildPartial();
    }

    @Override // com.explorestack.protobuf.ua
    public void writeTo(Object obj, kd kdVar) throws IOException {
        Iterator<Map.Entry<a6, Object>> it = this.f22633d.getExtensions(obj).iterator();
        while (it.hasNext()) {
            Map.Entry<a6, Object> next = it.next();
            a6 key = next.getKey();
            if (key.getLiteJavaType() != cd.MESSAGE || key.isRepeated() || key.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof a8) {
                ((i0) kdVar).writeMessageSetItem(key.getNumber(), ((a8) next).getField().toByteString());
            } else {
                ((i0) kdVar).writeMessageSetItem(key.getNumber(), next.getValue());
            }
        }
        bc bcVar = this.f22631b;
        bcVar.r(bcVar.g(obj), kdVar);
    }

    @Override // com.explorestack.protobuf.ua
    public void mergeFrom(Object obj, byte[] bArr, int i10, int i11, i iVar) throws IOException {
        h6 h6Var = (h6) obj;
        if (h6Var.f22197b == hc.getDefaultInstance()) {
            h6Var.f22197b = hc.a();
        }
        h6.a aVar = (h6.a) obj;
        if (aVar.f22199f.isImmutable()) {
            aVar.f22199f = aVar.f22199f.m501clone();
        }
        if (i10 < i11) {
            j.f(i10, bArr);
            throw null;
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.explorestack.protobuf.ua
    public void mergeFrom(Object obj, la laVar, m5 m5Var) throws IOException {
        bc bcVar = this.f22631b;
        Object objF = bcVar.f(obj);
        n5 n5Var = this.f22633d;
        b6 b6VarC = n5Var.c(obj);
        while (laVar.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                la laVar2 = laVar;
                m5 m5Var2 = m5Var;
                if (!a(laVar2, m5Var2, n5Var, b6VarC, bcVar, objF)) {
                    return;
                }
                laVar = laVar2;
                m5Var = m5Var2;
            } finally {
                bcVar.n(obj, objF);
            }
        }
    }
}
