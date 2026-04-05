package y7;

import java.util.List;
import u7.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public final b f94116a;

    /* renamed from: b, reason: collision with root package name */
    public final b f94117b;

    public i(b bVar, b bVar2) {
        this.f94116a = bVar;
        this.f94117b = bVar2;
    }

    @Override // y7.o
    public u7.f createAnimation() {
        return new t(this.f94116a.createAnimation(), this.f94117b.createAnimation());
    }

    @Override // y7.o
    public List<f8.a> getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // y7.o
    public boolean isStatic() {
        return this.f94116a.isStatic() && this.f94117b.isStatic();
    }
}
