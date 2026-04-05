package ci;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f12321b;

    /* renamed from: c, reason: collision with root package name */
    public static final Handler f12322c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0[] f12323e;

    static {
        a0 a0Var = new a0("INSTANCE", 0);
        f12321b = a0Var;
        f12323e = new a0[]{a0Var};
        f12322c = new Handler(Looper.getMainLooper());
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f12323e.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f12322c.post(runnable);
    }
}
