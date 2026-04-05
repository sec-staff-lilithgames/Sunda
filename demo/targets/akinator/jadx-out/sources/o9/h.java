package o9;

import android.R;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o9.j;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f78181c;

    public /* synthetic */ h(j jVar, int i10) {
        this.f78180b = i10;
        this.f78181c = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f78180b;
        j jVar = this.f78181c;
        switch (i10) {
            case 0:
                j.b bVar = j.f78231k;
                kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0();
                if (kotlin.jvm.internal.e0.areEqual(view, jVar.a().buttonShowBlackAwards)) {
                    z0Var.f71866b = 6;
                } else if (kotlin.jvm.internal.e0.areEqual(view, jVar.a().buttonShowPlatinumAwards)) {
                    z0Var.f71866b = 5;
                } else if (kotlin.jvm.internal.e0.areEqual(view, jVar.a().buttonShowGoldAwards)) {
                    z0Var.f71866b = 4;
                }
                jVar.f78236g = z0Var.f71866b;
                int i11 = 0;
                if (ca.m.sharedInstance().isUserConnected()) {
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(jVar), null, null, new l(z0Var, jVar, (AccountDatabase) o5.s0.databaseBuilder(AkApplication.f21719f.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration(false).build(), null), 3, null);
                    return;
                }
                try {
                    List<Pair<String, String>> charactersPlayedForAwardLevel = aa.a.sharedInstance().getCharactersPlayedForAwardLevel(z0Var.f71866b);
                    List<Pair<String, String>> list = charactersPlayedForAwardLevel;
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    AkActivity akActivity = jVar.f78234e;
                    kotlin.jvm.internal.e0.checkNotNull(akActivity);
                    ViewGroup viewGroup = (ViewGroup) akActivity.getWindow().getDecorView().findViewById(R.id.content);
                    jVar.f78237h = viewGroup;
                    if (viewGroup != null) {
                        View viewInflate = LayoutInflater.from(jVar.f78234e).inflate(com.digidust.elokence.akinator.freemium.R.layout.layout_historique, viewGroup, false);
                        jVar.f78238i = viewInflate;
                        kotlin.jvm.internal.e0.checkNotNull(viewInflate);
                        viewInflate.findViewById(com.digidust.elokence.akinator.freemium.R.id.closePopUp).setOnClickListener(new h(jVar, 1));
                        View view2 = jVar.f78238i;
                        kotlin.jvm.internal.e0.checkNotNull(view2);
                        TextView textView = (TextView) view2.findViewById(com.digidust.elokence.akinator.freemium.R.id.titreHisto);
                        textView.setTypeface(j.f78232l);
                        j1.o2.A(lb.b1.f72741d, "DETAIL_AKIAWARDS", textView);
                        View view3 = jVar.f78238i;
                        kotlin.jvm.internal.e0.checkNotNull(view3);
                        ListView listView = (ListView) view3.findViewById(com.digidust.elokence.akinator.freemium.R.id.listViewHistorique);
                        AkActivity akActivity2 = jVar.f78234e;
                        kotlin.jvm.internal.e0.checkNotNull(akActivity2);
                        listView.setAdapter((ListAdapter) new y9.l(akActivity2, charactersPlayedForAwardLevel, z0Var.f71866b - 1));
                        AkActivity akActivity3 = jVar.f78234e;
                        kotlin.jvm.internal.e0.checkNotNull(akActivity3);
                        akActivity3.updateTextViewsSize();
                        FragmentActivity activity = jVar.getActivity();
                        if (activity != null) {
                            activity.runOnUiThread(new i(viewGroup, jVar, i11));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    Timber.Forest.tag("AwardsFragment").e(e10);
                    return;
                }
            case 1:
                j.b bVar2 = j.f78231k;
                jVar.removeCreatedView();
                return;
            default:
                jVar.removeCreatedView();
                return;
        }
    }
}
