package com.amazon.device.ads;

import io.bidmachine.media3.exoplayer.o0;
import io.bidmachine.media3.exoplayer.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12531c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f12533f;

    public /* synthetic */ e(boolean z10, Object obj, int i10, int i11) {
        this.f12530b = i11;
        this.f12531c = obj;
        this.f12532e = i10;
        this.f12533f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12530b) {
            case 0:
                ((DTBAdMRAIDBannerController) this.f12531c).lambda$moveResizedToDefault$0(this.f12532e, this.f12533f);
                break;
            case 1:
                ((DTBAdMRAIDBannerController) this.f12531c).lambda$moveExpandedToDefault$2(this.f12532e, this.f12533f);
                break;
            default:
                o0 o0Var = (o0) this.f12531c;
                on.a aVar = o0Var.A;
                w1[] w1VarArr = o0Var.f61437b;
                int i10 = this.f12532e;
                aVar.onRendererReadyChanged(i10, w1VarArr[i10].getTrackType(), this.f12533f);
                break;
        }
    }
}
