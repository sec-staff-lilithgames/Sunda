package dr;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f52587a = new Handler(Looper.getMainLooper());

    @Override // dr.c
    public final Handler a() {
        return f52587a;
    }

    @Override // dr.c, dr.a, dr.d
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10) {
        super.schedule(runnable, j10);
    }
}
