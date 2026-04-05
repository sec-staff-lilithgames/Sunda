package r8;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: i, reason: collision with root package name */
    public static final int f84029i;

    /* renamed from: a, reason: collision with root package name */
    public final Context f84030a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f84031b;

    /* renamed from: c, reason: collision with root package name */
    public final q f84032c;

    /* renamed from: e, reason: collision with root package name */
    public float f84034e;

    /* renamed from: d, reason: collision with root package name */
    public float f84033d = 2.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f84035f = 0.4f;

    /* renamed from: g, reason: collision with root package name */
    public float f84036g = 0.33f;

    /* renamed from: h, reason: collision with root package name */
    public int f84037h = 4194304;

    static {
        f84029i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public p(Context context) {
        this.f84034e = f84029i;
        this.f84030a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f84031b = activityManager;
        this.f84032c = new q(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f84034e = 0.0f;
    }

    public s build() {
        return new s(this);
    }

    public p setArrayPoolSize(int i10) {
        this.f84037h = i10;
        return this;
    }

    public p setBitmapPoolScreens(float f10) {
        j9.q.checkArgument(f10 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
        this.f84034e = f10;
        return this;
    }

    public p setLowMemoryMaxSizeMultiplier(float f10) {
        j9.q.checkArgument(f10 >= 0.0f && f10 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
        this.f84036g = f10;
        return this;
    }

    public p setMaxSizeMultiplier(float f10) {
        j9.q.checkArgument(f10 >= 0.0f && f10 <= 1.0f, "Size multiplier must be between 0 and 1");
        this.f84035f = f10;
        return this;
    }

    public p setMemoryCacheScreens(float f10) {
        j9.q.checkArgument(f10 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
        this.f84033d = f10;
        return this;
    }
}
