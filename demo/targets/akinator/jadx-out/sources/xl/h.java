package xl;

import io.bidmachine.protobuf.rendering.Rendering;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class h implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f92034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rendering.Phase.ViewComponent.Layout.Constraint.Anchor f92035c;

    public /* synthetic */ h(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor, int i10) {
        this.f92034b = i10;
        this.f92035c = anchor;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f92034b) {
            case 0:
                return "Unsupported SourceAnchor - " + this.f92035c;
            default:
                return "Unsupported Anchor for SideType - " + this.f92035c.name();
        }
    }
}
