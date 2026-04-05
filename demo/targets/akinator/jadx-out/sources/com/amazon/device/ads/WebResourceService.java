package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class WebResourceService implements Runnable {
    public static final String LOG_TAG = "WebResourceService";
    public static final long REFRESH_INTERVAL = 86400000;
    public static final String WEB_DIR = "/mdtb_web/";
    public static boolean inProgress;
    public static WebResourceService theService;

    private void createWebDirIfNeeded() {
        File file = new File(AdRegistration.getContext().getFilesDir().getAbsolutePath() + WEB_DIR);
        if (file.isDirectory() || file.exists()) {
            return;
        }
        file.mkdir();
    }

    public static WebResourceService getInstance() {
        if (theService == null) {
            theService = new WebResourceService();
        }
        return theService;
    }

    public static void init() {
        try {
            if (inProgress) {
                return;
            }
            WebResourceService webResourceService = getInstance();
            Long webResoucesLastPing = DtbSharedPreferences.getInstance().getWebResoucesLastPing();
            if (webResoucesLastPing != null && new Date().getTime() - webResoucesLastPing.longValue() <= 86400000) {
                return;
            }
            inProgress = true;
            DtbThreadService.getInstance().execute(webResourceService);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute init method", e10);
        }
    }

    private synchronized void renameTo(File file, File file2) {
        file.renameTo(file2);
    }

    public void deleteWebDirContent() {
        File file = new File(AdRegistration.getContext().getFilesDir().getAbsolutePath() + WEB_DIR);
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        }
    }

    public synchronized String loadFile(String str) throws IOException {
        File file = new File(AdRegistration.getContext().getFilesDir().getAbsolutePath() + WEB_DIR + str + ".js");
        if (!file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                fileInputStream.close();
                return sb2.toString();
            }
            sb2.append(line.trim());
            sb2.append("\n");
        }
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        DtbHttpClient dtbHttpClient;
        try {
            createWebDirIfNeeded();
            boolean z10 = true;
            for (String str : WebResourceOptions.getCDNResources()) {
                try {
                    dtbHttpClient = new DtbHttpClient(WebResourceOptions.getCDNHost(str) + str);
                    dtbHttpClient.setUseSecure(DtbDebugProperties.getIsSecure(true));
                    dtbHttpClient.executeGET(DtbConstants.NETWORK_READ_TIMEOUT);
                } catch (Exception e10) {
                    DtbLog.error("Error registering device for ads:" + e10);
                    z10 = false;
                }
                if (dtbHttpClient.getResponseCode() != 200) {
                    throw new RuntimeException("resource " + str + " not available");
                }
                String response = dtbHttpClient.getResponse();
                File filesDir = AdRegistration.getContext().getFilesDir();
                File fileCreateTempFile = File.createTempFile("dtb-temp", "js", filesDir);
                FileWriter fileWriter = new FileWriter(fileCreateTempFile);
                fileWriter.write(response);
                fileWriter.close();
                renameTo(fileCreateTempFile, new File(filesDir.getAbsolutePath() + WEB_DIR + str));
            }
            if (z10) {
                DtbSharedPreferences.getInstance().saveWebResoucesLastPing(new Date().getTime());
            }
            inProgress = false;
        } catch (RuntimeException e11) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute init method", e11);
        }
    }
}
