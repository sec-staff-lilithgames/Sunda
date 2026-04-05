package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.o1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2913o1 extends V1 {
    public C2913o1() {
        super("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.V1
    public final Object a(ContentValues contentValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(contentValues, "contentValues");
        Integer asInteger = contentValues.getAsInteger("id");
        Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
        String asString = contentValues.getAsString("url");
        String asString2 = contentValues.getAsString("disk_uri");
        Long asLong = contentValues.getAsLong("ts");
        Long asLong2 = contentValues.getAsLong("created_ts");
        Long asLong3 = contentValues.getAsLong("ttl");
        Long asLong4 = contentValues.getAsLong("soft_ttl");
        kotlin.jvm.internal.e0.checkNotNull(asInteger);
        int iIntValue = asInteger.intValue();
        kotlin.jvm.internal.e0.checkNotNull(asString);
        kotlin.jvm.internal.e0.checkNotNull(asInteger2);
        int iIntValue2 = asInteger2.intValue();
        kotlin.jvm.internal.e0.checkNotNull(asLong);
        long jLongValue = asLong.longValue();
        kotlin.jvm.internal.e0.checkNotNull(asLong2);
        long jLongValue2 = asLong2.longValue();
        kotlin.jvm.internal.e0.checkNotNull(asLong3);
        long jLongValue3 = asLong3.longValue();
        kotlin.jvm.internal.e0.checkNotNull(asLong4);
        return new C2826j(iIntValue, asString, asString2, iIntValue2, jLongValue, jLongValue2, jLongValue3, asLong4.longValue());
    }

    @Override // com.inmobi.media.V1
    public final ContentValues b(Object obj) {
        C2826j adAsset = (C2826j) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(adAsset, "adAsset");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(adAsset.f32939a));
        contentValues.put("url", adAsset.f32940b);
        contentValues.put("disk_uri", adAsset.f32941c);
        contentValues.put("pending_attempts", Integer.valueOf(adAsset.f32942d));
        contentValues.put("ts", String.valueOf(adAsset.f32943e));
        contentValues.put("created_ts", String.valueOf(adAsset.f32944f));
        contentValues.put("ttl", String.valueOf(adAsset.f32945g));
        contentValues.put("soft_ttl", String.valueOf(adAsset.f32946h));
        return contentValues;
    }

    public final ArrayList a() {
        ArrayList arrayListA = V1.a(this, null, null, null, null, "created_ts DESC ", null, 47);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListA) {
            C2826j c2826j = (C2826j) obj;
            if (c2826j != null && c2826j.a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2826j c2826j2 = (C2826j) it.next();
            if (c2826j2 != null) {
                arrayList2.add(c2826j2);
            }
        }
        return arrayList2;
    }

    public final ArrayList b() {
        ArrayList arrayListA = V1.a(this, null, null, null, null, "ts ASC ", null, 47);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListA) {
            C2826j c2826j = (C2826j) obj;
            if (c2826j != null && !c2826j.a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2826j c2826j2 = (C2826j) it.next();
            if (c2826j2 != null) {
                arrayList2.add(c2826j2);
            }
        }
        return arrayList2;
    }

    public final C2826j a(String remoteUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(remoteUrl, "remoteUrl");
        ArrayList arrayListA = V1.a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (arrayListA.isEmpty()) {
            return null;
        }
        return (C2826j) arrayListA.get(0);
    }

    public final C2826j b(String remoteUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(remoteUrl, "remoteUrl");
        ArrayList arrayListA = V1.a(this, "url=? ", new String[]{remoteUrl}, null, null, "created_ts DESC ", 1, 12);
        if (arrayListA.isEmpty()) {
            return null;
        }
        return (C2826j) arrayListA.get(0);
    }

    public final void a(C2826j asset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        b(asset, "url = ?", new String[]{asset.f32940b.toString()});
    }
}
