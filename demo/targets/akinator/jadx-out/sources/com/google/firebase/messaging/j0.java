package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29821a;

    public j0(Context context) {
        this.f29821a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(m3.a.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            deleteAll();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    public static String a(String str, String str2) {
        return e3.g.k(str, "|T|", str2, "|*");
    }

    public synchronized void deleteAll() {
        this.f29821a.edit().clear().commit();
    }

    public synchronized void deleteToken(String str, String str2) {
        String strA = a(str, str2);
        SharedPreferences.Editor editorEdit = this.f29821a.edit();
        editorEdit.remove(strA);
        editorEdit.commit();
    }

    public synchronized i0 getToken(String str, String str2) {
        return i0.b(this.f29821a.getString(a(str, str2), null));
    }

    public synchronized boolean isEmpty() {
        return this.f29821a.getAll().isEmpty();
    }

    public synchronized void saveToken(String str, String str2, String str3, String str4) {
        String strA = i0.a(System.currentTimeMillis(), str3, str4);
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f29821a.edit();
        editorEdit.putString(a(str, str2), strA);
        editorEdit.commit();
    }
}
