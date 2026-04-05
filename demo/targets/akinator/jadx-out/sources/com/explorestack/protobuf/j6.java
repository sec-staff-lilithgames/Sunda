package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j6 implements a6 {

    /* renamed from: b, reason: collision with root package name */
    public final p7 f22272b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22273c;

    /* renamed from: e, reason: collision with root package name */
    public final bd f22274e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22275f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22276g;

    public j6(p7 p7Var, int i10, bd bdVar, boolean z10, boolean z11) {
        this.f22272b = p7Var;
        this.f22273c = i10;
        this.f22274e = bdVar;
        this.f22275f = z10;
        this.f22276g = z11;
    }

    @Override // com.explorestack.protobuf.a6
    public p7 getEnumType() {
        return this.f22272b;
    }

    @Override // com.explorestack.protobuf.a6
    public cd getLiteJavaType() {
        return this.f22274e.getJavaType();
    }

    @Override // com.explorestack.protobuf.a6
    public bd getLiteType() {
        return this.f22274e;
    }

    @Override // com.explorestack.protobuf.a6
    public int getNumber() {
        return this.f22273c;
    }

    @Override // com.explorestack.protobuf.a6
    public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        if (builder != null) {
            throw new ClassCastException();
        }
        throw null;
    }

    @Override // com.explorestack.protobuf.a6
    public boolean isPacked() {
        return this.f22276g;
    }

    @Override // com.explorestack.protobuf.a6
    public boolean isRepeated() {
        return this.f22275f;
    }

    @Override // java.lang.Comparable
    public int compareTo(j6 j6Var) {
        return this.f22273c - j6Var.f22273c;
    }
}
