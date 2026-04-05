package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.I4;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class CrashProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    Context f36630a;

    /* renamed from: b, reason: collision with root package name */
    I4 f36631b;

    /* renamed from: c, reason: collision with root package name */
    String f36632c;

    /* renamed from: e, reason: collision with root package name */
    Uri f36634e;

    /* renamed from: h, reason: collision with root package name */
    String f36637h;

    /* renamed from: i, reason: collision with root package name */
    String f36638i;

    /* renamed from: d, reason: collision with root package name */
    UriMatcher f36633d = new UriMatcher(-1);

    /* renamed from: f, reason: collision with root package name */
    final int f36635f = 1;

    /* renamed from: g, reason: collision with root package name */
    final int f36636g = 2;

    /* renamed from: j, reason: collision with root package name */
    final String f36639j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f36633d.match(uri);
        if (iMatch == 1) {
            return this.f36637h;
        }
        if (iMatch == 2) {
            return this.f36638i;
        }
        throw new IllegalArgumentException(o2.p("Invalid URI: ", uri));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f36630a = getContext();
        this.f36631b = new I4(this.f36630a);
        this.f36632c = this.f36630a.getPackageName();
        this.f36634e = Uri.parse("content://" + this.f36632c + "/REPORTS");
        this.f36637h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f36638i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.f36633d.match(uri);
        if (iMatch == 1) {
            return I4.c();
        }
        if (iMatch == 2) {
            return I4.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException(o2.p("Invalid URI: ", uri));
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
