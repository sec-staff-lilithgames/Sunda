package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ld, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3325ld extends AbstractC3506w3 {

    /* renamed from: e, reason: collision with root package name */
    private String f37167e;

    /* renamed from: f, reason: collision with root package name */
    private int f37168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3325ld(int i10, String placementName, boolean z10, String rewardName, int i11, C3343md c3343md) {
        super(i10, placementName, z10, c3343md);
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.e0.checkNotNullParameter(rewardName, "rewardName");
        this.f37168f = i11;
        this.f37167e = rewardName;
    }

    public final int e() {
        return this.f37168f;
    }

    public final String f() {
        return this.f37167e;
    }

    @Override // com.ironsource.AbstractC3506w3
    public String toString() {
        return super.toString() + ", reward name: " + this.f37167e + " , amount: " + this.f37168f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3325ld(AbstractC3506w3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        this.f37167e = "";
    }
}
