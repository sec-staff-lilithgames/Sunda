package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class V1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32382a;

    public V1(String tableName, String tableSchema) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableSchema, "tableSchema");
        this.f32382a = tableName;
        try {
            C3.f31704a.a(tableName, tableSchema);
        } catch (Exception unused) {
        }
    }

    public abstract Object a(ContentValues contentValues);

    public final void a(Object obj) {
        try {
            C3.a(this.f32382a, b(obj));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("V1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public abstract ContentValues b(Object obj);

    public final void b(Object obj, String str, String[] strArr) {
        try {
            C3.b(this.f32382a, b(obj), str, strArr);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("V1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public final void a(Object obj, String str, String[] strArr) {
        try {
            C3.a(this.f32382a, b(obj), str, strArr);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("V1", "TAG");
            Objects.toString(obj);
        } catch (Exception unused) {
        }
    }

    public final Object b(String str, String[] strArr) {
        try {
            List<ContentValues> listB = C3.b(this.f32382a, null, str, strArr, null, null, null, null);
            if (!listB.isEmpty()) {
                return a(listB.get(0));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static ArrayList a(V1 v12, String str, String[] strArr, String str2, String str3, String str4, Integer num, int i10) {
        String str5 = (i10 & 1) != 0 ? null : str;
        String[] strArr2 = (i10 & 2) != 0 ? null : strArr;
        String str6 = (i10 & 4) != 0 ? null : str2;
        String str7 = (i10 & 8) != 0 ? null : str3;
        String str8 = (i10 & 16) != 0 ? null : str4;
        Integer num2 = (i10 & 32) != 0 ? null : num;
        v12.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            List<ContentValues> listB = C3.b(v12.f32382a, null, str5, strArr2, str6, str7, str8, num2 != null ? num2.toString() : null);
            if (!listB.isEmpty()) {
                Iterator<ContentValues> it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(v12.a(it.next()));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static int a(V1 v12, String str, String[] strArr, int i10) {
        String str2 = (i10 & 1) != 0 ? null : str;
        String[] strArr2 = (i10 & 2) != 0 ? null : strArr;
        v12.getClass();
        try {
            return C3.a(v12.f32382a, null, str2, strArr2, null, null, null, null);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int a(String str, String[] strArr) {
        try {
            return C3.a(this.f32382a, str, strArr);
        } catch (Exception unused) {
            return 0;
        }
    }
}
