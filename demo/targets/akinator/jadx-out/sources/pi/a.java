package pi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f81377a;

    public a(ni.d dVar) {
        this.f81377a = dVar.getCommonFile("com.crashlytics.settings.json");
    }

    public JSONObject readCachedSettings() throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        ei.f.getLogger().d("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = this.f81377a;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(hi.j.streamToString(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        ei.f.getLogger().e("Failed to fetch cached settings", e);
                        hi.j.closeOrLog(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    ei.f.getLogger().v("Settings file does not exist.");
                    jSONObject = null;
                }
                hi.j.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th3) {
                th2 = th3;
                hi.j.closeOrLog(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            hi.j.closeOrLog(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    public void writeCachedSettings(long j10, JSONObject jSONObject) throws Throwable {
        FileWriter fileWriter;
        ei.f.getLogger().v("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put("expires_at", j10);
                    fileWriter = new FileWriter(this.f81377a);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                hi.j.closeOrLog(fileWriter, "Failed to close settings writer.");
            } catch (Exception e11) {
                e = e11;
                fileWriter2 = fileWriter;
                ei.f.getLogger().e("Failed to cache settings", e);
                hi.j.closeOrLog(fileWriter2, "Failed to close settings writer.");
            } catch (Throwable th3) {
                th = th3;
                fileWriter2 = fileWriter;
                hi.j.closeOrLog(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
    }
}
