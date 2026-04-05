package p6;

import java.util.HashMap;
import n6.c0;
import n6.r0;
import o6.r;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f80688e = c0.tagWithPrefix("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    public final r f80689a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f80690b;

    /* renamed from: c, reason: collision with root package name */
    public final n6.b f80691c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f80692d = new HashMap();

    public b(r rVar, r0 r0Var, n6.b bVar) {
        this.f80689a = rVar;
        this.f80690b = r0Var;
        this.f80691c = bVar;
    }

    public void schedule(b0 b0Var, long j10) {
        String str = b0Var.f89053a;
        HashMap map = this.f80692d;
        Runnable runnable = (Runnable) map.remove(str);
        r0 r0Var = this.f80690b;
        if (runnable != null) {
            r0Var.cancel(runnable);
        }
        a aVar = new a(this, b0Var);
        map.put(b0Var.f89053a, aVar);
        r0Var.scheduleWithDelay(j10 - this.f80691c.currentTimeMillis(), aVar);
    }

    public void unschedule(String str) {
        Runnable runnable = (Runnable) this.f80692d.remove(str);
        if (runnable != null) {
            this.f80690b.cancel(runnable);
        }
    }
}
