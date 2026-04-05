package o9;

import android.content.res.Resources;
import android.os.AsyncTask;
import com.pairip.VMRunner;
import java.util.List;
import java.util.Timer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class f1 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f78134a;

    public f1(g1 g1Var) {
        this.f78134a = g1Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return VMRunner.invoke("j8TnaDMZBJR7GiRI", new Object[]{this, objArr});
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) throws Resources.NotFoundException {
        List<ta.i> list = (List) obj;
        h1 h1Var = this.f78134a.f78156b;
        if (list != null && list.size() == 3) {
            ta.i iVar = null;
            ta.i iVar2 = null;
            ta.i iVar3 = null;
            for (ta.i iVar4 : list) {
                int awardId = iVar4.getAwardId();
                if (awardId == 3) {
                    iVar = iVar4;
                } else if (awardId == 4) {
                    iVar2 = iVar4;
                } else if (awardId == 5) {
                    iVar3 = iVar4;
                }
            }
            m1 m1Var = h1Var.f78185b;
            if (!h1Var.f78185b.E && !ca.m.sharedInstance().isFirstNameDisplayedInHOF() && ca.u.sharedInstance().hasclickSubmit()) {
                ca.u.sharedInstance().setSubmit(false);
                ca.m.sharedInstance().setFirstNameDisplayedInHOF(true);
                int awardType = ca.u.sharedInstance().getStats().getAwardType();
                if (awardType != 3) {
                    if (awardType != 4) {
                        if (awardType == 5 && (iVar3 == null || !iVar3.getPseudo().equals(ca.r.sharedInstance().getNomJoueur()))) {
                            iVar3 = new ta.i(5, ca.u.sharedInstance().getPersoPropose().getName(), ca.u.sharedInstance().getPersoPropose().getDescription(), ca.r.sharedInstance().getNomJoueur(), 0, -1);
                        }
                    } else if (iVar2 == null || !iVar2.getPseudo().equals(ca.r.sharedInstance().getNomJoueur())) {
                        iVar2 = new ta.i(4, ca.u.sharedInstance().getPersoPropose().getName(), ca.u.sharedInstance().getPersoPropose().getDescription(), ca.r.sharedInstance().getNomJoueur(), 0, -1);
                    }
                } else if (iVar == null || !iVar.getPseudo().equals(ca.r.sharedInstance().getNomJoueur())) {
                    iVar = new ta.i(3, ca.u.sharedInstance().getPersoPropose().getName(), ca.u.sharedInstance().getPersoPropose().getDescription(), ca.r.sharedInstance().getNomJoueur(), 0, -1);
                }
            }
            ca.u.sharedInstance().setSubmit(false);
            m1Var.refreshHallOfFame(iVar3, iVar2, iVar);
            m1Var.a();
            m1Var.f78339i = new Timer();
            l1 l1Var = new l1(m1Var);
            m1Var.f78340j = l1Var;
            m1Var.f78339i.scheduleAtFixedRate(l1Var, 0L, 1000L);
            m1Var.E = true;
        }
        h1Var.f78185b.D = true;
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
        this.f78134a.f78156b.f78185b.D = false;
    }
}
