package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f5824a = 100;

    public abstract c4 a(Object obj);

    public final boolean b(int i10, d0 d0Var, Object obj) throws IOException {
        int tag = d0Var.getTag();
        int tagFieldNumber = t4.getTagFieldNumber(tag);
        int tagWireType = t4.getTagWireType(tag);
        if (tagWireType == 0) {
            ((c4) obj).c(tagFieldNumber << 3, Long.valueOf(d0Var.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            ((c4) obj).c((tagFieldNumber << 3) | 1, Long.valueOf(d0Var.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            ((c4) obj).c((tagFieldNumber << 3) | 2, d0Var.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw u1.d();
            }
            ((c4) obj).c(5 | (tagFieldNumber << 3), Integer.valueOf(d0Var.readFixed32()));
            return true;
        }
        c4 c4VarB = c4.b();
        int i11 = tagFieldNumber << 3;
        int i12 = i11 | 4;
        int i13 = i10 + 1;
        if (i13 >= f5824a) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (d0Var.getFieldNumber() != Integer.MAX_VALUE && b(i13, d0Var, c4VarB)) {
        }
        if (i12 != d0Var.getTag()) {
            throw u1.a();
        }
        c4VarB.makeImmutable();
        ((c4) obj).c(i11 | 3, c4VarB);
        return true;
    }

    public abstract void c(Object obj, Object obj2);

    public void setRecursionLimit(int i10) {
        f5824a = i10;
    }
}
