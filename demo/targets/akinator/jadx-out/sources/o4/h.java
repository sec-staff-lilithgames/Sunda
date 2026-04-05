package o4;

import java.io.File;
import kotlin.jvm.internal.f0;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f77482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kv.a aVar) {
        super(0);
        this.f77482e = aVar;
    }

    @Override // kv.a
    public final File invoke() {
        return ((n0) this.f77482e.invoke()).toFile();
    }
}
