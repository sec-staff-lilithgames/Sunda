package tj;

import android.text.TextUtils;
import bi.v;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import on.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e implements f {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f86929m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f86930a;

    /* renamed from: b, reason: collision with root package name */
    public final wj.e f86931b;

    /* renamed from: c, reason: collision with root package name */
    public final vj.e f86932c;

    /* renamed from: d, reason: collision with root package name */
    public final n f86933d;

    /* renamed from: e, reason: collision with root package name */
    public final v f86934e;

    /* renamed from: f, reason: collision with root package name */
    public final l f86935f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f86936g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f86937h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f86938i;

    /* renamed from: j, reason: collision with root package name */
    public String f86939j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f86940k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f86941l;

    static {
        new AtomicInteger(1);
    }

    public e(com.google.firebase.g gVar, sj.c cVar, ExecutorService executorService, Executor executor) {
        wj.e eVar = new wj.e(gVar.getApplicationContext(), cVar);
        vj.e eVar2 = new vj.e(gVar);
        n nVar = n.getInstance();
        v vVar = new v(new bi.e(gVar, 2));
        l lVar = new l();
        this.f86936g = new Object();
        this.f86940k = new HashSet();
        this.f86941l = new ArrayList();
        this.f86930a = gVar;
        this.f86931b = eVar;
        this.f86932c = eVar2;
        this.f86933d = nVar;
        this.f86934e = vVar;
        this.f86935f = lVar;
        this.f86937h = executorService;
        this.f86938i = executor;
    }

    public static e getInstance() {
        return getInstance(com.google.firebase.g.getInstance());
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z10) {
        vj.f persistedInstallationEntryValue;
        String strCreateRandomFid;
        synchronized (f86929m) {
            try {
                androidx.localbroadcastmanager.content.b bVarA = androidx.localbroadcastmanager.content.b.a(this.f86930a.getApplicationContext());
                try {
                    persistedInstallationEntryValue = this.f86932c.readPersistedInstallationEntryValue();
                    if (persistedInstallationEntryValue.isNotGenerated()) {
                        l lVar = this.f86935f;
                        com.google.firebase.g gVar = this.f86930a;
                        if ((gVar.getName().equals("CHIME_ANDROID_SDK") || gVar.isDefaultApp()) && persistedInstallationEntryValue.shouldAttemptMigration()) {
                            String iid = ((vj.c) this.f86934e.get()).readIid();
                            strCreateRandomFid = TextUtils.isEmpty(iid) ? lVar.createRandomFid() : iid;
                        } else {
                            strCreateRandomFid = lVar.createRandomFid();
                        }
                        persistedInstallationEntryValue = this.f86932c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(strCreateRandomFid));
                    }
                    if (bVarA != null) {
                        bVarA.f();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.f();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            persistedInstallationEntryValue = persistedInstallationEntryValue.withClearedAuthToken();
        }
        h(persistedInstallationEntryValue);
        this.f86938i.execute(new c(this, z10, 1));
    }

    public final vj.f b(vj.f fVar) {
        wj.i iVarGenerateAuthToken = this.f86931b.generateAuthToken(this.f86930a.getOptions().getApiKey(), fVar.getFirebaseInstallationId(), this.f86930a.getOptions().getProjectId(), fVar.getRefreshToken());
        int iOrdinal = iVarGenerateAuthToken.getResponseCode().ordinal();
        if (iOrdinal == 0) {
            return fVar.withAuthToken(iVarGenerateAuthToken.getToken(), iVarGenerateAuthToken.getTokenExpirationTimestamp(), this.f86933d.currentTimeInSecs());
        }
        if (iOrdinal == 1) {
            return fVar.withFisError("BAD CONFIG");
        }
        if (iOrdinal != 2) {
            throw new h("Firebase Installations Service is unavailable. Please try again later.", g.f86943c);
        }
        synchronized (this) {
            this.f86939j = null;
        }
        return fVar.withNoGeneratedFid();
    }

    /* JADX WARN: Finally extract failed */
    public final vj.f c() {
        vj.f persistedInstallationEntryValue;
        synchronized (f86929m) {
            try {
                androidx.localbroadcastmanager.content.b bVarA = androidx.localbroadcastmanager.content.b.a(this.f86930a.getApplicationContext());
                try {
                    persistedInstallationEntryValue = this.f86932c.readPersistedInstallationEntryValue();
                    if (bVarA != null) {
                        bVarA.f();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.f();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return persistedInstallationEntryValue;
    }

    /* JADX WARN: Finally extract failed */
    public final void d(vj.f fVar) {
        synchronized (f86929m) {
            try {
                androidx.localbroadcastmanager.content.b bVarA = androidx.localbroadcastmanager.content.b.a(this.f86930a.getApplicationContext());
                try {
                    this.f86932c.insertOrUpdatePersistedInstallationEntry(fVar);
                    if (bVarA != null) {
                        bVarA.f();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.f();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // tj.f
    public Task<Void> delete() {
        return Tasks.call(this.f86937h, new com.vungle.ads.internal.session.a(this, 13));
    }

    public final void e() {
        com.google.firebase.g gVar = this.f86930a;
        Preconditions.checkNotEmpty(gVar.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(gVar.getOptions().getProjectId(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(gVar.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String applicationId = gVar.getOptions().getApplicationId();
        Pattern pattern = n.f86953c;
        Preconditions.checkArgument(applicationId.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(n.f86953c.matcher(gVar.getOptions().getApiKey()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final vj.f f(vj.f fVar) {
        String token = (fVar.getFirebaseInstallationId() == null || fVar.getFirebaseInstallationId().length() != 11) ? null : ((vj.c) this.f86934e.get()).readToken();
        com.google.firebase.g gVar = this.f86930a;
        wj.f fVarCreateFirebaseInstallation = this.f86931b.createFirebaseInstallation(gVar.getOptions().getApiKey(), fVar.getFirebaseInstallationId(), gVar.getOptions().getProjectId(), gVar.getOptions().getApplicationId(), token);
        int iOrdinal = fVarCreateFirebaseInstallation.getResponseCode().ordinal();
        if (iOrdinal == 0) {
            return fVar.withRegisteredFid(fVarCreateFirebaseInstallation.getFid(), fVarCreateFirebaseInstallation.getRefreshToken(), this.f86933d.currentTimeInSecs(), fVarCreateFirebaseInstallation.getAuthToken().getToken(), fVarCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (iOrdinal == 1) {
            return fVar.withFisError("BAD CONFIG");
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", g.f86943c);
    }

    public final void g(Exception exc) {
        synchronized (this.f86936g) {
            try {
                Iterator it = this.f86941l.iterator();
                while (it.hasNext()) {
                    if (((m) it.next()).onException(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tj.f
    public Task<String> getId() {
        String str;
        e();
        synchronized (this) {
            str = this.f86939j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j jVar = new j(taskCompletionSource);
        synchronized (this.f86936g) {
            this.f86941l.add(jVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f86937h.execute(new w(this, 14));
        return task;
    }

    @Override // tj.f
    public Task<k> getToken(boolean z10) {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i iVar = new i(this.f86933d, taskCompletionSource);
        synchronized (this.f86936g) {
            this.f86941l.add(iVar);
        }
        Task<k> task = taskCompletionSource.getTask();
        this.f86937h.execute(new c(this, z10, 0));
        return task;
    }

    public final void h(vj.f fVar) {
        synchronized (this.f86936g) {
            try {
                Iterator it = this.f86941l.iterator();
                while (it.hasNext()) {
                    if (((m) it.next()).onStateReached(fVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // tj.f
    public synchronized uj.b registerFidListener(uj.a aVar) {
        this.f86940k.add(aVar);
        return new d(this);
    }

    public static e getInstance(com.google.firebase.g gVar) {
        Preconditions.checkArgument(gVar != null, "Null is not a valid value of FirebaseApp.");
        return (e) gVar.get(f.class);
    }
}
