package o9;

import com.digidust.elokence.akinator.activities.PostProposeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PostProposeActivity f78589c;

    public /* synthetic */ u4(PostProposeActivity postProposeActivity, int i10) {
        this.f78588b = i10;
        this.f78589c = postProposeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78588b) {
            case 0:
                PostProposeActivity.t(this.f78589c);
                break;
            default:
                PostProposeActivity postProposeActivity = this.f78589c;
                int i10 = postProposeActivity.R;
                if (i10 < 1 || i10 >= 6 || !ca.o.sharedInstance().winFirstTry()) {
                    int i11 = postProposeActivity.R;
                    if (i11 == 6 || i11 == 7) {
                        ta.o.sharedInstance().updateScoreFromChallengeAkiAward(postProposeActivity.getIntent().getIntExtra("keyNbDefi", 0));
                    }
                } else {
                    ta.o.sharedInstance().updateScoreFromClassicAkiAward();
                }
                if (ca.m.sharedInstance().isUserConnected()) {
                    postProposeActivity.disposeAtDestruction(mt.b0.fromCallable(new x(10)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new t4(postProposeActivity, 0)));
                    break;
                }
                break;
        }
    }
}
