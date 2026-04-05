package u3;

import android.net.Uri;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f87817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87819c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87820d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87821e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87822f;

    @Deprecated
    public o(Uri uri, int i10, int i11, boolean z10, int i12) {
        this(uri, i10, i11, z10, null, i12);
    }

    public int getResultCode() {
        return this.f87822f;
    }

    public String getSystemFont() {
        if (isSystemFont()) {
            return this.f87817a.getAuthority();
        }
        return null;
    }

    public int getTtcIndex() {
        return this.f87818b;
    }

    public Uri getUri() {
        return this.f87817a;
    }

    public String getVariationSettings() {
        return this.f87821e;
    }

    public int getWeight() {
        return this.f87819c;
    }

    public boolean isItalic() {
        return this.f87820d;
    }

    public boolean isSystemFont() {
        return Objects.equals(this.f87817a.getScheme(), "systemfont");
    }

    public o(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
        this.f87817a = (Uri) w3.i.checkNotNull(uri);
        this.f87818b = i10;
        this.f87819c = i11;
        this.f87820d = z10;
        this.f87821e = str;
        this.f87822f = i12;
    }

    public o(String str, String str2) {
        this.f87817a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f87818b = 0;
        this.f87819c = 400;
        this.f87820d = false;
        this.f87821e = str2;
        this.f87822f = 0;
    }
}
