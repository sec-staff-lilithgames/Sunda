package d7;

import java.io.IOException;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends f0 implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f51913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar) {
        super(1);
        this.f51913e = eVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return x0.f87415a;
    }

    public final void invoke(IOException iOException) {
        this.f51913e.f51890o = true;
    }
}
