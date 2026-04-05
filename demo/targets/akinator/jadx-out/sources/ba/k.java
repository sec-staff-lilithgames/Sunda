package ba;

import androidx.lifecycle.c3;
import com.ironsource.Q6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o5.y0;
import u5.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f9001a;

    /* renamed from: b, reason: collision with root package name */
    public final i f9002b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    public final i f9003c = new i(1);

    /* renamed from: d, reason: collision with root package name */
    public final i f9004d = new i(2);

    /* renamed from: e, reason: collision with root package name */
    public final i f9005e = new i(3);

    /* renamed from: f, reason: collision with root package name */
    public final j f9006f = new j(0);

    /* renamed from: g, reason: collision with root package name */
    public final j f9007g = new j(1);

    public k(y0 y0Var) {
        this.f9001a = y0Var;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // ba.b
    public void deleteAwardsInDB(a aVar) {
        u5.c.performBlocking(this.f9001a, false, true, new g(this, aVar, 1));
    }

    @Override // ba.b
    public void deleteTenueInDB(n nVar) {
        u5.c.performBlocking(this.f9001a, false, true, new c(this, nVar, 0));
    }

    @Override // ba.b
    public List<a> getAllAwards() {
        return (List) u5.c.performBlocking(this.f9001a, true, false, new a1.o(4));
    }

    @Override // ba.b
    public List<a> getAllAwardsForSpecificBaseLogique(int i10, String str) {
        return (List) u5.c.performBlocking(this.f9001a, true, false, new f(i10, str, 0));
    }

    @Override // ba.b
    public List<a> getCharactersPlayedForAwardLevel(final int i10, final int i11, final String str) {
        return (List) u5.c.performBlocking(this.f9001a, true, false, new kv.l() { // from class: ba.h
            @Override // kv.l
            public final Object invoke(Object obj) {
                int i12 = i10;
                int i13 = i11;
                x5.d dVarPrepare = ((x5.b) obj).prepare("SELECT * FROM AccountAwards WHERE type = ? AND theme_id = ? AND lang = ?");
                try {
                    dVarPrepare.bindLong(1, i12);
                    dVarPrepare.bindLong(2, i13);
                    String str2 = str;
                    if (str2 == null) {
                        dVarPrepare.bindNull(3);
                    } else {
                        dVarPrepare.bindText(3, str2);
                    }
                    int columnIndexOrThrow = s.getColumnIndexOrThrow(dVarPrepare, "id");
                    int columnIndexOrThrow2 = s.getColumnIndexOrThrow(dVarPrepare, "name");
                    int columnIndexOrThrow3 = s.getColumnIndexOrThrow(dVarPrepare, "type");
                    int columnIndexOrThrow4 = s.getColumnIndexOrThrow(dVarPrepare, "theme_id");
                    int columnIndexOrThrow5 = s.getColumnIndexOrThrow(dVarPrepare, Q6.f35290q);
                    int columnIndexOrThrow6 = s.getColumnIndexOrThrow(dVarPrepare, "description");
                    ArrayList arrayList = new ArrayList();
                    while (dVarPrepare.step()) {
                        a aVar = new a();
                        String text = null;
                        aVar.setId(dVarPrepare.isNull(columnIndexOrThrow) ? null : dVarPrepare.getText(columnIndexOrThrow));
                        aVar.setName(dVarPrepare.isNull(columnIndexOrThrow2) ? null : dVarPrepare.getText(columnIndexOrThrow2));
                        aVar.setType(dVarPrepare.isNull(columnIndexOrThrow3) ? null : dVarPrepare.getText(columnIndexOrThrow3));
                        aVar.setThemeId(dVarPrepare.isNull(columnIndexOrThrow4) ? null : dVarPrepare.getText(columnIndexOrThrow4));
                        aVar.setLang(dVarPrepare.isNull(columnIndexOrThrow5) ? null : dVarPrepare.getText(columnIndexOrThrow5));
                        if (!dVarPrepare.isNull(columnIndexOrThrow6)) {
                            text = dVarPrepare.getText(columnIndexOrThrow6);
                        }
                        aVar.setDescription(text);
                        arrayList.add(aVar);
                    }
                    dVarPrepare.close();
                    return arrayList;
                } catch (Throwable th2) {
                    dVarPrepare.close();
                    throw th2;
                }
            }
        });
    }

    @Override // ba.b
    public String getDefiIdSpecificThemeLang(String str) {
        return (String) u5.c.performBlocking(this.f9001a, true, false, new d(str, 0));
    }

    @Override // ba.b
    public m getNbAward() {
        return (m) u5.c.performBlocking(this.f9001a, true, false, new a1.o(3));
    }

    @Override // ba.b
    public int getNbAwardForSpecificBaseLogiqueAndType(String str, int i10, String str2) {
        return ((Integer) u5.c.performBlocking(this.f9001a, true, false, new e(str, i10, str2, 2))).intValue();
    }

    @Override // ba.b
    public int getNbAwardForSpecificIdAndLevel(String str) {
        return ((Integer) u5.c.performBlocking(this.f9001a, true, false, new d(str, 4))).intValue();
    }

    @Override // ba.b
    public int getNbAwardForSpecificThemeAndLevel(String str, int i10, String str2) {
        return ((Integer) u5.c.performBlocking(this.f9001a, true, false, new e(str, i10, str2, 1))).intValue();
    }

    @Override // ba.b
    public int getTrouve0ForSpecificThemeLang(String str) {
        return ((Integer) u5.c.performBlocking(this.f9001a, true, false, new d(str, 6))).intValue();
    }

    @Override // ba.b
    public int getTrouve1ForSpecificThemeLang(String str) {
        return ((Integer) u5.c.performBlocking(this.f9001a, true, false, new d(str, 7))).intValue();
    }

    @Override // ba.b
    public int getTrouve2ForSpecificThemeLang(String str) {
        return ((Integer) u5.c.performBlocking(this.f9001a, true, false, new d(str, 2))).intValue();
    }

    @Override // ba.b
    public int getTrouve3ForSpecificThemeLang(String str) {
        return ((Integer) u5.c.performBlocking(this.f9001a, true, false, new d(str, 5))).intValue();
    }

    @Override // ba.b
    public int getTrouve4ForSpecificThemeLang(String str) {
        return ((Integer) u5.c.performBlocking(this.f9001a, true, false, new d(str, 1))).intValue();
    }

    @Override // ba.b
    public o getTrouveInfosForSpecificThemeLang(String str) {
        return (o) u5.c.performBlocking(this.f9001a, true, false, new d(str, 3));
    }

    @Override // ba.b
    public void insertAwardsInDB(a aVar) {
        u5.c.performBlocking(this.f9001a, false, true, new g(this, aVar, 0));
    }

    @Override // ba.b
    public void insertInfosDefis(o oVar) {
        u5.c.performBlocking(this.f9001a, false, true, new c3(6, this, oVar));
    }

    @Override // ba.b
    public void insertNbAwardsInDB(m mVar) {
        u5.c.performBlocking(this.f9001a, false, true, new c3(5, this, mVar));
    }

    @Override // ba.b
    public void insertTenueInDB(n nVar) {
        u5.c.performBlocking(this.f9001a, false, true, new c(this, nVar, 1));
    }

    @Override // ba.b
    public a isAwardAlreadyWonForCharacter(String str, int i10, String str2) {
        return (a) u5.c.performBlocking(this.f9001a, true, false, new e(str, i10, str2, 0));
    }
}
