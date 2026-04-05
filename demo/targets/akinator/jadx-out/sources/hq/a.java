package hq;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import br.d2;
import br.e1;
import br.h0;
import br.r1;
import br.s;
import br.s1;
import dq.d0;
import eq.c;
import kotlin.jvm.internal.e0;
import vq.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends eq.a {

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f59142s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: hq.a$a, reason: collision with other inner class name */
    public final class C0579a implements vq.a {
        public C0579a() {
        }

        @Override // vq.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap bitmap) {
            e0.checkNotNullParameter(bitmap, "bitmap");
            a.this.f59142s.setImageBitmap(bitmap);
        }

        @Override // vq.a
        public void onError(h0 error) {
            e0.checkNotNullParameter(error, "error");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, b repository, br.a adElementParams, c adFormListener, tq.b eventCallback, rq.a aVar) {
        super(context, repository, adElementParams, adFormListener, eventCallback, aVar);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(repository, "repository");
        e0.checkNotNullParameter(adElementParams, "adElementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        this.f59142s = new ImageView(context);
    }

    @Override // eq.a, dq.h
    public /* bridge */ /* synthetic */ void a(ViewGroup viewGroup) {
        super.a(viewGroup);
    }

    @Override // eq.a, dq.h
    public void c() {
        e1.a aVar = e1.f9819b;
        u(aVar.fromDefaultSettings(h().getPlaceholder()));
        this.f54991g.b(this);
        r1 resource = h().getResource();
        s1 source = resource != null ? resource.getSource() : null;
        if (source == null) {
            u(aVar.from(h().getSource()));
            return;
        }
        if (source instanceof s) {
            u(aVar.fromBase64(((s) source).getBase64()));
            return;
        }
        if (source instanceof d2) {
            u(aVar.fromUrl(((d2) source).getUrl()));
            return;
        }
        String message = "Invalid resource type (" + source.getClass().getSimpleName() + "), it should be Base64ResourceSource or UrlResourceSource";
        e0.checkNotNullParameter(message, "message");
        d0.a(p(), message, new Object[0]);
    }

    public final void u(e1 e1Var) {
        if (e1Var != null) {
            this.f54989e.b(e1Var, new C0579a());
        }
    }

    @Override // eq.a
    public View v() {
        return this.f59142s;
    }
}
