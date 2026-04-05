package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebSettings;
import androidx.core.app.NotificationCompat;
import ao.kwoC.zAQQWzBxnS;
import com.ironsource.C3191e4;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.od, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2925od {

    /* renamed from: b, reason: collision with root package name */
    public static Context f33209b = null;

    /* renamed from: c, reason: collision with root package name */
    public static String f33210c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f33211d;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f33214g;

    /* renamed from: h, reason: collision with root package name */
    public static final ExecutorService f33215h;

    /* renamed from: i, reason: collision with root package name */
    public static int f33216i;

    /* renamed from: a, reason: collision with root package name */
    public static final C2925od f33208a = new C2925od();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f33212e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public static final tu.o f33213f = tu.q.lazy(C2908nd.f33163a);

    static {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
        f33215h = Executors.newSingleThreadExecutor(new Q5("od"));
    }

    public static final String b() {
        return f33211d;
    }

    public static /* synthetic */ void c() {
    }

    public static final Context d() {
        return f33209b;
    }

    public static /* synthetic */ void e() {
    }

    public static final N7 f() {
        return (N7) f33213f.getValue();
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void j() {
    }

    public static final String k() throws C2741df {
        Context applicationContext;
        String str = "";
        if (f33210c.length() == 0) {
            Context context = f33209b;
            if (context != null) {
                try {
                    applicationContext = context.getApplicationContext();
                } catch (Exception e10) {
                    try {
                        throw new C2741df(e10.getMessage());
                    } catch (C2741df e11) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
                        Y5 y52 = Y5.f32563a;
                        C2796h2 event = new C2796h2(e11);
                        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                        Y5.f32566d.a(event);
                        try {
                            String property = System.getProperty("http.agent");
                            if (property != null) {
                                str = property;
                            }
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
                        } catch (Exception e12) {
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
                            Y5 y53 = Y5.f32563a;
                            Y5.f32566d.a(C5.a(e12, NotificationCompat.CATEGORY_EVENT));
                        }
                    } catch (Exception unused) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
                    }
                }
            } else {
                applicationContext = null;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
            kotlin.jvm.internal.e0.checkNotNull(defaultUserAgent);
            str = defaultUserAgent;
            f33210c = str;
        }
        return f33210c;
    }

    public static /* synthetic */ void l() {
    }

    public static final boolean m() {
        return f33212e.get();
    }

    public static /* synthetic */ void n() {
    }

    public static final boolean o() {
        return f33214g;
    }

    public static /* synthetic */ void p() {
    }

    public static final boolean q() {
        return f33216i == 2;
    }

    public static /* synthetic */ void r() {
    }

    public static final void u() {
        f33209b = null;
        f33211d = null;
        f33216i = 0;
    }

    public final void a(int i10) {
        f33216i = i10;
    }

    public final String h() {
        Context context = f33209b;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6 i6A = H6.a(context, "coppa_store");
        kotlin.jvm.internal.e0.checkNotNullParameter("im_accid", C3191e4.h.W);
        return i6A.f31866a.getString("im_accid", null);
    }

    public final int i() {
        return f33216i;
    }

    public final void s() {
        f33211d = null;
        f33209b = null;
        f33216i = 3;
    }

    public final void t() {
        f33216i = 2;
    }

    public static final void a(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        f33215h.submit(runnable);
    }

    public static final void b(boolean z10) {
        f33214g = z10;
    }

    public static final void c(Context context) {
        f33209b = context;
    }

    public static final void a(boolean z10) {
        f33212e.set(z10);
        if (z10) {
            f().b(new C2762f2(101, 6, (String) null));
        } else {
            f().b(new C2762f2(102, 6, (String) null));
        }
    }

    public static final boolean b(Context context, String accountId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(accountId, "accountId");
        f33216i = 1;
        f33209b = context.getApplicationContext();
        f33212e.set(true);
        f33211d = accountId;
        return true;
    }

    public static final void c(String str) {
        f33211d = str;
    }

    public final void a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        try {
            L4.a(b(context));
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
        }
    }

    public final File b(Context context) {
        return new File(context != null ? context.getFilesDir() : null, "im_cached_content");
    }

    public final void b(String primaryAccountId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(primaryAccountId, "primaryAccountId");
        Context context = f33209b;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            I6.a(H6.a(context, "coppa_store"), "im_accid", primaryAccountId, false, 4, (Object) null);
        }
    }

    public final void a() {
        Context context = f33209b;
        if (context != null) {
            File fileB = b(context);
            if (!fileB.mkdir() && !fileB.isDirectory()) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
            } else {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
            }
        }
    }

    public final boolean a(Context context, String str) {
        if (context != null && str != null) {
            context.getPackageManager();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (kotlin.jvm.internal.e0.areEqual(str2, str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("od", "TAG");
            }
        }
        return false;
    }

    public static final void a(Context context, Application.ActivityLifecycleCallbacks lifecycleCallbacks) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lifecycleCallbacks, "lifecycleCallbacks");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(lifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
    }

    public final void a(Context context, Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "intent");
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final File a(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        a();
        File fileB = b(f33209b);
        int length = key.length() / 2;
        String strSubstring = key.substring(0, length);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        StringBuilder sbU = p0.o2.u(String.valueOf(strSubstring.hashCode() & Integer.MAX_VALUE));
        String strSubstring2 = key.substring(length);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, zAQQWzBxnS.ukeGrLEelu);
        sbU.append(strSubstring2.hashCode() & Integer.MAX_VALUE);
        return new File(fileB, sbU.toString());
    }
}
