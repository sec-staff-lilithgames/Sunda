package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d0 extends c0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f13808f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f13809g;

    /* renamed from: h, reason: collision with root package name */
    private final List f13810h;

    /* renamed from: i, reason: collision with root package name */
    private final c f13811i;

    /* renamed from: j, reason: collision with root package name */
    private StringBuffer f13812j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f13813k;

    /* renamed from: l, reason: collision with root package name */
    private final ExecutorService f13814l;

    /* renamed from: m, reason: collision with root package name */
    private final String f13815m;

    /* renamed from: n, reason: collision with root package name */
    private List f13816n;

    /* renamed from: o, reason: collision with root package name */
    private List f13817o;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13818a;

        public a(String str) {
            this.f13818a = str;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f13689a.a(v4.T0)).booleanValue()) {
                    synchronized (d0.this.f13813k) {
                        StringUtils.replaceAll(d0.this.f13812j, this.f13818a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f13812j, this.f13818a, uri.toString());
                }
                d0.this.f13809g.a(uri);
                return;
            }
            com.applovin.impl.sdk.o oVar = d0.this.f13691c;
            if (com.applovin.impl.sdk.o.a()) {
                d0 d0Var = d0.this;
                b0.e2.B(new StringBuilder("Failed to cache JavaScript resource "), this.f13818a, d0Var.f13691c, d0Var.f13690b);
            }
            if (d0.this.f13811i != null) {
                d0.this.f13811i.a(d0.this.f13808f, true);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13820a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13821b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13822c;

        public b(String str, String str2, String str3) {
            this.f13820a = str;
            this.f13821b = str2;
            this.f13822c = str3;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.f13689a.a(v4.T0)).booleanValue()) {
                    synchronized (d0.this.f13813k) {
                        StringUtils.replaceAll(d0.this.f13812j, this.f13820a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.this.f13812j, this.f13820a, uri.toString());
                }
                d0.this.f13809g.a(uri);
                return;
            }
            if (!d0.this.f13809g.a0().contains(this.f13821b + this.f13822c) || d0.this.f13811i == null) {
                return;
            }
            d0.this.f13811i.a(d0.this.f13808f, true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void a(String str, boolean z10);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f13808f = str;
        this.f13809g = bVar;
        this.f13810h = list;
        this.f13814l = executorService;
        this.f13815m = str2;
        this.f13811i = cVar;
        this.f13812j = new StringBuffer(str);
        this.f13813k = new Object();
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f13689a.a(v4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add(Character.valueOf(AbstractJsonLexerKt.STRING));
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f13814l.submit((e0) it.next()));
        }
        this.f13817o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashSet d() {
        /*
            r18 = this;
            r0 = r18
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.applovin.impl.sdk.ad.b r2 = r0.f13809g
            java.util.List r2 = r2.R()
            java.util.Collection r3 = r0.f()
            java.util.List r4 = r0.f13810h
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lbf
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = r6
        L25:
            java.lang.String r8 = r0.f13808f
            int r8 = r8.length()
            if (r6 >= r8) goto L17
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f13693e
            boolean r6 = r6.get()
            r8 = 0
            if (r6 == 0) goto L37
            return r8
        L37:
            java.lang.String r6 = r0.f13808f
            int r6 = r6.indexOf(r5, r7)
            r7 = -1
            if (r6 != r7) goto L41
            goto L17
        L41:
            java.lang.String r7 = r0.f13808f
            int r7 = r7.length()
            r9 = r6
        L48:
            java.lang.String r10 = r0.f13808f
            char r10 = r10.charAt(r9)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            boolean r10 = r3.contains(r10)
            if (r10 != 0) goto L5d
            if (r9 >= r7) goto L5d
            int r9 = r9 + 1
            goto L48
        L5d:
            if (r9 <= r6) goto Laf
            if (r9 == r7) goto Laf
            java.lang.String r7 = r0.f13808f
            int r8 = r5.length()
            int r8 = r8 + r6
            java.lang.String r7 = r7.substring(r8, r9)
            java.lang.String r11 = j1.o2.l(r5, r7)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto L9d
            boolean r8 = r2.contains(r11)
            if (r8 != 0) goto L9d
            com.applovin.impl.e0 r10 = new com.applovin.impl.e0
            com.applovin.impl.sdk.ad.b r12 = r0.f13809g
            java.lang.String[] r8 = new java.lang.String[]{r5}
            java.util.List r13 = java.util.Arrays.asList(r8)
            java.lang.String r15 = r0.f13815m
            com.applovin.impl.sdk.k r8 = r0.f13689a
            com.applovin.impl.d0$b r14 = new com.applovin.impl.d0$b
            r14.<init>(r11, r5, r7)
            r17 = r14
            r14 = 1
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.add(r10)
            goto Lac
        L9d:
            boolean r8 = com.applovin.impl.sdk.o.a()
            if (r8 == 0) goto Lac
            com.applovin.impl.sdk.o r8 = r0.f13691c
            java.lang.String r10 = r0.f13690b
            java.lang.String r11 = "Skip caching of optional or non-resource "
            b0.e2.y(r11, r7, r8, r10)
        Lac:
            r7 = r9
            goto L25
        Laf:
            boolean r1 = com.applovin.impl.sdk.o.a()
            if (r1 == 0) goto Lbe
            com.applovin.impl.sdk.o r1 = r0.f13691c
            java.lang.String r2 = r0.f13690b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.b(r2, r3)
        Lbe:
            return r8
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d0.d():java.util.HashSet");
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f13808f, (String) this.f13689a.a(v4.X4)), 1)) {
            if (this.f13693e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.f13809g, Collections.EMPTY_LIST, false, this.f13815m, this.f13689a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                b0.e2.y("Skip caching of non-resource ", str, this.f13691c, this.f13690b);
            }
        }
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetE;
        if (this.f13693e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f13808f)) {
            a(this.f13808f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f13689a.a(v4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13691c.a(this.f13690b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f13808f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetD = d();
        if (hashSetD != null) {
            hashSet.addAll(hashSetD);
        }
        if (((Boolean) this.f13689a.a(v4.W4)).booleanValue() && (hashSetE = e()) != null) {
            hashSet.addAll(hashSetE);
        }
        this.f13816n = new ArrayList(hashSet);
        if (this.f13693e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f13816n;
        if (list == null || list.isEmpty()) {
            a(this.f13808f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f13691c.a(this.f13690b, "Executing " + this.f13816n.size() + " caching operations...");
        }
        if (this.f13689a.r0().f()) {
            a(this.f13816n);
        } else {
            this.f13814l.invokeAll(this.f13816n);
        }
        if (((Boolean) this.f13689a.a(v4.T0)).booleanValue()) {
            synchronized (this.f13813k) {
                a(this.f13812j.toString());
            }
        } else {
            a(this.f13812j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.f13816n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.f13817o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        c cVar;
        if (this.f13693e.get() || (cVar = this.f13811i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}
