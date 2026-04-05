package o9;

import com.digidust.elokence.akinator.activities.SeveralCharactersProposalActivity;
import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import com.inmobi.media.O2;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class n7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78404c;

    public /* synthetic */ n7(int i10, ArrayList arrayList) {
        this.f78403b = i10;
        this.f78404c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f78403b;
        ArrayList<String> arrayList = this.f78404c;
        switch (i10) {
            case 0:
                int i11 = SeveralCharactersProposalActivity.N;
                ca.o.sharedInstance().getCurrentSession().reportDuplicatesWithArray(arrayList, false);
                break;
            case 1:
                int i12 = SoundlikeActivity.L;
                lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                kotlin.jvm.internal.e0.checkNotNull(currentSession);
                currentSession.reportDuplicatesWithArray(arrayList, false);
                break;
            case 2:
                int i13 = SoundlikeActivity.L;
                lb.e currentSession2 = ca.o.sharedInstance().getCurrentSession();
                kotlin.jvm.internal.e0.checkNotNull(currentSession2);
                currentSession2.reportDuplicatesWithArray(arrayList, false);
                break;
            default:
                O2.a(arrayList);
                break;
        }
    }
}
