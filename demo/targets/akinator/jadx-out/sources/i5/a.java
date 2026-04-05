package i5;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.Deferred;
import kv.l;
import tu.x0;
import w2.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends f0 implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f59428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Deferred f59429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, Deferred deferred) {
        super(1);
        this.f59428e = jVar;
        this.f59429f = deferred;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        j jVar = this.f59428e;
        if (th2 == null) {
            jVar.set(this.f59429f.getCompleted());
        } else if (th2 instanceof CancellationException) {
            jVar.setCancelled();
        } else {
            jVar.setException(th2);
        }
    }
}
