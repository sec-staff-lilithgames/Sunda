package fu;

import com.ironsource.C3191e4;
import j1.o2;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends AtomicLong implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final String f56114b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56115c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56116e;

    public x(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f56114b + '-' + incrementAndGet();
        Thread wVar = this.f56116e ? new w(runnable, str) : new Thread(runnable, str);
        wVar.setPriority(this.f56115c);
        wVar.setDaemon(true);
        return wVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return o2.o(new StringBuilder("RxThreadFactory["), this.f56114b, C3191e4.i.f36531e);
    }

    public x(String str, int i10) {
        this(str, i10, false);
    }

    public x(String str, int i10, boolean z10) {
        this.f56114b = str;
        this.f56115c = i10;
        this.f56116e = z10;
    }
}
