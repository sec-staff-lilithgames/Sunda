package hv;

import java.nio.file.FileVisitor;
import java.nio.file.Path;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public kv.p f59199a;

    /* renamed from: b, reason: collision with root package name */
    public kv.p f59200b;

    /* renamed from: c, reason: collision with root package name */
    public kv.p f59201c;

    /* renamed from: d, reason: collision with root package name */
    public kv.p f59202d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f59203e;

    public static void b(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(str.concat(" was already defined"));
        }
    }

    public final void a() {
        if (this.f59203e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    public final FileVisitor<Path> build() {
        a();
        this.f59203e = true;
        return new h(this.f59199a, this.f59200b, this.f59201c, this.f59202d);
    }

    @Override // hv.f
    public void onPostVisitDirectory(kv.p function) {
        e0.checkNotNullParameter(function, "function");
        a();
        b(this.f59202d, "onPostVisitDirectory");
        this.f59202d = function;
    }

    @Override // hv.f
    public void onPreVisitDirectory(kv.p function) {
        e0.checkNotNullParameter(function, "function");
        a();
        b(this.f59199a, "onPreVisitDirectory");
        this.f59199a = function;
    }

    @Override // hv.f
    public void onVisitFile(kv.p function) {
        e0.checkNotNullParameter(function, "function");
        a();
        b(this.f59200b, "onVisitFile");
        this.f59200b = function;
    }

    @Override // hv.f
    public void onVisitFileFailed(kv.p function) {
        e0.checkNotNullParameter(function, "function");
        a();
        b(this.f59201c, "onVisitFileFailed");
        this.f59201c = function;
    }
}
