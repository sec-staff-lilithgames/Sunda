package o9;

import com.digidust.elokence.akinator.activities.OneCharacterProposalActivity;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OneCharacterProposalActivity f78646c;

    public /* synthetic */ w3(OneCharacterProposalActivity oneCharacterProposalActivity, int i10) {
        this.f78645b = i10;
        this.f78646c = oneCharacterProposalActivity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f78645b;
        OneCharacterProposalActivity oneCharacterProposalActivity = this.f78646c;
        switch (i10) {
            case 0:
                int i11 = OneCharacterProposalActivity.S;
                oneCharacterProposalActivity.getClass();
                return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().getObjectsWithListSize(15, oneCharacterProposalActivity.N));
            default:
                int i12 = OneCharacterProposalActivity.S;
                oneCharacterProposalActivity.getClass();
                return Integer.valueOf(ca.o.sharedInstance().getCurrentSession().checkTrap(oneCharacterProposalActivity.K));
        }
    }
}
