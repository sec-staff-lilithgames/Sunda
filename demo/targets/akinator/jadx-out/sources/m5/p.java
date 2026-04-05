package m5;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import com.applovin.impl.ga;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import t3.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p extends i {

    /* renamed from: b, reason: collision with root package name */
    public final TopicsManager f74048b;

    public p(TopicsManager mTopicsManager) {
        e0.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.f74048b = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(m5.p r4, m5.b r5, zu.d<? super m5.d> r6) {
        /*
            boolean r0 = r6 instanceof m5.o
            if (r0 == 0) goto L13
            r0 = r6
            m5.o r0 = (m5.o) r0
            int r1 = r0.f74047l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74047l = r1
            goto L18
        L13:
            m5.o r0 = new m5.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f74045j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f74047l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            m5.p r4 = r0.f74044i
            tu.a0.throwOnFailure(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            tu.a0.throwOnFailure(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.convertRequest$ads_adservices_release(r5)
            r0.f74044i = r4
            r0.f74047l = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            android.adservices.topics.GetTopicsResponse r5 = li.a.b(r6)
            m5.d r4 = r4.convertResponse$ads_adservices_release(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.p.a(m5.p, m5.b, zu.d):java.lang.Object");
    }

    public final Object b(GetTopicsRequest getTopicsRequest, zu.d dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        this.f74048b.getTopics(getTopicsRequest, new ga(2), t.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public GetTopicsRequest convertRequest$ads_adservices_release(b request) {
        e0.checkNotNullParameter(request, "request");
        return c.f74034a.convertRequestWithoutRecordObservation$ads_adservices_release(request);
    }

    public d convertResponse$ads_adservices_release(GetTopicsResponse response) {
        e0.checkNotNullParameter(response, "response");
        return e.f74037a.convertResponse$ads_adservices_release(response);
    }

    @Override // m5.i
    public Object getTopics(b bVar, zu.d<? super d> dVar) {
        return a(this, bVar, dVar);
    }
}
