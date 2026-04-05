package u3;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f87789a = new b0(2);

    /* renamed from: b, reason: collision with root package name */
    public static final ni.a f87790b = new ni.a(19);

    public static n a(Context context, List list, CancellationSignal cancellationSignal) {
        String systemFont;
        Typeface systemFontFamily;
        d6.a.beginSection("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                g gVar = (g) list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (systemFontFamily = o3.i.getSystemFontFamily((systemFont = gVar.getSystemFont()))) == null || o3.i.guessPrimaryFont(systemFontFamily) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), gVar, context.getResources());
                    if (providerInfoB == null) {
                        return new n(1, null);
                    }
                    arrayList.add(c(context, gVar, providerInfoB.authority, cancellationSignal));
                } else {
                    arrayList.add(new o[]{new o(systemFont, gVar.getVariationSettings())});
                }
            }
            return new n(arrayList);
        } finally {
            d6.a.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, g gVar, Resources resources) {
        ni.a aVar = f87790b;
        b0 b0Var = f87789a;
        d6.a.beginSection("FontProvider.getProvider");
        try {
            List<List<byte[]>> certificates = gVar.getCertificates() != null ? gVar.getCertificates() : n3.i.readCerts(resources, gVar.getCertificatesArrayResId());
            String providerAuthority = gVar.getProviderAuthority();
            String providerPackage = gVar.getProviderPackage();
            e eVar = new e();
            eVar.f87786a = providerAuthority;
            eVar.f87787b = providerPackage;
            eVar.f87788c = certificates;
            ProviderInfo providerInfo = (ProviderInfo) b0Var.get(eVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String providerAuthority2 = gVar.getProviderAuthority();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerAuthority2, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority2);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(gVar.getProviderPackage())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority2 + ", but package was not " + gVar.getProviderPackage());
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, aVar);
            for (int i10 = 0; i10 < certificates.size(); i10++) {
                ArrayList arrayList2 = new ArrayList(certificates.get(i10));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                    }
                    b0Var.put(eVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            d6.a.endSection();
            return null;
        } finally {
            d6.a.endSection();
        }
    }

    public static o[] c(Context context, g gVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList;
        Uri uriWithAppendedId;
        d6.a.beginSection("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath(C3191e4.h.f36473b).build();
            c cVarMake = c.make(context, uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                d6.a.beginSection("ContentQueryWrapper.query");
                try {
                    d dVar = (d) cVarMake;
                    cursorQuery = dVar.query(uriBuild, strArr, "query = ?", new String[]{gVar.getQuery()}, null, cancellationSignal);
                    d6.a.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList3 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i10 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            int i11 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                arrayList = arrayList3;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                            } else {
                                arrayList = arrayList3;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                            }
                            Uri uri = uriWithAppendedId;
                            ArrayList arrayList4 = arrayList;
                            arrayList4.add(new o(uri, i11, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i10));
                            arrayList3 = arrayList4;
                        }
                        arrayList2 = arrayList3;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    dVar.close();
                    return (o[]) arrayList2.toArray(new o[0]);
                } finally {
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                ((d) cVarMake).close();
                throw th2;
            }
        } finally {
        }
    }
}
