package l5;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import com.applovin.impl.ga;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import t3.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h extends c {

    /* renamed from: b, reason: collision with root package name */
    public final MeasurementManager f72418b;

    public h(MeasurementManager mMeasurementManager) {
        e0.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f72418b = mMeasurementManager;
    }

    public static Object a(h hVar, a aVar, zu.d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        hVar.f72418b.deleteRegistrations(aVar.convertToAdServices$ads_adservices_release(), new ga(2), t.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    public static Object b(h hVar, zu.d<? super Integer> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        hVar.f72418b.getMeasurementApiStatus(new ga(2), t.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public static Object c(h hVar, Uri uri, InputEvent inputEvent, zu.d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        hVar.f72418b.registerSource(uri, inputEvent, new ga(2), t.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    public static /* synthetic */ Object d(h hVar, i iVar, zu.d<? super x0> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new g(hVar, iVar, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : x0.f87415a;
    }

    public static Object e(h hVar, Uri uri, zu.d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        hVar.f72418b.registerTrigger(uri, new ga(2), t.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    public static Object f(h hVar, k kVar, zu.d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        hVar.f72418b.registerWebSource(kVar.convertToAdServices$ads_adservices_release(), new ga(2), t.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    public static Object g(h hVar, m mVar, zu.d<? super x0> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        hVar.f72418b.registerWebTrigger(mVar.convertToAdServices$ads_adservices_release(), new ga(2), t.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : x0.f87415a;
    }

    @Override // l5.c
    public Object deleteRegistrations(a aVar, zu.d<? super x0> dVar) {
        return a(this, aVar, dVar);
    }

    @Override // l5.c
    public Object getMeasurementApiStatus(zu.d<? super Integer> dVar) {
        return b(this, dVar);
    }

    @Override // l5.c
    public Object registerSource(Uri uri, InputEvent inputEvent, zu.d<? super x0> dVar) {
        return c(this, uri, inputEvent, dVar);
    }

    @Override // l5.c
    public Object registerTrigger(Uri uri, zu.d<? super x0> dVar) {
        return e(this, uri, dVar);
    }

    @Override // l5.c
    public Object registerWebSource(k kVar, zu.d<? super x0> dVar) {
        return f(this, kVar, dVar);
    }

    @Override // l5.c
    public Object registerWebTrigger(m mVar, zu.d<? super x0> dVar) {
        return g(this, mVar, dVar);
    }

    @Override // l5.c
    public Object registerSource(i iVar, zu.d<? super x0> dVar) {
        return d(this, iVar, dVar);
    }
}
