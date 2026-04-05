package com.moloco.sdk.publisher.init;

import android.content.Context;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MolocoInitParams {
    public static final int $stable = 8;
    private final Context appContext;
    private final String appKey;
    private final MediationInfo mediationInfo;

    public MolocoInitParams(Context appContext, String appKey, MediationInfo mediationInfo) {
        e0.checkNotNullParameter(appContext, "appContext");
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        this.appContext = appContext;
        this.appKey = appKey;
        this.mediationInfo = mediationInfo;
    }

    public static /* synthetic */ MolocoInitParams copy$default(MolocoInitParams molocoInitParams, Context context, String str, MediationInfo mediationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = molocoInitParams.appContext;
        }
        if ((i10 & 2) != 0) {
            str = molocoInitParams.appKey;
        }
        if ((i10 & 4) != 0) {
            mediationInfo = molocoInitParams.mediationInfo;
        }
        return molocoInitParams.copy(context, str, mediationInfo);
    }

    public final Context component1() {
        return this.appContext;
    }

    public final String component2() {
        return this.appKey;
    }

    public final MediationInfo component3() {
        return this.mediationInfo;
    }

    public final MolocoInitParams copy(Context appContext, String appKey, MediationInfo mediationInfo) {
        e0.checkNotNullParameter(appContext, "appContext");
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(mediationInfo, "mediationInfo");
        return new MolocoInitParams(appContext, appKey, mediationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MolocoInitParams)) {
            return false;
        }
        MolocoInitParams molocoInitParams = (MolocoInitParams) obj;
        return e0.areEqual(this.appContext, molocoInitParams.appContext) && e0.areEqual(this.appKey, molocoInitParams.appKey) && e0.areEqual(this.mediationInfo, molocoInitParams.mediationInfo);
    }

    public final Context getAppContext() {
        return this.appContext;
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public int hashCode() {
        return this.mediationInfo.hashCode() + o2.e(this.appContext.hashCode() * 31, 31, this.appKey);
    }

    public String toString() {
        return "MolocoInitParams(appContext=" + this.appContext + ", appKey=" + this.appKey + ", mediationInfo=" + this.mediationInfo + ')';
    }
}
