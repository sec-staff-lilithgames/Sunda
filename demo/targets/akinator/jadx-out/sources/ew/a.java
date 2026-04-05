package ew;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import pw.k;
import xv.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final k f55154a;

    /* renamed from: b, reason: collision with root package name */
    public long f55155b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ew.a$a, reason: collision with other inner class name */
    public static final class C0559a {
        public C0559a(u uVar) {
        }
    }

    static {
        new C0559a(null);
    }

    public a(k source) {
        e0.checkNotNullParameter(source, "source");
        this.f55154a = source;
        this.f55155b = 262144L;
    }

    public final k getSource() {
        return this.f55154a;
    }

    public final f0 readHeaders() throws IOException {
        f0.a aVar = new f0.a();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return aVar.build();
            }
            aVar.addLenient$okhttp(line);
        }
    }

    public final String readLine() throws IOException {
        String utf8LineStrict = this.f55154a.readUtf8LineStrict(this.f55155b);
        this.f55155b -= utf8LineStrict.length();
        return utf8LineStrict;
    }
}
