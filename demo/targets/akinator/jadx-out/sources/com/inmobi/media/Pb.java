package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Pb implements InterfaceC2946q0 {

    /* renamed from: a, reason: collision with root package name */
    public final AdQualityResult f32137a;

    public Pb(AdQualityResult result) {
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        this.f32137a = result;
    }

    @Override // com.inmobi.media.InterfaceC2946q0
    public final Object a() {
        boolean z10;
        try {
            ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
            ((C2794h0) AbstractC2807hd.f32899a.getValue()).a(this.f32137a);
            z10 = true;
        } catch (SQLiteException e10) {
            kotlin.jvm.internal.e0.checkNotNullParameter("QueueProcess", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("failed to queue the result", PglCryptUtils.KEY_MESSAGE);
            Log.e("QueueProcess", "failed to queue the result", e10);
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
