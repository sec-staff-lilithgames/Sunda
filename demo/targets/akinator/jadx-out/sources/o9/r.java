package o9;

import android.content.Intent;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.VoteActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentClassementBinding;
import o9.s;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f78472c;

    public /* synthetic */ r(s sVar, int i10) {
        this.f78471b = i10;
        this.f78472c = sVar;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f78471b;
        tu.x0 x0Var = tu.x0.f87415a;
        s sVar = this.f78472c;
        switch (i10) {
            case 0:
                sa.a aVar = (sa.a) obj;
                s.a aVar2 = s.f78491t;
                FragmentActivity activity = sVar.getActivity();
                kotlin.jvm.internal.e0.checkNotNull(activity, "null cannot be cast to non-null type com.digidust.elokence.akinator.activities.AkActivity");
                ((AkActivity) activity).disableAdOneTime();
                sVar.f78504p = true;
                Intent intent = new Intent(sVar.getActivity(), (Class<?>) VoteActivity.class);
                intent.putExtra("vote", aVar.getListAwardsToVote());
                intent.putExtra("score", aVar.getScore());
                intent.putExtra("moreVotes", aVar.moreVotes());
                intent.putExtra("didac", false);
                sVar.requireActivity().startActivity(intent);
                break;
            case 1:
                s.a aVar3 = s.f78491t;
                Toast.makeText(sVar.getActivity(), ((Throwable) obj).getMessage(), 1).show();
                break;
            default:
                Throwable th2 = (Throwable) obj;
                s.a aVar4 = s.f78491t;
                Timber.Forest forest = Timber.Forest;
                forest.tag("ClassementFragment").e(a.b.k("On error ", th2.getMessage()), new Object[0]);
                FragmentClassementBinding fragmentClassementBinding = sVar.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding);
                fragmentClassementBinding.loadingBarClassement.setVisibility(8);
                FragmentClassementBinding fragmentClassementBinding2 = sVar.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding2);
                fragmentClassementBinding2.messageErrorHistorique.setVisibility(0);
                FragmentClassementBinding fragmentClassementBinding3 = sVar.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding3);
                fragmentClassementBinding3.messageErrorHistorique.setTypeface(AkApplication.f21719f.getTypeFace());
                FragmentClassementBinding fragmentClassementBinding4 = sVar.f78506r;
                kotlin.jvm.internal.e0.checkNotNull(fragmentClassementBinding4);
                fragmentClassementBinding4.messageErrorHistorique.setText(th2.getMessage());
                forest.tag("ClassementFragment").d("On passe mCanCallRefresh = true (sur erreur)", new Object[0]);
                sVar.f78503o = true;
                break;
        }
        return x0Var;
    }
}
