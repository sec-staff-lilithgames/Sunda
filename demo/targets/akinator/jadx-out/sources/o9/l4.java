package o9;

import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public int f78318a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopPedagogiqueActivity f78319b;

    public l4(PopPedagogiqueActivity popPedagogiqueActivity) {
        this.f78319b = popPedagogiqueActivity;
    }

    public void ok() {
        int i10 = this.f78318a - 1;
        this.f78318a = i10;
        if (i10 == 0) {
            this.f78319b.updateUI();
        }
    }
}
