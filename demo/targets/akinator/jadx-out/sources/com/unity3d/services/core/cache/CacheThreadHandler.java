package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import b3.h;
import com.ironsource.C3271ic;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v57 */
    private void downloadFile(String str, String str2, int i10, int i11, final int i12, HashMap<String, List<String>> map, boolean z10, final CacheEventSender cacheEventSender) throws Throwable {
        Object obj;
        Throwable th2;
        ?? r32;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        FileOutputStream fileOutputStream5;
        FileOutputStream fileOutputStream6;
        FileOutputStream fileOutputStream7;
        if (this._canceled || str == null || str2 == null) {
            return;
        }
        final File file = new File(str2);
        Object obj2 = " to ";
        if (z10) {
            StringBuilder sbB = h.b("Unity Ads cache: resuming download ", str, " to ", str2, " at ");
            sbB.append(file.length());
            sbB.append(" bytes");
            DeviceLog.debug(sbB.toString());
            obj = " bytes";
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + str2);
            obj = obj2;
        }
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        WebRequest webRequest = null;
        try {
            try {
                FileOutputStream fileOutputStream8 = new FileOutputStream(file, z10);
                try {
                    WebRequest webRequest2 = getWebRequest(str, i10, i11, map);
                    this._currentRequest = webRequest2;
                    webRequest2.setProgressListener(new IWebRequestProgressListener() { // from class: com.unity3d.services.core.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestProgress(String str3, long j10, long j11) {
                            if (i12 <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= i12) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, str3, Long.valueOf(j10), Long.valueOf(j11));
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestStart(String str3, long j10, int i13, Map<String, List<String>> map2) {
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STARTED, str3, Long.valueOf(file.length()), Long.valueOf(file.length() + j10), Integer.valueOf(i13), Request.getResponseHeadersMap(map2));
                        }
                    });
                    long jMakeStreamRequest = this._currentRequest.makeStreamRequest(fileOutputStream8);
                    this._active = false;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                    try {
                        postProcessDownload(jElapsedRealtime, str, file, jMakeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders(), cacheEventSender);
                        this._currentRequest = null;
                        try {
                            fileOutputStream7.close();
                        } catch (Exception e10) {
                            DeviceLog.exception("Error closing stream", e10);
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e10.getMessage());
                        }
                    } catch (NetworkIOException e11) {
                        e = e11;
                        fileOutputStream6 = fileOutputStream7;
                        DeviceLog.exception("Network error", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NETWORK_ERROR, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream6;
                        if (fileOutputStream6 != null) {
                            try {
                                fileOutputStream6.close();
                                obj = fileOutputStream6;
                            } catch (Exception e12) {
                                DeviceLog.exception("Error closing stream", e12);
                                CacheEvent cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                                Object obj3 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent, obj3, str, e12.getMessage());
                                obj = obj3;
                            }
                        }
                    } catch (FileNotFoundException e13) {
                        e = e13;
                        fileOutputStream5 = fileOutputStream7;
                        DeviceLog.exception("Couldn't create target file", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream5;
                        if (fileOutputStream5 != null) {
                            try {
                                fileOutputStream5.close();
                                obj = fileOutputStream5;
                            } catch (Exception e14) {
                                DeviceLog.exception("Error closing stream", e14);
                                CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj4 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent2, obj4, str, e14.getMessage());
                                obj = obj4;
                            }
                        }
                    } catch (MalformedURLException e15) {
                        e = e15;
                        fileOutputStream2 = fileOutputStream7;
                        DeviceLog.exception("Malformed URL", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.MALFORMED_URL, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream2;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                obj = fileOutputStream2;
                            } catch (Exception e16) {
                                DeviceLog.exception("Error closing stream", e16);
                                CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj5 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent3, obj5, str, e16.getMessage());
                                obj = obj5;
                            }
                        }
                    } catch (IOException e17) {
                        e = e17;
                        fileOutputStream4 = fileOutputStream7;
                        DeviceLog.exception("Couldn't request stream", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream4;
                        if (fileOutputStream4 != null) {
                            try {
                                fileOutputStream4.close();
                                obj = fileOutputStream4;
                            } catch (Exception e18) {
                                DeviceLog.exception("Error closing stream", e18);
                                CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj6 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent4, obj6, str, e18.getMessage());
                                obj = obj6;
                            }
                        }
                    } catch (IllegalStateException e19) {
                        e = e19;
                        fileOutputStream3 = fileOutputStream7;
                        DeviceLog.exception("Illegal state", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.ILLEGAL_STATE, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream3;
                        if (fileOutputStream3 != null) {
                            try {
                                fileOutputStream3.close();
                                obj = fileOutputStream3;
                            } catch (Exception e20) {
                                DeviceLog.exception("Error closing stream", e20);
                                CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj7 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent5, obj7, str, e20.getMessage());
                                obj = obj7;
                            }
                        }
                    } catch (Exception e21) {
                        e = e21;
                        fileOutputStream = fileOutputStream7;
                        DeviceLog.exception("Unknown error", e);
                        this._active = false;
                        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.UNKNOWN_ERROR, str, e.getMessage());
                        this._currentRequest = webRequest;
                        obj = fileOutputStream;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                obj = fileOutputStream;
                            } catch (Exception e22) {
                                DeviceLog.exception("Error closing stream", e22);
                                CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
                                Object obj8 = CacheError.FILE_IO_ERROR;
                                cacheEventSender.sendEvent(cacheEvent6, obj8, str, e22.getMessage());
                                obj = obj8;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        r32 = fileOutputStream7;
                        this._currentRequest = webRequest;
                        if (r32 == 0) {
                            throw th2;
                        }
                        try {
                            r32.close();
                            throw th2;
                        } catch (Exception e23) {
                            DeviceLog.exception("Error closing stream", e23);
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e23.getMessage());
                            throw th2;
                        }
                    }
                } catch (NetworkIOException e24) {
                    e = e24;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (FileNotFoundException e25) {
                    e = e25;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (IllegalStateException e26) {
                    e = e26;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (MalformedURLException e27) {
                    e = e27;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (IOException e28) {
                    e = e28;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (Exception e29) {
                    e = e29;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                }
            } catch (Throwable th5) {
                th2 = th5;
                r32 = obj;
            }
        } catch (NetworkIOException e30) {
            e = e30;
            webRequest = null;
            fileOutputStream6 = null;
        } catch (FileNotFoundException e31) {
            e = e31;
            webRequest = null;
            fileOutputStream5 = null;
        } catch (IOException e32) {
            e = e32;
            webRequest = null;
            fileOutputStream4 = null;
        } catch (IllegalStateException e33) {
            e = e33;
            webRequest = null;
            fileOutputStream3 = null;
        } catch (MalformedURLException e34) {
            e = e34;
            webRequest = null;
            fileOutputStream2 = null;
        } catch (Exception e35) {
            e = e35;
            webRequest = null;
            fileOutputStream = null;
        } catch (Throwable th6) {
            webRequest = null;
            th2 = th6;
            r32 = 0;
        }
    }

    private WebRequest getWebRequest(String str, int i10, int i11, HashMap<String, List<String>> map) throws MalformedURLException {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new WebRequest(str, C3271ic.f36943a, map2, i10, i11);
    }

    private void postProcessDownload(long j10, String str, File file, long j11, long j12, boolean z10, int i10, Map<String, List<String>> map, CacheEventSender cacheEventSender) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z10) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(jElapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j11 + " bytes downloaded in " + jElapsedRealtime + "ms");
        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_END, str, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(jElapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        HashMap<String, List<String>> map;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i10 = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i11 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i12 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z10 = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            map = new HashMap<>();
            for (String str : data.keySet()) {
                map.put(str, Arrays.asList(data.getStringArray(str)));
            }
        } else {
            map = null;
        }
        HashMap<String, List<String>> map2 = map;
        File file = new File(string2);
        if ((z10 && !file.exists()) || (!z10 && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z10), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i10, i11, i12, map2, z10, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z10) {
        WebRequest webRequest;
        this._canceled = z10;
        if (!z10 || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
