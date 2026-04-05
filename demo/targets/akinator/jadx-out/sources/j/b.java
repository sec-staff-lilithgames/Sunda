package j;

import android.content.Context;
import android.content.Intent;
import j.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import qv.v;
import uu.k0;
import uu.o1;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends j.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f68740a = new a(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final Intent createIntent$activity_release(String[] input) {
            e0.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            e0.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Override // j.a
    public Intent createIntent(Context context, String[] input) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(input, "input");
        return f68740a.createIntent$activity_release(input);
    }

    @Override // j.a
    public a.C0708a getSynchronousResult(Context context, String[] input) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new a.C0708a(p1.emptyMap());
        }
        for (String str : input) {
            if (m3.a.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(input.length), 16));
        for (String str2 : input) {
            tu.v vVar = tu.e0.to(str2, Boolean.TRUE);
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return new a.C0708a(linkedHashMap);
    }

    @Override // j.a
    public Map<String, Boolean> parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            return p1.emptyMap();
        }
        if (intent == null) {
            return p1.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return p1.emptyMap();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        return p1.toMap(y0.zip(k0.filterNotNull(stringArrayExtra), arrayList));
    }
}
