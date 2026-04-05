package s4;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e extends d {
    @Override // s4.c
    public Signature[] getSigningSignatures(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
