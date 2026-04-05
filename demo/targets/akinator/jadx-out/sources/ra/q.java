package ra;

import ca.r;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.google.gson.Gson;
import com.ironsource.Hc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j1.o2;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import jb.c;
import kotlin.jvm.internal.e0;
import lb.e;
import o5.s0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q extends b {

    /* renamed from: k, reason: collision with root package name */
    public final String f84073k;

    public q(int i10, String langue, String token, String themeId) {
        int i11;
        AccountDatabase accountDatabase;
        e0.checkNotNullParameter(langue, "langue");
        e0.checkNotNullParameter(token, "token");
        e0.checkNotNullParameter(themeId, "themeId");
        addParameterForPost("token", token);
        addParameterForPost("lng", langue);
        addParameterForPost("theme_id", themeId);
        c.a aVar = jb.c.f69226m;
        addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        addParameterForPost("token_push", ca.m.sharedInstance().getFcmToken());
        if (!e0.areEqual(r.sharedInstance().getIdJoueur(), "none")) {
            addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        }
        if (i10 == 3) {
            TreeMap treeMap = new TreeMap();
            treeMap.put("nb_games_played", Integer.valueOf(jb.h.f69257d.sharedInstance().getMetricCompteur("total_games_account")));
            ba.m mVar = new ba.m();
            int i12 = 1;
            if (aa.f.sharedInstance().getDefiInfos(true) != null) {
                List<aa.e> listPerso = aa.f.sharedInstance().getDefiInfos(true).getListPerso();
                int size = listPerso.size();
                int[] iArr = new int[size];
                AccountDatabase accountDatabase2 = (AccountDatabase) s0.databaseBuilder(AkApplication.f21719f.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build();
                int nbAwardForSpecificThemeAndLevel = accountDatabase2.getDao().getNbAwardForSpecificThemeAndLevel(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getCurrentSubject(), "6");
                int nbAwardForSpecificThemeAndLevel2 = accountDatabase2.getDao().getNbAwardForSpecificThemeAndLevel(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getCurrentSubject(), Hc.f34588e);
                ba.o trouveInfosForSpecificThemeLang = accountDatabase2.getDao().getTrouveInfosForSpecificThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                int i13 = 0;
                iArr[0] = trouveInfosForSpecificThemeLang.getTrouve0() == 1 ? 1 : 0;
                iArr[1] = trouveInfosForSpecificThemeLang.getTrouve1() == 1 ? 1 : 0;
                iArr[2] = trouveInfosForSpecificThemeLang.getTrouve2() == 1 ? 1 : 0;
                iArr[3] = trouveInfosForSpecificThemeLang.getTrouve3() == 1 ? 1 : 0;
                iArr[4] = trouveInfosForSpecificThemeLang.getTrouve4() == 1 ? 1 : 0;
                TreeMap treeMap2 = new TreeMap();
                boolean z10 = false;
                while (i13 < size) {
                    ba.o oVar = trouveInfosForSpecificThemeLang;
                    if (iArr[i13] == i12) {
                        String[] strArr = new String[size];
                        String name = listPerso.get(i13).getName();
                        e0.checkNotNullExpressionValue(name, "getName(...)");
                        strArr[i13] = name;
                        TreeMap treeMap3 = new TreeMap();
                        i11 = size;
                        treeMap3.put("nom", strArr[i13]);
                        treeMap3.put("type_award", 6);
                        int baseId = listPerso.get(i13).getBaseId();
                        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
                        e0.checkNotNull(currentInstance);
                        accountDatabase = accountDatabase2;
                        treeMap2.put(baseId + "-" + currentInstance.getBaseLogiqueId(), treeMap3);
                        int baseId2 = listPerso.get(i13).getBaseId();
                        lb.c currentInstance2 = ca.m.sharedInstance().getCurrentInstance();
                        e0.checkNotNull(currentInstance2);
                        String str = baseId2 + "-" + currentInstance2.getBaseLogiqueId();
                        ba.a aVar2 = new ba.a();
                        aVar2.setType("6");
                        aVar2.setName(listPerso.get(i13).getName());
                        aVar2.setLang(ca.m.sharedInstance().getCurrentLanguage());
                        aVar2.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
                        aVar2.setId(str);
                        if (oVar.getTrouve0() == 1 && oVar.getTrouve1() == 1 && oVar.getTrouve2() == 1 && oVar.getTrouve3() == 1 && oVar.getTrouve4() == 1) {
                            z10 = true;
                        }
                        b(aVar2);
                    } else {
                        i11 = size;
                        accountDatabase = accountDatabase2;
                        z10 = false;
                    }
                    i13++;
                    trouveInfosForSpecificThemeLang = oVar;
                    size = i11;
                    accountDatabase2 = accountDatabase;
                    i12 = 1;
                }
                AccountDatabase accountDatabase3 = accountDatabase2;
                if (z10) {
                    int i14 = nbAwardForSpecificThemeAndLevel2 + 1;
                    treeMap.put("nb_awards_full_ddj", Integer.valueOf(i14));
                    mVar.setNb(String.valueOf(i14));
                    mVar.setTypeAward(Hc.f34588e);
                    mVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
                    mVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
                    mVar.setIdThemeLangLevel(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage() + "_7");
                    accountDatabase3.getDao().insertNbAwardsInDB(mVar);
                }
                treeMap.put("list_persos_played_jackpot", treeMap2);
                TreeMap treeMap4 = new TreeMap();
                if (aa.f.sharedInstance().getDefiInfos(true) != null) {
                    treeMap4.put("id", Integer.valueOf(aa.f.sharedInstance().getDefiInfos(true).getIdDefi()));
                    treeMap4.put("persos_ddj_find", iArr);
                    int i15 = nbAwardForSpecificThemeAndLevel + 1;
                    mVar.setNb(String.valueOf(i15));
                    treeMap.put("nb_awards_ddj", Integer.valueOf(i15));
                    mVar.setTypeAward("6");
                    mVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
                    mVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
                    mVar.setIdThemeLangLevel(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage() + "_6");
                    accountDatabase3.getDao().insertNbAwardsInDB(mVar);
                    treeMap.put("ddj", treeMap4);
                    accountDatabase3.close();
                }
            }
            String json = new Gson().toJson(treeMap);
            e0.checkNotNullExpressionValue(json, "toJson(...)");
            this.f84073k = json;
        }
        addParameterForPost("infos", this.f84073k);
        this.f84065i = "update_infos";
    }

    public static void b(ba.a aVar) {
        AccountDatabase accountDatabase = (AccountDatabase) s0.databaseBuilder(AkApplication.f21719f.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build();
        ba.a aVar2 = new ba.a();
        aVar2.setThemeId(aVar.getThemeId());
        aVar2.setLang(aVar.getLang());
        aVar2.setType(aVar.getType());
        aVar2.setId(aVar.getId());
        aVar2.setName(aVar.getName());
        aVar2.setDescription(aVar.getDescription());
        accountDatabase.getDao().insertAwardsInDB(aVar2);
        accountDatabase.close();
    }

    @Override // ra.b
    public final void a(JSONObject obj) {
        e0.checkNotNullParameter(obj, "obj");
        e0.areEqual(obj.getString("completion"), "KO");
    }

    public q(boolean z10, boolean z11, String langue, String token, int i10, String themeId) {
        e0.checkNotNullParameter(langue, "langue");
        e0.checkNotNullParameter(token, "token");
        e0.checkNotNullParameter(themeId, "themeId");
        addParameterForPost("token", token);
        addParameterForPost("lng", langue);
        addParameterForPost("theme_id", themeId);
        c.a aVar = jb.c.f69226m;
        addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        addParameterForPost("token_push", ca.m.sharedInstance().getFcmToken());
        if (!e0.areEqual(r.sharedInstance().getIdJoueur(), "none")) {
            addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        }
        if (!z11) {
            TreeMap treeMap = new TreeMap();
            ArrayList arrayList = new ArrayList();
            int[] iArr = {100, 110, 105, 104, 101, 103, 107, 102, 106, 109, 108};
            int[] iArr2 = {1, 2, 12, 8, 7, 10, 5, 3, 4, 9, 6, 13, 11};
            for (int i11 = 0; i11 < 13; i11++) {
                if (r.sharedInstance().isItemBought("cloth", r.getClothName(i11))) {
                    arrayList.add(Integer.valueOf(iArr2[i11]));
                }
            }
            for (int i12 = 0; i12 < 11; i12++) {
                if (r.sharedInstance().isItemBought("hat", r.getHatName(i12))) {
                    arrayList.add(Integer.valueOf(iArr[i12]));
                }
            }
            treeMap.put("accessories", arrayList);
            String json = new Gson().toJson(treeMap);
            e0.checkNotNullExpressionValue(json, "toJson(...)");
            this.f84073k = json;
        } else if (z11 && !z10) {
            TreeMap treeMap2 = new TreeMap();
            treeMap2.put("current_bottom_accessory", Integer.valueOf(new int[]{1, 2, 12, 8, 7, 10, 5, 3, 4, 9, 6, 13, 11}[i10]));
            String json2 = new Gson().toJson(treeMap2);
            e0.checkNotNullExpressionValue(json2, "toJson(...)");
            this.f84073k = json2;
        } else if (z11 && z10) {
            TreeMap treeMap3 = new TreeMap();
            treeMap3.put("current_top_accessory", Integer.valueOf(new int[]{100, 110, 105, 104, 101, 103, 107, 102, 106, 109, 108}[i10]));
            String json3 = new Gson().toJson(treeMap3);
            e0.checkNotNullExpressionValue(json3, "toJson(...)");
            this.f84073k = json3;
        }
        addParameterForPost("infos", this.f84073k);
        this.f84065i = "update_infos";
    }

    public q(e.g charac, int i10, String themeId, String langue, String token) {
        e0.checkNotNullParameter(charac, "charac");
        e0.checkNotNullParameter(themeId, "themeId");
        e0.checkNotNullParameter(langue, "langue");
        e0.checkNotNullParameter(token, "token");
        addParameterForPost("token", token);
        addParameterForPost("lng", langue);
        addParameterForPost("theme_id", themeId);
        c.a aVar = jb.c.f69226m;
        addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        addParameterForPost("token_push", ca.m.sharedInstance().getFcmToken());
        if (!e0.areEqual(r.sharedInstance().getIdJoueur(), "none")) {
            addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        TreeMap treeMap3 = new TreeMap();
        treeMap3.put("nom", charac.getName());
        treeMap3.put("type_award", Integer.valueOf(i10));
        String idBase = charac.getIdBase();
        lb.c currentInstance = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance);
        treeMap2.put(idBase + "-" + currentInstance.getBaseLogiqueId(), treeMap3);
        treeMap.put("list_persos_played_jackpot", treeMap2);
        treeMap.put("nb_games_played", Integer.valueOf(jb.h.f69257d.sharedInstance().getMetricCompteur("total_games_account")));
        String idBase2 = charac.getIdBase();
        lb.c currentInstance2 = ca.m.sharedInstance().getCurrentInstance();
        e0.checkNotNull(currentInstance2);
        String strG = o2.g(currentInstance2.getBaseLogiqueId(), idBase2, "-");
        ba.a aVar2 = new ba.a();
        aVar2.setType(String.valueOf(i10));
        aVar2.setName(charac.getName());
        aVar2.setLang(ca.m.sharedInstance().getCurrentLanguage());
        aVar2.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
        aVar2.setId(strG);
        b(aVar2);
        AccountDatabase accountDatabase = (AccountDatabase) s0.databaseBuilder(AkApplication.f21719f.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build();
        int nbAwardForSpecificThemeAndLevel = accountDatabase.getDao().getNbAwardForSpecificThemeAndLevel(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getCurrentSubject(), String.valueOf(i10)) + 1;
        ba.m mVar = new ba.m();
        mVar.setNb(String.valueOf(nbAwardForSpecificThemeAndLevel));
        if (i10 == 0) {
            treeMap.put("nb_awards_standard", Integer.valueOf(nbAwardForSpecificThemeAndLevel));
            mVar.setTypeAward("0");
            mVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
            mVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
            mVar.setIdThemeLangLevel(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage() + "_0");
            accountDatabase.getDao().insertNbAwardsInDB(mVar);
        } else if (i10 == 1) {
            treeMap.put("nb_awards_bronze", Integer.valueOf(nbAwardForSpecificThemeAndLevel));
            mVar.setTypeAward("1");
            mVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
            mVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
            mVar.setIdThemeLangLevel(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage() + "_1");
            accountDatabase.getDao().insertNbAwardsInDB(mVar);
        } else if (i10 == 2) {
            treeMap.put("nb_awards_silver", Integer.valueOf(nbAwardForSpecificThemeAndLevel));
            mVar.setTypeAward("2");
            mVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
            mVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
            mVar.setIdThemeLangLevel(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage() + "_2");
            accountDatabase.getDao().insertNbAwardsInDB(mVar);
        } else if (i10 == 3) {
            treeMap.put("nb_awards_gold", Integer.valueOf(nbAwardForSpecificThemeAndLevel));
            mVar.setTypeAward("3");
            mVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
            mVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
            mVar.setIdThemeLangLevel(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage() + "_3");
            accountDatabase.getDao().insertNbAwardsInDB(mVar);
        } else if (i10 == 4) {
            treeMap.put("nb_awards_platinum", Integer.valueOf(nbAwardForSpecificThemeAndLevel));
            mVar.setTypeAward("4");
            mVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
            mVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
            mVar.setIdThemeLangLevel(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage() + "_4");
            accountDatabase.getDao().insertNbAwardsInDB(mVar);
        } else if (i10 == 5) {
            treeMap.put("nb_awards_black", Integer.valueOf(nbAwardForSpecificThemeAndLevel));
            mVar.setTypeAward(CampaignEx.CLICKMODE_ON);
            mVar.setLang(ca.m.sharedInstance().getCurrentLanguage());
            mVar.setThemeId(String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
            mVar.setIdThemeLangLevel(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage() + "_5");
            accountDatabase.getDao().insertNbAwardsInDB(mVar);
        }
        accountDatabase.close();
        String json = new Gson().toJson(treeMap);
        e0.checkNotNullExpressionValue(json, "toJson(...)");
        this.f84073k = json;
        addParameterForPost("infos", json);
        this.f84065i = "update_infos";
    }

    public q(String themeId, String langue, String token, int i10, boolean z10) {
        int genizBalanceAccount;
        e0.checkNotNullParameter(themeId, "themeId");
        e0.checkNotNullParameter(langue, "langue");
        e0.checkNotNullParameter(token, "token");
        addParameterForPost("token", token);
        addParameterForPost("lng", langue);
        addParameterForPost("theme_id", themeId);
        c.a aVar = jb.c.f69226m;
        addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        addParameterForPost("token_push", ca.m.sharedInstance().getFcmToken());
        if (!e0.areEqual(r.sharedInstance().getIdJoueur(), "none")) {
            addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        }
        if (z10) {
            genizBalanceAccount = r.sharedInstance().getGenizBalanceAccount() + i10;
        } else {
            genizBalanceAccount = r.sharedInstance().getGenizBalanceAccount() - i10;
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("geniz", Integer.valueOf(genizBalanceAccount));
        String json = new Gson().toJson(treeMap);
        r.sharedInstance().setGenizBalanceAccount(genizBalanceAccount);
        e0.checkNotNull(json);
        this.f84073k = json;
        addParameterForPost("infos", json);
        this.f84065i = "update_infos";
    }

    public q(String id2, String langue, String token, String themeId) {
        e0.checkNotNullParameter(id2, "id");
        e0.checkNotNullParameter(langue, "langue");
        e0.checkNotNullParameter(token, "token");
        e0.checkNotNullParameter(themeId, "themeId");
        addParameterForPost("token", token);
        addParameterForPost("lng", langue);
        addParameterForPost("theme_id", themeId);
        c.a aVar = jb.c.f69226m;
        addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        addParameterForPost("token_push", ca.m.sharedInstance().getFcmToken());
        if (!e0.areEqual(r.sharedInstance().getIdJoueur(), "none")) {
            addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        }
        TreeMap treeMap = new TreeMap();
        if (aa.f.sharedInstance().getDefiInfos(true) != null) {
            int size = aa.f.sharedInstance().getDefiInfos(true).getListPerso().size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = 0;
            }
            TreeMap treeMap2 = new TreeMap();
            treeMap2.put("id", Integer.valueOf(Integer.parseInt(id2)));
            treeMap2.put("persos_ddj_find", iArr);
            treeMap.put("ddj", treeMap2);
            AccountDatabase accountDatabase = (AccountDatabase) s0.databaseBuilder(AkApplication.f21719f.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build();
            ba.o oVar = new ba.o();
            oVar.setTrouve0(0);
            oVar.setTrouve1(0);
            oVar.setTrouve2(0);
            oVar.setTrouve3(0);
            oVar.setTrouve4(0);
            oVar.setIdDefi(id2);
            oVar.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
            accountDatabase.getDao().insertInfosDefis(oVar);
        }
        String json = new Gson().toJson(treeMap);
        e0.checkNotNullExpressionValue(json, "toJson(...)");
        this.f84073k = json;
        addParameterForPost("infos", json);
        this.f84065i = "update_infos";
    }

    public q(String langue, String token, String themeId) {
        e0.checkNotNullParameter(langue, "langue");
        e0.checkNotNullParameter(token, "token");
        e0.checkNotNullParameter(themeId, "themeId");
        addParameterForPost("token", token);
        addParameterForPost("lng", langue);
        addParameterForPost("theme_id", themeId);
        c.a aVar = jb.c.f69226m;
        addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        addParameterForPost("token_push", ca.m.sharedInstance().getFcmToken());
        if (!e0.areEqual(r.sharedInstance().getIdJoueur(), "none")) {
            addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("free_unlock_used", 1);
        String json = new Gson().toJson(treeMap);
        e0.checkNotNullExpressionValue(json, "toJson(...)");
        this.f84073k = json;
        addParameterForPost("infos", json);
        this.f84065i = "update_infos";
    }

    public q(String token) {
        e0.checkNotNullParameter(token, "token");
        addParameterForPost("token", token);
        addParameterForPost("lng", ca.m.sharedInstance().getCurrentLanguage());
        addParameterForPost("theme_id", String.valueOf(ca.m.sharedInstance().getCurrentSubject()));
        c.a aVar = jb.c.f69226m;
        addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        addParameterForPost("token_push", ca.m.sharedInstance().getFcmToken());
        if (!e0.areEqual(r.sharedInstance().getIdJoueur(), "none")) {
            addParameterForPost("uid", aVar.sharedInstance().getDeviceId());
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("joueur_id", r.sharedInstance().getIdJoueurAccount());
        String json = new Gson().toJson(treeMap);
        e0.checkNotNullExpressionValue(json, "toJson(...)");
        this.f84073k = json;
        addParameterForPost("infos", json);
        this.f84065i = "update_infos";
    }
}
