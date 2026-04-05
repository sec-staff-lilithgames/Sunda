package ba;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends o5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9000a;

    @Override // o5.n
    public final String a() {
        switch (this.f9000a) {
            case 0:
                return "DELETE FROM `AccountAwards` WHERE `id` = ?";
            default:
                return "DELETE FROM `AccountTenue` WHERE `idTenue` = ?";
        }
    }

    @Override // o5.n
    public final void bind(x5.d dVar, Object obj) {
        switch (this.f9000a) {
            case 0:
                a aVar = (a) obj;
                if (aVar.getId() != null) {
                    dVar.bindText(1, aVar.getId());
                    break;
                } else {
                    dVar.bindNull(1);
                    break;
                }
            default:
                dVar.bindLong(1, ((n) obj).getIdTenue());
                break;
        }
    }
}
