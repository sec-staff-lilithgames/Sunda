package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.Locale;
import q.c4;
import q.f4;
import q.n3;
import x3.m2;
import x3.z1;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends v implements p.k, LayoutInflater.Factory2 {

    /* renamed from: k0, reason: collision with root package name */
    public static final t1 f4845k0 = new t1();

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f4846l0 = {R.attr.windowBackground};

    /* renamed from: m0, reason: collision with root package name */
    public static final boolean f4847m0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean C;
    public ViewGroup D;
    public TextView E;
    public View F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public r0[] O;
    public r0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Configuration U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public p0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public n0 f4848a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4849b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f4850c0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4852e0;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f4853f0;

    /* renamed from: g0, reason: collision with root package name */
    public Rect f4854g0;

    /* renamed from: h0, reason: collision with root package name */
    public x0 f4855h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedDispatcher f4856i0;

    /* renamed from: j0, reason: collision with root package name */
    public OnBackInvokedCallback f4857j0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4858l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f4859m;

    /* renamed from: n, reason: collision with root package name */
    public Window f4860n;

    /* renamed from: o, reason: collision with root package name */
    public m0 f4861o;

    /* renamed from: p, reason: collision with root package name */
    public final p f4862p;

    /* renamed from: q, reason: collision with root package name */
    public a f4863q;

    /* renamed from: r, reason: collision with root package name */
    public o.h f4864r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f4865s;

    /* renamed from: t, reason: collision with root package name */
    public q.h1 f4866t;

    /* renamed from: u, reason: collision with root package name */
    public e0 f4867u;

    /* renamed from: v, reason: collision with root package name */
    public s0 f4868v;

    /* renamed from: w, reason: collision with root package name */
    public o.c f4869w;

    /* renamed from: x, reason: collision with root package name */
    public ActionBarContextView f4870x;

    /* renamed from: y, reason: collision with root package name */
    public PopupWindow f4871y;

    /* renamed from: z, reason: collision with root package name */
    public a0 f4872z;
    public m2 A = null;
    public boolean B = true;

    /* renamed from: d0, reason: collision with root package name */
    public final w f4851d0 = new w(this);

    public t0(Context context, Window window, p pVar, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.V = -100;
        this.f4859m = context;
        this.f4862p = pVar;
        this.f4858l = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.V = appCompatActivity.getDelegate().getLocalNightMode();
            }
        }
        if (this.V == -100) {
            String name = this.f4858l.getClass().getName();
            t1 t1Var = f4845k0;
            Integer num = (Integer) t1Var.get(name);
            if (num != null) {
                this.V = num.intValue();
                t1Var.remove(this.f4858l.getClass().getName());
            }
        }
        if (window != null) {
            g(window);
        }
        q.w.preload();
    }

    public static t3.p h(Context context) {
        t3.p pVar;
        t3.p pVarCreate;
        if (Build.VERSION.SDK_INT >= 33 || (pVar = v.f4876e) == null) {
            return null;
        }
        t3.p pVarB = i0.b(context.getApplicationContext().getResources().getConfiguration());
        if (pVar.isEmpty()) {
            pVarCreate = t3.p.getEmptyLocaleList();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (i10 < pVarB.size() + pVar.size()) {
                Locale locale = i10 < pVar.size() ? pVar.get(i10) : pVarB.get(i10 - pVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            pVarCreate = t3.p.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return pVarCreate.isEmpty() ? pVarB : pVarCreate;
    }

    public static Configuration l(Context context, int i10, t3.p pVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (pVar != null) {
            i0.c(configuration2, pVar);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.v
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o();
        ((ViewGroup) this.D.findViewById(R.id.content)).addView(view, layoutParams);
        this.f4861o.bypassOnContentChanged(this.f4860n.getCallback());
    }

    @Override // androidx.appcompat.app.v
    public boolean applyDayNight() {
        return f(true, true);
    }

    @Override // androidx.appcompat.app.v
    public Context attachBaseContext2(Context context) {
        this.R = true;
        int defaultNightMode = this.V;
        if (defaultNightMode == -100) {
            defaultNightMode = v.getDefaultNightMode();
        }
        int iT = t(context, defaultNightMode);
        if (v.c(context)) {
            v.e(context);
        }
        t3.p pVarH = h(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(l(context, iT, pVarH, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof o.e) {
            try {
                ((o.e) context).applyOverrideConfiguration(l(context, iT, pVarH, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f4847m0) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f10 = configuration3.fontScale;
                float f11 = configuration4.fontScale;
                if (f10 != f11) {
                    configuration.fontScale = f11;
                }
                int i10 = configuration3.mcc;
                int i11 = configuration4.mcc;
                if (i10 != i11) {
                    configuration.mcc = i11;
                }
                int i12 = configuration3.mnc;
                int i13 = configuration4.mnc;
                if (i12 != i13) {
                    configuration.mnc = i13;
                }
                int i14 = Build.VERSION.SDK_INT;
                i0.a(configuration3, configuration4, configuration);
                int i15 = configuration3.touchscreen;
                int i16 = configuration4.touchscreen;
                if (i15 != i16) {
                    configuration.touchscreen = i16;
                }
                int i17 = configuration3.keyboard;
                int i18 = configuration4.keyboard;
                if (i17 != i18) {
                    configuration.keyboard = i18;
                }
                int i19 = configuration3.keyboardHidden;
                int i20 = configuration4.keyboardHidden;
                if (i19 != i20) {
                    configuration.keyboardHidden = i20;
                }
                int i21 = configuration3.navigation;
                int i22 = configuration4.navigation;
                if (i21 != i22) {
                    configuration.navigation = i22;
                }
                int i23 = configuration3.navigationHidden;
                int i24 = configuration4.navigationHidden;
                if (i23 != i24) {
                    configuration.navigationHidden = i24;
                }
                int i25 = configuration3.orientation;
                int i26 = configuration4.orientation;
                if (i25 != i26) {
                    configuration.orientation = i26;
                }
                int i27 = configuration3.screenLayout & 15;
                int i28 = configuration4.screenLayout & 15;
                if (i27 != i28) {
                    configuration.screenLayout |= i28;
                }
                int i29 = configuration3.screenLayout & PsExtractor.AUDIO_STREAM;
                int i30 = configuration4.screenLayout & PsExtractor.AUDIO_STREAM;
                if (i29 != i30) {
                    configuration.screenLayout |= i30;
                }
                int i31 = configuration3.screenLayout & 48;
                int i32 = configuration4.screenLayout & 48;
                if (i31 != i32) {
                    configuration.screenLayout |= i32;
                }
                int i33 = configuration3.screenLayout & 768;
                int i34 = configuration4.screenLayout & 768;
                if (i33 != i34) {
                    configuration.screenLayout |= i34;
                }
                if (i14 >= 26) {
                    j0.s(configuration3, configuration4, configuration);
                }
                int i35 = configuration3.uiMode & 15;
                int i36 = configuration4.uiMode & 15;
                if (i35 != i36) {
                    configuration.uiMode |= i36;
                }
                int i37 = configuration3.uiMode & 48;
                int i38 = configuration4.uiMode & 48;
                if (i37 != i38) {
                    configuration.uiMode |= i38;
                }
                int i39 = configuration3.screenWidthDp;
                int i40 = configuration4.screenWidthDp;
                if (i39 != i40) {
                    configuration.screenWidthDp = i40;
                }
                int i41 = configuration3.screenHeightDp;
                int i42 = configuration4.screenHeightDp;
                if (i41 != i42) {
                    configuration.screenHeightDp = i42;
                }
                int i43 = configuration3.smallestScreenWidthDp;
                int i44 = configuration4.smallestScreenWidthDp;
                if (i43 != i44) {
                    configuration.smallestScreenWidthDp = i44;
                }
                int i45 = configuration3.densityDpi;
                int i46 = configuration4.densityDpi;
                if (i45 != i46) {
                    configuration.densityDpi = i46;
                }
            }
        }
        Configuration configurationL = l(context, iT, pVarH, configuration, true);
        o.e eVar = new o.e(context, com.digidust.elokence.akinator.freemium.R.style.Theme_AppCompat_Empty);
        eVar.applyOverrideConfiguration(configurationL);
        try {
            if (context.getTheme() != null) {
                n3.o.rebase(eVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.attachBaseContext2(eVar);
    }

    @Override // androidx.appcompat.app.v
    public View createView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f4855h0 == null) {
            int[] iArr = k.a.f69986j;
            Context context2 = this.f4859m;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f4855h0 = new x0();
            } else {
                try {
                    this.f4855h0 = (x0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f4855h0 = new x0();
                }
            }
        }
        return this.f4855h0.createView(view, str, context, attributeSet, false, false, true, c4.shouldBeUsed());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(boolean r17, boolean r18) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t0.f(boolean, boolean):boolean");
    }

    @Override // androidx.appcompat.app.v
    public <T extends View> T findViewById(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o();
        return (T) this.f4860n.findViewById(i10);
    }

    public final void g(Window window) {
        if (this.f4860n != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m0) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m0 m0Var = new m0(this, callback);
        this.f4861o = m0Var;
        window.setCallback(m0Var);
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(this.f4859m, (AttributeSet) null, f4846l0);
        Drawable drawableIfKnown = n3VarObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        n3VarObtainStyledAttributes.recycle();
        this.f4860n = window;
        if (Build.VERSION.SDK_INT < 33 || this.f4856i0 != null) {
            return;
        }
        setOnBackInvokedDispatcher(null);
    }

    @Override // androidx.appcompat.app.v
    public Context getContextForDelegate() {
        return this.f4859m;
    }

    @Override // androidx.appcompat.app.v
    public final e getDrawerToggleDelegate() {
        return new c0(this);
    }

    @Override // androidx.appcompat.app.v
    public int getLocalNightMode() {
        return this.V;
    }

    @Override // androidx.appcompat.app.v
    public MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f4864r == null) {
            s();
            a aVar = this.f4863q;
            this.f4864r = new o.h(aVar != null ? aVar.getThemedContext() : this.f4859m);
        }
        return this.f4864r;
    }

    @Override // androidx.appcompat.app.v
    public a getSupportActionBar() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        s();
        return this.f4863q;
    }

    @Override // androidx.appcompat.app.v
    public boolean hasWindowFeature(int i10) {
        int i11;
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i11 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i11 = 109;
        } else {
            i11 = i10;
        }
        return (i11 != 1 ? i11 != 2 ? i11 != 5 ? i11 != 10 ? i11 != 108 ? i11 != 109 ? false : this.J : this.I : this.K : this.H : this.G : this.M) || this.f4860n.hasFeature(i10);
    }

    public final void i(int i10, r0 r0Var, p.m mVar) {
        if (mVar == null) {
            if (r0Var == null && i10 >= 0) {
                r0[] r0VarArr = this.O;
                if (i10 < r0VarArr.length) {
                    r0Var = r0VarArr[i10];
                }
            }
            if (r0Var != null) {
                mVar = r0Var.f4831h;
            }
        }
        if ((r0Var == null || r0Var.f4836m) && !this.T) {
            this.f4861o.bypassOnPanelClosed(this.f4860n.getCallback(), i10, mVar);
        }
    }

    @Override // androidx.appcompat.app.v
    public void installViewFactory() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4859m);
        if (layoutInflaterFrom.getFactory() == null) {
            x3.y.setFactory2(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof t0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.v
    public void invalidateOptionsMenu() {
        if (this.f4863q == null || getSupportActionBar().invalidateOptionsMenu()) {
            return;
        }
        this.f4850c0 |= 1;
        if (this.f4849b0) {
            return;
        }
        z1.postOnAnimation(this.f4860n.getDecorView(), this.f4851d0);
        this.f4849b0 = true;
    }

    @Override // androidx.appcompat.app.v
    public boolean isHandleNativeActionModesEnabled() {
        return this.B;
    }

    public final void j(p.m mVar) {
        if (this.N) {
            return;
        }
        this.N = true;
        this.f4866t.dismissPopups();
        Window.Callback callback = this.f4860n.getCallback();
        if (callback != null && !this.T) {
            callback.onPanelClosed(108, mVar);
        }
        this.N = false;
    }

    public final void k(r0 r0Var, boolean z10) {
        q0 q0Var;
        q.h1 h1Var;
        if (z10 && r0Var.f4824a == 0 && (h1Var = this.f4866t) != null && h1Var.isOverflowMenuShowing()) {
            j(r0Var.f4831h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f4859m.getSystemService("window");
        if (windowManager != null && r0Var.f4836m && (q0Var = r0Var.f4828e) != null) {
            windowManager.removeView(q0Var);
            if (z10) {
                i(r0Var.f4824a, r0Var, null);
            }
        }
        r0Var.f4834k = false;
        r0Var.f4835l = false;
        r0Var.f4836m = false;
        r0Var.f4829f = null;
        r0Var.f4837n = true;
        if (this.P == r0Var) {
            this.P = null;
        }
        if (r0Var.f4824a == 0) {
            z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t0.m(android.view.KeyEvent):boolean");
    }

    public final void n(int i10) {
        r0 r0VarR = r(i10);
        if (r0VarR.f4831h != null) {
            Bundle bundle = new Bundle();
            r0VarR.f4831h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                r0VarR.f4839p = bundle;
            }
            r0VarR.f4831h.stopDispatchingItemsChanged();
            r0VarR.f4831h.clear();
        }
        r0VarR.f4838o = true;
        r0VarR.f4837n = true;
        if ((i10 == 108 || i10 == 0) && this.f4866t != null) {
            r0 r0VarR2 = r(0);
            r0VarR2.f4834k = false;
            x(r0VarR2, null);
        }
    }

    public final void o() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.C) {
            return;
        }
        Context context = this.f4859m;
        int[] iArr = k.a.f69986j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            requestWindowFeature(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, false)) {
            requestWindowFeature(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, false)) {
            requestWindowFeature(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, false)) {
            requestWindowFeature(10);
        }
        this.L = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        p();
        this.f4860n.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.M) {
            viewGroup = this.K ? (ViewGroup) layoutInflaterFrom.inflate(com.digidust.elokence.akinator.freemium.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.digidust.elokence.akinator.freemium.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.L) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.digidust.elokence.akinator.freemium.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.J = false;
            this.I = false;
        } else if (this.I) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.digidust.elokence.akinator.freemium.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new o.e(context, typedValue.resourceId) : context).inflate(com.digidust.elokence.akinator.freemium.R.layout.abc_screen_toolbar, (ViewGroup) null);
            q.h1 h1Var = (q.h1) viewGroup.findViewById(com.digidust.elokence.akinator.freemium.R.id.decor_content_parent);
            this.f4866t = h1Var;
            h1Var.setWindowCallback(this.f4860n.getCallback());
            if (this.J) {
                this.f4866t.initFeature(109);
            }
            if (this.G) {
                this.f4866t.initFeature(2);
            }
            if (this.H) {
                this.f4866t.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb2.append(this.I);
            sb2.append(", windowActionBarOverlay: ");
            sb2.append(this.J);
            sb2.append(", android:windowIsFloating: ");
            sb2.append(this.L);
            sb2.append(", windowActionModeOverlay: ");
            sb2.append(this.K);
            sb2.append(", windowNoTitle: ");
            throw new IllegalArgumentException(a.b.q(sb2, this.M, " }"));
        }
        z1.setOnApplyWindowInsetsListener(viewGroup, new x(this));
        if (this.f4866t == null) {
            this.E = (TextView) viewGroup.findViewById(com.digidust.elokence.akinator.freemium.R.id.title);
        }
        f4.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.digidust.elokence.akinator.freemium.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f4860n.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f4860n.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new y(this));
        this.D = viewGroup;
        Object obj = this.f4858l;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4865s;
        if (!TextUtils.isEmpty(title)) {
            q.h1 h1Var2 = this.f4866t;
            if (h1Var2 != null) {
                h1Var2.setWindowTitle(title);
            } else {
                a aVar = this.f4863q;
                if (aVar != null) {
                    aVar.setWindowTitle(title);
                } else {
                    TextView textView = this.E;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.D.findViewById(R.id.content);
        View decorView = this.f4860n.getDecorView();
        contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)) {
            typedArrayObtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)) {
            typedArrayObtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL)) {
            typedArrayObtainStyledAttributes2.getValue(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(Sdk.SDKError.Reason.TPAT_ERROR_VALUE)) {
            typedArrayObtainStyledAttributes2.getValue(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.C = true;
        r0 r0VarR = r(0);
        if (this.T || r0VarR.f4831h != null) {
            return;
        }
        this.f4850c0 |= 4096;
        if (this.f4849b0) {
            return;
        }
        z1.postOnAnimation(this.f4860n.getDecorView(), this.f4851d0);
        this.f4849b0 = true;
    }

    @Override // androidx.appcompat.app.v
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        a supportActionBar;
        if (this.I && this.C && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        q.w wVar = q.w.get();
        Context context = this.f4859m;
        wVar.onConfigurationChanged(context);
        this.U = new Configuration(context.getResources().getConfiguration());
        f(false, false);
    }

    @Override // androidx.appcompat.app.v
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String parentActivityName;
        this.R = true;
        f(false, true);
        p();
        Object obj = this.f4858l;
        if (obj instanceof Activity) {
            try {
                parentActivityName = k3.a0.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                parentActivityName = null;
            }
            if (parentActivityName != null) {
                a aVar = this.f4863q;
                if (aVar == null) {
                    this.f4852e0 = true;
                } else {
                    aVar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            synchronized (v.f4881j) {
                v.d(this);
                v.f4880i.add(new WeakReference(this));
            }
        }
        this.U = new Configuration(this.f4859m.getResources().getConfiguration());
        this.S = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // androidx.appcompat.app.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4858l
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.v.f4881j
            monitor-enter(r0)
            androidx.appcompat.app.v.d(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f4849b0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f4860n
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.w r1 = r3.f4851d0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.T = r0
            int r0 = r3.V
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f4858l
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            z.t1 r0 = androidx.appcompat.app.t0.f4845k0
            java.lang.Object r1 = r3.f4858l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.V
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            z.t1 r0 = androidx.appcompat.app.t0.f4845k0
            java.lang.Object r1 = r3.f4858l
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.a r0 = r3.f4863q
            if (r0 == 0) goto L63
            r0.a()
        L63:
            androidx.appcompat.app.p0 r0 = r3.Z
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            androidx.appcompat.app.n0 r0 = r3.f4848a0
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t0.onDestroy():void");
    }

    @Override // p.k
    public boolean onMenuItemSelected(p.m mVar, MenuItem menuItem) {
        r0 r0Var;
        Window.Callback callback = this.f4860n.getCallback();
        if (callback != null && !this.T) {
            p.m rootMenu = mVar.getRootMenu();
            r0[] r0VarArr = this.O;
            int length = r0VarArr != null ? r0VarArr.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    r0Var = r0VarArr[i10];
                    if (r0Var != null && r0Var.f4831h == rootMenu) {
                        break;
                    }
                    i10++;
                } else {
                    r0Var = null;
                    break;
                }
            }
            if (r0Var != null) {
                return callback.onMenuItemSelected(r0Var.f4824a, menuItem);
            }
        }
        return false;
    }

    @Override // p.k
    public void onMenuModeChange(p.m mVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        q.h1 h1Var = this.f4866t;
        if (h1Var == null || !h1Var.canShowOverflowMenu() || (ViewConfiguration.get(this.f4859m).hasPermanentMenuKey() && !this.f4866t.isOverflowMenuShowPending())) {
            r0 r0VarR = r(0);
            r0VarR.f4837n = true;
            k(r0VarR, false);
            v(r0VarR, null);
            return;
        }
        Window.Callback callback = this.f4860n.getCallback();
        if (this.f4866t.isOverflowMenuShowing()) {
            this.f4866t.hideOverflowMenu();
            if (this.T) {
                return;
            }
            callback.onPanelClosed(108, r(0).f4831h);
            return;
        }
        if (callback == null || this.T) {
            return;
        }
        if (this.f4849b0 && (1 & this.f4850c0) != 0) {
            View decorView = this.f4860n.getDecorView();
            w wVar = this.f4851d0;
            decorView.removeCallbacks(wVar);
            wVar.run();
        }
        r0 r0VarR2 = r(0);
        p.m mVar2 = r0VarR2.f4831h;
        if (mVar2 == null || r0VarR2.f4838o || !callback.onPreparePanel(0, r0VarR2.f4830g, mVar2)) {
            return;
        }
        callback.onMenuOpened(108, r0VarR2.f4831h);
        this.f4866t.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.v
    public void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o();
    }

    @Override // androidx.appcompat.app.v
    public void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.v
    public void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        f(true, false);
    }

    @Override // androidx.appcompat.app.v
    public void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    public final void p() {
        if (this.f4860n == null) {
            Object obj = this.f4858l;
            if (obj instanceof Activity) {
                g(((Activity) obj).getWindow());
            }
        }
        if (this.f4860n == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final o0 q(Context context) {
        if (this.Z == null) {
            if (i1.f4753d == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService(DtbConstants.PRIVACY_LOCATION_KEY);
                i1 i1Var = new i1();
                i1Var.f4756c = new h1();
                i1Var.f4754a = applicationContext;
                i1Var.f4755b = locationManager;
                i1.f4753d = i1Var;
            }
            this.Z = new p0(this, i1.f4753d);
        }
        return this.Z;
    }

    public final r0 r(int i10) {
        r0[] r0VarArr = this.O;
        if (r0VarArr == null || r0VarArr.length <= i10) {
            r0[] r0VarArr2 = new r0[i10 + 1];
            if (r0VarArr != null) {
                System.arraycopy(r0VarArr, 0, r0VarArr2, 0, r0VarArr.length);
            }
            this.O = r0VarArr2;
            r0VarArr = r0VarArr2;
        }
        r0 r0Var = r0VarArr[i10];
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0();
        r0Var2.f4824a = i10;
        r0Var2.f4837n = false;
        r0VarArr[i10] = r0Var2;
        return r0Var2;
    }

    @Override // androidx.appcompat.app.v
    public boolean requestWindowFeature(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.M && i10 == 108) {
            return false;
        }
        if (this.I && i10 == 1) {
            this.I = false;
        }
        if (i10 == 1) {
            y();
            this.M = true;
            return true;
        }
        if (i10 == 2) {
            y();
            this.G = true;
            return true;
        }
        if (i10 == 5) {
            y();
            this.H = true;
            return true;
        }
        if (i10 == 10) {
            y();
            this.K = true;
            return true;
        }
        if (i10 == 108) {
            y();
            this.I = true;
            return true;
        }
        if (i10 != 109) {
            return this.f4860n.requestFeature(i10);
        }
        y();
        this.J = true;
        return true;
    }

    public final void s() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o();
        if (this.I && this.f4863q == null) {
            Object obj = this.f4858l;
            if (obj instanceof Activity) {
                this.f4863q = new m1((Activity) obj, this.J);
            } else if (obj instanceof Dialog) {
                this.f4863q = new m1((Dialog) obj);
            }
            a aVar = this.f4863q;
            if (aVar != null) {
                aVar.setDefaultDisplayHomeAsUpEnabled(this.f4852e0);
            }
        }
    }

    @Override // androidx.appcompat.app.v
    public void setContentView(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o();
        ViewGroup viewGroup = (ViewGroup) this.D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4861o.bypassOnContentChanged(this.f4860n.getCallback());
    }

    @Override // androidx.appcompat.app.v
    public void setHandleNativeActionModesEnabled(boolean z10) {
        this.B = z10;
    }

    @Override // androidx.appcompat.app.v
    public void setLocalNightMode(int i10) {
        if (this.V != i10) {
            this.V = i10;
            if (this.R) {
                applyDayNight();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // androidx.appcompat.app.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.setOnBackInvokedDispatcher(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f4856i0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f4857j0
            if (r1 == 0) goto L11
            androidx.appcompat.app.l0.c(r0, r1)
            r0 = 0
            r2.f4857j0 = r0
        L11:
            if (r3 != 0) goto L2b
            java.lang.Object r0 = r2.f4858l
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2b
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L2b
            android.app.Activity r0 = (android.app.Activity) r0
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.l0.a(r0)
            r2.f4856i0 = r3
            goto L2d
        L2b:
            r2.f4856i0 = r3
        L2d:
            r2.z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t0.setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher):void");
    }

    @Override // androidx.appcompat.app.v
    public void setSupportActionBar(Toolbar toolbar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f4858l;
        if (obj instanceof Activity) {
            a supportActionBar = getSupportActionBar();
            if (supportActionBar instanceof m1) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f4864r = null;
            if (supportActionBar != null) {
                supportActionBar.a();
            }
            this.f4863q = null;
            if (toolbar != null) {
                f1 f1Var = new f1(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4865s, this.f4861o);
                this.f4863q = f1Var;
                this.f4861o.f4770c = f1Var.f4731c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f4861o.f4770c = null;
            }
            invalidateOptionsMenu();
        }
    }

    @Override // androidx.appcompat.app.v
    public void setTheme(int i10) {
        this.W = i10;
    }

    @Override // androidx.appcompat.app.v
    public final void setTitle(CharSequence charSequence) {
        this.f4865s = charSequence;
        q.h1 h1Var = this.f4866t;
        if (h1Var != null) {
            h1Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f4863q;
        if (aVar != null) {
            aVar.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    @Override // androidx.appcompat.app.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.c startSupportActionMode(o.b r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t0.startSupportActionMode(o.b):o.c");
    }

    public final int t(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f4848a0 == null) {
                            this.f4848a0 = new n0(this, context);
                        }
                        return this.f4848a0.getApplyableNightMode();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return q(context).getApplyableNightMode();
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean u() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10 = this.Q;
        this.Q = false;
        r0 r0VarR = r(0);
        if (!r0VarR.f4836m) {
            o.c cVar = this.f4869w;
            if (cVar != null) {
                cVar.finish();
                return true;
            }
            a supportActionBar = getSupportActionBar();
            if (supportActionBar == null || !supportActionBar.collapseActionView()) {
                return false;
            }
        } else if (!z10) {
            k(r0VarR, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(androidx.appcompat.app.r0 r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t0.v(androidx.appcompat.app.r0, android.view.KeyEvent):void");
    }

    public final boolean w(r0 r0Var, int i10, KeyEvent keyEvent) {
        p.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((r0Var.f4834k || x(r0Var, keyEvent)) && (mVar = r0Var.f4831h) != null) {
            return mVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(androidx.appcompat.app.r0 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t0.x(androidx.appcompat.app.r0, android.view.KeyEvent):boolean");
    }

    public final void y() {
        if (this.C) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void z() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f4856i0 != null && (r(0).f4836m || this.f4869w != null)) {
                z10 = true;
            }
            if (z10 && this.f4857j0 == null) {
                this.f4857j0 = l0.b(this.f4856i0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.f4857j0) == null) {
                    return;
                }
                l0.c(this.f4856i0, onBackInvokedCallback);
                this.f4857j0 = null;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.v
    public void setContentView(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o();
        ViewGroup viewGroup = (ViewGroup) this.D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4859m).inflate(i10, viewGroup);
        this.f4861o.bypassOnContentChanged(this.f4860n.getCallback());
    }

    @Override // androidx.appcompat.app.v
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o();
        ViewGroup viewGroup = (ViewGroup) this.D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4861o.bypassOnContentChanged(this.f4860n.getCallback());
    }

    @Override // androidx.appcompat.app.v
    public void onSaveInstanceState(Bundle bundle) {
    }
}
