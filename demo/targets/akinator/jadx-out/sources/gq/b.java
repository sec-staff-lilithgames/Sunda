package gq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ar.d;
import br.d2;
import br.e1;
import br.h0;
import br.r1;
import br.s1;
import br.z0;
import com.vungle.ads.internal.Constants;
import cr.q;
import j1.o2;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.n0;
import tm.g;
import tm.y;
import tu.x0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends eq.a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f58390u = 0;

    /* renamed from: s, reason: collision with root package name */
    public final d f58391s;

    /* renamed from: t, reason: collision with root package name */
    public g f58392t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements vq.a {
        public a() {
        }

        @Override // vq.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String result) {
            e0.checkNotNullParameter(result, "result");
            b.this.u(result);
        }

        @Override // vq.a
        public void onError(h0 error) {
            e0.checkNotNullParameter(error, "error");
            b.this.a(error);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: gq.b$b, reason: collision with other inner class name */
    public static final class C0575b {
        public C0575b(u uVar) {
        }
    }

    static {
        new C0575b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, vq.b repository, br.a adElementParams, eq.c adFormListener, tq.b eventCallback, rq.a aVar, d dVar) {
        super(context, repository, adElementParams, adFormListener, eventCallback, aVar);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(repository, "repository");
        e0.checkNotNullParameter(adElementParams, "adElementParams");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        this.f58391s = dVar;
    }

    public final void C() {
        q.onUiThread(new gq.a(this, 0));
    }

    public final List<String> D() {
        try {
            String customParam = h().getCustomParam("features");
            if (customParam != null && customParam.length() > 0) {
                List<String> mutableList = y0.toMutableList((Collection) n0.split$default((CharSequence) customParam, new String[]{","}, false, 0, 6, (Object) null));
                int size = mutableList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = mutableList.get(i10);
                    int length = str.length() - 1;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = e0.compare((int) str.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    mutableList.set(i10, str.subSequence(i11, length + 1).toString());
                }
                return mutableList;
            }
        } catch (Exception unused) {
        }
        return p0.emptyList();
    }

    public final String E() {
        if (!h().getCustomParams().containsKey("base_url")) {
            return "https://localhost";
        }
        String customParam = h().getCustomParam("base_url");
        if (ir.q.isUrlValid(customParam)) {
            return customParam;
        }
        return null;
    }

    public final y F() {
        String customParam = h().getCustomParam("placement_type");
        if (e0.areEqual(customParam, Constants.TEMPLATE_TYPE_FULLSCREEN)) {
            return y.f87151c;
        }
        if (e0.areEqual(customParam, "view")) {
            return y.f87150b;
        }
        return null;
    }

    public final void b(h0 error) {
        e0.checkNotNullParameter(error, "error");
        d dVar = this.f58391s;
        if (dVar != null) {
            dVar.onError(error);
        }
        this.f54991g.a(this, error);
    }

    @Override // eq.a, dq.h
    public void c() {
        r1 resource = h().getResource();
        s1 source = resource != null ? resource.getSource() : null;
        if (source == null) {
            u(h().getSource());
            return;
        }
        if (source instanceof z0) {
            u(((z0) source).getHtml());
            return;
        }
        if (!(source instanceof d2)) {
            a(new h0("Invalid resource type (" + source.getClass().getSimpleName() + "), it should be HtmlResourceSource or UrlResourceSource"));
            return;
        }
        String url = ((d2) source).getUrl();
        e1 e1VarFromUrl = e1.f9819b.fromUrl(url);
        if (e1VarFromUrl == null) {
            a(new h0(o2.f(')', "Invalid adm url (", url)));
        } else {
            this.f54989e.a(e1VarFromUrl, new a());
        }
    }

    @Override // eq.a, dq.h
    public void d() {
        q.onUiThread(new gq.a(this, 1));
    }

    @Override // eq.a, dq.h
    public void m() {
        x0 x0Var;
        g gVar = this.f58392t;
        if (gVar != null) {
            gVar.handleRedirectView();
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            super.m();
        }
    }

    @Override // eq.a
    public final void r() {
        x0 x0Var;
        d dVar = this.f58391s;
        if (dVar != null) {
            dVar.destroy(new gq.a(this, 2));
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            C();
        }
    }

    public final void u(String str) {
        String strPrepareCreativeForMeasure;
        if (str == null || str.length() == 0) {
            a(new h0("Adm is null or empty"));
            return;
        }
        d dVar = this.f58391s;
        String str2 = (dVar == null || (strPrepareCreativeForMeasure = dVar.prepareCreativeForMeasure(str)) == null) ? str : strPrepareCreativeForMeasure;
        e0.checkNotNullExpressionValue(str2, "htmlMeasurer?.prepareCre…iveForMeasure(adm) ?: adm");
        q.onUiThread(new al.a(23, this, F(), E(), str2));
    }

    @Override // eq.a
    public View v() {
        return this.f58392t;
    }

    @Override // eq.a
    public void z() {
        super.z();
        d dVar = this.f58391s;
        if (dVar != null) {
            dVar.onShown();
        }
    }

    @Override // eq.a, dq.h
    public void a(ViewGroup viewGroup) {
        e0.checkNotNullParameter(viewGroup, "viewGroup");
        q.onUiThread(new bq.c(5, this, viewGroup));
    }

    public final void a(h0 error) {
        e0.checkNotNullParameter(error, "error");
        d dVar = this.f58391s;
        if (dVar != null) {
            dVar.onError(error);
        }
        this.f54991g.c(this, error);
    }
}
