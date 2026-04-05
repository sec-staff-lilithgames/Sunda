package vj;

import com.google.firebase.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public File f89303a;

    /* renamed from: b, reason: collision with root package name */
    public final g f89304b;

    public e(g gVar) {
        this.f89304b = gVar;
    }

    public final File a() {
        if (this.f89303a == null) {
            synchronized (this) {
                try {
                    if (this.f89303a == null) {
                        this.f89303a = new File(this.f89304b.getApplicationContext().getFilesDir(), "PersistedInstallation." + this.f89304b.getPersistenceKey() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f89303a;
    }

    public void clearForTesting() {
        a().delete();
    }

    public f insertOrUpdatePersistedInstallationEntry(f fVar) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", fVar.getFirebaseInstallationId());
            jSONObject.put("Status", fVar.getRegistrationStatus().ordinal());
            jSONObject.put("AuthToken", fVar.getAuthToken());
            jSONObject.put("RefreshToken", fVar.getRefreshToken());
            jSONObject.put("TokenCreationEpochInSecs", fVar.getTokenCreationEpochInSecs());
            jSONObject.put("ExpiresInSecs", fVar.getExpiresInSecs());
            jSONObject.put("FisError", fVar.getFisError());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f89304b.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(C.UTF8_NAME));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(a())) {
            return fVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public f readPersistedInstallationEntryValue() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        return f.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(d.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONObject.optString("FisError", null)).build();
    }
}
