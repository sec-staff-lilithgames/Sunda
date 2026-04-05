package r9;

import androidx.fragment.app.h2;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.l;
import r9.b;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f84057c;

    public /* synthetic */ d(e eVar, int i10) {
        this.f84056b = i10;
        this.f84057c = eVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f84056b) {
            case 0:
                e eVar = this.f84057c;
                AkActivity akActivity = eVar.f84061f;
                if (akActivity != null) {
                    akActivity.hideLoader();
                }
                List list = eVar.f84062g;
                if (list == null || list.isEmpty()) {
                    eVar.displayFinalFragment();
                } else {
                    b.a aVar = b.f84049h;
                    List<? extends lb.d> list2 = eVar.f84062g;
                    e0.checkNotNull(list2);
                    b bVarNewInstance = aVar.newInstance(list2);
                    bVarNewInstance.setManager(eVar);
                    h2 h2VarBeginTransaction = eVar.getParentFragmentManager().beginTransaction();
                    FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = eVar.f84059c;
                    e0.checkNotNull(fragmentAddMagicManagerBinding);
                    h2VarBeginTransaction.add(fragmentAddMagicManagerBinding.containerFragmentAddMagic.getId(), bVarNewInstance).commit();
                }
                break;
            default:
                e eVar2 = this.f84057c;
                AkActivity akActivity2 = eVar2.f84061f;
                if (akActivity2 != null) {
                    akActivity2.hideLoader();
                }
                eVar2.manageFinished();
                break;
        }
        return x0.f87415a;
    }
}
