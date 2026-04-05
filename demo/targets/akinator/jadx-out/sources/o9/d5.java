package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import java.util.concurrent.Callable;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78092c;

    public /* synthetic */ d5(QuestionActivity questionActivity, int i10) {
        this.f78091b = i10;
        this.f78092c = questionActivity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f78091b;
        QuestionActivity questionActivity = this.f78092c;
        switch (i10) {
            case 0:
                int i11 = QuestionActivity.f21703n0;
                lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                kotlin.jvm.internal.e0.checkNotNull(currentSession);
                e.g gVar = questionActivity.U;
                if (gVar == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("potentialTrap");
                    gVar = null;
                }
                return Integer.valueOf(currentSession.checkTrap(gVar));
            default:
                lb.e currentSession2 = ca.o.sharedInstance().getCurrentSession();
                kotlin.jvm.internal.e0.checkNotNull(currentSession2);
                return Integer.valueOf(currentSession2.getObjectsWithListSize(15, questionActivity.S));
        }
    }
}
