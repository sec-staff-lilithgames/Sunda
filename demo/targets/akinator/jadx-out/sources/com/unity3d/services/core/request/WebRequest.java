package com.unity3d.services.core.request;

import b0.e2;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.log.DeviceLog;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebRequest {
    private ByteArrayOutputStream _baos;
    private byte[] _body;
    private boolean _canceled;
    private int _connectTimeout;
    private long _contentLength;
    private Map<String, List<String>> _headers;
    private IWebRequestProgressListener _progressListener;
    private int _readTimeout;
    private String _requestType;
    private int _responseCode;
    private Map<String, List<String>> _responseHeaders;
    private URL _url;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum RequestType {
        POST,
        GET,
        HEAD
    }

    public WebRequest(String str, String str2) throws MalformedURLException {
        this(str, str2, null);
    }

    private HttpURLConnection getHttpUrlConnectionWithHeaders() throws ProtocolException, IllegalAccessException, NoSuchMethodException, SecurityException, NetworkIOException, IllegalArgumentException, InvocationTargetException {
        HttpURLConnection httpURLConnection;
        if (getUrl().toString().startsWith(DtbConstants.HTTPS)) {
            try {
                httpURLConnection = (HttpsURLConnection) getUrl().openConnection();
            } catch (IOException e10) {
                throw new NetworkIOException("Open HTTPS connection: " + e10.getMessage());
            }
        } else {
            if (!getUrl().toString().startsWith(DtbConstants.HTTP)) {
                throw new IllegalArgumentException("Invalid url-protocol in url: " + getUrl().toString());
            }
            try {
                httpURLConnection = (HttpURLConnection) getUrl().openConnection();
            } catch (IOException e11) {
                throw new NetworkIOException("Open HTTP connection: " + e11.getMessage());
            }
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(getConnectTimeout());
        httpURLConnection.setReadTimeout(getReadTimeout());
        try {
            httpURLConnection.setRequestMethod(getRequestType());
            if (getHeaders() != null && getHeaders().size() > 0) {
                for (String str : getHeaders().keySet()) {
                    for (String str2 : getHeaders().get(str)) {
                        DeviceLog.debug("Setting header: " + str + C3191e4.i.f36525b + str2);
                        httpURLConnection.setRequestProperty(str, str2);
                    }
                }
            }
            return httpURLConnection;
        } catch (ProtocolException e12) {
            throw new NetworkIOException("Set Request Method: " + getRequestType() + ", " + e12.getMessage());
        }
    }

    public void cancel() {
        this._canceled = true;
    }

    public byte[] getBody() {
        return this._body;
    }

    public int getConnectTimeout() {
        return this._connectTimeout;
    }

    public long getContentLength() {
        return this._contentLength;
    }

    public Map<String, List<String>> getHeaders() {
        return this._headers;
    }

    public String getQuery() {
        URL url = this._url;
        if (url != null) {
            return url.getQuery();
        }
        return null;
    }

    public int getReadTimeout() {
        return this._readTimeout;
    }

    public String getRequestType() {
        return this._requestType;
    }

    public int getResponseCode() {
        return this._responseCode;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this._responseHeaders;
    }

    public URL getUrl() {
        return this._url;
    }

    public boolean isCanceled() {
        return this._canceled;
    }

    public String makeRequest() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this._baos = byteArrayOutputStream;
        makeStreamRequest(byteArrayOutputStream);
        return this._baos.toString(C.UTF8_NAME);
    }

    public long makeStreamRequest(OutputStream outputStream) throws Exception {
        InputStream inputStream;
        HttpURLConnection httpUrlConnectionWithHeaders = getHttpUrlConnectionWithHeaders();
        httpUrlConnectionWithHeaders.setDoInput(true);
        if (getRequestType().equals(RequestType.POST.name())) {
            httpUrlConnectionWithHeaders.setDoOutput(true);
            OutputStream outputStream2 = null;
            try {
                try {
                    outputStream2 = httpUrlConnectionWithHeaders.getOutputStream();
                    if (getBody() == null) {
                        String query = getQuery();
                        if (query != null) {
                            outputStream2.write(query.getBytes(StandardCharsets.UTF_8));
                        }
                    } else {
                        outputStream2.write(getBody());
                    }
                    outputStream2.flush();
                    try {
                        outputStream2.close();
                    } catch (IOException e10) {
                        DeviceLog.exception("Error closing writer", e10);
                    }
                } catch (IOException e11) {
                    DeviceLog.exception("Error while writing POST params", e11);
                    throw new NetworkIOException("Error writing POST params: " + e11.getMessage());
                }
            } finally {
            }
        }
        try {
            this._responseCode = httpUrlConnectionWithHeaders.getResponseCode();
            long contentLength = httpUrlConnectionWithHeaders.getContentLength();
            this._contentLength = contentLength;
            if (contentLength == -1) {
                this._contentLength = httpUrlConnectionWithHeaders.getHeaderFieldInt("X-OrigLength", -1);
            }
            ByteArrayOutputStream byteArrayOutputStream = this._baos;
            long j10 = 0;
            OutputStream outputStream3 = outputStream;
            if (byteArrayOutputStream != null && byteArrayOutputStream == outputStream3 && this._contentLength > 0) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream((int) this._contentLength);
                this._baos = byteArrayOutputStream2;
                outputStream3 = byteArrayOutputStream2;
            }
            if (httpUrlConnectionWithHeaders.getHeaderFields() != null) {
                this._responseHeaders = httpUrlConnectionWithHeaders.getHeaderFields();
            }
            try {
                inputStream = httpUrlConnectionWithHeaders.getInputStream();
            } catch (IOException e12) {
                InputStream errorStream = httpUrlConnectionWithHeaders.getErrorStream();
                if (errorStream == null) {
                    throw new NetworkIOException("Can't open error stream: " + e12.getMessage());
                }
                inputStream = errorStream;
            }
            IWebRequestProgressListener iWebRequestProgressListener = this._progressListener;
            if (iWebRequestProgressListener != null) {
                iWebRequestProgressListener.onRequestStart(getUrl().toString(), this._contentLength, this._responseCode, this._responseHeaders);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bArr = new byte[4096];
            int i10 = 0;
            while (!isCanceled() && i10 != -1) {
                try {
                    i10 = bufferedInputStream.read(bArr);
                    if (i10 > 0) {
                        outputStream3.write(bArr, 0, i10);
                        long j11 = j10 + i10;
                        IWebRequestProgressListener iWebRequestProgressListener2 = this._progressListener;
                        if (iWebRequestProgressListener2 != null) {
                            iWebRequestProgressListener2.onRequestProgress(getUrl().toString(), j11, this._contentLength);
                        }
                        j10 = j11;
                    }
                } catch (IOException e13) {
                    throw new NetworkIOException("Network exception: " + e13.getMessage());
                } catch (Exception e14) {
                    throw new Exception(e2.l(e14, new StringBuilder("Unknown Exception: ")));
                }
            }
            httpUrlConnectionWithHeaders.disconnect();
            outputStream3.flush();
            return j10;
        } catch (IOException | RuntimeException e15) {
            throw new NetworkIOException(e2.l(e15, new StringBuilder("Response code: ")));
        }
    }

    public void setBody(String str) {
        this._body = str.getBytes(StandardCharsets.UTF_8);
    }

    public void setConnectTimeout(int i10) {
        this._connectTimeout = i10;
    }

    public void setProgressListener(IWebRequestProgressListener iWebRequestProgressListener) {
        this._progressListener = iWebRequestProgressListener;
    }

    public void setReadTimeout(int i10) {
        this._readTimeout = i10;
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map) throws MalformedURLException {
        this(str, str2, map, 30000, 30000);
    }

    public void setBody(byte[] bArr) {
        this._body = bArr;
    }

    public WebRequest(String str, String str2, Map<String, List<String>> map, int i10, int i11) throws MalformedURLException {
        this._responseCode = -1;
        this._contentLength = -1L;
        this._canceled = false;
        this._url = new URL(str);
        this._requestType = str2;
        this._headers = map;
        this._connectTimeout = i10;
        this._readTimeout = i11;
    }
}
