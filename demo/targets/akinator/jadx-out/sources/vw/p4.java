package vw;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p4 {

    /* renamed from: a, reason: collision with root package name */
    public final b f90047a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f90048b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends ArrayList {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends ArrayList {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f90049b = 0;

        public void insert(i3 i3Var, int i10) {
            a aVar = get(i10);
            if (aVar != null) {
                aVar.add(i3Var);
            }
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public a get(int i10) {
            for (int size = size(); size <= i10; size++) {
                add(new a());
            }
            return (a) super.get(i10);
        }

        public i3 get(int i10, int i11) {
            return (i3) get(i10).get(i11);
        }
    }

    public p4(Constructor constructor) {
        this.f90048b = constructor;
    }

    public final void a(b bVar, a aVar, int i10) {
        b bVar2 = this.f90047a;
        a aVar2 = bVar2.get(i10);
        int size = aVar2.size();
        if (bVar2.size() - 1 > i10) {
            for (int i11 = 0; i11 < size; i11++) {
                a aVar3 = new a(aVar);
                aVar3.add((i3) aVar2.get(i11));
                a(bVar, aVar3, i10 + 1);
            }
            return;
        }
        a aVar4 = bVar2.get(i10);
        int size2 = aVar.size();
        int size3 = aVar4.size();
        for (int i12 = 0; i12 < size3; i12++) {
            for (int i13 = 0; i13 < size2; i13++) {
                bVar.get(i13).add((i3) aVar.get(i13));
            }
            bVar.get(i10).add((i3) aVar4.get(i12));
        }
    }

    public List<o4> build() throws Exception {
        b bVar = new b();
        boolean zIsEmpty = this.f90047a.isEmpty();
        Constructor constructor = this.f90048b;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            o4 o4Var = new o4(constructor);
            if (isValid()) {
                arrayList.add(o4Var);
            }
            return arrayList;
        }
        a(bVar, new a(), 0);
        ArrayList arrayList2 = new ArrayList();
        int size = bVar.size() > 0 ? bVar.get(0).size() : 0;
        int size2 = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            o4 o4Var2 = new o4(constructor);
            for (int i11 = 0; i11 < size2; i11++) {
                i3 i3Var = bVar.get(i11, i10);
                String path = i3Var.getPath();
                if (o4Var2.contains(i3Var.getKey())) {
                    throw new g0("Parameter '%s' is a duplicate in %s", path, constructor);
                }
                o4Var2.add(i3Var);
            }
            arrayList2.add(o4Var2);
        }
        return arrayList2;
    }

    public void insert(i3 i3Var, int i10) {
        this.f90047a.insert(i3Var, i10);
    }

    public boolean isValid() {
        Class<?>[] parameterTypes = this.f90048b.getParameterTypes();
        int i10 = b.f90049b;
        return parameterTypes.length == this.f90047a.size();
    }
}
