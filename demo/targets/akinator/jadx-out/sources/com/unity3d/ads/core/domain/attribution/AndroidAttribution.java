package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import av.e;
import bv.b;
import bv.h;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import j1.u;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.flow.StateFlow;
import tu.o;
import tu.q;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final o measurementManager$delegate;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers dispatchers, SessionRepository sessionRepository) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = q.lazy(new AndroidAttribution$measurementManager$2(this, context));
    }

    private final MeasurementManager getMeasurementManager() {
        return u.b(this.measurementManager$delegate.getValue());
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri uri = Uri.parse(str);
        e0.checkNotNullExpressionValue(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        e0.checkNotNullExpressionValue(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    public final Object isAvailable(d<? super Boolean> dVar) throws Throwable {
        x0 x0Var;
        if (Device.getApiLevel() < 33) {
            return b.boxBoolean(false);
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return b.boxBoolean(false);
        }
        if (getMeasurementManager() == null) {
            return b.boxBoolean(false);
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return b.boxBoolean(false);
        }
        final zu.o oVar = new zu.o(av.b.intercepted(dVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                public /* bridge */ /* synthetic */ void onResult(Object obj) {
                    onResult(((Number) obj).intValue());
                }

                public void onError(Exception error) {
                    e0.checkNotNullParameter(error, "error");
                    d<Boolean> dVar2 = oVar;
                    int i10 = z.f87419c;
                    dVar2.resumeWith(z.m7131constructorimpl(Boolean.FALSE));
                }

                public void onResult(int i10) {
                    d<Boolean> dVar2 = oVar;
                    int i11 = z.f87419c;
                    dVar2.resumeWith(z.m7131constructorimpl(Boolean.valueOf(i10 == 1)));
                }
            });
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            int i10 = z.f87419c;
            oVar.resumeWith(z.m7131constructorimpl(b.boxBoolean(false)));
        }
        Object orThrow = oVar.getOrThrow();
        if (orThrow == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return orThrow;
    }

    public final Object registerClick(String str, AdObject adObject, d<? super Boolean> dVar) throws Throwable {
        WebViewContainer webViewContainer;
        StateFlow<InputEvent> lastInputEvent;
        InputEvent value;
        x0 x0Var;
        if (getMeasurementManager() == null) {
            return b.boxBoolean(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (value = lastInputEvent.getValue()) == null) {
            return b.boxBoolean(false);
        }
        final zu.o oVar = new zu.o(av.b.intercepted(dVar));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), value, ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                public void onResult(Object p02) {
                    e0.checkNotNullParameter(p02, "p0");
                    d<Boolean> dVar2 = oVar;
                    int i10 = z.f87419c;
                    dVar2.resumeWith(z.m7131constructorimpl(Boolean.TRUE));
                }

                public void onError(Exception error) {
                    e0.checkNotNullParameter(error, "error");
                    d<Boolean> dVar2 = oVar;
                    int i10 = z.f87419c;
                    dVar2.resumeWith(z.m7131constructorimpl(Boolean.FALSE));
                }
            });
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            int i10 = z.f87419c;
            oVar.resumeWith(z.m7131constructorimpl(b.boxBoolean(false)));
        }
        Object orThrow = oVar.getOrThrow();
        if (orThrow == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return orThrow;
    }

    public final Object registerView(String str, AdObject adObject, d<? super Boolean> dVar) throws Throwable {
        if (getMeasurementManager() == null) {
            return b.boxBoolean(false);
        }
        final zu.o oVar = new zu.o(av.b.intercepted(dVar));
        MeasurementManager measurementManager = getMeasurementManager();
        x0 x0Var = null;
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onResult(Object p02) {
                    e0.checkNotNullParameter(p02, "p0");
                    d<Boolean> dVar2 = oVar;
                    int i10 = z.f87419c;
                    dVar2.resumeWith(z.m7131constructorimpl(Boolean.TRUE));
                }

                public void onError(Exception error) {
                    e0.checkNotNullParameter(error, "error");
                    d<Boolean> dVar2 = oVar;
                    int i10 = z.f87419c;
                    dVar2.resumeWith(z.m7131constructorimpl(Boolean.FALSE));
                }
            });
            x0Var = x0.f87415a;
        }
        if (x0Var == null) {
            int i10 = z.f87419c;
            oVar.resumeWith(z.m7131constructorimpl(b.boxBoolean(false)));
        }
        Object orThrow = oVar.getOrThrow();
        if (orThrow == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return u.b(context.getSystemService(u.l()));
        }
        return null;
    }
}
