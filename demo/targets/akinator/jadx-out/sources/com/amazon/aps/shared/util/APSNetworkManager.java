package com.amazon.aps.shared.util;

import android.content.Context;
import android.util.Log;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEvent;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class APSNetworkManager {
    private static final String API_HEADER = "x-api-key";
    private static final int BUFFER_SIZE = 1024;
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String HTTP_POST_METHOD = "POST";
    private static long SCHEDULE_INTERVAL = 10;
    private static final int SOCK_TIMEOUT = 10000;
    private static final String TAG = "APSNetworkManager";
    private static APSNetworkManager apsNetworkManager;
    private Context context;
    private final ExecutorService executor = Executors.newFixedThreadPool(2);
    private boolean shutdownInProgress = false;

    private APSNetworkManager(Context context) {
        this.context = context;
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.aps.shared.util.APSNetworkManager.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    APSNetworkManager.this.shutdownInProgress = true;
                    Log.d(APSNetworkManager.TAG, "App is shutting down, terminating the thread executor");
                    APSNetworkManager.this.executor.shutdown();
                } catch (RuntimeException e10) {
                    Log.e(APSNetworkManager.TAG, "Error in stopping the executor", e10);
                }
            }
        });
    }

    private void closeStreamsAndConnection(InputStream inputStream, OutputStream outputStream, HttpsURLConnection httpsURLConnection) throws IOException {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException | RuntimeException e10) {
                Log.e(TAG, "Unable to close the out stream", e10);
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException | RuntimeException e11) {
                Log.e(TAG, "Unable to close the in stream", e11);
            }
        }
        try {
            httpsURLConnection.disconnect();
        } catch (RuntimeException e12) {
            Log.e(TAG, "Unable to close the url connection", e12);
        }
    }

    private synchronized void execute(Runnable runnable) {
        try {
        } catch (InternalError e10) {
            Log.e(TAG, "Internal error in executing the thread", e10);
            handleError(e10);
        } catch (RuntimeException e11) {
            Log.e(TAG, "Error running the thread", e11);
        }
        if (!this.shutdownInProgress) {
            this.executor.execute(runnable);
        }
    }

    public static APSNetworkManager getInstance(Context context) {
        if (apsNetworkManager == null) {
            apsNetworkManager = new APSNetworkManager(context);
        }
        return apsNetworkManager;
    }

    private void handleError(InternalError internalError) {
        if (internalError.getLocalizedMessage().contains("shutdown")) {
            Log.e(TAG, "Got the shutdown signal", internalError);
        }
    }

    private void sendData(String str, String str2, String str3) {
        execute(new al.a(3, str, (Object) this, (Object) str2, (Object) str3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* renamed from: sendDataAsync, reason: merged with bridge method [inline-methods] */
    public boolean lambda$sendData$0(String str, String str2, String str3) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                str = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    if (setConfigsInConnection(str, str2)) {
                        bufferedOutputStream = new BufferedOutputStream(str.getOutputStream());
                        try {
                            bufferedOutputStream.write(str3.getBytes());
                            bufferedOutputStream.flush();
                            String str4 = TAG;
                            Log.d(str4, "Sending the event data: ".concat(str3));
                            int responseCode = str.getResponseCode();
                            Log.d(str4, "Response code received : " + responseCode);
                            if (responseCode == 200) {
                                byte[] bArr = new byte[1024];
                                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(str.getInputStream());
                                try {
                                    bufferedInputStream2.read(bArr);
                                    Log.d(str4, "Response received: ".concat(new String(bArr)));
                                    closeStreamsAndConnection(bufferedInputStream2, bufferedOutputStream, str);
                                    return true;
                                } catch (IOException e10) {
                                    e = e10;
                                    bufferedInputStream = bufferedInputStream2;
                                    Log.e(TAG, "Error in sendData: ", e);
                                    closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, str);
                                    return false;
                                } catch (RuntimeException e11) {
                                    e = e11;
                                    bufferedInputStream = bufferedInputStream2;
                                    Log.e(TAG, "Error in sendData: ", e);
                                    closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, str);
                                    return false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedInputStream = bufferedInputStream2;
                                    closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, str);
                                    throw th;
                                }
                            }
                        } catch (IOException e12) {
                            e = e12;
                        } catch (RuntimeException e13) {
                            e = e13;
                        }
                    } else {
                        bufferedOutputStream = null;
                    }
                    closeStreamsAndConnection(null, bufferedOutputStream, str);
                    return false;
                } catch (IOException e14) {
                    e = e14;
                    bufferedOutputStream = null;
                    Log.e(TAG, "Error in sendData: ", e);
                    closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, str);
                    return false;
                } catch (RuntimeException e15) {
                    e = e15;
                    bufferedOutputStream = null;
                    Log.e(TAG, "Error in sendData: ", e);
                    closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, str);
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e16) {
            e = e16;
            str = 0;
            bufferedOutputStream = null;
            Log.e(TAG, "Error in sendData: ", e);
            closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, str);
            return false;
        } catch (RuntimeException e17) {
            e = e17;
            str = 0;
            bufferedOutputStream = null;
            Log.e(TAG, "Error in sendData: ", e);
            closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, str);
            return false;
        } catch (Throwable th5) {
            th = th5;
            str = 0;
            bufferedOutputStream = null;
        }
    }

    private boolean setConfigsInConnection(HttpsURLConnection httpsURLConnection, String str) throws IOException {
        try {
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setChunkedStreamingMode(0);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setRequestProperty(API_HEADER, str);
            httpsURLConnection.connect();
            return true;
        } catch (IOException e10) {
            Log.e(TAG, "Error in setting the connection parameter:", e10);
            return false;
        }
    }

    public void sendMetrics(JSONObject jSONObject) {
        if (jSONObject != null) {
            ApsMetrics.Companion companion = ApsMetrics.Companion;
            sendData(companion.getEndpointUrl(), companion.getApiKey(), jSONObject.toString());
        }
    }

    public void sendRemoteLog(APSEvent aPSEvent) {
        if (aPSEvent.getEventSeverity() == APSEventSeverity.FATAL) {
            sendData(APSAnalytics.getHttpUrl(), APSAnalytics.getApiKey(), aPSEvent.toJsonPayload());
        }
    }
}
