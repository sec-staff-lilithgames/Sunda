package ji;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f69591b = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final ni.d f69592a;

    public j(ni.d dVar) {
        this.f69592a = dVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                ui.a aVar = r.f69613a;
                JSONObject jSONObject = new JSONObject(string);
                arrayList.add(r.create(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion")));
            } catch (Exception e10) {
                ei.f.getLogger().w("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String d(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(((wi.c) r.f69613a).encode(list.get(i10))));
            } catch (JSONException e10) {
                ei.f.getLogger().w("Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void e(File file) {
        if (file.exists() && file.delete()) {
            ei.f.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static void f(File file, String str) {
        if (file.exists() && file.delete()) {
            ei.f.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath() + "\nReason: " + str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    public final Map c(String str, boolean z10) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e10;
        File internalKeysFileForSession = z10 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (!internalKeysFileForSession.exists() || internalKeysFileForSession.length() == 0) {
            f(internalKeysFileForSession, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(internalKeysFileForSession);
                try {
                    HashMap mapA = a(hi.j.streamToString(fileInputStream));
                    hi.j.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e11) {
                    e10 = e11;
                    ei.f.getLogger().w("Error deserializing user metadata.", e10);
                    e(internalKeysFileForSession);
                    hi.j.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th3) {
                th2 = th3;
                hi.j.closeOrLog(, "Failed to close user metadata file.");
                throw th2;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th4) {
            ?? r12 = 0;
            th2 = th4;
            hi.j.closeOrLog(r12, "Failed to close user metadata file.");
            throw th2;
        }
    }

    public File getInternalKeysFileForSession(String str) {
        return this.f69592a.getSessionFile(str, "internal-keys");
    }

    public File getKeysFileForSession(String str) {
        return this.f69592a.getSessionFile(str, "keys");
    }

    public File getRolloutsStateForSession(String str) {
        return this.f69592a.getSessionFile(str, "rollouts-state");
    }

    public File getUserDataFileForSession(String str) {
        return this.f69592a.getSessionFile(str, "user-data");
    }

    public Map<String, String> readKeyData(String str) {
        return c(str, false);
    }

    public List<r> readRolloutsState(String str) throws Throwable {
        FileInputStream fileInputStream;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            f(rolloutsStateForSession, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(rolloutsStateForSession);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ArrayList arrayListB = b(hi.j.streamToString(fileInputStream));
            ei.f.getLogger().d("Loaded rollouts state:\n" + arrayListB + "\nfor session " + str);
            hi.j.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
            return arrayListB;
        } catch (Exception e11) {
            e = e11;
            fileInputStream2 = fileInputStream;
            ei.f.getLogger().w("Error deserializing rollouts state.", e);
            e(rolloutsStateForSession);
            hi.j.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.EMPTY_LIST;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            hi.j.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public String readUserId(String str) throws Throwable {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        Closeable closeable = null;
        if (userDataFileForSession.exists()) {
            ?? r32 = (userDataFileForSession.length() > 0L ? 1 : (userDataFileForSession.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(userDataFileForSession);
                        try {
                            JSONObject jSONObject = new JSONObject(hi.j.streamToString(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            ei.f.getLogger().d("Loaded userId " + strOptString + " for session " + str);
                            hi.j.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e10) {
                            e = e10;
                            ei.f.getLogger().w("Error deserializing user metadata.", e);
                            e(userDataFileForSession);
                            hi.j.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        hi.j.closeOrLog(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r32;
            }
        }
        ei.f.getLogger().d("No userId set for session " + str);
        e(userDataFileForSession);
        return null;
    }

    public void writeKeyData(String str, Map<String, String> map) {
        writeKeyData(str, map, false);
    }

    public void writeRolloutState(String str, List<r> list) {
        BufferedWriter bufferedWriter;
        Throwable th2;
        Exception e10;
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (list.isEmpty()) {
            f(rolloutsStateForSession, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            String strD = d(list);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), f69591b));
            try {
                try {
                    bufferedWriter.write(strD);
                    bufferedWriter.flush();
                    hi.j.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e11) {
                    e10 = e11;
                    ei.f.getLogger().w("Error serializing rollouts state.", e10);
                    e(rolloutsStateForSession);
                    hi.j.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th3) {
                th2 = th3;
                hi.j.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                throw th2;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th4) {
            bufferedWriter = null;
            th2 = th4;
            hi.j.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    public void writeUserData(String str, String str2) {
        String string;
        BufferedWriter bufferedWriter;
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                i iVar = new i();
                iVar.put("userId", str2);
                string = iVar.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), f69591b));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            hi.j.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            ei.f.getLogger().w("Error serializing user metadata.", e);
            hi.j.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            hi.j.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z10) {
        String string;
        BufferedWriter bufferedWriter;
        File internalKeysFileForSession = z10 ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                string = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), f69591b));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            hi.j.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e11) {
            e = e11;
            bufferedWriter2 = bufferedWriter;
            ei.f.getLogger().w("Error serializing key/value metadata.", e);
            e(internalKeysFileForSession);
            hi.j.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            hi.j.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }
}
