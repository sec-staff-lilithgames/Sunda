package q7;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final Drawable getDrawableCompat(Context context, int i10) {
        Drawable drawable = l.a.getDrawable(context, i10);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(a.b.e(i10, "Invalid resource ID: ").toString());
    }

    public static final k0 getLifecycle(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof b1)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((b1) baseContext).getLifecycle();
    }

    public static final Drawable getXmlDrawableCompat(Context context, Resources resources, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return getDrawableCompat(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean isPermissionGranted(Context context, String str) {
        return m3.a.checkSelfPermission(context, str) == 0;
    }

    public static final /* synthetic */ <T> T requireSystemService(Context context) {
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        T t10 = (T) m3.a.getSystemService(context, Object.class);
        e0.checkNotNull(t10);
        return t10;
    }

    public static final Drawable getDrawableCompat(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        Drawable drawable = n3.p.getDrawable(resources, i10, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(a.b.e(i10, "Invalid resource ID: ").toString());
    }
}
