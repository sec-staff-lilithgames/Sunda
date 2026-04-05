package k6;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f70590a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f70591b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70592c;

    public g(int i10, List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f70591b = arrayList;
        this.f70590a = i10;
        arrayList.addAll(list);
        this.f70592c = i11;
    }

    public List<String> getCustomIncludedCategories() {
        return this.f70591b;
    }

    public int getPredefinedCategories() {
        return this.f70590a;
    }

    public int getTracingMode() {
        return this.f70592c;
    }
}
