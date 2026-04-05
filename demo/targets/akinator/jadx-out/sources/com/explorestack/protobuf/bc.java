package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class bc {
    public abstract void a(Object obj, int i10, int i11);

    public abstract void b(Object obj, int i10, long j10);

    public abstract void c(Object obj, int i10, Object obj2);

    public abstract void d(Object obj, int i10, ByteString byteString);

    public abstract void e(Object obj, int i10, long j10);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final boolean l(Object obj, la laVar) throws InvalidProtocolBufferException {
        int tag = laVar.getTag();
        int tagFieldNumber = hd.getTagFieldNumber(tag);
        int tagWireType = hd.getTagWireType(tag);
        if (tagWireType == 0) {
            e(obj, tagFieldNumber, laVar.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            b(obj, tagFieldNumber, laVar.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            d(obj, tagFieldNumber, laVar.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a(obj, tagFieldNumber, laVar.readFixed32());
            return true;
        }
        Object objM = m();
        int i10 = 4 | (tagFieldNumber << 3);
        while (laVar.getFieldNumber() != Integer.MAX_VALUE && l(objM, laVar)) {
        }
        if (i10 != laVar.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        c(obj, tagFieldNumber, q(objM));
        return true;
    }

    public abstract Object m();

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public abstract boolean p(la laVar);

    public abstract Object q(Object obj);

    public abstract void r(Object obj, kd kdVar);

    public abstract void s(Object obj, i0 i0Var);
}
