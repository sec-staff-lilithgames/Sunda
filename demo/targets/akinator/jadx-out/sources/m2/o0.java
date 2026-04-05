package m2;

import android.view.KeyEvent;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f73955a;

    public o0(u0 u0Var) {
        this.f73955a = u0Var;
    }

    @Override // m2.o
    public void onEditCommands(List<? extends d> editCommands) {
        kotlin.jvm.internal.e0.checkNotNullParameter(editCommands, "editCommands");
        this.f73955a.f73976d.invoke(editCommands);
    }

    @Override // m2.o
    /* renamed from: onImeAction-KlQnJC8 */
    public void mo5612onImeActionKlQnJC8(int i10) {
        this.f73955a.f73977e.invoke(m.m5600boximpl(i10));
    }

    @Override // m2.o
    public void onKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        u0.access$getBaseInputConnection(this.f73955a).sendKeyEvent(event);
    }
}
