package com.unity3d.ads.core.domain.work;

import androidx.work.b;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public UniversalRequestWorkerData(String universalRequestId) {
        e0.checkNotNullParameter(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    public final b invoke() {
        b bVarBuild = new b.a().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        e0.checkNotNullExpressionValue(bVarBuild, "Builder()\n            .p…tId)\n            .build()");
        return bVarBuild;
    }
}
