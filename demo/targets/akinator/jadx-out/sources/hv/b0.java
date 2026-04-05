package hv;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class b0 extends kotlin.jvm.internal.a0 implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.q f59187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Path f59188c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Path f59189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Path f59190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kv.q qVar, Path path, Path path2, Path path3) {
        super(2, kotlin.jvm.internal.d0.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
        this.f59187b = qVar;
        this.f59188c = path;
        this.f59189e = path2;
        this.f59190f = path3;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(cf.a.d(obj), (Exception) obj2);
    }

    public final FileVisitResult invoke(Path p02, Exception p12) {
        e0.checkNotNullParameter(p02, "p0");
        e0.checkNotNullParameter(p12, "p1");
        return c0.d(this.f59187b, this.f59188c, this.f59189e, this.f59190f, p02, p12);
    }
}
