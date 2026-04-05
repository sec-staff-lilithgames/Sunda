package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.g1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3224g1 implements InterfaceC3256hf<JSONArray> {

    /* renamed from: a, reason: collision with root package name */
    private final List<C3206f1> f36734a = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.g1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36735a;

        static {
            int[] iArr = new int[EnumC3238gf.values().length];
            try {
                iArr[EnumC3238gf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3238gf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36735a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC3248h7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(EnumC3238gf mode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mode, "mode");
        int i10 = a.f36735a[mode.ordinal()];
        if (i10 == 1) {
            List<C3206f1> listB = b();
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3206f1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i10 != 2) {
            throw new tu.t();
        }
        List<C3206f1> listA = a();
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C3206f1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    public final void a(C3206f1 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        this.f36734a.add(event);
    }

    private final List<C3206f1> a() {
        List<C3206f1> list = this.f36734a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3206f1 c3206f1 = (C3206f1) obj;
            if (c3206f1.e() != EnumC3202ef.LoadSuccess && c3206f1.e() != EnumC3202ef.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3206f1) it.next()).a());
        }
        Set set = uu.y0.toSet(arrayList2);
        List<C3206f1> list2 = this.f36734a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C3206f1 c3206f12 = (C3206f1) obj2;
            if (c3206f12.e() == EnumC3202ef.LoadSuccess && !set.contains(c3206f12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C3206f1> b() {
        List<C3206f1> list = this.f36734a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C3206f1) obj).e() != EnumC3202ef.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
