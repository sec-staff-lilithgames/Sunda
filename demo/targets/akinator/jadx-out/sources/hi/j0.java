package hi;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j0 extends d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f58833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f58834c;

    public j0(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f58833b = str;
        this.f58834c = executorService;
    }

    @Override // hi.d
    public void onRun() {
        String str = this.f58833b;
        ExecutorService executorService = this.f58834c;
        try {
            ei.f.getLogger().d("Executing shutdown hook for " + str);
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            ei.f.getLogger().d(str + " did not shut down in the allocated time. Requesting immediate shutdown.");
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            ei.f logger = ei.f.getLogger();
            Locale locale = Locale.US;
            logger.d("Interrupted while waiting for " + str + " to shut down. Requesting immediate shutdown.");
            executorService.shutdownNow();
        }
    }
}
