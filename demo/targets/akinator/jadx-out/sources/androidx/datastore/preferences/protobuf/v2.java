package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.f1;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v2 implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f6057a;

    /* renamed from: b, reason: collision with root package name */
    public final b4 f6058b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6059c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f6060d;

    public v2(b4 b4Var, t0 t0Var, r2 r2Var) {
        this.f6058b = b4Var;
        ((u0) t0Var).getClass();
        this.f6059c = r2Var instanceof f1.b;
        this.f6060d = t0Var;
        this.f6057a = r2Var;
    }

    public final boolean a(d0 d0Var, s0 s0Var, t0 t0Var, a1 a1Var, b4 b4Var, c4 c4Var) throws IOException {
        int tag = d0Var.getTag();
        r2 r2Var = this.f6057a;
        if (tag != 11) {
            if (t4.getTagWireType(tag) != 2) {
                return d0Var.skipField();
            }
            int tagFieldNumber = t4.getTagFieldNumber(tag);
            u0 u0Var = (u0) t0Var;
            u0Var.getClass();
            i1 i1VarFindLiteExtensionByNumber = s0Var.findLiteExtensionByNumber(r2Var, tagFieldNumber);
            if (i1VarFindLiteExtensionByNumber == null) {
                return b4Var.b(0, d0Var, c4Var);
            }
            u0Var.getClass();
            a1Var.setField(i1VarFindLiteExtensionByNumber.f5901d, d0Var.readMessage(i1VarFindLiteExtensionByNumber.getMessageDefaultInstance().getClass(), s0Var));
            return true;
        }
        i1 i1VarFindLiteExtensionByNumber2 = null;
        x bytes = null;
        int uInt32 = 0;
        while (d0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = d0Var.getTag();
            if (tag2 == 16) {
                uInt32 = d0Var.readUInt32();
                ((u0) t0Var).getClass();
                i1VarFindLiteExtensionByNumber2 = s0Var.findLiteExtensionByNumber(r2Var, uInt32);
            } else if (tag2 == 26) {
                if (i1VarFindLiteExtensionByNumber2 != null) {
                    ((u0) t0Var).getClass();
                    a1Var.setField(i1VarFindLiteExtensionByNumber2.f5901d, d0Var.readMessage(i1VarFindLiteExtensionByNumber2.getMessageDefaultInstance().getClass(), s0Var));
                } else {
                    bytes = d0Var.readBytes();
                }
            } else if (!d0Var.skipField()) {
                break;
            }
        }
        if (d0Var.getTag() != 12) {
            throw u1.a();
        }
        if (bytes != null) {
            if (i1VarFindLiteExtensionByNumber2 != null) {
                ((u0) t0Var).getClass();
                q2 q2VarNewBuilderForType = i1VarFindLiteExtensionByNumber2.getMessageDefaultInstance().newBuilderForType();
                c0 c0VarNewCodedInput = bytes.newCodedInput();
                q2VarNewBuilderForType.mergeFrom(c0VarNewCodedInput, s0Var);
                a1Var.setField(i1VarFindLiteExtensionByNumber2.f5901d, q2VarNewBuilderForType.buildPartial());
                c0VarNewCodedInput.checkLastTagWas(0);
                return true;
            }
            ((d4) b4Var).getClass();
            c4Var.c((uInt32 << 3) | 2, bytes);
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public boolean equals(Object obj, Object obj2) {
        b4 b4Var = this.f6058b;
        ((d4) b4Var).getClass();
        c4 c4Var = ((f1) obj).unknownFields;
        ((d4) b4Var).getClass();
        if (!c4Var.equals(((f1) obj2).unknownFields)) {
            return false;
        }
        if (!this.f6059c) {
            return true;
        }
        t0 t0Var = this.f6060d;
        ((u0) t0Var).getClass();
        a1 a1Var = ((f1.b) obj).extensions;
        ((u0) t0Var).getClass();
        return a1Var.equals(((f1.b) obj2).extensions);
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public int getSerializedSize(Object obj) {
        ((d4) this.f6058b).getClass();
        int serializedSizeAsMessageSet = ((f1) obj).unknownFields.getSerializedSizeAsMessageSet();
        if (!this.f6059c) {
            return serializedSizeAsMessageSet;
        }
        ((u0) this.f6060d).getClass();
        return ((f1.b) obj).extensions.getMessageSetSerializedSize() + serializedSizeAsMessageSet;
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public int hashCode(Object obj) {
        ((d4) this.f6058b).getClass();
        int iHashCode = ((f1) obj).unknownFields.hashCode();
        if (!this.f6059c) {
            return iHashCode;
        }
        ((u0) this.f6060d).getClass();
        return ((f1.b) obj).extensions.hashCode() + (iHashCode * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public final boolean isInitialized(Object obj) {
        ((u0) this.f6060d).getClass();
        return ((f1.b) obj).extensions.isInitialized();
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public void makeImmutable(Object obj) {
        ((d4) this.f6058b).getClass();
        ((f1) obj).unknownFields.makeImmutable();
        ((u0) this.f6060d).getClass();
        ((f1.b) obj).extensions.makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public void mergeFrom(Object obj, Object obj2) {
        o3.k(this.f6058b, obj, obj2);
        if (this.f6059c) {
            ((u0) this.f6060d).getClass();
            a1 a1Var = ((f1.b) obj2).extensions;
            if (a1Var.f5797a.isEmpty()) {
                return;
            }
            ((f1.b) obj).r().mergeFrom(a1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public Object newInstance() {
        r2 r2Var = this.f6057a;
        return r2Var instanceof f1 ? ((f1) r2Var).l() : r2Var.newBuilderForType().buildPartial();
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public void writeTo(Object obj, v4 v4Var) throws IOException {
        ((u0) this.f6060d).getClass();
        Iterator<Map.Entry<z0, Object>> it = ((f1.b) obj).extensions.iterator();
        while (it.hasNext()) {
            Map.Entry<z0, Object> next = it.next();
            h1 h1Var = (h1) next.getKey();
            if (h1Var.getLiteJavaType() != s4.MESSAGE || h1Var.isRepeated() || h1Var.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof x1) {
                ((m0) v4Var).writeMessageSetItem(h1Var.getNumber(), ((x1) next).getField().toByteString());
            } else {
                ((m0) v4Var).writeMessageSetItem(h1Var.getNumber(), next.getValue());
            }
        }
        ((d4) this.f6058b).getClass();
        c4 c4Var = ((f1) obj).unknownFields;
        c4Var.getClass();
        m0 m0Var = (m0) v4Var;
        if (m0Var.fieldOrder() == u4.f6038c) {
            for (int i10 = c4Var.f5838a - 1; i10 >= 0; i10--) {
                m0Var.writeMessageSetItem(t4.getTagFieldNumber(c4Var.f5839b[i10]), c4Var.f5840c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < c4Var.f5838a; i11++) {
            m0Var.writeMessageSetItem(t4.getTagFieldNumber(c4Var.f5839b[i11]), c4Var.f5840c[i11]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    @Override // androidx.datastore.preferences.protobuf.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mergeFrom(java.lang.Object r17, byte[] r18, int r19, int r20, androidx.datastore.preferences.protobuf.f r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.v2.mergeFrom(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.f):void");
    }

    @Override // androidx.datastore.preferences.protobuf.m3
    public void mergeFrom(Object obj, g3 g3Var, s0 s0Var) throws IOException {
        b4 b4Var = this.f6058b;
        c4 c4VarA = b4Var.a(obj);
        t0 t0Var = this.f6060d;
        ((u0) t0Var).getClass();
        a1 a1VarR = ((f1.b) obj).r();
        while (true) {
            try {
                d0 d0Var = (d0) g3Var;
                if (d0Var.getFieldNumber() != Integer.MAX_VALUE) {
                    s0 s0Var2 = s0Var;
                    if (!a(d0Var, s0Var2, t0Var, a1VarR, b4Var, c4VarA)) {
                        break;
                    } else {
                        s0Var = s0Var2;
                    }
                } else {
                    break;
                }
            } finally {
                ((f1) obj).unknownFields = c4VarA;
            }
        }
    }
}
