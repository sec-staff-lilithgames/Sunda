package l4;

import java.io.IOException;
import k4.e;
import k4.f;
import kotlin.jvm.internal.e0;
import kv.l;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final l f72402a;

    public b(l produceNewData) {
        e0.checkNotNullParameter(produceNewData, "produceNewData");
        this.f72402a = produceNewData;
    }

    @Override // k4.f
    public Object handleCorruption(e eVar, d<Object> dVar) throws IOException {
        return this.f72402a.invoke(eVar);
    }
}
