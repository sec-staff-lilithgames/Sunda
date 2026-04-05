package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class n {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicInteger f39729d = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f39730a;

    /* renamed from: b, reason: collision with root package name */
    private String f39731b;

    /* renamed from: c, reason: collision with root package name */
    private int f39732c = 9377;

    public n() {
        com.mbridge.msdk.setting.g gVarF = com.google.android.gms.internal.play_billing.a.f(com.mbridge.msdk.setting.h.b());
        this.f39730a = gVarF;
        if (gVarF == null) {
            this.f39730a = com.mbridge.msdk.setting.h.b().a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                String encodedQuery = uri.getEncodedQuery();
                this.f39731b = host;
                jSONObject.put("uri", DtbConstants.HTTPS + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th2) {
            p0.b("SocketSpider", th2.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z10 && !z11) {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, l0.i());
            }
            if (campaignEx != null) {
                if (z10 && campaignEx.getcUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, l0.i());
                }
                if (z11 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, l0.i());
                }
            } else {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, l0.i());
            }
            jSONObject2.put("Accept-Encoding", "gzip");
            if (this.f39730a.I0() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th3) {
            p0.b("SocketSpider", th3.getMessage());
        }
        return jSONObject;
    }

    public com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z10, boolean z11) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.f39691g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f39692h = "request url can not null.";
            return aVar;
        }
        String strReplace = str.replace(" ", "%20");
        JSONObject jSONObjectB = b(strReplace, campaignEx, z10, z11);
        if (jSONObjectB.length() == 0) {
            aVar.f39692h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(jSONObjectB.optString("uri"))) {
            aVar.f39692h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f39732c = trackingTcpPort;
        }
        if (!TextUtils.isEmpty(this.f39731b)) {
            return a(strReplace, jSONObjectB.toString());
        }
        aVar.f39692h = "request url parse error.";
        return aVar;
    }

    private com.mbridge.msdk.click.entity.a a(String str, String str2) throws IOException {
        OutputStream outputStream;
        Socket socket;
        int length;
        InputStream inputStream;
        int i10;
        boolean z10;
        boolean z11;
        byte[] bArr;
        String str3;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket2 = null;
        OutputStream outputStream2 = null;
        try {
            socket = new Socket(this.f39731b, this.f39732c);
            try {
                socket.setSoTimeout(15000);
                outputStream2 = socket.getOutputStream();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                byteBufferWrap.order(byteOrder);
                byteBufferWrap.put((byte) 2);
                byteBufferWrap.put((byte) 3);
                byteBufferWrap.putShort((short) f39729d.getAndIncrement());
                if (TextUtils.isEmpty(str2)) {
                    byteBufferWrap.putInt(0);
                    outputStream2.write(byteBufferWrap.array());
                    length = 0;
                } else {
                    byte[] bArrA = a(str2);
                    length = bArrA.length;
                    byteBufferWrap.putInt(length);
                    outputStream2.write(byteBufferWrap.array());
                    outputStream2.write(bArrA);
                }
                outputStream2.flush();
                p0.a("SocketSpider", "Socket Request : header : " + Arrays.toString(byteBufferWrap.array()) + " length : " + length);
                inputStream = socket.getInputStream();
                byte[] bArr2 = new byte[8];
                inputStream.read(bArr2, 0, 8);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
                byteBufferWrap2.order(byteOrder);
                i10 = byteBufferWrap2.getInt(4);
                byte b10 = bArr2[1];
                z10 = b10 == 3;
                z11 = b10 == 2;
                p0.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr2) + " length : " + i10 + " isGzip : " + z10);
                bArr = new byte[i10];
                new DataInputStream(socket.getInputStream()).readFully(bArr);
                if (!z10 && i10 > 2 && ((bArr[0] << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 8075) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = outputStream2;
                socket2 = socket;
                try {
                    p0.a("SocketSpider", "Socket exception: " + th.getMessage());
                    aVar.f39692h = th.getMessage();
                    if (socket2 != null) {
                        try {
                            socket2.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (Exception e10) {
                            p0.b("SocketSpider", e10.getMessage());
                        }
                    }
                    return aVar;
                } finally {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
        if (z11 && i10 == 0) {
            aVar.f39690f = 200;
            aVar.f39691g = str;
            aVar.f39689e = 0;
            try {
                socket.close();
                outputStream2.close();
                return aVar;
            } catch (Exception e11) {
                p0.b("SocketSpider", e11.getMessage());
                return aVar;
            }
        }
        if (i10 < 1) {
            aVar.f39690f = 200;
            aVar.f39691g = str;
            aVar.f39689e = 0;
            try {
                socket.close();
                outputStream2.close();
                return aVar;
            } catch (Exception e12) {
                p0.b("SocketSpider", e12.getMessage());
                return aVar;
            }
        }
        try {
            if (z10) {
                str3 = a(bArr);
            } else {
                str3 = new String(bArr);
            }
        } catch (Throwable th4) {
            p0.b("SocketSpider", th4.getMessage());
            aVar.f39692h = th4.getMessage();
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.f39690f = 200;
            aVar.f39691g = str;
            aVar.f39689e = 0;
            try {
                JSONObject jSONObjectOptJSONObject = new JSONObject(str3).optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(DtbConstants.PRIVACY_LOCATION_KEY);
                    if (!TextUtils.isEmpty(strOptString)) {
                        aVar.f39690f = Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                        aVar.f39685a = strOptString;
                    }
                }
            } catch (Throwable th5) {
                p0.b("SocketSpider", th5.getMessage());
            }
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e13) {
                p0.b("SocketSpider", e13.getMessage());
            }
        } else {
            inputStream.close();
            try {
                socket.close();
                outputStream2.close();
            } catch (Exception e14) {
                p0.b("SocketSpider", e14.getMessage());
            }
        }
        return aVar;
    }

    public byte[] a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i10 = gZIPInputStream.read(bArr2, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr2, 0, i10);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
