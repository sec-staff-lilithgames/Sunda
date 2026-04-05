package hi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.recyclerview.widget.l1;
import com.google.android.gms.tasks.Tasks;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class n0 implements p0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f58849g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f58850h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final l1 f58851a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f58852b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58853c;

    /* renamed from: d, reason: collision with root package name */
    public final tj.f f58854d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f58855e;

    /* renamed from: f, reason: collision with root package name */
    public o0 f58856f;

    public n0(Context context, String str, tj.f fVar, g0 g0Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f58852b = context;
        this.f58853c = str;
        this.f58854d = fVar;
        this.f58855e = g0Var;
        this.f58851a = new l1();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f58849g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        ei.f.getLogger().v("Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public m0 fetchTrueFid(boolean z10) {
        String token;
        ii.g.checkNotMainThread();
        tj.f fVar = this.f58854d;
        String str = null;
        if (z10) {
            try {
                token = ((tj.k) Tasks.await(((tj.e) fVar).getToken(false), 10000L, TimeUnit.MILLISECONDS)).getToken();
            } catch (Exception e10) {
                ei.f.getLogger().w("Error getting Firebase authentication token.", e10);
            }
        } else {
            token = null;
        }
        try {
            str = (String) Tasks.await(((tj.e) fVar).getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            ei.f.getLogger().w("Error getting Firebase installation id.", e11);
        }
        return new m0(str, token);
    }

    public String getAppIdentifier() {
        return this.f58853c;
    }

    public String getInstallerPackageName() {
        String str;
        l1 l1Var = this.f58851a;
        Context context = this.f58852b;
        synchronized (l1Var) {
            try {
                if (((String) l1Var.f7184a) == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    l1Var.f7184a = installerPackageName;
                }
                str = "".equals((String) l1Var.f7184a) ? null : (String) l1Var.f7184a;
            } finally {
            }
        }
        return str;
    }

    public String getModelName() {
        Locale locale = Locale.US;
        String str = Build.MANUFACTURER;
        String str2 = f58850h;
        return w0.i.d(str.replaceAll(str2, ""), "/", Build.MODEL.replaceAll(str2, ""));
    }

    public String getOsBuildVersionString() {
        return Build.VERSION.INCREMENTAL.replaceAll(f58850h, "");
    }

    public String getOsDisplayVersionString() {
        return Build.VERSION.RELEASE.replaceAll(f58850h, "");
    }

    @Override // hi.p0
    public synchronized o0 getInstallIds() {
        String str;
        o0 o0Var = this.f58856f;
        if (o0Var != null && (o0Var.getFirebaseInstallationId() != null || !this.f58855e.isAutomaticDataCollectionEnabled())) {
            return this.f58856f;
        }
        ei.f.getLogger().v("Determining Crashlytics installation ID...");
        SharedPreferences sharedPrefs = j.getSharedPrefs(this.f58852b);
        String string = sharedPrefs.getString("firebase.installation.id", null);
        ei.f.getLogger().v("Cached Firebase Installation ID: " + string);
        if (this.f58855e.isAutomaticDataCollectionEnabled()) {
            m0 m0VarFetchTrueFid = fetchTrueFid(false);
            ei.f.getLogger().v("Fetched Firebase Installation ID: " + m0VarFetchTrueFid.getFid());
            if (m0VarFetchTrueFid.getFid() == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                m0VarFetchTrueFid = new m0(str, null);
            }
            if (Objects.equals(m0VarFetchTrueFid.getFid(), string)) {
                this.f58856f = new c(sharedPrefs.getString("crashlytics.installation.id", null), m0VarFetchTrueFid.getFid(), m0VarFetchTrueFid.getAuthToken());
            } else {
                this.f58856f = new c(a(sharedPrefs, m0VarFetchTrueFid.getFid()), m0VarFetchTrueFid.getFid(), m0VarFetchTrueFid.getAuthToken());
            }
        } else if (string == null || !string.startsWith(wHkgq.hnCw)) {
            this.f58856f = o0.createWithoutFid(a(sharedPrefs, "SYN_" + UUID.randomUUID().toString()));
        } else {
            this.f58856f = o0.createWithoutFid(sharedPrefs.getString("crashlytics.installation.id", null));
        }
        ei.f.getLogger().v("Install IDs: " + this.f58856f);
        return this.f58856f;
    }
}
