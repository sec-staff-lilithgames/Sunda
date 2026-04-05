package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tj.e;
import xh.a;
import xh.b;
import xh.c;
import xh.d;
import xh.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f29660c;

    /* renamed from: a, reason: collision with root package name */
    public final zzfb f29661a;

    /* renamed from: b, reason: collision with root package name */
    public c f29662b;

    public FirebaseAnalytics(zzfb zzfbVar) {
        Preconditions.checkNotNull(zzfbVar);
        this.f29661a = zzfbVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f29660c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f29660c == null) {
                        f29660c = new FirebaseAnalytics(zzfb.zza(context, null));
                    }
                } finally {
                }
            }
        }
        return f29660c;
    }

    public static zzlk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzfb zzfbVarZza = zzfb.zza(context, bundle);
        if (zzfbVarZza == null) {
            return null;
        }
        return new f(zzfbVarZza);
    }

    public final ExecutorService a() {
        c cVar;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f29662b == null) {
                    this.f29662b = new c(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                cVar = this.f29662b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public Task<String> getAppInstanceId() {
        try {
            return Tasks.call(a(), new d(this));
        } catch (RuntimeException e10) {
            this.f29661a.zzD(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(e.getInstance().getId(), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public Task<Long> getSessionId() {
        try {
            return Tasks.call(a(), new xh.e(this));
        } catch (RuntimeException e10) {
            this.f29661a.zzD(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    public void logEvent(String str, Bundle bundle) {
        this.f29661a.zzh(str, bundle);
    }

    public void resetAnalyticsData() {
        this.f29661a.zzs();
    }

    public void setAnalyticsCollectionEnabled(boolean z10) {
        this.f29661a.zzq(Boolean.valueOf(z10));
    }

    public void setConsent(Map<b, a> map) {
        Bundle bundle = new Bundle();
        a aVar = map.get(b.f91990b);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = map.get(b.f91991c);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = map.get(b.f91992e);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = map.get(b.f91993f);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f29661a.zzr(bundle);
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f29661a.zzp(zzdf.zza(activity), str, str2);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f29661a.zzL(bundle);
    }

    public void setSessionTimeoutDuration(long j10) {
        this.f29661a.zzt(j10);
    }

    public void setUserId(String str) {
        this.f29661a.zzo(str);
    }

    public void setUserProperty(String str, String str2) {
        this.f29661a.zzk(null, str, str2, false);
    }
}
