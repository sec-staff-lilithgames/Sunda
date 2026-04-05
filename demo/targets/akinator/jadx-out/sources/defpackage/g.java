package defpackage;

import io.ktor.client.engine.android.AndroidEngineConfig;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends f0 implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final g f56320e = new g(1);

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidEngineConfig) obj);
        return x0.f87415a;
    }

    public final void invoke(AndroidEngineConfig engine) {
        e0.checkNotNullParameter(engine, "$this$engine");
        engine.setSslManager(f.f55192e);
    }
}
