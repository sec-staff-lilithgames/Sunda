package em;

import android.app.Activity;
import io.bidmachine.ContextProvider;
import io.bidmachine.RendererConfiguration;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j extends hr.h {

    /* renamed from: a, reason: collision with root package name */
    public final n f54706a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f54707b;

    public j(p pVar) {
        this.f54706a = pVar;
    }

    public abstract d0 a();

    @Override // hr.b
    public Map<String, Object> getCustomParams() {
        c0 c0Var = this.f54707b;
        if (c0Var != null) {
            return c0Var.getCustomParamsMap();
        }
        return null;
    }

    @Override // hr.b
    public void onDestroy() {
        c0 c0Var = this.f54707b;
        if (c0Var != null) {
            c0Var.destroy();
            this.f54707b = null;
        }
    }

    @Override // hr.b
    public void onShown() {
        super.onShown();
        c0 c0Var = this.f54707b;
        if (c0Var != null) {
            c0Var.onAdShown();
        }
    }

    @Override // hr.h
    public void show(ContextProvider contextProvider, hr.i iVar, RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.onAdShowFailed(pr.a.internal("Activity is null"));
            return;
        }
        c0 c0Var = this.f54707b;
        if (c0Var == null) {
            iVar.onAdShowFailed(pr.a.internal("Fullscreen object is null"));
            return;
        }
        if (c0Var.f54768h == 6) {
            iVar.onAdShowFailed(pr.a.internal("Fullscreen object is expired"));
            return;
        }
        if (this.f54707b.f54768h != 3) {
            iVar.onAdShowFailed(pr.a.internal("Fullscreen object not loaded"));
            return;
        }
        d0 d0VarA = a();
        if (d0VarA == null) {
            iVar.onAdShowFailed(pr.a.internal("Fullscreen listener is null"));
        } else {
            this.f54707b.show(activity, d0VarA);
        }
    }
}
