package sn;

import android.os.Handler;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.b1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f86034a;

    /* renamed from: b, reason: collision with root package name */
    public final ao.k0 f86035b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f86036c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f86037a;

        /* renamed from: b, reason: collision with root package name */
        public final r f86038b;

        public a(Handler handler, r rVar) {
            this.f86037a = handler;
            this.f86038b = rVar;
        }
    }

    public q() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public void addEventListener(Handler handler, r rVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(handler);
        io.bidmachine.media3.common.util.a.checkNotNull(rVar);
        this.f86036c.add(new a(handler, rVar));
    }

    public void drmKeysLoaded() {
        Iterator it = this.f86036c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a1.postOrRun(aVar.f86037a, new p(this, aVar.f86038b, 0));
        }
    }

    public void drmKeysRemoved() {
        Iterator it = this.f86036c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a1.postOrRun(aVar.f86037a, new p(this, aVar.f86038b, 3));
        }
    }

    public void drmKeysRestored() {
        Iterator it = this.f86036c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a1.postOrRun(aVar.f86037a, new p(this, aVar.f86038b, 1));
        }
    }

    public void drmSessionAcquired(int i10) {
        Iterator it = this.f86036c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a1.postOrRun(aVar.f86037a, new androidx.browser.customtabs.h(this, aVar.f86038b, i10, 14));
        }
    }

    public void drmSessionManagerError(Exception exc) {
        Iterator it = this.f86036c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a1.postOrRun(aVar.f86037a, new b1(this, 16, aVar.f86038b, exc));
        }
    }

    public void drmSessionReleased() {
        Iterator it = this.f86036c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            a1.postOrRun(aVar.f86037a, new p(this, aVar.f86038b, 2));
        }
    }

    public void removeEventListener(r rVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f86036c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f86038b == rVar) {
                copyOnWriteArrayList.remove(aVar);
            }
        }
    }

    public q withParameters(int i10, ao.k0 k0Var) {
        return new q(this.f86036c, i10, k0Var);
    }

    public q(CopyOnWriteArrayList copyOnWriteArrayList, int i10, ao.k0 k0Var) {
        this.f86036c = copyOnWriteArrayList;
        this.f86034a = i10;
        this.f86035b = k0Var;
    }
}
