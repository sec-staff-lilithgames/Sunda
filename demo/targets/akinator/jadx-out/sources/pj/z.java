package pj;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import wr.e4;
import wr.r3;
import wr.z3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f81480a;

    public z(com.google.firebase.g gVar) {
        this.f81480a = gVar;
    }

    public static String getSignature(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return ph.o.base16().upperCase().encode(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
            }
            return null;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public e4 providesApiKeyHeaders() throws PackageManager.NameNotFoundException {
        r3 r3Var = e4.f90905d;
        z3 z3VarOf = z3.of("X-Goog-Api-Key", r3Var);
        z3 z3VarOf2 = z3.of("X-Android-Package", r3Var);
        z3 z3VarOf3 = z3.of("X-Android-Cert", r3Var);
        e4 e4Var = new e4();
        com.google.firebase.g gVar = this.f81480a;
        String packageName = gVar.getApplicationContext().getPackageName();
        e4Var.put(z3VarOf, gVar.getOptions().getApiKey());
        e4Var.put(z3VarOf2, packageName);
        String signature = getSignature(gVar.getApplicationContext().getPackageManager(), packageName);
        if (signature != null) {
            e4Var.put(z3VarOf3, signature);
        }
        return e4Var;
    }

    public rk.t providesInAppMessagingSdkServingStub(wr.j jVar, e4 e4Var) {
        return rk.x.newBlockingStub(wr.t.intercept(jVar, ds.w.newAttachHeadersInterceptor(e4Var)));
    }
}
