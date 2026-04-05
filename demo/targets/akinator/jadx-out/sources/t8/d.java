package t8;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Map f86571a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f86572b;

    /* renamed from: c, reason: collision with root package name */
    public int f86573c;

    /* renamed from: d, reason: collision with root package name */
    public int f86574d;

    public d(Map<f, Integer> map) {
        this.f86571a = map;
        this.f86572b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.f86573c = num.intValue() + this.f86573c;
        }
    }

    public int getSize() {
        return this.f86573c;
    }

    public boolean isEmpty() {
        return this.f86573c == 0;
    }

    public f remove() {
        int i10 = this.f86574d;
        ArrayList arrayList = this.f86572b;
        f fVar = (f) arrayList.get(i10);
        Map map = this.f86571a;
        Integer num = (Integer) map.get(fVar);
        if (num.intValue() == 1) {
            map.remove(fVar);
            arrayList.remove(this.f86574d);
        } else {
            map.put(fVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f86573c--;
        this.f86574d = arrayList.isEmpty() ? 0 : (this.f86574d + 1) % arrayList.size();
        return fVar;
    }
}
