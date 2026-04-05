package com.applovin.impl;

import android.os.Handler;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13396a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f13397b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f13398c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f13399d = new AtomicInteger();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public interface b {
        void a();

        boolean b();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f13400a;

        /* renamed from: b, reason: collision with root package name */
        private final b f13401b;

        /* renamed from: c, reason: collision with root package name */
        private final long f13402c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f13400a;
            String str2 = ((c) obj).f13400a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f13400a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CountdownProxy{identifier='");
            sb2.append(this.f13400a);
            sb2.append("', countdownStepMillis=");
            return e3.g.n(sb2, this.f13402c, AbstractJsonLexerKt.END_OBJ);
        }

        private c(String str, long j10, b bVar) {
            this.f13400a = str;
            this.f13402c = j10;
            this.f13401b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f13401b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f13402c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f13400a;
        }
    }

    public a1(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f13397b = handler;
        this.f13396a = kVar.O();
    }

    public void b() {
        HashSet hashSet = new HashSet(this.f13398c);
        if (com.applovin.impl.sdk.o.a()) {
            this.f13396a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f13399d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (com.applovin.impl.sdk.o.a()) {
                this.f13396a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f13396a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f13399d.incrementAndGet();
        this.f13397b.removeCallbacksAndMessages(null);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f13396a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f13398c.clear();
    }

    public void a(String str, long j10, b bVar) {
        if (j10 > 0) {
            if (this.f13397b != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    b0.e2.y("Adding countdown: ", str, this.f13396a, "CountdownManager");
                }
                this.f13398c.add(new c(str, j10, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f13399d.get() == i10) {
                try {
                    bVarA.a();
                    a(cVar, i10);
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f13396a.a("CountdownManager", uQjDr.PWBpJFGF + cVar.c(), th2);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f13396a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            b0.e2.B(new StringBuilder("Ending countdown for "), cVar.c(), this.f13396a, "CountdownManager");
        }
    }

    private void a(c cVar, int i10) {
        this.f13397b.postDelayed(new o8(this, cVar, i10, 0), cVar.b());
    }
}
