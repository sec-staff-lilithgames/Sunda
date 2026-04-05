package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC3438s3;
import com.ironsource.I0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.o3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3371o3<Listener extends I0> extends AbstractC3438s3<Listener> implements AdapterAdInteractionListener {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o3$a */
    public class a extends AbstractRunnableC3273ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3371o3.this.P();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o3$b */
    public class b extends AbstractRunnableC3273ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3371o3.this.S();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o3$c */
    public class c extends AbstractRunnableC3273ie {
        public c() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3371o3.this.Q();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o3$d */
    public class d extends AbstractRunnableC3273ie {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3371o3.this.T();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o3$e */
    public class e extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38024c;

        public e(int i10, String str) {
            this.f38023b = i10;
            this.f38024c = str;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            AbstractC3371o3.this.b(this.f38023b, this.f38024c);
        }
    }

    public AbstractC3371o3(InterfaceC3482ud interfaceC3482ud, C3312l0 c3312l0, BaseAdAdapter<?, ?> baseAdAdapter, C3134b1 c3134b1, C3352n2 c3352n2, Listener listener) {
        super(interfaceC3482ud, c3312l0, baseAdAdapter, c3134b1, c3352n2, listener);
    }

    @Override // com.ironsource.AbstractC3438s3
    public boolean B() {
        Object obj;
        if (this.f38340k == null || !y()) {
            return false;
        }
        try {
            obj = this.f38332c;
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String str = "isReadyToShow - exception = " + th2.getMessage() + " - state = " + this.f38334e;
            IronLog.INTERNAL.error(a(str));
            D0 d02 = this.f38333d;
            if (d02 != null) {
                d02.f33941j.g(str);
            }
        }
        if (obj instanceof AdapterAdFullScreenInterface) {
            return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.f38340k);
        }
        IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
        D0 d03 = this.f38333d;
        if (d03 != null) {
            d03.f33941j.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
        }
        return false;
    }

    public void a(Activity activity, C3325ld c3325ld) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + c3325ld.c()));
        try {
            this.f38336g = c3325ld;
            a(AbstractC3438s3.h.SHOWING);
            this.f38333d.f33940i.a(activity, j());
            Object obj = this.f38332c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.f38340k, activity, this);
                return;
            }
            ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
            D0 d02 = this.f38333d;
            if (d02 != null) {
                d02.f33941j.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            a(AbstractC3438s3.h.FAILED);
            String str = "showAd - exception = " + th2.getMessage() + " - state = " + this.f38334e;
            IronLog.INTERNAL.error(a(str));
            D0 d03 = this.f38333d;
            if (d03 != null) {
                d03.f33941j.g(str);
            }
            onAdShowFailed(C3554z0.h(this.f38330a.a()), str);
        }
    }

    public void b(boolean z10) {
        D0 d02 = this.f38333d;
        if (d02 != null) {
            d02.f33940i.a(z10);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().e()) {
            u().a(new a());
        } else {
            P();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().e()) {
            u().a(new c());
        } else {
            Q();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
        if (u().e()) {
            u().a(new e(i10, str));
        } else {
            b(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().e()) {
            u().a(new b());
        } else {
            S();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().e()) {
            u().a(new d());
        } else {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.f38346q) {
            try {
                if (this.f38334e == AbstractC3438s3.h.SHOWING) {
                    a(AbstractC3438s3.h.NONE);
                    if (this.f38333d != null) {
                        String string = "";
                        if (this.f38330a.a() == IronSource.a.REWARDED_VIDEO) {
                            String strF = ((I0) this.f38331b).f();
                            StringBuilder sb2 = new StringBuilder("otherInstanceAvailable = ");
                            sb2.append(strF.length() > 0 ? "true|".concat(strF) : "false");
                            string = sb2.toString();
                        }
                        this.f38333d.f33940i.a(j(), string);
                    }
                    ((I0) this.f38331b).a((AbstractC3371o3<?>) this);
                    return;
                }
                ironLog.error("unexpected ad closed for " + k() + " - state = " + this.f38334e);
                D0 d02 = this.f38333d;
                if (d02 != null) {
                    d02.f33941j.l("unexpected ad closed - state = " + this.f38334e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f38333d;
        if (d02 != null) {
            d02.f33940i.d(j());
        }
        ((I0) this.f38331b).c(this);
    }

    private void R() {
        IronLog.INTERNAL.verbose(d());
        ((I0) this.f38331b).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f38333d;
        if (d02 != null) {
            d02.f33940i.i(j());
        }
        ((I0) this.f38331b).d((AbstractC3371o3<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f38333d;
        if (d02 != null) {
            d02.f33940i.k(j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        AbstractC3438s3.h hVar = this.f38334e;
        if (hVar == AbstractC3438s3.h.SHOWING) {
            a(AbstractC3438s3.h.FAILED);
            D0 d02 = this.f38333d;
            if (d02 != null) {
                d02.f33940i.a(j(), i10, str, "");
            }
            ((I0) this.f38331b).a(new IronSourceError(i10, str), (AbstractC3371o3<?>) this);
            return;
        }
        String strA = a(hVar, i10, str);
        ironLog.error(a(strA));
        D0 d03 = this.f38333d;
        if (d03 != null) {
            d03.f33941j.t(strA);
        }
    }

    public static String a(AbstractC3438s3.h hVar, int i10, String str) {
        Locale locale = Locale.ENGLISH;
        return "unexpected show failed, state - " + hVar + ", error - " + i10 + " " + str;
    }
}
