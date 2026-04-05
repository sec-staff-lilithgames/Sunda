package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3496va;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f50486a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f50487b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f50488c = false;

    /* renamed from: d, reason: collision with root package name */
    private static String f50489d = null;

    /* renamed from: e, reason: collision with root package name */
    private static String f50490e = null;

    /* renamed from: f, reason: collision with root package name */
    private static String f50491f = null;

    /* renamed from: g, reason: collision with root package name */
    private static int f50492g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static long f50493h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static long f50494i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static volatile long f50495j = -1;

    public static void a(File file, boolean z10) throws Throwable {
        RandomAccessFile randomAccessFile;
        e eVarA;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException unused) {
                return;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException unused3) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (TextUtils.isEmpty(f50486a) && (eVarA = a(file)) != null) {
                f50486a = a(eVarA.a());
                f50489d = eVarA.b();
                if (z10) {
                    a();
                    try {
                        randomAccessFile.close();
                        return;
                    } catch (IOException unused4) {
                        return;
                    }
                }
            }
            if (TextUtils.isEmpty(f50490e)) {
                f50490e = a(randomAccessFile);
            }
            if (f50493h == 0) {
                f50493h = randomAccessFile.length() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            }
            if (f50494i == 0) {
                f50494i = b(file);
            }
            randomAccessFile.close();
        } catch (FileNotFoundException unused5) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        } catch (IOException unused6) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused7) {
                }
            }
            throw th;
        }
    }

    public static String b() throws Throwable {
        long j10;
        boolean z10;
        String string;
        String string2;
        String string3;
        String string4;
        long j11;
        long j12;
        int i10;
        String str;
        if (TextUtils.isEmpty(f50486a) || TextUtils.isEmpty(f50490e) || f50492g == -1) {
            SharedPreferences sharedPreferencesA = ax.a(z.b());
            long j13 = -1;
            if (sharedPreferencesA != null) {
                j13 = sharedPreferencesA.getLong(Q6.Z0, -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j11 = sharedPreferencesA.getLong("as", 0L);
                j12 = sharedPreferencesA.getLong(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, 0L);
                z10 = true;
                i10 = sharedPreferencesA.getInt("cpc", -1);
                j10 = 0;
                string = sharedPreferencesA.getString(C3496va.f39116c, null);
            } else {
                j10 = 0;
                z10 = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j11 = 0;
                j12 = 0;
                i10 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            str = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.b(), strC);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z10 ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j13 || string2 == null || i10 == -1) {
                f50495j = jLastModified;
                if (str2 != null) {
                    f50491f = str2;
                }
                if (num != null) {
                    f50492g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f50486a = string2;
                f50489d = string3;
                f50493h = j11;
                f50494i = j12;
                f50490e = string4;
                f50492g = i10;
                f50491f = string;
            }
        } else {
            j10 = 0;
            str = null;
            z10 = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f50486a)) {
                jSONObject.put("sign", f50486a);
            }
            if (!TextUtils.isEmpty(f50489d)) {
                jSONObject.put("subject", f50489d);
            }
            if (!TextUtils.isEmpty(f50490e)) {
                jSONObject.put("md5", f50490e);
            }
            if (!TextUtils.isEmpty(f50491f)) {
                jSONObject.put("path", f50491f);
            }
            long j14 = f50493h;
            if (j14 != j10) {
                jSONObject.put("apkSize", j14);
            }
            long j15 = f50494i;
            if (j15 != j10) {
                jSONObject.put("dexSize", j15);
            }
            int i11 = f50492g;
            if (i11 != -1) {
                jSONObject.put("code", i11);
            }
            f();
            jSONObject.put("signpm", f50487b);
            if (!TextUtils.isEmpty(f50487b) && !TextUtils.isEmpty(f50486a)) {
                if (!f50487b.equals(f50486a)) {
                    f50488c = z10;
                }
                jSONObject.put("rebud", f50488c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String c() {
        if (z.b() == null) {
            return null;
        }
        String packageCodePath = z.b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f50486a)) {
            SharedPreferences sharedPreferencesA = ax.a(z.b());
            String string = null;
            long j10 = -1;
            if (sharedPreferencesA != null) {
                j10 = sharedPreferencesA.getLong(Q6.Z0, -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j10 || string == null) {
                f50495j = jLastModified;
                a(file, true);
                a();
            } else {
                f50486a = string;
            }
        }
        f();
        if (TextUtils.isEmpty(f50487b) || TextUtils.isEmpty(f50486a) || f50487b.equals(f50486a)) {
            return;
        }
        f50488c = true;
    }

    public static String e() throws Throwable {
        d();
        return f50486a;
    }

    public static String f() {
        if (!TextUtils.isEmpty(f50487b)) {
            return f50487b;
        }
        try {
            String strA = a(z.b().getPackageManager().getPackageInfo(z.b().getPackageName(), 64).signatures[0].toByteArray());
            f50487b = strA;
            return strA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() throws Throwable {
        d();
        return f50488c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = ax.a(z.b());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f50486a)) {
                sharedPreferencesA.edit().putString("sa", f50486a).apply();
            }
            if (!TextUtils.isEmpty(f50490e)) {
                sharedPreferencesA.edit().putString("md5", f50490e).apply();
            }
            if (!TextUtils.isEmpty(f50489d)) {
                sharedPreferencesA.edit().putString("sj", f50489d).apply();
            }
            if (f50493h != 0) {
                sharedPreferencesA.edit().putLong("as", f50493h).apply();
            }
            if (f50494i != 0) {
                sharedPreferencesA.edit().putLong(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, f50494i).apply();
            }
            if (f50495j != -1) {
                sharedPreferencesA.edit().putLong(Q6.Z0, f50495j).apply();
            }
            if (f50492g != -1) {
                sharedPreferencesA.edit().putInt("cpc", f50492g).apply();
            }
            if (TextUtils.isEmpty(f50491f)) {
                return;
            }
            sharedPreferencesA.edit().putString(C3496va.f39116c, f50491f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1, 3).toUpperCase());
                sb2.append(":");
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    @com.pgl.ssdk.ces.out.DungeonFlag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.pgl.ssdk.e a(java.io.File r6) throws java.lang.Throwable {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L25
            java.lang.String r2 = "r"
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L1e com.pgl.ssdk.g.a -> L25
            long r2 = r1.length()     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            r4 = 0
            com.pgl.ssdk.q r2 = com.pgl.ssdk.r.a(r1, r4, r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            com.pgl.ssdk.c$a r3 = com.pgl.ssdk.c.a(r2)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            java.util.List r2 = com.pgl.ssdk.l.a(r2, r3)     // Catch: java.lang.Throwable -> L1f com.pgl.ssdk.g.a -> L26
            r1.close()     // Catch: java.io.IOException -> L2c
            goto L2c
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L2b
        L25:
            r1 = r0
        L26:
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.io.IOException -> L2b
        L2b:
            r2 = r0
        L2c:
            if (r2 == 0) goto L34
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L38
        L34:
            java.util.List r2 = com.pgl.ssdk.k.a(r6)
        L38:
            if (r2 == 0) goto L48
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L48
            r6 = 0
            java.lang.Object r6 = r2.get(r6)
            com.pgl.ssdk.e r6 = (com.pgl.ssdk.e) r6
            return r6
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.v.a(java.io.File):com.pgl.ssdk.e");
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i10 = 0;
                int size = 0;
                while (true) {
                    if (i10 == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i10));
                    }
                    ZipEntry entry = zipFile2.getEntry(str);
                    if (entry == null) {
                        break;
                    }
                    try {
                        size = (int) (size + entry.getSize());
                        i10++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th2) {
                        th = th2;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j10 = size / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j10;
            } catch (IOException unused5) {
                return 0L;
            }
        } catch (ZipException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES];
            while (true) {
                int i10 = randomAccessFile.read(bArr);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = KerkSviMAy.gBOd.concat(string);
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
