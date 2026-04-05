package s4;

import android.text.Spannable;
import android.text.SpannableString;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public u0 f85469a;

    /* renamed from: b, reason: collision with root package name */
    public final r f85470b;

    public z(u0 u0Var, r rVar) {
        this.f85469a = u0Var;
        this.f85470b = rVar;
    }

    @Override // s4.a0
    public boolean handleEmoji(CharSequence charSequence, int i10, int i11, r0 r0Var) {
        if (r0Var.isPreferredSystemRender()) {
            return true;
        }
        if (this.f85469a == null) {
            this.f85469a = new u0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        this.f85469a.setSpan(this.f85470b.createSpan(r0Var), i10, i11, 33);
        return true;
    }

    @Override // s4.a0
    public u0 getResult() {
        return this.f85469a;
    }
}
