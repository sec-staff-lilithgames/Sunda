package com.explorestack.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ic extends bc {
    @Override // com.explorestack.protobuf.bc
    public final void a(Object obj, int i10, int i11) {
        ((hc) obj).b((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.explorestack.protobuf.bc
    public final void b(Object obj, int i10, long j10) {
        ((hc) obj).b((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.explorestack.protobuf.bc
    public final void c(Object obj, int i10, Object obj2) {
        ((hc) obj).b((i10 << 3) | 3, (hc) obj2);
    }

    @Override // com.explorestack.protobuf.bc
    public final void d(Object obj, int i10, ByteString byteString) {
        ((hc) obj).b((i10 << 3) | 2, byteString);
    }

    @Override // com.explorestack.protobuf.bc
    public final void e(Object obj, int i10, long j10) {
        ((hc) obj).b(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.explorestack.protobuf.bc
    public final Object f(Object obj) {
        h6 h6Var = (h6) obj;
        hc hcVar = h6Var.f22197b;
        if (hcVar != hc.getDefaultInstance()) {
            return hcVar;
        }
        hc hcVarA = hc.a();
        h6Var.f22197b = hcVarA;
        return hcVarA;
    }

    @Override // com.explorestack.protobuf.bc
    public final Object g(Object obj) {
        return ((h6) obj).f22197b;
    }

    @Override // com.explorestack.protobuf.bc
    public final int h(Object obj) {
        return ((hc) obj).getSerializedSize();
    }

    @Override // com.explorestack.protobuf.bc
    public final int i(Object obj) {
        return ((hc) obj).getSerializedSizeAsMessageSet();
    }

    @Override // com.explorestack.protobuf.bc
    public final void j(Object obj) {
        ((h6) obj).f22197b.makeImmutable();
    }

    @Override // com.explorestack.protobuf.bc
    public final Object k(Object obj, Object obj2) {
        hc hcVar = (hc) obj;
        hc hcVar2 = (hc) obj2;
        if (hcVar2.equals(hc.getDefaultInstance())) {
            return hcVar;
        }
        int i10 = hcVar.f22209a + hcVar2.f22209a;
        int[] iArrCopyOf = Arrays.copyOf(hcVar.f22210b, i10);
        System.arraycopy(hcVar2.f22210b, 0, iArrCopyOf, hcVar.f22209a, hcVar2.f22209a);
        Object[] objArrCopyOf = Arrays.copyOf(hcVar.f22211c, i10);
        System.arraycopy(hcVar2.f22211c, 0, objArrCopyOf, hcVar.f22209a, hcVar2.f22209a);
        return new hc(i10, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // com.explorestack.protobuf.bc
    public final Object m() {
        return hc.a();
    }

    @Override // com.explorestack.protobuf.bc
    public final void n(Object obj, Object obj2) {
        ((h6) obj).f22197b = (hc) obj2;
    }

    @Override // com.explorestack.protobuf.bc
    public final void o(Object obj, Object obj2) {
        ((h6) obj).f22197b = (hc) obj2;
    }

    @Override // com.explorestack.protobuf.bc
    public final boolean p(la laVar) {
        return false;
    }

    @Override // com.explorestack.protobuf.bc
    public final Object q(Object obj) {
        hc hcVar = (hc) obj;
        hcVar.makeImmutable();
        return hcVar;
    }

    @Override // com.explorestack.protobuf.bc
    public final void r(Object obj, kd kdVar) throws IOException {
        hc hcVar = (hc) obj;
        hcVar.getClass();
        i0 i0Var = (i0) kdVar;
        if (i0Var.fieldOrder() == jd.f22281c) {
            for (int i10 = hcVar.f22209a - 1; i10 >= 0; i10--) {
                i0Var.writeMessageSetItem(hd.getTagFieldNumber(hcVar.f22210b[i10]), hcVar.f22211c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < hcVar.f22209a; i11++) {
            i0Var.writeMessageSetItem(hd.getTagFieldNumber(hcVar.f22210b[i11]), hcVar.f22211c[i11]);
        }
    }

    @Override // com.explorestack.protobuf.bc
    public final void s(Object obj, i0 i0Var) throws IOException {
        ((hc) obj).writeTo(i0Var);
    }
}
