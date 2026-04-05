package u4;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends s4.n {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f87849a;

    public m(EditText editText) {
        this.f87849a = new WeakReference(editText);
    }

    @Override // s4.n
    public void onInitialized() {
        super.onInitialized();
        n.a((EditText) this.f87849a.get(), 1);
    }
}
