package o9;

import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.digidust.elokence.akinator.activities.StoreItemsActivity;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f78284c;

    public /* synthetic */ k0(int i10, int i11) {
        this.f78283b = i11;
        this.f78284c = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f78283b) {
            case 0:
                int[] iArr = DefiDuJourActivity.P;
                return Integer.valueOf(ca.o.sharedInstance().updateUserInfosGeniz(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), String.valueOf(ca.m.sharedInstance().getCurrentSubject()), this.f78284c, true));
            case 1:
                return Integer.valueOf(ca.o.sharedInstance().updateUserInfosGeniz(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), String.valueOf(ca.m.sharedInstance().getCurrentSubject()), this.f78284c, false));
            case 2:
                int i10 = PostProposeActivity.Z;
                return Integer.valueOf(ca.o.sharedInstance().updateUserInfosGeniz(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), String.valueOf(ca.m.sharedInstance().getCurrentSubject()), this.f78284c, true));
            default:
                String[] strArr = StoreItemsActivity.U;
                return Integer.valueOf(ca.o.sharedInstance().updateUserInfosGeniz(ca.m.sharedInstance().getCurrentLanguage(), ca.m.sharedInstance().getKeyUser(), String.valueOf(ca.m.sharedInstance().getCurrentSubject()), this.f78284c, false));
        }
    }
}
