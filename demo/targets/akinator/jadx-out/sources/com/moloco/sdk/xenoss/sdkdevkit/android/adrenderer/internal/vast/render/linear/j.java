package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import qv.p;
import qv.v;
import tu.k0;
import tu.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class j {
    public static final boolean b(Job job) {
        return job == null || job.isCancelled() || job.isCompleted();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d b(int i10) {
        return i10 == 0 ? d.a.f49898a : new d.b(i10, null);
    }

    public static final int b(qv.m mVar, int i10) {
        return z0.doubleToUInt(v.coerceAtLeast(((v.coerceAtLeast(mVar.getLast() - mVar.getFirst(), 0) * i10) / 100.0d) / 1000, 0.0d));
    }

    public static final h a(Boolean bool, int i10, t tVar) {
        if (e0.areEqual(bool, Boolean.FALSE)) {
            tVar = null;
        } else if (e0.areEqual(bool, Boolean.TRUE)) {
            tVar = new t.b(i10 * 1000);
        } else if (bool != null) {
            throw new tu.t();
        }
        return new i(tVar);
    }

    public static final long b(long j10) {
        return j10 / 1000;
    }

    public static final int a(p pVar) {
        return k0.m7056constructorimpl((int) v.coerceAtLeast((pVar.getLast() - pVar.getFirst()) / 1000, 0L));
    }
}
