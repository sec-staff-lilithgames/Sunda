package com.ironsource;

import com.ironsource.InterfaceC3456t4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3242h1 implements InterfaceC3386p1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3295k1 f36827a;

    /* renamed from: b, reason: collision with root package name */
    private final F7 f36828b;

    /* renamed from: c, reason: collision with root package name */
    private final Lb<Integer, Integer> f36829c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3456t4 f36830d;

    /* renamed from: e, reason: collision with root package name */
    private List<InterfaceC3331m1> f36831e;

    public C3242h1(InterfaceC3295k1 eventBaseData, F7 eventsManager, Lb<Integer, Integer> eventsMapper, InterfaceC3456t4 currentTimeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventBaseData, "eventBaseData");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventsManager, "eventsManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventsMapper, "eventsMapper");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f36827a = eventBaseData;
        this.f36828b = eventsManager;
        this.f36829c = eventsMapper;
        this.f36830d = currentTimeProvider;
        this.f36831e = new ArrayList();
    }

    public final void a(List<InterfaceC3331m1> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<set-?>");
        this.f36831e = list;
    }

    public final List<InterfaceC3331m1> b() {
        return this.f36831e;
    }

    private final JSONObject b(List<? extends InterfaceC3331m1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC3331m1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC3386p1
    public void a(int i10, List<InterfaceC3331m1> arrayList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(arrayList, "arrayList");
        try {
            Iterator<T> it = this.f36827a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC3331m1) it.next());
            }
            Iterator<InterfaceC3331m1> it2 = this.f36831e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.f36828b.a(new C5(this.f36829c.a(Integer.valueOf(i10)).intValue(), this.f36830d.a(), b(arrayList)));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            System.out.println((Object) a.b.k("LogRemote | Exception: ", e10.getMessage()));
        }
    }

    public /* synthetic */ C3242h1(InterfaceC3295k1 interfaceC3295k1, F7 f72, Lb lb2, InterfaceC3456t4 interfaceC3456t4, int i10, kotlin.jvm.internal.u uVar) {
        this(interfaceC3295k1, f72, lb2, (i10 & 8) != 0 ? new InterfaceC3456t4.a() : interfaceC3456t4);
    }

    @Override // com.ironsource.InterfaceC3386p1
    public void a() {
        this.f36831e.clear();
    }

    @Override // com.ironsource.InterfaceC3386p1
    public void a(InterfaceC3331m1... analyticsEventEntity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC3331m1 interfaceC3331m1 : analyticsEventEntity) {
            this.f36831e.add(interfaceC3331m1);
        }
    }
}
