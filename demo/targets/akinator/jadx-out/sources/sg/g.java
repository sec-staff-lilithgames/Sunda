package sg;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f85752a;

    /* renamed from: b, reason: collision with root package name */
    public final b f85753b;

    /* renamed from: c, reason: collision with root package name */
    public final View f85754c;

    public <T extends View & b> g(T t10) {
        this(t10, t10);
    }

    public boolean shouldListenForBackCallbacks() {
        return this.f85752a != null;
    }

    public void startListeningForBackCallbacks() {
        c cVar = this.f85752a;
        if (cVar != null) {
            cVar.startListeningForBackCallbacks(this.f85753b, this.f85754c, false);
        }
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        c cVar = this.f85752a;
        if (cVar != null) {
            cVar.startListeningForBackCallbacks(this.f85753b, this.f85754c, true);
        }
    }

    public void stopListeningForBackCallbacks() {
        c cVar = this.f85752a;
        if (cVar != null) {
            cVar.stopListeningForBackCallbacks(this.f85754c);
        }
    }

    public g(b bVar, View view) {
        int i10 = Build.VERSION.SDK_INT;
        this.f85752a = i10 >= 34 ? new e() : i10 >= 33 ? new c() : null;
        this.f85753b = bVar;
        this.f85754c = view;
    }
}
