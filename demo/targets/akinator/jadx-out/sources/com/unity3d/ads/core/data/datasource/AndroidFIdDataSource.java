package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.fid.FIdBridge;
import com.unity3d.services.core.fid.FIdStaticBridge;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidFIdDataSource implements FIdDataSource {
    private FIdStaticBridge bridge;
    private final Context context;

    public AndroidFIdDataSource(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
        this.bridge = new FIdStaticBridge();
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    public String invoke() {
        Task<String> appInstanceId;
        try {
            int i10 = z.f87419c;
            FIdBridge fIdStaticBridge = this.bridge.getInstance(this.context);
            if (fIdStaticBridge != null && (appInstanceId = fIdStaticBridge.getAppInstanceId()) != null) {
                return (String) BuildersKt__BuildersKt.runBlocking$default(null, new AndroidFIdDataSource$invoke$1$1(appInstanceId, null), 1, null);
            }
            return null;
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            Object objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            return (String) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
        }
    }
}
