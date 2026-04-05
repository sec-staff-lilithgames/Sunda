package v9;

import android.view.View;
import ca.p;
import com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f89197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OptionRareCharacterActivity f89198c;

    public c(OptionRareCharacterActivity optionRareCharacterActivity, p pVar) {
        this.f89198c = optionRareCharacterActivity;
        this.f89197b = pVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f89198c.getWindowManager().addCrossWindowBlurEnabledListener(this.f89197b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f89198c.getWindowManager().removeCrossWindowBlurEnabledListener(this.f89197b);
    }
}
