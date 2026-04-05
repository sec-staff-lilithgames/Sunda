package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.b6;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y4 {

    /* renamed from: b, reason: collision with root package name */
    private static com.applovin.impl.sdk.k f16292b;

    /* renamed from: c, reason: collision with root package name */
    private static SharedPreferences f16293c;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f16294a;

    public y4(com.applovin.impl.sdk.k kVar) {
        this.f16294a = com.applovin.impl.sdk.k.o().getSharedPreferences("com.applovin.sdk.preferences." + kVar.j0(), 0);
        f16292b = kVar;
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        a(str, obj, (SharedPreferences) null, editor);
    }

    public void b(x4 x4Var, Object obj) {
        b(x4Var, obj, this.f16294a);
    }

    public void a(String str, Object obj, SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public void b(x4 x4Var, Object obj, SharedPreferences sharedPreferences) {
        a(x4Var.a(), obj, sharedPreferences);
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z10 = editor != null;
        if (!z10) {
            editor = sharedPreferences.edit();
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            } else if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else {
                com.applovin.impl.sdk.o.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z10) {
            return;
        }
        a(editor);
    }

    public static void b(x4 x4Var, Object obj, Context context) {
        a(x4Var.a(), obj, a(context), (SharedPreferences.Editor) null);
    }

    public void b(x4 x4Var) {
        a(this.f16294a.edit().remove(x4Var.a()));
    }

    public Object a(x4 x4Var, Object obj) {
        return a(x4Var, obj, this.f16294a);
    }

    public Object a(x4 x4Var, Object obj, SharedPreferences sharedPreferences) {
        return a(x4Var.a(), obj, x4Var.b(), sharedPreferences);
    }

    public static Object a(x4 x4Var, Object obj, Context context) {
        return a(x4Var.a(), obj, x4Var.b(), a(context));
    }

    public static Object a(x4 x4Var, Object obj, SharedPreferences sharedPreferences, boolean z10) {
        return a(x4Var.a(), obj, x4Var.b(), sharedPreferences, z10);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z10) {
        Object stringSet;
        long jLongValue;
        int iIntValue;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                }
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Long.class)) {
                        iIntValue = ((Long) obj).intValue();
                    } else {
                        iIntValue = ((Integer) obj).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, iIntValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Integer.class)) {
                        jLongValue = ((Integer) obj).longValue();
                    } else {
                        jLongValue = ((Long) obj).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, jLongValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            return stringSet != null ? cls.cast(stringSet) : obj;
        } catch (Throwable th2) {
            if (z10) {
                try {
                    com.applovin.impl.sdk.o.c("SharedPreferencesManager", "Error getting value for key: " + str, th2);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public Object a(x4 x4Var) {
        Object objA = a(x4Var, null);
        b(x4Var);
        return objA;
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public static void a(SharedPreferences.Editor editor) {
        try {
            if (k7.h()) {
                com.applovin.impl.sdk.k kVar = f16292b;
                if (kVar != null && kVar.r0() != null) {
                    b6 b6VarR0 = f16292b.r0();
                    com.applovin.impl.sdk.k kVar2 = f16292b;
                    Objects.requireNonNull(editor);
                    b6VarR0.a((g5) new p6(kVar2, true, "commitSharedPreferencesChanges", new m9(editor, 12)), b6.b.OTHER);
                    return;
                }
                editor.apply();
                return;
            }
            editor.commit();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("SharedPreferencesManager", "Unable to apply changes", th2);
            try {
                f16292b.E().a("SharedPreferencesManager", "persistChanges", th2);
            } catch (Throwable unused) {
            }
        }
    }

    private static SharedPreferences a(Context context) {
        if (f16293c == null) {
            f16293c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f16293c;
    }
}
