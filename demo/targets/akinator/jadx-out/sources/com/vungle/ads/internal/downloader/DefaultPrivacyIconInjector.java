package com.vungle.ads.internal.downloader;

import android.util.Base64;
import com.vungle.ads.internal.Constants;
import gv.d;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.e0;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DefaultPrivacyIconInjector {
    public static final DefaultPrivacyIconInjector INSTANCE = new DefaultPrivacyIconInjector();

    private DefaultPrivacyIconInjector() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            byte[] bArrDecode = Base64.decode(Constants.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrDecode);
                d.closeFinally(fileOutputStream, null);
                objM7131constructorimpl = z.m7131constructorimpl(Boolean.TRUE);
            } finally {
            }
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = bool;
        }
        return ((Boolean) objM7131constructorimpl).booleanValue();
    }

    public final File injectPrivacyIcon(File dir) {
        e0.checkNotNullParameter(dir, "dir");
        File file = new File(dir, Constants.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }
}
