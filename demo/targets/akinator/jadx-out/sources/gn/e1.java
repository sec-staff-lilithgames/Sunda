package gn;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f57872b = new d1().build();

    /* renamed from: c, reason: collision with root package name */
    public static final String f57873c = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: a, reason: collision with root package name */
    public final v f57874a;

    public e1(v vVar) {
        this.f57874a = vVar;
    }

    public static e1 fromBundle(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f57873c);
        if (integerArrayList == null) {
            return f57872b;
        }
        d1 d1Var = new d1();
        for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
            d1Var.add(integerArrayList.get(i10).intValue());
        }
        return d1Var.build();
    }

    public d1 buildUpon() {
        return new d1(this);
    }

    public boolean contains(int i10) {
        return this.f57874a.contains(i10);
    }

    public boolean containsAny(int... iArr) {
        return this.f57874a.containsAny(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            return this.f57874a.equals(((e1) obj).f57874a);
        }
        return false;
    }

    public int get(int i10) {
        return this.f57874a.get(i10);
    }

    public int hashCode() {
        return this.f57874a.hashCode();
    }

    public int size() {
        return this.f57874a.size();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            v vVar = this.f57874a;
            if (i10 >= vVar.size()) {
                bundle.putIntegerArrayList(f57873c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(vVar.get(i10)));
            i10++;
        }
    }
}
