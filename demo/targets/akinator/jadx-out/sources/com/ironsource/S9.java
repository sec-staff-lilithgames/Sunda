package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class S9 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends GZIPOutputStream {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35446a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OutputStream outputStream, int i10) throws IOException {
            super(outputStream);
            this.f35446a = i10;
            if (i10 < 0 || i10 > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i10);
        }
    }

    public static byte[] a(String str, int i10) throws Exception {
        byte[] byteArray = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i10);
            aVar.write(str.getBytes());
            aVar.close();
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (OutOfMemoryError e10) {
            C3422r4.d().a(e10);
            String str2 = "Error while compressing:" + e10.getMessage();
            IronLog.INTERNAL.error(str2);
            b(str2);
            return byteArray;
        }
    }

    private static void b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Mb.U().q().a(new C5(D5.TROUBLESHOOTING_FAILED_TO_GZIP, jSONObject));
    }

    public static byte[] a(String str) throws Exception {
        return a(str, -1);
    }

    public static String a(byte[] bArr) throws JSONException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb2.toString();
                }
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("exception while decompressing " + e10);
            return null;
        } catch (OutOfMemoryError e11) {
            C3422r4.d().a(e11);
            String str = "Error while decompressing:" + e11.getMessage();
            IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }
}
