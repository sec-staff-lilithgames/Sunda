package k3;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70177a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f70178b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f70179c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f70180d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70181e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f70182f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f70183g;

    public g1(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, HashSet hashSet) {
        this.f70177a = str;
        this.f70178b = charSequence;
        this.f70179c = charSequenceArr;
        this.f70180d = z10;
        this.f70181e = i10;
        this.f70182f = bundle;
        this.f70183g = hashSet;
        if (getEditChoicesBeforeSending() == 2 && !getAllowFreeFormInput()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput[] a(g1[] g1VarArr) {
        if (g1VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[g1VarArr.length];
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            remoteInputArr[i10] = e1.fromCompat(g1VarArr[i10]);
        }
        return remoteInputArr;
    }

    public static void addDataResultToIntent(g1 g1Var, Intent intent, Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.a(g1Var, intent, map);
            return;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            intentB = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = intentB.getBundleExtra("android.remoteinput.dataTypeResultsData".concat(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(g1Var.getResultKey(), value.toString());
                intentB.putExtra("android.remoteinput.dataTypeResultsData".concat(key), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intentB));
    }

    public static void addResultsToIntent(g1[] g1VarArr, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            RemoteInput.addResultsToIntent(a(g1VarArr), intent, bundle);
            return;
        }
        Bundle resultsFromIntent = getResultsFromIntent(intent);
        int resultsSource = getResultsSource(intent);
        if (resultsFromIntent != null) {
            resultsFromIntent.putAll(bundle);
            bundle = resultsFromIntent;
        }
        for (g1 g1Var : g1VarArr) {
            Map<String, Uri> dataResultsFromIntent = getDataResultsFromIntent(intent, g1Var.getResultKey());
            RemoteInput.addResultsToIntent(a(new g1[]{g1Var}), intent, bundle);
            if (dataResultsFromIntent != null) {
                addDataResultToIntent(g1Var, intent, dataResultsFromIntent);
            }
        }
        setResultsSource(intent, resultsSource);
    }

    public static Intent b(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.appcompat.app.j0.H(intent, str);
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentB.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentB.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    public static int getResultsSource(Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e4.q.l(intent);
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            return 0;
        }
        return intentB.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void setResultsSource(Intent intent, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            e4.q.A(intent, i10);
            return;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            intentB = new Intent();
        }
        intentB.putExtra("android.remoteinput.resultsSource", i10);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intentB));
    }

    public boolean getAllowFreeFormInput() {
        return this.f70180d;
    }

    public Set<String> getAllowedDataTypes() {
        return this.f70183g;
    }

    public CharSequence[] getChoices() {
        return this.f70179c;
    }

    public int getEditChoicesBeforeSending() {
        return this.f70181e;
    }

    public Bundle getExtras() {
        return this.f70182f;
    }

    public CharSequence getLabel() {
        return this.f70178b;
    }

    public String getResultKey() {
        return this.f70177a;
    }

    public boolean isDataOnly() {
        if (getAllowFreeFormInput()) {
            return false;
        }
        return ((getChoices() != null && getChoices().length != 0) || getAllowedDataTypes() == null || getAllowedDataTypes().isEmpty()) ? false : true;
    }
}
