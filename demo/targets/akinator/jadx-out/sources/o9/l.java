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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78308i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f78309j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f78310k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AccountDatabase f78311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlin.jvm.internal.z0 z0Var, j jVar, AccountDatabase accountDatabase, zu.d dVar) {
        super(2, dVar);
        this.f78309j = z0Var;
        this.f78310k = jVar;
        this.f78311l = accountDatabase;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l(this.f78309j, this.f78310k, this.f78311l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        j jVar = this.f78310k;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78308i;
        AccountDatabase accountDatabase = this.f78311l;
        try {
            try {
                if (i10 == 0) {
                    tu.a0.throwOnFailure(obj);
                    int i11 = this.f78309j.f71866b - 1;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    k kVar = new k(accountDatabase, i11, null);
                    this.f78308i = 1;
                    obj = BuildersKt.withContext(io2, kVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tu.a0.throwOnFailure(obj);
                }
                jVar.f78235f = (List) obj;
                List list = jVar.f78235f;
                if (list != null && !list.isEmpty()) {
                    AkActivity akActivity = jVar.f78234e;
                    kotlin.jvm.internal.e0.checkNotNull(akActivity);
                    jVar.f78237h = (ViewGroup) akActivity.getWindow().getDecorView().findViewById(R.id.content);
                    ViewGroup viewGroup = jVar.f78237h;
                    if (viewGroup != null) {
                        jVar.f78238i = LayoutInflater.from(jVar.f78234e).inflate(com.digidust.elokence.akinator.freemium.R.layout.layout_historique, viewGroup, false);
                        List list2 = jVar.f78235f;
                        kotlin.jvm.internal.e0.checkNotNull(list2);
                        List<ba.a> list3 = list2;
                        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list3, 10));
                        for (ba.a aVar : list3) {
                            String description = aVar.getDescription();
                            if (description == null) {
                                description = "";
                            }
                            arrayList.add(new Pair(aVar.getName(), description));
                        }
                        List mutableList = uu.y0.toMutableList((Collection) arrayList);
                        View view = jVar.f78238i;
                        kotlin.jvm.internal.e0.checkNotNull(view);
                        view.findViewById(com.digidust.elokence.akinator.freemium.R.id.closePopUp).setOnClickListener(new h(jVar, 2));
                        View view2 = jVar.f78238i;
                        kotlin.jvm.internal.e0.checkNotNull(view2);
                        TextView textView = (TextView) view2.findViewById(com.digidust.elokence.akinator.freemium.R.id.titreHisto);
                        textView.setTypeface(j.f78232l);
                        textView.setText(lb.b1.f72741d.sharedInstance().getTraductionFromToken("DETAIL_AKIAWARDS"));
                        View view3 = jVar.f78238i;
                        kotlin.jvm.internal.e0.checkNotNull(view3);
                        ListView listView = (ListView) view3.findViewById(com.digidust.elokence.akinator.freemium.R.id.listViewHistorique);
                        AkActivity akActivity2 = jVar.f78234e;
                        kotlin.jvm.internal.e0.checkNotNull(akActivity2);
                        listView.setAdapter((ListAdapter) new y9.l(akActivity2, mutableList, jVar.f78236g - 1));
                        AkActivity akActivity3 = jVar.f78234e;
                        kotlin.jvm.internal.e0.checkNotNull(akActivity3);
                        akActivity3.updateTextViewsSize();
                        FragmentActivity activity = jVar.getActivity();
                        if (activity != null) {
                            activity.runOnUiThread(new i(viewGroup, jVar, 1));
                        }
                    }
                }
            } catch (Exception e10) {
                Timber.Forest.tag("AwardsFragment").e(e10);
            }
            return tu.x0.f87415a;
        } finally {
            accountDatabase.close();
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
