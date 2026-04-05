package s4;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f85374a;

    public c0(String str) {
        this.f85374a = str;
    }

    @Override // s4.a0
    public boolean handleEmoji(CharSequence charSequence, int i10, int i11, r0 r0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f85374a)) {
            return true;
        }
        r0Var.setExclusion(true);
        return false;
    }

    @Override // s4.a0
    public c0 getResult() {
        return this;
    }
}
