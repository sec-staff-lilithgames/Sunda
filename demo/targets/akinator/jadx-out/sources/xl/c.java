package xl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import br.b0;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends hr.e {

    /* renamed from: a, reason: collision with root package name */
    public cq.e f92027a;

    @Override // hr.b
    public void onDestroy() {
        cq.e eVar = this.f92027a;
        if (eVar != null) {
            eVar.destroy();
        }
        this.f92027a = null;
    }

    @Override // hr.p
    public void prepareToShow(RendererConfiguration rendererConfiguration) throws Throwable {
        super.prepareToShow(rendererConfiguration);
        cq.e eVar = this.f92027a;
        if (eVar == null || rendererConfiguration == null) {
            return;
        }
        Context context = eVar.getContext();
        e0.checkNotNullExpressionValue(context, "adView.context");
        Drawable watermarkDrawable = rendererConfiguration.getWatermarkDrawable(context);
        if (watermarkDrawable != null) {
            eVar.setWatermark(watermarkDrawable);
        }
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.f callback, hr.g requestParams, hr.k unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        e0.checkNotNullParameter(contextProvider, "contextProvider");
        e0.checkNotNullParameter(callback, "callback");
        e0.checkNotNullParameter(requestParams, "requestParams");
        e0.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        e0.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        Context applicationContext = contextProvider.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext, "contextProvider.getApplicationContext()");
        j jVar = new j(unifiedMediationParams);
        if (jVar.isValid(callback)) {
            if (jVar.getAdParams() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            callback.setVisibilitySource(jVar.getAdParams().getCacheType() == b0.FullLoad ? nm.m.f77061b : nm.m.f77063e);
            cq.e eVar = new cq.e(applicationContext, jVar.getAdParams());
            eVar.setAdViewListener(new d(callback));
            this.f92027a = eVar;
            eVar.load();
        }
    }
}
