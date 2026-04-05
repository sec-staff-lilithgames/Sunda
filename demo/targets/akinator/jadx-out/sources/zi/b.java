package zi;

import android.util.Base64OutputStream;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import o4.n;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f97981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f97982c;

    public /* synthetic */ b(c cVar, int i10) {
        this.f97981b = i10;
        this.f97982c = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        int i10 = this.f97981b;
        c cVar = this.f97982c;
        switch (i10) {
            case 0:
                synchronized (cVar) {
                    try {
                        j jVar = (j) cVar.f97983a.get();
                        ArrayList arrayListA = jVar.a();
                        synchronized (jVar) {
                            jVar.f97998a.editSync(new g2(jVar, 17));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i11 = 0; i11 < arrayListA.size(); i11++) {
                            k kVar = (k) arrayListA.get(i11);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", kVar.getUserAgent());
                            jSONObject.put("dates", new JSONArray((Collection) kVar.getUsedDates()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(C.UTF8_NAME));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString(C.UTF8_NAME);
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            default:
                synchronized (cVar) {
                    j jVar2 = (j) cVar.f97983a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String userAgent = ((bk.c) ((bk.j) cVar.f97985c.get())).getUserAgent();
                    synchronized (jVar2) {
                        jVar2.f97998a.editSync(new com.moloco.sdk.internal.services.init.e(2, jVar2, jVar2.b(jCurrentTimeMillis), userAgent, n.stringSetKey(userAgent)));
                    }
                }
                return null;
        }
    }
}
