package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.AbstractC3876i;
import io.bidmachine.analytics.internal.G;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final J f59902a;

    /* renamed from: b, reason: collision with root package name */
    private final G.a f59903b;

    /* renamed from: c, reason: collision with root package name */
    private Map f59904c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements G.a {

        /* renamed from: a, reason: collision with root package name */
        private final J f59905a;

        public a(J j10) {
            this.f59905a = j10;
        }

        @Override // io.bidmachine.analytics.internal.G.a
        public G a() {
            return new G(this.f59905a, new K(), CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(Executors.newSingleThreadExecutor())));
        }
    }

    public I(J j10, G.a aVar) {
        this.f59902a = j10;
        this.f59903b = aVar;
    }

    public final void a(AbstractC3876i.a aVar) {
        List listC = aVar.c();
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReaderConfig.Rule) it.next()).getPath());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(uu.q0.collectionSizeOrDefault(arrayList, 10)), 16));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(next, this.f59903b.a());
        }
        this.f59904c = p1.toMutableMap(linkedHashMap);
    }

    public final void b() {
        Map map = this.f59904c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                ((G) entry.getValue()).a((String) entry.getKey());
            }
        }
    }

    public /* synthetic */ I(J j10, G.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, (i10 & 2) != 0 ? new a(j10) : aVar);
    }

    public final void a() {
        Map map = this.f59904c;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((G) ((Map.Entry) it.next()).getValue()).a();
            }
        }
    }

    public final String a(ReaderConfig.Rule rule) throws FileNotFoundException {
        String strB = this.f59902a.b(rule.getPath());
        if (strB != null) {
            return strB;
        }
        throw new FileNotFoundException();
    }
}
