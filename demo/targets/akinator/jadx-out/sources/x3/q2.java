package x3;

import android.view.ViewStructure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewStructure f91665a;

    public q2(ViewStructure viewStructure) {
        this.f91665a = viewStructure;
    }

    public static q2 toViewStructureCompat(ViewStructure viewStructure) {
        return new q2(viewStructure);
    }

    public void setClassName(String str) {
        this.f91665a.setClassName(str);
    }

    public void setContentDescription(CharSequence charSequence) {
        this.f91665a.setContentDescription(charSequence);
    }

    public void setDimens(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f91665a.setDimens(i10, i11, i12, i13, i14, i15);
    }

    public void setText(CharSequence charSequence) {
        this.f91665a.setText(charSequence);
    }

    public ViewStructure toViewStructure() {
        return this.f91665a;
    }
}
