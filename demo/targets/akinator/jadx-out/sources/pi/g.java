package pi;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import hi.g0;
import hi.n0;
import hi.t0;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81398a;

    /* renamed from: b, reason: collision with root package name */
    public final k f81399b;

    /* renamed from: c, reason: collision with root package name */
    public final h f81400c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f81401d;

    /* renamed from: e, reason: collision with root package name */
    public final a f81402e;

    /* renamed from: f, reason: collision with root package name */
    public final c f81403f;

    /* renamed from: g, reason: collision with root package name */
    public final g0 f81404g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f81405h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f81406i;

    public g(Context context, k kVar, t0 t0Var, h hVar, a aVar, c cVar, g0 g0Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.f81405h = atomicReference;
        this.f81406i = new AtomicReference(new TaskCompletionSource());
        this.f81398a = context;
        this.f81399b = kVar;
        this.f81401d = t0Var;
        this.f81400c = hVar;
        this.f81402e = aVar;
        this.f81403f = cVar;
        this.f81404g = g0Var;
        atomicReference.set(b.a(t0Var));
    }

    public static g create(Context context, String str, n0 n0Var, mi.b bVar, String str2, String str3, ni.d dVar, g0 g0Var) {
        String installerPackageName = n0Var.getInstallerPackageName();
        t0 t0Var = new t0();
        h hVar = new h(t0Var);
        a aVar = new a(dVar);
        Locale locale = Locale.US;
        return new g(context, new k(str, n0Var.getModelName(), n0Var.getOsBuildVersionString(), n0Var.getOsDisplayVersionString(), n0Var, hi.j.createInstanceIdFrom(hi.j.getMappingFileId(context), str, str3, str2), str3, str2, e3.g.a(installerPackageName != null ? 4 : 1)), t0Var, hVar, aVar, new c(a.b.l("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str, "/settings"), bVar), g0Var);
    }

    public final d a(e eVar) throws Throwable {
        d dVar = null;
        try {
            if (!e.f81393c.equals(eVar)) {
                JSONObject cachedSettings = this.f81402e.readCachedSettings();
                if (cachedSettings != null) {
                    d settingsJson = this.f81400c.parseSettingsJson(cachedSettings);
                    if (settingsJson == null) {
                        ei.f.getLogger().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    ei.f.getLogger().d("Loaded cached settings: " + cachedSettings.toString());
                    long currentTimeMillis = this.f81401d.getCurrentTimeMillis();
                    if (!e.f81394e.equals(eVar) && settingsJson.isExpired(currentTimeMillis)) {
                        ei.f.getLogger().v("Cached settings have expired.");
                        return null;
                    }
                    try {
                        ei.f.getLogger().v("Returning cached settings.");
                        return settingsJson;
                    } catch (Exception e10) {
                        e = e10;
                        dVar = settingsJson;
                        ei.f.getLogger().e("Failed to get cached settings", e);
                        return dVar;
                    }
                }
                ei.f.getLogger().d("No cached settings data found.");
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // pi.j
    public Task<d> getSettingsAsync() {
        return ((TaskCompletionSource) this.f81406i.get()).getTask();
    }

    @Override // pi.j
    public d getSettingsSync() {
        return (d) this.f81405h.get();
    }

    public Task<Void> loadSettingsData(ii.g gVar) {
        return loadSettingsData(e.f81392b, gVar);
    }

    public Task<Void> loadSettingsData(e eVar, ii.g gVar) throws Throwable {
        d dVarA;
        boolean zEquals = hi.j.getSharedPrefs(this.f81398a).getString("existing_instance_identifier", "").equals(this.f81399b.f81413f);
        AtomicReference atomicReference = this.f81406i;
        AtomicReference atomicReference2 = this.f81405h;
        if (zEquals && (dVarA = a(eVar)) != null) {
            atomicReference2.set(dVarA);
            ((TaskCompletionSource) atomicReference.get()).trySetResult(dVarA);
            return Tasks.forResult(null);
        }
        d dVarA2 = a(e.f81394e);
        if (dVarA2 != null) {
            atomicReference2.set(dVarA2);
            ((TaskCompletionSource) atomicReference.get()).trySetResult(dVarA2);
        }
        return this.f81404g.waitForDataCollectionPermission().onSuccessTask(gVar.f59614a, new f(this, gVar));
    }
}
