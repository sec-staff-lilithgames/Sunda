package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import i2.hQ.aTNDubNmpwAqdU;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final MolocoAdError f46746a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f46747b;

    public s(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType) {
        e0.checkNotNullParameter(molocoAdError, "molocoAdError");
        e0.checkNotNullParameter(subErrorType, "subErrorType");
        this.f46746a = molocoAdError;
        this.f46747b = subErrorType;
    }

    public final MolocoAdError a() {
        return this.f46746a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.f46747b;
    }

    public final MolocoAdError c() {
        return this.f46746a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c d() {
        return this.f46747b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return e0.areEqual(this.f46746a, sVar.f46746a) && e0.areEqual(this.f46747b, sVar.f46747b);
    }

    public int hashCode() {
        return this.f46747b.hashCode() + (this.f46746a.hashCode() * 31);
    }

    public String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.f46746a + ", subErrorType=" + this.f46747b + ')';
    }

    public final s a(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType) {
        e0.checkNotNullParameter(molocoAdError, aTNDubNmpwAqdU.YHgCzClDhXce);
        e0.checkNotNullParameter(subErrorType, "subErrorType");
        return new s(molocoAdError, subErrorType);
    }

    public static /* synthetic */ s a(s sVar, MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            molocoAdError = sVar.f46746a;
        }
        if ((i10 & 2) != 0) {
            cVar = sVar.f46747b;
        }
        return sVar.a(molocoAdError, cVar);
    }
}
