package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S0 extends I1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U0 f32246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f32247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f32248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(U0 u02, String str, String str2) {
        super(u02);
        this.f32246d = u02;
        this.f32247e = str;
        this.f32248f = str2;
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        U0 u02 = (U0) this.f31862b.get();
        if (u02 != null) {
            C2793h c2793hM = u02.m();
            if (c2793hM == null || !kotlin.jvm.internal.e0.areEqual(c2793hM.s(), this.f32247e)) {
                F5 f52 = this.f32246d.f32321j;
                if (f52 != null) {
                    String strE = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                    ((G5) f52).b(strE, "Impression ID is null for saveBlob");
                    return;
                }
                return;
            }
            U0.a(u02, c2793hM, this.f32248f);
            F5 f53 = this.f32246d.f32321j;
            if (f53 != null) {
                String strE2 = U0.e();
                StringBuilder sbA = N6.a(strE2, "<get-TAG>(...)", "Updated blob ");
                sbA.append(this.f32248f);
                ((G5) f53).c(strE2, sbA.toString());
            }
        }
    }
}
