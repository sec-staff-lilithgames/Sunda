package n6;

import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.l1;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.flow.Flow;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f75814a = new a(null);

    @tu.f
    public static y0 getInstance() {
        return f75814a.getInstance();
    }

    public static void initialize(Context context, androidx.work.a aVar) {
        f75814a.initialize(context, aVar);
    }

    public static boolean isInitialized() {
        return f75814a.isInitialized();
    }

    public abstract v0 beginUniqueWork(String str, n nVar, List<f0> list);

    public final v0 beginUniqueWork(String uniqueWorkName, n existingWorkPolicy, f0 request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        kotlin.jvm.internal.e0.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, uu.o0.listOf(request));
    }

    public abstract v0 beginWith(List<f0> list);

    public final v0 beginWith(f0 request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return beginWith(uu.o0.listOf(request));
    }

    public abstract j0 cancelAllWork();

    public abstract j0 cancelAllWorkByTag(String str);

    public abstract j0 cancelUniqueWork(String str);

    public abstract j0 cancelWorkById(UUID uuid);

    public abstract PendingIntent createCancelPendingIntent(UUID uuid);

    public abstract j0 enqueue(List<? extends b1> list);

    public final j0 enqueue(b1 request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return enqueue(uu.o0.listOf(request));
    }

    public abstract j0 enqueueUniquePeriodicWork(String str, m mVar, p0 p0Var);

    public abstract j0 enqueueUniqueWork(String str, n nVar, List<f0> list);

    public j0 enqueueUniqueWork(String uniqueWorkName, n existingWorkPolicy, f0 request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        kotlin.jvm.internal.e0.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, uu.o0.listOf(request));
    }

    public abstract androidx.work.a getConfiguration();

    public abstract n1 getLastCancelAllTimeMillis();

    public abstract l1 getLastCancelAllTimeMillisLiveData();

    public abstract n1 getWorkInfoById(UUID uuid);

    public abstract Flow<w0> getWorkInfoByIdFlow(UUID uuid);

    public abstract l1 getWorkInfoByIdLiveData(UUID uuid);

    public abstract n1 getWorkInfos(a1 a1Var);

    public abstract n1 getWorkInfosByTag(String str);

    public abstract Flow<List<w0>> getWorkInfosByTagFlow(String str);

    public abstract l1 getWorkInfosByTagLiveData(String str);

    public abstract Flow<List<w0>> getWorkInfosFlow(a1 a1Var);

    public abstract n1 getWorkInfosForUniqueWork(String str);

    public abstract Flow<List<w0>> getWorkInfosForUniqueWorkFlow(String str);

    public abstract l1 getWorkInfosForUniqueWorkLiveData(String str);

    public abstract l1 getWorkInfosLiveData(a1 a1Var);

    public abstract j0 pruneWork();

    public abstract n1 updateWork(b1 b1Var);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        @tu.f
        public y0 getInstance() {
            o6.y0 y0Var = o6.y0.getInstance();
            if (y0Var != null) {
                return y0Var;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }

        public void initialize(Context context, androidx.work.a configuration) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
            o6.y0.initialize(context, configuration);
        }

        public boolean isInitialized() {
            return o6.y0.isInitialized();
        }

        public y0 getInstance(Context context) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            o6.y0 y0Var = o6.y0.getInstance(context);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(y0Var, "getInstance(...)");
            return y0Var;
        }
    }

    public static y0 getInstance(Context context) {
        return f75814a.getInstance(context);
    }
}
