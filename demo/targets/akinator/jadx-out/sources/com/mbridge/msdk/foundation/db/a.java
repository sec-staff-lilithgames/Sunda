package com.mbridge.msdk.foundation.db;

import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a<T> {
    protected f mHelper;

    public a(f fVar) {
        this.mHelper = fVar;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        try {
        } catch (Exception unused) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            p0.a("BaseDao", "getReadableDatabase error");
            return null;
        }
        return this.mHelper.c();
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        try {
        } catch (Exception unused) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            p0.a("BaseDao", "getWritableDatabase error");
            return null;
        }
        return this.mHelper.d();
    }
}
