package bi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplayRegistrar;
import hi.g0;
import hi.n0;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9534b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f9533a = i10;
        this.f9534b = obj;
    }

    @Override // bi.i
    public final Object create(d dVar) throws Resources.NotFoundException {
        di.e eVar;
        int i10 = this.f9533a;
        Object obj = this.f9534b;
        switch (i10) {
            case 0:
                return obj;
            case 1:
                return ((FirebaseInAppMessagingRegistrar) obj).providesFirebaseInAppMessaging(dVar);
            case 2:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) obj;
                int i11 = CrashlyticsRegistrar.f29669d;
                ii.g.setEnforcement(false);
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.google.firebase.g gVar = (com.google.firebase.g) dVar.get(com.google.firebase.g.class);
                tj.f fVar = (tj.f) dVar.get(tj.f.class);
                sj.b deferred = dVar.getDeferred(ei.a.class);
                sj.b deferred2 = dVar.getDeferred(yh.d.class);
                sj.b deferred3 = dVar.getDeferred(ck.a.class);
                ExecutorService executorService = (ExecutorService) dVar.get(crashlyticsRegistrar.f29670a);
                ExecutorService executorService2 = (ExecutorService) dVar.get(crashlyticsRegistrar.f29671b);
                ExecutorService executorService3 = (ExecutorService) dVar.get(crashlyticsRegistrar.f29672c);
                Context applicationContext = gVar.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                ei.f.getLogger().i("Initializing Firebase Crashlytics " + hi.z.getVersion() + " for " + packageName);
                ii.g gVar2 = new ii.g(executorService, executorService2);
                ni.d dVar2 = new ni.d(applicationContext);
                g0 g0Var = new g0(gVar);
                n0 n0Var = new n0(applicationContext, packageName, fVar, g0Var);
                ei.c cVar = new ei.c(deferred);
                di.b bVar = new di.b(deferred2);
                hi.m mVar = new hi.m(g0Var, dVar2);
                fk.d.register(mVar);
                hi.z zVar = new hi.z(gVar, n0Var, cVar, g0Var, bVar.getDeferredBreadcrumbSource(), bVar.getAnalyticsEventLogger(), dVar2, mVar, new ei.i(deferred3), gVar2);
                String applicationId = gVar.getOptions().getApplicationId();
                String mappingFileId = hi.j.getMappingFileId(applicationContext);
                List<hi.f> buildIdInfo = hi.j.getBuildIdInfo(applicationContext);
                ei.f.getLogger().d("Mapping file ID is: " + mappingFileId);
                for (hi.f fVar2 : buildIdInfo) {
                    ei.f logger = ei.f.getLogger();
                    String libraryName = fVar2.getLibraryName();
                    String arch = fVar2.getArch();
                    String buildId = fVar2.getBuildId();
                    StringBuilder sbB = b3.h.b("Build id for ", libraryName, " on ", arch, ": ");
                    sbB.append(buildId);
                    logger.d(sbB.toString());
                    jCurrentTimeMillis = jCurrentTimeMillis;
                }
                long j10 = jCurrentTimeMillis;
                try {
                    hi.a aVarCreate = hi.a.create(applicationContext, n0Var, applicationId, mappingFileId, buildIdInfo, new ei.e(applicationContext));
                    ei.f.getLogger().v("Installer package name is: " + aVarCreate.f58782d);
                    pi.g gVarCreate = pi.g.create(applicationContext, applicationId, n0Var, new mi.b(), aVarCreate.f58784f, aVarCreate.f58785g, dVar2, g0Var);
                    gVarCreate.loadSettingsData(gVar2).addOnFailureListener(executorService3, new com.google.android.gms.internal.ads.a(22));
                    if (zVar.onPreExecute(aVarCreate, gVarCreate)) {
                        zVar.doBackgroundInitializationAsync(gVarCreate);
                    }
                    eVar = new di.e(zVar);
                } catch (PackageManager.NameNotFoundException e10) {
                    ei.f.getLogger().e("Error retrieving app package info.", e10);
                    eVar = null;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j10;
                if (jCurrentTimeMillis2 > 16) {
                    ei.f.getLogger().d("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
                }
                return eVar;
            default:
                return ((FirebaseInAppMessagingDisplayRegistrar) obj).buildFirebaseInAppMessagingUI(dVar);
        }
    }
}
