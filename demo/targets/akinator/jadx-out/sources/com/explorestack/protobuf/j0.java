package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Descriptors.FieldDescriptor f22253a;

    public j0(Descriptors.FieldDescriptor fieldDescriptor) {
        this.f22253a = fieldDescriptor;
    }

    @Override // com.explorestack.protobuf.q7
    public boolean isInRange(int i10) {
        return this.f22253a.getEnumType().findValueByNumber(i10) != null;
    }
}
