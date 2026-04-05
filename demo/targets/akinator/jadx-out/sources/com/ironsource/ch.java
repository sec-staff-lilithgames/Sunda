package com.ironsource;

import android.view.View;
import com.ironsource.Qf;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class ch implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36193c;

    public /* synthetic */ ch(Object obj, int i10) {
        this.f36192b = i10;
        this.f36193c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36192b) {
            case 0:
                Ae.a((InterfaceC3432re) this.f36193c);
                break;
            case 1:
                Ae.a((IronSourceError) this.f36193c);
                break;
            case 2:
                Ae.b((Me) this.f36193c);
                break;
            case 3:
                Na.a((Na) this.f36193c);
                break;
            case 4:
                P9.a((InitListener) this.f36193c);
                break;
            case 5:
                Qf.e((Qf) this.f36193c);
                break;
            case 6:
                Qf.a((V8) this.f36193c);
                break;
            case 7:
                Qf.b.a((Qf.b) this.f36193c);
                break;
            case 8:
                X2.a.a((View) this.f36193c);
                break;
            case 9:
                C3199ec.a((C3199ec) this.f36193c);
                break;
            case 10:
                AbstractC3368o0.e((AbstractC3368o0) this.f36193c);
                break;
            case 11:
                C3458t6.h((C3458t6) this.f36193c);
                break;
            default:
                C3568ze.b((C3483ue) this.f36193c);
                break;
        }
    }
}
