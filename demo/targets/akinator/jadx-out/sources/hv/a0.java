package hv;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.a0 implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f59178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.q f59179c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Path f59180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Path f59181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Path f59182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.q f59183h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ArrayList arrayList, kv.q qVar, Path path, Path path2, Path path3, kv.q qVar2) {
        super(2, kotlin.jvm.internal.d0.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
        this.f59178b = arrayList;
        this.f59179c = qVar;
        this.f59180e = path;
        this.f59181f = path2;
        this.f59182g = path3;
        this.f59183h = qVar2;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(cf.a.d(obj), (BasicFileAttributes) obj2);
    }

    public final FileVisitResult invoke(Path p02, BasicFileAttributes p12) {
        e0.checkNotNullParameter(p02, "p0");
        e0.checkNotNullParameter(p12, "p1");
        return c0.b(this.f59178b, this.f59179c, this.f59180e, this.f59181f, this.f59182g, this.f59183h, p02);
    }
}
