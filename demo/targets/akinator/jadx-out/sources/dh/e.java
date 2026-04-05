package dh;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(q qVar, int i10) {
        super(qVar);
        this.f52228e = i10;
    }

    @Override // dh.r
    public void l() {
        switch (this.f52228e) {
            case 0:
                q qVar = this.f52277b;
                qVar.f52268q = null;
                CheckableImageButton checkableImageButton = qVar.f52260i;
                checkableImageButton.setOnLongClickListener(null);
                kc.p.P(checkableImageButton, null);
                break;
        }
    }
}
