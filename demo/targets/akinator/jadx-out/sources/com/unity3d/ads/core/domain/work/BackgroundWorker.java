package com.unity3d.ads.core.domain.work;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import n6.b0;
import n6.b1;
import n6.d0;
import n6.f;
import n6.f0;
import n6.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BackgroundWorker {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "UnityAdsBackgroundWorker";
    private final y0 workManager;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public BackgroundWorker(Context applicationContext) {
        e0.checkNotNullParameter(applicationContext, "applicationContext");
        y0 y0Var = y0.getInstance(applicationContext);
        e0.checkNotNullExpressionValue(y0Var, "getInstance(applicationContext)");
        this.workManager = y0Var;
    }

    public final y0 getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        e0.checkNotNullParameter(universalRequestWorkerData, "universalRequestWorkerData");
        f fVarBuild = new f.a().setRequiredNetworkType(d0.f75706c).build();
        e0.checkNotNullExpressionValue(fVarBuild, "Builder()\n            .s…TED)\n            .build()");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        b1 b1VarBuild = ((f0.a) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) b0.class).setConstraints(fVarBuild)).setInputData(universalRequestWorkerData.invoke())).addTag(TAG)).build();
        e0.checkNotNullExpressionValue(b1VarBuild, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
        getWorkManager().enqueue((f0) b1VarBuild);
    }
}
