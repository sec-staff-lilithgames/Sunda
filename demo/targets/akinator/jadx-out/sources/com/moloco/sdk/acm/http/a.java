package com.moloco.sdk.acm.http;

import hv.a0;
import hv.b0;
import io.ktor.http.HeadersBuilder;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import kv.q;
import tu.x0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f45615c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Comparable f45617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Comparable f45618g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Comparable f45619h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f45620i;

    public /* synthetic */ a(Serializable serializable, Object obj, Comparable comparable, Comparable comparable2, Comparable comparable3, Object obj2, int i10) {
        this.f45614b = i10;
        this.f45615c = serializable;
        this.f45616e = obj;
        this.f45617f = comparable;
        this.f45618g = comparable2;
        this.f45619h = comparable3;
        this.f45620i = obj2;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f45614b) {
            case 0:
                return b.a((String) this.f45615c, (String) this.f45616e, (String) this.f45617f, (String) this.f45618g, (String) this.f45619h, (String) this.f45620i, (HeadersBuilder) obj);
            default:
                final ArrayList arrayList = (ArrayList) this.f45615c;
                final q qVar = (q) this.f45616e;
                final Path path = (Path) this.f45617f;
                final Path path2 = (Path) this.f45618g;
                final Path path3 = (Path) this.f45619h;
                final q qVar2 = (q) this.f45620i;
                hv.f visitFileTree = (hv.f) obj;
                e0.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
                visitFileTree.onPreVisitDirectory(new p() { // from class: hv.w
                    @Override // kv.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Path path4 = path;
                        Path path5 = path2;
                        Path path6 = path3;
                        Path directory = (Path) obj2;
                        BasicFileAttributes attributes = (BasicFileAttributes) obj3;
                        e0.checkNotNullParameter(directory, "directory");
                        e0.checkNotNullParameter(attributes, "attributes");
                        ArrayList arrayList2 = arrayList;
                        FileVisitResult fileVisitResultB = c0.b(arrayList2, qVar, path4, path5, path6, qVar2, directory);
                        if (fileVisitResultB == FileVisitResult.CONTINUE) {
                            arrayList2.add(directory);
                        }
                        return fileVisitResultB;
                    }
                });
                visitFileTree.onVisitFile(new a0(arrayList, qVar, path, path2, path3, qVar2));
                visitFileTree.onVisitFileFailed(new b0(qVar2, path, path2, path3));
                visitFileTree.onPostVisitDirectory(new p() { // from class: hv.u
                    @Override // kv.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Path path4 = path;
                        Path path5 = path2;
                        Path path6 = path3;
                        Path directory = (Path) obj2;
                        IOException iOException = (IOException) obj3;
                        e0.checkNotNullParameter(directory, "directory");
                        v0.removeLast(arrayList);
                        return iOException == null ? FileVisitResult.CONTINUE : c0.d(qVar2, path4, path5, path6, directory, iOException);
                    }
                });
                return x0.f87415a;
        }
    }
}
