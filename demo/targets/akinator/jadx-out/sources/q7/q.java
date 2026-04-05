package q7;

import android.os.SystemClock;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f82550a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final File f82551b = new File("/proc/self/fd");

    /* renamed from: c, reason: collision with root package name */
    public static int f82552c = 30;

    /* renamed from: d, reason: collision with root package name */
    public static long f82553d = SystemClock.uptimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f82554e = true;

    public final synchronized boolean hasAvailableFileDescriptors(v vVar) {
        try {
            int i10 = f82552c;
            f82552c = i10 + 1;
            if (i10 >= 30 || SystemClock.uptimeMillis() > f82553d + 30000) {
                f82552c = 0;
                f82553d = SystemClock.uptimeMillis();
                String[] list = f82551b.list();
                if (list == null) {
                    list = new String[0];
                }
                boolean z10 = list.length < 800;
                f82554e = z10;
                if (!z10 && vVar != null && vVar.getLevel() <= 5) {
                    vVar.a();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f82554e;
    }
}
