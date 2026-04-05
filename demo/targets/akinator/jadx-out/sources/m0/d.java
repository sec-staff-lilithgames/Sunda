package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.p f73677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.v f73678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f73679g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f73680h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73681i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r2.k f73682j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f73683k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, long j10, e1.v vVar, kv.p pVar, r2.k kVar, boolean z10, boolean z11) {
        super(2);
        this.f73677e = pVar;
        this.f73678f = vVar;
        this.f73679g = z10;
        this.f73680h = j10;
        this.f73681i = i10;
        this.f73682j = kVar;
        this.f73683k = z11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
            return;
        }
        int i11 = this.f73681i;
        kv.p pVar = this.f73677e;
        if (pVar != null) {
            wVar.startReplaceableGroup(386444465);
            pVar.invoke(wVar, Integer.valueOf((i11 >> 15) & 14));
            wVar.endReplaceableGroup();
            return;
        }
        wVar.startReplaceableGroup(386443790);
        boolean z10 = this.f73679g;
        Boolean boolValueOf = Boolean.valueOf(z10);
        long j10 = this.f73680h;
        i1.h hVarM4174boximpl = i1.h.m4174boximpl(j10);
        wVar.startReplaceableGroup(511388516);
        boolean zChanged = wVar.changed(boolValueOf) | wVar.changed(hVarM4174boximpl);
        Object objRememberedValue = wVar.rememberedValue();
        if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new c(z10, j10);
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        e1.v vVar = this.f73678f;
        i.DefaultSelectionHandle(e2.v.semantics$default(vVar, false, (kv.l) objRememberedValue, 1, null), this.f73679g, this.f73682j, this.f73683k, wVar, i11 & 8176);
        wVar.endReplaceableGroup();
    }
}
