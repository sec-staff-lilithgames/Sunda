package com.explorestack.protobuf;

import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class jc extends bc {
    public jc(boolean z10) {
    }

    @Override // com.explorestack.protobuf.bc
    public final void a(Object obj, int i10, int i11) {
        ((cc) obj).mergeField(i10, ec.newBuilder().addFixed32(i11).build());
    }

    @Override // com.explorestack.protobuf.bc
    public final void b(Object obj, int i10, long j10) {
        ((cc) obj).mergeField(i10, ec.newBuilder().addFixed64(j10).build());
    }

    @Override // com.explorestack.protobuf.bc
    public final void c(Object obj, int i10, Object obj2) {
        ((cc) obj).mergeField(i10, ec.newBuilder().addGroup((gc) obj2).build());
    }

    @Override // com.explorestack.protobuf.bc
    public final void d(Object obj, int i10, ByteString byteString) {
        ((cc) obj).mergeField(i10, ec.newBuilder().addLengthDelimited(byteString).build());
    }

    @Override // com.explorestack.protobuf.bc
    public final void e(Object obj, int i10, long j10) {
        ((cc) obj).mergeField(i10, ec.newBuilder().addVarint(j10).build());
    }

    @Override // com.explorestack.protobuf.bc
    public final Object f(Object obj) {
        return ((k7) obj).unknownFields.toBuilder();
    }

    @Override // com.explorestack.protobuf.bc
    public final Object g(Object obj) {
        return ((k7) obj).unknownFields;
    }

    @Override // com.explorestack.protobuf.bc
    public final int h(Object obj) {
        return ((gc) obj).getSerializedSize();
    }

    @Override // com.explorestack.protobuf.bc
    public final int i(Object obj) {
        return ((gc) obj).getSerializedSizeAsMessageSet();
    }

    @Override // com.explorestack.protobuf.bc
    public final Object k(Object obj, Object obj2) {
        return ((gc) obj).toBuilder().mergeFrom((gc) obj2).build();
    }

    @Override // com.explorestack.protobuf.bc
    public final Object m() {
        return gc.newBuilder();
    }

    @Override // com.explorestack.protobuf.bc
    public final void n(Object obj, Object obj2) {
        ((k7) obj).unknownFields = ((cc) obj2).build();
    }

    @Override // com.explorestack.protobuf.bc
    public final void o(Object obj, Object obj2) {
        ((k7) obj).unknownFields = (gc) obj2;
    }

    @Override // com.explorestack.protobuf.bc
    public final boolean p(la laVar) {
        return laVar.shouldDiscardUnknownFields();
    }

    @Override // com.explorestack.protobuf.bc
    public final Object q(Object obj) {
        return ((cc) obj).build();
    }

    @Override // com.explorestack.protobuf.bc
    public final void r(Object obj, kd kdVar) throws IOException {
        gc gcVar = (gc) obj;
        gcVar.getClass();
        i0 i0Var = (i0) kdVar;
        if (i0Var.fieldOrder() == jd.f22281c) {
            for (Map.Entry entry : gcVar.f22177c.entrySet()) {
                ec.a((ec) entry.getValue(), ((Integer) entry.getKey()).intValue(), i0Var);
            }
            return;
        }
        for (Map.Entry entry2 : gcVar.f22176b.entrySet()) {
            ec.a((ec) entry2.getValue(), ((Integer) entry2.getKey()).intValue(), i0Var);
        }
    }

    @Override // com.explorestack.protobuf.bc
    public final void s(Object obj, i0 i0Var) {
        ((gc) obj).a(i0Var);
    }

    @Override // com.explorestack.protobuf.bc
    public final void j(Object obj) {
    }
}
