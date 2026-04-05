package l6;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends i {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f72477d;

    public r0() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f72477d = Pattern.compile("\\A\\d+");
    }

    @Override // l6.j
    public boolean isSupportedByWebView() {
        boolean zIsSupportedByWebView = super.isSupportedByWebView();
        if (!zIsSupportedByWebView || Build.VERSION.SDK_INT >= 29) {
            return zIsSupportedByWebView;
        }
        PackageInfo currentLoadedWebViewPackage = k6.v.getCurrentLoadedWebViewPackage();
        if (currentLoadedWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.f72477d.matcher(currentLoadedWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentLoadedWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
