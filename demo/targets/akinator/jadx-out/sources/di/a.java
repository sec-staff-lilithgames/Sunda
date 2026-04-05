package di;

import android.os.Bundle;
import ei.f;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements gi.b, fi.a, sj.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f52337b;

    @Override // sj.a
    public void handle(sj.c cVar) {
        b bVar = this.f52337b;
        f.getLogger().d("AnalyticsConnector now available.");
        yh.d dVar = (yh.d) cVar.get();
        fi.e eVar = new fi.e(dVar);
        c cVar2 = new c();
        yh.a aVarRegisterAnalyticsConnectorListener = dVar.registerAnalyticsConnectorListener("clx", cVar2);
        if (aVarRegisterAnalyticsConnectorListener == null) {
            f.getLogger().d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            aVarRegisterAnalyticsConnectorListener = dVar.registerAnalyticsConnectorListener("crash", cVar2);
            if (aVarRegisterAnalyticsConnectorListener != null) {
                f.getLogger().w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (aVarRegisterAnalyticsConnectorListener == null) {
            f.getLogger().w("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        f.getLogger().d("Registered Firebase Analytics listener.");
        fi.d dVar2 = new fi.d();
        fi.c cVar3 = new fi.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (bVar) {
            try {
                Iterator it = bVar.f52340c.iterator();
                while (it.hasNext()) {
                    dVar2.registerBreadcrumbHandler((gi.a) it.next());
                }
                cVar2.setBreadcrumbEventReceiver(dVar2);
                cVar2.setCrashlyticsOriginEventReceiver(cVar3);
                bVar.f52339b = dVar2;
                bVar.f52338a = cVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fi.a
    public void logEvent(String str, Bundle bundle) {
        this.f52337b.f52338a.logEvent(str, bundle);
    }

    @Override // gi.b
    public void registerBreadcrumbHandler(gi.a aVar) {
        b bVar = this.f52337b;
        synchronized (bVar) {
            try {
                if (bVar.f52339b instanceof gi.c) {
                    bVar.f52340c.add(aVar);
                }
                bVar.f52339b.registerBreadcrumbHandler(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
