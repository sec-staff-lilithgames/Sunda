package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC3371o3;
import com.ironsource.AbstractC3388p3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3353n3<Smash extends AbstractC3371o3<?>, Listener extends AdapterAdInteractionListener> extends AbstractC3388p3<Smash, Listener> implements I0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.n3$a */
    public class a extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f37947b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3325ld f37948c;

        public a(Activity activity, C3325ld c3325ld) {
            this.f37947b = activity;
            this.f37948c = c3325ld;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3353n3.this.b(this.f37947b, this.f37948c);
        }
    }

    public AbstractC3353n3(U u10, C3360na c3360na, C3161ca c3161ca) {
        super(u10, c3360na, c3161ca);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, C3325ld c3325ld) {
        AbstractC3371o3 abstractC3371o3;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(b("state = " + this.f38096p));
        synchronized (this.f38104x) {
            try {
                this.f38089i = c3325ld;
                this.f38099s.f33940i.a(activity, n());
                AbstractC3388p3.f fVar = this.f38096p;
                AbstractC3388p3.f fVar2 = AbstractC3388p3.f.SHOWING;
                abstractC3371o3 = null;
                if (fVar == fVar2) {
                    ironSourceError = new IronSourceError(C3554z0.g(this.f38095o.b()), "can't show ad while an ad is already showing");
                } else if (fVar != AbstractC3388p3.f.READY_TO_SHOW) {
                    ironSourceError = new IronSourceError(509, "show called while no ads are available");
                } else if (c3325ld == null) {
                    ironSourceError = new IronSourceError(C3554z0.b(this.f38095o.b()), "empty default placement");
                } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c3325ld, this.f38095o.b())) {
                    ironSourceError = new IronSourceError(C3554z0.f(this.f38095o.b()), "placement " + c3325ld.c() + " is capped");
                } else {
                    ironSourceError = null;
                }
                if (ironSourceError != null) {
                    IronLog.API.error(b(ironSourceError.getErrorMessage()));
                    a(ironSourceError, "");
                } else {
                    List listB = this.f38081a.b();
                    Ig ig2 = new Ig(this.f38095o);
                    abstractC3371o3 = (AbstractC3371o3) ig2.c(listB);
                    a((AbstractC3353n3<Smash, Listener>) abstractC3371o3, (List<AbstractC3353n3<Smash, Listener>>) ig2.b(listB));
                    if (abstractC3371o3 != null) {
                        a(fVar2);
                        i(abstractC3371o3);
                    } else {
                        a(ErrorBuilder.buildNoAdsToShowError(this.f38095o.b().toString()), a(listB));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (abstractC3371o3 != null) {
            a(activity, (AbstractC3371o3<?>) abstractC3371o3, this.f38089i);
        }
    }

    public void a(Activity activity, C3325ld c3325ld) {
        if (e()) {
            a(new a(activity, c3325ld));
        } else {
            b(activity, c3325ld);
        }
    }

    @Override // com.ironsource.I0
    public void c(AbstractC3371o3<?> abstractC3371o3) {
        IronLog.INTERNAL.verbose(b(abstractC3371o3.k()));
        this.f38100t.a();
    }

    @Override // com.ironsource.I0
    public void d(AbstractC3371o3<?> abstractC3371o3) {
        IronLog.INTERNAL.verbose(b(abstractC3371o3.k()));
        this.f38100t.b();
    }

    @Override // com.ironsource.I0
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f38096p == AbstractC3388p3.f.READY_TO_SHOW) {
            for (AbstractC3371o3 abstractC3371o3 : this.f38081a.b()) {
                if (abstractC3371o3.y()) {
                    sb2.append(abstractC3371o3.c());
                    sb2.append(";");
                }
            }
        }
        return sb2.toString();
    }

    @Override // com.ironsource.AbstractC3388p3
    public boolean u() {
        if (!x()) {
            return false;
        }
        if (this.f38090j && !IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f38081a.b().iterator();
        while (it.hasNext()) {
            if (((AbstractC3371o3) it.next()).B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.AbstractC3388p3
    public boolean v() {
        return false;
    }

    public AbstractC3353n3(L7 l72, K7 k72, U u10, C3360na c3360na, C3161ca c3161ca) {
        super(l72, k72, u10, c3360na, c3161ca);
    }

    private void a(Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            }
            smash2.b(false);
            IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
        }
    }

    private String a(List<Smash> list) {
        StringBuilder sb2 = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb2.append(smash.c());
                sb2.append(":");
                sb2.append(smash.e());
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    private void a(Activity activity, AbstractC3371o3<?> abstractC3371o3, C3325ld c3325ld) {
        if (this.f38095o.h().e()) {
            this.f38098r.a();
        }
        abstractC3371o3.a(activity, c3325ld);
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (AbstractC3371o3<?>) null, str);
    }

    private void a(IronSourceError ironSourceError, AbstractC3371o3<?> abstractC3371o3, String str) {
        this.f38099s.f33940i.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.f38097q.g();
        this.f38100t.a(ironSourceError, abstractC3371o3 != null ? abstractC3371o3.f() : null);
        if (this.f38095o.h().e()) {
            b(false);
        }
    }

    @Override // com.ironsource.I0
    public void a(IronSourceError ironSourceError, AbstractC3371o3<?> abstractC3371o3) {
        IronLog.INTERNAL.verbose(b(abstractC3371o3.k() + " - error = " + ironSourceError));
        this.f38082b.put(abstractC3371o3.c(), h.a.ISAuctionPerformanceFailedToShow);
        a(AbstractC3388p3.f.READY_TO_LOAD);
        a(ironSourceError, abstractC3371o3, "");
    }

    @Override // com.ironsource.I0
    public void a(AbstractC3371o3<?> abstractC3371o3) {
        IronLog.INTERNAL.verbose(b(abstractC3371o3.k()));
        if (this.f38096p == AbstractC3388p3.f.SHOWING) {
            a(AbstractC3388p3.f.READY_TO_LOAD);
        }
        this.f38097q.f();
        this.f38100t.a(abstractC3371o3.f());
    }

    @Override // com.ironsource.I0
    public void b(AbstractC3371o3<?> abstractC3371o3) {
        IronLog.INTERNAL.verbose(b(abstractC3371o3.k()));
        this.f38100t.g(abstractC3371o3.f());
    }
}
