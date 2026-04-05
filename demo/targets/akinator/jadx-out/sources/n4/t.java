package n4;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f75633a = new LinkedHashSet();

    public static final m4.f SharedPreferencesMigration(Context context, String sharedPreferencesName) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, sharedPreferencesName, null, 4, null);
    }

    public static /* synthetic */ m4.f SharedPreferencesMigration$default(kv.a aVar, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = f75633a;
        }
        return SharedPreferencesMigration(aVar, (Set<String>) set);
    }

    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return f75633a;
    }

    public static final m4.f SharedPreferencesMigration(kv.a produceSharedPreferences) {
        e0.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        return SharedPreferencesMigration$default(produceSharedPreferences, null, 2, null);
    }

    public static final m4.f SharedPreferencesMigration(kv.a produceSharedPreferences, Set<String> keysToMigrate) {
        e0.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        e0.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == f75633a) {
            return new m4.f(produceSharedPreferences, (Set) null, new s(keysToMigrate, null), new r(3, null), 2, (u) null);
        }
        return new m4.f(produceSharedPreferences, keysToMigrate, new s(keysToMigrate, null), new r(3, null));
    }

    public static /* synthetic */ m4.f SharedPreferencesMigration$default(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f75633a;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final m4.f SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        e0.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == f75633a) {
            return new m4.f(context, sharedPreferencesName, null, new s(keysToMigrate, null), new r(3, null), 4, null);
        }
        return new m4.f(context, sharedPreferencesName, keysToMigrate, new s(keysToMigrate, null), new r(3, null));
    }
}
