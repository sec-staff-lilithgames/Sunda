package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f32146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f32147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(U0 u02, byte[] bArr) {
        super(0);
        this.f32146a = u02;
        this.f32147b = bArr;
    }

    @Override // kv.a
    public final Object invoke() {
        this.f32146a.d((byte) 1);
        F5 f52 = this.f32146a.f32321j;
        if (f52 != null) {
            String strE = U0.e();
            StringBuilder sbA = N6.a(strE, "<get-TAG>(...)", "AdUnit ");
            sbA.append(this.f32146a);
            sbA.append(" state - LOADING");
            ((G5) f52).d(strE, sbA.toString());
        }
        F5 f53 = this.f32146a.f32321j;
        if (f53 != null) {
            String strE2 = U0.e();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
            ((G5) f53).c(strE2, "starting load with response worker");
        }
        A aW = this.f32146a.w();
        int iHashCode = this.f32146a.hashCode();
        U0 u02 = this.f32146a;
        C2888ma c2888maI = u02.I();
        kotlin.jvm.internal.e0.checkNotNull(c2888maI);
        C2699b7 c2699b7 = new C2699b7(u02, c2888maI, this.f32147b, this.f32146a.f32321j);
        aW.getClass();
        A.a(iHashCode, c2699b7);
        return tu.x0.f87415a;
    }
}
