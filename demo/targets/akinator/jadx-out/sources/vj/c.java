package vj;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f89294c = {"*", RnJusJ.czXTkG, CodePackage.GCM, ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f89295a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89296b;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(com.google.firebase.g r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f89295a = r0
            com.google.firebase.k r0 = r4.getOptions()
            java.lang.String r0 = r0.getGcmSenderId()
            if (r0 == 0) goto L1b
            goto L4b
        L1b:
            com.google.firebase.k r4 = r4.getOptions()
            java.lang.String r0 = r4.getApplicationId()
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L34
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L34
            goto L4b
        L34:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L41
        L3f:
            r0 = r2
            goto L4b
        L41:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4b
            goto L3f
        L4b:
            r3.f89296b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vj.c.<init>(com.google.firebase.g):void");
    }

    public final String a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f89295a) {
            String strEncodeToString = null;
            String string = this.f89295a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }

    public String readIid() {
        String string;
        synchronized (this.f89295a) {
            try {
                synchronized (this.f89295a) {
                    string = this.f89295a.getString("|S|id", null);
                }
                if (string != null) {
                    return string;
                }
                return a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String readToken() {
        synchronized (this.f89295a) {
            try {
                String[] strArr = f89294c;
                int i10 = 0;
                while (true) {
                    String string = null;
                    if (i10 >= 4) {
                        return null;
                    }
                    String str = strArr[i10];
                    String string2 = this.f89295a.getString("|T|" + this.f89296b + "|" + str, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
                            } catch (JSONException unused) {
                            }
                            string2 = string;
                        }
                        return string2;
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c(SharedPreferences sharedPreferences, String str) {
        this.f89295a = sharedPreferences;
        this.f89296b = str;
    }
}
