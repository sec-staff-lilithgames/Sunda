package g5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f57301a;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f57303c;

    /* renamed from: d, reason: collision with root package name */
    public k f57304d;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences.Editor f57305e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f57306f;

    /* renamed from: g, reason: collision with root package name */
    public String f57307g;

    /* renamed from: h, reason: collision with root package name */
    public int f57308h;

    /* renamed from: j, reason: collision with root package name */
    public PreferenceScreen f57310j;

    /* renamed from: k, reason: collision with root package name */
    public a f57311k;

    /* renamed from: b, reason: collision with root package name */
    public long f57302b = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f57309i = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract boolean arePreferenceContentsTheSame(Preference preference, Preference preference2);

        public abstract boolean arePreferenceItemsTheSame(Preference preference, Preference preference2);
    }

    public r(Context context) {
        this.f57301a = context;
        setSharedPreferencesName(a(context));
    }

    public static String a(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static SharedPreferences getDefaultSharedPreferences(Context context) {
        return context.getSharedPreferences(a(context), 0);
    }

    public static void setDefaultValues(Context context, int i10, boolean z10) {
        setDefaultValues(context, a(context), 0, i10, z10);
    }

    public final SharedPreferences.Editor b() {
        if (this.f57304d != null) {
            return null;
        }
        if (!this.f57306f) {
            return getSharedPreferences().edit();
        }
        if (this.f57305e == null) {
            this.f57305e = getSharedPreferences().edit();
        }
        return this.f57305e;
    }

    public PreferenceScreen createPreferenceScreen(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.e(this);
        return preferenceScreen;
    }

    public <T extends Preference> T findPreference(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f57310j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.findPreference(charSequence);
    }

    public Context getContext() {
        return this.f57301a;
    }

    public o getOnDisplayPreferenceDialogListener() {
        return null;
    }

    public p getOnNavigateToScreenListener() {
        return null;
    }

    public q getOnPreferenceTreeClickListener() {
        return null;
    }

    public a getPreferenceComparisonCallback() {
        return this.f57311k;
    }

    public k getPreferenceDataStore() {
        return this.f57304d;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.f57310j;
    }

    public SharedPreferences getSharedPreferences() {
        if (getPreferenceDataStore() != null) {
            return null;
        }
        if (this.f57303c == null) {
            int i10 = this.f57309i;
            Context contextCreateDeviceProtectedStorageContext = this.f57301a;
            if (i10 == 1) {
                contextCreateDeviceProtectedStorageContext = m3.a.createDeviceProtectedStorageContext(contextCreateDeviceProtectedStorageContext);
            }
            this.f57303c = contextCreateDeviceProtectedStorageContext.getSharedPreferences(this.f57307g, this.f57308h);
        }
        return this.f57303c;
    }

    public int getSharedPreferencesMode() {
        return this.f57308h;
    }

    public String getSharedPreferencesName() {
        return this.f57307g;
    }

    public PreferenceScreen inflateFromResource(Context context, int i10, PreferenceScreen preferenceScreen) {
        this.f57306f = true;
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new n(context, this).inflate(i10, preferenceScreen);
        preferenceScreen2.e(this);
        SharedPreferences.Editor editor = this.f57305e;
        if (editor != null) {
            editor.apply();
        }
        this.f57306f = false;
        return preferenceScreen2;
    }

    public boolean isStorageDefault() {
        return this.f57309i == 0;
    }

    public boolean isStorageDeviceProtected() {
        return this.f57309i == 1;
    }

    public void setPreferenceComparisonCallback(a aVar) {
        this.f57311k = aVar;
    }

    public void setPreferenceDataStore(k kVar) {
        this.f57304d = kVar;
    }

    public boolean setPreferences(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f57310j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.onDetached();
        }
        this.f57310j = preferenceScreen;
        return true;
    }

    public void setSharedPreferencesMode(int i10) {
        this.f57308h = i10;
        this.f57303c = null;
    }

    public void setSharedPreferencesName(String str) {
        this.f57307g = str;
        this.f57303c = null;
    }

    public void setStorageDefault() {
        this.f57309i = 0;
        this.f57303c = null;
    }

    public void setStorageDeviceProtected() {
        this.f57309i = 1;
        this.f57303c = null;
    }

    public static void setDefaultValues(Context context, String str, int i10, int i11, boolean z10) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        if (z10 || !sharedPreferences.getBoolean("_has_set_default_values", false)) {
            r rVar = new r(context);
            rVar.setSharedPreferencesName(str);
            rVar.setSharedPreferencesMode(i10);
            rVar.inflateFromResource(context, i11, null);
            sharedPreferences.edit().putBoolean("_has_set_default_values", true).apply();
        }
    }

    public void setOnDisplayPreferenceDialogListener(o oVar) {
    }

    public void setOnNavigateToScreenListener(p pVar) {
    }

    public void setOnPreferenceTreeClickListener(q qVar) {
    }

    public void showDialog(Preference preference) {
    }
}
