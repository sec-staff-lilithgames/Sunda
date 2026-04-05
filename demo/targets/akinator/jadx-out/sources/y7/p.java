package y7;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f94142a;

    public p(List list) {
        this.f94142a = list;
    }

    @Override // y7.o
    public abstract /* synthetic */ u7.f createAnimation();

    @Override // y7.o
    public List<f8.a> getKeyframes() {
        return this.f94142a;
    }

    @Override // y7.o
    public boolean isStatic() {
        List list = this.f94142a;
        return list.isEmpty() || (list.size() == 1 && ((f8.a) list.get(0)).isStatic());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List list = this.f94142a;
        if (!list.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(list.toArray()));
        }
        return sb2.toString();
    }
}
