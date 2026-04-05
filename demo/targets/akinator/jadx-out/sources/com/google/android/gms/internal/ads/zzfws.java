package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfws {
    public static final zzfwq zza(final ExecutorService executorService) {
        e0.checkNotNullParameter(executorService, "executorService");
        return new zzfwq() { // from class: com.google.android.gms.internal.ads.zzfwr
            @Override // com.google.android.gms.internal.ads.zzfwq
            public final /* synthetic */ CoroutineScope zza() {
                return CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executorService));
            }
        };
    }
}
