package o6;

import androidx.work.impl.WorkDatabase;
import com.ironsource.C3191e4;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.ExceptionsKt;
import p0.n3;
import p0.o3;
import pw.n0;
import z5.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77976b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f77977c;

    public /* synthetic */ v0(Object obj, int i10) {
        this.f77976b = i10;
        this.f77977c = obj;
    }

    @Override // kv.a
    public final Object invoke() throws IOException {
        CancellableContinuation cancellableContinuationC;
        int iLastIndexOf$default;
        tu.v vVar;
        switch (this.f77976b) {
            case 0:
                return Long.valueOf(((w6.u) this.f77977c).getLastCancelAllTimeMillis());
            case 1:
                ow.d dVar = (ow.d) this.f77977c;
                List list = ow.d.A;
                dVar.cancel();
                return tu.x0.f87415a;
            case 2:
                ow.j jVar = (ow.j) this.f77977c;
                List list2 = ow.d.A;
                yv.h.closeQuietly(jVar);
                return tu.x0.f87415a;
            case 3:
                n3 n3Var = (n3) this.f77977c;
                synchronized (n3Var.f80350c) {
                    cancellableContinuationC = n3Var.c();
                    if (((o3) n3Var.f80370w.getValue()).compareTo(o3.f80382c) <= 0) {
                        throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", n3Var.f80352e);
                    }
                }
                if (cancellableContinuationC != null) {
                    int i10 = tu.z.f87419c;
                    cancellableContinuationC.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
                }
                return tu.x0.f87415a;
            case 4:
                q5.a aVar = (q5.a) this.f77977c;
                x5.b bVarOpen = aVar.f82402b.open(aVar.f82403c);
                kotlin.jvm.internal.e0.checkNotNull(bVarOpen, "null cannot be cast to non-null type androidx.sqlite.driver.AndroidSQLiteConnection");
                return new q5.b((a6.a) bVarOpen);
            case 5:
                qw.o oVar = (qw.o) this.f77977c;
                ClassLoader classLoader = oVar.f83599e;
                pw.r rVar = oVar.f83600f;
                Enumeration<URL> resources = classLoader.getResources("");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(resources, "getResources(...)");
                ArrayList<URL> list3 = Collections.list(resources);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(list3, "list(...)");
                ArrayList arrayList = new ArrayList();
                for (URL url : list3) {
                    kotlin.jvm.internal.e0.checkNotNull(url);
                    tu.v vVar2 = !kotlin.jvm.internal.e0.areEqual(url.getProtocol(), C3191e4.h.f36473b) ? null : tu.e0.to(rVar, n0.a.get$default(pw.n0.f81931c, new File(url.toURI()), false, 1, (Object) null));
                    if (vVar2 != null) {
                        arrayList.add(vVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(resources2, "getResources(...)");
                ArrayList<URL> list4 = Collections.list(resources2);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(list4, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                for (URL url2 : list4) {
                    kotlin.jvm.internal.e0.checkNotNull(url2);
                    String string = url2.toString();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                    if (sv.k0.startsWith$default(string, "jar:file:", false, 2, null) && (iLastIndexOf$default = sv.n0.lastIndexOf$default((CharSequence) string, "!", 0, false, 6, (Object) null)) != -1) {
                        n0.a aVar2 = pw.n0.f81931c;
                        String strSubstring = string.substring(4, iLastIndexOf$default);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        vVar = tu.e0.to(qw.u.openZip(n0.a.get$default(aVar2, new File(URI.create(strSubstring)), false, 1, (Object) null), rVar, new f.j0(14)), qw.o.f83598i);
                    } else {
                        vVar = null;
                    }
                    if (vVar != null) {
                        arrayList2.add(vVar);
                    }
                }
                return uu.y0.plus((Collection) arrayList, (Iterable) arrayList2);
            case 6:
                return this.f77977c;
            case 7:
                return sv.n0.iterator((CharSequence) this.f77977c);
            case 8:
                return kotlin.jvm.internal.j.iterator((char[]) this.f77977c);
            case 9:
                return kotlin.jvm.internal.j.iterator((float[]) this.f77977c);
            case 10:
                return kotlin.jvm.internal.j.iterator((boolean[]) this.f77977c);
            case 11:
                return kotlin.jvm.internal.i.iterator((Object[]) this.f77977c);
            case 12:
                return kotlin.jvm.internal.j.iterator((double[]) this.f77977c);
            case 13:
                return ((Iterable) this.f77977c).iterator();
            case 14:
                v5.j jVar2 = (v5.j) this.f77977c;
                jVar2.getLifecycle().addObserver(new v5.a(jVar2));
                return tu.x0.f87415a;
            case 15:
                ((WorkDatabase) this.f77977c).workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
                return tu.x0.f87415a;
            case 16:
                return (List) this.f77977c;
            default:
                z5.d dVar2 = (z5.d) this.f77977c;
                String str = dVar2.f97541c;
                d.c cVar = (str == null || !dVar2.f97543f) ? new d.c(dVar2.f97540b, dVar2.f97541c, new d.b(null), dVar2.f97542e, dVar2.f97544g) : new d.c(dVar2.f97540b, new File(y5.b.getNoBackupFilesDir(dVar2.f97540b), str).getAbsolutePath(), new d.b(null), dVar2.f97542e, dVar2.f97544g);
                cVar.setWriteAheadLoggingEnabled(dVar2.f97546i);
                return cVar;
        }
    }
}
