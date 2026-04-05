package defpackage;

import io.ktor.client.plugins.HttpSend;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends f0 implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final e f52950e = new e(1);

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HttpSend.Config) obj);
        return x0.f87415a;
    }

    public final void invoke(HttpSend.Config install) {
        e0.checkNotNullParameter(install, "$this$install");
        install.setMaxSendCount(3);
    }
}
