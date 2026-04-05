package o9;

import android.content.Intent;
import android.widget.ImageView;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u0 implements da.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aa.e f78580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f78581c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f78582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f78583e;

    public u0(v0 v0Var, int i10, aa.e eVar, ImageView imageView, String str) {
        this.f78583e = v0Var;
        this.f78579a = i10;
        this.f78580b = eVar;
        this.f78581c = imageView;
        this.f78582d = str;
    }

    @Override // da.g
    public void onCloseConfirme() {
        boolean zIsUserConnected = ca.m.sharedInstance().isUserConnected();
        String str = this.f78582d;
        ImageView imageView = this.f78581c;
        aa.e eVar = this.f78580b;
        int i10 = this.f78579a;
        v0 v0Var = this.f78583e;
        if (zIsUserConnected) {
            if (ca.r.sharedInstance().getGenizBalanceAccount() < i10) {
                v0Var.f78619m.disableAdOneTime();
                Intent intent = new Intent(v0Var.f78619m, (Class<?>) PopPedagogiqueActivity.class);
                intent.putExtra("PostPedagogiqueActivityModeGz", true);
                v0Var.startActivity(intent);
                return;
            }
            jb.h.sharedInstance().incMetricCompteur("nb_unlocked_clues_geniz");
            aa.f.sharedInstance().unlockIndice(eVar);
            mt.b0.fromCallable(new k0(i10, 1)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new ca.b(13));
            imageView.setImageResource(R.drawable.icon_indice_dispo);
            v0Var.displayIndice(str);
            return;
        }
        if (ca.r.sharedInstance().getGenizBalance() < i10) {
            v0Var.f78619m.disableAdOneTime();
            Intent intent2 = new Intent(v0Var.f78619m, (Class<?>) PopPedagogiqueActivity.class);
            intent2.putExtra("PostPedagogiqueActivityModeGz", true);
            v0Var.startActivity(intent2);
            return;
        }
        jb.h.sharedInstance().incMetricCompteur("nb_unlocked_clues_geniz");
        aa.f.sharedInstance().unlockIndice(eVar);
        ca.r.sharedInstance().withdrawGeniz(i10);
        imageView.setImageResource(R.drawable.icon_indice_dispo);
        v0Var.displayIndice(str);
    }

    @Override // da.g
    public void onClosedRefuse() {
    }

    @Override // da.g
    public void onCloseConfirme(String str) {
        onCloseConfirme();
    }
}
