package com.digidust.elokence.akinator.factories;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import ca.d;
import ca.k;
import ca.u;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import java.util.Calendar;
import jb.h;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AkApplication f21737b;

    public a(AkApplication akApplication) {
        this.f21737b = akApplication;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        k.getInstance().onActivityPaused(activity);
        AkApplication akApplication = this.f21737b;
        if (akApplication.f21734b != null) {
            Handler handler = akApplication.f21734b;
            e0.checkNotNull(handler);
            handler.postDelayed(akApplication.f21736e, 1000L);
        }
        u.sharedInstance().setTimeOfLastScreenOnPause(Calendar.getInstance().getTimeInMillis());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        int i10;
        e0.checkNotNullParameter(activity, "activity");
        if (activity instanceof AkActivity) {
            AkApplication akApplication = this.f21737b;
            if (akApplication.f21734b != null) {
                Handler handler = akApplication.f21734b;
                e0.checkNotNull(handler);
                handler.removeCallbacks(akApplication.f21736e);
            }
            if (akApplication.f21734b == null && !(activity instanceof SplashscreenActivity)) {
                BuildersKt__Builders_commonKt.launch$default(AkApplication.f21719f.getAppScope(), Dispatchers.getIO(), null, new d(2, null), 2, null);
                if (u.sharedInstance().areAnalyticsSendLastTime()) {
                    u.sharedInstance().setAnalyticsSend(false);
                } else {
                    AkApplication.access$sendAnalytics(akApplication);
                }
                akApplication.f21734b = new Handler();
            }
            if (activity instanceof SplashscreenActivity) {
                return;
            }
            u.sharedInstance().startBatchEdit();
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = calendar.getTimeInMillis();
            long timeOfLastScreenOnPause = u.sharedInstance().getTimeOfLastScreenOnPause();
            if (timeOfLastScreenOnPause == Long.MAX_VALUE) {
                u.sharedInstance().setTimeOfCurrentSessionStart(timeInMillis);
            }
            if (timeOfLastScreenOnPause != Long.MAX_VALUE && timeInMillis >= 1800000 + timeOfLastScreenOnPause) {
                u.sharedInstance().setTimeOfCurrentSessionStart(timeInMillis);
                u.sharedInstance().setTimeOfLastScreenOnPause(-1L);
                u.sharedInstance().setLastSessionAdded(0);
                h.a aVar = h.f69257d;
                aVar.sharedInstance().incMetricCompteur("nb_sessions");
                String metricValeur = aVar.sharedInstance().getMetricValeur("delai_session");
                if (metricValeur != null && metricValeur.length() != 0 && ((i10 = Integer.parseInt(metricValeur)) < 0 || i10 > 86400)) {
                    aVar.sharedInstance().reinitCompteur("nb_sessions", 1);
                    aVar.sharedInstance().createOrUpdateMetricValeur("delai_session", "0");
                    aVar.sharedInstance().createOrUpdateMetricValeur("delai_session_1", "0");
                    u.sharedInstance().setNewTotalSession(0);
                    u.sharedInstance().setLastSessionAdded(0);
                }
            }
            u.sharedInstance().stopBatchEdit();
            if (timeOfLastScreenOnPause != Long.MAX_VALUE) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(timeOfLastScreenOnPause);
                if (calendar2.get(6) != calendar.get(6)) {
                    h.f69257d.sharedInstance().incMetricCompteur("nb_jours");
                }
            }
            k.getInstance().onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e0.checkNotNullParameter(activity, "activity");
        e0.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
    }
}
