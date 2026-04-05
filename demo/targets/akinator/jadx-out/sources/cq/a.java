package cq;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f50871c;

    public /* synthetic */ a(e eVar, int i10) {
        this.f50870b = i10;
        this.f50871c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f50870b;
        e this$0 = this.f50871c;
        switch (i10) {
            case 0:
                int i11 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                f fVar = this$0.f50889k;
                if (fVar != null) {
                    fVar.onAdExpired(this$0);
                    break;
                }
                break;
            case 1:
                int i12 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                f fVar2 = this$0.f50889k;
                if (fVar2 != null) {
                    fVar2.onAdFinished(this$0);
                    break;
                }
                break;
            case 2:
                int i13 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                f fVar3 = this$0.f50889k;
                if (fVar3 != null) {
                    fVar3.onAdClicked(this$0);
                    break;
                }
                break;
            case 3:
                int i14 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                f fVar4 = this$0.f50889k;
                if (fVar4 != null) {
                    fVar4.onAdLoaded(this$0);
                    break;
                }
                break;
            case 4:
                int i15 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                f fVar5 = this$0.f50889k;
                if (fVar5 != null) {
                    fVar5.onAdShown(this$0);
                    break;
                }
                break;
            case 5:
                int i16 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                f fVar6 = this$0.f50889k;
                if (fVar6 != null) {
                    fVar6.onAdDisappeared(this$0);
                    break;
                }
                break;
            default:
                int i17 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                f fVar7 = this$0.f50889k;
                if (fVar7 != null) {
                    fVar7.onAdAppeared(this$0);
                    break;
                }
                break;
        }
    }
}
