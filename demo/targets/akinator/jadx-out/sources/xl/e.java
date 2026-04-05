package xl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends hr.h {

    /* renamed from: a, reason: collision with root package name */
    public bq.e f92029a;

    @Override // hr.b
    public void onDestroy() {
        bq.e eVar = this.f92029a;
        if (eVar != null) {
            eVar.destroy();
        }
        this.f92029a = null;
    }

    @Override // hr.h
    public void show(ContextProvider contextProvider, hr.i callback, RendererConfiguration rendererConfiguration) throws Throwable {
        e0.checkNotNullParameter(contextProvider, "contextProvider");
        e0.checkNotNullParameter(callback, "callback");
        bq.e eVar = this.f92029a;
        if (eVar == null) {
            callback.onAdShowFailed(pr.a.internal("AdaptiveRendering fullscreen object is null"));
            return;
        }
        if (!eVar.isLoaded()) {
            callback.onAdShowFailed(pr.a.internal("AdaptiveRendering fullscreen object not loaded"));
            return;
        }
        if (eVar.isFinished()) {
            callback.onAdShowFailed(pr.a.internal("AdaptiveRendering fullscreen object already is finished"));
            return;
        }
        if (rendererConfiguration != null) {
            Context applicationContext = contextProvider.getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "contextProvider.applicationContext");
            Drawable watermarkDrawable = rendererConfiguration.getWatermarkDrawable(applicationContext);
            if (watermarkDrawable != null) {
                eVar.setWatermark(watermarkDrawable);
            }
        }
        Context applicationContext2 = contextProvider.getApplicationContext();
        e0.checkNotNullExpressionValue(applicationContext2, "contextProvider.getApplicationContext()");
        eVar.show(applicationContext2);
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.i callback, hr.j requestParams, hr.k unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
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
            bq.e eVar = new bq.e(applicationContext, jVar.getAdParams());
            eVar.setFullScreenAdListener(new f(applicationContext, callback));
            this.f92029a = eVar;
            eVar.load();
        }
    }
}
