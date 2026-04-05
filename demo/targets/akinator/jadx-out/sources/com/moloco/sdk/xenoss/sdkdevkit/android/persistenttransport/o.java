package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.work.a;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import n6.b1;
import n6.j0;
import n6.y0;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f50308a;

    public o(Context context) {
        y0 y0VarB;
        e0.checkNotNullParameter(context, "context");
        try {
            y0VarB = a(context);
        } catch (IllegalStateException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager not initialized already, performing initialization", e10, false, 8, null);
            y0VarB = b(context);
        }
        this.f50308a = y0VarB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n
    public j0 a(b1 workRequest) {
        e0.checkNotNullParameter(workRequest, "workRequest");
        j0 j0VarEnqueue = this.f50308a.enqueue(workRequest);
        e0.checkNotNullExpressionValue(j0VarEnqueue, "enqueue(...)");
        return j0VarEnqueue;
    }

    public final y0 b(Context context) {
        androidx.work.a aVarBuild = new a.C0006a().build();
        e0.checkNotNullExpressionValue(aVarBuild, "build(...)");
        try {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to initialize work manager as one is not already available", null, false, 12, null);
            try {
                y0.initialize(context, aVarBuild);
            } catch (IllegalStateException e10) {
                e = e10;
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager initialized already at this point, retrieving instance", e, false, 8, null);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
                return a(context);
            }
        } catch (IllegalStateException e11) {
            e = e11;
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
        try {
            return a(context);
        } catch (IllegalStateException e12) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager instance couldn't be re-initialized, cannot provide WorkManager", null, false, 12, null);
            throw new IllegalStateException("Cannot provide MolocoWorkManager. Failed to re-initialize WorkManager", e12);
        }
    }

    public final n1 a(UUID id2) {
        e0.checkNotNullParameter(id2, "id");
        n1 workInfoById = this.f50308a.getWorkInfoById(id2);
        e0.checkNotNullExpressionValue(workInfoById, "getWorkInfoById(...)");
        return workInfoById;
    }

    public final y0 a(Context context) {
        y0 y0Var = y0.getInstance(context);
        e0.checkNotNullExpressionValue(y0Var, "getInstance(...)");
        return y0Var;
    }
}
