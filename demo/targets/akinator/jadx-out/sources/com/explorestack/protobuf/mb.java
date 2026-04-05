package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class mb implements h9 {

    /* renamed from: a, reason: collision with root package name */
    public final ha f22378a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22379b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f22380c;

    /* renamed from: d, reason: collision with root package name */
    public final x5[] f22381d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f22382e;

    public mb(ha haVar, boolean z10, int[] iArr, x5[] x5VarArr, Object obj) {
        this.f22378a = haVar;
        this.f22379b = z10;
        this.f22380c = iArr;
        this.f22381d = x5VarArr;
        x7.a(obj, "defaultInstance");
        this.f22382e = (MessageLite) obj;
    }

    public static lb newBuilder() {
        return new lb();
    }

    public int[] getCheckInitialized() {
        return this.f22380c;
    }

    @Override // com.explorestack.protobuf.h9
    public MessageLite getDefaultInstance() {
        return this.f22382e;
    }

    public x5[] getFields() {
        return this.f22381d;
    }

    @Override // com.explorestack.protobuf.h9
    public ha getSyntax() {
        return this.f22378a;
    }

    @Override // com.explorestack.protobuf.h9
    public boolean isMessageSetWireFormat() {
        return this.f22379b;
    }

    public static lb newBuilder(int i10) {
        return new lb(i10);
    }
}
