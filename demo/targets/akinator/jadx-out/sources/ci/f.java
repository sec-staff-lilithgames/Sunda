package ci;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.inmobi.media.F5;
import com.inmobi.media.Rf;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12343c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12345f;

    public /* synthetic */ f(Object obj, int i10, Object obj2, Object obj3) {
        this.f12342b = i10;
        this.f12343c = obj;
        this.f12344e = obj2;
        this.f12345f = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f12342b;
        int i11 = -10;
        Object obj = this.f12345f;
        Object obj2 = this.f12344e;
        Object obj3 = this.f12343c;
        switch (i10) {
            case 0:
                return ((g) obj3).f12346b.submit(new af.n(12, (Callable) obj2, (i) obj));
            case 1:
                String str = (String) obj;
                WorkDatabase workDatabase = ((o6.p) obj3).f77956e;
                ((ArrayList) obj2).addAll(workDatabase.workTagDao().getTagsForWorkSpecId(str));
                return workDatabase.workSpecDao().getWorkSpec(str);
            case 2:
                OneCharacterProposalActivity oneCharacterProposalActivity = (OneCharacterProposalActivity) obj3;
                AccountDatabase accountDatabase = (AccountDatabase) obj2;
                String str2 = (String) obj;
                int i12 = OneCharacterProposalActivity.S;
                oneCharacterProposalActivity.getClass();
                ba.o trouveInfosForSpecificThemeLang = accountDatabase.getDao().getTrouveInfosForSpecificThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                int i13 = 0;
                while (true) {
                    if (i13 < aa.f.sharedInstance().getDefiDuJourInfos().getListPerso().size()) {
                        if (aa.f.sharedInstance().getDefiDuJourInfos().getListPerso().get(i13).getBaseId() == Integer.parseInt(str2)) {
                            i11 = i13;
                        } else {
                            i13++;
                        }
                    }
                }
                if (trouveInfosForSpecificThemeLang == null) {
                    ba.o oVar = new ba.o();
                    oVar.setTrouve0(i11 == 0 ? 1 : 0);
                    oVar.setTrouve1(i11 == 1 ? 1 : 0);
                    oVar.setTrouve2(i11 == 2 ? 1 : 0);
                    oVar.setTrouve3(i11 == 3 ? 1 : 0);
                    oVar.setTrouve4(i11 != 4 ? 0 : 1);
                    oVar.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                    oVar.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                    accountDatabase.getDao().insertInfosDefis(oVar);
                } else if (i11 == 0) {
                    if (trouveInfosForSpecificThemeLang.getTrouve0() == 1) {
                        oneCharacterProposalActivity.M = true;
                    } else {
                        trouveInfosForSpecificThemeLang.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                        trouveInfosForSpecificThemeLang.setTrouve0(1);
                        trouveInfosForSpecificThemeLang.setTrouve1(trouveInfosForSpecificThemeLang.getTrouve1());
                        trouveInfosForSpecificThemeLang.setTrouve2(trouveInfosForSpecificThemeLang.getTrouve2());
                        trouveInfosForSpecificThemeLang.setTrouve3(trouveInfosForSpecificThemeLang.getTrouve3());
                        trouveInfosForSpecificThemeLang.setTrouve4(trouveInfosForSpecificThemeLang.getTrouve4());
                        trouveInfosForSpecificThemeLang.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                        accountDatabase.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang);
                    }
                } else if (i11 == 1) {
                    if (trouveInfosForSpecificThemeLang.getTrouve1() == 1) {
                        oneCharacterProposalActivity.M = true;
                    } else {
                        trouveInfosForSpecificThemeLang.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                        trouveInfosForSpecificThemeLang.setTrouve0(trouveInfosForSpecificThemeLang.getTrouve0());
                        trouveInfosForSpecificThemeLang.setTrouve1(1);
                        trouveInfosForSpecificThemeLang.setTrouve2(trouveInfosForSpecificThemeLang.getTrouve2());
                        trouveInfosForSpecificThemeLang.setTrouve3(trouveInfosForSpecificThemeLang.getTrouve3());
                        trouveInfosForSpecificThemeLang.setTrouve4(trouveInfosForSpecificThemeLang.getTrouve4());
                        trouveInfosForSpecificThemeLang.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                        accountDatabase.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang);
                    }
                } else if (i11 == 2) {
                    if (trouveInfosForSpecificThemeLang.getTrouve2() == 1) {
                        oneCharacterProposalActivity.M = true;
                    } else {
                        trouveInfosForSpecificThemeLang.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                        trouveInfosForSpecificThemeLang.setTrouve0(trouveInfosForSpecificThemeLang.getTrouve0());
                        trouveInfosForSpecificThemeLang.setTrouve1(trouveInfosForSpecificThemeLang.getTrouve1());
                        trouveInfosForSpecificThemeLang.setTrouve2(1);
                        trouveInfosForSpecificThemeLang.setTrouve3(trouveInfosForSpecificThemeLang.getTrouve3());
                        trouveInfosForSpecificThemeLang.setTrouve4(trouveInfosForSpecificThemeLang.getTrouve4());
                        trouveInfosForSpecificThemeLang.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                        accountDatabase.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang);
                    }
                } else if (i11 == 3) {
                    if (trouveInfosForSpecificThemeLang.getTrouve3() == 1) {
                        oneCharacterProposalActivity.M = true;
                    } else {
                        trouveInfosForSpecificThemeLang.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                        trouveInfosForSpecificThemeLang.setTrouve0(trouveInfosForSpecificThemeLang.getTrouve0());
                        trouveInfosForSpecificThemeLang.setTrouve1(trouveInfosForSpecificThemeLang.getTrouve1());
                        trouveInfosForSpecificThemeLang.setTrouve2(trouveInfosForSpecificThemeLang.getTrouve2());
                        trouveInfosForSpecificThemeLang.setTrouve3(1);
                        trouveInfosForSpecificThemeLang.setTrouve4(trouveInfosForSpecificThemeLang.getTrouve4());
                        trouveInfosForSpecificThemeLang.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                        accountDatabase.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang);
                    }
                } else if (i11 == 4) {
                    if (trouveInfosForSpecificThemeLang.getTrouve4() == 1) {
                        oneCharacterProposalActivity.M = true;
                    } else {
                        trouveInfosForSpecificThemeLang.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                        trouveInfosForSpecificThemeLang.setTrouve0(trouveInfosForSpecificThemeLang.getTrouve0());
                        trouveInfosForSpecificThemeLang.setTrouve1(trouveInfosForSpecificThemeLang.getTrouve1());
                        trouveInfosForSpecificThemeLang.setTrouve2(trouveInfosForSpecificThemeLang.getTrouve2());
                        trouveInfosForSpecificThemeLang.setTrouve3(trouveInfosForSpecificThemeLang.getTrouve3());
                        trouveInfosForSpecificThemeLang.setTrouve4(1);
                        trouveInfosForSpecificThemeLang.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                        accountDatabase.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang);
                    }
                }
                return 0;
            case 3:
                PostProposeActivity postProposeActivity = (PostProposeActivity) obj3;
                int i14 = PostProposeActivity.Z;
                postProposeActivity.getClass();
                postProposeActivity.W = ((AccountDatabase) obj).getDao().isAwardAlreadyWonForCharacter(ca.m.sharedInstance().getCurrentInstance().getLanguage(), ca.m.sharedInstance().getCurrentInstance().getSubjectId(), ((e.g) obj2).getIdBase() + "-" + ca.m.sharedInstance().getCurrentInstance().getBaseLogiqueId());
                return 0;
            case 4:
                AccountDatabase accountDatabase2 = (AccountDatabase) obj3;
                String str3 = (String) obj2;
                QuestionActivity questionActivity = (QuestionActivity) obj;
                int i15 = QuestionActivity.f21703n0;
                ba.o trouveInfosForSpecificThemeLang2 = accountDatabase2.getDao().getTrouveInfosForSpecificThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                int size = aa.f.sharedInstance().getDefiDuJourInfos().getListPerso().size();
                int i16 = 0;
                while (true) {
                    if (i16 < size) {
                        if (aa.f.sharedInstance().getDefiDuJourInfos().getListPerso().get(i16).getBaseId() == Integer.parseInt(str3)) {
                            i11 = i16;
                        } else {
                            i16++;
                        }
                    }
                }
                if (trouveInfosForSpecificThemeLang2 == null) {
                    ba.o oVar2 = new ba.o();
                    oVar2.setTrouve0(i11 == 0 ? 1 : 0);
                    oVar2.setTrouve1(i11 == 1 ? 1 : 0);
                    oVar2.setTrouve2(i11 == 2 ? 1 : 0);
                    oVar2.setTrouve3(i11 == 3 ? 1 : 0);
                    oVar2.setTrouve4(i11 != 4 ? 0 : 1);
                    oVar2.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                    oVar2.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                    accountDatabase2.getDao().insertInfosDefis(oVar2);
                } else if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    if (trouveInfosForSpecificThemeLang2.getTrouve4() == 1) {
                                        questionActivity.Z = true;
                                    } else {
                                        trouveInfosForSpecificThemeLang2.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                                        trouveInfosForSpecificThemeLang2.setTrouve0(trouveInfosForSpecificThemeLang2.getTrouve0());
                                        trouveInfosForSpecificThemeLang2.setTrouve1(trouveInfosForSpecificThemeLang2.getTrouve1());
                                        trouveInfosForSpecificThemeLang2.setTrouve2(trouveInfosForSpecificThemeLang2.getTrouve2());
                                        trouveInfosForSpecificThemeLang2.setTrouve3(trouveInfosForSpecificThemeLang2.getTrouve3());
                                        trouveInfosForSpecificThemeLang2.setTrouve4(1);
                                        trouveInfosForSpecificThemeLang2.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                                        accountDatabase2.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang2);
                                    }
                                }
                            } else if (trouveInfosForSpecificThemeLang2.getTrouve3() == 1) {
                                questionActivity.Z = true;
                            } else {
                                trouveInfosForSpecificThemeLang2.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                                trouveInfosForSpecificThemeLang2.setTrouve0(trouveInfosForSpecificThemeLang2.getTrouve0());
                                trouveInfosForSpecificThemeLang2.setTrouve1(trouveInfosForSpecificThemeLang2.getTrouve1());
                                trouveInfosForSpecificThemeLang2.setTrouve2(trouveInfosForSpecificThemeLang2.getTrouve2());
                                trouveInfosForSpecificThemeLang2.setTrouve3(1);
                                trouveInfosForSpecificThemeLang2.setTrouve4(trouveInfosForSpecificThemeLang2.getTrouve4());
                                trouveInfosForSpecificThemeLang2.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                                accountDatabase2.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang2);
                            }
                        } else if (trouveInfosForSpecificThemeLang2.getTrouve2() == 1) {
                            questionActivity.Z = true;
                        } else {
                            trouveInfosForSpecificThemeLang2.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                            trouveInfosForSpecificThemeLang2.setTrouve0(trouveInfosForSpecificThemeLang2.getTrouve0());
                            trouveInfosForSpecificThemeLang2.setTrouve1(trouveInfosForSpecificThemeLang2.getTrouve1());
                            trouveInfosForSpecificThemeLang2.setTrouve2(1);
                            trouveInfosForSpecificThemeLang2.setTrouve3(trouveInfosForSpecificThemeLang2.getTrouve3());
                            trouveInfosForSpecificThemeLang2.setTrouve4(trouveInfosForSpecificThemeLang2.getTrouve4());
                            trouveInfosForSpecificThemeLang2.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                            accountDatabase2.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang2);
                        }
                    } else if (trouveInfosForSpecificThemeLang2.getTrouve1() == 1) {
                        questionActivity.Z = true;
                    } else {
                        trouveInfosForSpecificThemeLang2.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                        trouveInfosForSpecificThemeLang2.setTrouve0(trouveInfosForSpecificThemeLang2.getTrouve0());
                        trouveInfosForSpecificThemeLang2.setTrouve1(1);
                        trouveInfosForSpecificThemeLang2.setTrouve2(trouveInfosForSpecificThemeLang2.getTrouve2());
                        trouveInfosForSpecificThemeLang2.setTrouve3(trouveInfosForSpecificThemeLang2.getTrouve3());
                        trouveInfosForSpecificThemeLang2.setTrouve4(trouveInfosForSpecificThemeLang2.getTrouve4());
                        trouveInfosForSpecificThemeLang2.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                        accountDatabase2.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang2);
                    }
                } else if (trouveInfosForSpecificThemeLang2.getTrouve0() == 1) {
                    questionActivity.Z = true;
                } else {
                    trouveInfosForSpecificThemeLang2.setIdThemeLang(ca.m.sharedInstance().getCurrentSubject() + "_" + ca.m.sharedInstance().getCurrentLanguage());
                    trouveInfosForSpecificThemeLang2.setTrouve0(1);
                    trouveInfosForSpecificThemeLang2.setTrouve1(trouveInfosForSpecificThemeLang2.getTrouve1());
                    trouveInfosForSpecificThemeLang2.setTrouve2(trouveInfosForSpecificThemeLang2.getTrouve2());
                    trouveInfosForSpecificThemeLang2.setTrouve3(trouveInfosForSpecificThemeLang2.getTrouve3());
                    trouveInfosForSpecificThemeLang2.setTrouve4(trouveInfosForSpecificThemeLang2.getTrouve4());
                    trouveInfosForSpecificThemeLang2.setIdDefi(String.valueOf(aa.f.sharedInstance().getDefiDuJourInfos().getIdDefi()));
                    accountDatabase2.getDao().insertInfosDefis(trouveInfosForSpecificThemeLang2);
                }
                return 0;
            case 5:
                return r7.o.fromInputStreamSync((Context) obj3, (InputStream) obj2, (String) obj);
            default:
                return Rf.a((Rf) obj3, (String) obj2, (F5) obj);
        }
    }
}
