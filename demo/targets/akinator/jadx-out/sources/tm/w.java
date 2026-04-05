package tm;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f87139a = new d1();

    public n parseCalendarEvent(String str) {
        try {
            return parseCalendarEvent(Uri.parse(str));
        } catch (Exception e10) {
            t.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }

    public Uri parseStorePictureUri(String str) {
        try {
            return parseStorePictureUri(Uri.parse(str));
        } catch (Exception e10) {
            t.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }

    public n parseCalendarEvent(Uri uri) {
        try {
            String strDecode = Uri.decode(uri.getQueryParameter("eventJson"));
            this.f87139a.getClass();
            return d1.a(strDecode);
        } catch (Exception e10) {
            t.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }

    public Uri parseStorePictureUri(Uri uri) {
        try {
            return Uri.parse(Uri.decode(uri.getQueryParameter("url")));
        } catch (Exception e10) {
            t.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }
}
