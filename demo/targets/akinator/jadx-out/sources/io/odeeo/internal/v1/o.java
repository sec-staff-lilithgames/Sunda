package io.odeeo.internal.v1;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f67285a = new o();

    public final SharedPreferences getDefaultSharedPreferences(Context context) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(e0.stringPlus(context.getPackageName(), "_preferences"), 0);
    }

    public final void deleteAllWithPrefix(SharedPreferences preferences, SharedPreferences.Editor editor, String prefix) {
        e0.checkNotNullParameter(preferences, "preferences");
        e0.checkNotNullParameter(editor, SFPXhf.pGTHLkp);
        e0.checkNotNullParameter(prefix, "prefix");
        try {
            Map<String, ?> all = preferences.getAll();
            e0.checkNotNullExpressionValue(all, "preferences.all");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                e0.checkNotNullExpressionValue(key, "it.key");
                if (n0.contains$default((CharSequence) key, (CharSequence) prefix, false, 2, (Object) null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                editor.remove((String) ((Map.Entry) it.next()).getKey());
            }
        } catch (Exception unused) {
            io.odeeo.internal.b2.a.w(e0.stringPlus("deleteAllWithPrefix: failed to delete keys with prefix ", prefix), new Object[0]);
        }
    }
}
