package nj;

import com.google.android.gms.measurement.AppMeasurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements mt.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f76857b;

    public b(c cVar) {
        this.f76857b = cVar;
    }

    @Override // mt.o
    public void subscribe(mt.n nVar) {
        j0.logd("Subscribing to analytics events.");
        c cVar = this.f76857b;
        yh.d dVar = cVar.f76863a;
        r rVar = new r();
        rVar.f77002a = nVar;
        cVar.f76865c = dVar.registerAnalyticsConnectorListener(AppMeasurement.FIAM_ORIGIN, rVar);
    }
}
