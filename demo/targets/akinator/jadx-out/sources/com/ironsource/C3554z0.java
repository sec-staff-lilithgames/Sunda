package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3554z0 {
    public static int a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED;
        }
        if (aVar == IronSource.a.f37252c) {
            return IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int b(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT;
        }
        if (aVar == IronSource.a.f37252c) {
            return 1020;
        }
        if (aVar == IronSource.a.BANNER) {
            return 1019;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return 1018;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int c(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == IronSource.a.f37252c) {
            return IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION;
        }
        if (aVar == IronSource.a.BANNER) {
            return 612;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int d(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_LOAD_DURING_SHOW;
        }
        if (aVar == IronSource.a.f37252c) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int e(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return 1024;
        }
        if (aVar == IronSource.a.f37252c) {
            return IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (aVar == IronSource.a.BANNER) {
            return IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int f(IronSource.a aVar) {
        if (aVar == IronSource.a.f37252c || aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_PLACEMENT_CAPPED;
        }
        if (aVar == IronSource.a.BANNER) {
            return 604;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int g(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
        }
        if (aVar == IronSource.a.f37252c) {
            return IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }

    public static int h(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_SHOW_EXCEPTION;
        }
        if (aVar == IronSource.a.f37252c) {
            return IronSourceError.ERROR_IS_SHOW_EXCEPTION;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + aVar);
        return 510;
    }
}
