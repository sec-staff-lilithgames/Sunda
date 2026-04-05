package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3538y1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f39246a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3538y1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f39246a;
    }

    public final String b() {
        return this.f39246a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3538y1) && kotlin.jvm.internal.e0.areEqual(this.f39246a, ((C3538y1) obj).f39246a);
    }

    public int hashCode() {
        return this.f39246a.hashCode();
    }

    public String toString() {
        return a.b.l("ApplicationAuctionSettings(auctionData=", this.f39246a, ")");
    }

    public C3538y1(String auctionData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionData, "auctionData");
        this.f39246a = auctionData;
    }

    public final C3538y1 a(String auctionData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionData, "auctionData");
        return new C3538y1(auctionData);
    }

    public /* synthetic */ C3538y1(String str, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ C3538y1 a(C3538y1 c3538y1, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3538y1.f39246a;
        }
        return c3538y1.a(str);
    }
}
