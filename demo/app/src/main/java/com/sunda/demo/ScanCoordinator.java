package com.sunda.demo;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class ScanCoordinator {
    static final String ACTION_SCAN = "com.sunda.demo.SCAN";
    static final String ACTION_SCAN_FINISHED = "com.sunda.demo.SCAN_FINISHED";
    static final String EXTRA_REASON = "reason";
    static final String EXTRA_CALIBRATE = "calibrate";
    static final String PREFS_NAME = "scan_prefs";
    static final String PREF_LAST_SUMMARY = "last_summary";
    static final String PREF_LAST_REPORT = "last_report";
    static final String PREF_LAST_TIMESTAMP = "last_timestamp";
    static final String TAG = "SundaDemo";

    private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();
    private static final SimpleDateFormat FILE_STAMP =
            new SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.US);

    private ScanCoordinator() {
    }

    static void triggerScan(Context context, String reason, boolean calibrate, Runnable callback) {
        Context appContext = context.getApplicationContext();
        EXECUTOR.execute(() -> {
            long started = SystemClock.elapsedRealtime();
            String safeReason = (reason == null || reason.isBlank()) ? "manual" : reason;
            String json = calibrate ? NativeScanner.runCalibration(safeReason) : NativeScanner.runScan(safeReason);

            File reportsDir = new File(appContext.getExternalFilesDir(null), "reports");
            if (!reportsDir.exists() && !reportsDir.mkdirs()) {
                Log.e(TAG, "Failed to create report directory: " + reportsDir);
            }

            String baseName = calibrate ? "calibration" : "scan";
            String stampedName = baseName + "-" + FILE_STAMP.format(new Date()) + ".json";
            File stampedFile = new File(reportsDir, stampedName);
            File latestFile = new File(reportsDir, calibrate ? "calibration-latest.json" : "latest.json");
            writeJson(stampedFile, json);
            writeJson(latestFile, json);

            String summary = summarize(json, calibrate, safeReason, latestFile, SystemClock.elapsedRealtime() - started);
            appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                    .edit()
                    .putString(PREF_LAST_SUMMARY, summary)
                    .putString(PREF_LAST_REPORT, latestFile.getAbsolutePath())
                    .putLong(PREF_LAST_TIMESTAMP, System.currentTimeMillis())
                    .apply();

            Log.i(TAG, summary);
            Intent finished = new Intent(ACTION_SCAN_FINISHED).setPackage(appContext.getPackageName());
            appContext.sendBroadcast(finished);

            if (callback != null) {
                callback.run();
            }
        });
    }

    static String loadSummary(Context context) {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .getString(PREF_LAST_SUMMARY, context.getString(R.string.no_summary));
    }

    private static void writeJson(File output, String json) {
        try (FileOutputStream stream = new FileOutputStream(output, false)) {
            stream.write(json.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            Log.e(TAG, "Failed to write report " + output, e);
        }
    }

    private static String summarize(String json, boolean calibrate, String reason, File latestFile, long elapsedMs) {
        try {
            JSONObject root = new JSONObject(json);
            if (calibrate) {
                JSONObject before = root.getJSONObject("before").getJSONObject("summary");
                JSONObject after = root.getJSONObject("after").getJSONObject("summary");
                return "calibration reason=" + reason +
                        " beforeHits=" + before.optInt("totalHits", -1) +
                        " afterHits=" + after.optInt("totalHits", -1) +
                        " file=" + latestFile.getAbsolutePath() +
                        " elapsedMs=" + elapsedMs;
            }

            JSONObject summary = root.getJSONObject("summary");
            return "scan reason=" + reason +
                    " totalHits=" + summary.optInt("totalHits", -1) +
                    " truncated=" + summary.optBoolean("truncated", false) +
                    " file=" + latestFile.getAbsolutePath() +
                    " elapsedMs=" + elapsedMs;
        } catch (Exception e) {
            return "scan reason=" + reason +
                    " parseError=" + e.getClass().getSimpleName() +
                    " file=" + latestFile.getAbsolutePath() +
                    " elapsedMs=" + elapsedMs;
        }
    }
}
