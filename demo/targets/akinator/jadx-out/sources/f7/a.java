package f7;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import c7.t;
import pw.h0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f55450a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.o f55451b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: f7.a$a, reason: collision with other inner class name */
    public static final class C0561a implements h {
        @Override // f7.h
        public i create(Uri uri, l7.o oVar, a7.m mVar) {
            if (q7.n.isAssetUri(uri)) {
                return new a(uri, oVar);
            }
            return null;
        }
    }

    public a(Uri uri, l7.o oVar) {
        this.f55450a = uri;
        this.f55451b = oVar;
    }

    @Override // f7.i
    public Object fetch(zu.d<? super g> dVar) {
        String strJoinToString$default = y0.joinToString$default(y0.drop(this.f55450a.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        l7.o oVar = this.f55451b;
        return new o(t.create(h0.buffer(h0.source(oVar.getContext().getAssets().open(strJoinToString$default))), oVar.getContext(), new c7.a(strJoinToString$default)), q7.n.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), strJoinToString$default), c7.f.f11835e);
    }
}
