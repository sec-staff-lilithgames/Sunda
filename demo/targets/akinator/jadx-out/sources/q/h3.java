package q;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h3 extends s4.n {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f82113a;

    public h3(SwitchCompat switchCompat) {
        this.f82113a = new WeakReference(switchCompat);
    }

    @Override // s4.n
    public void onFailed(Throwable th2) {
        SwitchCompat switchCompat = (SwitchCompat) this.f82113a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // s4.n
    public void onInitialized() {
        SwitchCompat switchCompat = (SwitchCompat) this.f82113a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
