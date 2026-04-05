package com.bytedance.sdk.component.my.jd;

import android.util.Log;
import com.bytedance.sdk.component.my.my;
import com.bytedance.sdk.component.utils.yd;
import com.ironsource.C3271ic;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements com.bytedance.sdk.component.my.cm<wqx> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.my.cm
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public wqx<byte[]> jpo(my myVar) throws Throwable {
        Closeable closeable;
        InputStream inputStream;
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        Map<String, String> mapJpo = null;
        int i10 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(myVar.jpo()).openConnection();
                httpURLConnection.setRequestMethod(C3271ic.f36943a);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                byte[] bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i11 = inputStream.read(bArr);
                        if (i11 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    } catch (MalformedURLException e10) {
                        e = e10;
                        byteArray = null;
                    } catch (IOException e11) {
                        e = e11;
                        byteArray = null;
                    }
                }
                i10 = 200;
                byteArray = byteArrayOutputStream.toByteArray();
                try {
                    mapJpo = myVar.jd() ? jpo(httpURLConnection) : null;
                    yd.jpo(inputStream);
                    yd.jpo(byteArrayOutputStream);
                    message = "success";
                } catch (MalformedURLException e12) {
                    e = e12;
                    Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    yd.jpo(inputStream);
                    yd.jpo(closeable2);
                    return new wqx<>(i10, byteArray, message, mapJpo);
                } catch (IOException e13) {
                    e = e13;
                    Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                    message = e.getMessage();
                    closeable2 = byteArrayOutputStream;
                    yd.jpo(inputStream);
                    yd.jpo(closeable2);
                    return new wqx<>(i10, byteArray, message, mapJpo);
                }
            } catch (MalformedURLException e14) {
                e = e14;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                yd.jpo(inputStream);
                yd.jpo(closeable2);
                return new wqx<>(i10, byteArray, message, mapJpo);
            } catch (IOException e15) {
                e = e15;
                byteArray = null;
                byteArrayOutputStream = byteArray;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                yd.jpo(inputStream);
                yd.jpo(closeable2);
                return new wqx<>(i10, byteArray, message, mapJpo);
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                inputStream2 = inputStream;
                yd.jpo(inputStream2);
                yd.jpo(closeable);
                throw th;
            }
        } catch (MalformedURLException e16) {
            e = e16;
            inputStream = null;
            byteArray = null;
        } catch (IOException e17) {
            e = e17;
            inputStream = null;
            byteArray = null;
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            yd.jpo(inputStream2);
            yd.jpo(closeable);
            throw th;
        }
        return new wqx<>(i10, byteArray, message, mapJpo);
    }

    private Map<String, String> jpo(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }
}
