package de;

import android.os.Handler;
import com.google.android.exoplayer2.util.n1;
import com.ironsource.lh;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f52159a;

    /* renamed from: b, reason: collision with root package name */
    public final bf.d0 f52160b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f52161c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f52162a;

        /* renamed from: b, reason: collision with root package name */
        public final q f52163b;

        public a(Handler handler, q qVar) {
            this.f52162a = handler;
            this.f52163b = qVar;
        }
    }

    public p() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public void addEventListener(Handler handler, q qVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(handler);
        com.google.android.exoplayer2.util.a.checkNotNull(qVar);
        this.f52161c.add(new a(handler, qVar));
    }

    public void drmKeysLoaded() {
        Iterator it = this.f52161c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            n1.postOrRun(aVar.f52162a, new o(this, aVar.f52163b, 2));
        }
    }

    public void drmKeysRemoved() {
        Iterator it = this.f52161c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            n1.postOrRun(aVar.f52162a, new o(this, aVar.f52163b, 0));
        }
    }

    public void drmKeysRestored() {
        Iterator it = this.f52161c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            n1.postOrRun(aVar.f52162a, new o(this, aVar.f52163b, 1));
        }
    }

    public void drmSessionAcquired(int i10) {
        Iterator it = this.f52161c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            n1.postOrRun(aVar.f52162a, new androidx.browser.customtabs.h(this, aVar.f52163b, i10, 5));
        }
    }

    public void drmSessionManagerError(Exception exc) {
        Iterator it = this.f52161c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            n1.postOrRun(aVar.f52162a, new lh(this, 20, aVar.f52163b, exc));
        }
    }

    public void drmSessionReleased() {
        Iterator it = this.f52161c.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            n1.postOrRun(aVar.f52162a, new o(this, aVar.f52163b, 3));
        }
    }

    public void removeEventListener(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f52161c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f52163b == qVar) {
                copyOnWriteArrayList.remove(aVar);
            }
        }
    }

    public p withParameters(int i10, bf.d0 d0Var) {
        return new p(this.f52161c, i10, d0Var);
    }

    public p(CopyOnWriteArrayList copyOnWriteArrayList, int i10, bf.d0 d0Var) {
        this.f52161c = copyOnWriteArrayList;
        this.f52159a = i10;
        this.f52160b = d0Var;
    }
}
