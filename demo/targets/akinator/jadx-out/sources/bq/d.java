package bq;

import br.h0;
import dq.c0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class d implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9731c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f9732e;

    public /* synthetic */ d(e eVar, h0 h0Var, int i10) {
        this.f9730b = i10;
        this.f9731c = eVar;
        this.f9732e = h0Var;
    }

    @Override // dq.c0, ir.k
    public final void onRun() {
        switch (this.f9730b) {
            case 0:
                e this$0 = this.f9731c;
                e0.checkNotNullParameter(this$0, "this$0");
                h0 error = this.f9732e;
                e0.checkNotNullParameter(error, "$error");
                f fVar = this$0.f9735c;
                if (fVar != null) {
                    fVar.onAdFailToLoad(this$0, error);
                    break;
                }
                break;
            default:
                e this$02 = this.f9731c;
                e0.checkNotNullParameter(this$02, "this$0");
                h0 error2 = this.f9732e;
                e0.checkNotNullParameter(error2, "$error");
                f fVar2 = this$02.f9735c;
                if (fVar2 != null) {
                    fVar2.onAdFailToShow(this$02, error2);
                    break;
                }
                break;
        }
    }
}
