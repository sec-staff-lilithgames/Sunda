package y7;

import java.util.List;
import u7.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f94115a;

    public e(List<f8.a> list) {
        this.f94115a = list;
    }

    @Override // y7.o
    public u7.f createAnimation() {
        List list = this.f94115a;
        return ((f8.a) list.get(0)).isStatic() ? new q(list) : new u7.p(list);
    }

    @Override // y7.o
    public List<f8.a> getKeyframes() {
        return this.f94115a;
    }

    @Override // y7.o
    public boolean isStatic() {
        List list = this.f94115a;
        return list.size() == 1 && ((f8.a) list.get(0)).isStatic();
    }
}
