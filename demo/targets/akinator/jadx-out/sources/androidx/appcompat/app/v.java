package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import q.c4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: b, reason: collision with root package name */
    public static final t f4874b = new t(new u());

    /* renamed from: c, reason: collision with root package name */
    public static int f4875c = -100;

    /* renamed from: e, reason: collision with root package name */
    public static t3.p f4876e = null;

    /* renamed from: f, reason: collision with root package name */
    public static t3.p f4877f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f4878g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4879h = false;

    /* renamed from: i, reason: collision with root package name */
    public static final z.g f4880i = new z.g();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f4881j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f4882k = new Object();

    public static void a() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        t3.p pVar;
        Iterator<Object> it = f4880i.iterator();
        while (it.hasNext()) {
            v vVar = (v) ((WeakReference) it.next()).get();
            if (vVar != null) {
                t0 t0Var = (t0) vVar;
                Context context = t0Var.f4859m;
                if (c(context) && (pVar = f4876e) != null && !pVar.equals(f4877f)) {
                    f4874b.execute(new q(context, 1));
                }
                t0Var.f(true, true);
            }
        }
    }

    public static Object b() {
        Context contextForDelegate;
        Iterator<Object> it = f4880i.iterator();
        while (it.hasNext()) {
            v vVar = (v) ((WeakReference) it.next()).get();
            if (vVar != null && (contextForDelegate = vVar.getContextForDelegate()) != null) {
                return contextForDelegate.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean c(Context context) {
        if (f4878g == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.getServiceInfo(context).metaData;
                if (bundle != null) {
                    f4878g = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f4878g = Boolean.FALSE;
            }
        }
        return f4878g.booleanValue();
    }

    public static v create(Activity activity, p pVar) {
        return new t0(activity, null, pVar, activity);
    }

    public static void d(t0 t0Var) {
        synchronized (f4881j) {
            try {
                Iterator<Object> it = f4880i.iterator();
                while (it.hasNext()) {
                    v vVar = (v) ((WeakReference) it.next()).get();
                    if (vVar == t0Var || vVar == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void e(Context context) {
        if (c(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f4879h) {
                    return;
                }
                f4874b.execute(new q(context, 0));
                return;
            }
            synchronized (f4882k) {
                try {
                    t3.p pVar = f4876e;
                    if (pVar == null) {
                        if (f4877f == null) {
                            f4877f = t3.p.forLanguageTags(k3.n.readLocales(context));
                        }
                        if (f4877f.isEmpty()) {
                        } else {
                            f4876e = f4877f;
                        }
                    } else if (!pVar.equals(f4877f)) {
                        t3.p pVar2 = f4876e;
                        f4877f = pVar2;
                        k3.n.persistLocales(context, pVar2.toLanguageTags());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static t3.p getApplicationLocales() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objB = b();
            if (objB != null) {
                return t3.p.wrap(s.a(objB));
            }
        } else {
            t3.p pVar = f4876e;
            if (pVar != null) {
                return pVar;
            }
        }
        return t3.p.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        return f4875c;
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return c4.isCompatVectorFromResourcesEnabled();
    }

    public static void setApplicationLocales(t3.p pVar) {
        Objects.requireNonNull(pVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objB = b();
            if (objB != null) {
                s.b(objB, r.a(pVar.toLanguageTags()));
                return;
            }
            return;
        }
        if (pVar.equals(f4876e)) {
            return;
        }
        synchronized (f4881j) {
            f4876e = pVar;
            a();
        }
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z10) {
        c4.setCompatVectorFromResourcesEnabled(z10);
    }

    public static void setDefaultNightMode(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f4875c != i10) {
            f4875c = i10;
            synchronized (f4881j) {
                try {
                    Iterator<Object> it = f4880i.iterator();
                    while (it.hasNext()) {
                        v vVar = (v) ((WeakReference) it.next()).get();
                        if (vVar != null) {
                            vVar.applyDayNight();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyDayNight();

    public Context attachBaseContext2(Context context) {
        attachBaseContext(context);
        return context;
    }

    public abstract View createView(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T findViewById(int i10);

    public Context getContextForDelegate() {
        return null;
    }

    public abstract e getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    public abstract a getSupportActionBar();

    public abstract boolean hasWindowFeature(int i10);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i10);

    public abstract void setContentView(int i10);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z10);

    public abstract void setLocalNightMode(int i10);

    public abstract void setSupportActionBar(Toolbar toolbar);

    public abstract void setTitle(CharSequence charSequence);

    public abstract o.c startSupportActionMode(o.b bVar);

    public static v create(Dialog dialog, p pVar) {
        return new t0(dialog.getContext(), dialog.getWindow(), pVar, dialog);
    }

    public static v create(Context context, Window window, p pVar) {
        return new t0(context, window, pVar, context);
    }

    public static v create(Context context, Activity activity, p pVar) {
        return new t0(context, null, pVar, activity);
    }

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void setTheme(int i10) {
    }
}
