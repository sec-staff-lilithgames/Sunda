package bi;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.j0;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements sj.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9566a;

    @Override // sj.c
    public final Object get() {
        switch (this.f9566a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                v vVar = ExecutorsRegistrar.f29665a;
                return new ci.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ci.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f29668d.get());
            case 4:
                v vVar2 = ExecutorsRegistrar.f29665a;
                return new ci.g(Executors.newCachedThreadPool(new ci.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f29668d.get());
            case 5:
                v vVar3 = ExecutorsRegistrar.f29665a;
                return Executors.newSingleThreadScheduledExecutor(new ci.a("Firebase Scheduler", 0, null));
            default:
                j0 j0Var = FirebaseMessaging.f29723l;
                return null;
        }
    }
}
