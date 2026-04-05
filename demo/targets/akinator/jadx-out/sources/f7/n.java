package f7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import c7.t;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import pw.h0;
import q7.p;
import sv.j0;
import sv.n0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f55483a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.o f55484b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements h {
        @Override // f7.h
        public i create(Uri uri, l7.o oVar, a7.m mVar) {
            if (e0.areEqual(uri.getScheme(), "android.resource")) {
                return new n(uri, oVar);
            }
            return null;
        }
    }

    static {
        new a(null);
    }

    public n(Uri uri, l7.o oVar) {
        this.f55483a = uri;
        this.f55484b = oVar;
    }

    @Override // f7.i
    public Object fetch(zu.d<? super g> dVar) throws Resources.NotFoundException {
        Integer intOrNull;
        Uri uri = this.f55483a;
        String authority = uri.getAuthority();
        if (authority != null) {
            if (n0.isBlank(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) y0.lastOrNull((List) uri.getPathSegments());
                if (str == null || (intOrNull = j0.toIntOrNull(str)) == null) {
                    throw new IllegalStateException(o2.p("Invalid android.resource URI: ", uri));
                }
                int iIntValue = intOrNull.intValue();
                l7.o oVar = this.f55484b;
                Context context = oVar.getContext();
                Resources resources = e0.areEqual(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String mimeTypeFromUrl = q7.n.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), charSequence.subSequence(n0.lastIndexOf$default(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                boolean zAreEqual = e0.areEqual(mimeTypeFromUrl, "text/xml");
                c7.f fVar = c7.f.f11835e;
                if (!zAreEqual) {
                    TypedValue typedValue2 = new TypedValue();
                    return new o(t.create(h0.buffer(h0.source(resources.openRawResource(iIntValue, typedValue2))), context, new c7.u(authority, iIntValue, typedValue2.density)), mimeTypeFromUrl, fVar);
                }
                Drawable drawableCompat = e0.areEqual(authority, context.getPackageName()) ? q7.d.getDrawableCompat(context, iIntValue) : q7.d.getXmlDrawableCompat(context, resources, iIntValue);
                boolean zIsVector = q7.n.isVector(drawableCompat);
                if (zIsVector) {
                    drawableCompat = new BitmapDrawable(context.getResources(), p.f82549a.convertToBitmap(drawableCompat, oVar.getConfig(), oVar.getSize(), oVar.getScale(), oVar.getAllowInexactSize()));
                }
                return new f(drawableCompat, zIsVector, fVar);
            }
        }
        throw new IllegalStateException(o2.p("Invalid android.resource URI: ", uri));
    }
}
