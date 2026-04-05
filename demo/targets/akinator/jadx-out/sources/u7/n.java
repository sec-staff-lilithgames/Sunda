package u7;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f87999a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f88000b;

    /* renamed from: c, reason: collision with root package name */
    public final List f88001c;

    public n(List<z7.j> list) {
        this.f88001c = list;
        this.f87999a = new ArrayList(list.size());
        this.f88000b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f87999a.add(list.get(i10).getMaskPath().createAnimation());
            this.f88000b.add(list.get(i10).getOpacity().createAnimation());
        }
    }

    public List<f> getMaskAnimations() {
        return this.f87999a;
    }

    public List<z7.j> getMasks() {
        return this.f88001c;
    }

    public List<f> getOpacityAnimations() {
        return this.f88000b;
    }
}
