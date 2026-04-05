package vq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import br.c2;
import br.e1;
import br.h0;
import br.r;
import cr.f;
import dq.q;
import ir.s;
import j1.o2;
import java.io.File;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements vq.b {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f89560a;

    /* renamed from: b, reason: collision with root package name */
    public final q f89561b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f89562c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f.c {

        /* renamed from: c, reason: collision with root package name */
        public final BitmapFactory.Options f89563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, File file, BitmapFactory.Options options) {
            super(context, file);
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(file, "file");
            e0.checkNotNullParameter(options, "options");
            this.f89563c = options;
        }

        @Override // cr.f.c, cr.k
        public Bitmap transform(File file) {
            e0.checkNotNullParameter(file, "file");
            return ir.e.decodeFileToBitmapSafely(file, this.f89563c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b implements cr.h {

        /* renamed from: a, reason: collision with root package name */
        public final vq.a f89564a;

        /* renamed from: b, reason: collision with root package name */
        public final CoroutineScope f89565b;

        /* renamed from: c, reason: collision with root package name */
        public final q f89566c;

        public b(vq.a resultCallback, CoroutineScope coroutineScope, q coroutineDispatchers) {
            e0.checkNotNullParameter(resultCallback, "resultCallback");
            e0.checkNotNullParameter(coroutineScope, "coroutineScope");
            e0.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
            this.f89564a = resultCallback;
            this.f89565b = coroutineScope;
            this.f89566c = coroutineDispatchers;
        }

        public abstract h0 a();

        @Override // cr.h
        public void onError(h0 error) {
            e0.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(this.f89565b, this.f89566c.d(), null, new d(this, error, null), 2, null);
        }

        @Override // cr.h
        public void onSuccess(Object obj) {
            if (obj == null) {
                onError(a());
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(this.f89565b, this.f89566c.d(), null, new e(this, obj, null), 2, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: vq.c$c, reason: collision with other inner class name */
    public static final class C0802c extends f.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0802c(Context context, File file) {
            super(context, file);
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(file, "file");
        }

        @Override // cr.f.c, cr.k
        public Uri transform(File file) {
            e0.checkNotNullParameter(file, "file");
            if (cr.e.isEmpty(file)) {
                return null;
            }
            return cr.e.toUri(file);
        }
    }

    public c(Context context, CoroutineScope coroutineScope, q coroutineDispatchers) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(coroutineScope, "coroutineScope");
        e0.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f89560a = coroutineScope;
        this.f89561b = coroutineDispatchers;
        this.f89562c = context.getApplicationContext();
    }

    @Override // vq.b
    public void b(e1 mediaSource, vq.a resultCallback) {
        e0.checkNotNullParameter(mediaSource, "mediaSource");
        e0.checkNotNullParameter(resultCallback, "resultCallback");
        BuildersKt__Builders_commonKt.launch$default(this.f89560a, null, null, new i(mediaSource, resultCallback, this, null), 3, null);
    }

    @Override // vq.b
    public void c(e1 mediaSource, vq.a resultCallback) {
        e0.checkNotNullParameter(mediaSource, "mediaSource");
        e0.checkNotNullParameter(resultCallback, "resultCallback");
        BuildersKt__Builders_commonKt.launch$default(this.f89560a, null, null, new m(mediaSource, resultCallback, this, null), 3, null);
    }

    public final Object b(String str, vq.a aVar, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f89561b.c(), new o(this, str, aVar, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final Object c(e1 e1Var, vq.a aVar, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f89561b.c(), new n(e1Var, aVar, this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final Object a(e1 e1Var, vq.a aVar, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f89561b.c(), new j(e1Var, aVar, this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final Uri b(String url) {
        e0.checkNotNullParameter(url, "url");
        try {
            return ir.q.getValidUri(url);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Object c(vq.a aVar, Object obj, zu.d dVar) {
        Object objWithContext = BuildersKt.withContext(this.f89561b.d(), new h(aVar, obj, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final Object a(c2 c2Var, BitmapFactory.Options options, vq.a aVar, zu.d<? super x0> dVar) {
        String url = c2Var.getUrl();
        File fileA = a(url);
        x0 x0Var = x0.f87415a;
        if (fileA == null) {
            Object objB = b(aVar, new h0(o2.f(')', "Can't create file for image by url (", url)), dVar);
            return objB == av.e.getCOROUTINE_SUSPENDED() ? objB : x0Var;
        }
        Context applicationContext = this.f89562c;
        e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
        f.c cVarA = a(applicationContext, fileA, options);
        Bitmap bitmap = (Bitmap) cVarA.transform(fileA);
        if (bitmap != null) {
            Object objC = c(aVar, bitmap, dVar);
            return objC == av.e.getCOROUTINE_SUSPENDED() ? objC : x0Var;
        }
        a(url, cVarA, aVar, new h0(o2.f(')', "Failed to load image from url (", url)));
        return x0Var;
    }

    public final Object b(e1 e1Var, vq.a aVar, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.f89561b.c(), new l(e1Var, aVar, this, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final Object b(vq.a aVar, h0 h0Var, zu.d dVar) {
        Object objWithContext = BuildersKt.withContext(this.f89561b.d(), new g(aVar, h0Var, null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public final Object a(r rVar, BitmapFactory.Options options, vq.a aVar, zu.d<? super x0> dVar) {
        Bitmap bitmapA = a(rVar.getBase64(), options);
        x0 x0Var = x0.f87415a;
        if (bitmapA != null) {
            Object objC = c(aVar, bitmapA, dVar);
            return objC == av.e.getCOROUTINE_SUSPENDED() ? objC : x0Var;
        }
        Object objB = b(aVar, new h0("Can't decode image from base64"), dVar);
        return objB == av.e.getCOROUTINE_SUSPENDED() ? objB : x0Var;
    }

    public final Bitmap a(String base64, BitmapFactory.Options options) {
        e0.checkNotNullParameter(base64, "base64");
        e0.checkNotNullParameter(options, "options");
        byte[] bArrDecodeBase64$default = s.decodeBase64$default(base64, 0, 1, (Object) null);
        if (bArrDecodeBase64$default != null) {
            return ir.e.decodeBytesToBitmapSafely(bArrDecodeBase64$default, options);
        }
        return null;
    }

    public final Object a(c2 c2Var, vq.a aVar, zu.d<? super x0> dVar) {
        Object objB;
        String url = c2Var.getUrl();
        int i10 = f.f89571a[c2Var.getDeliveryType().ordinal()];
        x0 x0Var = x0.f87415a;
        if (i10 != 1) {
            return (i10 == 2 && (objB = b(url, aVar, dVar)) == av.e.getCOROUTINE_SUSPENDED()) ? objB : x0Var;
        }
        Object objA = a(url, aVar, dVar);
        return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : x0Var;
    }

    public final Object a(String str, vq.a aVar, zu.d<? super x0> dVar) {
        File fileA = a(str);
        x0 x0Var = x0.f87415a;
        if (fileA == null) {
            Object objB = b(aVar, new h0(o2.f(')', "Can't create file for video by url (", str)), dVar);
            return objB == av.e.getCOROUTINE_SUSPENDED() ? objB : x0Var;
        }
        Context applicationContext = this.f89562c;
        e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
        f.c cVarA = a(applicationContext, fileA);
        Uri uri = (Uri) cVarA.transform(fileA);
        if (uri != null) {
            Object objC = c(aVar, uri, dVar);
            return objC == av.e.getCOROUTINE_SUSPENDED() ? objC : x0Var;
        }
        a(str, cVarA, aVar, new h0("Uri is null"));
        return x0Var;
    }

    @Override // vq.b
    public void a(e1 mediaSource, vq.a resultCallback) {
        e0.checkNotNullParameter(mediaSource, "mediaSource");
        e0.checkNotNullParameter(resultCallback, "resultCallback");
        BuildersKt__Builders_commonKt.launch$default(this.f89560a, null, null, new k(mediaSource, resultCallback, this, null), 3, null);
    }

    public final f.c a(Context context, File file, BitmapFactory.Options options) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(file, "file");
        e0.checkNotNullParameter(options, "options");
        return new a(context, file, options);
    }

    public final f.c a(Context context, File file) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(file, "file");
        return new C0802c(context, file);
    }

    public final File a(String url) {
        e0.checkNotNullParameter(url, "url");
        return cr.e.getFileByUrl(this.f89562c, url);
    }

    public final <T> void a(String url, cr.j processor, vq.a resultCallback, h0 error) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(processor, "processor");
        e0.checkNotNullParameter(resultCallback, "resultCallback");
        e0.checkNotNullParameter(error, "error");
        new f.a(url, cr.i.Get).setResponseTransformer(processor).setListener(new p(resultCallback, error, this.f89560a, this.f89561b)).send();
    }
}
