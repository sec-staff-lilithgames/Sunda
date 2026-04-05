package em;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends hr.e {

    /* renamed from: a, reason: collision with root package name */
    public final n f54703a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f54704b;

    public f(p pVar) {
        this.f54703a = pVar;
    }

    @Override // hr.b
    public Map<String, Object> getCustomParams() {
        a0 a0Var = this.f54704b;
        if (a0Var != null) {
            return a0Var.getCustomParamsMap();
        }
        return null;
    }

    @Override // hr.b
    public void onDestroy() {
        a0 a0Var = this.f54704b;
        if (a0Var != null) {
            a0Var.destroy();
            this.f54704b = null;
        }
    }

    @Override // hr.b
    public void onShown() {
        super.onShown();
        a0 a0Var = this.f54704b;
        if (a0Var != null) {
            a0Var.onAdShown();
        }
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.f fVar, hr.g gVar, hr.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        ((p) this.f54703a).loadBanner(networkAdUnit, new e(fVar, this));
    }
}
