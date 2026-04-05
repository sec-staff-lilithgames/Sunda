package io.odeeo.internal.v1;

import io.odeeo.sdk.AdUnit;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f67276a = new g();

    public final AdUnit.CloseReason map(io.odeeo.internal.b1.e error) {
        e0.checkNotNullParameter(error, "error");
        switch (error.getErrorCode()) {
            case AdUnit.ERROR_STOPPED_MANUALLY /* 8010 */:
                return AdUnit.CloseReason.AdRemovedByDev;
            case AdUnit.ERROR_PAUSE_EXPIRED /* 8011 */:
                return AdUnit.CloseReason.AdExpired;
            case AdUnit.ERROR_STOPPED_CLOSEBTN /* 8012 */:
                return AdUnit.CloseReason.UserClose;
            default:
                return AdUnit.CloseReason.Other;
        }
    }
}
