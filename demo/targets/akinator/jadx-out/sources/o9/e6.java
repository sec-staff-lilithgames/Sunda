package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e6 extends f.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(QuestionActivity questionActivity) {
        super(true);
        this.f78118d = questionActivity;
    }

    @Override // f.x
    public void handleOnBackPressed() {
        this.f78118d.goToHome(true);
    }
}
