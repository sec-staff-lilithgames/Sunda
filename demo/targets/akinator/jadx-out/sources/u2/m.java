package u2;

import android.os.Looper;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f87741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar) {
        super(1);
        this.f87741e = oVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((kv.a) obj);
        return x0.f87415a;
    }

    public final void invoke(kv.a command) {
        kotlin.jvm.internal.e0.checkNotNullParameter(command, "command");
        o oVar = this.f87741e;
        if (oVar.getHandler().getLooper() == Looper.myLooper()) {
            command.invoke();
        } else {
            oVar.getHandler().post(new a2.d0(4, command));
        }
    }
}
