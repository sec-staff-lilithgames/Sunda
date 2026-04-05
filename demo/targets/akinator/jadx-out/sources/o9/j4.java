package o9;

import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements z9.b, z9.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopPedagogiqueActivity f78260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4 f78261c;

    public /* synthetic */ j4(PopPedagogiqueActivity popPedagogiqueActivity, l4 l4Var) {
        this.f78260b = popPedagogiqueActivity;
        this.f78261c = l4Var;
    }

    @Override // z9.b
    public void onInappDetailsUpdate(boolean z10) {
        int i10 = PopPedagogiqueActivity.V;
        if (z10) {
            this.f78261c.ok();
        } else {
            PopPedagogiqueActivity popPedagogiqueActivity = this.f78260b;
            popPedagogiqueActivity.runOnUiThread(new a(popPedagogiqueActivity, 4));
        }
    }

    @Override // z9.d
    public void onInappPurchasesRequested(boolean z10) {
        int i10 = PopPedagogiqueActivity.V;
        if (z10) {
            this.f78261c.ok();
        } else {
            PopPedagogiqueActivity popPedagogiqueActivity = this.f78260b;
            popPedagogiqueActivity.runOnUiThread(new a(popPedagogiqueActivity, 4));
        }
    }
}
