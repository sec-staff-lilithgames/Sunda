package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.f0 implements kv.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f73815e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(h1 h1Var) {
        super(5);
        this.f73815e = h1Var;
    }

    @Override // kv.s
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m5564invoke5iVPX68((x1.d0) obj, ((i1.h) obj2).m4195unboximpl(), ((i1.h) obj3).m4195unboximpl(), ((Boolean) obj4).booleanValue(), (b0) obj5);
    }

    /* renamed from: invoke-5iVPX68, reason: not valid java name */
    public final Boolean m5564invoke5iVPX68(x1.d0 layoutCoordinates, long j10, long j11, boolean z10, b0 selectionMode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        kotlin.jvm.internal.e0.checkNotNullParameter(selectionMode, "selectionMode");
        h1 h1Var = this.f73815e;
        return Boolean.valueOf(h1Var.m5524updateSelectionRHHTvR4$foundation_release(h1.m5510access$convertToContainerCoordinatesQ7Q5hAU(h1Var, layoutCoordinates, j10), h1.m5510access$convertToContainerCoordinatesQ7Q5hAU(h1Var, layoutCoordinates, j11), z10, selectionMode));
    }
}
