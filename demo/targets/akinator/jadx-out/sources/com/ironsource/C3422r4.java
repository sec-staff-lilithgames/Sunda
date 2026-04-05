package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.r4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3422r4 {

    /* renamed from: k, reason: collision with root package name */
    private static final String f38272k = "1.0.6";

    /* renamed from: l, reason: collision with root package name */
    public static String f38273l = "";

    /* renamed from: a, reason: collision with root package name */
    private final B7 f38274a;

    /* renamed from: b, reason: collision with root package name */
    private String f38275b;

    /* renamed from: c, reason: collision with root package name */
    private String f38276c;

    /* renamed from: d, reason: collision with root package name */
    private String f38277d;

    /* renamed from: e, reason: collision with root package name */
    private String f38278e;

    /* renamed from: f, reason: collision with root package name */
    private ContextProvider f38279f;

    /* renamed from: g, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f38280g;

    /* renamed from: h, reason: collision with root package name */
    public String f38281h;

    /* renamed from: i, reason: collision with root package name */
    private String f38282i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f38283j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r4$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38285a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38286b;

        public b(Context context, String str) {
            this.f38285a = context;
            this.f38286b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strI = C3422r4.this.f38274a.I(this.f38285a);
                if (!TextUtils.isEmpty(strI)) {
                    C3422r4.this.f38276c = strI;
                }
                String strB = C3422r4.this.f38274a.b(this.f38285a);
                if (!TextUtils.isEmpty(strB)) {
                    C3422r4.this.f38278e = strB;
                }
                SharedPreferences.Editor editorEdit = this.f38285a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", C3422r4.this.f38276c);
                editorEdit.putString("sId", this.f38286b);
                editorEdit.apply();
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r4$c */
    public class c extends RunnableC3439s4 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r4$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        static volatile C3422r4 f38289a = new C3422r4(0);

        private d() {
        }
    }

    public /* synthetic */ C3422r4(int i10) {
        this();
    }

    public String e() {
        return this.f38282i;
    }

    private C3422r4() {
        this.f38283j = false;
        this.f38274a = Mb.U().i();
        this.f38279f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f38280g = defaultUncaughtExceptionHandler;
        this.f38282i = " ";
        this.f38281h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C3389p4(defaultUncaughtExceptionHandler));
    }

    public static List<P5> c() {
        return null;
    }

    public static C3422r4 d() {
        return d.f38289a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z10, String str3, int i10, boolean z11) throws JSONException {
        Context applicationContext = this.f38279f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f38282i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f38281h = str;
            }
            this.f38277d = str3;
            if (z10) {
                new C3114a(i10).a(z11).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f38283j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return f38272k;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r4$a */
    public class a implements InterfaceC3132b {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3132b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(" (");
                    sb2.append(thread.getState().toString());
                    sb2.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(" ");
                        sb2.append(thread.getState().toString());
                        sb2.append("\n");
                    }
                }
            }
            C3422r4.f38273l = sb2.toString();
        }

        @Override // com.ironsource.InterfaceC3132b
        public void b() {
        }
    }

    public void a(Throwable th2) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f38283j);
        if (!this.f38283j || th2 == null) {
            return;
        }
        new P5(new C3406q4(th2).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    private void a(Context context, HashSet<String> hashSet) throws JSONException {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f38276c);
        String string2 = sharedPreferences.getString("sId", this.f38277d);
        List<P5> listB = I4.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (P5 p52 : listB) {
            JSONObject jSONObject = new JSONObject();
            String strB = p52.b();
            String strE = p52.e();
            String strD = p52.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo memoryInfoN = this.f38274a.n(context);
                if (memoryInfoN != null) {
                    jSONObject2.put("availRam", this.f38274a.c(memoryInfoN));
                    jSONObject2.put(Q6.f35311x, this.f38274a.b(memoryInfoN));
                    jSONObject2.put("mThreshold", this.f38274a.a(memoryInfoN));
                }
                String strT = this.f38274a.t();
                if (strT != null) {
                    jSONObject2.put(Q6.f35317z, strT);
                }
                jSONObject2.put("crashDate", strB);
                jSONObject2.put("stacktraceCrash", strE);
                jSONObject2.put("crashType", strD);
                jSONObject2.put("CrashReporterVersion", f38272k);
                jSONObject2.put(C3191e4.i.f36555q, "9.0.0");
                jSONObject2.put(C3191e4.i.f36564x, this.f38274a.c(context));
                jSONObject2.put(C3191e4.i.W, C1.b(context, packageName));
                jSONObject2.put(C3191e4.i.f36549n, this.f38274a.i());
                jSONObject2.put("network", strA);
                jSONObject2.put(C3191e4.i.f36553p, this.f38274a.e());
                jSONObject2.put("deviceModel", this.f38274a.l());
                jSONObject2.put("totalRam", this.f38274a.q(context));
                jSONObject2.put(C3144bb.f36078o, this.f38274a.f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.f38274a.q());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f38278e)) {
                    jSONObject2.put(C3191e4.i.M, Boolean.parseBoolean(this.f38278e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jSONObject2.has(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        } catch (Exception e10) {
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        I4.a();
    }

    public Context a() {
        return this.f38279f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return C3119a4.f35922b;
            }
            return networkCapabilities.hasTransport(0) ? C3119a4.f35927g : "none";
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
            return "none";
        }
    }
}
