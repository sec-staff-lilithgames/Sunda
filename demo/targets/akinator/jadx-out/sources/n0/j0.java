package n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.p f75095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f75096f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i10, kv.p pVar) {
        super(2);
        this.f75095e = pVar;
        this.f75096f = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
        } else {
            o0.PlatformMaterialTheme(this.f75095e, wVar, (this.f75096f >> 9) & 14);
        }
    }
}
