package t9;

import android.widget.Toast;
import androidx.fragment.app.h2;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kv.l;
import lb.e;
import t9.a;
import t9.f;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f86593c;

    public /* synthetic */ c(f fVar, int i10) {
        this.f86592b = i10;
        this.f86593c = fVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f86592b;
        x0 x0Var = x0.f87415a;
        f fVar = this.f86593c;
        switch (i10) {
            case 0:
                Throwable error = (Throwable) obj;
                f.a aVar = f.f86599m;
                e0.checkNotNullParameter(error, "error");
                Toast.makeText(fVar.getActivity(), error.getMessage(), 0).show();
                break;
            case 1:
                if (fVar.f86605i.size() <= 0) {
                    fVar.a();
                    break;
                } else {
                    FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = fVar.f86601e;
                    e0.checkNotNull(fragmentAddMagicManagerBinding);
                    fragmentAddMagicManagerBinding.precedant.setVisibility(0);
                    FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = fVar.f86601e;
                    e0.checkNotNull(fragmentAddMagicManagerBinding2);
                    fragmentAddMagicManagerBinding2.suivant.setVisibility(4);
                    i iVarNewInstance = i.f86614i.newInstance(fVar.f86605i, fVar.f86606j);
                    h2 h2VarBeginTransaction = fVar.getParentFragmentManager().beginTransaction();
                    e0.checkNotNullExpressionValue(h2VarBeginTransaction, "beginTransaction(...)");
                    h2VarBeginTransaction.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
                    h2VarBeginTransaction.replace(R.id.containerFragmentAddMagic, iVarNewInstance);
                    h2VarBeginTransaction.commit();
                    break;
                }
            case 2:
                f.a aVar2 = f.f86599m;
                fVar.a();
                break;
            case 3:
                ArrayList<e.b> arrayList = (ArrayList) obj;
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding3 = fVar.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding3);
                fragmentAddMagicManagerBinding3.precedant.setVisibility(0);
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding4 = fVar.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding4);
                fragmentAddMagicManagerBinding4.suivant.setVisibility(0);
                a.C0785a c0785a = a.f86583j;
                e0.checkNotNull(arrayList);
                int i11 = fVar.f86606j;
                a aVarNewInstance = c0785a.newInstance(arrayList, i11 == -1 ? null : (e.h) fVar.f86605i.get(i11));
                h2 h2VarBeginTransaction2 = fVar.getParentFragmentManager().beginTransaction();
                e0.checkNotNullExpressionValue(h2VarBeginTransaction2, "beginTransaction(...)");
                h2VarBeginTransaction2.setCustomAnimations(R.animator.enter_from_right, R.animator.exit_to_left);
                h2VarBeginTransaction2.replace(R.id.containerFragmentAddMagic, aVarNewInstance);
                h2VarBeginTransaction2.commit();
                break;
            case 4:
                Throwable error2 = (Throwable) obj;
                f.a aVar3 = f.f86599m;
                e0.checkNotNullParameter(error2, "error");
                Toast.makeText(fVar.getActivity(), error2.getMessage(), 1).show();
                break;
            case 5:
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding5 = fVar.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding5);
                fragmentAddMagicManagerBinding5.precedant.setVisibility(4);
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding6 = fVar.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding6);
                fragmentAddMagicManagerBinding6.suivant.setVisibility(4);
                fVar.displayFinalFragment();
                break;
            case 6:
                Throwable error3 = (Throwable) obj;
                f.a aVar4 = f.f86599m;
                e0.checkNotNullParameter(error3, "error");
                Toast.makeText(fVar.getActivity(), error3.getMessage(), 0).show();
                break;
            default:
                f.a aVar5 = f.f86599m;
                jb.h.f69257d.sharedInstance().incMetricCompteur("added_questions");
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding7 = fVar.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding7);
                fragmentAddMagicManagerBinding7.precedant.setVisibility(4);
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding8 = fVar.f86601e;
                e0.checkNotNull(fragmentAddMagicManagerBinding8);
                fragmentAddMagicManagerBinding8.suivant.setVisibility(4);
                fVar.displayFinalFragment();
                break;
        }
        return x0Var;
    }
}
