package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC3368o0;
import com.ironsource.D0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class M2 extends AbstractC3368o0 {

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference<P2> f34828k;

    /* renamed from: l, reason: collision with root package name */
    private final a f34829l;

    /* renamed from: m, reason: collision with root package name */
    private final N2 f34830m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(C3350n0 tools, N2 adUnitData, P2 listener) {
        String strM;
        int iB;
        super(tools, adUnitData, listener, null, 8, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f34828k = new WeakReference<>(listener);
        this.f34829l = new a();
        this.f34830m = adUnitData;
        C3325ld c3325ldG = g();
        IronLog.INTERNAL.verbose("placement = " + c3325ldG);
        if (c3325ldG == null || TextUtils.isEmpty(c3325ldG.c())) {
            strM = b0.e2.m("can't load banner - %s", "format(format, *args)", 1, new Object[]{c3325ldG == null ? "placement is null" : "placement name is empty"});
            iB = C3554z0.b(adUnitData.b().a());
        } else {
            strM = null;
            iB = 510;
        }
        if (strM != null) {
            IronLog.API.error(a(strM));
            a(iB, strM);
        }
    }

    @Override // com.ironsource.AbstractC3368o0
    public C3402q0 b() {
        return new T2(this.f34830m.b(), a(m()));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends AbstractC3368o0.a implements A2 {
        public a() {
            super();
        }

        @Override // com.ironsource.A2
        public void a(C3539y2 instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(M2.this.a(instance.q()));
            P2 p22 = (P2) M2.this.f34828k.get();
            if (p22 != null) {
                p22.i();
            }
        }

        @Override // com.ironsource.AbstractC3368o0.a, com.ironsource.D
        public void b(AbstractC3553z instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            super.b(instance);
            InterfaceC3520x0 interfaceC3520x0I = M2.this.i();
            if (interfaceC3520x0I != null) {
                interfaceC3520x0I.f();
            }
        }

        @Override // com.ironsource.A2
        public void c(C3539y2 instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(M2.this.a(instance.q()));
            P2 p22 = (P2) M2.this.f34828k.get();
            if (p22 != null) {
                p22.j();
            }
        }

        @Override // com.ironsource.A2
        public void b(C3539y2 instance) {
            kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(M2.this.a(instance.q()));
            P2 p22 = (P2) M2.this.f34828k.get();
            if (p22 != null) {
                p22.m();
            }
        }
    }

    private final ISBannerSize m() {
        return f().a(this.f34830m.b().h());
    }

    public final void a(pg pgVar, InterfaceC3520x0 displayListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(displayListener, "displayListener");
        if (pgVar != null) {
            a(new C2(pgVar), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC3368o0
    public C a() {
        return new ah(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC3553z a(M2 this$0, A instanceData, G adInstancePayload) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new C3539y2(new V0(this$0.f(), D0.b.PROVIDER), instanceData, adInstancePayload, this$0.f34829l);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.l.a();
        }
        return ISBannerSize.BANNER;
    }
}
