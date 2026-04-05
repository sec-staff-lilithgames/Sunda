package com.amazon.device.ads;

import com.ironsource.C3191e4;
import j1.o2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbHttpClient {
    public String message;
    public int responseCode;
    public String url;
    public boolean secure = true;
    public boolean isQueryParamsEnabled = false;
    public String response = null;
    public HashMap<String, Object> params = new HashMap<>();
    public HashMap<String, Object> headers = new HashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum HTTPMethod {
        POST,
        GET
    }

    public DtbHttpClient(String str) {
        this.url = str;
    }

    public static String convertStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line + "\n");
                    }
                } catch (IOException e10) {
                    DtbLog.debug("Error converting stream to string. Ex=" + e10);
                }
                try {
                    break;
                } catch (IOException unused) {
                }
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        return sb2.toString();
    }

    private HttpURLConnection createDefaultConnection(URL url, int i10) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setReadTimeout(i10);
        return httpURLConnection;
    }

    private void executeRequest(HTTPMethod hTTPMethod, URL url, int i10) throws JSONException, IOException {
        String paramsAsJsonString;
        HttpURLConnection httpURLConnectionCreateDefaultConnection = createDefaultConnection(url, i10);
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.headers.keySet()) {
            String string = this.headers.get(str) != null ? this.headers.get(str).toString() : "";
            httpURLConnectionCreateDefaultConnection.setRequestProperty(str, string);
            sb2.append(str + ":" + string + " ");
        }
        DtbLog.debug("with headers:[" + ((Object) sb2) + C3191e4.i.f36531e);
        if (hTTPMethod == HTTPMethod.POST) {
            httpURLConnectionCreateDefaultConnection.setDoOutput(true);
            if (!this.params.isEmpty()) {
                if (this.isQueryParamsEnabled) {
                    httpURLConnectionCreateDefaultConnection.setRequestProperty("content-type", "application/x-www-form-urlencoded");
                    paramsAsJsonString = getQueryParams();
                } else {
                    httpURLConnectionCreateDefaultConnection.setRequestProperty("content-type", "application/json; charset=utf-8");
                    paramsAsJsonString = getParamsAsJsonString();
                }
                DtbLog.debug("with json params:[" + paramsAsJsonString + C3191e4.i.f36531e);
                OutputStream outputStream = httpURLConnectionCreateDefaultConnection.getOutputStream();
                outputStream.write(paramsAsJsonString.getBytes());
                outputStream.flush();
                outputStream.close();
            }
        }
        try {
            InputStream inputStream = httpURLConnectionCreateDefaultConnection.getInputStream();
            if (inputStream == null) {
                return;
            }
            this.responseCode = httpURLConnectionCreateDefaultConnection.getResponseCode();
            this.message = httpURLConnectionCreateDefaultConnection.getResponseMessage();
            this.response = convertStreamToString(inputStream);
            inputStream.close();
            DtbLog.debug("Response :" + this.response);
        } catch (Exception e10) {
            this.response = null;
            DtbLog.debug("Error while connecting to remote server: " + httpURLConnectionCreateDefaultConnection.getURL().toString() + " with error:" + e10.getMessage());
        } finally {
            httpURLConnectionCreateDefaultConnection.disconnect();
        }
    }

    private String getParamsAsJsonString() throws JSONException {
        return DtbCommonUtils.getParamsAsJsonString(this.params);
    }

    private String getQueryParams() {
        String strD = "";
        if (!this.params.isEmpty()) {
            for (String str : this.params.keySet()) {
                if (this.params.get(str) != null) {
                    StringBuilder sbT = a.b.t(str, C3191e4.i.f36525b);
                    sbT.append(DtbCommonUtils.getURLEncodedString(this.params.get(str).toString()));
                    String string = sbT.toString();
                    strD = strD.length() > 1 ? w0.i.d(strD, C3191e4.i.f36527c, string) : o2.l(strD, string);
                }
            }
        }
        return strD;
    }

    public void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    public void addParam(String str, String str2) {
        this.params.put(str, str2);
    }

    public void enableQueryParams() {
        this.isQueryParamsEnabled = true;
    }

    public void executeGET(int i10) throws JSONException, IOException {
        String str;
        if (this.params.isEmpty()) {
            str = "";
        } else {
            str = "?" + getQueryParams();
        }
        String string = this.url;
        String str2 = DtbConstants.HTTPS;
        if (!string.startsWith(DtbConstants.HTTPS) && !this.url.startsWith(DtbConstants.HTTP)) {
            StringBuilder sb2 = new StringBuilder();
            if (!this.secure) {
                str2 = DtbConstants.HTTP;
            }
            sb2.append(str2);
            sb2.append(this.url);
            string = sb2.toString();
        }
        DtbLog.debug("GET URL:" + string);
        DtbLog.debug("with params: " + str);
        executeRequest(HTTPMethod.GET, new URL(o2.l(string, str)), i10);
    }

    public void executePOST(int i10) throws JSONException, IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.secure ? DtbConstants.HTTPS : DtbConstants.HTTP);
        sb2.append(this.url);
        String string = sb2.toString();
        DtbLog.debug("POST URL:" + string);
        executeRequest(HTTPMethod.POST, new URL(string), i10);
    }

    public String getErrorMessage() {
        return this.message;
    }

    public HashMap<String, Object> getHeaders() {
        return this.headers;
    }

    public HashMap<String, Object> getParams() {
        return this.params;
    }

    public String getResponse() {
        return this.response;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isHttpStatusCodeOK() {
        return this.responseCode == 200;
    }

    public void setHeaders(HashMap<String, Object> map) {
        this.headers = map;
    }

    public void setParams(HashMap<String, Object> map) {
        this.params = map;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUseSecure(boolean z10) {
        this.secure = z10;
    }
}
