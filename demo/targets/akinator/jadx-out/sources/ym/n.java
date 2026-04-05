package ym;

import android.text.TextUtils;
import com.ironsource.C3434s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends u {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f94672e = {C3434s.f38306g, "type", "width", "height", "codec", "id", "bitrate", "minBitrate", "maxBitrate", "scalable", "maintainAspectRatio", "apiFramework"};

    public String getApiFramework() {
        return a("apiFramework");
    }

    public int getHeight() {
        return e("height");
    }

    @Override // ym.u
    public String[] getSupportedAttributes() {
        return f94672e;
    }

    public String getType() {
        return a("type");
    }

    public int getWidth() {
        return e("width");
    }

    @Override // ym.u
    public boolean isTextSupported() {
        return true;
    }

    @Override // ym.u
    public boolean isValidTag() {
        return (TextUtils.isEmpty(a("type")) || TextUtils.isEmpty(a("width")) || TextUtils.isEmpty(a("height")) || TextUtils.isEmpty(getText())) ? false : true;
    }
}
