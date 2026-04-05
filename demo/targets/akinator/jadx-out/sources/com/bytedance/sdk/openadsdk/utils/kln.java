package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class kln implements Thread.UncaughtExceptionHandler {
    public static volatile boolean jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f21583jd = Thread.getDefaultUncaughtExceptionHandler();
    private String wqx;

    private kln() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        jd();
    }

    private void jd() {
        Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
        if (contextJpo == null) {
            return;
        }
        try {
            File file = new File(contextJpo.getFilesDir(), "TTCache");
            file.mkdirs();
            this.wqx = file.getPath();
        } catch (Throwable unused) {
        }
    }

    public static kln jpo() {
        return new kln();
    }

    private void wqx() {
        try {
            com.bytedance.sdk.openadsdk.component.qk.jpo.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo());
        } catch (Throwable unused) {
        }
        try {
            com.bytedance.sdk.openadsdk.component.reward.au.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo()).jpo();
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.component.reward.my.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo()).jpo();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.au.jrx().jpo();
        } catch (Throwable unused4) {
        }
        try {
            com.bytedance.sdk.component.adexpress.jpo.jd.jd.jd();
        } catch (Throwable unused5) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        jpo = true;
        com.bytedance.sdk.component.xyk.zz.sCrashHappened = true;
        com.bytedance.sdk.component.xyk.wqx.cm.wqx = true;
        boolean zContains = false;
        com.bytedance.sdk.component.xyk.jj.jpo(false);
        try {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            if (string != null) {
                zContains = string.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (zContains) {
            jpo(thread, th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f21583jd;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Properties] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(java.lang.Thread r12, java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.kln.jpo(java.lang.Thread, java.lang.Throwable):void");
    }
}
