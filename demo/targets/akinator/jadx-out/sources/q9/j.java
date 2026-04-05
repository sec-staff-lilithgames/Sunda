package q9;

import android.widget.Toast;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding;
import kotlin.jvm.internal.e0;
import kv.l;
import q9.k;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f82638c;

    public /* synthetic */ j(k kVar, int i10) {
        this.f82637b = i10;
        this.f82638c = kVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f82637b;
        x0 x0Var = x0.f87415a;
        k kVar = this.f82638c;
        switch (i10) {
            case 0:
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = kVar.f82643g;
                e0.checkNotNull(fragmentAddMagicManagerBinding);
                fragmentAddMagicManagerBinding.precedant.setVisibility(4);
                FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = kVar.f82643g;
                e0.checkNotNull(fragmentAddMagicManagerBinding2);
                fragmentAddMagicManagerBinding2.suivant.setVisibility(4);
                kVar.displayFinalFragment();
                break;
            default:
                k.a aVar = k.f82639l;
                Toast.makeText(kVar.getActivity(), ((Throwable) obj).getMessage(), 1).show();
                break;
        }
        return x0Var;
    }
}
