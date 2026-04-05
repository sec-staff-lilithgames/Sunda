package a2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f3529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(t tVar) {
        super(1);
        this.f3529e = tVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((kv.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(kv.a command) {
        kotlin.jvm.internal.e0.checkNotNullParameter(command, "command");
        t tVar = this.f3529e;
        Handler handler = tVar.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            command.invoke();
            return;
        }
        Handler handler2 = tVar.getHandler();
        if (handler2 != null) {
            handler2.post(new d0(0, command));
        }
    }
}
