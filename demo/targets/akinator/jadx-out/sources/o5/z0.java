package o5;

import android.app.ActivityManager;
import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f77853b;

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f77854c;

    /* renamed from: e, reason: collision with root package name */
    public static final z0 f77855e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ z0[] f77856f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f77857g;

    static {
        z0 z0Var = new z0("AUTOMATIC", 0);
        f77853b = z0Var;
        z0 z0Var2 = new z0("TRUNCATE", 1);
        f77854c = z0Var2;
        z0 z0Var3 = new z0("WRITE_AHEAD_LOGGING", 2);
        f77855e = z0Var3;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3};
        f77856f = z0VarArr;
        f77857g = cv.b.enumEntries(z0VarArr);
    }

    public static cv.a getEntries() {
        return f77857g;
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f77856f.clone();
    }

    public final z0 resolve$room_runtime_release(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (this != f77853b) {
            return this;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        return (activityManager == null || activityManager.isLowRamDevice()) ? f77854c : f77855e;
    }
}
