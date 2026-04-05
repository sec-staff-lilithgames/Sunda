package f7;

import android.webkit.MimeTypeMap;
import c7.t;
import gv.s;
import java.io.File;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final File f55463a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements h {
        @Override // f7.h
        public i create(File file, l7.o oVar, a7.m mVar) {
            return new j(file);
        }
    }

    public j(File file) {
        this.f55463a = file;
    }

    @Override // f7.i
    public Object fetch(zu.d<? super g> dVar) {
        n0.a aVar = n0.f81931c;
        File file = this.f55463a;
        return new o(t.create$default(n0.a.get$default(aVar, file, false, 1, (Object) null), null, null, null, 14, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.getExtension(file)), c7.f.f11835e);
    }
}
