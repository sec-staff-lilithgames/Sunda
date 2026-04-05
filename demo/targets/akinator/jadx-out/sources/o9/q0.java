package o9;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.db.accountdb.AccountDatabase;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.elokence.elokenceutils.AutoResizeTextView;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f78456c;

    public /* synthetic */ q0(v0 v0Var, int i10) {
        this.f78455b = i10;
        this.f78456c = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f78455b) {
            case 0:
                v0 v0Var = this.f78456c;
                v0Var.f78613g.removeView(v0Var.f78614h);
                v0Var.f78614h = null;
                break;
            case 1:
                Timber.tag("DefiDuJourRecapFragment").d("updateViewDefi", new Object[0]);
                final aa.c defiDuJourInfos = aa.f.sharedInstance().getDefiDuJourInfos();
                final v0 v0Var2 = this.f78456c;
                if (defiDuJourInfos != null) {
                    Timber.tag("DefiDuJourRecapFragment").d("defi du jour : %s", defiDuJourInfos.getTitle());
                    v0Var2.f78611e.setVisibility(0);
                    v0Var2.f78610c.setTypeface(AkApplication.getTypeFace());
                    v0Var2.f78610c.setText(defiDuJourInfos.getTitle());
                    TextView textView = v0Var2.f78610c;
                    if (textView instanceof AutoResizeTextView) {
                        ((AutoResizeTextView) textView).resizeText();
                    }
                    v0Var2.f78615i.removeAllViews();
                    v0Var2.f78616j.removeAllViews();
                    final int size = defiDuJourInfos.getListPerso().size();
                    Timber.tag("DefiDuJourRecapFragment").d("nbPersoToFind : %d", Integer.valueOf(size));
                    final int i10 = (int) ((size / 2.0f) + 0.5f);
                    Timber.tag("DefiDuJourRecapFragment").d("nbPhotosFirstLine : %d", Integer.valueOf(i10));
                    v0Var2.f78618l = false;
                    if (!ca.m.sharedInstance().isUserConnected()) {
                        Iterator<aa.e> it = defiDuJourInfos.getListPerso().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                aa.e next = it.next();
                                if (next.isFound() && next.getGz() == 0) {
                                    v0Var2.f78618l = true;
                                }
                            }
                        }
                        v0Var2.a(v0Var2.f78615i, 0, i10, defiDuJourInfos);
                        v0Var2.a(v0Var2.f78616j, i10, size, defiDuJourInfos);
                    } else if (ca.m.sharedInstance().isUserConnected()) {
                        mt.b0.fromCallable(new com.google.firebase.messaging.m(5, (AccountDatabase) o5.s0.databaseBuilder(AkApplication.getAppContext(), AccountDatabase.class, "accountdb").fallbackToDestructiveMigration().build(), defiDuJourInfos)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new st.g() { // from class: o9.r0
                            @Override // st.g
                            public final void accept(Object obj) {
                                v0 v0Var3 = v0Var2;
                                LinearLayout linearLayout = v0Var3.f78615i;
                                int i11 = i10;
                                aa.c cVar = defiDuJourInfos;
                                v0Var3.a(linearLayout, 0, i11, cVar);
                                v0Var3.a(v0Var3.f78616j, i11, size, cVar);
                            }
                        });
                    }
                    if (aa.f.sharedInstance().getDefiInfos(false) != null) {
                        if (aa.f.sharedInstance().getDefiInfos(false) != null) {
                            v0Var2.f78612f.setVisibility(0);
                            v0Var2.f78612f.setOnClickListener(new p0(v0Var2, 2));
                        } else {
                            v0Var2.f78612f.setVisibility(4);
                        }
                    }
                    v0Var2.f78619m.markTextviewForUpdate(v0Var2.f78610c);
                    v0Var2.f78619m.updateTextViewsSize();
                    break;
                } else {
                    Timber.tag("DefiDuJourRecapFragment").e("pas de defi du jour", new Object[0]);
                    v0Var2.f78611e.setVisibility(4);
                    break;
                }
                break;
            default:
                v0 v0Var3 = this.f78456c;
                v0Var3.f78613g.addView(v0Var3.f78614h);
                break;
        }
    }
}
