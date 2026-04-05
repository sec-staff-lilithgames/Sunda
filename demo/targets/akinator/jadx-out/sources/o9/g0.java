package o9;

import com.digidust.elokence.akinator.activities.ContinueProcessActivity;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78155c;

    public /* synthetic */ g0(int i10, ArrayList arrayList) {
        this.f78154b = i10;
        this.f78155c = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f78154b;
        int objectsWithListSize = -1;
        ArrayList<e.f> arrayList = this.f78155c;
        switch (i10) {
            case 0:
                int i11 = ContinueProcessActivity.H;
                if (ca.o.sharedInstance().getCurrentSession() != null) {
                    return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().getObjectsWithListSize(15, arrayList));
                }
                return -1;
            case 1:
                if (ca.o.sharedInstance().getCurrentSession() != null) {
                    return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().getReport(arrayList));
                }
                return -1;
            default:
                int i12 = QuestionActivity.f21703n0;
                if (ca.o.sharedInstance().getCurrentSession() != null) {
                    lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                    kotlin.jvm.internal.e0.checkNotNull(currentSession);
                    objectsWithListSize = currentSession.getObjectsWithListSize(15, arrayList);
                }
                return Integer.valueOf(objectsWithListSize);
        }
    }
}
