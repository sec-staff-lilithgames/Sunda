package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f87534a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f87535b;

    /* JADX WARN: Illegal instructions before constructor call */
    public d() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public final boolean getDownChange() {
        return this.f87535b;
    }

    public final boolean getPositionChange() {
        return this.f87534a;
    }

    public final void setDownChange(boolean z10) {
        this.f87535b = z10;
    }

    public final void setPositionChange(boolean z10) {
        this.f87534a = z10;
    }

    public d(boolean z10, boolean z11) {
        this.f87534a = z10;
        this.f87535b = z11;
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    @tu.f
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @tu.f
    public static /* synthetic */ void getPositionChange$annotations() {
    }
}
