package o9;

import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PopPedagogiqueActivity f78221c;

    public /* synthetic */ i4(PopPedagogiqueActivity popPedagogiqueActivity, int i10) {
        this.f78220b = i10;
        this.f78221c = popPedagogiqueActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strReplace;
        da.f fVar;
        int i10 = this.f78220b;
        PopPedagogiqueActivity popPedagogiqueActivity = this.f78221c;
        switch (i10) {
            case 0:
                if (popPedagogiqueActivity.P) {
                    popPedagogiqueActivity.P = false;
                    try {
                        try {
                            if (ca.m.sharedInstance().isUserConnected()) {
                                popPedagogiqueActivity.t();
                            } else if (!ca.m.sharedInstance().isUserConnected()) {
                                ca.r.sharedInstance().depositGeniz(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
                            }
                            jb.h.sharedInstance().createOrUpdateMetricCompteur("gz_gain_video", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
                            jb.h.sharedInstance().incMetricCompteur("video_views");
                            strReplace = lb.b1.sharedInstance().getTraductionFromToken("BRAVO_TU_AS_GAGNE_GENIZ").replace("[NB_GENIZ]", "700");
                            fVar = new da.f(popPedagogiqueActivity);
                        } catch (Exception unused) {
                            if (ca.m.sharedInstance().isUserConnected()) {
                                popPedagogiqueActivity.t();
                            } else if (!ca.m.sharedInstance().isUserConnected()) {
                                ca.r.sharedInstance().depositGeniz(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
                            }
                            jb.h.sharedInstance().createOrUpdateMetricCompteur("gz_gain_video", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
                            jb.h.sharedInstance().incMetricCompteur("video_views");
                            strReplace = lb.b1.sharedInstance().getTraductionFromToken("BRAVO_TU_AS_GAGNE_GENIZ").replace("[NB_GENIZ]", "700");
                            fVar = new da.f(popPedagogiqueActivity);
                        }
                        fVar.setTypeOk(strReplace);
                        return;
                    } catch (Throwable th2) {
                        jb.h.sharedInstance().incMetricCompteur("video_views");
                        new da.f(popPedagogiqueActivity).setTypeOk(lb.b1.sharedInstance().getTraductionFromToken("BRAVO_TU_AS_GAGNE_GENIZ").replace("[NB_GENIZ]", "700"));
                        throw th2;
                    }
                }
                return;
            default:
                int i11 = PopPedagogiqueActivity.V;
                popPedagogiqueActivity.getClass();
                try {
                    popPedagogiqueActivity.D.setText(z9.e.getInstance().getNomInappGeniz(0));
                    popPedagogiqueActivity.E.setText(z9.e.getInstance().getNomInappGeniz(1));
                    popPedagogiqueActivity.F.setText(z9.e.getInstance().getNomInappGeniz(2));
                    popPedagogiqueActivity.G.setText(z9.e.getInstance().getNomInappGeniz(3));
                    popPedagogiqueActivity.H.setText(z9.e.getInstance().getNomInappGeniz(4));
                    popPedagogiqueActivity.I.setText(z9.e.getInstance().getPriceInappGeniz(0));
                    popPedagogiqueActivity.J.setText(z9.e.getInstance().getPriceInappGeniz(1));
                    popPedagogiqueActivity.K.setText(z9.e.getInstance().getPriceInappGeniz(2));
                    popPedagogiqueActivity.L.setText(z9.e.getInstance().getPriceInappGeniz(3));
                    popPedagogiqueActivity.M.setText(z9.e.getInstance().getPriceInappGeniz(4));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
