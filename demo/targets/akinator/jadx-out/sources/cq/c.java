package cq;

import br.h0;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f50875c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f50876e;

    public /* synthetic */ c(e eVar, h0 h0Var, int i10) {
        this.f50874b = i10;
        this.f50875c = eVar;
        this.f50876e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f50874b;
        h0 error = this.f50876e;
        e this$0 = this.f50875c;
        switch (i10) {
            case 0:
                int i11 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                e0.checkNotNullParameter(error, "$error");
                f fVar = this$0.f50889k;
                if (fVar != null) {
                    fVar.onAdFailToShow(this$0, error);
                    break;
                }
                break;
            default:
                int i12 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                e0.checkNotNullParameter(error, "$error");
                f fVar2 = this$0.f50889k;
                if (fVar2 != null) {
                    fVar2.onAdFailToLoad(this$0, error);
                    break;
                }
                break;
        }
    }
}
