package ba;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i extends o5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8999a;

    @Override // o5.o
    public final String a() {
        switch (this.f8999a) {
            case 0:
                return "INSERT OR REPLACE INTO `AccountAwards` (`id`,`name`,`type`,`theme_id`,`lang`,`description`) VALUES (?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `AccountTenue` (`idTenue`) VALUES (?)";
            case 2:
                return "INSERT OR REPLACE INTO `AccountNbAwards` (`idThemeLangLevel`,`nb`,`theme_id`,`lang`,`type_award`) VALUES (?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `DefisInfos` (`idThemeLang`,`idDefi`,`trouve0`,`trouve1`,`trouve2`,`trouve3`,`trouve4`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    @Override // o5.o
    public final void bind(x5.d dVar, Object obj) {
        switch (this.f8999a) {
            case 0:
                a aVar = (a) obj;
                if (aVar.getId() == null) {
                    dVar.bindNull(1);
                } else {
                    dVar.bindText(1, aVar.getId());
                }
                if (aVar.getName() == null) {
                    dVar.bindNull(2);
                } else {
                    dVar.bindText(2, aVar.getName());
                }
                if (aVar.getType() == null) {
                    dVar.bindNull(3);
                } else {
                    dVar.bindText(3, aVar.getType());
                }
                if (aVar.getThemeId() == null) {
                    dVar.bindNull(4);
                } else {
                    dVar.bindText(4, aVar.getThemeId());
                }
                if (aVar.getLang() == null) {
                    dVar.bindNull(5);
                } else {
                    dVar.bindText(5, aVar.getLang());
                }
                if (aVar.getDescription() != null) {
                    dVar.bindText(6, aVar.getDescription());
                    break;
                } else {
                    dVar.bindNull(6);
                    break;
                }
            case 1:
                dVar.bindLong(1, ((n) obj).getIdTenue());
                break;
            case 2:
                m mVar = (m) obj;
                if (mVar.getIdThemeLangLevel() == null) {
                    dVar.bindNull(1);
                } else {
                    dVar.bindText(1, mVar.getIdThemeLangLevel());
                }
                if (mVar.getNb() == null) {
                    dVar.bindNull(2);
                } else {
                    dVar.bindText(2, mVar.getNb());
                }
                if (mVar.getThemeId() == null) {
                    dVar.bindNull(3);
                } else {
                    dVar.bindText(3, mVar.getThemeId());
                }
                if (mVar.getLang() == null) {
                    dVar.bindNull(4);
                } else {
                    dVar.bindText(4, mVar.getLang());
                }
                if (mVar.getTypeAward() != null) {
                    dVar.bindText(5, mVar.getTypeAward());
                    break;
                } else {
                    dVar.bindNull(5);
                    break;
                }
            default:
                o oVar = (o) obj;
                if (oVar.getIdThemeLang() == null) {
                    dVar.bindNull(1);
                } else {
                    dVar.bindText(1, oVar.getIdThemeLang());
                }
                if (oVar.getIdDefi() == null) {
                    dVar.bindNull(2);
                } else {
                    dVar.bindText(2, oVar.getIdDefi());
                }
                dVar.bindLong(3, oVar.getTrouve0());
                dVar.bindLong(4, oVar.getTrouve1());
                dVar.bindLong(5, oVar.getTrouve2());
                dVar.bindLong(6, oVar.getTrouve3());
                dVar.bindLong(7, oVar.getTrouve4());
                break;
        }
    }
}
