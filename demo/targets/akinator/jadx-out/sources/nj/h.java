package nj;

import android.app.Application;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f76918a;

    /* renamed from: b, reason: collision with root package name */
    public final Application f76919b;

    /* renamed from: c, reason: collision with root package name */
    public final qj.a f76920c;

    /* renamed from: d, reason: collision with root package name */
    public FetchEligibleCampaignsResponse f76921d;

    public h(q0 q0Var, Application application, qj.a aVar) {
        this.f76918a = q0Var;
        this.f76919b = application;
        this.f76920c = aVar;
    }

    public mt.s get() {
        final int i10 = 0;
        final int i11 = 1;
        return mt.s.fromCallable(new com.vungle.ads.internal.session.a(this, 4)).switchIfEmpty(this.f76918a.read(FetchEligibleCampaignsResponse.parser()).doOnSuccess(new st.g(this) { // from class: nj.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f76899c;

            {
                this.f76899c = this;
            }

            @Override // st.g
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f76899c.f76921d = (FetchEligibleCampaignsResponse) obj;
                        break;
                    default:
                        this.f76899c.f76921d = null;
                        break;
                }
            }
        })).filter(new ha.a(this, 22)).doOnError(new st.g(this) { // from class: nj.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f76899c;

            {
                this.f76899c = this;
            }

            @Override // st.g
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f76899c.f76921d = (FetchEligibleCampaignsResponse) obj;
                        break;
                    default:
                        this.f76899c.f76921d = null;
                        break;
                }
            }
        });
    }

    public mt.c put(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        return this.f76918a.write(fetchEligibleCampaignsResponse).doOnComplete(new f(0, this, fetchEligibleCampaignsResponse));
    }
}
