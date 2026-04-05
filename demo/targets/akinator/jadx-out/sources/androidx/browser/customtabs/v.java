package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.device.ads.DtbConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import u.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final b.l f5288a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f5289b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5290c;

    public v(b.l lVar, ComponentName componentName, Context context) {
        this.f5288a = lVar;
        this.f5289b = componentName;
        this.f5290c = context;
    }

    public static PendingIntent a(Context context, int i10) {
        return PendingIntent.getActivity(context, i10, new Intent(), 67108864);
    }

    public static boolean bindCustomTabsService(Context context, String str, d0 d0Var) {
        d0Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, d0Var, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(Context context, String str, d0 d0Var) {
        d0Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, d0Var, 1);
    }

    public static boolean connectAndInitialize(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new f(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static b.a createPendingAuthTabSession(Context context, int i10, Executor executor, u.a aVar) {
        return new b.a(a(context, i10), executor, aVar);
    }

    public static boolean d(Context context, String str, String str2) {
        IntentFilter intentFilter;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 64)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.packageName) && (intentFilter = resolveInfo.filter) != null && intentFilter.hasCategory(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String getPackageName(Context context, List<String> list) {
        return getPackageName(context, list, false);
    }

    public static boolean isAuthTabSupported(Context context, String str) {
        return d(context, str, CustomTabsService.CATEGORY_AUTH_TAB);
    }

    public static boolean isEphemeralBrowsingSupported(Context context, String str) {
        return d(context, str, CustomTabsService.CATEGORY_EPHEMERAL_BROWSING);
    }

    public static boolean isSetNetworkSupported(Context context, String str) {
        return d(context, str, CustomTabsService.CATEGORY_SET_NETWORK);
    }

    public static j0 newPendingSession(Context context, e eVar, int i10) {
        return new j0(eVar, a(context, i10));
    }

    public u.b attachAuthTabSession(b.a aVar) {
        u.a callback = aVar.getCallback();
        return b(aVar.getId(), aVar.getExecutor(), callback);
    }

    public k0 attachSession(j0 j0Var) {
        return c(j0Var.f5239a, j0Var.f5240b);
    }

    public final u.b b(PendingIntent pendingIntent, Executor executor, u.a aVar) {
        j jVar = new j(aVar, executor);
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            if (this.f5288a.newAuthTabSession(jVar, bundle)) {
                return new u.b(jVar, this.f5289b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final k0 c(e eVar, PendingIntent pendingIntent) {
        boolean zNewSession;
        u uVar = new u(eVar);
        b.l lVar = this.f5288a;
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zNewSession = lVar.newSessionWithExtras(uVar, bundle);
            } else {
                zNewSession = lVar.newSession(uVar);
            }
            if (zNewSession) {
                return new k0(lVar, uVar, this.f5289b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public Bundle extraCommand(String str, Bundle bundle) {
        try {
            return this.f5288a.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public u.b newAuthTabSession(u.a aVar, Executor executor) {
        return b(null, executor, aVar);
    }

    public k0 newSession(e eVar) {
        return c(eVar, null);
    }

    public boolean warmup(long j10) {
        try {
            return this.f5288a.warmup(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public static String getPackageName(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(DtbConstants.HTTP));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public u.b newAuthTabSession(u.a aVar, Executor executor, int i10) {
        return b(a(this.f5290c, i10), executor, aVar);
    }

    public k0 newSession(e eVar, int i10) {
        return c(eVar, a(this.f5290c, i10));
    }

    public static b.a createPendingAuthTabSession(Context context, int i10) {
        return new b.a(a(context, i10), null, null);
    }
}
