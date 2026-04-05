package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.model.vast.l;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.w;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23906a;

    /* renamed from: b, reason: collision with root package name */
    public int f23907b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f23908c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f23909d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23910e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23911f = false;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f23912g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23913h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f23914i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f23915j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f23916k = new ArrayList();

    public c(boolean z10) {
        this.f23906a = true;
        this.f23906a = z10;
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.h hVar, int i10) throws b {
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        ArrayList arrayList = hVar.f24117h;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!h0.e(str)) {
                    throw new b(a.b.k("Found non-secure click tracking url for companion. url: ", str), 0);
                }
            }
            if (i10 > 0) {
                this.f23914i.add(hVar);
            }
        }
        String str2 = hVar.f24116g;
        if (!h0.e(str2)) {
            throw new b(a.b.k("Found non-secure click through url: ", str2), 0);
        }
        if (!hVar.a()) {
            if (this.f23915j.contains(hVar)) {
                return;
            }
            this.f23915j.add(hVar);
            return;
        }
        Integer num = hVar.f24110a;
        Integer num2 = hVar.f24111b;
        if (num == null || num2 == null || num.intValue() < 100 || num2.intValue() < 100) {
            throw new b("Incompatible size: " + num + "," + num2, 16);
        }
        ArrayList arrayList2 = hVar.f24119j;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            w wVar = (w) it2.next();
            if (!h0.e(wVar.f24154b)) {
                throw new b("Found non-secure tracking event: " + wVar, 0);
            }
        }
        String str3 = hVar.f24112c;
        l lVar = hVar.f24113d;
        if (lVar != null) {
            k kVarA = k.a(lVar.f24121a);
            if (kVarA == null) {
                throw new b("Found invalid creative type: " + lVar.f24121a, 32);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Static, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, lVar.f24122b, kVarA);
        }
        String str4 = hVar.f24114e;
        if (!TextUtils.isEmpty(str4)) {
            if (!h0.e(str4)) {
                throw new b(a.b.k("Found non-secure iframe url: ", str4), 0);
            }
            a(bVar, com.fyber.inneractive.sdk.model.vast.i.Iframe, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, str4, null);
        }
        String str5 = hVar.f24115f;
        if (TextUtils.isEmpty(str5)) {
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            a(bVar2, com.fyber.inneractive.sdk.model.vast.i.Html, i10, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, str5, null);
        }
        bVar2.f24076g.size();
    }

    public final com.fyber.inneractive.sdk.model.vast.b a(com.fyber.inneractive.sdk.model.vast.f fVar, List list, String str) throws NumberFormatException {
        int iE = o.e();
        int iD = o.d();
        IAlog.a("%sprocess started", "VastProcessor: ");
        if (fVar != null && fVar.f24101c != null) {
            com.fyber.inneractive.sdk.model.vast.b bVar = new com.fyber.inneractive.sdk.model.vast.b(new g(this.f23909d, iE, iD), new d(iE, iD));
            bVar.f24070a = str;
            ArrayList arrayList = fVar.f24101c.f24104c;
            if (arrayList != null) {
                List list2 = list;
                if (!arrayList.isEmpty()) {
                    if (list == null) {
                        list2 = list;
                        if (fVar.f24100b != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(fVar);
                            list2 = arrayList2;
                        }
                    }
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            a0 a0Var = ((com.fyber.inneractive.sdk.model.vast.f) it.next()).f24100b;
                            if (a0Var != null) {
                                a(bVar, a0Var);
                            }
                        }
                    }
                    a(bVar, fVar.f24101c);
                    if (bVar.f24073d.size() == 0) {
                        if (this.f23912g.isEmpty()) {
                            throw new h("ErrorNoMediaFiles", "No media files exist after merge");
                        }
                        throw new h("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
                    }
                    ArrayList arrayList3 = new ArrayList(bVar.f24076g);
                    Collections.sort(arrayList3, bVar.f24077h);
                    if (!arrayList3.isEmpty()) {
                        Iterator it2 = this.f23915j.iterator();
                        while (it2.hasNext()) {
                            com.fyber.inneractive.sdk.model.vast.h hVar = (com.fyber.inneractive.sdk.model.vast.h) it2.next();
                            if (!hVar.a()) {
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    com.fyber.inneractive.sdk.model.vast.c cVar = (com.fyber.inneractive.sdk.model.vast.c) it3.next();
                                    ArrayList arrayList4 = hVar.f24117h;
                                    if (arrayList4 != null) {
                                        Iterator it4 = arrayList4.iterator();
                                        while (it4.hasNext()) {
                                            cVar.a(x.EVENT_CLICK, (String) it4.next());
                                        }
                                    }
                                    String str2 = hVar.f24116g;
                                    if (TextUtils.isEmpty(cVar.f24092g)) {
                                        cVar.f24092g = str2;
                                    }
                                    ArrayList arrayList5 = hVar.f24119j;
                                    if (arrayList5 != null) {
                                        Iterator it5 = arrayList5.iterator();
                                        while (it5.hasNext()) {
                                            w wVar = (w) it5.next();
                                            x xVarA = x.a(wVar.f24153a);
                                            String str3 = wVar.f24154b;
                                            if (xVarA != null && str3 != null) {
                                                cVar.a(xVarA, str3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i10 = 0;
                    if (IAlog.f26748a == 2) {
                        IAlog.e("%sLogging merged model media files: ", "VastProcessor: ");
                        Iterator it6 = new ArrayList(bVar.f24073d).iterator();
                        int i11 = 0;
                        while (it6.hasNext()) {
                            IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i11), (r) it6.next());
                            i11++;
                        }
                    }
                    if (IAlog.f26748a == 2) {
                        IAlog.e("%sLogging merged model companion ads: ", "VastProcessor: ");
                        ArrayList arrayList6 = new ArrayList(bVar.f24076g);
                        Collections.sort(arrayList6, bVar.f24077h);
                        if (arrayList6.size() > 0) {
                            Iterator it7 = arrayList6.iterator();
                            while (it7.hasNext()) {
                                IAlog.e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i10), ((com.fyber.inneractive.sdk.model.vast.c) it7.next()).a());
                                i10++;
                            }
                        } else {
                            IAlog.e("%sNo companion ads found!", "VastProcessor: ");
                        }
                    }
                    return bVar;
                }
            }
            throw new h("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        IAlog.a("%sno inline found", "VastProcessor: ");
        throw new h("ErrorNoMediaFiles", "Empty inline ad found");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.model.vast.b r17, com.fyber.inneractive.sdk.model.vast.g r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.vast.c.a(com.fyber.inneractive.sdk.model.vast.b, com.fyber.inneractive.sdk.model.vast.g):void");
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.b bVar, com.fyber.inneractive.sdk.model.vast.i iVar, int i10, int i11, int i12, String str, String str2, List list, List list2, String str3, k kVar) {
        com.fyber.inneractive.sdk.model.vast.h hVar;
        Integer num;
        Integer num2;
        com.fyber.inneractive.sdk.model.vast.c cVar = new com.fyber.inneractive.sdk.model.vast.c(iVar, i11, i12, str, i10);
        cVar.f24092g = str2;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                cVar.a(x.a(wVar.f24153a), wVar.f24154b);
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                cVar.a(x.EVENT_CLICK, (String) it2.next());
            }
        }
        if (!this.f23914i.isEmpty()) {
            if (cVar.f24093h > 0) {
                hVar = (com.fyber.inneractive.sdk.model.vast.h) this.f23914i.remove(r8.size() - 1);
            } else {
                hVar = null;
            }
            String str4 = cVar.f24090e;
            Iterator it3 = this.f23914i.iterator();
            while (it3.hasNext()) {
                com.fyber.inneractive.sdk.model.vast.h hVar2 = (com.fyber.inneractive.sdk.model.vast.h) it3.next();
                String str5 = hVar2.f24112c;
                if ((str4 != null && str4.equals(str5)) || ((str5 == null && (num = hVar2.f24110a) != null && cVar.f24088c == num.intValue() && (num2 = hVar2.f24111b) != null && cVar.f24089d == num2.intValue()) || !hVar2.a())) {
                    ArrayList arrayList = hVar2.f24117h;
                    if (arrayList.size() > 0) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            String str6 = (String) it4.next();
                            if (h0.e(str6)) {
                                cVar.a(x.EVENT_CLICK, str6);
                            }
                        }
                    }
                }
            }
            if (hVar != null) {
                this.f23914i.add(hVar);
            }
        }
        cVar.f24091f = str3;
        cVar.f24087b = kVar;
        bVar.f24076g.add(cVar);
        bVar.f24081l.add(cVar);
    }
}
