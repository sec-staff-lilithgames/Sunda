package q8;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f82571a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f82572b;

    /* renamed from: d, reason: collision with root package name */
    public g f82574d = this;

    /* renamed from: c, reason: collision with root package name */
    public g f82573c = this;

    public g(q qVar) {
        this.f82571a = qVar;
    }

    public void add(Object obj) {
        if (this.f82572b == null) {
            this.f82572b = new ArrayList();
        }
        this.f82572b.add(obj);
    }

    public Object removeLast() {
        int size = size();
        if (size > 0) {
            return this.f82572b.remove(size - 1);
        }
        return null;
    }

    public int size() {
        ArrayList arrayList = this.f82572b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
