package di;

import com.google.android.gms.tasks.Task;
import com.google.firebase.g;
import ei.f;
import hi.z;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final z f52343a;

    public e(z zVar) {
        this.f52343a = zVar;
    }

    public static e getInstance() {
        e eVar = (e) g.getInstance().get(e.class);
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.f52343a.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.f52343a.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f52343a.didCrashOnPreviousExecution();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f52343a.isCrashlyticsCollectionEnabled();
    }

    public void log(String str) {
        this.f52343a.log(str);
    }

    public void recordException(Throwable th2) {
        if (th2 == null) {
            f.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.f52343a.logException(th2, Collections.EMPTY_MAP);
        }
    }

    public void sendUnsentReports() {
        this.f52343a.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(boolean z10) {
        this.f52343a.setCrashlyticsCollectionEnabled(Boolean.valueOf(z10));
    }

    public void setCustomKey(String str, boolean z10) {
        this.f52343a.setCustomKey(str, Boolean.toString(z10));
    }

    public void setCustomKeys(d dVar) {
        throw null;
    }

    public void setUserId(String str) {
        this.f52343a.setUserId(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f52343a.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCustomKey(String str, double d10) {
        this.f52343a.setCustomKey(str, Double.toString(d10));
    }

    public void setCustomKey(String str, float f10) {
        this.f52343a.setCustomKey(str, Float.toString(f10));
    }

    public void setCustomKey(String str, int i10) {
        this.f52343a.setCustomKey(str, Integer.toString(i10));
    }

    public void recordException(Throwable th2, d dVar) {
        if (th2 == null) {
            f.getLogger().w("A null value was passed to recordException. Ignoring.");
            return;
        }
        throw null;
    }

    public void setCustomKey(String str, long j10) {
        this.f52343a.setCustomKey(str, Long.toString(j10));
    }

    public void setCustomKey(String str, String str2) {
        this.f52343a.setCustomKey(str, str2);
    }
}
