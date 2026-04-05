package o9;

import android.view.ViewGroup;
import com.digidust.elokence.akinator.paid.databinding.FragmentClassementBinding;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f78425c;

    public /* synthetic */ p(s sVar, int i10) {
        this.f78424b = i10;
        this.f78425c = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78424b) {
            case 0:
                s sVar = this.f78425c;
                ViewGroup viewGroup = sVar.f78499k;
                kotlin.jvm.internal.e0.checkNotNull(viewGroup);
                viewGroup.removeView(sVar.f78498j);
                sVar.f78498j = null;
                break;
            case 1:
                s sVar2 = this.f78425c;
                ViewGroup viewGroup2 = sVar2.f78499k;
                kotlin.jvm.internal.e0.checkNotNull(viewGroup2);
                viewGroup2.addView(sVar2.f78498j);
                break;
            case 2:
                FragmentClassementBinding fragmentClassementBinding = this.f78425c.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding);
                fragmentClassementBinding.scrollViewTopPlayers.fullScroll(130);
                break;
            default:
                s sVar3 = this.f78425c;
                ta.c mClassementDisplayed$akinatorGL_gplayFreemiumRelease = sVar3.getMClassementDisplayed$akinatorGL_gplayFreemiumRelease();
                kotlin.jvm.internal.e0.checkNotNull(mClassementDisplayed$akinatorGL_gplayFreemiumRelease);
                int tempsRestant = mClassementDisplayed$akinatorGL_gplayFreemiumRelease.getTempsRestant();
                if (tempsRestant <= 0) {
                    s.access$getBinding(sVar3).textFinDans.setText(lb.b1.f72741d.sharedInstance().getTraductionFromToken("CLASSEMENT_TERMINE"));
                    s.access$getBinding(sVar3).textTemps.setText("");
                    sVar3.killThreadRefreshDelays();
                    break;
                } else {
                    j1.o2.A(lb.b1.f72741d, "FIN_DANS", s.access$getBinding(sVar3).textFinDans);
                    if (tempsRestant >= 60) {
                        if (tempsRestant >= 3600) {
                            s.access$getBinding(sVar3).textTemps.setText(kb.f.getHoursPlayedFrom(tempsRestant));
                            break;
                        } else {
                            s.access$getBinding(sVar3).textTemps.setText(kb.f.getMinPlayedFrom(tempsRestant));
                            break;
                        }
                    } else {
                        s.access$getBinding(sVar3).textTemps.setText(kb.f.getSecPlayedFrom(tempsRestant));
                        break;
                    }
                }
        }
    }
}
