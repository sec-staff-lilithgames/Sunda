package t5;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w implements y5.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f86385a;

    /* renamed from: b, reason: collision with root package name */
    public final File f86386b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f86387c;

    /* renamed from: d, reason: collision with root package name */
    public final y5.f f86388d;

    public w(String str, File file, Callable<InputStream> callable, y5.f delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.f86385a = str;
        this.f86386b = file;
        this.f86387c = callable;
        this.f86388d = delegate;
    }

    @Override // y5.f
    public y5.g create(y5.e configuration) {
        e0.checkNotNullParameter(configuration, "configuration");
        return new v(configuration.f94076a, this.f86385a, this.f86386b, this.f86387c, configuration.f94078c.f94074a, this.f86388d.create(configuration));
    }
}
