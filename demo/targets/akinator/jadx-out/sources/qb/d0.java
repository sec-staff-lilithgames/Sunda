package qb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.c1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.Dispatchers;
import lb.s0;
import p0.o2;
import timber.log.Timber;
import xv.g0;
import xv.j0;
import xv.k0;
import xv.l0;
import xv.o0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f82670f;

    /* renamed from: g, reason: collision with root package name */
    public static final j0 f82671g;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f82672a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public String f82673b;

    /* renamed from: c, reason: collision with root package name */
    public int f82674c;

    /* renamed from: d, reason: collision with root package name */
    public k0.a f82675d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f82676e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        j0.a aVar = j0.f93670e;
        f82670f = aVar.get("text/xml");
        f82671g = aVar.get("application/octet-stream");
    }

    public static /* synthetic */ void addPostParamFile$default(d0 d0Var, String str, File file, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPostParamFile");
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        d0Var.addPostParamFile(str, file, str2);
    }

    public final void addParameter(String key, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        if (str == null || str.length() == 0) {
            return;
        }
        ArrayList arrayList = this.f82672a;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (kotlin.jvm.internal.e0.areEqual(((g0) it.next()).getKey(), key)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.remove(i10);
        }
        arrayList.add(new g0(key, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addParameterForPost(String key, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        if (str == null || str.length() == 0) {
            return;
        }
        int i10 = 1;
        if (this.f82675d == null) {
            this.f82675d = new k0.a(null, i10, 0 == true ? 1 : 0).setType(k0.f93679j);
        }
        k0.a aVar = this.f82675d;
        kotlin.jvm.internal.e0.checkNotNull(aVar);
        aVar.addFormDataPart(key, str);
        this.f82674c = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addPostParamFile(String key, File value, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        int i10 = 1;
        if (this.f82675d == null) {
            this.f82675d = new k0.a(null, i10, 0 == true ? 1 : 0).setType(k0.f93679j);
        }
        j0.a aVar = j0.f93670e;
        if (str == null) {
            str = "multipart/form-data";
        }
        j0 j0Var = aVar.parse(str);
        if (j0Var == null) {
            j0Var = f82671g;
        }
        k0.a aVar2 = this.f82675d;
        kotlin.jvm.internal.e0.checkNotNull(aVar2);
        aVar2.addFormDataPart(key, value.getName(), u0.Companion.create(value, j0Var));
        this.f82674c = 1;
    }

    public final void addPostParamString(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "str");
        this.f82673b = str;
        this.f82674c = 2;
    }

    public int call() {
        if (this.f82676e) {
            return 0;
        }
        this.f82676e = true;
        try {
            int iIntValue = ((Number) BuildersKt__BuildersKt.runBlocking$default(null, new e0(this, null), 1, null)).intValue();
            this.f82676e = false;
            return iIntValue;
        } catch (InterruptedException | CancellationException unused) {
            this.f82676e = false;
            return -3;
        } catch (Throwable th2) {
            this.f82676e = false;
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object callAsync(zu.d<? super Integer> dVar) {
        k0 k0VarBuild;
        k0.a aVar;
        k0 k0VarBuild2;
        if (getMUrl().length() == 0) {
            return bv.b.boxInt(400);
        }
        if (isOffline()) {
            return bv.b.boxInt(-1);
        }
        xv.g0 g0Var = xv.g0.f93628j.parse(getMUrl());
        if (g0Var == null) {
            return bv.b.boxInt(400);
        }
        g0.a aVarNewBuilder = g0Var.newBuilder();
        Iterator it = this.f82672a.iterator();
        while (it.hasNext()) {
            g0 g0Var2 = (g0) it.next();
            aVarNewBuilder.addQueryParameter(g0Var2.getKey(), g0Var2.getValue());
        }
        xv.g0 g0VarBuild = aVarNewBuilder.build();
        o0.a aVarUrl = new o0.a().url(g0VarBuild);
        int i10 = this.f82674c;
        String str = null;
        Object[] objArr = 0;
        int i11 = 1;
        if (i10 == 1) {
            k0.a aVar2 = this.f82675d;
            if (aVar2 == null || (k0VarBuild = aVar2.build()) == null) {
                k0VarBuild = new k0.a(str, i11, objArr == true ? 1 : 0).setType(k0.f93679j).build();
            }
            aVarUrl.post(k0VarBuild);
        } else if (i10 != 2) {
            aVarUrl.get();
        } else {
            u0.a aVar3 = u0.Companion;
            String str2 = this.f82673b;
            if (str2 == null) {
                str2 = "";
            }
            aVarUrl.post(aVar3.create(str2, f82670f));
        }
        o0 o0VarBuild = aVarUrl.build();
        Timber.Forest forest = Timber.Forest;
        forest.tag("WebserviceBase").d("Request to " + g0VarBuild, new Object[0]);
        forest.tag("WebserviceBase").d("Request headers: " + o0VarBuild.headers(), new Object[0]);
        if (this.f82674c == 2) {
            forest.tag("WebserviceBase").d("Request body: " + this.f82673b, new Object[0]);
        }
        if (this.f82674c == 1 && (aVar = this.f82675d) != null && (k0VarBuild2 = aVar.build()) != null) {
            int size = k0VarBuild2.size();
            for (int i12 = 0; i12 < size; i12++) {
                k0.c cVarPart = k0VarBuild2.part(i12);
                Timber.Forest forest2 = Timber.Forest;
                Timber.Tree treeTag = forest2.tag("WebserviceBase");
                StringBuilder sbT = o2.t(i12, "Request multipart part ", " headers: ");
                sbT.append(cVarPart.headers());
                treeTag.d(sbT.toString(), new Object[0]);
                Timber.Tree treeTag2 = forest2.tag("WebserviceBase");
                StringBuilder sbT2 = o2.t(i12, "Request multipart part ", " body: ");
                sbT2.append(cVarPart.body().contentType());
                sbT2.append(" / ");
                sbT2.append(cVarPart.body().contentLength());
                sbT2.append(" bytes");
                treeTag2.d(sbT2.toString(), new Object[0]);
            }
        }
        l0.a aVarNewBuilder2 = ob.a.f78777a.getDefault().newBuilder();
        long mTimeout = getMTimeout();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l0 l0VarBuild = aVarNewBuilder2.callTimeout(mTimeout, timeUnit).connectTimeout(getMTimeout(), timeUnit).readTimeout(getMTimeout(), timeUnit).writeTimeout(getMTimeout(), timeUnit).build();
        c1.getOrCreateKotlinClass(getClass()).getSimpleName();
        return BuildersKt.withContext(Dispatchers.getIO(), new f0(l0VarBuild, o0VarBuild, this, null), dVar);
    }

    public abstract int getMTimeout();

    public abstract String getMUrl();

    public final boolean isOffline() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Context applicationContext = s0.f72971j.sharedInstance().getApplicationContext();
        if (applicationContext == null) {
            return true;
        }
        Object systemService = applicationContext.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return true;
        }
        return (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) ? false : true;
    }

    public abstract int parseWSResponse(String str);
}
