package v9;

import ca.m;
import ca.o;
import com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity;
import da.j;
import du.g;
import lb.b1;
import lb.s0;
import lb.y0;
import mt.p0;
import mt.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements r0, j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OptionRareCharacterActivity f89194b;

    public /* synthetic */ a(OptionRareCharacterActivity optionRareCharacterActivity) {
        this.f89194b = optionRareCharacterActivity;
    }

    @Override // da.j
    public void onOk() {
        int i10 = OptionRareCharacterActivity.N;
        OptionRareCharacterActivity optionRareCharacterActivity = this.f89194b;
        optionRareCharacterActivity.disableAdOneTime();
        optionRareCharacterActivity.t();
    }

    @Override // mt.r0
    public void subscribe(p0 p0Var) {
        int i10 = OptionRareCharacterActivity.N;
        OptionRareCharacterActivity optionRareCharacterActivity = this.f89194b;
        optionRareCharacterActivity.getClass();
        y0 y0VarStartSession = s0.f72971j.sharedInstance().startSession(m.sharedInstance().getCurrentLanguage(), m.sharedInstance().getCurrentSubject(), o.sharedInstance().isPrio(), m.sharedInstance().isChildProtectEnabled());
        o.sharedInstance().setCurrentSession(y0VarStartSession.f73052b);
        if (optionRareCharacterActivity.H.isDisposed()) {
            return;
        }
        int i11 = y0VarStartSession.f73051a;
        if (i11 == 0) {
            ((g) p0Var).onSuccess(Integer.valueOf(i11));
        } else {
            ((g) p0Var).onError(new Exception(b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD")));
        }
    }
}
