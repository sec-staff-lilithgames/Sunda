package s4;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {
    public ProviderInfo getProviderInfo(ResolveInfo resolveInfo) {
        throw new IllegalStateException("Unable to get provider info prior to API 19");
    }

    public Signature[] getSigningSignatures(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public List<ResolveInfo> queryIntentContentProviders(PackageManager packageManager, Intent intent, int i10) {
        return Collections.EMPTY_LIST;
    }
}
