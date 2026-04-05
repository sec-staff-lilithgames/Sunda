package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f48528c;

    public /* synthetic */ a(int i10, int i11) {
        this.f48527b = i11;
        this.f48528c = i10;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f48527b;
        p0.w wVar = (p0.w) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return e.a(this.f48528c, wVar, iIntValue);
            case 1:
                return z.a(this.f48528c, wVar, iIntValue);
            case 2:
                return c0.a(this.f48528c, wVar, iIntValue);
            case 3:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b.a(this.f48528c, wVar, iIntValue);
            case 4:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.q.a(this.f48528c, wVar, iIntValue);
            default:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u.a(this.f48528c, wVar, iIntValue);
        }
    }
}
