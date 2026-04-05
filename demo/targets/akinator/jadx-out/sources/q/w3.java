package q;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w3 extends x3.o2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f82291a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.s f82293c;

    public w3(androidx.appcompat.widget.s sVar, int i10) {
        this.f82293c = sVar;
        this.f82292b = i10;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationCancel(View view) {
        this.f82291a = true;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationEnd(View view) {
        if (this.f82291a) {
            return;
        }
        this.f82293c.f5174a.setVisibility(this.f82292b);
    }

    @Override // x3.o2, x3.n2
    public void onAnimationStart(View view) {
        this.f82293c.f5174a.setVisibility(0);
    }
}
