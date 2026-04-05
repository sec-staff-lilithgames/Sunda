package tm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class j implements ir.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f87070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f87071c;

    public /* synthetic */ j(k kVar, int i10) {
        this.f87070b = i10;
        this.f87071c = kVar;
    }

    @Override // ir.d
    public final void execute(Object obj) {
        String str = (String) obj;
        switch (this.f87070b) {
            case 0:
                g gVar = this.f87071c.f87073a;
                gVar.f87056u.onStorePictureIntention(gVar, str);
                break;
            default:
                g gVar2 = this.f87071c.f87073a;
                gVar2.f87056u.onCalendarEventIntention(gVar2, str);
                break;
        }
    }
}
