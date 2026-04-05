package o9;

import android.widget.AdapterView;
import com.digidust.elokence.akinator.activities.HistoriquePodiumActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HistoriquePodiumActivity f78428b;

    public p1(HistoriquePodiumActivity historiquePodiumActivity) {
        this.f78428b = historiquePodiumActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
        /*
            r0 = this;
            r1 = 0
            java.lang.String r2 = "binding"
            com.digidust.elokence.akinator.activities.HistoriquePodiumActivity r4 = r0.f78428b
            if (r3 != 0) goto L31
            com.digidust.elokence.akinator.paid.databinding.ActivityHistoriquePodiumsBinding r5 = com.digidust.elokence.akinator.activities.HistoriquePodiumActivity.access$getBinding$p(r4)
            if (r5 != 0) goto L11
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r2)
            r5 = r1
        L11:
            com.digidust.elokence.akinator.graphic.spinner.AkinatorSpinner r5 = r5.spinnerYear
            kotlin.jvm.internal.e0.checkNotNull(r5)
            int r5 = r5.getSelectedIndex()
            if (r5 == 0) goto L31
            com.digidust.elokence.akinator.paid.databinding.ActivityHistoriquePodiumsBinding r3 = com.digidust.elokence.akinator.activities.HistoriquePodiumActivity.access$getBinding$p(r4)
            if (r3 != 0) goto L26
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r2)
            goto L27
        L26:
            r1 = r3
        L27:
            com.digidust.elokence.akinator.graphic.spinner.AkinatorSpinner r1 = r1.spinnerYear
            kotlin.jvm.internal.e0.checkNotNull(r1)
            r2 = 0
            r1.setSelectedIndex(r2)
            goto L5c
        L31:
            if (r3 <= 0) goto L5c
            com.digidust.elokence.akinator.paid.databinding.ActivityHistoriquePodiumsBinding r3 = com.digidust.elokence.akinator.activities.HistoriquePodiumActivity.access$getBinding$p(r4)
            if (r3 != 0) goto L3d
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r2)
            r3 = r1
        L3d:
            com.digidust.elokence.akinator.graphic.spinner.AkinatorSpinner r3 = r3.spinnerYear
            kotlin.jvm.internal.e0.checkNotNull(r3)
            int r3 = r3.getSelectedIndex()
            if (r3 != 0) goto L5c
            com.digidust.elokence.akinator.paid.databinding.ActivityHistoriquePodiumsBinding r3 = com.digidust.elokence.akinator.activities.HistoriquePodiumActivity.access$getBinding$p(r4)
            if (r3 != 0) goto L52
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException(r2)
            goto L53
        L52:
            r1 = r3
        L53:
            com.digidust.elokence.akinator.graphic.spinner.AkinatorSpinner r1 = r1.spinnerYear
            kotlin.jvm.internal.e0.checkNotNull(r1)
            r2 = 1
            r1.setSelectedIndex(r2)
        L5c:
            com.digidust.elokence.akinator.activities.HistoriquePodiumActivity.access$refreshViewHisto(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.p1.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
