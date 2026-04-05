package sn;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import io.bidmachine.media3.common.util.a1;
import java.util.List;
import java.util.Map;
import ln.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class y {
    public static byte[] executePost(ln.i iVar, String str, byte[] bArr, Map<String, String> map) throws q0 {
        Map map2;
        List list;
        ln.e0 e0Var = new ln.e0(iVar);
        ln.m mVarBuild = new m.a().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i10 = 0;
        int i11 = 0;
        ln.m mVarBuild2 = mVarBuild;
        while (true) {
            try {
                ln.k kVar = new ln.k(e0Var, mVarBuild2);
                try {
                    try {
                        byte[] byteArray = ph.e0.toByteArray(kVar);
                        a1.closeQuietly(kVar);
                        return byteArray;
                    } catch (ln.x e10) {
                        int i12 = e10.f73534e;
                        String str2 = null;
                        if ((i12 == 307 || i12 == 308) && i11 < 5 && (map2 = e10.f73535f) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i10);
                        }
                        if (str2 == null) {
                            throw e10;
                        }
                        i11++;
                        mVarBuild2 = mVarBuild2.buildUpon().setUri(str2).build();
                        a1.closeQuietly(kVar);
                    }
                } catch (Throwable th2) {
                    a1.closeQuietly(kVar);
                    throw th2;
                }
            } catch (Exception e11) {
                throw new q0(mVarBuild, e0Var.getLastOpenedUri(), e0Var.getResponseHeaders(), e0Var.getBytesRead(), e11);
            }
        }
    }

    public static int getErrorCodeForMediaDrmException(Throwable th2, int i10) {
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            return a1.getErrorCodeForMediaDrmErrorCode(a1.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
        if (a1.f60679a >= 23 && x.isMediaDrmResetException(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || isFailureToConstructNotProvisionedException(th2)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof r0) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (th2 instanceof h) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (th2 instanceof o0) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }

    public static boolean isFailureToConstructNotProvisionedException(Throwable th2) {
        return a1.f60679a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(Throwable th2) {
        return a1.f60679a == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
