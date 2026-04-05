package dq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import br.a1;
import br.b1;
import br.c1;
import br.d2;
import br.e1;
import br.h1;
import br.i1;
import br.n1;
import br.o1;
import br.r0;
import br.s1;
import br.u1;
import br.w0;
import br.w1;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f52521a;

    /* renamed from: b, reason: collision with root package name */
    public final vq.b f52522b;

    /* renamed from: c, reason: collision with root package name */
    public final br.p f52523c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f52524d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements vq.a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f52525a;

        /* renamed from: b, reason: collision with root package name */
        public final u1 f52526b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f52527c;

        /* renamed from: d, reason: collision with root package name */
        public final br.t f52528d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakReference f52529e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q0 f52530f;

        public a(q0 q0Var, View view, boolean z10, u1 u1Var, Integer num, br.t tVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
            this.f52530f = q0Var;
            this.f52525a = z10;
            this.f52526b = u1Var;
            this.f52527c = num;
            this.f52528d = tVar;
            this.f52529e = new WeakReference(view);
        }

        @Override // vq.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap successType) {
            kotlin.jvm.internal.e0.checkNotNullParameter(successType, "successType");
            q0 q0Var = this.f52530f;
            try {
                View view = (View) this.f52529e.get();
                if (view == null) {
                    return;
                }
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(view, "weakView.get() ?: return");
                q0Var.a(view, this.f52525a, successType, this.f52526b, this.f52527c, this.f52528d);
            } catch (Throwable unused) {
            }
        }

        @Override // vq.a
        public void onError(br.h0 error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        }
    }

    public q0(Context context, vq.b repository, br.p background) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(repository, "repository");
        kotlin.jvm.internal.e0.checkNotNullParameter(background, "background");
        this.f52521a = context;
        this.f52522b = repository;
        this.f52523c = background;
        this.f52524d = new AtomicBoolean(false);
    }

    public static /* synthetic */ void a(q0 q0Var, View view, Integer num, br.t tVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            tVar = null;
        }
        q0Var.a(view, num, tVar);
    }

    public final void a(View view, Integer num, br.t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        br.p pVar = this.f52523c;
        n1 placeholder = pVar.getPlaceholder();
        if (placeholder != null) {
            try {
                o1 source = placeholder.getSource();
                if (source instanceof h1) {
                    a(this, view, false, v.f52535a.c(((h1) source).getName()), null, num, tVar, 8, null);
                } else if (source instanceof br.e0) {
                    a(view, false, ((br.e0) source).getColor(), num, tVar);
                } else if (source instanceof c1) {
                    a(view, false, ((c1) source).getImage(), num, tVar);
                }
            } catch (Throwable unused) {
            }
        }
        br.q source2 = pVar.getSource();
        if (source2 != null) {
            try {
                if (source2 instanceof br.d0) {
                    a(view, true, ((br.d0) source2).getColor(), num, tVar);
                } else if (source2 instanceof b1) {
                    a(view, true, ((b1) source2).getImage(), num, tVar);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void a(View view, boolean z10, br.c0 color, Integer num, br.t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(color, "color");
        br.f0 source = color.getSource();
        if (source instanceof i1) {
            a(view, z10, ((i1) source).getColor(), num, tVar);
        } else if (source instanceof r0) {
            a(view, z10, ((r0) source).getGradient(), num, tVar);
        }
    }

    public final void a(View view, boolean z10, int i10, Integer num, br.t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        w wVar = new w();
        wVar.b(i10);
        if (num != null) {
            wVar.a(num.intValue());
        }
        if (tVar != null) {
            w.a(wVar, tVar.getStrokeWidthPx(), tVar.getStrokeColor(), 0.0f, 0.0f, 12, null);
            int strokeWidthPx = tVar.getStrokeWidthPx();
            int strokeWidthPx2 = tVar.getStrokeWidthPx();
            Context context = this.f52521a;
            view.setPadding(strokeWidthPx, strokeWidthPx2 - ir.s.dpToPx(context, 2.0f), tVar.getStrokeWidthPx(), ir.s.dpToPx(context, 2.0f) + tVar.getStrokeWidthPx());
        }
        a(view, z10, wVar);
    }

    public final void a(View view, boolean z10, br.q0 gradient, Integer num, br.t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(gradient, "gradient");
        int drawableGradientType = gradient.getType().toDrawableGradientType();
        w wVar = new w(gradient.getDirection().toDrawableGradientOrientation(), y0.toIntArray(gradient.getColors()));
        wVar.c(drawableGradientType);
        if (gradient.getType() == w0.Radial) {
            w.a(wVar, 0.0f, 2, 1, null);
        }
        if (num != null) {
            wVar.a(num.intValue());
        }
        if (tVar != null) {
            w.a(wVar, tVar.getStrokeWidthPx(), tVar.getStrokeColor(), 0.0f, 0.0f, 12, null);
            int strokeWidthPx = tVar.getStrokeWidthPx();
            int strokeWidthPx2 = tVar.getStrokeWidthPx();
            Context context = this.f52521a;
            view.setPadding(strokeWidthPx, strokeWidthPx2 - ir.s.dpToPx(context, 2.0f), tVar.getStrokeWidthPx(), ir.s.dpToPx(context, 2.0f) + tVar.getStrokeWidthPx());
        }
        a(view, z10, wVar);
    }

    public final void a(View view, boolean z10, a1 a1Var, Integer num, br.t tVar) {
        e1 e1VarFromUrl;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(a1Var, PcrIk.DHAWXoLdbKyZxO);
        s1 source = a1Var.getResource().getSource();
        if (source instanceof br.s) {
            a(view, z10, v.b(((br.s) source).getBase64()), a1Var.getScaleType(), num, tVar);
        } else {
            if (!(source instanceof d2) || (e1VarFromUrl = e1.f9819b.fromUrl(((d2) source).getUrl())) == null) {
                return;
            }
            this.f52522b.b(e1VarFromUrl, new a(this, view, z10, a1Var.getScaleType(), num, tVar));
        }
    }

    public static /* synthetic */ void a(q0 q0Var, View view, boolean z10, Bitmap bitmap, u1 u1Var, Integer num, br.t tVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            u1Var = null;
        }
        if ((i10 & 16) != 0) {
            num = null;
        }
        if ((i10 & 32) != 0) {
            tVar = null;
        }
        q0Var.a(view, z10, bitmap, u1Var, num, tVar);
    }

    public final void a(View view, boolean z10, Bitmap bitmap, u1 u1Var, Integer num, br.t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (bitmap == null) {
            return;
        }
        ImageView.ScaleType imageViewScaleType = w1.toImageViewScaleType(u1Var);
        i0 i0Var = new i0(bitmap);
        i0Var.a(imageViewScaleType);
        if (num != null && num.intValue() > 0) {
            i0Var.b(num.intValue());
        }
        if (tVar != null) {
            i0Var.a(tVar.getStrokeWidthPx());
            i0Var.a(tVar.getStrokeColor());
            int strokeWidthPx = tVar.getStrokeWidthPx();
            int strokeWidthPx2 = tVar.getStrokeWidthPx();
            Context context = this.f52521a;
            view.setPadding(strokeWidthPx, strokeWidthPx2 - ir.s.dpToPx(context, 2.0f), tVar.getStrokeWidthPx(), ir.s.dpToPx(context, 2.0f) + tVar.getStrokeWidthPx());
        }
        a(view, z10, i0Var);
    }

    public final void a(View view, boolean z10, Drawable drawable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(drawable, "drawable");
        if (this.f52524d.compareAndSet(false, z10)) {
            drawable.setAlpha((int) ir.s.fromRatio(Float.valueOf(this.f52523c.getOpacity()), 255.0f));
            drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
            view.setBackground(drawable);
        }
    }
}
