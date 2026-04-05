package em;

import android.content.Context;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.GAMAdapter;
import io.bidmachine.protobuf.Waterfall;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f54719f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final Object f54720g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final pr.n f54721a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f54722b;

    /* renamed from: c, reason: collision with root package name */
    public final fm.b f54723c;

    /* renamed from: d, reason: collision with root package name */
    public final d f54724d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f54725e;

    public p(Context context, GAMAdapter.a aVar, Waterfall.Context context2, fm.b bVar) {
        d dVar;
        d dVar2;
        String networkKey = aVar.getNetworkKey();
        HashMap map = f54719f;
        d dVar3 = (d) map.get(networkKey);
        if (dVar3 != null) {
            dVar2 = dVar3;
        } else {
            synchronized (f54720g) {
                try {
                    dVar = (d) map.get(networkKey);
                    if (dVar == null) {
                        dVar = new d(networkKey);
                        map.put(networkKey, dVar);
                    }
                } finally {
                }
            }
            dVar2 = dVar;
        }
        this.f54721a = new pr.n(aVar.getNetworkName() + AndroidInitializeBoldSDK.MSG_NETWORK);
        this.f54722b = new AtomicBoolean(false);
        fm.b bVar2 = bVar;
        this.f54723c = bVar2;
        this.f54724d = dVar2;
        this.f54725e = new EnumMap(AdsFormat.class);
        i iVar = new i(context2.getEventConfig());
        m0 m0Var = new m0();
        for (Waterfall.Configuration configuration : context2.getConfigurationsList()) {
            AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(configuration.getFormat());
            if (adsFormatByRemoteName != null) {
                this.f54725e.put((EnumMap) adsFormatByRemoteName, (AdsFormat) new r0(context, aVar, adsFormatByRemoteName, configuration, bVar2, this, dVar2, iVar, m0Var));
                bVar2 = bVar;
            }
        }
    }

    public static void a(y yVar, u uVar, pr.a aVar) {
        if (uVar != null) {
            uVar.destroy();
        }
        if (aVar == null) {
            aVar = pr.a.f81798p;
        }
        ((g) yVar).onAdLoadFailed(aVar);
    }

    @Override // em.n
    public void cache() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            cacheWaterfall(adsFormat, false);
        }
    }

    @Override // em.n
    public boolean cacheWaterfall(AdsFormat adsFormat, boolean z10) {
        r0 r0Var = (r0) this.f54725e.get(adsFormat);
        if (r0Var == null) {
            return false;
        }
        r0Var.load(z10);
        return true;
    }

    @Override // em.n
    public String getVersion() {
        try {
            vr.a version = this.f54723c.getVersion();
            if (version != null) {
                return version.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // em.n
    public void init(Context context) {
        if (this.f54722b.getAndSet(true)) {
            return;
        }
        try {
            this.f54723c.initialize(context);
        } catch (Throwable unused) {
        }
    }

    @Override // em.n
    public boolean isInitialized() {
        return this.f54722b.get();
    }

    @Override // em.n
    public void loadBanner(NetworkAdUnit networkAdUnit, b0 b0Var) {
        u uVarC = this.f54724d.c(networkAdUnit);
        if (uVarC == null) {
            nm.a.d(this.f54721a, new o(networkAdUnit, 1));
            a(b0Var, null, pr.a.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else {
            if (!(uVarC instanceof a0)) {
                a(b0Var, uVarC, pr.a.internal("InternalAd object has an incompatible ad type"));
                return;
            }
            uVarC.setAdPresentListener(b0Var);
            ((e) b0Var).onAdLoaded(uVarC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // em.n
    public void loadInterstitial(NetworkAdUnit networkAdUnit, f0 f0Var) {
        u uVarC = this.f54724d.c(networkAdUnit);
        if (uVarC == null) {
            nm.a.d(this.f54721a, new o(networkAdUnit, 0));
            a(f0Var, null, pr.a.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else {
            if (!(uVarC instanceof e0)) {
                a(f0Var, uVarC, pr.a.internal("InternalAd object has an incompatible ad type"));
                return;
            }
            uVarC.setAdPresentListener(f0Var);
            ((k) f0Var).onAdLoaded(uVarC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // em.n
    public void loadRewarded(NetworkAdUnit networkAdUnit, i0 i0Var) {
        u uVarC = this.f54724d.c(networkAdUnit);
        if (uVarC == null) {
            nm.a.d(this.f54721a, new o(networkAdUnit, 2));
            a(i0Var, null, pr.a.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else {
            if (!(uVarC instanceof h0)) {
                a(i0Var, uVarC, pr.a.internal("InternalAd object has an incompatible ad type"));
                return;
            }
            uVarC.setAdPresentListener(i0Var);
            ((k) i0Var).onAdLoaded(uVarC);
        }
    }

    @Override // em.n
    public v reserveMostExpensiveAd(NetworkAdUnit networkAdUnit, AdsFormat adsFormat) {
        AdsFormat parent;
        d dVar = this.f54724d;
        u uVarG = dVar.g(networkAdUnit, adsFormat);
        return (uVarG != null || (parent = adsFormat.getParent()) == null) ? uVarG : dVar.g(networkAdUnit, parent);
    }

    @Override // em.n
    public void unReserveAd(NetworkAdUnit networkAdUnit) {
        this.f54724d.j(networkAdUnit);
    }

    @Override // em.n
    public void cache(AdsFormat adsFormat) {
        AdsFormat parent;
        if (cacheWaterfall(adsFormat, false) || (parent = adsFormat.getParent()) == null) {
            return;
        }
        cacheWaterfall(parent, false);
    }
}
