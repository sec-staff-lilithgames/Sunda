package bq;

import dq.c0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class b implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9726c;

    public /* synthetic */ b(e eVar, int i10) {
        this.f9725b = i10;
        this.f9726c = eVar;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        switch (this.f9725b) {
            case 0:
                e this$0 = this.f9726c;
                e0.checkNotNullParameter(this$0, "this$0");
                f fVar = this$0.f9735c;
                if (fVar != null) {
                    fVar.onAdClicked(this$0);
                    break;
                }
                break;
            case 1:
                e this$02 = this.f9726c;
                e0.checkNotNullParameter(this$02, "this$0");
                f fVar2 = this$02.f9735c;
                if (fVar2 != null) {
                    fVar2.onAdShown(this$02);
                    break;
                }
                break;
            case 2:
                e this$03 = this.f9726c;
                e0.checkNotNullParameter(this$03, "this$0");
                f fVar3 = this$03.f9735c;
                if (fVar3 != null) {
                    fVar3.onAdLoaded(this$03);
                    break;
                }
                break;
            case 3:
                e this$04 = this.f9726c;
                e0.checkNotNullParameter(this$04, "this$0");
                f fVar4 = this$04.f9735c;
                if (fVar4 != null) {
                    fVar4.onAdAppeared(this$04);
                    break;
                }
                break;
            case 4:
                e this$05 = this.f9726c;
                e0.checkNotNullParameter(this$05, "this$0");
                f fVar5 = this$05.f9735c;
                if (fVar5 != null) {
                    fVar5.onAdExpired(this$05);
                    break;
                }
                break;
            case 5:
                e this$06 = this.f9726c;
                e0.checkNotNullParameter(this$06, "this$0");
                f fVar6 = this$06.f9735c;
                if (fVar6 != null) {
                    fVar6.onAdFinished(this$06);
                    break;
                }
                break;
            default:
                e this$07 = this.f9726c;
                e0.checkNotNullParameter(this$07, "this$0");
                f fVar7 = this$07.f9735c;
                if (fVar7 != null) {
                    fVar7.onAdDisappeared(this$07);
                    break;
                }
                break;
        }
    }
}
