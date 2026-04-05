package o9;

import android.widget.ListAdapter;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.HistoriquePodiumActivity;
import com.digidust.elokence.akinator.paid.databinding.ActivityHistoriquePodiumsBinding;
import java.util.ArrayList;
import ta.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements st.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HistoriquePodiumActivity f78411c;

    public /* synthetic */ o1(HistoriquePodiumActivity historiquePodiumActivity, int i10) {
        this.f78410b = i10;
        this.f78411c = historiquePodiumActivity;
    }

    @Override // st.g
    public final void accept(Object obj) {
        switch (this.f78410b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                HistoriquePodiumActivity historiquePodiumActivity = this.f78411c;
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding = historiquePodiumActivity.D;
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding2 = null;
                if (activityHistoriquePodiumsBinding == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                    activityHistoriquePodiumsBinding = null;
                }
                activityHistoriquePodiumsBinding.loadingBarHistoriquePodiums.setVisibility(8);
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding3 = historiquePodiumActivity.D;
                if (activityHistoriquePodiumsBinding3 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                    activityHistoriquePodiumsBinding3 = null;
                }
                activityHistoriquePodiumsBinding3.messageErrorHistorique.setVisibility(0);
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding4 = historiquePodiumActivity.D;
                if (activityHistoriquePodiumsBinding4 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityHistoriquePodiumsBinding2 = activityHistoriquePodiumsBinding4;
                }
                TextView textView = activityHistoriquePodiumsBinding2.messageErrorHistorique;
                kotlin.jvm.internal.e0.checkNotNull(th2);
                textView.setText(th2.getMessage());
                break;
            case 1:
                k.c cVar = (k.c) obj;
                HistoriquePodiumActivity historiquePodiumActivity2 = this.f78411c;
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding5 = historiquePodiumActivity2.D;
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding6 = null;
                if (activityHistoriquePodiumsBinding5 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                    activityHistoriquePodiumsBinding5 = null;
                }
                activityHistoriquePodiumsBinding5.loadingBarLegendes.setVisibility(8);
                kotlin.jvm.internal.e0.checkNotNull(cVar);
                if (cVar.isCompletionOk() && cVar.getLegends() != null) {
                    ArrayList<k.b> legends = cVar.getLegends();
                    kotlin.jvm.internal.e0.checkNotNull(legends);
                    if (!legends.isEmpty()) {
                        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding7 = historiquePodiumActivity2.D;
                        if (activityHistoriquePodiumsBinding7 == null) {
                            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                            activityHistoriquePodiumsBinding7 = null;
                        }
                        activityHistoriquePodiumsBinding7.legendesPodium.setVisibility(0);
                        y9.j jVar = new y9.j(historiquePodiumActivity2, cVar);
                        ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding8 = historiquePodiumActivity2.D;
                        if (activityHistoriquePodiumsBinding8 == null) {
                            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityHistoriquePodiumsBinding6 = activityHistoriquePodiumsBinding8;
                        }
                        activityHistoriquePodiumsBinding6.legendesPodium.setAdapter((ListAdapter) jVar);
                        break;
                    }
                }
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding9 = historiquePodiumActivity2.D;
                if (activityHistoriquePodiumsBinding9 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                    activityHistoriquePodiumsBinding9 = null;
                }
                activityHistoriquePodiumsBinding9.messageErrorLegendes.setVisibility(0);
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding10 = historiquePodiumActivity2.D;
                if (activityHistoriquePodiumsBinding10 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityHistoriquePodiumsBinding6 = activityHistoriquePodiumsBinding10;
                }
                j1.o2.A(lb.b1.f72741d, "CLASSEMENT_NON_DISPONIBLE", activityHistoriquePodiumsBinding6.messageErrorLegendes);
                break;
            default:
                HistoriquePodiumActivity historiquePodiumActivity3 = this.f78411c;
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding11 = historiquePodiumActivity3.D;
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding12 = null;
                if (activityHistoriquePodiumsBinding11 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                    activityHistoriquePodiumsBinding11 = null;
                }
                activityHistoriquePodiumsBinding11.loadingBarLegendes.setVisibility(8);
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding13 = historiquePodiumActivity3.D;
                if (activityHistoriquePodiumsBinding13 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                    activityHistoriquePodiumsBinding13 = null;
                }
                activityHistoriquePodiumsBinding13.messageErrorLegendes.setVisibility(0);
                ActivityHistoriquePodiumsBinding activityHistoriquePodiumsBinding14 = historiquePodiumActivity3.D;
                if (activityHistoriquePodiumsBinding14 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityHistoriquePodiumsBinding12 = activityHistoriquePodiumsBinding14;
                }
                j1.o2.A(lb.b1.f72741d, "CLASSEMENT_NON_DISPONIBLE", activityHistoriquePodiumsBinding12.messageErrorLegendes);
                break;
        }
    }
}
