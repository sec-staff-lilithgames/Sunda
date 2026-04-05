package io.odeeo.internal.f;

import android.os.Handler;
import io.bidmachine.media3.exoplayer.b1;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.q0.g0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f63918a;

        /* renamed from: b, reason: collision with root package name */
        public final t.a f63919b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0610a> f63920c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.f.g$a$a, reason: collision with other inner class name */
        public static final class C0610a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f63921a;

            /* renamed from: b, reason: collision with root package name */
            public g f63922b;

            public C0610a(Handler handler, g gVar) {
                this.f63921a = handler;
                this.f63922b = gVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void addEventListener(Handler handler, g gVar) {
            io.odeeo.internal.q0.a.checkNotNull(handler);
            io.odeeo.internal.q0.a.checkNotNull(gVar);
            this.f63920c.add(new C0610a(handler, gVar));
        }

        public void drmKeysLoaded() {
            Iterator<C0610a> it = this.f63920c.iterator();
            while (it.hasNext()) {
                C0610a next = it.next();
                g0.postOrRun(next.f63921a, new os.a(this, next.f63922b, 3));
            }
        }

        public void drmKeysRemoved() {
            Iterator<C0610a> it = this.f63920c.iterator();
            while (it.hasNext()) {
                C0610a next = it.next();
                g0.postOrRun(next.f63921a, new os.a(this, next.f63922b, 0));
            }
        }

        public void drmKeysRestored() {
            Iterator<C0610a> it = this.f63920c.iterator();
            while (it.hasNext()) {
                C0610a next = it.next();
                g0.postOrRun(next.f63921a, new os.a(this, next.f63922b, 2));
            }
        }

        public void drmSessionAcquired(int i10) {
            Iterator<C0610a> it = this.f63920c.iterator();
            while (it.hasNext()) {
                C0610a next = it.next();
                g0.postOrRun(next.f63921a, new androidx.browser.customtabs.h(this, next.f63922b, i10, 11));
            }
        }

        public void drmSessionManagerError(Exception exc) {
            Iterator<C0610a> it = this.f63920c.iterator();
            while (it.hasNext()) {
                C0610a next = it.next();
                g0.postOrRun(next.f63921a, new b1(this, 12, next.f63922b, exc));
            }
        }

        public void drmSessionReleased() {
            Iterator<C0610a> it = this.f63920c.iterator();
            while (it.hasNext()) {
                C0610a next = it.next();
                g0.postOrRun(next.f63921a, new os.a(this, next.f63922b, 1));
            }
        }

        public void removeEventListener(g gVar) {
            Iterator<C0610a> it = this.f63920c.iterator();
            while (it.hasNext()) {
                C0610a next = it.next();
                if (next.f63922b == gVar) {
                    this.f63920c.remove(next);
                }
            }
        }

        public a withParameters(int i10, t.a aVar) {
            return new a(this.f63920c, i10, aVar);
        }

        public a(CopyOnWriteArrayList<C0610a> copyOnWriteArrayList, int i10, t.a aVar) {
            this.f63920c = copyOnWriteArrayList;
            this.f63918a = i10;
            this.f63919b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(g gVar, int i10) {
            gVar.onDrmSessionAcquired(this.f63918a, this.f63919b);
            gVar.onDrmSessionAcquired(this.f63918a, this.f63919b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(g gVar) {
            gVar.onDrmKeysRemoved(this.f63918a, this.f63919b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(g gVar) {
            gVar.onDrmKeysRestored(this.f63918a, this.f63919b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(g gVar) {
            gVar.onDrmSessionReleased(this.f63918a, this.f63919b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(g gVar) {
            gVar.onDrmKeysLoaded(this.f63918a, this.f63919b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(g gVar, Exception exc) {
            gVar.onDrmSessionManagerError(this.f63918a, this.f63919b, exc);
        }
    }

    @Deprecated
    default void onDrmSessionAcquired(int i10, t.a aVar) {
    }

    default void onDrmSessionAcquired(int i10, t.a aVar, int i11) {
    }

    default void onDrmKeysLoaded(int i10, t.a aVar) {
    }

    default void onDrmKeysRemoved(int i10, t.a aVar) {
    }

    default void onDrmKeysRestored(int i10, t.a aVar) {
    }

    default void onDrmSessionReleased(int i10, t.a aVar) {
    }

    default void onDrmSessionManagerError(int i10, t.a aVar, Exception exc) {
    }
}
