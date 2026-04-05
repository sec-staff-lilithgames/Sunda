package com.ironsource;

import com.ironsource.Me;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3303k9 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.k9$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37092a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37092a = iArr;
        }
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        V7.a(V7.f35633a, runnable, 0L, 2, (Object) null);
    }

    public final void b(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        V7.f35633a.a(callback);
    }

    public final IronSource.a[] a(List<? extends IronSourceAds.AdFormat> adFormats) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i10 = a.f37092a[it.next().ordinal()];
            if (i10 == 1) {
                arrayList.add(IronSource.a.BANNER);
            } else if (i10 == 2) {
                arrayList.add(IronSource.a.f37252c);
            } else if (i10 == 3) {
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final IronSourceError a(C3364ne error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        if (error.c() != 2070 && error.c() != 2110) {
            if (error.c() != 2080 && error.c() != 2100) {
                if (error.c() == 2090) {
                    return C3559z5.f39348a.a();
                }
                return new IronSourceError(510, error.d());
            }
            return C3559z5.f39348a.c();
        }
        return C3559z5.f39348a.b();
    }

    public final void a(long j10, Me.a responseOrigin) {
        kotlin.jvm.internal.e0.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put("isMultipleAdObjects", 1);
            jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, j10);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.b());
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Mb.f34856s.d().q().a(new C5(D5.SDK_INIT_SUCCESS, jSONObjectB));
    }

    public final void a(C3364ne error, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
            jSONObjectB.put("reason", error.d());
            jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, j10);
            jSONObjectB.put("isMultipleAdObjects", 1);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Mb.f34856s.d().q().a(new C5(D5.SDK_INIT_FAILED, jSONObjectB));
    }
}
